package com.example.fastread;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class ReadFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.read_layout, container, false);
    }

    public ReadFragment() {

    }

    public static ReadFragment newInstance() {
        return new ReadFragment();
    }
}
