
import scala.concurrent.{Await, Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

/**
  * Created by taiki on 2017/07/18.
  */
// TODO 実装する
object kadai06 {
  def main(args: Array[String]): Unit = {
    val r1 = firstOf(Future{ Thread.sleep(9000); 1 }, Future{ Thread.sleep(3000); 2 })
    println(Await.result(r1, Duration.Inf)) // 3s後に2と表示

    val r2 = firstOf(Future{ Thread.sleep(900); 1 }, Future.failed(new Exception))
    r2.value.get.isFailure // こちら 失敗が確定しているFutureを渡す で即trueが返る
  }

  def firstOf[A](v1: Future[A], v2: Future[A]): Future[A] = {
    val b: Promise[A] = Promise[A]
    v1 onComplete {
      e => b.success(e.get)
    }
    v2 onComplete {
      e => b.success(e.get)
    }
    b.future
  }
}
