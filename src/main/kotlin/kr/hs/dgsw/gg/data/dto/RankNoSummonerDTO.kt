package kr.hs.dgsw.gg.data.dto

class RankNoSummonerDTO(
    var id: Int,
    var tier: String,
    var rank: Int,
    var queueType: String,
    var leaguePoints: Int,
    var wins: Int,
    var losses: Int,
    var miniSeries: MiniSeriesDTO?
)