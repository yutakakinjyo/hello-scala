object HelloFunction extends App {
  val helloFunction = { string: String => println(string) }
  helloFunction("hello")
}
