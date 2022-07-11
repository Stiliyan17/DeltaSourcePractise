package herogame;

 public class Tanks extends Hero{
    public Tanks(int attackPoints, int defencePoints, int healthPoints){

        super(attackPoints,defencePoints,healthPoints);
    }
     public int attack() {
         return (int) ( attackPoints * 1.5);
     }
     public int defend(int attack){
        return  (int) (defencePoints + attack /2);
     }


}

