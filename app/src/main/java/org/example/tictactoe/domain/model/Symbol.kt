package org.example.tictactoe.domain.model

enum class Symbol(var value: Int) {
    Tick(1),
    Tac(-1),
    None(0);

    operator fun plus(other: Symbol): Int {
        return this.value + other.value
    }

    operator fun plusAssign(symbol: Symbol) {
        this.value += symbol.value
    }
}