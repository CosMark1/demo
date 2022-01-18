package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PokemonController {

    @GetMapping("prueba1")
    fun prueba1(){
        println("Me han llamado")
    }

    @GetMapping("getPokemon")
    fun enviarPokemon() : Pokemon {
        println("Me han dicho algo")
        return Pokemon("Pikachu",15)
    }
    @GetMapping("getPokemonIniciales")
    fun enviarlistaPokemon() : List<Pokemon> {
        println("Me han dicho algo")
        return PokemonRepository.listaPokemon
    }
    @GetMapping("seleccionarPokemonFavorito/{id}")
    fun enviarlistaFavoritoPokemon(@PathVariable id: Int) : String {
        if (id < PokemonRepository.listaPokemon.size)
            return PokemonRepository.listaPokemon[id].toString()
        else
            return "Ese Pokemon no esta "
    }

}