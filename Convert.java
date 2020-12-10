import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi: ");
        int number = scanner.nextInt();
        if (number >= 0 & number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("fire");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("out of ability");
                    break;

            }
        } else {
            if (number>= 10 & number <20){
                int tens = number % 10;
                switch (tens){
                    case 0:
                        System.out.println("ten");
                        break;
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("Twelve");
                        break;
                    case 3:
                        System.out.println("Thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eightteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                    default:
                        System.out.println("Out of ability");
                        break;
                }
            } else {
                if (number>=20 & number <100){
                    int ones = number % 10 ;
                    int tens = number / 10;
                    String hangchuc = "";
                    String hangdonvi = "";
                    switch (tens) {
                        case 2:
                            System.out.println("Twety");
                            break;
                        case 3:
                            System.out.println("Thirty");
                            break;
                        case 4:
                            System.out.println("Forty");
                            break;
                        case 5:
                            System.out.println("Fifty");
                            break;
                        case 6:
                            System.out.println("Sixty");
                            break;
                        case 7:
                            System.out.println("Seventy");
                            break;
                        case 8:
                            System.out.println("Eighty");
                            break;
                        case 9:
                            System.out.println("Ninety");
                            break;
                    }
                    switch (ones) {
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("fire");
                            break;
                        case 6:
                            System.out.println("six");
                            break;
                        case 7:
                            System.out.println("seven");
                            break;
                        case 8:
                            System.out.println("eight");
                            break;
                        case 9:
                            System.out.println("nine");
                            break;
                    }

                    System.out.println(hangchuc + hangdonvi);
                } else {
                    if (number >= 100 & number <999){
                        int mode1 = number % 100;
                        int ones = mode1 % 10;
                        int tens = mode1 / 10;
                        int hundreds = number /100;
                        String hangdonvi = "";
                        String hangchuc = "";
                        String hangtram ="";
                        switch (hundreds) {
                            case 1:
                                System.out.println("One hundreds");
                                break;
                            case 2:
                                System.out.println("Two hundreds");
                                break;
                            case 3:
                                System.out.println("Three hundreds");
                                break;
                            case 4:
                                System.out.println("Four hundreds");
                                break;
                            case 5:
                                System.out.println("Fine hundreds");
                                break;
                            case 6:
                                System.out.println("Six hundreds");
                                break;
                            case 7:
                                System.out.println("Seven hundreds");
                                break;
                            case 8:
                                System.out.println("Eight hundreds");
                                break;
                            case 9:
                                System.out.println("Nine hundreds");
                                break;
                        }
                        switch (tens) {
                            case 2:
                                System.out.println("Twety");
                                break;
                            case 3:
                                System.out.println("Thirty");
                                break;
                            case 4:
                                System.out.println("Forty");
                                break;
                            case 5:
                                System.out.println("Fifty");
                                break;
                            case 6:
                                System.out.println("Sixty");
                                break;
                            case 7:
                                System.out.println("Seventy");
                                break;
                            case 8:
                                System.out.println("Eighty");
                                break;
                            case 9:
                                System.out.println("Ninety");
                                break;
                        }
                        switch (ones) {
                            case 0:
                                System.out.println("Zero");
                                break;
                            case 1:
                                System.out.println("One");
                                break;
                            case 2:
                                System.out.println("Two");
                                break;
                            case 3:
                                System.out.println("Three");
                                break;
                            case 4:
                                System.out.println("Four");
                                break;
                            case 5:
                                System.out.println("fire");
                                break;
                            case 6:
                                System.out.println("six");
                                break;
                            case 7:
                                System.out.println("seven");
                                break;
                            case 8:
                                System.out.println("eight");
                                break;
                            case 9:
                                System.out.println("nine");
                                break;
                        }
                        System.out.println(hangtram + hangchuc + hangdonvi);
                    } else {
                        System.out.println("Out Of Ability");
                    }
                }
            }

        }
    }
}