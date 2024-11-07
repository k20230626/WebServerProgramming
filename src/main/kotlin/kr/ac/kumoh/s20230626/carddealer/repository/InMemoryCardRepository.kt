package kr.ac.kumoh.s20230626.carddealer.repository

import kr.ac.kumoh.s20230626.carddealer.model.Card
import org.springframework.stereotype.Repository

@Repository
class InMemoryCardRepository : CardRepository{
    private val cards: MutableList<Card> = mutableListOf()

    override val size: Int
        get() = cards.size

    override fun add(card: Card) {
        cards.add(card)
    }

    override fun getAllCards(): List<Card> {
        return cards
    }

    override fun clear() {
        cards.clear()
    }

}