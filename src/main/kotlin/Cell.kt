class Cell(
    var value: String,
    var possibleValues: MutableList<String>
) {
    init {
        if(value != "-") {
            possibleValues = mutableListOf<String>()
        }
    }

    override fun toString(): String {
        return value
    }
}