package br.com.local.appalertdialogcalendar;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.DatePicker;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker dtpCalendario;
    TextView lblCalendario;
    Button btnCalendario;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblCalendario = findViewById(R.id.lblCalendario);
        dtpCalendario = findViewById(R.id.dtpCalendario);
        btnCalendario = findViewById(R.id.btnCalendario);

        btnCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblCalendario.setText("Data Selecionada: " + dtpCalendario.getDayOfMonth() + "/" + (dtpCalendario.getMonth() + 1) + "/" + dtpCalendario.getYear());
            }
        });
    }
}
