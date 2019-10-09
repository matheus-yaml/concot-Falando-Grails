package concot

class Categoria {

    String nome

    static constraints = {
	nome nullable: false, blank: false, maxsize: 128, unique: true
    }
}
