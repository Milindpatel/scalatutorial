import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial{
    def main(args: Array[String]){
    
    var tupleMarge = (103, "Merge Simpson", 10.25)

    printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)

    tupleMarge.productIterator.foreach{i => println(i)}//print all the value which is in tuple

    println(tupleMarge.toString())

    }
}