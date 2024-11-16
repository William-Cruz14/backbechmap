package com.map.backbeachmap.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.map.backbeachmap.dto.geocoding.Feature;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodingDTO {

        private String type;
        private List<Feature> features;
}