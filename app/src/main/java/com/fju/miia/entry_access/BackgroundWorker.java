package com.fju.miia.entry_access;

import android.content.Context;
import android.os.AsyncTask;


import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by User on 2018/11/26.
 */

public class BackgroundWorker extends AsyncTask<String,Void,Void> {
    Context context;
    BackgroundWorker (Context ctx){
        context = ctx;
    }
    @Override
    protected Void doInBackground(String... param) {
        String type = param[0];
        String login_url = "http://172.20.10.3/login.php";//
        if(type.equals("login")){
            try {
                URL url = new URL(login_url);
               // HttpsURLConnection http = (HttpsURLConnection) url.openConnection()
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }



        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }


}

