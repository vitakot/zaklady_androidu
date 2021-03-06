package com.kurzandroidu.zakladyandroidu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTabSupport extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        Bundle args = getArguments();
        String tag = "";
        int color = 0;

        if (args != null)
            tag = getArguments().getString("tag");
        else if (savedInstanceState != null) {
            tag = savedInstanceState.getString("tag");
        }

        final View view = inflater.inflate(R.layout.fragment_tab, container,
                false);
        ((TextView) view.findViewById(R.id.textViewFragmentNumber))
                .setText(tag);

        if (tag.equals("Tab1"))
            color = Color.rgb(255, 0, 0);
        else if (tag.equals("Tab2"))
            color = Color.rgb(0, 255, 0);
        else
            color = Color.rgb(0, 0, 255);

        view.setBackgroundColor(color);
        return view;
    }
}
