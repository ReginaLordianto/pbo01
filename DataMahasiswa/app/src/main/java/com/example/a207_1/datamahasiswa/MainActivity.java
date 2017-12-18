package com.example.a207_1.datamahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Mahasiswa mahasiswa;

    private Button tb_cari;
    private EditText dt_nim;
    private TextView txt_nama, txt_lkpr, txt_email, txt_program;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dt_nim = (EditText)findViewById(R.id.dt_nim);

        txt_nama = (TextView) findViewById(R.id.txt_nama);

        txt_email = (TextView) findViewById(R.id.txt_email);

        txt_lkpr = (TextView) findViewById(R.id.txt_lkpr);

        txt_program = (TextView) findViewById(R.id.txt_program) ;

        tb_cari = (Button) findViewById(R.id.tb_cari);

        tb_cari.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.tb_cari){
            String nim = dt_nim.getText().toString().trim();

            if (!TextUtils.isEmpty(nim)){
                mahasiswa =  new Mahasiswa(nim);
//                Log.d("CECHK", nim);
                txt_nama.setText(mahasiswa.getNama());
                txt_lkpr.setText(mahasiswa.getLkpr());
                txt_email.setText(mahasiswa.getEmail());
                txt_program.setText(mahasiswa.getProdi().getNama()+" "+mahasiswa.getProdi().getProgram());
            }
        }
    }
}
