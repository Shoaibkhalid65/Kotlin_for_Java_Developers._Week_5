package games.gameOfFifteen

import board.Cell
import board.Direction
import board.GameBoard
import board.createGameBoard
import games.game.Game

/*
 * Implement the Game of Fifteen (https://en.wikipedia.org/wiki/15_puzzle).
 * When you finish, you can play the game by executing 'PlayGameOfFifteen'.
 */
fun newGameOfFifteen(initializer: GameOfFifteenInitializer = RandomGameInitializer()): Game{
    val board= createGameBoard<Int>(4)
    return object:Game{
        override fun initialize() {
            val values=initializer.initialPermutation
            for(i in values.indices){
                board[board.getCell(i/board.width+1,i%board.width+1)]=values[i]
            }
        }

        override fun canMove(): Boolean =true

        override fun hasWon(): Boolean {
            val values=board.getAllCells().map { get(it.i,it.j) }
            var value=1
            for(i in 0 until 15){
                if(values[i]!=value){
                    return false
                }
                value++
            }
            return true
        }

        override fun processMove(direction: Direction) {
            with(board) {
                find { it == null }?.also { cell ->
                    cell.getNeighbour(direction.reversed())?.also { neighbour ->
                        this[cell] = this[neighbour]
                        this[neighbour] = null
                    }
                }
            }
        }

        override fun get(i: Int, j: Int): Int? {
            return board[Cell(i,j)]
        }

    }
}


