package com.example.Clearpay.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("user")
public class User {
    @Id
    private String id;
    @Field(name = "name")
    @Indexed(unique = true) // for efficient queries
    private String userName;

    private List<Wallet> wallets;

    public User(String id, String userName, List<Wallet> wallets) {
        this.id = id;
        this.userName = userName;
        this.wallets = wallets;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Wallet> getWallets() {
        return wallets;
    }

    public void setWallets(List<Wallet> wallets) {
        this.wallets = wallets;
    }
}
