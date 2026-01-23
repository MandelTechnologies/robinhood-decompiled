package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.overview.EducationOverviewItemView;

/* loaded from: classes6.dex */
public final class IncludeEducationOverviewItemBinding implements ViewBinding {
    private final EducationOverviewItemView rootView;

    private IncludeEducationOverviewItemBinding(EducationOverviewItemView educationOverviewItemView) {
        this.rootView = educationOverviewItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EducationOverviewItemView getRoot() {
        return this.rootView;
    }

    public static IncludeEducationOverviewItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationOverviewItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.include_education_overview_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationOverviewItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationOverviewItemBinding((EducationOverviewItemView) view);
    }
}
