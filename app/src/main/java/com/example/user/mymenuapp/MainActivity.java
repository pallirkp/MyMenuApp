package com.example.user.mymenuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.one:
                            Toast.makeText(this,"I am Harsha from CSE",Toast.LENGTH_LONG).show();
                            return true;
            case R.id.two:
                            Toast.makeText(this,"I am Sudhakar from Principal Room",Toast.LENGTH_LONG).show();
                            return true;
            case R.id.three:
                        Toast.makeText(this,"I am Mohan from IRCTC",Toast.LENGTH_LONG).show();
                        return true;
            default:        return super.onOptionsItemSelected(item);
        }
    }
}
