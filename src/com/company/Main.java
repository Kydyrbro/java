package com.company;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Main {

    public static void main(String[] args) {
        calc(1,2,3,4,5,6);
    }
    static void calc(int ... asel) {
        int couter = 0;
        for (int a: asel) {
            couter += a;
        }

    }
}

