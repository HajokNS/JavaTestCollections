public class Main {

    public static void main(String[] args) {
        JavaTestCollections testingJavaCollections = new JavaTestCollections();
        testingJavaCollections.fillAllCollections(50000);
        System.out.println(" ");
        testingJavaCollections.showTimeFillResults();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        JavaTestCollections testingJavaCollections2 = new JavaTestCollections();
        testingJavaCollections2.fillAllCollections(500000);
        System.out.println(" ");
        testingJavaCollections2.showTimeFillResults();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        JavaTestCollections testingJavaCollections3 = new JavaTestCollections();
        testingJavaCollections3.fillAllCollections(5000000);
        System.out.println(" ");
        testingJavaCollections3.showTimeFillResults();
        System.out.println(" ");
        System.out.println("---------------------------------------------------------");
        System.out.println(" ");
        testingJavaCollections.testAllCollections(50000);
        System.out.println(" ");
        testingJavaCollections.showTimeTestResults();
        System.out.println("+++++++++++++++++++++++++++++++++++");
        testingJavaCollections2.testAllCollections(500000);
        System.out.println(" ");
        testingJavaCollections2.showTimeTestResults();
        System.out.println("+++++++++++++++++++++++++++++++++++");
        testingJavaCollections3.testAllCollections(5000000);
        System.out.println(" ");
        testingJavaCollections3.showTimeTestResults();
    }
}