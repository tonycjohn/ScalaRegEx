import akka.actor.Actor

case class Point(x:Double=0.0, y:Double=0.0)

abstract class Shape(){
  def draw(f:String=>Unit):Unit = {f(s"draw this ${this.toString}")}
}

case class Circle (center:Point, radius:Double) extends Shape

case class Rectangle (lowerLeft:Point, height:Double, width:Double ) extends Shape

case class Triangle (point1:Point, point2:Point, point3:Point) extends Shape

object Messages {
  object Exit
  object Finished
  case class Response (message:String)
}

class ShapesDrawingActor extends Actor{
  import Messages._

  def areceive = {
    case s:Shape =>
      s.draw(str=>println(s"ShapesDrawingActor $str"))
      sender ! Response(s"ShapesDrawingActor: $s drawn")
    case Exit =>
      println(s"ShapesDrawingActor: Exiting")
      sender ! Finished
    case unexpected =>
      val response = Response(s"ERROR: Unknown message: $unexpected")
      println (s"ShapesDrawingActor: $response")
      sender ! response
  }
}
