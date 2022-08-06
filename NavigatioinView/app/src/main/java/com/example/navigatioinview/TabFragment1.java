package com.example.navigatioinview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigatioinview.databinding.FragmentFirstBinding;

public class TabFragment1 extends Fragment {

    private FragmentFirstBinding binding = null;

    private static final String ARG_PARAM1 = "param1";

    private int mParam1;

    public TabFragment1() {
        // Required empty public constructor
    }

    public static TabFragment1 newInstance(int param1) {
        TabFragment1 fragment = new TabFragment1();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.textView.setText("Página " + mParam1);
    }
}