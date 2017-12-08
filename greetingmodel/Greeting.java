package greetingmodel;

public class Greeting
{
  private String username;

  public Greeting(String username)
  {
    this.username = username;
  }

  public String message()
  {
    AmPm ampm = new AmPm();
    GreetingFormat format = new GreetingFormat(username, ampm);
    return format.text();
  }

}
