package collection



public class MainClass {
    public static void main( String[] args ) {
        def reporting = TestClass.PackageName
        print(reporting.values().collect { it.name }.sort())
    }
}