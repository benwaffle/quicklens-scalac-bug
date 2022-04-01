package example

import com.softwaremill.quicklens.{ModifyPimp, QuicklensEach}

object Hello extends Greeting with App {

  case class Hello(field: String)

  def doit = {
    val lang2 = "hey"

    Seq(Hello("asdf"))
      .modify(_.eachWhere(_.field != lang2).field)
      .setTo(lang2)
  }

  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
