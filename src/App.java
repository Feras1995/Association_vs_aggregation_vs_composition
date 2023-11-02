public class App {
    public static void main(String[] args) throws Exception {
        // in aggregation parts will be destroyed when whole is destroyed
        WebServer1 w1 = new WebServer1();

        // parts have thier won life cycle and will not be destroyed when the whole
        // destroyed
        HttpListner httpListner = new HttpListner();
        RequestProcessor requestProcessor = new RequestProcessor();
        WebServer2 w2 = new WebServer2(httpListner, requestProcessor);

        // webSErver3 is using parts and httpListner&RequestProcessor
        // does not consider as a part of WebServer3
        WebServer3 w3=new WebServer3();
        w3.connect(httpListner, requestProcessor);
        
    }
}
