package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        while (true) {
            try {
                int selectMenu = sc.nextInt();
                sc.nextLine();
                switch (selectMenu) {
                    case 1:
                        showLoginMenu();
                        break;
                    case 2:
                        showRegisterMenu();
                    default:
                        runApp();
                        break;
                }
            } catch (Exception e) {
                System.out.println("invalid input, must be a number!!\n");
                sc.nextLine();
                runApp();
            }
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");
        String username = sc.next();

        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {

            if (listUser.get(i).getUserName().equals(username)) {
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            for (int i = 0; i < 3; i++) {
                String password = sc.next();
                boolean isPasswordMatch;

                if (listUser.get(userIndex).getPassword().equals(password)) {
                    isPasswordMatch = true;
                } else {
                    isPasswordMatch = false;
                }

                if (isPasswordMatch) {
                    System.out.println("Berhasil Login");

                    showDetailUser(listUser.get(userIndex).getProfile());
                    System.exit(0);
                } else {
                    int attempts = 3 - (i + 1);
                    System.out.printf("Password Salah, remaining attempts : " + attempts + "\n");
                    if (i == 2) {
                        runApp();
                    }
                }
            }

        } else {
            System.out.println("username : " + username + " not found!!\n");
            runApp();
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        String username;
        while (true) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            for (int i = 0; i < listUser.size(); i++) {

                if (listUser.get(i).getUserName().equals(username)) {
                    System.out.println("This username has already been used!!");
                    showRegisterMenu();
                    break;
                }
            }
            if (username.length() > 0) {
                break;
            } else {
                System.out.println("invalid input, must fill your username!!");
            }

        }

        String password;
        while (true) {
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.length() >= 8) {
                break;
            } else {
                System.out.println("password length min = 8, please try again!");
            }
        }

        User user = new User(username, password);

        Profile profile = new Profile();

        String fullName;
        while (true) {
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine();
            if (fullName.length() > 0) {
                break;
            } else {
                System.out.println("invalid input, must fill your fullname!!");
            }
        }

        int age;
        while (true) {
            try {
                System.out.println("Umur");
                System.out.print("> ");
                age = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("invalid input, must be a number!!\n");
                sc.nextLine();
            }
        }

        sc.nextLine();

        String hobby;
        while (true) {
            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine();
            if (hobby.length() > 0) {
                break;
            } else {
                System.out.println("invalid input, must fill your hobby!!");
            }
        }

        profile.setFullname(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);

        StringUtils nickName = new StringUtils(fullName);
        profile.setNickName(nickName.getNickname());

        listUser.add(user);
        listUserProfile.add(profile);
        user.setProfile(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------\nSELAMAT DATANG!!\n-------------------------");
        System.out.println("nama lengkap    : " + profile.getFullname());
        System.out.println("nama panggilan  : " + profile.getNickName());
        System.out.println("umur            : " + profile.getAge());
        System.out.println("hobby           : " + profile.getHobby());
        System.out.println("-------------------------");
    }
}