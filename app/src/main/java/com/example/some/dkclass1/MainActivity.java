package com.example.some.dkclass1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.app.AlertDialog;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void Launch(View v) {
       Toast toast = Toast.makeText(this, "Thank you for Joining this program.", Toast.LENGTH_LONG);
        toast.show();
        displayPopup(v);
    }

    public void displayPopup(View v) {
        //The builder will build the dialog.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        //Tell the builder about the dialog we want it to create.
        builder.setTitle("NYU Class");
        builder.setMessage("Thank you for joining this program.");
        //null because we want the positive button to do nothing
        //except dismisss the dialog.
        builder.setPositiveButton("OK", null);

        //Now that we've finished describing the dialog,
        //tell the builder to create it.
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
