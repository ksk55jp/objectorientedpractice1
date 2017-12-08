package greetingservice;

class User
{
  private String name;

  User()
  {
    name = System.getProperty("user.name");
  }

  String name()
  {
    return name;
  }
}
