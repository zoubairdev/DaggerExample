package com.example.daggerexample;

import javax.inject.Inject;

public class Phone {

    private Color color;
    private Dimension dimension;


    @Inject
    public Phone(Color color, Dimension dimension) {
        this.color = color;
        this.dimension = dimension;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
