package eu.kanade.tachiyomi.extension.uk.honeymanga.dtos

import kotlinx.serialization.Serializable

@Serializable
data class HoneyMangaChapterDto(
    val id: String,
    val volume: Int,
    val chapterNum: Int,
    val subChapterNum: Int,
    val mangaId: String,
    val lastUpdated: String,
)
