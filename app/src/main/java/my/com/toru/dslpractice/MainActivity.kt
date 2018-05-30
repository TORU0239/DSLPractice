package my.com.toru.dslpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import my.com.toru.dslpractice.dsl.address
import my.com.toru.dslpractice.dsl.person

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = person {
                        it.name = "Toru Wonyoung Choi"
                        it.age = 36
                        it.address {
                            it.city = "Kuala Lumpur"
                            it.number = 50250
                            it.street = "Sultan Ismail"
                        }
        }

        print(person)
    }
}
