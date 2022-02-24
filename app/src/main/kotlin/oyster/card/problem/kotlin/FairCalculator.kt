package oyster.card.problem.kotlin

class FairCalculator {
    fun calculate(journey: Journey): Double {
        if (!journey.isComplete()) throw Exception()
        val startingZones = journey.startStation.getZones()
        val endingZones = journey.endStation?.getZones()

        return if (startingZones.contains(Zone.ONE) && endingZones?.contains(Zone.ONE) == true) 2.5
        else throw Exception()
    }

    companion object {
        const val MAX_FARE = 3.20
    }
}