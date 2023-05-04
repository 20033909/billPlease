package sg.edu.rp.c346.id20033909.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText amt;
    EditText pax;
    ToggleButton tg_sv;
    ToggleButton tg_gst;
    EditText discount;
    RadioGroup rg_payment;
    Button btn_display;
    Button btn_reset;
    TextView textDisplay1;
    TextView textDisplay2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amt = findViewById(R.id.editAmt);
        pax = findViewById(R.id.editPax);
        tg_sv = findViewById(R.id.toggSv);
        tg_gst = findViewById(R.id.toggGst);
        discount = findViewById(R.id.editDiscount);
        rg_payment = findViewById(R.id.rgPayment);
        btn_display = findViewById(R.id.btnDisplay);
        btn_reset = findViewById(R.id.btnReset);
        textDisplay1 = findViewById(R.id.textTotal);
        textDisplay2 = findViewById(R.id.textEach);


        btn_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action

                float fr=Float.parseFloat(String.valueOf(amt));





            }
        });

        tg_sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the action
                boolean isChecked = tg_sv.isChecked();
                if (isChecked){
                    amt.setEnabled(true);
                } else {
                    amt.setEnabled(false);
                }
            }
        });

    }

}