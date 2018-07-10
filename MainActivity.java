
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText num1 = findViewById(R.id.num1);
        final EditText num2 = findViewById(R.id.num2);
        final TextView tv = findViewById(R.id.result);
        Button add1 = findViewById(R.id.add);
        Button sub1 = findViewById(R.id.sub);
        Button div1 = findViewById(R.id.div);
        Button mult1 = findViewById(R.id.mult);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double addition = n1+n2;
                tv.setText("The sum is : "+addition);
            }
        });
        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                tv.setText("The subtracted amount is : "+(n1-n2));
            }
        });
        div1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                tv.setText("The division is : "+(n1/n2));
            }
        });
        mult1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                tv.setText("The multiplication is : "+(n1*n2));
            }
        });
    }
}
