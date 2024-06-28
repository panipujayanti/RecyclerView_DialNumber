package com.universitaskuningan.recycle_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements KontakAdapter.OnContactClickListener{


    public RecyclerView rv;
    public KontakAdapter contactAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<Kontak> listContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rvContact);

        listContact.add(new Kontak("Pani",
                "081312700100",
                "https://cdn2.iconfinder.com/data/icons/avatars-60/5985/15-Actress-512.png"));

        listContact.add(new Kontak("Naufal",
                "089606941238",
                "https://cdn2.iconfinder.com/data/icons/avatars-60/5985/40-School_boy-512.png"));

        listContact.add(new Kontak("Atala",
                "08988798768",
                "https://cdn4.iconfinder.com/data/icons/avatars-2-12/512/Avatar_2-12-512.png"));

        listContact.add(new Kontak("Safina",
                "08766588798",
                "https://cdn2.iconfinder.com/data/icons/avatars-60/5985/24-Maid-512.png"));

        listContact.add(new Kontak("Jefri",
                "087665883200",
                "https://cdn2.iconfinder.com/data/icons/avatars-60/5985/25-Researcher-512.png"));

        listContact.add(new Kontak("Polier",
                "087665883289",
                "https://cdn2.iconfinder.com/data/icons/avatars-60/5985/4-Writer-512.png"));

        listContact.add(new Kontak("Blier",
                "08766583200",
                "https://cdn2.iconfinder.com/data/icons/avatars-60/5985/2-Boy-512.png"));



        contactAdapter = new KontakAdapter(listContact);
        contactAdapter.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(contactAdapter);
        rv.setLayoutManager(layoutManager);
    }

    @Override
    public void onClick(View view, int position) {
        Kontak kontak = listContact.get(position);
        Toast.makeText(this, kontak.getNama(), Toast.LENGTH_LONG)
                .show();
        String noTelepon = kontak.getTelepon();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + noTelepon));
        startActivity(intent);

    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}