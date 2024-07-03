package com.example.memorygame2023

import com.google.android.material.color.utilities.Score
import java.io.Serializable

class WinGame:Serializable {
    var score:String?="0"
    constructor(score: String) {
        this.score=score
    }
    constructor()
}