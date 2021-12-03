package com.example.step_by_steporigami;

import android.graphics.drawable.Drawable;

public class Origami {
    private String name;
    private int image;
    private int instruction;

    public Origami(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public Origami(String name, int image, int instruction) {
        this.name = name;
        this.image = image;
        this.instruction = instruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getInstruction() {
        return instruction;
    }
}
