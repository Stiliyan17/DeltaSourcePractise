package herogame;

public class Hero {

    protected int attackPoints;
    protected int defencePoints;
    protected int healthPoints;

    public Hero(int attackPoints, int defencePoints, int healthPoints) {
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.healthPoints = healthPoints;
    }

    public int getattackPoints() {
        return attackPoints;
    }

    public void setattackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getdefencePoints() {
        return defencePoints;
    }

    public void setdefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public int gethealthPoints() {
        return healthPoints;
    }

    public void sethealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public int attack() {
        return attackPoints;
    }
     public int defendce3(int attackDmg){
        return defencePoints;
     }
     public void updateHP(int healthPoints){
        sethealthPoints(Math.max(healthPoints,0));
     }
}




