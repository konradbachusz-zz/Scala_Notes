import scala.xml.Elem

object XmlApp extends App {

  val person: Elem = <person>
    <firstName>John</firstName>
    <lastName>Doe</lastName>
    <emails>
      <email type="primary">john.doe</email>
      <email type="secondary">john.doe</email>
    </emails>
    <address>
      <street>85 Street</street>
      <city>OXford</city>
      <postcode>OX1 4GB</postcode>
    </address>
  </person>

  val seq: scala.xml.NodeSeq = person \ "firstName"
  print(seq)

  val seq2: scala.xml.NodeSeq = person \\ "email"
  seq2.map(email => println(email))

  val attribute: scala.xml.NodeSeq = person \\ "@type"
  println(attribute)

  val city: scala.xml.NodeSeq = person \\ "city"
  println(city)
}