package com.husky.service;

import com.husky.entity.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DataServiceImpl implements DataService {
    private Data data;

    @Override
    public int getSum() {
        return data.getDistance() * data.getPrice();
    }
}
