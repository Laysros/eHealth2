package com.gic.itc.ehealth.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gic.itc.ehealth.R;
import com.gic.itc.ehealth.adapter.CompetitionAdapter;
import com.gic.itc.ehealth.model.Competitor;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by LAY Leangsros on 18/02/2016.
 */
public class FragmentCompititions extends Fragment {


    @Bind(R.id.recycler)
    RecyclerView mRecyclerView;
    private List<Competitor> mCompetitorList;
    private CompetitionAdapter mCompetitionAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.competitions_fragment_layout, container, false);
        mCompetitorList = new ArrayList<>();
        for(int i=0; i<10; i++){
            mCompetitorList.add(new Competitor("aa", "Group" + i, i*i+2+i*3));
        }
        mCompetitionAdapter = new CompetitionAdapter(getActivity(), mCompetitorList);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mCompetitionAdapter);
        return view;
    }
}
