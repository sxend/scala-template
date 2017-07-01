package template

import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import template.entity.Wrapper
import template.JsonSupport._

trait Server {
  val routes: Route = (get & path("hello")) {
    complete(Wrapper("hello"))
  }
}

object Server extends Server
