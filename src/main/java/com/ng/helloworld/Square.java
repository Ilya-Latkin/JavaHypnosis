package com.ng.helloworld;

class Square implements Figure {
    int x;
    int y;
    int size;
    char symbol;

    public Square(int x, int y, int size, char symbol) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.symbol = symbol;
    }

    public void print() {
        System.out.print(symbol);
    }

    public boolean isPointInside(int x, int y) {
        return this.x < x && this.y < y && this.size + this.x > x && this.size + this.y > y;
    }
}