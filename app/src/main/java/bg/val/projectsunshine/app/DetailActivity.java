package bg.val.projectsunshine.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DetailSAct", "ON Resume");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DetailSAct", "ON Destroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DetailSAct", "ON Pause");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DetailSAct", "ON Restart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DetailSAct", "ON Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DetailSAct", "ON Stop");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("DetailSAct", "ON Create");
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
