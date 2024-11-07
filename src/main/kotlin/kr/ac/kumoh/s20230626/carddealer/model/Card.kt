package kr.ac.kumoh.s20230626.carddealer.model

data class Card(val rank: String, val suit: String) {
    val imageName: String
        get() {
            val name = "${rank}_of_${suit}"
            return if (rank in setOf("jack", "queen", "king")) {
                "${name}2.png"
            } else {
                "${name}.png"
            }
        }
}

