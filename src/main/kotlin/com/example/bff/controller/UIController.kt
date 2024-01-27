package com.example.bff.controller

import com.example.bff.model.Body
import com.example.bff.model.Navigation
import com.example.bff.model.UIElement
import com.example.bff.model.UIResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/ui")
class UIController {

//    @GetMapping("/elements")
//    fun getUIElements(): ResponseEntity<UIResponse> {
//        val uiResponse = // UI 요소들을 생성하는 코드
//            return ResponseEntity.ok(uiResponse)
//    }

    @GetMapping("/elements")
    fun getUIElements(): ResponseEntity<UIResponse> {
        val uiResponse = UIResponse(
            navigation = Navigation("Home"),
            body = Body(
                type = "LIST",
                children = listOf(
                    UIElement(type = "TEXT", title = "오늘의 포켓몬은 뭘까요?", font = "h1"),
                    UIElement(type = "IMAGE", image_url = "https://plus.unsplash.com/premium_photo-1669324357471-e33e71e3f3d8?q=80&w=1920&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                    UIElement(type = "TEXT", title = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\\\\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\\\\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."),
                    UIElement(type = "IMAGE", image_url = "https://plus.unsplash.com/premium_photo-1669324357471-e33e71e3f3d8?q=80&w=1920&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
                    UIElement(type = "BUTTON_CTA", title = "Click Me")
                )
            ),
            bottom = listOf(
                UIElement(type = "TEXT", title = "Hello World!"),
                UIElement(type = "BUTTON_CTA", title = "BOTTOM CTA!!!!!!!!!!!!!!!!!!")
            )
        )

        return ResponseEntity.ok(uiResponse)
    }
}
