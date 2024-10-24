package kr.ac.kumoh.k20230626.lotto.repository

import kr.ac.kumoh.k20230626.lotto.model.LottoNumber
import org.springframework.stereotype.Repository

@Repository
class InMemoryLottoRepository: LottoRepository {

    private var storedLottoNumber: LottoNumber? = null
    override fun save(lottoNumber: LottoNumber): LottoNumber {
        storedLottoNumber = lottoNumber
        return storedLottoNumber!!
    }


    override fun find(): LottoNumber? {
        TODO("Not yet implemented")
    }
}