import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    
    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
    	Random rnd = new Random();
    	int random;
    	int count = 1;
    	//int count = 0;
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
            
            			 System.out.println("====================== " + count + " .ROUND ===========");
                         random = rnd.nextInt(2) + 1;
                        
                         if (random  < 2) {
							f2.health = f1.hit(f2);
						} else {
							f1.health = f2.hit(f1);
						}                         
                         if (isWin()){
                             break;
                         }
                         
                         
                         printScore();     			                  				           	        		       
                         count++;
            }
            
        } else {
            System.out.println("Sporcularýn aðýrlýklarý uyuþmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçý Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçý Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}