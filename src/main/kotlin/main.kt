
class Persona (val nombre: String, var edad: Int, private val dni: String) // Las propiedades son publicas por defecto, pero podemos crearlas privadas

fun main(){

    //Creamos objetos de la clase persona
    val persona1 = Persona("Javi",20, "555555555Q") //Objeto 1
    val persona2 = Persona("Alex",22, "33333333Z") //Objeto 2
    val persona3 = Persona("Laia",19, "888888888P") //Objeto 3

    //Acedemos a las propiedades
    println("El nombre de persona1 es: ${persona1.nombre}")
    println("La edad de persona1 es: ${persona1.nombre}")
    //println("El DNI de persona1 es: ${persona1.dni}"). Esto no funciona por que la propiedad DNI es privada, por lo tanto no nos deja acceder a ella

    val alumno = Alumno("Juan",17)
    println("\nNombre alumno ${alumno.nombre} \nEdad alumno ${alumno.edad}")

    val coche = Coche() //Aqui no hace falta definir el valor de las variables
    println("\nPuertas del coche: ${coche.numeroPuertas} \nmarca coche ${coche.marca}")

    val colegio = Colegio("Colegio Afuera", 345)
    println("\nNombre del Colegio: ${coche.numeroPuertas} \nNumero de alumnos: ${colegio.numeroAlumnos}")

    val usuario = Usuario("User1","ABC.,")
    println("\nNombre de Usuario: ${usuario.usuario} \nContraseña: ${usuario.password}")
}

//Constructores
class Alumno constructor(val nombre: String, val edad: Int){

}

class Coche {
    val numeroPuertas: Int
    val marca: String
    /*
    Esta es otra forma de construir un objeto en kotlin. Cuando intentemos ejecutar la clase coche lo primero que se va a ejecutar es el init{}.
    Para definir las variables es necesario poner la variable dentro del init{}
     */
    init {
        numeroPuertas = 4
        marca = "Ford"
    }
}

class coche2{
    val numeroPuertas: Int = 4 //En vez de usar el init{}, definimos el valor de la variable directamente
}

class Colegio{ //Esta forma es bastante similar a Java
    val nombre :String
    var numeroAlumnos: Int
    constructor(nombre: String, numeroAlumnos: Int){ // Con constructor indicamos que esta es la constructora de la clase colegio
        this.nombre = nombre
        this.numeroAlumnos = numeroAlumnos
    }
}

class Usuario {
    var usuario: String
    var password: String
    constructor(password: String){
        this.usuario = ""
        this.password = password
    }
    constructor(usuario: String, password: String): this(password){
        this.usuario = usuario
    }
}

