package com.dsankovsky.composition.domain.repository

import com.dsankovsky.composition.domain.entity.GameSettings
import com.dsankovsky.composition.domain.entity.Level
import com.dsankovsky.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings


}