package eu.kanade.tachiyomi.extension.uk.honeymanga.dtos

import kotlinx.serialization.Serializable

@Serializable
data class HoneyMangaResponseDto(
    val data: List<HoneyMangaDto>,
)
