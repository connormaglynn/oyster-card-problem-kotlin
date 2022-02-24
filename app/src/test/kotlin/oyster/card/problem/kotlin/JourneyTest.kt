package oyster.card.problem.kotlin

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class JourneyTest {

    private lateinit var journey: Journey
    private lateinit var startStation: Station

    @Before
    fun setUp() {
        startStation = Station(setOf(Zone.ONE))
        journey =  Journey(startStation)
    }

    @Test
    fun `isJourneyComplete returns false if no end station set`() {
        assertEquals(false, journey.isComplete())
    }

    @Test
    fun `isJourneyComplete returns true if end station set`() {
        journey.endStation = Station(setOf(Zone.ONE))
        assertEquals(true, journey.isComplete())
    }

    @Test
    fun `getStations contains start station and null by default`() {
        assertTrue(journey.getStations().containsAll(listOf(startStation, null)))
    }

    @Test
    fun `getStations contains start station and end end stations when set`() {
        val endStation = Station(setOf(Zone.ONE))
        journey.endStation = endStation
        assertTrue(journey.getStations().containsAll(listOf(startStation, endStation)))
    }
}