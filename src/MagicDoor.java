public class MagicDoor {


        public Hero[] generateHeroes () {
            Hero[] playerArr = new Hero[4];
            Hero warrior = new Hero(200, 100,200);
            playerArr[0] = warrior;

            Hero magic = new Hero(500,300,100);
            playerArr[1] = magic;

            Hero mental = new Hero(200,100,300);
            playerArr[2] = mental;

            Hero medic = new Hero(150,100,120);
            playerArr[3] = medic;

            return playerArr;


        }
    }

