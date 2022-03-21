package kr.hs.dgsw.gg.controller

import kr.hs.dgsw.gg.data.dto.SummonerDTO
import kr.hs.dgsw.gg.service.SummonerService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SummonerController(
    private val summonerService: SummonerService
) {
    @GetMapping("/summoner/{summonerName}")
    fun getSummonerByName(@PathVariable summonerName: String): ResponseEntity<SummonerDTO> {
        val summoner = summonerService.getSummonerByName(summonerName)
        return ResponseEntity(summoner, HttpStatus.OK)
    }
}