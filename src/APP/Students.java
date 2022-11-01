package APP;
public class Students {
    public String name;
    public int age;
    public String genger;
    public String address;

    public Students() {
        this.name = "";
        this.age = 0;
        this.genger = "";
        this.address = "";
    }

    public Students(String name, int age, String genger, String address) {
        this.name = name;
        this.age = age;
        this.genger = genger;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGenger() {
        return genger;
    }
    public void setGenger(String genger) {  
        this.genger = genger;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String ShowInfor() {
        return "Name " + getName() + ", Age " + getAge() + ", Gender " + getGenger() + ", Address " + getAddress();
    }
}
