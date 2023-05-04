package com.example.kotlinappresources.Database.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.kotlinappresources.Database.MainDatabase
import com.example.kotlinappresources.Database.MainRepository
import com.example.kotlinappresources.Database.Model.TransactionItem

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val readAllTransactionData: LiveData<List<TransactionItem>>
    private val repository: MainRepository

    init {
        val transactionItemDao = MainDatabase.getDatabase(application)!!.transactionItemDao()
        repository = MainRepository(transactionItemDao)
        readAllTransactionData = repository.readAllTransactionData
    }
}