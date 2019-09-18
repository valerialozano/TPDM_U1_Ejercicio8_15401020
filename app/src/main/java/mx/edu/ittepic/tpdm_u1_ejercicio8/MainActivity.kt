package mx.edu.ittepic.tpdm_u1_ejercicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {

    var cadena : EditText?=null
    var boton : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cadena = findViewById(R.id.cadena)
        boton = findViewById(R.id.boton)

        var vector = cadena?.text.toString().split(",")
        boton?.setOnClickListener {
            var act = Intent(this,MainActivity::class.java)
            act.putExtra("cadena",cadena?.text.toString())
            startActivity(act)
        }

    }
}
