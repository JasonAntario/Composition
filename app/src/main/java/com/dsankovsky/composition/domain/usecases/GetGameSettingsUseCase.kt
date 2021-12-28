package com.dsankovsky.composition.domain.usecases

import com.dsankovsky.composition.domain.entity.GameSettings
import com.dsankovsky.composition.domain.entity.Level
import com.dsankovsky.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}