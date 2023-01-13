package io.github.simplifier_ag.scala.spdf

sealed trait LogLevel {
  val value: String
}

object none extends LogLevel {
  override val value: String = "none"
}
object Error extends LogLevel {
  override val value: String = "error"
}
object Warn extends LogLevel {
  override val value: String = "warn"
}
object Info extends LogLevel {
  override val value: String = "info"
}

