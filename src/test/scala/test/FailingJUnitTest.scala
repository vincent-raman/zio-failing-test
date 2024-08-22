package test

import org.junit.Assert.assertEquals
import org.junit.Test

class FailingJUnitTest {
  @Test def test(): Unit = {
    assertEquals("junit test", "testValue", "otherTestValue")
  }
}
