package jdbc.swingapplicationwithjdbc.model.resources;

public class UserInformation {
    public int id;
    public String fullName;
    public String address;
    public String contactNumber;
    public int age;

    @Override
    public String toString() {
        return "UserInformation{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
