package com.example.demo.Home

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

class Home {
    @RestController
    class Home {

        private var temp : HashMap<String, Int>
                = HashMap<String, Int> ()

        @GetMapping("/")
        fun home(@RequestParam id: String): ResponseEntity<HashMap<String, Int>>  {
            return ResponseEntity.status(HttpStatus.OK).body(temp);
        }

        @PostMapping("/")
        fun postHome(@RequestParam id: String): String {
            val new = id.hashCode()
            temp.put(id, new)

            return "Thanks for posting"
        }

        @DeleteMapping("/")
        fun deleteId(@RequestParam id: String):HashMap<String, Int> {
            temp.remove(id)
            return temp
        }

    }
}