package com.example.tubes_salon_b_3.room

import androidx.room.*
import com.example.tubes_salon_b_3.entity.Customer

@Dao
interface CustomerDao {
    @Insert
    suspend fun addCustomer(customer: Customer)

    @Update
    suspend fun updateCustomer(customer: Customer)

    @Delete
    suspend fun deleteCustomer(customer: Customer)

    @Query("SELECT * FROM customer")
    suspend fun getCustomers(): List<Customer>

    @Query("SELECT * FROM customer WHERE id=:id_customer")
    suspend fun getCustomer(id_customer: Int): List<Customer>


}