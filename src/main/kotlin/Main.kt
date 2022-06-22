import java.io.File

fun main(args: Array<String>) {
    println("=====================")
    println("=== SUDOKU SOLVER ===")
    println("=====================\n")

    val inputFile = getInputFile()
    val outputFile = getOutputFile()

    val lines: List<String> = File(inputFile).readLines()
    val puzzleToSolve = PuzzleCreator().createPuzzle(lines)

    println("Solving the puzzle...")
    // perform calculation
    // print error if any, else
    println("Finished! Check $outputFile for the result.")
    println(puzzleToSolve.toString())
}

fun getInputFile(): String {
    print("Enter filename of sudoku puzzle to solve: ")
    var inputFile = "src/sample_puzzles/Input/" + readLine()!!
    while(!File(inputFile).exists()) {
        print("File does not exist. Please check the name and try again: ")
        inputFile = "src/sample_puzzles/Input/" + readLine()!!
    }
    return inputFile
}

fun getOutputFile(): String {
    print("Enter filename for the sudoku solution: ")
    return readLine()!!
}