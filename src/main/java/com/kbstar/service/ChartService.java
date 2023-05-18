package com.kbstar.service;


import com.kbstar.dto.Chart;
import com.kbstar.mapper.ChartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartService {

    @Autowired
    ChartMapper chartMapper;

    public List<Chart> getCategoryTotal() throws Exception{
        return chartMapper.getCategoryTotal();
    };
}
