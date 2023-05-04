package com.example.kotlinappresources.Database.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.kotlinappresources.Database.Model.TransactionItem

@Dao
interface TransactionItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(transactionItem: TransactionItem)

    @Delete
    suspend fun delete(transactionItem: TransactionItem)

    @Update
    suspend fun update(transactionItem: TransactionItem)

    @Query("SELECT * FROM transactions_table ORDER BY id ASC")
    fun readAllTransactionData(): LiveData<List<TransactionItem>>

    @Query("SELECT * FROM transactions_table where id is :id")
    fun getTransactionByID(id:Int): LiveData<TransactionItem>

    @Query("DELETE FROM transactions_table")
    suspend fun deleteAllTransactions()
}