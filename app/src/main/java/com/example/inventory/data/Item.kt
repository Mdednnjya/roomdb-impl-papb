/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.data

import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Name: Made Narayan Dananjaya
 * Nim: 225150207111034
 *
 * Comment:
 * 1. Saya menambahkan syntax 'data' sebelum class agar jetpack compose
 *    tahu jika saya menginisasi data class.
 * 2. Menambakan anotasi '@Entity' pada line diatas data class untuk
 *    mendefinisikan table dan nama tabel pada room.
 * 3. Menamambahkan anotasi '@PrimaryKey' untuk menginisiasi bahwa
 *    val id adalah primary key dan menambahkan params agar auto increment.
 * 4.
 */

@Entity(tableName = "Items")
data class Item(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)
