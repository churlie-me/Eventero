package com.mdse.eventero.data;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.Toast;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.JsonParser;
import com.mdse.eventero.interfaces.EventsCallback;
import com.mdse.eventero.model.Events;

public class EventsAsync extends AsyncTask<String, String, JSONObject> {
    ProgressDialog pd;
    Context _ctx;
    EventsCallback callback;
    public EventsAsync(Context ctx, EventsCallback callback){
        _ctx = ctx;
        this.callback = callback;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        pd = new ProgressDialog(_ctx);
        pd.setMessage("Please wait");
        pd.setCancelable(false);
        pd.show();
    }

    @Override
    protected JSONObject doInBackground(String... strings) {
        String str="https://algowriter.com/events/event/read.php";
        URLConnection urlConn = null;
        BufferedReader bufferedReader = null;
        try
        {
            URL url = new URL(str);
            urlConn = url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                stringBuffer.append(line);
            }

            return new JSONObject(stringBuffer.toString());
        }
        catch(Exception ex)
        {
            Log.e("App", "Connection Failed", ex);
            return null;
        }
        finally
        {
            if(bufferedReader != null)
            {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    protected void onPostExecute(JSONObject jsonObject)
    {
        Events _events = new Events();
        super.onPostExecute(jsonObject);
        pd.dismiss();
        try {
            if (jsonObject != null) {
                //Log.d("25656", jsonObject.getJSONObject("records").toString());

                Gson gson = new Gson();
                //JsonParser jsonParser = new JsonParser();
                //JsonObject object = (JsonObject) jsonParser.parse(jsonObject.toString());// response will be the json String
                //_events = gson.fromJson(jsonObject.getJSONObject("records").toString(), com.mdse.eventero.model.Events.class);
                ObjectMapper mapper = new ObjectMapper();
                _events = mapper.readValue(jsonObject.toString(), Events.class);
                callback.OnSuccess(_events);
            }
        }
        catch (Exception ex)
        {
            Toast.makeText(_ctx, "Exception => " + ex.getMessage(), Toast.LENGTH_LONG).show();
            System.out.println("Conversion Exception =>" + ex.getMessage());
        }
    }
}
