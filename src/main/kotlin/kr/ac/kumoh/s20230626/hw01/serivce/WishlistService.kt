package kr.ac.kumoh.s20230626.hw01.serivce

import kr.ac.kumoh.s20230626.hw01.repository.WishlistRepository
import org.springframework.stereotype.Service

@Service
class WishlistService(private val repository: WishlistRepository) {
    fun getAllItems() = repository.findAll()
}