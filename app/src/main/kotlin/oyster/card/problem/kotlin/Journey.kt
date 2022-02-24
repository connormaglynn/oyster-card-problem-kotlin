package oyster.card.problem.kotlin

class Journey {
    var startStation: Station? = null
    var endStation: Station? = null

    fun isComplete(): Boolean {
        return this.endStation !== null
    }

    fun getStations(): List<Station?> {
        return listOf(startStation, endStation)
    }
}