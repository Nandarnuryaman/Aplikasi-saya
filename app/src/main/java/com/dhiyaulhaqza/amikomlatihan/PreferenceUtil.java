package com.dhiyaulhaqza.amikomlatihan;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by amikom on 13/10/2017.
 */

public final class PreferenceUtil {
    private PreferenceUtil()    {}

    private static SharedPreferences sharedPreferences;
    private static String PREFERENCES_KEY = "preferences_user";
    private static String IS_LOGGEDIN_KEY = "logged_in_key";
    private static String NAME_KEY = "name_key";

    public static PreferenceUtil newInstance(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE);
        }
        return new PreferenceUtil();
    }

    public void writeIsLoggedIn(boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(IS_LOGGEDIN_KEY, value).apply();
    }

    public boolean readIsLoggedIn(boolean defValue) {
        return sharedPreferences.getBoolean(IS_LOGGEDIN_KEY, defValue);
    }

    public void writeName(String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(NAME_KEY, value).apply();
    }

    public String readName(String defValue) {
        return sharedPreferences.getString(NAME_KEY, defValue);
    }
}
