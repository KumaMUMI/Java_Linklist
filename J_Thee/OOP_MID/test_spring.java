
import java.util.Scanner;
public class test_spring {
    public static void main(String[] args) {
        //กำหนดตัวแปล spi 
        determination spi = new determination("ONE", 10.0, 5.0);
        //สร้างเมดทอดเพื่อรับค่าจากคีย์บอร์ด
        Scanner keyboard = new Scanner(System.in);
        //รับค่าต่างๆจากคีย์บอร์ด
        System.out.print("Set K:");
        Double K = keyboard.nextDouble();
        System.out.print("Set S:");
        Double S = keyboard.nextDouble();
        System.out.print("Set Name:");
        String Name = keyboard.next();

        spi.setK(K);
        spi.setS(S);
        spi.setName(Name);
        spi.springDetermination();

        System.out.println(spi);
    }
    
}
