package eu.kanade.tachiyomi.extension.uk.honeymanga.dtos

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
data class HoneyMangaChapterPagesDto(
    val id: String,
    // a map of index --> imageUUID, starting from 0
    val resourceIds: JsonObject,
)
