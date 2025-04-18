package com.example.application.challenge.entrypoint.rest

import com.example.application.challenge.entrypoint.rest.dto.response.ChallengeResponseDto
import com.example.domain.challenge.usecase.GenerateChallengeUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/challenges")
class ChallengeController(
    private val generateChallengeUseCase: GenerateChallengeUseCase
) {

    @PostMapping
    fun generateChallenge(): ResponseEntity<ChallengeResponseDto> {
        val challenge = generateChallengeUseCase.execute().getOrThrow()

        return ResponseEntity(
            ChallengeResponseDto.fromDomain(challenge),
            HttpStatus.CREATED
        )
    }
}