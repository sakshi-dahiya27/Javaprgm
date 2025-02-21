public class SynsetAverage {
    public static void main(String[] args) {

        int synsetsApril = 12;
        int synsetsMay = 14;
        int synsetsJune = 8;

        double averageSynsets = (synsetsApril + synsetsMay + synsetsJune) / 3.0;

        System.out.println("Synsets entered for April: " + synsetsApril);
        System.out.println("Synsets entered for May: " + synsetsMay);
        System.out.println("Synsets entered for June: " + synsetsJune);
        System.out.println(
                "The average number of synsets for April, May, and June is: " + String.format("%.2f", averageSynsets));
    }
}
