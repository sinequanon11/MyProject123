package z_Java_InterviewQA;

public class OddAndEvenNumbers {

    public static void main(String[] args) {

        // EXTRACT ODD AND EVEN NUMBERS IN AN ARRAY *********

        int [] a = {1,2,3,4,5,6,7,8,9,10,21,22,45,65,78,88,99};

        // EXTRACTING EVEN NUMBERS

        System.out.print("Even numbers in array: ");

        for (int i=0 ; i<a.length ; i++){
            if (a[i]%2 == 0)
                System.out.print(a[i] + ", ");
        }

        // EXTRACTING ODD NUMBERS

        System.out.print("\nOdd numbers in array: ");

        for (int i=0 ; i<a.length ; i++){
            if (a[i]%2 != 0)                    // OR  if (a[i]%2 == 1)
                System.out.print(a[i] + ", ");
        }
    }

}
