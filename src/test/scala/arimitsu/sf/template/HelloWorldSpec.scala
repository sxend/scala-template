package arimitsu.sf.template

import org.specs2.mutable._

class HelloWorldSpec extends Specification {

  "HelloWorld" should {
    "#run" in {
      "print message" in {
        new HelloWorld {
          override def print(message: String): Unit = {
            message must_== "Hello, World."
          }
        }.run()
        done
      }
    }
  }
}
