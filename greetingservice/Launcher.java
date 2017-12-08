package greetingservice;

class Launcher
{
  public static void main(String args[])
  {
    //Service service = new Service();
    //GreetingServiceProcedural service = new GreetingServiceProcedural();
    //GreetingServiceStructured service = new GreetingServiceStructured();
    GreetingService service = new GreetingService();
    service.greet();
  }
}
