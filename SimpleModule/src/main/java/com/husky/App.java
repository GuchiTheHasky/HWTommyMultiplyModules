package com.husky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input distance: ");
            int distance = Integer.parseInt(reader.readLine());
            System.out.print("Input price: ");
            int price = Integer.parseInt(reader.readLine());
            System.out.println();

            int sum = distance * price;
            System.out.println("sum: " + sum);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}