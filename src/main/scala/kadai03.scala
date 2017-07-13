
/**
  * Created by taiki on 2017/07/13.
  */

object NumEnglishDictionary {
  private val dictionary = Map(1 -> "one", 2 -> "two")

  def translate(num: Option[Int]): Option[String] = {
    val numInt = num match {
      case Some(num) => num
      case None => return None
    }
    this.dictionary.get(numInt) match {
      case Some(v) => return Some(v)
      case None => return None
    }
  }
}

object kadai03 {
  def main(args: Array[String]): Unit = {
    // Usage
    println(NumEnglishDictionary.translate(Some(1))) // Some("one")
    println(NumEnglishDictionary.translate(Some(3))) // None
    println(NumEnglishDictionary.translate(None)) // None
  }
}
