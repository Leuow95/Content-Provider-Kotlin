package com.example.contentprovider

import android.database.Cursor

interface NoteclickedListener {
    fun noteClickedItem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)
}