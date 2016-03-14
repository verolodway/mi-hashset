
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    private ArrayListInt elementos;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        elementos = new ArrayListInt();
    }
    
    /**
     * Método que añade un elemento al conjunto si no estaba.
     * Devuelve verdadero en caso de que el elemento no estuviera presente y falso en el caso contrario.
     */
    public boolean add(int elemento){
        boolean presente = true;
        if(elementos.contains(elemento)){
            presente = false;
        }
        elementos.add(elemento);
        return presente;
    }
    
    /**
     * Método que nos permite vaciar el conjunto. 
     */
    public void clear(){
        elementos = new ArrayListInt();
    }
    
    /** 
    * Devuelve true si el conjunto contiene el elemento dado.
    */
    public boolean contains(int elemento)   
    {
      return elementos.contains(elemento);    
    }
    
    /**
    * Devuelve true si el conjunto está vacío
    */
  
    public boolean isEmpty()
    {
      return elementos.size() == 0;
    }
    
    /**
    * Devuelve el número de elementos del conjunto.    
    */
    public int size()
    {
        return elementos.size();
    }
    
    /**
    * Método que elimina del conjunto el elemento dado. 
    * Si no existiera devuelve falso; si existía en el conjunto devuelve verdadero.
    */
    public boolean remove(int elemento)
    {
       boolean existe = false;
       if(elementos.contains(elemento))
       { 
            elementos.remove(elemento);
            existe = true;
        }
       return existe;
    }
    
    /**
     * Método que devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes.
     */
    public String toString(){
        String lista = null;
        for (int i = 0; i < elementos.size(); i++){
            lista += ("["+ elementos.get(i) + "]" + ", ");
        }
        return lista;
    }
}
