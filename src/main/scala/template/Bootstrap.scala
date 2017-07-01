package template

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import akka.stream.ActorMaterializer

object Bootstrap {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("template")
    implicit val materializer = ActorMaterializer()
    val config = system.settings.config
    Http().bindAndHandleAsync(
      Route.asyncHandler(Routes(config)),
      config.getString("template.server.host"),
      config.getInt("template.server.port"),
      parallelism = config.getInt("template.server.parallelism")
    )
  }
}

