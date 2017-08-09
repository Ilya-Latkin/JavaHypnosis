package com.ng.helloworld;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

class Main {
    static final int DELAY = 20;
    static final int SCREEN_WIDTH = 100;
    static final int HEIGHT = 1000;
    static final int MAX_FIGURE_SIZE = 40;
    static final int MAX_ROUND_SIZE = 20;
    static final int FIGURES_COUNT = 100;
    static final Random random = new Random();

    public static void main (String[] args) throws Exception {
        
        List<Figure> figures = new ArrayList<Figure>();
        for (int i = 0; i < FIGURES_COUNT; i++) {
            if (random.nextBoolean()) {
                figures.add(new Rectangle(random.nextInt(SCREEN_WIDTH), random.nextInt(HEIGHT), random.nextInt(MAX_FIGURE_SIZE), random.nextInt(MAX_FIGURE_SIZE), getRandomSym()));
            } else {
                figures.add(new Round(random.nextInt(SCREEN_WIDTH), random.nextInt(HEIGHT), random.nextInt(MAX_FIGURE_SIZE), getRandomSym()));
            }
        }

        for(int y = 0; y < HEIGHT; y++) {
            for(int x = 0; x < SCREEN_WIDTH; x++) {
                boolean figureExists = false;
                for(Figure figure: figures) {
                    if (figure.isPointInside(x, y)) {
                        figure.print();
                        figureExists = true;
                        break;
                    }
                }
                if(figureExists == false) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            Thread.sleep(DELAY);
        }
    }   

    static char getRandomSym() {
        if (random.nextBoolean()) {
            return '*';
        } else if (random.nextBoolean()) {
            return '0';
        } else if (random.nextBoolean()) {
            return 'z';
        } else {
            return '§';
        }
    }
}