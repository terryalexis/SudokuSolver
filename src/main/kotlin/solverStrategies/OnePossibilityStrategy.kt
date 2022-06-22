package solverStrategies

import Cell
import Puzzle

class OnePossibilityStrategy: SolverStrategy() {
    override var name: String = "One Possibility"

    override fun findApplicableCells(puzzle: Puzzle): Pair<List<Cell>, Any> {
        TODO("Not yet implemented")
    }

    override fun applyChanges(puzzle: Puzzle, cells: List<Cell>, manipulationParam: Any): Boolean {
        TODO("Not yet implemented")
    }
}