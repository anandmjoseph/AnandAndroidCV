package com.cv.anandmjoseph.anandcv.data;

import com.cv.anandmjoseph.anandcv.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anand M Joseph on 1/6/2018.
 */

public class ExperienceData {

    public  int company_name;
    public int company_desiganation;
    public int role_detail;
    public int working_period;
    public int company_photoId;

    public  ExperienceData(int name, int desiganation,int detail,int period, int photoId) {
        this.company_name = name;
        this.company_desiganation = desiganation;
        this.role_detail=detail;
        this.working_period=period;
        this.company_photoId = photoId;
    }

    public int getCompany_name() {
        return this.company_name;
    }

    public int getCompany_desiganation() {
        return this.company_desiganation;
    }

    public int getRole_detail() {
        return this.role_detail;
    }

    public int getWorking_period() {
        return this.working_period;
    }

    public int getCompany_photoId() {
        return this.company_photoId;
    }

    public void setCompany_name(int company_name) {
        this.company_name = company_name;
    }

    public void setCompany_desiganation(int company_desiganation) {
        this.company_desiganation = company_desiganation;
    }

    public void setRole_detail(int role_detail) {
        this.role_detail = role_detail;
    }

    public void setWorking_period(int working_period) {
        this.working_period = working_period;
    }

    public void setCompany_photoId(int company_photoId) {
        this.company_photoId = company_photoId;
    }


}
