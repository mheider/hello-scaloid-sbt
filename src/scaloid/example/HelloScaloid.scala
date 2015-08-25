package scaloid.example

import org.scaloid.common._
import android.graphics.Color
import scroll.internal.Compartment
import android.util.Log

class HelloScaloid extends SActivity {

  class BaseGreeter() {
    def getGreeting(): String = "Hello World!"
  }

  class GreetingRole() {
    def getGreeting(): String = "THIS IS A ROLE!!!!!"
  }


  val TAG = "HelloScaloid"

  onCreate {
    new Compartment {
      Log.e("MainActivity", "Init play")
      val greeter = new BaseGreeter() play new GreetingRole()
      Log.e("MainActivity", "Init greeting")
      val greeting: String = (+greeter).getGreeting()
      Log.i(TAG, greeting)
      toast(greeting)
    }
  }

}
