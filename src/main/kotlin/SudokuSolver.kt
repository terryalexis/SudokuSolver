import solverStrategies.*

class SudokuSolver {
    private val SolutionStrategies: List<SolverStrategy> = listOf(
        OnePossibilityStrategy(),
        OnlyPlaceStrategy(),
        GuessStrategy(),
    )
    fun solve(puzzle: Puzzle): Puzzle {

//        while(currentPuzzle != null and currentPuzzle not solved and you don't need to backtrack):
//            apply your strategies to the puzzle until one of them makes a change to the puzzle
//            if (no strategies made a change)
//                currentPuzzle = backtrack to the most recent guess // you can use a stack for this and just copy the puzzle at the point a guess is made then just pop it off the stack here
//                        if (no puzzle to backtrack to)
//                            break out of the loop (or let it continue because the loop condition will catch this case because currentPuzzle will be null)
//
//                        else
//                            check to see if the changes solved the puzzle
//        if (puzzle is solved):
//        add the current puzzle to a list of possible solutions
//                currentPuzzle = backtrack to most recent guess
//        if (no puzzle to back track to)
//            done solving
//
//// after the loop
//                    if (you have 0 solutions) report accordingly
//                    else if (you have exactly 1 solution) report accordingly
//        else report that the puzzle is invalid because it has multiple solutions.

        return puzzle
    }
}