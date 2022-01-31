package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class PreguntasController {

    @GetMapping("Pregunta")
    fun enviarPregunta() : String {
        var id = Random.nextInt(Repository.listaPreguntas.size)
        return Repository.listaPreguntas[id].toString()
    }
    @GetMapping("Pregunta{id}/{respuestas}")
    fun enviarRespuesta(@PathVariable id: Int, @PathVariable respuestas: String ) : String {
        if(id < Repository.listaPreguntas.size) {
            if (Repository.listaRespuestas[id].respuesta == respuestas) {
                return "Esta Respuesta es correcta "
            } else
                return "Esta Respuesta es incorrecta "

        }
        return "No hay mas preguntas"
    }
}