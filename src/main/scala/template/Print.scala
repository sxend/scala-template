package template

trait Print {
  protected def print(message: String): Unit = println(message)
}