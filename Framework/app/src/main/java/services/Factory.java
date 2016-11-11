package services;

import android.content.Context;

import com.dealacceleration.arvind.framework.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by ARVIND on 11/10/2016.
 */

public class Factory {
    private static Factory factory = new Factory();

    private Factory() {
    }

    public static Factory getInstance() {
        return factory;
    }

    public IService getService(String name, Context context) {
        Class c;
        try {
            c = Class.forName(getImplName(name, context));
            return (IService) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String getImplName(String name, Context context) {
        InputStream in = context.getResources().openRawResource(R.raw.properties);
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader buffer = new BufferedReader(reader);

        String prop, implName = null;
        StringBuilder build = new StringBuilder();
        JSONObject readJSON, key;

        try {
            while ((prop = buffer.readLine()) != null) {
                build.append(prop);
                build.append("\n");
            }

            buffer.close();
            reader.close();
            in.close();

            readJSON = new JSONObject(build.toString());
            key = readJSON.getJSONObject(context.getClass().getSimpleName());
            implName = key.getString(name);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return implName;
    }

}
