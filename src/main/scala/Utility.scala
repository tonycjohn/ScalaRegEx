import scala.util.matching.Regex

class Utility {

  def upperCase(stringValue:String*):Seq[String]={
    stringValue.map((s:String)=>s.toUpperCase())
    //stringValue.map(_.toUpperCase())
  }

  /*def isPasswordPolicy (password:String):Boolean = {
    val pattern :Regex = "[a-zA-Z0-9!@]+".r


  }*/

  def getInnerMostParanthesisContent(inputString:String) = {
    //val pattern: Regex = "(\\w*\\s*\\w*\\()+(\\w*\\s*\\w*)(\\)\\w*\\s*\\w*)+".r
    val pattern: Regex = "([\\w\\s]*\\()+(\\w*\\s*\\w*)(\\)\\w*\\s*\\w*)+".r
    val nonAlphaPattern1: Regex = "^[a-z; ]".r

    for (patternMatch <- pattern.findAllMatchIn(inputString))
      println(s"start outermost is: ${patternMatch.group(1)}, Innermost is: ${patternMatch.group(2)}, end outermost is:  ${patternMatch.group(3)}")

  }
}

