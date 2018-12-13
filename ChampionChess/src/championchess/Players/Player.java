
package championchess.Players;


public  abstract class  Player {
    private String name;
    private int age;
    private String playerCategory;
    

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPlayerCategory(String playerCategory){
        this.playerCategory=playerCategory;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public String getPlayerCategory(){
        return playerCategory;
    }
}
