package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val alumno = Estudiante("Paco","eemkov123",21,"1º Bachillerato", 2.33)
    alumno.mostrarCalificacion()
    val profesor = Profesor("Diegoool","C4n051b0n",52, "programacion",12)
    profesor.mostrarExperiencia()
}