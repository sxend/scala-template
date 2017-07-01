package template

import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import com.typesafe.config.Config
import template.entity.Wrapper
import template.JsonSupport._

object Routes {
  def apply(config: Config): Route = (get & path("hello")) {
    complete(Wrapper("hello"))
  }
}
