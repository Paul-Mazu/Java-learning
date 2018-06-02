package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Forum {

    public List <ForumUser> getUserList () {
        List <ForumUser> theListOfUsers = new ArrayList<>();
        theListOfUsers.add(new ForumUser(1, "User 1", 'M', LocalDate.parse("1989-02-03"), 100));
        theListOfUsers.add(new ForumUser(2, "User 2", 'M', LocalDate.parse("1989-02-03"), 100));
        theListOfUsers.add(new ForumUser(3, "User 3", 'F', LocalDate.parse("1999-02-03"), 100));
        theListOfUsers.add(new ForumUser(4, "User 4", 'F', LocalDate.parse("1989-02-03"), 100));
        theListOfUsers.add(new ForumUser(5, "User 5", 'M', LocalDate.parse("1989-02-03"), 100));
        theListOfUsers.add(new ForumUser(6, "User 6", 'F', LocalDate.parse("1989-02-03"), 0));
        theListOfUsers.add(new ForumUser(7, "User 7", 'M', LocalDate.parse("1989-02-03"), 100));
        theListOfUsers.add(new ForumUser(8, "User 8", 'F', LocalDate.parse("1989-02-03"), 100));
        theListOfUsers.add(new ForumUser(9, "User 9", 'M', LocalDate.parse("1989-02-03"), 100));

        return theListOfUsers;
    }
}
