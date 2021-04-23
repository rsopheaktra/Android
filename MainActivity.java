package com.example.checkconnection;

import android.app.Activity;
import android.os.Bundle;

import com.example.checkconnection.R;

import android.content.Context;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        if (InternetConnection.checkConnection(context)) {
    // Its Available...
    Toast.makeText(context, "is Online!",
   Toast.LENGTH_LONG).show();
} else {
    // Not Available...
    Toast.makeText(context, "is Offline!",
   Toast.LENGTH_LONG).show();
}

    }

}
