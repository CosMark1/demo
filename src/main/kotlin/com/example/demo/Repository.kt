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

            Preguntas("Pregunta 1","Capital de España","Madrid","Paris","Bélgica","Atenas"),
            Preguntas("Pregunta 2","Capital de Francia","Moscú","Paris","Bucarest", "Lisboa"),
            Preguntas("Pregunta 3","Capital de Alemania","Bélgica","Moscú" , "Washington D.C" ,"Tokio"),
            Preguntas("Pregunta 4","Capital de Rusia","Moscú" , "Atenas" , "Pekín" ,"Tokio"),
            Preguntas("Pregunta 5","Capital de Grecia","Atenas" , "Lisboa" , "Washington D.C" ,"Madrid"),
            Preguntas("Pregunta 6","Capital de EEUU","Washington D.C" , "Bucarest" , "Lisboa" , "Pekin"),
            Preguntas("Pregunta 7","Capital de Portugal","Lisboa" , "Bélgica" , "Paris" , "Washington D.C"),
            Preguntas("Pregunta 8","Capital de Japón","Tokio", "Paris" , "Washington D.C" , "lisboa"),
            Preguntas("Pregunta 9","Capital de China","Paris" , "Pekín" , "Bélgica" ,"Bucarest"),
            Preguntas("Pregunta 10","Capital de Rumania","Paris" , "Washington D.C" , "Bucarest" , "Atenas")
        )
    }
}