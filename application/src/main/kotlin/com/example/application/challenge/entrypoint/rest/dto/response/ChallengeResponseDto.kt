package com.example.application.challenge.entrypoint.rest.dto.response

import com.example.domain.challenge.entity.Challenge
import java.util.*

data class ChallengeResponseDto(
    val id: UUID,
    val description: String,
    val title: String,
) {
    companion object {
        fun fromDomain(challenge: Challenge): ChallengeResponseDto {
            return ChallengeResponseDto(
                id = challenge.id,
                description = challenge.description,
                title = challenge.title
            )
        }
    }
}
