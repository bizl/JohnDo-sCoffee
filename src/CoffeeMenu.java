 
import java.util.LinkedList; 
import java.util.List;

public class CoffeeMenu {
    private List<CoffeeMenu> subMenus = new LinkedList<CoffeeMenu>();
    private CoffeeMenu child = null;
    private String data;
    private int userSelection;
    private String[] values;

    public CoffeeMenu(String data, CoffeeMenu parent, String[] possibleValues) {
        this.data = data;
        this.child = parent;
        this.values =  possibleValues;
    }
    
    public void SetUserSelection (int selection) {
    	userSelection = selection;
    }
    
    public String GetUserSelection ()
    {
      String d ="";
      try{
    	  d = values[userSelection-1];
    	  return d;
      }
      catch(Exception ex){
    	  return "Please enter a valid selection"; 
      }
    }
    
    public String Data(){
    	return this.data;	
    }
    
    public CoffeeMenu Child(){
    	return this.child;	
    }
  
    
}