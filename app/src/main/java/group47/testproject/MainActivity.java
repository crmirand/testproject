package group47.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button sumButton;
    EditText num1;
    EditText num2;
    TextView sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumButton =(Button) findViewById(R.id.button);
        sumButton.setOnClickListener(this);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        sum = (TextView) findViewById(R.id.textView2);

    }

    public int sum(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }


    @Override
    public void onClick(View view) {
        if(view == sumButton) {
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());
            sum.setText(Integer.toString(sum(a,b)));

        }
    }
}
