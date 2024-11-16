package com.map.backbeachmap.dto;


import com.map.backbeachmap.dto.weather.Forecasts;
import com.map.backbeachmap.dto.weather.Summary;
import lombok.Data;

import java.util.ArrayList;

@Data
public class WeatherDTO {
    public Summary summary;
    public ArrayList<Forecasts> forecasts;
}