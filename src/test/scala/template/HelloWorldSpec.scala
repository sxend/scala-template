package template

import org.specs2.mutable._

class HelloWorldSpec extends Specification {

  "HelloWorld" should {
    "#run" in {
      "print message" in {
        val helloworld = new HelloWorld with MockOutPut {
        }
        helloworld.run()
        helloworld.message must_== "Hello, World."
        done
      }
    }
  }

  trait MockOutPut extends Print {
    var message = ""

    override def print(message: String): Unit = {
      this.message = message
    }
  }

}
