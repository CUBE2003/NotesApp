package com.example.notes.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()

}