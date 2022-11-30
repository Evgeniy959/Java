package com.example.oop.modelHuman;

public class Builder extends Human{
    public Builder() {
        super("Петр, ", "Петров, ", 25, "мастер-строитель, ");
        super.work("строит дома");
    }
}
