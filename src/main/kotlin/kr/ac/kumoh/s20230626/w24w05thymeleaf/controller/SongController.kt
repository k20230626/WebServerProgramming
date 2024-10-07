package kr.ac.kumoh.s20230626.w24w05thymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {

    @GetMapping("/song/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute("songTitle","UNDEAD")
        return "random"
    }
}
