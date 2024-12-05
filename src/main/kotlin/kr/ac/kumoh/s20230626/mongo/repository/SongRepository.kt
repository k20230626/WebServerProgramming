package kr.ac.kumoh.s20230626.mongo.repository

import kr.ac.kumoh.s20230626.mongo.model.Song
import org.springframework.stereotype.Repository

import org.springframework.data.mongodb.repository.MongoRepository

interface SongRepository : MongoRepository<Song,String> {

    fun findBySinger(singer: String): List<Song>
}