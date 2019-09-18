package mx.edu.ittepic.tpdm_u1_ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import java.util.*

class Main2Activity : AppCompatActivity() {

    var posicion : EditText?=null
    var mostrar : Button?=null
    var etiqueta : EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        posicion = findViewById(R.id.posicion)
        mostrar = findViewById(R.id.mostrar)
        etiqueta = findViewById(R.id.etiqueta)

        var cadena = intent.extras?.getString("cadena")
        var vector = cadena?.split(",")
        var tam = vector.size
        mostrar?.setOnClickListener {
            var pos = posicion?.text.toString().toInt()
            var e = vector?.get(pos)
            if((posicion?.text.toString().toInt()>=0) && (posicion?.text.toString().toInt()< vector.size)) {
                etiqueta?.setText("Posición: $pos : $e")
            }else{
                val alert = AlertDialog.Builder(this)
                alert.setTitle("¡Error!").setMessage("Escribe una posición válida.").setPositiveButton("Aceptar"){dialog,which->}.show()
            }
        }

    }
}
