package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.ProfileAccountBreakdownView;

/* loaded from: classes24.dex */
public final class IncludeProfileAccountBreakdownViewBinding implements ViewBinding {
    private final ProfileAccountBreakdownView rootView;

    private IncludeProfileAccountBreakdownViewBinding(ProfileAccountBreakdownView profileAccountBreakdownView) {
        this.rootView = profileAccountBreakdownView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProfileAccountBreakdownView getRoot() {
        return this.rootView;
    }

    public static IncludeProfileAccountBreakdownViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeProfileAccountBreakdownViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_profile_account_breakdown_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeProfileAccountBreakdownViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeProfileAccountBreakdownViewBinding((ProfileAccountBreakdownView) view);
    }
}
