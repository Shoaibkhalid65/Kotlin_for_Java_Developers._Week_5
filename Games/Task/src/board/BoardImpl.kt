package board

import board.Direction.*
open class SquareBoardImpl(override val width: Int) :SquareBoard{
    private val boardWidth=width
    val cells= mutableListOf<Cell>()
    init {
        for(i in 1..boardWidth){
            for(j in 1..boardWidth){
                cells.add(Cell(i,j))
            }
        }
    }
    override fun getCellOrNull(i: Int, j: Int): Cell? {
        return cells.find { it==Cell(i,j) }
    }

    override fun getCell(i: Int, j: Int): Cell {
        return cells.first { it==Cell(i,j) }
    }

    override fun getAllCells(): Collection<Cell> {
        return cells
    }

    override fun getRow(i: Int, jRange: IntProgression): List<Cell> {
        return cells.filter { it.i==i&&it.j in jRange }.sortedBy { if (jRange.step < 0) -it.j else it.j}
    }

    override fun getColumn(iRange: IntProgression, j: Int): List<Cell> {
        return cells.filter { it.j==j&&it.i in iRange }.sortedBy { if(iRange.step<0 ) -it.i else it.i }
    }

    override fun Cell.getNeighbour(direction: Direction): Cell? {
        return when(direction){
            LEFT  -> getCellOrNull(i,j-1)
            RIGHT -> getCellOrNull(i,j+1)
            UP    -> getCellOrNull(i-1,j)
            DOWN  -> getCellOrNull(i+1,j)
        }
    }

}
class GameBoardImpl<T>(width: Int): SquareBoardImpl(width),GameBoard<T>{
    private val map= mutableMapOf<Cell,T?>()
    init {
//        for (i in 1..width){
//            map[cells[i]] = null
//        }
        cells.forEach{map[it]=null}
    }
    override fun get(cell: Cell): T? {
        return map[cell]
    }

    override fun all(predicate: (T?) -> Boolean): Boolean {
        return cells.all { predicate(get(it)) }
    }

    override fun any(predicate: (T?) -> Boolean): Boolean {
        return cells.any{predicate(get(it))}
    }

    override fun find(predicate: (T?) -> Boolean): Cell? {
        return cells.find{predicate(get(it))}
    }

    override fun filter(predicate: (T?) -> Boolean): Collection<Cell> {
        return cells.filter { predicate(get(it)) }
    }

    override fun set(cell: Cell, value: T?) {
        map[cell]=value
    }

}

fun createSquareBoard(width: Int): SquareBoard = SquareBoardImpl(width)
fun <T> createGameBoard(width: Int): GameBoard<T> = GameBoardImpl(width)

