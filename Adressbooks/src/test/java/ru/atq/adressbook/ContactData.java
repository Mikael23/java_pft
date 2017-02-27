package ru.atq.adressbook;

public class ContactData {
    private final String name;
    private final String surname;
    private final String secondname;
    private final String phonenumber;
    private final String emaill;
    private final String email;

    public ContactData(String Name, String Surname, String Secondname, String phonenumber, String emaill, String email) {
        name = Name;
        surname = Surname;
        secondname = Secondname;
        this.phonenumber = phonenumber;
        this.emaill = emaill;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmaill() {
        return emaill;
    }

    public String getEmail() {
        return email;
    }
}
