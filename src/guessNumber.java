import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a guess number game, try to find the correct number");
        System.out.println("Enter number of digits: ");
        int number3;
        int number4;
        int guess3 = 0;
        int guess4 = 0;
        int digit = input.nextInt();


        switch (digit) {
            case 3:
                while (true) {
                    number3 = (int) (Math.random() * 900 + 100);
                    int Number3Digit3 = number3 % 10;
                    int Number3Digit2 = number3 / 10 % 10;
                    int Number3Digit1 = number3 / 100;
                    if (Number3Digit1 == Number3Digit2 || Number3Digit1 == Number3Digit3 || Number3Digit2 == Number3Digit3) {
                        continue;
                    }


                    System.out.println("Enter your guess ");
                    while (guess3 != number3) {
                        guess3 = input.nextInt();
                        int guess3Digit3 = guess3 % 10;
                        int guess3Digit2 = guess3 / 10 % 10;
                        int guess3Digit1 = guess3 / 100;

                        if (guess3Digit1 == Number3Digit1 && guess3Digit2 == Number3Digit2 && guess3Digit3 == Number3Digit3) {
                            System.out.println("You found the correct number. ");
                            break;
                        }
                        if (guess3Digit1 == Number3Digit1 || guess3Digit2 == Number3Digit1 || guess3Digit3 == Number3Digit1 ||
                                guess3Digit2 == Number3Digit2 || guess3Digit1 == Number3Digit2 || guess3Digit3 == Number3Digit2 ||
                                guess3Digit3 == Number3Digit3 || guess3Digit1 == Number3Digit3 || guess3Digit2 == Number3Digit3 ) {
                            if (guess3Digit1 == Number3Digit1) {
                                System.out.print("+");
                            } else if (guess3Digit2 == Number3Digit1 || guess3Digit3 == Number3Digit1) {
                                System.out.print("-");

                            }
                            if (guess3Digit2 == Number3Digit2) {
                                System.out.print("+");
                            } else if (guess3Digit1 == Number3Digit2 || guess3Digit3 == Number3Digit2) {
                                System.out.print("-");

                            }
                            if (guess3Digit3 == Number3Digit3) {
                                System.out.println("+");
                            } else if (guess3Digit1 == Number3Digit3 || guess3Digit2 == Number3Digit3) {
                                System.out.println("-");
                            }
                        }else{
                            System.out.println("No match !!!!!");
                            System.out.println("Please try again ");
                        }
                        System.out.println();
                    }
                    break;
                }

            case 4:
                if (digit == 4){
                    while (true) {
                        number4 = (int) (Math.random() * 9000 + 1000);
                        int Number4Digit4 = number4 % 10;
                        int Number4Digit3 = number4 / 10 % 10;
                        int Number4Digit2 = number4 / 100 % 10;
                        int Number4Digit1 = number4 / 1000;
                        if (Number4Digit1 == Number4Digit2 || Number4Digit1 == Number4Digit3 || Number4Digit1 == Number4Digit4 ||
                                Number4Digit2 == Number4Digit3 || Number4Digit2 == Number4Digit4 || Number4Digit3 == Number4Digit4) {
                            continue;
                        }
                        System.out.println("Enter your guess");
                        while (number4 != guess4) {
                            guess4 = input.nextInt();
                            int guess4Digit4 = guess4 % 10;
                            int guess4Digit3 = guess4 / 10 % 10;
                            int guess4Digit2 = guess4 / 100 % 10;
                            int guess4Digit1 = guess4 / 1000;
                            if (guess4Digit1 == Number4Digit1 && guess4Digit2 == Number4Digit2 &&
                                    guess4Digit3 == Number4Digit3 && guess4Digit4 == Number4Digit4) {
                                System.out.println("You found the number !!  ");
                                break;

                            }
                            if (guess4Digit1 == Number4Digit1) {
                                System.out.print("+");
                            } else if (Number4Digit1 == guess4Digit2 || Number4Digit1 == guess4Digit3 || Number4Digit1 == guess4Digit4) {
                                System.out.print("-");
                            }
                            if (guess4Digit2 == Number4Digit2) {
                                System.out.print("+");
                            } else if (Number4Digit2 == guess4Digit1 || Number4Digit2 == guess4Digit3 || Number4Digit2 == guess4Digit4) {
                                System.out.print("-");
                            }
                            if (guess4Digit3 == Number4Digit3) {
                                System.out.print("+");
                            } else if (Number4Digit3 == guess4Digit1 || Number4Digit3 == guess4Digit2 || Number4Digit3 == guess4Digit4) {
                                System.out.print("-");
                            }
                            if (guess4Digit4 == Number4Digit4) {
                                System.out.println("+");
                            } else if (Number4Digit4 == guess4Digit1 || Number4Digit4 == guess4Digit2 || Number4Digit4 == guess4Digit3) {
                                System.out.println("-");
                            }

                            if (Number4Digit1 != guess4Digit1 && Number4Digit2 != guess4Digit2 &&
                                    Number4Digit3 != guess4Digit3 ) {
                                System.out.println("No match !!  ");
                            }
                        }
                        break;
                    }
                }
        }
    }


}
