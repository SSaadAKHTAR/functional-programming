 import scala.::
import scala.util.Random
 import  scala.collection.mutable


object Assignment1 {
  def main(args: Array[String]): Unit = {
    //Ex1
    val array: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- array.indices) {
      println(array(i))
    }


    //Ex2
    val mutableMap : mutable.Map[String, Int] = mutable.Map("a" -> 1 , "b" -> 2, "c" -> 3)
    mutableMap("d") = 4
    mutableMap -= "b"
    mutableMap("e") = 5
    mutableMap -= "c"
    println(mutableMap)





    //Ex 3
    def myfun(Runs :  Option[String]): String = {
      Runs match{
        case Some(value) => s"Saad scored a, $value "
        case None => "Saad scored a, Duck!"
      }
    }
    val fifty: Option[String] = Some("50")
    val duck: Option[String] = None
    println(myfun(fifty))
    println(myfun(duck))


    //Task 1
    def forprime(num:Int): Boolean = {
      if (num <= 1) false
      else if(num == 2)true
      else !(2 to Math.sqrt(num).toInt).exists(x => num % x == 0)
    }
    val random = new Random()
    val randomNum = List.fill(15)(random.nextInt(451) + 50)
    val findingPrimeNum = randomNum.filter(forprime)
    val iterate =  findingPrimeNum.iterator
    val AccendingPrimeNum = findingPrimeNum.sorted
    val PrimeMap = AccendingPrimeNum.zipWithIndex.map{
      case(prime, index) => (index + 1, prime)
    }.toMap
    println("Prime numbers from the random generated numbers are: " + findingPrimeNum + ", ")
    println("Map  of prime nmbers: " + PrimeMap)



    //Task 2
    def CharList(Start: Int): List[Char] = {
      @scala.annotation.tailrec
      def geneAlpha(current: Int, acc: List[Char]): List[Char] = {
        if(current > 'z'.toInt){
          acc.reverse
        }
        else{
          geneAlpha(current + 1, current.toChar :: acc)
        }
      }
      geneAlpha(Start, Nil)
    }
    val startWith = 'a'.toInt
    val Lists = CharList(startWith)
    println(Lists)




    //Task 3
    def elementWiseSum(arry1: Array[Int], arry2: Array[Int]): Array[Int] = {
      val ans = new Array[Int](arry1.length)
      for (i <- arry2.indices) {
        ans(i) = arry1(i) + arry2(i)
      }
      ans
    }
    val array1 = Array(2, 3, 5)
    val array2 = Array(4, 21, 4)
    val result = elementWiseSum(array1, array2)
    println(result.mkString(", "))








  }
}