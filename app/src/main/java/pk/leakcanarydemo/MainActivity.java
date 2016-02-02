package pk.leakcanarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private static Cat cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cat == null) {
                    cat = new Cat();
                }
            }
        });
    }

    class Cat {

        Cat() {
            Toast.makeText(MainActivity.this, "create one cat", Toast.LENGTH_LONG).show();
        }
    }

}
