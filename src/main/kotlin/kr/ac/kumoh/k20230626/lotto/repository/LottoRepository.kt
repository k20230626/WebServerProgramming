package kr.ac.kumoh.k20230626.lotto.repository

import kr.ac.kumoh.k20230626.lotto.model.LottoNumber
import org.springframework.stereotype.Repository

interface LottoRepository {
    fun save(lottoNumber: LottoNumber) : LottoNumber
    fun find(): LottoNumber?
}