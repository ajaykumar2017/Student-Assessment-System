package com.tecent.student_assessment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DashboardFragment extends Fragment {
    CardView cv_prepare, cv_prep_materials, cv_results, cv_quizes, cv_tutorials, cv_useful_links;
    @Nullable
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dashboard_fragment, container, false);
        cv_prepare=view.findViewById(R.id.prepare);
        cv_prep_materials=view.findViewById(R.id.prep_materials);
        cv_results=view.findViewById(R.id.results);
        cv_quizes=view.findViewById(R.id.quizes);
        cv_tutorials=view.findViewById(R.id.tutorials);
        cv_useful_links=view.findViewById(R.id.useful_links);

        cv_results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intSubResult=new Intent(getActivity(),ShowResultFromDashboard.class);
                startActivity(intSubResult);
            }
        });




        return view;
    }
}
