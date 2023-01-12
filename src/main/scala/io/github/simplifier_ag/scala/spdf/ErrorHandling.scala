package io.github.simplifier_ag.scala.spdf

sealed trait ErrorHandling {
  val value: String
}

object Abort extends ErrorHandling {
  override val value: String = "abort"
}
object Ignore extends ErrorHandling {
  override val value: String = "ignore"
}
object Skip extends ErrorHandling {
  override val value: String = "skip"
}
