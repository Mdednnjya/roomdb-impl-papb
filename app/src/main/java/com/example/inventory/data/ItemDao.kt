package com.example.inventory.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

/**
 * Name: Made Narayan Dananjaya
 * Nim: 225150207111034
 *
 * Comment:
 * 1. Membuat Data Access Object (DAO) dengan membuat file interface baru
 *    didalam package data.
 * 2. membuat fun insert() dengan param 'Item' dari data class.
 * 3. Menambahkan anotasi @Insert agar sistem tahu bahwa func tersebut akan
 *    melakukan operasi add data.
 * 4. Menambahkan suspend agar bisa menjalankan func tidak dalam main thread
 * 5. Menambahkan param 'OnConfclitStrategy.IGNORE' untuk memberitahu room
 *    untuk menghiraukan jika ada conflict pada database.
 * 6. Menambahkan func baru 'getItem' yang mengambil data pada tabel 'Items'
 *    Sesuai id menggunakan anotasi '@Query'.
 * 7.
 */
@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)

    @Query("SELECT * from Items WHERE id = :id")
    fun getItem(id: Int): Flow<Item>

    @Query("SELECT * from items ORDER BY name ASC")
    fun getAllItems(): Flow<List<Item>>
}