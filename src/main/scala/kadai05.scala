/**
  * Created by taiki on 2017/07/18.
  */
import scala.collection.mutable.Map
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
    // 空のmap作成
    val passList = Map[String, Int]()

    scores.filter{
      case (_, score)=> score.contains(english) && score.contains(math)
    }.foreach{
      case (name, score)=>{
        // 平均値を取得
        val ave = (score(english) + score(math)) / 2
        // 合格点であれば以上なら配列に追加
        if (ave >= passScore){
          passList(name) = ave
        }
      }
    }

    passList
  }
}
