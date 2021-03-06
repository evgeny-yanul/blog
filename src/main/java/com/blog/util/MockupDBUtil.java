package com.blog.util;

import com.blog.model.Message;
import com.blog.model.User;

import java.util.*;

public class MockupDBUtil {

    /*
    * GET USER
    * TODO: "Get user by login and password" method.
    * TODO: Generate exception when fail.
    * */
    public static User getUser(String login, String password) throws Exception {
        if ("litz".equals(login) && "123".equals(password)) {
            User user = new User();
            user.setId(1);
            user.setLogin("litz");
            user.setPassword("123");
            user.setName("Ann Litz");
            user.setAge(21);
            user.setCity("Monaco");
            user.setGender(1);
            return user;
        } else {
            throw new Exception("No user with such login and password.");
        }
    }

    /*
    * SAVE USER
    * TODO: "Save user" method.
    * TODO: Rewrite user data method.
    * TODO: Generate exception when fail.
    * */
    public static void saveUser(User user) throws Exception {
        if ("litz".equals(user.getLogin())) {
            throw new Exception("Login must be unique.");
        }
    }




    /* SET - LIST */

    /*
    * GET USER MESSAGES
    * TODO: "Get user messages" method.
    * TODO: Convert db date type to calendar type;
    * */
    public static ArrayList<Message> getUserMessages(User user) {
    ArrayList<Message> messages = new ArrayList<Message>();

//    public static Set<Message> getUserMessages(User user) {
//        Set<Message> messages = new HashSet<Message>();

        if ("litz".equals(user.getLogin())) {

            Message message1 = new Message();
            message1.setId(1);
            message1.setText("Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis.");

            Message message2 = new Message();
            message2.setId(2);
            message2.setText("Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis.");

            Calendar calendar = Calendar.getInstance();
            Formatter formatter = new Formatter();
            formatter.format("%tk:%tM %te.%tm.%tY", calendar, calendar, calendar, calendar, calendar);

            message1.setReadableTimeForm(formatter.toString());
            message2.setReadableTimeForm(formatter.toString());

            messages.add(message1);
            messages.add(message2);
        } else if ("lil".equals(user.getLogin())) {
            Message message1 = new Message();
            message1.setId(1);
            message1.setText("Lil. Lil Lil Lil");

            Message message2 = new Message();
            message2.setId(2);
            message2.setText("Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis.");

            Calendar calendar = Calendar.getInstance();
            Formatter formatter = new Formatter();
            formatter.format("%tk:%tM %te.%tm.%tY", calendar, calendar, calendar, calendar, calendar);

            message1.setReadableTimeForm(formatter.toString());
            message2.setReadableTimeForm(formatter.toString());

            messages.add(message1);
            messages.add(message2);
        }

        for (Message message : messages) {
            System.out.println("### " + message.getText());
        }
        return messages;
    }

    /*
    * DELETE USER
    * TODO: "Delete user" method.
    * */
    public static void deleteUser(User user) throws Exception {
        if ("litz".equals(user.getLogin())) {
            throw new Exception("Wrong situation");
        }
    }




    /* SET - LIST */

    /*
    * GET USERS
    * TODO: "Get users with equals fields values" method.
    * */
    public static ArrayList<User> getUsers(User user) throws Exception {
        ArrayList<User> users = new ArrayList<User>();

//    public static Set<User> getUsers(User user) throws Exception {
//        Set<User> users = new HashSet<User>();

        if ("".equals(user.getName())) {
            throw new Exception("No found.");

        } else if ("ann".equals(user.getName())) {
            User user1 = new User();
            user1.setId(1);
            user1.setName("Ann Litz");
            user1.setAge(21);
            user1.setCity("Monaco");
            user1.setGender(1);
            users.add(user1);

        } else if ("all".equals(user.getName())){
            User user1 = new User();
            user1.setId(2);
            user1.setLogin("litz");
            user1.setName("Ann Litz");
            user1.setAge(21);
            user1.setCity("Monaco");
            user1.setGender(1);

            User user2 = new User();
            user2.setId(2);
            user2.setLogin("kate");
            user2.setName("Kate Winst");
            user2.setAge(26);
            user2.setCity("Lion");
            user2.setGender(1);

            User user3 = new User();
            user3.setId(3);
            user3.setLogin("lil");
            user3.setName("Lil Rout");
            user3.setAge(32);
            user3.setCity("Panama");
            user3.setGender(1);

            users.add(user1);
            users.add(user2);
            users.add(user3);
        }
        return users;
    }

}
