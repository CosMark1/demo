package com.example.demo

import com.google.gson.Gson

data class Preguntas (var pregunta :String, var respuestas:String){

    override  fun toString() : String{
        val gson = Gson()
        return gson.toJson(this)
    }
}