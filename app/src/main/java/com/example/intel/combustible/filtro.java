package com.example.intel.combustible;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class filtro extends AppCompatActivity {

    private SeekBar seekBar;

    private TextView textViewSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtro);
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
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textViewSeekBar = (TextView) findViewById(R.id.barraKM);
        textViewSeekBar.setText("5KM");


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            private Toast toastStart = Toast.makeText(filtro.this, getText(R.string.start), Toast.LENGTH_SHORT);
            private Toast toastStop = Toast.makeText(filtro.this, getText(R.string.stop), Toast.LENGTH_SHORT);

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                //la Seekbar siempre empieza en cero, si queremos que el valor mínimo sea otro podemos modificarlo
                textViewSeekBar.setText(progress + 5 + "KM");
                seekBar.setMax(45);

            }

            /**
             * El usuario inicia la interacción con la Seekbar.
             */
            @Override
            public void onStartTrackingTouch(SeekBar arg0)
            {
                toastStop.cancel();
                toastStart.setGravity(Gravity.TOP|Gravity.LEFT, 60, 110);
                toastStart.show();
            }

            /**
             * El usuario finaliza la interacción con la Seekbar.
             */
            @Override
            public void onStopTrackingTouch(SeekBar arg0)
            {
                toastStart.cancel();
                toastStop.setGravity(Gravity.TOP|Gravity.RIGHT, 60, 110);
                toastStop.show();
            }
        });

    }

}
