package main;
public class BreakContinueExample {
    public static void main(String args[]){
        int reg_no[] = {11, 23, 15, 16, 19, 99, 103};
        
        for(int i = 0; i < reg_no.length; i++){
            System.out.println("Index: " + i + " Value: " + reg_no[i]);
            if(i == 5 && reg_no[i] == 99){
                System.out.println("I am being skipped!!!");
                continue;
//                System.out.println("Skipped!!");
            }
            System.out.println("Index: " + i + " Value: " + reg_no[i]);
        }
    }
}
