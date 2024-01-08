package com.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        // Hubungkan CardView untuk Waikiki
        CardView cardViewWaikiki = view.findViewById(R.id.cdwaikiki);
        // Tambahkan onClickListener untuk CardView Waikiki
        cardViewWaikiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainWaikiki saat CardView Waikiki diklik
                Intent intent = new Intent(getActivity(), MainWaikiki.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk Mr. Queen
        CardView cardViewMrQueen = view.findViewById(R.id.cdmrqueen);
        // Tambahkan onClickListener untuk CardView Mr. Queen
        cardViewMrQueen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainMrQueen saat CardView Mr. Queen diklik
                Intent intent = new Intent(getActivity(), MainMrQueen.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk Again
        CardView cardViewAgain = view.findViewById(R.id.cdagain);
        // Tambahkan onClickListener untuk CardView Again
        cardViewAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainAgain saat CardView Again diklik
                Intent intent = new Intent(getActivity(), MainAgain.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk The Good Bad Mother
        CardView cardViewTheGood = view.findViewById(R.id.cdthegood);
        // Tambahkan onClickListener untuk CardView The Good Bad Mother
        cardViewTheGood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainTheGoodBadMother saat CardView diklik
                Intent intent = new Intent(getActivity(), MainTheGoodBadMother.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk Doctor Cha
        CardView cardViewDoctor = view.findViewById(R.id.cddoctor);
        // Tambahkan onClickListener untuk CardView Doctor Cha
        cardViewDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainDoctorCha saat CardView diklik
                Intent intent = new Intent(getActivity(), MainDoctorCha.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk Gaus Electronics
        CardView cardViewGaus = view.findViewById(R.id.cdgaus);
        // Tambahkan onClickListener untuk CardView Gaus Electronics
        cardViewGaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainGausElectronics saat CardView diklik
                Intent intent = new Intent(getActivity(), MainGausElectronics.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk Strong Girl
        CardView cardViewStrongGirl = view.findViewById(R.id.cdstronggirl);
        // Tambahkan onClickListener untuk CardView Strong Girl
        cardViewStrongGirl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainStrongGirl saat CardView diklik
                Intent intent = new Intent(getActivity(), MainStrongGirl.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk The Fiery
        CardView cardViewTheFiery = view.findViewById(R.id.cdthefiery);
        // Tambahkan onClickListener untuk CardView The Fiery
        cardViewTheFiery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainTheFiery saat CardView diklik
                Intent intent = new Intent(getActivity(), MainTheFiery.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
