package kr.ac.kumoh.s20230626.carddealer.repository

import kr.ac.kumoh.s20230626.carddealer.model.Card

interface CardRepository {
    val size: Int
    fun add(card: Card)
    fun getAllCards(): List<Card>
    fun clear()
}
