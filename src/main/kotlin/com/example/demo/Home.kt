package com.example.demo

import org.springframework.web.bind.annotation.*

class Home {
    @RestController
    class Home {

        @GetMapping("/")
        fun home(@RequestParam id: String): String {
            return "Your id is $id"
        }

        @PostMapping("/")
        fun postHome(@RequestParam id: String): String {
            print(id)
            return "Thanks for posting"
        }

    }
}