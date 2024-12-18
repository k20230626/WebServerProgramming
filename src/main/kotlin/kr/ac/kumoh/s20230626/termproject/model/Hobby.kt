package kr.ac.kumoh.s20230626.termproject.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "hobby")
data class Hobby(
    @Id val id: String? = null,
    val title: String,
    val description: String,
    val image: String,
    val externalUrl: String,
)