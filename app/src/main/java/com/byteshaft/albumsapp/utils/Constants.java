package com.byteshaft.albumsapp.utils;

public class Constants {

    private static String API_BASE = "http://188.166.145.145:8000/api/";
    public static String ENDPOINT_REGISTER = API_BASE + "register";
    public static String ENDPOINT_LOGIN = API_BASE + "login";
    public static String ENDPOINT_ACTIVATE = API_BASE + "activate";
    public static String ENDPOINT_ME = API_BASE + "me";

    public static String CONTENT_TYPE_JSON = "application/json";

    public static String CONFIG_KEY_FIRST_RUN = "first_run";
}