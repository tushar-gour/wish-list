package com.dinostatic.mywishlist.data

import kotlinx.coroutines.flow.Flow

class WishRepository (private val wishDao: WishDao) {
    suspend fun addWish(wish: Wish) = wishDao.addWish(wish)
    fun getWishes(): Flow<List<Wish>> = wishDao.getAllWishes()
    fun  getWishById(id: Long): Flow<Wish> = wishDao.getWishById(id)
    suspend fun updateWish(wish: Wish) = wishDao.updateWish(wish)
    suspend fun deleteWish(wish: Wish) = wishDao.deleteWish(wish)
}