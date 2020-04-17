package com.example.my_test6.ui.edu;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.my_test6.R;

public class EduFragment extends Fragment {
    private EduViewModel eduViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        eduViewModel =
                ViewModelProviders.of(this).get(EduViewModel.class);
        View root = inflater.inflate(R.layout.fragment_edu, container, false);
        return root;
    }
}
