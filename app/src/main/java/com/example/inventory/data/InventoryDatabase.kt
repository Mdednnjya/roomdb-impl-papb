package com.example.inventory.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Name: Made Narayan Dananjaya
 * Nim: 225150207111034
 *
 * Comment:
 * 1. Membuat abstract class 'InventoryDatabase' untuk membuat room database
 *    baru.
 * 2. Menambahkan anotasi '@Database' dan menambahkan beberapa params seperti
 *    'Item' sebagai entity pada db tersebut, init versi, dan setting export
 *    schema.
 * 3. Inisasi abstract func 'itemDao()' agar room tahu terkait DAO yang sudah
 *    dibuat.
 * 4. Membuat companion obejct didalam abstract class untuk menginisiasi instace
 *    dari database.
 * */

@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class InventoryDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao

    companion object {
        @Volatile
        private var Instance: InventoryDatabase? = null

        fun getDatabase(context: Context): InventoryDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, InventoryDatabase::class.java, "item_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}