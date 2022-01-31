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
            Preguntas("Capital de España","Madrid - Paris - Bélgica - Atenas"),
            Preguntas("Capital de Francia","Moscú - Paris - Bucarest - Lisboa"),
            Preguntas("Capital de Alemania","Bélgica - Moscú - Washington D.C - Tokio"),
            Preguntas("Capital de Rusia","Moscú - Atenas - Pekín - Bucarest"),
            Preguntas("Capital de Grecia","Atenas - Lisboa - Washington D.C - Madrid"),
            Preguntas("Capital de EEUU","Washington D.C - Bucarest - Lisboa - Pekin"),
            Preguntas("Capital de Portugal","Lisboa - Bélgica - Paris - Washington D.C"),
            Preguntas("Capital de Japón","Tokio - Paris - Washington D.C - lisboa"),
            Preguntas("Capital de China","Paris - Pekín - Bélgica - Bucarest"),
            Preguntas("Capital de Rumania","Paris - Washington D.C - Bucarest - Atenas")
        )
    }
}