package kr.ac.kumoh.k20230626.lotto.repository

import org.springframework.stereotype.Repository

@Repository
class LottoRepository {
    fun fetchLottoNumbers() = (1..45).shuffled().take(6)
}