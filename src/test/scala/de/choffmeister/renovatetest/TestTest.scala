package de.choffmeister.renovatetest

import org.scalatest.{Matchers, WordSpec}

class TestTest extends WordSpec with Matchers {
  "works" in {
    val number = 1
    number should be(1)
  }
}
