package org.example

class Estudiante(nombre: String, id: String, edad: Int, val curso: String, val calificacionPromedio: Double): Persona(nombre, id, edad) {
    override fun mostrarRol() {
        println("Rol: Alumno")
    }

    fun mostrarCalificacion(){
        println("La media de $nombre es: ${"%.2f".format(calificacionPromedio)}")
    }
}