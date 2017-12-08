package hello;

import java.util.Calendar;

class GreetingServiceStructured
{
  void greet()
  {
    String user = username();
    int hour = hour();
    String message = message(hour);
    print(user, message);
  }

  private String username()
  {
    return System.getProperty("user.name");
  }

  private int hour()
  {
    Calendar cal = Calendar.getInstance();
    return cal.get(Calendar.HOUR_OF_DAY);
  }

  private String message(int hour) 
  {
    if ( hour < 12 )
    {
      return "おはようございます";
    }
    else
    {
      return "こんにちは";
    }
  }

  private void print(String user, String message)
  {
    System.out.println(user + "さん、" + message);
  }

}

