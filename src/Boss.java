import java.util.Random;

public class Boss {
    class boss {
        private int attack;// атака
        private int health; // здоровье
        private int defense; // супер удар



        public int getAttack() {
            return attack;
        }

        public void setAttack(int attack) {
            this.attack = attack;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getDefense() {
            return defense;
        }

        public void setDefense(int defense) {
            this.defense = defense;
        }
        public void changeBossDefence() {
            Random r = new Random();
            int random = r.nextInt(4) + 1;
           defense = defense*random;
        }



    }
}

