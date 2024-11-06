package kr.ac.kumoh.s20230626.hw01.repository

import kr.ac.kumoh.s20230626.hw01.model.Item

interface WishlistRepository {
    fun findAll(): List<Item>
}