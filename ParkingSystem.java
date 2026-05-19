import java.util.*;
import java.util.Scanner;
class ParkingSystem {
    int big;
    int medium;
    int small;
    int carType;
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium = medium ;
        this.small=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(big>0){
                big--;
                return true;
                
            }else{
                return false;
            }
        }else if(carType == 2){
            if(medium>0){
                medium--;
                return true;
                
            }else{
                return false;
            }
        }else if(carType == 3){
            if(small>0){
                small--;
                return true;
                
            }else{
                return false;
            }
        }else{
            System.out.println("invalid option");
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int big =sc.nextInt();
        int medium = sc.nextInt();
        int small = sc.nextInt();
        ParkingSystem obj = new ParkingSystem(big,medium,small);
        int carType=sc.nextInt();
        obj.addCar(carType);
    }
}

