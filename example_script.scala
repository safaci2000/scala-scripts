#!/usr/bin/scala
!#
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world! " + args.toList)
    args.foreach(arg => println(arg))
  }
}
HelloWorld.main(args)
