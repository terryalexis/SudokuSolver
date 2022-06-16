import java.io.File

fun main(args: Array<String>) {
    println("=====================")
    println("=== SUDOKU SOLVER ===")
    println("=====================\n")
    print("Enter filename of sudoku puzzle to solve: ")
    val inputFile = "src/sample_puzzles/Input/" + readLine()!!
    print("Enter filename for the sudoku solution: ")
    val outputFile = readLine()!!

    val lines: List<String> = File(inputFile).readLines()
    val puzzleToSolve = PuzzleCreator().createPuzzleFromData(lines)

    println("Solving the puzzle...")
    // perform calculation
    // print error if any, else
    println("Finished! Check $outputFile for the result.")
}