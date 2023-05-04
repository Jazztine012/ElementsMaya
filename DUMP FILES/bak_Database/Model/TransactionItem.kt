package com.example.kotlinappresources.Database.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transactions_table")
data class TransactionItem {
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var description: String,
    var location: String,
    val date: String,
    val amount: Double,
}