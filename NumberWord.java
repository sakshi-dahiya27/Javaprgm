public class NumberWord {
    public static void main(String[] args) {
        int a_number = 4;

        switch (a_number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
        }

        if (a_number == 1) {
            System.out.println("one");
        } else if (a_number == 2) {
            System.out.println("two");
        } else if (a_number == 3) {
            System.out.println("three");
        } else if (a_number == 4) {
            System.out.println("four");
        } else if (a_number == 5) {
            System.out.println("five");
        }
    }
}
