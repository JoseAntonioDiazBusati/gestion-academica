package org.example

abstract class Persona(val nombre: String, val id: String, edad: Int) {
     open fun mostrarRol(){}
}