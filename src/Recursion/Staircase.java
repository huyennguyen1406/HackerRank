package Recursion;

public class Staircase {
    public static void staircase(int n) {
        // Write your code here
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if(j < n - 1 - i) {
        //             System.out.print(" ");
        //         } else {
        //             System.out.print("#");
        //         }
        //     }
        //     System.out.println("");
        // }
        print(n, 1);
    }

    private static void print(int n, int current_row)
    {
        if (current_row == n + 1)
        {
            return;
        }
        int nSpace = n - current_row;
        int nHashtag = n - nSpace;
        for (int i = 0; i < nSpace; ++i)
        {
            System.out.print(" ");
        }
        for (int i = 0; i < nHashtag; ++i)
        {
            System.out.print("#");
        }
        System.out.print("\n");
        print(n, current_row + 1);
    }
}
