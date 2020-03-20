package fr.esilv.lagrange_nguyen_finalproject.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import fr.esilv.lagrange_nguyen_finalproject.R;
import fr.esilv.lagrange_nguyen_finalproject.SeasonsTrailers;

public class Season3Fragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_season3, container, false);
        Button btn_trailer = (Button) root.findViewById(R.id.button_s3);
        btn_trailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(getActivity(), SeasonsTrailers.class);
                startActivity(Intent);
            }
        });
        return root;
    }
}
