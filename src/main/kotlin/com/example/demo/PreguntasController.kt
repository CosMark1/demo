package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PreguntasController {

    @GetMapping("Pregunta")
    fun enviarPregunta() : List<Preguntas> {
        println("Me han dicho algo")
        return PreguntasRepository.listaPreguntas
    }
    @GetMapping("Pregunta{id}")
    fun enviarPregunta(@PathVariable id: Int) : String {
        if (id < PreguntasRepository.listaPreguntas.size)
            return PreguntasRepository.listaPreguntas[id].toString()
        else
            return "Esta Pregunta no existe "
    }
    @GetMapping("Pregunta{id}/{respuesta}")
    fun enviarRespuesta(@PathVariable id: Int, @PathVariable respuestas: Respuestas ) : String {
        if (respuestas == RespuestasRepository.listaRespuestas[id])
            return "Esta Respuesta es correcta "
        else
            return "Esta Respuesta es incorrecta "
    }
}