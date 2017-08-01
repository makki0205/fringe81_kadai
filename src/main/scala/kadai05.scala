/**
  * Created by taiki on 2017/07/18.
  */
object kadai05 {
  val passScore = 80
  val english = "english"
  val math = "math"

  def main(args: Array[String]): Unit = {
    val scores = Map(
      "ichiro" -> Map("math" -> 82, "english" -> 99),
      "jiro" -> Map("japanese" -> 100, "social" -> 88),
      "saburo" -> Map("math" -> 76, "english" -> 80),
      "shiro" -> Map("math" -> 99, "social" -> 81),
      "hanako" -> Map("math" -> 84, "english" -> 78, "social" -> 66))

    println(passStudents(scores)) // Map(ichiro -> 90, hanako -> 81)

  }

  def passStudents(scores: Map[String, Map[String, Int]]): Map[String, Int] = {
    for (score <- scores;
         if score._2.contains(english) && score._2.contains(math);
         ave = (score._2(english) + score._2(math)) / 2
         if ave > passScore
    ) yield score._1 -> ave

  }
}
