import java.util.Scanner;

public class Homework6 {
    private static int inputNum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return scan.nextInt();
    }
//----------------First Problem-------------------
    private static void firstProblem(){
        System.out.println("-----------First Problem----------");
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Average of the array is " + countAvarage(arr) + ".");
    }
//-------------Count average(1 problem)--------
    private static int countAvarage(int[] a){
        int res = 0;
        for (int i = 0; i < a.length; i++)
            res += a[i];

        return res/a.length;
    }
//----------------Second Problem-------------------
    private static void secondProblem(){
        System.out.println("-----------Second Problem----------");
        int[] a = {34, 221, 23, 43};
        int toFind = inputNum();
        System.out.println("findIndex({34, 221, 23, 43}, "  + toFind + ") -> " + findIndex(a, toFind) + ".");

    }
    private static int findIndex(int[] a, int toFind){
        for (int i = 0; i < a.length; i++)
            if(a[i] == toFind)
                    toFind = i;
        return toFind;
    }
//----------------Third Problem-------------------
    private static void thirdProblem(){
        System.out.println("-----------Third Problem----------");
        int[] arr = {100, 200, 300, 400, 500};
        System.out.println("Minimum element of the array is " + min(arr) + ".");
    }
//------------Find min(3 problem)-----------------
    private static int min(int[] a){
        int min = a[0];
        for(int i = 0; i < a.length; i++)
            if(a[i] < min){
                min = a[i];
            }
        return min;
    }
//----------------Fourth Problem-------------------
    private static void fourthProblem(){
        System.out.println("-----------Fourth Problem----------");
        int[] arr2 = {100, 200, 300, 400, 500};
        System.out.println("Maximum element of the array is " + max(arr2) + ".");
    }
//------------Find max(4 problem)-----------------
    private static int max(int[] a){
        int max = a[0];
        for(int i = 0; i < a.length; i++)
            if(a[i] > max){
                max = a[i];
            } return max;
    }
    public static void main(String[] args) {
        firstProblem();
        System.out.println();
        secondProblem();
        System.out.println();
        thirdProblem();
        System.out.println();
        fourthProblem();
    }
}
