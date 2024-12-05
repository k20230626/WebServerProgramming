package kr.ac.kumoh.s20230626.mongo.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "song")
data class Song(
    @Id val id: String? = null,
    val title: String,
    val singer: String,
    val rating: Int,
    val lyrics: String
)