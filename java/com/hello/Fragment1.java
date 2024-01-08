package com.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        // Hubungkan CardView dari layout fragment_1.xml untuk One Piece
        CardView cardViewOnePiece = view.findViewById(R.id.cdonepiece);
        // Tambahkan onClickListener untuk CardView One Piece
        cardViewOnePiece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainOnePiece saat CardView One Piece diklik
                Intent intent = new Intent(getActivity(), MainOnePiece.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_1.xml untuk Kimetsu no Yaiba
        CardView cardViewKimetsu = view.findViewById(R.id.cdkimetsu);
        // Tambahkan onClickListener untuk CardView Kimetsu no Yaiba
        cardViewKimetsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainKimetsu saat CardView Kimetsu no Yaiba diklik
                Intent intent = new Intent(getActivity(), MainKimetsu.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_1.xml untuk Jujutsu Kaisen
        CardView cardViewJujutsu = view.findViewById(R.id.cdjujutsu);
        // Tambahkan onClickListener untuk CardView Jujutsu Kaisen
        cardViewJujutsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainJujutsu saat CardView Jujutsu Kaisen diklik
                Intent intent = new Intent(getActivity(), MainJujutsu.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_1.xml untuk Attack on Titan
        CardView cardViewAttack = view.findViewById(R.id.cdattack);
        // Tambahkan onClickListener untuk CardView Attack on Titan
        cardViewAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainAttack saat CardView Attack on Titan diklik
                Intent intent = new Intent(getActivity(), MainAttack.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_1.xml untuk Hunter x Hunter
        CardView cardViewHunter = view.findViewById(R.id.cdhunter);
        // Tambahkan onClickListener untuk CardView Hunter x Hunter
        cardViewHunter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainHunter saat CardView Hunter x Hunter diklik
                Intent intent = new Intent(getActivity(), MainHunter.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_1.xml untuk Tokyo Revengers
        CardView cardViewTokyo = view.findViewById(R.id.cdtokyo);
        // Tambahkan onClickListener untuk CardView Tokyo Revengers
        cardViewTokyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainTokyo saat CardView Tokyo Revengers diklik
                Intent intent = new Intent(getActivity(), MainTokyo.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_1.xml untuk Naruto
        CardView cardViewNaruto = view.findViewById(R.id.cdnaruto);
        // Tambahkan onClickListener untuk CardView Naruto
        cardViewNaruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainNaruto saat CardView Naruto diklik
                Intent intent = new Intent(getActivity(), MainNaruto.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView dari layout fragment_1.xml untuk Doraemon
        CardView cardViewDoraemon = view.findViewById(R.id.cddoraemon);
        // Tambahkan onClickListener untuk CardView Doraemon
        cardViewDoraemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainDoraemon saat CardView Doraemon diklik
                Intent intent = new Intent(getActivity(), MainDoraemon.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
