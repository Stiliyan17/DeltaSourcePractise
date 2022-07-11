package herogame;


    public class myPowerfulHero extends Hero {
        public myPowerfulHero(int attackPoints, int defencePoints, int healthPoints) {
            super(attackPoints, defencePoints, healthPoints);
        }

        public int attack() {
            return attackPoints * 10;

        }
        public int defend(int attack){
            return  (int) (defencePoints + attack /1);
        }
}
