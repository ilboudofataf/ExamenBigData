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

  def liste_double(): Unit ={
    val montableau=List(
      ("ecommercemag.fr",""),
      ("https://www.journalducm.com/contact/","payant"),
      ("https://www.zatsaz.com","payant"),
      ("https://www.lerevenu.com",""),
      ("https://www.cadre-diregeantfdeantèmagazine.com","payant"),
      ("https://www.silicon.fr/services/contact#annoncer","payant"),
      ("https://www.channelbiz.fr/nous-contactez/",""),
      ("https://www.itespresso.fr/",""),
      ("https://www.industrie-mag.com/article4.html","invité"),
      ("https://www.jesuisundev.com","invité"),
      ("https://www.numerama.com","")
    )


    val tableau2  = montableau.map(l => {
      if (l._1.startsWith("https://www.")){ (l._1.substring(12),l._2) }
      else{ (l._1, l._2)}
    }).foreach(l =>println(l))

  }


}
