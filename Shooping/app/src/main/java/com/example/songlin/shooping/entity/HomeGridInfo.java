package com.example.songlin.shooping.entity;

import android.support.annotation.StringRes;

/**
 * Created by songlin on 27/01/2018.
 */

public class HomeGridInfo {
    private @StringRes int gridIcon;
    private String gridTitle;

    public HomeGridInfo(int gridIcon,String gridTitle) {
        this.gridIcon = gridIcon;
        this.gridTitle = gridTitle;
    }

    public int getGridIcon() {
        return gridIcon;
    }

    public void setGridIcon(int gridIcon) {
        this.gridIcon = gridIcon;
    }

    public String getGridTitle() {
        return gridTitle;
    }

    public void setGridTitle(String gridTitle) {
        this.gridTitle = gridTitle;
    }
}
