package kr.ac.kumoh.k20230626.javawebspring.controller;

import kr.ac.kumoh.k20230626.javawebspring.service.LottoSeervice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LottoController {
    private final LottoSeervice lottoSeervice;

    public LottoController(LottoSeervice lottoSeervice) {
        this.lottoSeervice = lottoSeervice;
    }

    @GetMapping("/lotto/numbers")
    public String getLottoNumbers(Model model) {
        model.addAttribute("lotto", lottoSeervice.getLuckNumber().getNumbers());
        return "lotto";
    }
}
