package com.example.my_test6.ui.question;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.my_test6.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class QuestionFragment extends Fragment {

    private QuestionViewModel questionViewModel;

    private TabLayout problemtabs;
    private ViewPager viewPager;
    private FloatingActionButton fab;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_question, container, false);

        problemtabs = (TabLayout) root.findViewById(R.id.problemTabs);
        viewPager = (ViewPager) root.findViewById(R.id.view_pager);
        fab = (FloatingActionButton) root.findViewById(R.id.question_fab);

        ArrayList aList = new ArrayList<Fragment>();
        LayoutInflater li = getLayoutInflater();
        aList.add(new zuixin_fragment());
        aList.add(new gaofen_fragment());
        aList.add(new yijiejue_fragment());
        aList.add(new wode_fragment());
        mypageradapter madapter = new mypageradapter(getChildFragmentManager(),aList);
        viewPager.setAdapter(madapter);
        //problemtabs.setTabMode(TabLayout.MODE_SCROLLABLE);
        problemtabs.setupWithViewPager(viewPager);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                        //.setAction("Action", null).show();
                Intent intent = new Intent(getActivity(),writeQuestion_activity.class);
                startActivity(intent);
            }
        });

        return root;
    }


    public class mypageradapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> viewLists;
        private ArrayList<String> tabs = new ArrayList<>();

        public mypageradapter(FragmentManager fm, ArrayList<Fragment> list) {
            super(fm);
            tabs.add("最新");
            tabs.add("高分");
            tabs.add("已解决");
            tabs.add("我的");

            viewLists = list;
        }

        @Override
        public int getCount() {
            return 4;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return viewLists.get(position);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tabs.get(position);
        }
    }

}
