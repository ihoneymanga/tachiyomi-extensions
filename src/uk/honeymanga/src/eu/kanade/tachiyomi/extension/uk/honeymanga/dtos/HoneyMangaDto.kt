package eu.kanade.tachiyomi.extension.uk.honeymanga.dtos

import kotlinx.serialization.Serializable

@Serializable
data class HoneyMangaDto(
    val id: String,
    val posterId: String,
    val title: String,
    val description: String?,
    val type: String,
    val chapters: Int?,
)
