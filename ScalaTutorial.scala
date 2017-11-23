import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial{
    def main(args : Array[String]){
        
    val favNums = new Array[Int](20)

    val friends = Array("Bob", "Nil")

    friends(0) = "Sue"

    println("Best friends " + friends(0))

    val friends2 = ArrayBuffer[String]()

    friends2.insert(0, "Phil")

    friends2 += "Mark"

    friends2 ++= Array("Susy", "Paul")

    friends2.insert(1, "M", "N", "O", "P")

   friends2.remove(1, 2)

    var friend : String = " "

    for (friend <- friends2)
        println(friend)

    for(j <-0 to (favNums.length - 1)){
        favNums(j) = j
        println(favNums(j))
    }

    val favNumsTimes2 = for(num <- favNums) yield 2 * num

    favNumsTimes2.foreach(println)

    var favNumsDiv4 = for (num <- favNums if num % 4 == 0) yield num

    favNumsDiv4.foreach(println)

    val multTable = Array.ofDim[Int](10,10)

    for (i <- 0 to 9){
        for (j <- 0 to 9){
            multTable(i)(j) = i * j
        }
    }

    for (i <- 0 to 9){
        for (j <- 0 to 9){
            printf("%d : %d = %d\n", i, j, multTable(i)(j))
        }
    }

    println("sum : " + favNums.sum)
    println("Min: " + favNums.min)
    println("Max : " + favNums.max)

    val sortedNums = favNums.sortWith(_>_)//desending
     val asortedNums = favNums.sortWith(_<_)//asending

    println(sortedNums.deep.mkString(", "))
    println(asortedNums.deep.mkString(", "))

}
}