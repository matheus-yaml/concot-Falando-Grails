package concot

class Item {
    String nome
    static belongdTo = [categoria:Categoria]
    static constraints = {
        nome nullable:false, blank:false, maxSize:128
    }
}
