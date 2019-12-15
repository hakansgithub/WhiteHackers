package molecularTeleportation;

public class SignUpLogin {

    private String userName;
    private String password;
    private int age;
    private int ssn;

    public String getUserName () {
        return userName;
    }

    public String getPassword () {
        return password;
    }

    public int getAge () {
        return age;
    }

    public int getSsn () {
        return ssn;
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setSsn (int ssn) {
        this.ssn = ssn;
    }

    public String signUp (String userName, String password, int age, int ssn) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.ssn = ssn;

        if (age >= 21 && age < 70) {
        } else {

        }
        return "";
    }

    public String LogIn (String userName, String password) {
        this.userName = userName;
        this.password = password;
        return "";
    }
}
