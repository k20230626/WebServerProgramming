package kr.ac.kumoh.k20230626.lotto.Service

import kr.ac.kumoh.k20230626.lotto.repository.LottoRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class LottoService(val service: LottoRepository) {
    fun fetchLuckyNumber(): Array<Int> {
        val numbers = arrayOf(0, 0, 0, 0, 0, 0)

        for(i in numbers.indices){
            numbers[i] = Random.nextInt(45) + 1
        }
        return numbers
    }
}