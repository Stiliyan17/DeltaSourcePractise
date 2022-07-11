package herogame;

public class Assasin extends Hero {
    public Assasin(int attackPoints, int defencePoints, int healthPoints) {
        super(attackPoints, defencePoints, healthPoints);
    }

    public int attack() {
        return attackPoints * 4;
    }
}
