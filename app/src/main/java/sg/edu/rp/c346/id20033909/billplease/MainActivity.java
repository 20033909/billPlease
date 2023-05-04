package sg.edu.rp.c346.id20033909.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {





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

    }
}