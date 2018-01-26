package com.cv.anandmjoseph.anandcv.adapter

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.cv.anandmjoseph.anandcv.R
import com.cv.anandmjoseph.anandcv.adapter.ExperienceAdapter.ExperienceViewHolder
import com.cv.anandmjoseph.anandcv.customwidget.RobotoBoldTextView
import com.cv.anandmjoseph.anandcv.customwidget.RobotoLightTextView
import com.cv.anandmjoseph.anandcv.customwidget.RobotoMediumEditText
import com.cv.anandmjoseph.anandcv.customwidget.RobotoMediumTextView
import com.cv.anandmjoseph.anandcv.data.ExperienceData

/**
 * Created by Anand M Joseph on 1/6/2018.
 */

class ExperienceAdapter(private val mExperienceDatalist: List<ExperienceData>) : RecyclerView.Adapter<ExperienceAdapter.ExperienceViewHolder>() {

    class ExperienceViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var cv: CardView
        internal var company_name: TextView
        internal var company_period: TextView
        internal var company_desiganation: TextView
        internal var company_role: TextView
        internal var personPhoto: ImageView

        init {
            cv = itemView.findViewById<View>(R.id.exp_cv) as CardView
            personPhoto = itemView.findViewById<View>(R.id.thumbnail) as ImageView
            company_name = itemView.findViewById<View>(R.id.company_name) as RobotoBoldTextView
            company_period = itemView.findViewById<View>(R.id.company_period) as RobotoMediumTextView
            company_desiganation = itemView.findViewById<View>(R.id.company_desiganation) as RobotoMediumTextView
            company_role = itemView.findViewById<View>(R.id.company_role) as RobotoLightTextView
        }
    }

    override fun getItemCount(): Int {
        return mExperienceDatalist.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ExperienceViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.content_experince_iteam, viewGroup, false)
        return ExperienceViewHolder(v)
    }

    override fun onBindViewHolder(holder: ExperienceViewHolder, position: Int) {
        val mExperienceData = mExperienceDatalist[position]
        holder.company_name.setText(mExperienceData.company_name)
        holder.company_period.setText(mExperienceData.working_period)
        holder.company_role.setText(mExperienceData.company_desiganation)
        holder.company_desiganation.setText(mExperienceData.role_detail)
        holder.personPhoto.setImageResource(mExperienceData.company_photoId)
    }

}