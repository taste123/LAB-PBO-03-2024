package login_app.utils;

public class StringUtils {
    String nickname;

    public StringUtils(String fullname) {
        String[] nickName = fullname.split(" ");
        if (nickName.length == 1) {
            nickname = nickName[0];
        } else {
            nickname = nickName[1];
        }
    }

    public String getNickname() {
        return nickname;
    }
}