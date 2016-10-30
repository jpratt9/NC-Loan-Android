package me.floatr.ui.fragments;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import me.floatr.R;
import me.floatr.ui.activities.MainActivity;
import me.floatr.util.PreferenceNames;

public class OfferDetailsFragment extends Fragment implements View.OnClickListener {

    private View view;
    private MainActivity mainActivity;
    private SharedPreferences mainPref, groupPref;
    Spinner dropdown;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainActivity = (MainActivity) getActivity();
        mainPref = mainActivity.getSharedPreferences(PreferenceNames.MAIN_PREFS_NAME, 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.createoffer_fragment,
                container, false);
        mainActivity.getSupportActionBar().setTitle("Create Loan Offer");


        this.view = view;
        return view;
    }

    @Override
    public void onClick(View v) {
//        if (v == view.findViewById(R.id.button)) {
//        }
    }
}