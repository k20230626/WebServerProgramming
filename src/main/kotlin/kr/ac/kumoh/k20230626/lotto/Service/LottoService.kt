package kr.ac.kumoh.k20230626.lotto.Service

import kr.ac.kumoh.k20230626.lotto.repository.LottoRepository
import org.springframework.stereotype.Service

@Service
class LottoService(val service: LottoRepository) {
    fun fetchLottoNumbers() = service.fetchLottoNumbers()
}