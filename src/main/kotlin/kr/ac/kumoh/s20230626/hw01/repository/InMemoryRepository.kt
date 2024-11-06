package kr.ac.kumoh.s20230626.hw01.repository

import kr.ac.kumoh.s20230626.hw01.model.Item
import org.springframework.stereotype.Repository

@Repository
class InMemoryRepository : WishlistRepository {
    private val items = mutableListOf<Item>()
    private var cuurentId = 0L;

    init {
        items.add(Item(++cuurentId, "카카오 프렌즈 리틀 아파치 프라모델", 6_000))
        items.add(Item(++cuurentId, "카카오 프렌즈 라이온 프라모델", 6_000))
        items.add(Item(++cuurentId, "건프라군 DX 세트", 9_000))
        items.add(Item(++cuurentId, "퍼스트 건담 EG", 8_400))
        items.add(Item(++cuurentId, "퍼스트 건담 RG 2.0", 38_500))
    }

    override fun findAll(): List<Item> = items

}