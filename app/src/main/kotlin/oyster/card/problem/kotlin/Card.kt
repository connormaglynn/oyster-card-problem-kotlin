package oyster.card.problem.kotlin

import oyster.card.problem.kotlin.FairCalculator.Companion.MAX_FARE

class Card constructor(
    private val fairCalculator: FairCalculator,
){
    private var journey: Journey = Journey()

    fun addBalance() {

    }
    fun removeBalance(number: Double) {

    }
    fun startJourney(station: Station) {
        this.journey.startStation = station
        this.removeBalance(MAX_FARE)
    }
    fun endJourney(station: Station) {
        this.journey.endStation = station
        fairCalculator.calculate()
    }

    fun refundAmount(actualCost: Double, maxFare: Double) {
        return
    }
}