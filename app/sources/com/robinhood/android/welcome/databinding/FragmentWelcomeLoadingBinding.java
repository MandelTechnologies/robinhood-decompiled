package com.robinhood.android.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.welcome.C31456R;

/* loaded from: classes9.dex */
public final class FragmentWelcomeLoadingBinding implements ViewBinding {
    public final RdsProgressBar loadingViewProgressBar;
    private final RelativeLayout rootView;

    private FragmentWelcomeLoadingBinding(RelativeLayout relativeLayout, RdsProgressBar rdsProgressBar) {
        this.rootView = relativeLayout;
        this.loadingViewProgressBar = rdsProgressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWelcomeLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWelcomeLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31456R.layout.fragment_welcome_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWelcomeLoadingBinding bind(View view) {
        int i = C31456R.id.loading_view_progress_bar;
        RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
        if (rdsProgressBar != null) {
            return new FragmentWelcomeLoadingBinding((RelativeLayout) view, rdsProgressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
