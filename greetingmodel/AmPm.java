package greetingmodel;


class AmPm
{
  private Clock clock;

  AmPm()
  {
    this.clock = new Clock();
  }

  String message()
  {
    String ampm = clock.ampm();

    String message = "";
    MessageType type = MessageType.valueOf(ampm);

    return type.message();
  }
}
