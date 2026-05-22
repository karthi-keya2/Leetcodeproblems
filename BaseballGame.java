
import java.util.Scanner;

class BaseballGame {
    public int calcPoints(String[] operations){
        int[] arr = new int[operations.length];
        int top = -1;

        for(String op : operations){
            if(op.equals("C")){
                top--;
            }

            else if(op.equals("D")){
                arr[++top]=2*arr[top-1];
            }
            else if(op.equals("+")){
                arr[++top]=arr[top-1]+arr[top-2];
            }
            else{
                arr[++top]= Integer.parseInt(op);
            }
        }
        int sum=0;
        for(int i=0;i<=top;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] operations = new String[size];

        for(int i=0;i<size;i++){
            operations[i]=sc.next();
        }
        BaseballGame obj = new BaseballGame();
        System.out.println(obj.calcPoints(operations));
    }
}