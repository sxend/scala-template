package template

import org.specs2.mutable._
import akka.http.scaladsl.testkit.Specs2RouteTest

class HelloSpec extends Specification with Specs2RouteTest with Server {

  "/hello" should {
    "GET" in {
      "respond hello json" in {
        Get("/hello") ~> routes ~> check {
          responseAs[String] shouldEqual """{"message":"hello"}"""
        }
      }
    }
  }
}
