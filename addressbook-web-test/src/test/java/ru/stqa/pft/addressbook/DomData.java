package ru.stqa.pft.addressbook;

public class DomData {
  private final String name;
  private final String middlename;
  private final String lastname;
  private final String homephone;

  public DomData(String name, String Middlename, String lastname, String homephone) {
    this.name = name;
    middlename = Middlename;
    this.lastname = lastname;
    this.homephone = homephone;
  }

  public String getName() {
    return name;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getHomephone() {
    return homephone;
  }
}
