package org.androidtown.myapplication;

/**
 * Created by Avilrus on 2017-04-03.
 */

public class Chat{

    public String email;

    public String text;

    public Chat() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public Chat(String text) {

        this.text = text;

    }
}
