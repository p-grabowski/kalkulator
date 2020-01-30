package pl.przemek.kalkulator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btn_1, btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_kropka,btn_dodaj,btn_odejmij,btn_mnoz,btn_dziel,btn_clear,btn_wynik, btn_kwadrat, btn_log, btn_pierwiastek;
    TextView ekran;

    float a = 0;
    int znak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0       = findViewById(R.id.main_bt_0);
        btn_1       = findViewById(R.id.main_bt_1);
        btn_2       = findViewById(R.id.main_bt_2);
        btn_3       = findViewById(R.id.main_bt_3);
        btn_4       = findViewById(R.id.main_bt_4);
        btn_5       = findViewById(R.id.main_bt_5);
        btn_6       = findViewById(R.id.main_bt_6);
        btn_7       = findViewById(R.id.main_bt_7);
        btn_8       = findViewById(R.id.main_bt_8);
        btn_9       = findViewById(R.id.main_bt_9);
        btn_kropka  = findViewById(R.id.main_bt_kropka);
        btn_dodaj   = findViewById(R.id.main_bt_dodawanie);
        btn_odejmij = findViewById(R.id.main_bt_odejmowanie);
        btn_mnoz    = findViewById(R.id.main_bt_mnozenie);
        btn_dziel   = findViewById(R.id.main_bt_dzeielenie);
        btn_kwadrat = findViewById(R.id.main_bt_kwadrat);
        btn_log     = findViewById(R.id.main_bt_ln);
        btn_pierwiastek     = findViewById(R.id.main_bt_pierwiastek);
        btn_clear   = findViewById(R.id.main_bt_clear);
        btn_wynik   = findViewById(R.id.main_bt_wynik);
        ekran       = findViewById(R.id.main_tv_ekran);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+"0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+"9");
            }
        });

        btn_kropka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText(ekran.getText()+".");
                btn_kropka.setEnabled(false);
            }
        });
        btn_dodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ekran.getText().equals("")) {
                    znak = 1;
                    a = Float.parseFloat(ekran.getText().toString());
                    ekran.setText("");
                }
            }
        });
        btn_odejmij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ekran.getText().equals("")) {
                    znak = 2;
                    a = Float.parseFloat(ekran.getText().toString());
                    ekran.setText("");
                }
            }
        });
        btn_mnoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ekran.getText().equals("")) {
                    znak = 3;
                    a = Float.parseFloat(ekran.getText().toString());
                    ekran.setText("");
                }
            }
        });
        btn_dziel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ekran.getText().equals("")) {
                    znak = 4;
                    a = Float.parseFloat(ekran.getText().toString());
                    ekran.setText("");
                }
            }
        });
        btn_kwadrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ekran.getText().equals("")) {
                    ekran.setText("" + (Float.parseFloat(ekran.getText().toString()) * Float.parseFloat(ekran.getText().toString())));
                    btn_kropka.setEnabled(true);
                }
            }
        });
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ekran.getText().equals("")) {
                    ekran.setText("" + (Math.log(Float.parseFloat(ekran.getText().toString()))));
                    btn_kropka.setEnabled(true);
                }
            }
        });
        btn_pierwiastek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ekran.getText().equals("")) {
                    ekran.setText("" + (Math.sqrt(Float.parseFloat(ekran.getText().toString()))));
                    btn_kropka.setEnabled(true);
                }
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText("");
                btn_kropka.setEnabled(true);
            }
        });
        btn_wynik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (znak) {
                    case 1:
                        if(!ekran.getText().equals("")) {
                            ekran.setText("" + (a + Float.parseFloat(ekran.getText().toString())));
                            btn_kropka.setEnabled(true);
                        }
                        break;
                    case 2:
                        if(!ekran.getText().equals("")) {
                            ekran.setText("" + (a - Float.parseFloat(ekran.getText().toString())));
                            btn_kropka.setEnabled(true);
                        }
                        break;
                    case 3:
                        if(!ekran.getText().equals("")) {
                            ekran.setText("" + a * Float.parseFloat(ekran.getText().toString()));
                            btn_kropka.setEnabled(true);
                        }
                        break;
                    case 4:
                        if(a==0){
                            Toast.makeText(MainActivity.this, "Nie dziel z zerem",Toast.LENGTH_LONG).show();
                        }else {
                            if(!ekran.getText().equals("")) {
                                ekran.setText("" + a / Float.parseFloat(ekran.getText().toString()));
                                btn_kropka.setEnabled(true);
                            }
                        }
                        break;
                }
            }
        });
    }
}
