package com.example.application.submission.entrypoint.rest.dto.request

import com.example.domain.submission.entity.dto.StoreSubmissionDto
import java.util.*

data class StoreSubmissionRequestDto(
    val userId: UUID,
    val challengeId: UUID,
    val patternId: UUID,
    val code: String,
    val language: String,
) {
    fun toDomain() = StoreSubmissionDto(
        userId = userId,
        challengeId = challengeId,
        patternId = patternId,
        code = code,
        language = language,
    )
}
