package com.example.inventory.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.NumberFormat

/**
 * Entity data class represents a single row in the database.
 */
@Entity(tableName = "item")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "name")
    val itemName: String,
    @ColumnInfo(name = "price")
    val itemPrice: Double,
    @ColumnInfo(name = "quantity")
    val quantityInStock: Int
)

/**
 * Returns the passed in price in currency format.
 */
fun Item.getFormattedPrice(): String =
    NumberFormat.getCurrencyInstance().format(itemPrice)
