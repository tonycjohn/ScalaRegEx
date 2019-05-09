
object Main extends App {
  val ages = Seq(42,56,76,29)
  println (s"The oldest person is ${ages.max}")

  val util = new Utility
  println(util.upperCase("There", "is", "a","miracle"))
  util.getInnerMostParanthesisContent("first start(second start(inner most)and we end")


  //apply method defined in the companion object was called when instantiating case class as follows
  val point = Point(0)
  val round = Circle(point, 3.0)
  println(s"hashcode: ${round.hashCode()}")

  //val drawingActor = new ShapesDrawingActor
  //drawingActor.receive(Circle)

  }
