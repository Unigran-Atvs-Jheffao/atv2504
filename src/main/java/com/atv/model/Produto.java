package com.atv.model;

public class Produto {
    String name;
    String data;

    public Produto(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public Produto setName(String name) {
        this.name = name;
        return this;
    }

    public String getData() {
        return data;
    }

    public Produto setData(String data) {
        this.data = data;
        return this;
    }
}
