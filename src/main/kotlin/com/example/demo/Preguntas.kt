package com.example.demo

import com.google.gson.Gson

data class Preguntas (var Npregunta :String,var pregunta :String, var respuesta1:String, var respuesta2:String, var respuesta3:String, var respuesta4:String){

    override  fun toString() : String{
        val gson = Gson()
        return gson.toJson(this)
    }
}
data class Respuestas (var respuesta :String){

}