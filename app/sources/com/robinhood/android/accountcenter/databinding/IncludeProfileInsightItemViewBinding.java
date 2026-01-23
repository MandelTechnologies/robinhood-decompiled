package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.ProfileInsightItemView;

/* loaded from: classes24.dex */
public final class IncludeProfileInsightItemViewBinding implements ViewBinding {
    private final ProfileInsightItemView rootView;

    private IncludeProfileInsightItemViewBinding(ProfileInsightItemView profileInsightItemView) {
        this.rootView = profileInsightItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProfileInsightItemView getRoot() {
        return this.rootView;
    }

    public static IncludeProfileInsightItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeProfileInsightItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_profile_insight_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeProfileInsightItemViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeProfileInsightItemViewBinding((ProfileInsightItemView) view);
    }
}
