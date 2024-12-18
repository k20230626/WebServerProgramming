package kr.ac.kumoh.s20230626.termproject.controller

import kr.ac.kumoh.s20230626.termproject.model.Hobby
import kr.ac.kumoh.s20230626.termproject.service.HobbyService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hobby")
@CrossOrigin(origins = ["http://localhost:5173","https://webserver.njoys.me"])
class HobbyController(val service: HobbyService){
    @GetMapping("/")
    fun getHobby() = service.getAllHobbies()

    @GetMapping("/{title}")
    fun getHobbyByTitle(@PathVariable title: String) = service.getHobbyByTitle(title)

    @PostMapping("/")
    fun addHobby(@RequestBody hobby: Hobby) = service.addHobby(hobby)

    @PutMapping("/{id}")
    fun updateHobby(@PathVariable id: String, @RequestBody hobby: Hobby) = service.updateHobby(id, hobby)

    @PostMapping("/restore")
    fun restoreHobby() = service.restoreHobby()

    @DeleteMapping("/id/{id}")
    fun deleteSong(@PathVariable id: String): Map<String, String> {
        return if (service.deleteHobby(id))
            mapOf("status" to "deleted")
        else
            mapOf("status" to "not found")
    }

    @DeleteMapping("/{title}")
    fun deleteSongByTitle(@PathVariable title: String): Map<String, String> {
        return if (service.deleteHobbyByTitle(title))
            mapOf("status" to "deleted")
        else
            mapOf("status" to "not found")
    }
}