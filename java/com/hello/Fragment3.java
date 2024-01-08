package com.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        // Hubungkan CardView untuk Doona
        CardView cardViewDoona = view.findViewById(R.id.cddoona);
        // Tambahkan onClickListener untuk CardView Doona
        cardViewDoona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainDoona saat CardView Doona diklik
                Intent intent = new Intent(getActivity(), MainDoona.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk Goblin
        CardView cardViewGoblin = view.findViewById(R.id.cdgoblin);
        // Tambahkan onClickListener untuk CardView Goblin
        cardViewGoblin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainGoblin saat CardView Goblin diklik
                Intent intent = new Intent(getActivity(), MainGoblin.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk The Legend
        CardView cardViewTheLegend = view.findViewById(R.id.cdthelegend);
        // Tambahkan onClickListener untuk CardView The Legend
        cardViewTheLegend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainTheLegend saat CardView The Legend diklik
                Intent intent = new Intent(getActivity(), MainTheLegend.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk Melancholia
        CardView cardViewMelancholia = view.findViewById(R.id.cdmelancholia);
        // Tambahkan onClickListener untuk CardView Melancholia
        cardViewMelancholia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainMelancholia saat CardView Melancholia diklik
                Intent intent = new Intent(getActivity(), MainMelancholia.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk Crash Landing on You
        CardView cardViewCrashLanding = view.findViewById(R.id.cdcloy);
        // Tambahkan onClickListener untuk CardView Crash Landing on You
        cardViewCrashLanding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainCrashLanding saat CardView Crash Landing on You diklik
                Intent intent = new Intent(getActivity(), MainCrashLanding.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk Meteor Garden
        CardView cardViewMeteorGarden = view.findViewById(R.id.cdmeteor);
        // Tambahkan onClickListener untuk CardView Meteor Garden
        cardViewMeteorGarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainMeteorGarden saat CardView Meteor Garden diklik
                Intent intent = new Intent(getActivity(), MainMeteorGarden.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk Scarlet Heart
        CardView cardViewScarletHeart = view.findViewById(R.id.cdscarlet);
        // Tambahkan onClickListener untuk CardView Scarlet Heart
        cardViewScarletHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainScarletHeart saat CardView Scarlet Heart diklik
                Intent intent = new Intent(getActivity(), MainScarletHeart.class);
                startActivity(intent);
            }
        });

        // Hubungkan CardView untuk True Beauty
        CardView cardViewTrueBeauty = view.findViewById(R.id.cdtruebeauty);
        // Tambahkan onClickListener untuk CardView True Beauty
        cardViewTrueBeauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuka MainTrueBeauty saat CardView True Beauty diklik
                Intent intent = new Intent(getActivity(), MainTrueBeauty.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
