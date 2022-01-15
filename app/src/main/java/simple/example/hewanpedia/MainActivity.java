package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKucing,btnKambing,btnKelinci;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnKambing = findViewById(R.id.btn_buka_ras_kambing);
        btnKelinci = findViewById(R.id.btn_buka_ras_kelinci);
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnKambing.setOnClickListener(Vi -> bukaGaleri("Kambing"));
        btnKelinci.setOnClickListener(view -> bukaGaleri("Kelinci"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity kucing");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void btn_profil(View view) {
        Intent intent = new Intent(MainActivity.this, Myprofil.class);
        startActivity(intent);
    }
}