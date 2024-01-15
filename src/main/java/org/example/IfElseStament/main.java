package org.example.IfElseStament;

public class main {
    public static void main(String[] args) {
        loopExample7();
//        System.out.println("test2");


        //==============================================================================
//        if (methodWithReturnFalse()) {
//            System.out.println("This won't be printed because method returned false.");
//        } else {
//            System.out.println("Method returned false.");
//        }
        //==============================================================================
//        if (methodWithReturnTrue()) {
//            System.out.println("Method returned true.");
//        } else {
//            System.out.println("This won't be printed because method returned true.");
//        }
        //==============================================================================

    }

    public static void loopExample1() {
        //if the loop encounters i == 3, the return statement will exit the entire method immediately.
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("test");
    }

    public static void loopExample2() {
        /*If the loop encounters i == 3, the break statement will exit the loop,
            and the program will continue with the code after the loop.
         */
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("test");

    }

    public static void loopExample3() {
        /*when i == 3, the continue statement will skip the rest of the code inside the loop for that iteration
            and move to the next iteration.
         */
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void loopExample4() {
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void loopExample5() {
        //fall-through
        int value = 2;

        if (value == 1) {
            System.out.println("Case 1");
            return;
        }

        if (value == 2) {
            System.out.println("Case 2");
        }

        if (value == 3) {
            System.out.println("Case 3");
        }
        else {
            System.out.println("there are no relavant value");
        }
    }

    public static void loopExample6() {
        int i = 0;

        while (i < 5) {
            System.out.println(i);

            if (i == 2) {
                continue; // Exit the loop when i is 3
            }

            i++;
        }
    }
    public static void loopExample7() {
        int i = 0;

        do {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
            i++;



        } while (i < 5);
    }

    public static boolean methodWithReturnFalse() {
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                return false; // Exit the method with false if i is 3
            }
            System.out.println(i);
        }
        return true; // This won't be reached if i == 3
    }

    public static boolean methodWithReturnTrue() {
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                return true; // Exit the method with true if i is 3
            }
            System.out.println(i);
        }
        return false; // This won't be reached if i == 3
    }
}
