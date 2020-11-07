package com.example.fragmentsapp.ui.home;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerItemDecoration extends RecyclerView.ItemDecoration {
    public RecyclerItemDecoration(){

    }

    public interface SectionCallback{
        public boolean isSectionHeader(int pos);
        public String getSectionHeaderName(int pos);    }
}
