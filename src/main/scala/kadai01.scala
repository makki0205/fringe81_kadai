/**
  * Created by taiki on 2017/07/13.
  */
object kadai01 {
  def main(args: Array[String]): Unit = {
    // Usage
    show(Some("hello")) // helloと出力
    show(None) // 何も出力されない(printlnも実行しないこと)
  }

  def show(value: Option[String]): Unit = {
    value.foreach { v =>
      println(v)
    }
  }
}

