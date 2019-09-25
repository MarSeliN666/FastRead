package com.example.fastread;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class WriteFragment extends Fragment {

    public WriteFragment() {
    }

    public static WriteFragment newInstance() {
        return new WriteFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.write_layout, container, false);
    }
}