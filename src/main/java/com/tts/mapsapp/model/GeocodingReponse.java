package com.tts.mapsapp.model;

import java.util.List;

public class GeocodingReponse {
    private List<Geocoding> results;

    public GeocodingReponse() {
    }

    public List<Geocoding> getResults() {
        return results;
    }

    public void setResults(List<Geocoding> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "GeocodingReponse [results=" + results + "]";
    }

    
}
