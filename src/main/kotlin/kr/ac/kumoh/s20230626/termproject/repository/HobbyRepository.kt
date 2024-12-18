package kr.ac.kumoh.s20230626.termproject.repository

import kr.ac.kumoh.s20230626.termproject.model.Hobby
import org.springframework.data.mongodb.repository.MongoRepository

interface HobbyRepository: MongoRepository<Hobby,String> {
    fun findHobbyByTitle(title: String): List<Hobby>
    fun deleteHobbyByTitle(title: String): Boolean
    fun removeAllByIdNot(id: String)
}