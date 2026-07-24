package com.springcore.standalonecollection;

import java.util.List;

public class Temp {
    private List<String> friends;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "friends=" + friends +
                '}';
    }
}
