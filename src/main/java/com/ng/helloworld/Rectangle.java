package com.ng.helloworld;

class Rectangle implements Figure {
    int x;
    int y;
    int width;
    int height;
    char symbol;

    public Rectangle(int x, int y, int width, int height, char symbol) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.symbol = symbol;
    }

    public void print() {
        System.out.print(symbol);
    }

    public boolean isPointInside(int x, int y) {
        return this.x < x && this.y < y && this.width + this.x > x && this.height + this.y > y;
    }
}