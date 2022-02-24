package oyster.card.problem.kotlin

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals


class FairCalculatorTest {

    private lateinit var fairCalculator: FairCalculator

    @Before
    fun setUp() {
        fairCalculator = FairCalculator()
    }

    @Test
    fun `anywhere in zone 1 returns £2,50`() {
        val station = Station(setOf(Zone.ONE))
        val journey = Journey(station, station)
        assertEquals(2.5, fairCalculator.calculate(journey))
    }
}