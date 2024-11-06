package kr.ac.kumoh.s20230626.hw01.controller

import kr.ac.kumoh.s20230626.hw01.serivce.WishlistService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WishlistController(private val service: WishlistService) {

    @GetMapping("/wishlist")
    fun getWishlist(data: Model): String {
        val itemList = service.getAllItems()
        data.addAttribute("items",itemList)
        return "wishlist"
    }
}