import scala.collection.immutable.Seq

object ExamenBigData {

  def main(args: Array[String]): Unit ={
    collectionListe()
  }

  def collectionListe(): Unit={

    val malist : List[String] = List("luc", "pierre", "julien", "ella", "salomon", "hamed", "jean")

    val maListEnd_n : List[String]= malist.filter(e => e.endsWith("n"))

    maListEnd_n.foreach(i => println(i))
  }
}
