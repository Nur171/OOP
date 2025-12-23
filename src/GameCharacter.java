import java.util.Random;
public class GameCharacter {
    private int characterId;
    private String name;
    private int level;
    private int health;
    private static int totalCharacters = 0;

    public GameCharacter(String name, int level, int health){
        this.name = name;
        this.level = level;
        this.health = health;
        totalCharacters++;
        Random number = new Random();
        this.characterId = 1000 + number.nextInt(9000);
    }

    public int getCharacterId(){
        return characterId;
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

    public int getHealth(){
        return health;
    }

    public static int getTotalCharacters(){
        return totalCharacters;
    }

    public void takeDamage(int damage){
        if (health >= 0){
            health = 0;
        }else{
        health -= damage;
        }
    }

    public void heal(int amount){
        health += amount;
    }

    public String getInfo(){
        return  "Name: " + name +
                "\nCharacter ID: "  + characterId +
                "\nLevel: " + level +
                "\nHealth: " + health +
                "\nTotal Characters: " + totalCharacters;
    }


}
