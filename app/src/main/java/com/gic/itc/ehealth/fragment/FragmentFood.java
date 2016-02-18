package com.gic.itc.ehealth.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gic.itc.ehealth.R;

/**
 * Created by LAY Leangsros on 18/02/2016.
 */
public class FragmentFood extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.food_fragment_layout, container, false);

        return view;
    }
}
