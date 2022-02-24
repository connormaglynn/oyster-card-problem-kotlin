/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package oyster.card.problem.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class AppTest {

    /*
        Models
        - Zone Enum
        - Station
            - constructor(zones)
            - getZones()
            - checkIn(card)
            - checkOut(card)
        - Journey
            - constructor(startStation)
            - isJourneyComplete()
        - FairCalculator
            - constructor()
            - calculate(Journey)
            - orderRulesByCheapest
        - Card
            - constructor(fairCalculator)
            - addBalance
            - removeBalance
            - startJourney
            - endJourney
        - User
            - constructor(card)
    */

    @Test fun `Holborn to Earl’s Court`() {
//        val holbornStation = Station(setOf(Zone.ONE))
//        val earlsCourtStation = Station(setOf(Zone.ONE, Zone.TWO))
//
//        val card = Card()
//        card.addBalance(30.0)
//        holbornStation.checkIn(card)
//        earlsCourtStation.checkOut(card)
//
//        assertEquals(27.5, card.getBalance())
    }

    @Test fun appHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
