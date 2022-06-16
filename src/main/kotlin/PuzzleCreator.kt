class PuzzleCreator {
    fun createPuzzleFromData(puzzleData: List<String>) : Puzzle {
        var puzzle: Puzzle = Puzzle()

        // validate
        //  - check if file is valid
        //  - check if puzzle is valid
        val symbolsPerSet : Int = Integer.parseInt(puzzleData[0])
        val validSymbols : Array<String> = puzzleData[1].split(" ").toTypedArray()

        for(i in 2..symbolsPerSet) {
            val rowValues = puzzleData[i].split(" ").toTypedArray()
        }
        return puzzle
    }
}