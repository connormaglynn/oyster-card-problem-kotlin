package oyster.card.problem.kotlin

class Station constructor(private val zones: Set<Zone>) {

    fun getZones(): Set<Zone> {
        return this.zones
    }
//    TODO after card has been implemented
//    fun checkIn(card: Card) {
//
//    }
//    fun checkOut(card: Card) {
//
//    }
}