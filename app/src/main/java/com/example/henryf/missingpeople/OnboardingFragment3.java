package com.example.henryf.missingpeople;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Francisco Rubio on 5/14/2016.
 */
public class OnboardingFragment3 extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle s) {
        return inflater.inflate(
                R.layout.activity_onboarding_screen3,
                container,
                false
        );
    }
}
