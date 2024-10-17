package kr.ac.kumoh.k20230626.lotto.controller

import kr.ac.kumoh.k20230626.lotto.Service.LottoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LottoController(val lottoService: LottoService) {
    @GetMapping("/lotto/numbers")
    fun fetchLottoNumbers(model: Model): String {
        model.addAttribute("lottoNumbers", lottoService.fetchLottoNumbers())
        return "lotto"
    }
}