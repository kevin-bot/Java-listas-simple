
public class Nodo {
    Nodo sig;//sigueinte es un puntero
    int valor;

    public Nodo(){//constructor de un nodo
       
        this.sig=null;
        this.valor=0;
        
    }
        

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }  
    
}
