package my.com.toru.dslpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import my.com.toru.dslpractice.dsl.address
import my.com.toru.dslpractice.dsl.person

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = person {
                        name = "Toru Wonyoung Choi"
                        age = 36
                        address {
                            it.city = "Kuala Lumpur"
                            it.number = 50250
                            it.street = "Sultan Ismail"
                        }
        }

        Log.w("TORU", "person:: ${person.name}, ${person.age}, ${person.address?.city},${person.address?.number}, ${person.address?.street}")

        print(person)
    }
}
