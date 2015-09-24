package scalatest
import org.scalatest.FunSuite
import com.main.scala.Simple
import scala.util.control.Exception
//import com.main.scala.Client
class TestHelloSBTScala extends FunSuite {
  
  var obj = new Simple()
  

 test("Very Basic : Check of equality 1==1") {
    assert(1 == 1)
  }
  test("Another Very Basic : Check of equality HelloWorld") {
    assert("Hello World" == "Hello World")
  }
  test("test ifelse1"){assert(obj.getCurrency("india") == "Rupee")}
  test("test ifelse2"){assert(obj.getCurrency("us") == "Dollar")}
  test("test ifelse3"){assert(obj.getCurrency("uk") == "Pound")}
  test("test ifelse4"){assert(obj.getCurrency("uae") == "Dinar")}
  test("test else4"){assert(obj.getCurrency("uaes") == "Invalid nationality")}
  
  test("test match1"){assert(obj.matchNationality("India")== "Rupee")}
  test("test match2"){assert(obj.matchNationality("US")== "Dollar")}
  test("test match3"){assert(obj.matchNationality("UK")== "Pound")}
  test("test match4"){assert(obj.matchNationality("UAE")== "Dinar")}
  
  
  test("test try/catch1"){assertResult(obj.devideNums(100, 20))(5)}
  test("test try/catch2"){assertResult(obj.devideNums(100, 0))("/ by zero")}
  
  test("client"){assert(com.main.scala.Client.obj1.getCurrency("India") == "Rupee")}
  test("client1"){com.main.scala.Client.main(Array("a","b"))}

}
