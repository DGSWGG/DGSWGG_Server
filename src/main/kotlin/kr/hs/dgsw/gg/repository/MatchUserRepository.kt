package kr.hs.dgsw.gg.repository

import kr.hs.dgsw.gg.data.vo.MatchUserVO
import kr.hs.dgsw.gg.data.vo.SummonerVO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.domain.Pageable

interface MatchUserRepository: JpaRepository<MatchUserVO, String> {
    fun findAllBySummonerId(summonerId: String, pageable: Pageable): List<MatchUserVO>
    fun deleteAllBySummonerId(summonerId: String)
}