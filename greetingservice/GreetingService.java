package greetingservice;

import greetingmodel.Greeting;

class GreetingService
{
  User user;
  Transfer transfer;
  
  GreetingService()
  {
    this.user = new User();
    this.transfer = new Transfer();
  }


  void greet()
  {
    Greeting greeting = new Greeting(user.name());
    String message = greeting.message();
    //System.out.println("Output from Greeting Service");
    transfer.send(message);
  }
}
