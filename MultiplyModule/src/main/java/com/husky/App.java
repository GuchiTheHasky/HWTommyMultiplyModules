package com.husky;

import com.husky.entity.Data;
import com.husky.service.DataServiceImpl;
import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    @SneakyThrows
    public static void main(String[] args )
    {
        @Cleanup BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input distance: ");
        int distance = getDataSource(reader);
        System.out.print("Input price: ");
        int price = getDataSource(reader);

        DataServiceImpl service = new DataServiceImpl(new Data(distance, price));
        int sum = service.getSum();
        System.out.println("Sum is: " + sum);
    }


    private static int getDataSource(BufferedReader reader) throws IOException {
        int data = 0;
        do {
            data = Integer.parseInt(reader.readLine());
            if (data <= 0) {
                System.err.println("Data value can't be equal to or less than zero.");
            }
        }
        while (data <= 0);

        return data;
    }
}
