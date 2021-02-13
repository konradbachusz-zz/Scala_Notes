import java.util
import scala.jdk.CollectionConverters._

object WithJava extends App {
  val numbersInJava: util.List[Int] = util.Arrays.asList(1, 2, 3, 4)
  val numbersScala: scala.collection.mutable.Buffer[Int] = numbersInJava.asScala

  numbersScala.foreach(number => println(number))
}
