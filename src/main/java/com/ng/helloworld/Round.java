package com.ng.helloworld;

class Round implements Figure {
    int x;
    int y;
    int centerX;
    int centerY;
    int radius;
    char symbol;

    public Round(int x, int y, int radius, char symbol) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.symbol = symbol;

        centerX = x + radius;
        centerY = y + radius;
    }

    public void print() {
        System.out.print(symbol);
    }

    public boolean isPointInside(int x, int y) {
        return (x - centerX) * (x - centerX) + (y - centerY) * (y - centerY) < radius * radius;
    }
}