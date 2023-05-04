package com.example.kotlinappresources.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.kotlinappresources.Database.Dao.TransactionItemDao
import com.example.kotlinappresources.Database.Model.TransactionItem
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.security.auth.callback.Callback


@Database(entities = [TransactionItem:: class], version = 1, exportSchema = false)
abstract class MainDatabase {
    abstract fun transactionItemDao: TransactionItemDao

    companion object{
        @Volatile
        public var INSTANCE: MainDatabase?= null

        fun getDatabase(context: Context): MainDatabase? {
            val tempInstance = INSTANCE
            if(tempInstance == null){
                synchronized(this){
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        MainDatabase::class.java,
                    "TransactionsDatabase").fallbackToDestructiveMigration().addCallback(object: Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            GlobalScope.launch {
                                INSTANCE?.let { prepopulate(it)}
                            }
                        }
                    }).build()
                    INSTANCE = instance
                    return instance
                    )
                }
            } else {
                return tempInstance
            }
        }

        suspend fun prepopulate(db: MainDatabase){
            var transactionItemDao: TransactionItemDao = db.transactionItemDao()

            transactionItemDao.insert()
        }
    }
}