package io.github.simplifier_ag.scala.spdf

import io.github.simplifier_ag.scala.spdf.ParamShow._
import org.scalatest.{Matchers, WordSpec}

class ParamShowSpec extends WordSpec with Matchers {

  "StringParamShow" should {

    "represent a parameter" in {
      StringParamShow.show("param", "value") should equal(Seq("--param", "value"))
    }

  }

  "BooleanParamShow" should {

    "represent a parameter when true" in {
      BooleanParamShow.show("param", value = true) should equal(Seq("--param"))
    }

    "return empty parameter when false" in {
      BooleanParamShow.show("param", value = false) should equal(Iterable.empty)
    }

  }

  "OptionBooleanParamShow" should {

    "represent a parameter when true" in {
      OptionBooleanParamShow.show("param", Some(true)) shouldBe Seq("--param")
    }
    "represent the parameter with no- prefix when false" in {
      OptionBooleanParamShow.show("param", Some(false)) shouldBe Seq("--no-param")
    }
    "return empty parameter when empty" in {
      OptionBooleanParamShow.show("param", None) shouldBe Seq()
    }
  }
  "RepeatableStringParamShow" should {

    "represent a repeatable parameter" in {
      RepeatableStringParamShow.show("param", List("a", "b")) should equal(Seq("--param", "a", "--param", "b"))
    }

  }

  "RepeatableStringMapParamShow" should {
    "represent a repeatable map parameter" in {
      RepeatableStringMapParamShow.show("param", Map("a" -> "b", "c" -> "d")) shouldBe Seq("--param", "a b", "--param", "c d")
    }
  }

}
