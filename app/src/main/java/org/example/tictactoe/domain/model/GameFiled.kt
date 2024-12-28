package org.example.tictactoe.domain.model

data class GameFiled(
    val fieldSize: Int = 3,
    var field: List<Symbol> = List(fieldSize) { Symbol.None },
    var currentSymbol: Symbol = Symbol.Tick
) {
    fun checkField(): GameState {

        fun checkVertical(): GameState {
            var currentSum = 0

            val maxRowIndex = fieldSize*(fieldSize-1)
            for (column in 0..fieldSize) {
                for (row in 0..maxRowIndex) {

                }
            }
            return GameState.InProgress
        }

        fun checkHorizontal(): GameState {
            TODO()
        }

        fun checkDiagonal(): GameState {
            TODO()
        }

        TODO()
    }
}
