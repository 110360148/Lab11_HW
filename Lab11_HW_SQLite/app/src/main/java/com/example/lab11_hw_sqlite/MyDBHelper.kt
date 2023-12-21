package com.example.lab11_hw_sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBHelper internal constructor(context: Context?) :
    SQLiteOpenHelper(context, name, null, version) {
    override fun onCreate(sqLiteDatabase: SQLiteDatabase) {
        sqLiteDatabase.execSQL(
            "CREATE TABLE mytable(book text PRIMARY KEY, " +
                    "price integer NOT NULL)"
        )
    }

    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase, i: Int, i1: Int) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS myTable")
        onCreate(sqLiteDatabase)
    }

    companion object {
        private const val name = "mdatabase.db"
        private const val version = 1
    }
}
