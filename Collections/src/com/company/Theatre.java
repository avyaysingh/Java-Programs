package com.company;

import java.util.ArrayList;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList();

    public Theatre(String theatreName) {
        this.theatreName = theatreName;
    }
}
