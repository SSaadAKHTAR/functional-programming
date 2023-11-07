import scala.::
import scala.math.sqrt
object Assignment2 {
  def main(args: Array[String]): Unit = {
    //Ex 1
    def func(x: Int): Int = {
      val a = 3
      val b = 5
      val c = 7
      val y = a * math.pow(x, 2).toInt + b * x + c
      y
    }

    val list1 = Range(-3, 4).toList
    println(s"main list $list1")

    val list2 = for {
      x <- list1
    } yield func(x)

    println(s"list after functions applied: $list2")


    //Ex 2
    val zippedWithIndex = list1.zip(list2).zipWithIndex.map {
      case ((x, fx), index) => (x, fx, index)
    }

    println(s"this is zipped list with index $zippedWithIndex")

    val meanFx = list2.sum.toDouble / list2.length
    val fmean = zippedWithIndex.find { case (_, fx, _) => fx == meanFx }

    println(fmean)


    //Ex 3
    def fun(vector: List[Int]): Double = {
      val squareSum = vector.foldLeft(0)((acc, x) => acc + x * x)
      val ans = sqrt(squareSum)

      ans
    }

    val list = List(4, 6, 9, 4, 5, 6)
    println("Euclidean norm of the above list is=" + fun(list))




    //Ex 4
    //11.2
    val uList = List(1, 2, 3, 4, 5)
    val uList_Twice = uList.map(_ * 2)
    println(s"List elements doubled: $uList_Twice")
    def f(x: Int) = if (x > 2) x * x else None

    val uList_Squared = uList.filter(_ > 2).map(f)
    println(s"List elements squared selectively: $uList_Squared")

    //11.3
    val uList2: List[Int] = List(1, 2, 3, 4, 5)

    def g(v: Int): List[Int] = List(v - 1, v, v + 1)
    val uListExtendedMap2 = uList2.map(g(_))
    println(s"Extended list using map: $uListExtendedMap2")
    val uListExtendedFlatMap2 = uList2.flatMap(g(_))
    println(s"Extended list using flatMap: $uListExtendedFlatMap2")

    //11.4
    val uList3: List[Int] = List(1, 2, 3, 4, 5)

    def function(x: Int) = if (x > 2) Some(x) else None

    // Applying map and flatMap with built-in Options class
    val uList_Selective = uList3.map(function(_))
    println(s"Selective elements of List with map: $uList_Selective")

    val uList_Selective_flatMap = uList3.flatMap(function(_))
    println(s"Selective elements of List with flatMap: $uList_Selective_flatMap")

  }
}