package com.cv.anandmjoseph.anandcv.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cv.anandmjoseph.anandcv.R;
import com.cv.anandmjoseph.anandcv.customwidget.RobotoBoldTextView;
import com.cv.anandmjoseph.anandcv.customwidget.RobotoLightTextView;
import com.cv.anandmjoseph.anandcv.customwidget.RobotoMediumEditText;
import com.cv.anandmjoseph.anandcv.customwidget.RobotoMediumTextView;
import com.cv.anandmjoseph.anandcv.data.ExperienceData;

import java.util.List;

/**
 * Created by Anand M Joseph on 1/6/2018.
 */

public class ExperienceAdapter extends RecyclerView.Adapter<ExperienceAdapter.ExperienceViewHolder>{

    private List<ExperienceData> mExperienceDatalist;

    public static class ExperienceViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView company_name;
        TextView company_period,company_desiganation;
        TextView company_role;
        ImageView personPhoto;

        ExperienceViewHolder(View itemView) {
            super(itemView);
           cv=(CardView)itemView.findViewById(R.id.exp_cv);
            personPhoto=(ImageView)itemView.findViewById(R.id.thumbnail);
            company_name=(RobotoBoldTextView)itemView.findViewById(R.id.company_name);
            company_period=(RobotoMediumTextView)itemView.findViewById(R.id.company_period);
            company_desiganation=(RobotoMediumTextView)itemView.findViewById(R.id.company_desiganation);
            company_role=(RobotoLightTextView)itemView.findViewById(R.id.company_role);
        }
    }

    public ExperienceAdapter(List<ExperienceData> data){
        this.mExperienceDatalist = data;
    }

    @Override
    public int getItemCount() {
        return mExperienceDatalist.size();
    }

    @Override
    public ExperienceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.content_experince_iteam, viewGroup, false);
        ExperienceViewHolder expvh = new ExperienceViewHolder(v);
        return expvh;
    }

    @Override
    public void onBindViewHolder(ExperienceViewHolder holder, int position) {
        ExperienceData mExperienceData=mExperienceDatalist.get(position);
       holder.company_name.setText(mExperienceData.getCompany_name());
       holder.company_period.setText(mExperienceData.getWorking_period());
       holder.company_role.setText(mExperienceData.getCompany_desiganation());
       holder.company_desiganation.setText(mExperienceData.getRole_detail());
       holder.personPhoto.setImageResource(mExperienceData.getCompany_photoId());
    }

}