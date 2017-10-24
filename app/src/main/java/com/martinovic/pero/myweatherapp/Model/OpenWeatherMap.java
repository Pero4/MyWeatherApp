package com.martinovic.pero.myweatherapp.Model;

import java.util.List;

/**
 * Created by Pero on 31.7.2017..
 */

public class OpenWeatherMap {
    private Coord coord;
    private Clouds clouds;
    private Main main;
    private Rain rain;
    private Sys sys;
    private Wind wind;
    private List<Waether> weather;
    private String base;
    private int dt;
    private int id;
    private String name;
    private int cod;

    public OpenWeatherMap() {
    }

    public OpenWeatherMap(Coord coord, Clouds clouds, Main main, Rain rain, Sys sys, Wind wind, List<Waether> weather, String base, int dt, int id, String name, int cod) {
        this.coord = coord;
        this.clouds = clouds;
        this.main = main;
        this.rain = rain;
        this.sys = sys;
        this.wind = wind;
        this.weather = weather;
        this.base = base;
        this.dt = dt;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public List<Waether> getWeather() {
        return weather;
    }

    public void setWeather(List<Waether> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
