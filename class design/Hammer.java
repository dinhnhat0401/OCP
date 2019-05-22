class Tool {
  void use() { }
}

class Hammer extends Tool {
  private void use() { } // This will caused `attempting to assign weaker access privileges; was package` error
  private void use(String s) { } // This will work normally, is a trick in OCP example. Overloaded method is not restricted by the parent class access privileges.
  public void bang() { }
}

