/**
  * Created by taiki on 2017/07/13.
  */
object kada02 {
  def main(args: Array[String]): Unit = {
    // kadai02 Usage
    println(getFirst(Some("hello")))
    println(getFirst(Some("")))
    println(getFirst(None))
  }

  // kadai02
  def getFirst(value: Option[String]): String = {
    value match {
      case Some(v) => v
      case None => ""
    }
  }
}
