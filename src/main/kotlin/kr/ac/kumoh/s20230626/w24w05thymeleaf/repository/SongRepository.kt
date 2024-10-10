package kr.ac.kumoh.s20230626.w24w05thymeleaf.repository

import kr.ac.kumoh.s20230626.w24w05thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    val songs = listOf(
        Song("UNDEAD", "BAND-MAID", "CONQUEROR", 2019),
        Song("Bloody Mary", "BAND-MAID", "CONQUEROR", 2019),
        Song("The Dragon Cries", "BAND-MAID", "CONQUEROR", 2019),
        Song("Flying High", "BAND-MAID", "CONQUEROR", 2019),
        Song("Hoshi ga Matataku Yoru ni", "BAND-MAID", "CONQUEROR", 2019),
        Song("At the drop of a hat", "BAND-MAID", "CONQUEROR", 2019),
        Song("NO GOD", "BAND-MAID", "CONQUEROR", 2019),
        Song("Dilemma", "BAND-MAID", "CONQUEROR", 2019),
        Song("Bubble", "BAND-MAID", "CONQUEROR", 2019),
        Song("The Dragon Cries", "BAND-MAID", "CONQUEROR", 2019)
    )
    fun fetchSong(title: String) = songs.first  {
        it.title == title
    }

    fun fetchAllSongs() = songs
}