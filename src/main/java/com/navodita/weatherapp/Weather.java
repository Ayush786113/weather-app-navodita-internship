package com.navodita.weatherapp;

import com.fasterxml.jackson.annotation.JsonProperty;

class Current{
    @JsonProperty("time")
    public String getTime() {
        return this.time; }
    public void setTime(String time) {
        this.time = time; }
    String time;
    @JsonProperty("interval")
    public int getInterval() {
        return this.interval; }
    public void setInterval(int interval) {
        this.interval = interval; }
    int interval;
    @JsonProperty("temperature_2m")
    public double getTemperature_2m() {
        return this.temperature_2m; }
    public void setTemperature_2m(double temperature_2m) {
        this.temperature_2m = temperature_2m; }
    double temperature_2m;
    @JsonProperty("relative_humidity_2m")
    public int getRelative_humidity_2m() {
        return this.relative_humidity_2m; }
    public void setRelative_humidity_2m(int relative_humidity_2m) {
        this.relative_humidity_2m = relative_humidity_2m; }
    int relative_humidity_2m;
    @JsonProperty("apparent_temperature")
    public double getApparent_temperature() {
        return this.apparent_temperature; }
    public void setApparent_temperature(double apparent_temperature) {
        this.apparent_temperature = apparent_temperature; }
    double apparent_temperature;
    @JsonProperty("is_day")
    public int getIs_day() {
        return this.is_day; }
    public void setIs_day(int is_day) {
        this.is_day = is_day; }
    int is_day;
    @JsonProperty("precipitation")
    public double getPrecipitation() {
        return this.precipitation; }
    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation; }
    double precipitation;
    @JsonProperty("rain")
    public double getRain() {
        return this.rain; }
    public void setRain(double rain) {
        this.rain = rain; }
    double rain;
    @JsonProperty("showers")
    public double getShowers() {
        return this.showers; }
    public void setShowers(double showers) {
        this.showers = showers; }
    double showers;
    @JsonProperty("snowfall")
    public double getSnowfall() {
        return this.snowfall; }
    public void setSnowfall(double snowfall) {
        this.snowfall = snowfall; }
    double snowfall;
    @JsonProperty("weather_code")
    public int getWeather_code() {
        return this.weather_code; }
    public void setWeather_code(int weather_code) {
        this.weather_code = weather_code; }
    int weather_code;
    @JsonProperty("cloud_cover")
    public int getCloud_cover() {
        return this.cloud_cover; }
    public void setCloud_cover(int cloud_cover) {
        this.cloud_cover = cloud_cover; }
    int cloud_cover;
    @JsonProperty("pressure_msl")
    public double getPressure_msl() {
        return this.pressure_msl; }
    public void setPressure_msl(double pressure_msl) {
        this.pressure_msl = pressure_msl; }
    double pressure_msl;
    @JsonProperty("surface_pressure")
    public double getSurface_pressure() {
        return this.surface_pressure; }
    public void setSurface_pressure(double surface_pressure) {
        this.surface_pressure = surface_pressure; }
    double surface_pressure;
    @JsonProperty("wind_speed_10m")
    public double getWind_speed_10m() {
        return this.wind_speed_10m; }
    public void setWind_speed_10m(double wind_speed_10m) {
        this.wind_speed_10m = wind_speed_10m; }
    double wind_speed_10m;
    @JsonProperty("wind_direction_10m")
    public int getWind_direction_10m() {
        return this.wind_direction_10m; }
    public void setWind_direction_10m(int wind_direction_10m) {
        this.wind_direction_10m = wind_direction_10m; }
    int wind_direction_10m;
    @JsonProperty("wind_gusts_10m")
    public double getWind_gusts_10m() {
        return this.wind_gusts_10m; }
    public void setWind_gusts_10m(double wind_gusts_10m) {
        this.wind_gusts_10m = wind_gusts_10m; }
    double wind_gusts_10m;
}

class CurrentUnits{
    @JsonProperty("time")
    public String getTime() {
        return this.time; }
    public void setTime(String time) {
        this.time = time; }
    String time;
    @JsonProperty("interval")
    public String getInterval() {
        return this.interval; }
    public void setInterval(String interval) {
        this.interval = interval; }
    String interval;
    @JsonProperty("temperature_2m")
    public String getTemperature_2m() {
        return this.temperature_2m; }
    public void setTemperature_2m(String temperature_2m) {
        this.temperature_2m = temperature_2m; }
    String temperature_2m;
    @JsonProperty("relative_humidity_2m")
    public String getRelative_humidity_2m() {
        return this.relative_humidity_2m; }
    public void setRelative_humidity_2m(String relative_humidity_2m) {
        this.relative_humidity_2m = relative_humidity_2m; }
    String relative_humidity_2m;
    @JsonProperty("apparent_temperature")
    public String getApparent_temperature() {
        return this.apparent_temperature; }
    public void setApparent_temperature(String apparent_temperature) {
        this.apparent_temperature = apparent_temperature; }
    String apparent_temperature;
    @JsonProperty("is_day")
    public String getIs_day() {
        return this.is_day; }
    public void setIs_day(String is_day) {
        this.is_day = is_day; }
    String is_day;
    @JsonProperty("precipitation")
    public String getPrecipitation() {
        return this.precipitation; }
    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation; }
    String precipitation;
    @JsonProperty("rain")
    public String getRain() {
        return this.rain; }
    public void setRain(String rain) {
        this.rain = rain; }
    String rain;
    @JsonProperty("showers")
    public String getShowers() {
        return this.showers; }
    public void setShowers(String showers) {
        this.showers = showers; }
    String showers;
    @JsonProperty("snowfall")
    public String getSnowfall() {
        return this.snowfall; }
    public void setSnowfall(String snowfall) {
        this.snowfall = snowfall; }
    String snowfall;
    @JsonProperty("weather_code")
    public String getWeather_code() {
        return this.weather_code; }
    public void setWeather_code(String weather_code) {
        this.weather_code = weather_code; }
    String weather_code;
    @JsonProperty("cloud_cover")
    public String getCloud_cover() {
        return this.cloud_cover; }
    public void setCloud_cover(String cloud_cover) {
        this.cloud_cover = cloud_cover; }
    String cloud_cover;
    @JsonProperty("pressure_msl")
    public String getPressure_msl() {
        return this.pressure_msl; }
    public void setPressure_msl(String pressure_msl) {
        this.pressure_msl = pressure_msl; }
    String pressure_msl;
    @JsonProperty("surface_pressure")
    public String getSurface_pressure() {
        return this.surface_pressure; }
    public void setSurface_pressure(String surface_pressure) {
        this.surface_pressure = surface_pressure; }
    String surface_pressure;
    @JsonProperty("wind_speed_10m")
    public String getWind_speed_10m() {
        return this.wind_speed_10m; }
    public void setWind_speed_10m(String wind_speed_10m) {
        this.wind_speed_10m = wind_speed_10m; }
    String wind_speed_10m;
    @JsonProperty("wind_direction_10m")
    public String getWind_direction_10m() {
        return this.wind_direction_10m; }
    public void setWind_direction_10m(String wind_direction_10m) {
        this.wind_direction_10m = wind_direction_10m; }
    String wind_direction_10m;
    @JsonProperty("wind_gusts_10m")
    public String getWind_gusts_10m() {
        return this.wind_gusts_10m; }
    public void setWind_gusts_10m(String wind_gusts_10m) {
        this.wind_gusts_10m = wind_gusts_10m; }
    String wind_gusts_10m;
}

public class Weather{
    @JsonProperty("latitude")
    public double getLatitude() {
        return this.latitude; }
    public void setLatitude(double latitude) {
        this.latitude = latitude; }
    double latitude;
    @JsonProperty("longitude")
    public double getLongitude() {
        return this.longitude; }
    public void setLongitude(double longitude) {
        this.longitude = longitude; }
    double longitude;
    @JsonProperty("generationtime_ms")
    public double getGenerationtime_ms() {
        return this.generationtime_ms; }
    public void setGenerationtime_ms(double generationtime_ms) {
        this.generationtime_ms = generationtime_ms; }
    double generationtime_ms;
    @JsonProperty("utc_offset_seconds")
    public int getUtc_offset_seconds() {
        return this.utc_offset_seconds; }
    public void setUtc_offset_seconds(int utc_offset_seconds) {
        this.utc_offset_seconds = utc_offset_seconds; }
    int utc_offset_seconds;
    @JsonProperty("timezone")
    public String getTimezone() {
        return this.timezone; }
    public void setTimezone(String timezone) {
        this.timezone = timezone; }
    String timezone;
    @JsonProperty("timezone_abbreviation")
    public String getTimezone_abbreviation() {
        return this.timezone_abbreviation; }
    public void setTimezone_abbreviation(String timezone_abbreviation) {
        this.timezone_abbreviation = timezone_abbreviation; }
    String timezone_abbreviation;
    @JsonProperty("elevation")
    public double getElevation() {
        return this.elevation; }
    public void setElevation(double elevation) {
        this.elevation = elevation; }
    double elevation;
    @JsonProperty("current_units")
    public CurrentUnits getCurrent_units() {
        return this.current_units; }
    public void setCurrent_units(CurrentUnits current_units) {
        this.current_units = current_units; }
    CurrentUnits current_units;
    @JsonProperty("current")
    public Current getCurrent() {
        return this.current; }
    public void setCurrent(Current current) {
        this.current = current; }
    Current current;
}
