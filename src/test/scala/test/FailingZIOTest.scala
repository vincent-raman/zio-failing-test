package test

import zio._
import zio.test._
import zio.test.junit._

class FailingZIOTest extends JUnitRunnableSpec {
  def spec = test("zio test") {
    ZIO.attempt(assertTrue("testValue" == "otherTestValue"))
  }
}