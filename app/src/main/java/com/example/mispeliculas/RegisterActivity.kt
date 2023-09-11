package com.example.mispeliculas

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mispeliculas.databinding.ActivityRegisterBinding


class RegisterActivity : AppCompatActivity() {

    //private lateinit var tvDatePicker: TextView
    //private lateinit var btnDataPicker: Button



    private lateinit var registerBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = registerBinding.root
        setContentView(view)

        //tvDatePicker = findViewById(R.id.tvDate)
        //btnDataPicker = findViewById(R.id.btnDatePicker)


        registerBinding.registerButton.setOnClickListener{
            Log.d("button", "clicked")
            val email = registerBinding.emailEditText.text.toString()
            //val email = registerBinding.emailEditText.text.toString().toInt()
            // var info = email
            val password = registerBinding.passswordEditText.text.toString()
            val repPassword = registerBinding.repPasswordEditText.text.toString()

            var genre = "Masculino"
            if (registerBinding.maleRadioButton.isChecked) {
                genre = "Femenino"
            }


            var favoritiresGenre = ""

            if(registerBinding.actionCheckBox.isChecked)
                favoritiresGenre = favoritiresGenre + " " + "Accion"
            if(registerBinding.adventureCheckBox.isChecked)
                favoritiresGenre = favoritiresGenre + " " + "Aventura"
            if(registerBinding.dramaCheckBox.isChecked)
                favoritiresGenre = favoritiresGenre + " " + "Drama"
            if(registerBinding.fantasyChechBox.isChecked)
                favoritiresGenre = favoritiresGenre + " " + "Fantasia"
            if(registerBinding.comicCheckBox.isChecked)
                favoritiresGenre = favoritiresGenre + " " + "Humor"
            if(registerBinding.terrorCheckBox.isChecked)
                favoritiresGenre = favoritiresGenre + " " + "Terror"


            if (password == repPassword) {
                //val info = info + "\n" + password
                val info = email + "\n" +  password + "\n" + genre + "\n" + favoritiresGenre

                registerBinding.infoTextView.text = info

            } else {
                Toast.makeText(this,"Las contraseñlas no son iguales", Toast.LENGTH_LONG).show()
            }
        }
    }

}