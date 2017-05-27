package template

import org.scalatest._

class HelloWorldTest extends FlatSpec with Matchers {

  "HelloWorld#run" should "set message" in {
    val helloworld = new HelloWorld with MockOutPut {
    }
    helloworld.run()
    helloworld.message should be("Hello, World.")
  }

  trait MockOutPut extends Print {
    var message = ""

    override def print(message: String): Unit = {
      this.message = message
    }
  }

}
