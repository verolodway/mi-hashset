
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
}
