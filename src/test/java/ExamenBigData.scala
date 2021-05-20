import scala.collection.immutable.Seq

object ExamenBigData {

  def main(args: Array[String]): Unit ={
    collectionListe()
    liste_double()
  }

  def collectionListe(): Unit={

    val malist : List[String] = List("luc", "pierre", "julien", "ella", "salomon", "hamed", "jean")

    val maListEnd_n : List[String]= malist.filter(e => e.endsWith("n"))

    maListEnd_n.foreach(i => println(i))
  }

  def liste_double():Unit={
    var montableau= Array(Array("ecommercemag.fr",""),Array("https://www.journalducm.com/contact/","Payant"),Array("https://www.zatsaz.com/",""),Array("https://www.lerevenu.com/",""),
      Array("https://www.cadre-diriogeant-magazine.com/","Payant"),Array("https://www.silicon.fr/services/contac#annoncer","Payant"),
      Array("https://www.channelbiz.fr/nous-contacter/", ""),Array("https://www.itespresso.fr/",""),Array("https://www.industrie-mag.com/article4.html","invite"),
      Array("https://www.jesuissundev.com/article-invite/","invite"),Array("https://www.numerama.com/",""))

    for (i<-0 to 10; j<-0 to 1)
      println("en "+i+","+j+" se trouve "+ (montableau(i)(j)) )
  }
}
