package com.dinostatic.mywishlist.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun addWish(wishEntity: Wish)

    @Update
    abstract suspend fun updateWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteWish(wishEntity: Wish)

    // load all wish from wish table
    @Query("Select * from `wish-table`")
    abstract fun getAllWishes(): Flow<List<Wish>>

    // filter wish by ID
    @Query("Select * from `wish-table` where id=:id")
    abstract fun getWishById(id: Long): Flow<Wish>
}