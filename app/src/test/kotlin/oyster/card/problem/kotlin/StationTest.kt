package oyster.card.problem.kotlin

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals


internal class StationTest {

    private lateinit var station: Station
    private lateinit var zones: Set<Zone>

    @Before
    fun setUp() {
        zones =  setOf(Zone.ONE)
        station = Station(zones)
    }

    @Test
    fun `getZones returns set of zones`() {
        assertEquals(station.getZones(), zones)
    }
}