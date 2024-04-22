package login_app.models;

public class Profile {
    String fullname, hobby, nickName;
    int age;

    public Profile() { // constructor
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hoby) {
        this.hobby = hoby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
