
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
}
