class Puzzle(
    val symbolsPerSet: Int,
    val validSymbols: List<String>
){
    var puzzle: MutableList<MutableList<Cell>> = mutableListOf<MutableList<Cell>>()
        private set

    fun insertRow(colValues: List<String>) {
        var cells = mutableListOf<Cell>()

        for (colValue: String in colValues) {
            var cell = Cell(colValue, validSymbols as MutableList<String>)
            cells.add(cell)
        }
        puzzle.add(cells)
    }

    override fun toString(): String {
        var puzzleString: String = ""
        for(row: List<Cell> in puzzle) {
            for(cell: Cell in row) {
                val formattedCell = cell.toString()
                puzzleString += "$formattedCell "
            }
            if(row != puzzle.last()) {
                puzzleString += "\n"
            }
        }
        return puzzleString
    }
}