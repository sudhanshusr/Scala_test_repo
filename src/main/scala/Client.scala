package com.main.scala

class Simple() {

  def getCurrency(nationality: String) = {
    if (nationality.toLowerCase() == "india") "Rupee"
    else if (nationality.toLowerCase() == "us") "Dollar"
    else if (nationality.toLowerCase() == "uk") "Pound"
    else if (nationality.toLowerCase() == "uae") "Dinar"
    else "Invalid nationality"
  }

  def devideNums(n1: Int, n2: Int) = {
    try {
      val result = n1 / n2
      result

    } catch {
      case e: Exception => e.getMessage
    }
  }

  def matchNationality(nationality: String) = {
    nationality match {
      case "India" => "Rupee"
      case "US"    => "Dollar"
      case "UK"    => "Pound"
      case "UAE"   => "Dinar"

    }
  }

}

object Client{

  val obj1 = new Simple()
 

  val obj2 = new Simple()
  
  
  val obj3 = new Simple()

  def main(args: Array[String]): Unit = {
     println(obj1.getCurrency("India"))
     println(obj1.devideNums(100, 20))
     println(obj1.matchNationality("India"))
  }
}

