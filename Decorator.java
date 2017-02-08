package com.david.designpatterns.structural.decorator;

interface Content {
    String output();
}

public class TextField implements Content {
    private String contents;

    public TextField(String contents)
    {
        this.contents = contents;
    }

    public String output()
    {
        return this.contents;
    }
}

public class TextFieldDecorator implements Content {
    private String contents;

    public TextFieldDecorator(String contents)
    {
        this.contents = contents;
    }

    public String output()
    {
        return this.contents;
    }

    public String outputExclamation()
    {
        return this.contents + "!";
    }
}
/* A simple pattern that allows additional functionality to be added to a base
class at runtime. Conforming to SOLID prinicples, this means the base class
can be extended without modification and the decorator is composed of said
class and can add additional functionality at will */
