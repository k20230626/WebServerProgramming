package kr.ac.kumoh.s20230626.carddealer.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping


@Controller
class CardController {
    @GetMapping("/cards/random")
    fun getRandomCards(model: Model): String {
        model.addAttribute("suit","spades")
        model.addAttribute("rank","king")

        return "cards";
    }
}