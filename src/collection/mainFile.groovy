package collection



public class MainClass {
    public static void main( String[] args ) {
//        def reporting = TestClass.PackageName
//        print(reporting.values().collect { it.name }.sort())
        def baseUrl = "https://24.sata.hr"
        def url = new URL(baseUrl)
        println("Protocol: "+url.getProtocol());
        println("Host Name: "+url.getHost());
        println("Port Number: "+url.getPort());
    }
}