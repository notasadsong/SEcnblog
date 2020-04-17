package com.example.my_test6.ui.question;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my_test6.R;

import java.util.ArrayList;

public class zuixin_fragment extends Fragment {

    private RecyclerView recyclerView;
    private recycler_adapter mAdapter;
    private LinearLayoutManager layoutManager;
    ArrayList<list_item> mdata;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.problem_view_zuixin, container, false);

        recyclerView = (RecyclerView) root.findViewById(R.id.zuixin_recyclerview);
        initdata();
        layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new recycler_adapter(getActivity(),mdata);
        recyclerView.setAdapter(mAdapter);

        return root;
    }

    void initdata() {
        mdata = new ArrayList<>();
        for(int i=0;i<20;i++) {
            list_item l = new list_item("this is title" + i);
            mdata.add(l);
        }
    }
}
