import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PuzzleCreatorTest {
    @Test
    fun testCreatePuzzleMethodThrowsExceptionIfNotPerfectSquare() {
        val puzzleData: List<String> = listOf(
            "3",
            "1 2 3"
        )
        val puzzleCreator = PuzzleCreator()

        assertThrows(
            Exception::class.java,
            { puzzleCreator.createPuzzle(puzzleData) },
            "Sudoku puzzle must be a perfect square."
        )
    }

    @Test
    fun testCreatePuzzleMethodThrowsExceptionIfIncorrectRows() {
        val puzzleData: List<String> = listOf(
            "4",
            "1 2 3 4",
            "1 - 3 -"
        )
        val puzzleCreator = PuzzleCreator()

        assertThrows(
            Exception::class.java,
            { puzzleCreator.createPuzzle(puzzleData) },
            "Sudoku puzzle has an incorrect number of rows."
        )
    }

    @Test
    fun testCreatePuzzleMethodThrowsExceptionIfIncorrectColumns() {
        val puzzleData: List<String> = listOf(
            "4",
            "1 2 3 4",
            "1 - 3 -",
            "2 3 4 1",
            "1 2",
            "- - - -"
        )
        val puzzleCreator = PuzzleCreator()

        assertThrows(
            Exception::class.java,
            { puzzleCreator.createPuzzle(puzzleData) },
            "Sudoku puzzle has an incorrect number of columns."
        )
    }

    @Test
    fun testCreatePuzzleMethodReturnsSudokuPuzzle() {
        val puzzleData: List<String> = listOf(
            "4",
            "1 2 3 4",
            "1 - 3 -",
            "2 3 4 1",
            "1 2 - -",
            "- - - -"
        )
        val puzzleCreator = PuzzleCreator()
        assertEquals(puzzleCreator.createPuzzle(puzzleData).puzzle.size, 4)
    }
}