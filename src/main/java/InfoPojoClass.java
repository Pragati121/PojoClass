public class InfoPojoClass {
    String Name;
    String email;
    String Lastname;



    public InfoPojoClass(String Name, String email,String lastname) {
        this.Name = Name;
        this.Lastname=lastname;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    @Override
    public String toString() {
        return "Name: " + this.Name + " — Email: " + this.email+" — Lastname: " + this.Lastname;
    }
}
