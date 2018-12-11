
package championchess.Players;


public class Amateur extends Player {
 
    public final String playerLevel = "Amateur";
    
    public Amateur(String name,int age){
        this.setName(name);
        this.setAge(age);
        this.setPlayerCategory(playerLevel);

    }
    
    
}
