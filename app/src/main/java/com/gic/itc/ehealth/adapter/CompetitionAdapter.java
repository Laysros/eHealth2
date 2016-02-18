package com.gic.itc.ehealth.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.gic.itc.ehealth.R;
import com.gic.itc.ehealth.model.Competitor;


import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by LAY Leangsros on 21/12/2015.
 */

public class CompetitionAdapter extends RecyclerView.Adapter<CompetitionAdapter.MyViewHolder> {
    private Context mContext;
    private LayoutInflater inflater;
    private List<Competitor> mCompetitorList;
    private int lastPosition=0;



    public CompetitionAdapter(Context mContext, List<Competitor> mCompetitorList) {
        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);
        this.mCompetitorList = mCompetitorList;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.competitor_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Competitor competitor = mCompetitorList.get(position);
        Log.d("Name:" + competitor.getName(), " GG");
        holder.mName.setText(competitor.getName());
        holder.mScore.setText(competitor.getScore() + "");

    }

    @Override
    public int getItemCount() {
        return mCompetitorList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder{
        @Bind(R.id.imgLogo)
        ImageView mLogo;
        @Bind(R.id.tName) TextView mName;
        @Bind(R.id.tScore) TextView mScore;




        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
