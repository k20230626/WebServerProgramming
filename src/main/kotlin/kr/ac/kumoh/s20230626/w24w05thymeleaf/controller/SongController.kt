package kr.ac.kumoh.s20230626.w24w05thymeleaf.controller

import kr.ac.kumoh.s20230626.w24w05thymeleaf.service.SongService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController(val songService: SongService) {

    @GetMapping("/song/random")
    fun getRandomSong(model: Model): String {
        val song = songService.randomSong()
        model.addAttribute("songTitle",song.title)
        model.addAttribute("songArtist",song.artist)
        model.addAttribute("songAlbum",song.album)
        return "random"
    }
}
