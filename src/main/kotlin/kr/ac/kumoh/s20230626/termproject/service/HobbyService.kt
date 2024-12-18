package kr.ac.kumoh.s20230626.termproject.service

import kr.ac.kumoh.s20230626.termproject.model.Hobby
import kr.ac.kumoh.s20230626.termproject.repository.HobbyRepository
import org.springframework.stereotype.Service

@Service
class HobbyService(val repository: HobbyRepository) {
    fun getAllHobbies(): List<Hobby> = repository.findAll()

    fun addHobby(hobby: Hobby) = repository.save(hobby)

    fun getHobbyByTitle(title: String): Hobby = repository.findHobbyByTitle(title).first()

    fun deleteHobbyByTitle(title: String): Boolean = repository.deleteHobbyByTitle(title)

    fun deleteHobby(id: String): Boolean {
        return if (repository.existsById(id)) {
            repository.deleteById(id)
            true
        } else {
            false
        }
    }

    fun restoreHobby(): MutableList<Hobby> {
        val hobby =  mutableListOf(
            Hobby(
                null,
                "프로그래밍",
                """
                    <span>고등학교 코로나 때 게임이 질려서 시작하게 된 계기로 움직이는 것을 싫어하는 나에게 프로그래밍은 창작의 재미를 나에게 줬다.</span>
                    <br/>
                    <span>왜인지 모르겠지만 고등학교 때 부터 C#을 주로 다루었으며, React는 고등학교 3학년 때 처음 다뤄보았다. 이때 React는 버전이 16이였고 hook 대신 class로 구현해야 되서 라이프 사이클을 알아야 했었다.</span>
                    <br/>
                    <span>c#으로 백엔드를 만들고, react로 프론트를 만들어서 자그만한 사이트를 운영했던 적이 있다.</span>
                    <br/>
                    <span>여기서도 DB로 MongoDB를 썼었는데 안좋은 추억이 있어서 MongoDB를 그렇게 선호하지 않는다.</span>
                """.trimIndent(),
                "https://assets.entrepreneur.com/content/3x2/2000/how-read-website-source-code.jpg",
                "https://github.com/N-Joy-Shadow"
            ),
            Hobby(
                null,
                "애니메이션",
                """
                    <span>다른 사람들이 드라마나 보듯 나는 애니메이션을 본다. </span>
                    <span>가장 재밌게 봤던 애니는 슈타인즈 게이트, 페이트 제로, 바이올렛 에버가든가 있다.</span>
                    <br/>
                    <span>요즘에는 애니메이션보단 만화를 선호하고 있다.</span>
                """.trimIndent(),
                "https://i.namu.wiki/i/7ebO-eqvlXty-WxFM_DlJZD0EOoPmduukOG6mWJkArYUm0VY5xj8aATMsxWX9CaQBOCgbJZ_Ne-teMoXQgiA-3fo61uWo4iGmSuA56RsJW7Kcnj1L7Opj2gfkXceQEBlcQwfzpBDbLs0d0mBcDWXOQ.webp",
                "https://laftel.net/item/39985"
            ),
            Hobby(
                null,
                "만화",
                """
                    <span>애니메이션보단 더 라이트하게 즐길 수 있어서 최근에는 더 자주 본다.</span>
                    <br/>
                    <span>연속적인 애니메이션과 다르게 도중에 그만 보기도 좋고 짧은 시간을 소모하기 때문에 만화를 보는 것이 애니메이션을 보는 것 보다 선호한다.</span>
                    <br/>
                    <span>가장 재밌게 봤던 만화는 장송의 프리렌과 철야의 노래가 있다.</span>
                    <br/>
                    <span>현재는 J⇔M과 숨은 실력자가 되고 싶어서!를 가장 재밌게 보고 있다.</span>
                """.trimIndent(),
                "https://i.namu.wiki/i/SnszjXShYXSYQpR-DHEra0vdhaWFLTjuvPfHVXcTEPgg1c8wBuhqDMzaREvMZbTS-Cih516stAZE1aLQlm21JyxlMG6rOp5_AuueOAbovxvg6MXaI4CmxI_nV4wAjw_0UFdk5nImvPlGthfypNXApg.webp",
                "https://namu.wiki/w/%EC%9E%A5%EC%86%A1%EC%9D%98%20%ED%94%84%EB%A6%AC%EB%A0%8C"
            ),
            Hobby(
                null,
                "메이플스토리",
                """
                    <span>중학교 때부터 열심히 했던 게임으로 이젠 하나의 숙제가 된 게임이다.</span>
                    <br/>
                    <span>메이플 스토리를 하면서 애니메이션을 보는 것이 가능해서 취미 활동을 2배로 할 수 있다는 장점이 있다.</span>
                    <br/>
                    <span>옛날에 Xamarin.Android를 활용하여 메이플 관련 앱을 플레이 스토어에 출시한적이 있다. 하지만 현재는 관리하고 있지 않아 플래이 스토어에서 내린 상태이다.</span>
                """.trimIndent(),
                "https://i.namu.wiki/i/NUzo8Y8CQrxIjuZF9SlDK1ciyYMegj3PRFRi4x6qd6ll4C-jY3BEk4sPPACnrYCwWvbIZDYM49XSqT6gkBaNmg.webp",
                "https://maplestory.nexon.com"
            )
        )

        repository.removeAllByIdNot("")
        repository.saveAll(hobby)

        return hobby
    }

    fun updateHobby(id: String, hobby: Hobby): Hobby? {
        val hobbyTarget = repository.findById(id)
        return if (hobbyTarget.isPresent) {
            val oldSong = hobbyTarget.get()
            val updatedSong = oldSong.copy(
                title = hobby.title,
                image = hobby.image,
                externalUrl = hobby.externalUrl,
                description = hobby.description
            )
            repository.save(updatedSong)
        } else {
            null
        }
    }

}