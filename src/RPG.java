public class RPG {
    class hero {
        int attack; // атака
        int health; // здоровье
        int ultimateAttack; // супер удар

        public hero(int attack, int health, int ultimateAttack) {
            this.attack = attack;
            this.health = health;
            this.ultimateAttack = ultimateAttack;
        }
    }
    class boss{
        private int attack;// атака
        private int health; // здоровье
        private int defense; // супер удар

        public void method(){

        }


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
    }
}

