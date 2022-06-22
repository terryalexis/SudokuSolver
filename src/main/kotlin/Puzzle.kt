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
}