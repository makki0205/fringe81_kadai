/**
  * Created by taiki on 2017/07/13.
  */
object kadai04 {
  def main(args: Array[String]): Unit = {
    val m = Map(1->"one", 2->"two")
    val mOpt: Option[Map[Int, String]] = Some(m)
    println(mOpt.get(2)) // "one"が返る
  }
}
