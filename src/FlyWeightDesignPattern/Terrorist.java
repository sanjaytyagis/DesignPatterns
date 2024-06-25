package FlyWeightDesignPattern;

public class Terrorist implements Player{

	// Intrinsic Attribute that don't change
	private final String TASK;
	  
    // Extrinsic Attribute that change 
    private String weapon;
  
    public Terrorist()
    {
        TASK = "PLANT A BOMB";
    }
    public void assignWeapon(String weapon)
    {
        // Assign a weapon
        this.weapon = weapon;
    }
    public void mission()
    {
        //Work on the Mission
        System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
    
}
