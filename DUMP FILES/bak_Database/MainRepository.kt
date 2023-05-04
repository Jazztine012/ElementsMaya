package com.example.kotlinappresources.Database

import androidx.lifecycle.LiveData
import com.example.kotlinappresources.Database.Dao.TransactionItemDao
import com.example.kotlinappresources.Database.Model.TransactionItem

class MainRepository(private val transactionItemDao: TransactionItemDao){
    private val readAllTransactionData: LiveData<List<TransactionItem>> = transactionItemDao.readAllTransactionData()

    //TRANSACTION LIST

    suspend fun insert(transactionItem: TransactionItem){
        println("INSERT IN PROCESS")
        transactionItemDao.insert(transactionItem)
    }

    suspend fun delete(transactionItem: TransactionItem){
        println("DELETION IN PROCESS")
        transactionItemDao.delete(transactionItem)
    }

    suspend fun update(transactionItem: TransactionItem){
        println("UPDATE IN PROCESS")
        transactionItemDao.update(transactionItem)
    }

    suspend fun deleteAllEntries(transactionItem: TransactionItem){
        transactionItemDao.deleteAllTransactions()
        println("DELETED ALL ENTRIES")
    }
}