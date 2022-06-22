import kotlin.math.floor
import kotlin.math.sqrt
class PuzzleCreator {
    fun createPuzzle(puzzleData: List<String>) : Puzzle {
        val symbolsPerSet : Int = Integer.parseInt(puzzleData[0])
        val validSymbols : List<String> = puzzleData[1].split(" ").toList()
        var puzzle: Puzzle = Puzzle(symbolsPerSet, validSymbols)

        if(!isPerfectSquare(symbolsPerSet)) {
            throw Exception("Sudoku puzzle must be a perfect square.")
        }
        if(puzzleData.size < symbolsPerSet + 2) {
            throw Exception("Sudoku puzzle has an incorrect number of rows.")
        }

        // Add rows to sudoku puzzle
        for(i in 2 until symbolsPerSet + 2) {
            val colValues = puzzleData[i].split(" ").toList()
            if(colValues.size < symbolsPerSet) {
                println("col values:" + colValues.size + ", symbols: " + symbolsPerSet + " i:" + i + " val:" + colValues[0])
                throw Exception("Sudoku puzzle has an incorrect number of columns.")
            }
            puzzle.insertRow(colValues)
        }

        return puzzle
    }

    private fun isPerfectSquare(symbolsPerSet: Int): Boolean {
        val squareRoot = sqrt(symbolsPerSet.toFloat())
        return squareRoot == floor(squareRoot)
    }
}

