package com.example.tubes_salon_b_3.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Customer(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nama: String,
    val password: String,
    val tanggalLahir: String,
    val noTelp: String,
    val email: String
)