
public class Lista {
    Nodo inicio;
    int tamaño;
    int raiz;

    public int getRaiz() {
        return raiz;
    }

    public void setRaiz(int raiz) {
        this.raiz = raiz;
    }

    public Lista() {//constructor
        
        this.inicio=null;
        this.tamaño=0;
        this.raiz=0;
        
    }
    
    //METODO QUE VALIDA SI LA LISTA ESTA VACIA
    public boolean esvacialalista(){                   
        return inicio==null;              
    }
    
    
    public void agregarnodoalfinaldelalista(int valordelnodo){
        
        Nodo nodonuevo=new Nodo();//instancia de in nuevonodo
        
        nodonuevo.setValor(valordelnodo);
        
        if(esvacialalista()==true){
            inicio=nodonuevo;            
        }else{
            
            Nodo aux=inicio;
             
            while(aux.getSig()!=null){
                aux=aux.getSig();
            }
            
            aux.setSig(nodonuevo);                        
        }
        
        tamaño++;
        
    }    
    
    public void agregaralinicio(int valor){
        
        Nodo nodonew=new Nodo();        
        nodonew.setValor(valor);
        
        if(esvacialalista()){
            inicio=nodonew;
        }else{
            
           nodonew.setSig(inicio);
           inicio=nodonew;            
        }
        tamaño++;
    }
    
    public void mostraslalista(){
                
        Nodo aux=inicio;
        
        String  mostrar="";
        
        while(aux !=null){
            mostrar+=aux.getValor()+"->";
            
            aux=aux.getSig();
        }  
        System.out.println(mostrar+"null");
    }   
    
    public void eliminar(int valor){
        
        Nodo aux=inicio;
        
        Nodo aux2=inicio;
        
        while(aux !=null){        
                                    
                if(aux.getValor()==valor){
                    
                    if(aux==inicio){
                        //System.out.println("puedes eliminar el de el inicio ");                           
                        inicio=aux.getSig();                        
                    }else{
                        aux2.setSig(aux.getSig());
//                        aux.setSig(aux.getSig().getSig());
                        //System.out.println("valor de auxiliar dos "+aux2.getValor());
                        //System.out.println("puedes eliminar uno que o esta en el inicio "+aux.getValor());   
                    }                    
                }
                
                
                aux2=aux;
                aux=aux.getSig();
                
                
        }  
        tamaño--;
    }       
    public void buscar(int valorbuscar){
        Nodo aux=inicio;        
        boolean estaelvalorenlalista=false;        
        while(aux !=null){                                    
                if(aux.getValor()==valorbuscar){                   
                    estaelvalorenlalista=true;                    
                    break;
                }                  
                aux=aux.getSig();                
        } 
        
        if(estaelvalorenlalista==true)System.out.println("EL valor "+valorbuscar+" si se encuenta en la lista");                    
        else System.out.println("el valor "+valorbuscar+" no esta el la lista");
    }
    
    
    
    public void raiz(int valoraingresar){
         Nodo nodonew=new Nodo();
         nodonew.setValor(valoraingresar);
              
         //Nodo raiz=new Nodo();
         //raiz.setValor(5);
         
         if(esvacialalista()){
              inicio=nodonew;              
              
         }else{   
             Nodo aux=inicio;                         
             
            if(nodonew.getValor()>raiz){
                
                //CODIGO SI EL NODO A INGRESAR ES MAYOR QUE EL RAIZ 
                
                  while(aux.getSig()!=null){                   
                      aux=aux.getSig();
                  }                  
                  aux.setSig(nodonew);             
            }else{           
                  nodonew.setSig(inicio);
                  inicio=nodonew;                        
            }
         }
         tamaño++;
         
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
            
}
