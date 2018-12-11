
package championchess.Players;


public class Professional extends Player {
    
    public final String playerLevel = "Professional";
    
    public Professional(String name,int age){
        this.setName(name);
        this.setAge(age);
        this.setPlayerCategory(playerLevel);
    }
    
}
