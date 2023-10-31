import scala.::
import scala.util.Random
object hello {
  def elementWiseSum (arry1: Array[Int], arry2: Array[Int] ): Array[Int] = {
      val ans= new Array[Int](arry1.length)
      for (i <- arry2.indices){
        ans(i) = arry1(i) + arry2(i)
      }
      ans
    }
  def main(args: Array[String]): Unit = {
    val array1 = Array(2,3,5)
    val array2 = Array(4,21,4)
    val result = elementWiseSum(array1,array2)
    println(result.mkString(", "))
  }
}