package org.example

class Profesor(nombre: String, id: String, edad: Int, val departamento: String, val aniosExperiencias: Int):Persona(nombre, id, edad) {

    override fun mostrarRol() {
        println("Rol: Profesor")
    }

    fun mostrarExperiencia(){
        println("$nombre tiene $aniosExperiencias años siendo profesor")
    }
}