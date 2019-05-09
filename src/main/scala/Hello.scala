object Hello{
  //def main (args: Array[String]):Unit={
    //println ("Hello World!")

    val doubleEvens: PartialFunction[Int,Int]= new PartialFunction[Int,Int] {
      override def isDefinedAt(x: Int): Boolean = x%2==0

      override def apply(v1: Int): Int = v1*2
    }

    val tripleOdds: PartialFunction[Int,Int]= new PartialFunction[Int,Int] {
      override def isDefinedAt(x: Int): Boolean = x%2!=0

      override def apply(v1: Int): Int = v1*3
    }
    val whatToDo = doubleEvens orElse tripleOdds
    //println("whatoDo(3): "+whatToDo(3))
    //println("whatoDo(4): "+whatToDo(4))
  //}
}