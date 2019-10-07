package concot

class Moeda {
    String nome
    String simbolo
    static constraints = {
    nome nullable:false, blank:false, maxSixe:64
    simbolo nullable:false, blank:false, maxSixe:128, unique:true
    }
}
