package solverStrategies

import Cell
import Puzzle

abstract class SolverStrategy {
    abstract var name: String;
    var numUses = 0
    var elapsedTime = 0

    fun execute(puzzle: Puzzle): Boolean {
        startTimer()
        val result = findApplicableCells(puzzle)
        val cells = result.first
        var changeMade = false
        val manipulationParam = result.second
        if (cells.isNotEmpty()) {
            numUses ++
            changeMade = applyChanges(puzzle, cells, manipulationParam)
            // remember that some strategies might only eliminate possible values and not necessarily make a change to the puzzle
        }
        stopTimer()
        return changeMade
    }

    abstract fun findApplicableCells(puzzle: Puzzle) : Pair<List<Cell>, Any> // Pair lets you return 2 values and Any allows for a second return value of any type
    abstract fun applyChanges(puzzle: Puzzle, cells: List<Cell>, manipulationParam: Any): Boolean

    private fun startTimer() {
        // implementation here
    }

    private fun stopTimer() {
        // implementation here
    }

}