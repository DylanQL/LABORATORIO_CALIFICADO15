package com.quispe.angelo.poketinder.data.model

data class PokemonListResponse(
    val count: Int,
    val next: String,
    val results: List<PokemonResponse>
)
