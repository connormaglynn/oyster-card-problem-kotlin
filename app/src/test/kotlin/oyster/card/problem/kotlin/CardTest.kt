package oyster.card.problem.kotlin

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito

class CardTest {

    private lateinit var card: Card
    private val mockFairCalculator = Mockito.mock(FairCalculator::class.java)


    @Before
    fun setUp() {
        card = Card(mockFairCalculator)
    }

    @After
    fun tearDown() {
        Mockito.reset(mockFairCalculator)
    }

    @Test
    fun addBalance() {

    }

    @Test
    fun removeBalance() {
    }

    @Test
    fun startJourney() {
    }

    @Test
    fun endJourney() {
    }
}