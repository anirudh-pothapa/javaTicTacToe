import java.util.Scanner;

import java.util.Random;

class drawboard { // drawing the tic-tac-toe board.

    public void draw(char[] arr) {

        System.out.println(arr[0] + "  |    " + arr[1] + "     |" + arr[2]);
        System.out.println("__________________");
        System.out.println(arr[3] + "  |    " + arr[4] + "     |" + arr[5]);
        System.out.println("__________________");
        System.out.println(arr[6] + "  |    " + arr[7] + "     |" + arr[8]);

    }

}

// user input
// class user {
// Scanner scanner = new Scanner(System.in);

// int number;
// public int call(char arr[]) {
// do {
// System.out.println("Give your Input to Place X at desired position ");
// number = scanner.nextInt();
// } while (arr [number] ==' '); // >9 so 9 is accepted

// return number;

// }
// }

// computer output

class compout {
    public void compmove(char[] arr) {

        Random random = new Random();
        int somenumber = random.nextInt(9); // gives numbers from 0 to 8
        System.out.println(somenumber);

        while (true) {

            // somenumber = random.nextInt(9); // gives numbers from 0 to 8
            // System.out.println(somenumber);
            if (arr[somenumber] == ' ')

            {
                arr[somenumber] = 'O';
                break;

            } else if (arr[somenumber] != ' ') {

                while (arr[somenumber] != ' ') {
                    somenumber = random.nextInt(9); // gives numbers from 0 to 8
                    System.out.println(somenumber);
                    break;
                }
            }
        }

    }
}

// placing user input
// class placinguser {
// // Scanner scanner = new Scanner(System.in);

// public void userinputs(char[] arr, int number) {

// while (number <= 9 || number > 0) {

// if (arr[number] == ' ') {
// arr[number] = 'X';
// break;

// }

// }
// }
// }

// user input number less than 9 and greater than 0 ad also arr[number] ==' '
class user {
    Scanner sc = new Scanner(System.in);

    public int user1() {
        System.out.println("Enter a number between 1 and 9");
        int number = sc.nextInt();

        while (number > 9 || number < 0) {
            System.out.println("Enter a num between 1 and 9");
            number = sc.nextInt();
        }
        return number;

    }
}

// placing 'X' on board
class placing {
    public void insert(char[] arr, int number) {
        Scanner scanner = new Scanner(System.in);

        while (arr[number] != ' ') {
            System.out.println("INVALID! ENter a number that is empty on board ");

            number = scanner.nextInt();
            number = number - 1;

        }

        arr[number] = 'X';

    }
}

// check winner
class checkwinner {
    public boolean winner(char[] arr) {

        if ((arr[0] != ' ') && (arr[0] == arr[1]) && (arr[1] == arr[2])) {
            if (arr[0] == 'X') {
                System.out.println("X is the winner");

            } else if (arr[0] == 'O') {
                System.out.println("O is the winner");
            }
            return true;
        }

        else if ((arr[3] != ' ') && (arr[3] == arr[4]) && (arr[4] == arr[5])) {
            if (arr[3] == 'X') {
                System.out.println("X is the winner");
            } else if (arr[3] == 'O') {
                System.out.println("O is the winner");
            }
            return true;

        } else if ((arr[6] != ' ') && (arr[6] == arr[7]) && (arr[7] == arr[8])) {
            if (arr[6] == 'X') {
                System.out.println("X is the winner");
            } else if (arr[6] == 'O') {
                System.out.println("O is the winner");
            }
            return true;

        }

        else if ((arr[0] != ' ') && (arr[0] == arr[3]) && (arr[3] == arr[6])) {
            if (arr[0] == 'X') {
                System.out.println("X is the winner");
            } else if (arr[0] == 'O') {
                System.out.println("O is the winner");
            }
            return true;
        }

        else if ((arr[1] != ' ') && (arr[1] == arr[4]) && (arr[4] == arr[7])) {
            if (arr[1] == 'X') {
                System.out.println("X is the winner");
            } else if (arr[1] == 'O') {
                System.out.println("O is the winner");
            }
            return true;
        }

        else if ((arr[2] != ' ') && (arr[2] == arr[5]) && (arr[5] == arr[8])) {
            if (arr[2] == 'X')// player?std::cout<<"you won\n" : std::cout<<"computer won\n ";
            {
                System.out.println("X is the winner");
            }

            else if (arr[2] == 'O') {
                System.out.println("O is the winner");
            }
            return true;

        }

        else if ((arr[0] != ' ') && (arr[0] == arr[4]) && (arr[4] == arr[8])) {
            if (arr[0] == 'X') {
                System.out.println("X is the winner");
            }

            else if (arr[0] == 'O') {
                System.out.println("O is the winner");
            }
            return true;

        } else if ((arr[2] != ' ') && (arr[2] == arr[4]) && (arr[4] == arr[6])) {
            if (arr[2] == 'X') {
                System.out.println("X is the winner");
            } else if (arr[2] == 'O') {
                System.out.println("O is the winner");
            }
            return true;
        }

        else {
            return false;
        }

    }

}

public class javagame {
    public static void main(String[] args) {
        boolean running = true;

        char arr[] = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
        drawboard d1 = new drawboard();
        d1.draw(arr);// ---draw board

        while (running == true) {

            // }

            // --user input call
            // user u1 = new user();
            // int userin = u1.call(arr);
            // userin = userin - 1;
            // System.out.println(userin);

            // placinguser pluser = new placinguser();
            // pluser.userinputs(arr, userin);

            user up = new user();
            // System.out.println(up.inp()+"te");
            int r = up.user1();
            r = r - 1;
            // System.out.println("Hello World"+r);

            // placing
            placing p = new placing();
            p.insert(arr, r);

            d1.draw(arr);// ---draw board
            System.out.println("#####################################");

            checkwinner ckwinner = new checkwinner();

            if (ckwinner.winner(arr) == true) {
                running = false;
                ckwinner.winner(arr);
                break;
            }

            if (arr[0] != ' ' && arr[1] != ' ' && arr[2] != ' ' &&
                    arr[3] != ' ' && arr[4] != ' ' && arr[5] != ' ' &&
                    arr[6] != ' ' && arr[7] != ' ' && arr[8] != ' ') {

                System.out.println("It's a TIE");
                running = false;
                break;
            }

            // computer output
            compout c = new compout();
            c.compmove(arr);
            System.out.println("#####################################");
            d1.draw(arr);// ---draw board

            if (ckwinner.winner(arr) == true) {
                running = false;
                ckwinner.winner(arr);
                break;
            }

            if (arr[0] != ' ' && arr[1] != ' ' && arr[2] != ' ' &&
                    arr[3] != ' ' && arr[4] != ' ' && arr[5] != ' ' &&
                    arr[6] != ' ' && arr[7] != ' ' && arr[8] != ' ') {
                System.out.println("It's a TIE");
                running = false;
                break;
            }

            // if (store.equals("Tie")) {
            // System.out.println("It's a TIE");
            // running = false;
            // break;
            // }

        }
        System.out.println("game over");
    }
}