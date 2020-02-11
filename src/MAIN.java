import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList values = new ArrayList();
        while (true) {
            String line = in.nextLine();
            if (line.equals("stop")) break;
            try{
                int x = Integer.parseInt(line);
                values.add(x);
            }catch (NumberFormatException e){
                System.out.println("Introdu un numar te rog:");
                continue;
            }
        }
        int sum=0;
        for (int j = 0; j <values.size() ; j++) {
            sum=sum+ (Integer) values.get(j);
            System.out.println(values.get(j));
        }
        System.out.println(sum);
    }
}
