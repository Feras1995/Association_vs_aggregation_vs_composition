public class WebServer1 {
    private HttpListner httpListner;
    private RequestProcessor requestProcessor;
    public WebServer1(){
        httpListner=new HttpListner();
        requestProcessor=new RequestProcessor();
    }
    
}
