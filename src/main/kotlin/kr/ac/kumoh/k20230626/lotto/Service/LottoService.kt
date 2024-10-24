package kr.ac.kumoh.k20230626.lotto.Service

import kr.ac.kumoh.k20230626.lotto.model.LottoNumber
import kr.ac.kumoh.k20230626.lotto.repository.LottoRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class LottoService(val repository: LottoRepository) {
    fun fetchLuckyNumber(): LottoNumber {
        val numbers = mutableSetOf(0)
        val random = Random
        while(numbers.size < 6) {
            numbers.add(Random.nextInt(1,46))

        }
        val lottoNumber = LottoNumber(numbers.toSortedSet().toIntArray())
        return repository.save(lottoNumber)
    }
}