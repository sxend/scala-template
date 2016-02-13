package arimitsu.sf.template

object Bootstrap {
  def main(args: Array[String]): Unit = {
    new HelloWorld().run()
  }
}

class HelloWorld extends Output {
  def run(): Unit = print("Hello, World.")
}

trait Output {
  def print(message: String): Unit = println(message)
}
