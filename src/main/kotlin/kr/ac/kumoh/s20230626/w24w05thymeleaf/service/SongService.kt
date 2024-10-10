package kr.ac.kumoh.s20230626.w24w05thymeleaf.service

import kr.ac.kumoh.s20230626.w24w05thymeleaf.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(val repository: SongRepository) {
    fun searchSong(title: String) = repository.fetchSong(title)

    fun randomSong() = repository.fetchAllSongs().random()
}