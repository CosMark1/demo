package com.example.demo

class Repository {
    companion object {
        var listaRespuestas = listOf(

            Respuestas("Madrid"),
            Respuestas( "Paris"),
            Respuestas("Bélgica"),
            Respuestas("Moscú"),
            Respuestas("Atenas"),
            Respuestas("Washington D.C"),
            Respuestas("Lisboa"),
            Respuestas("Tokio"),
            Respuestas( "Pekín"),
            Respuestas("Bucarest")
        )
        var listaPreguntas = listOf(

            Preguntas(0,"Capital de España","Madrid","Paris","Bélgica","Atenas"),
            Preguntas(1,"Capital de Francia","Moscú","Paris","Bucarest", "Lisboa"),
            Preguntas(2,"Capital de Alemania","Bélgica","Moscú" , "Washington D.C" ,"Tokio"),
            Preguntas(3,"Capital de Rusia","Moscú" , "Atenas" , "Pekín" ,"Tokio"),
            Preguntas(4,"Capital de Grecia","Atenas" , "Lisboa" , "Washington D.C" ,"Madrid"),
            Preguntas(5,"Capital de EEUU","Washington D.C" , "Bucarest" , "Lisboa" , "Pekin"),
            Preguntas(6,"Capital de Portugal","Lisboa" , "Bélgica" , "Paris" , "Washington D.C"),
            Preguntas(7,"Capital de Japón","Tokio", "Paris" , "Washington D.C" , "lisboa"),
            Preguntas(8,"Capital de China","Paris" , "Pekín" , "Bélgica" ,"Bucarest"),
            Preguntas(9,"Capital de Rumania","Paris" , "Washington D.C" , "Bucarest" , "Atenas")
        )
    }
}