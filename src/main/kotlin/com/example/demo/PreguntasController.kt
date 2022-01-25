package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PreguntasController {

    @GetMapping("Preguntas")
    fun enviarlistaPokemon() : List<Preguntas> {
        println("Me han dicho algo")
        return PreguntasRepository.listaPreguntas
    }
    @GetMapping("Preguntas{id}")
    fun enviarlistaFavoritoPokemon(@PathVariable id: Int) : String {
        if (id < PreguntasRepository.listaPreguntas.size)
            return PreguntasRepository.listaPreguntas[id].toString()
        else
            return "Ese Pokemon no esta "
    }

}