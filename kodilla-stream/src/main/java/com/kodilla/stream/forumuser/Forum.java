package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum(){
        listOfUsers.add(new ForumUser(1001,"leo", 'M', LocalDate.of(1990,1,6),10));
        listOfUsers.add(new ForumUser(1002,"ben", 'M', LocalDate.of(1995,2,7),20));
        listOfUsers.add(new ForumUser(1003,"ann", 'F', LocalDate.of(2000, 3, 8), 30));
        listOfUsers.add(new ForumUser(1004,"bob", 'M', LocalDate.of(2005,4,9), 40));
        listOfUsers.add(new ForumUser(1005,"sue", 'F', LocalDate.of(2010, 5, 10), 50));
        listOfUsers.add(new ForumUser(1006,"pat", 'F', LocalDate.of(1985, 6, 1), 5));
        listOfUsers.add(new ForumUser(1007,"ted", 'M', LocalDate.of(1980, 5, 2), 1));
        listOfUsers.add(new ForumUser(1008,"rob", 'M', LocalDate.of(1975, 5, 3), 0));
    }

    public List<ForumUser>getUserList(){
        return new ArrayList<>(listOfUsers);
    }
}
