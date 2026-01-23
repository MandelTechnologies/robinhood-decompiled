package com.robinhood.android.educationtour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.educationtour.C14469R;
import com.robinhood.android.educationtour.EducationTourEntryPointCard;

/* loaded from: classes7.dex */
public final class IncludeEducationTourEntryPointCardBinding implements ViewBinding {
    private final EducationTourEntryPointCard rootView;

    private IncludeEducationTourEntryPointCardBinding(EducationTourEntryPointCard educationTourEntryPointCard) {
        this.rootView = educationTourEntryPointCard;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EducationTourEntryPointCard getRoot() {
        return this.rootView;
    }

    public static IncludeEducationTourEntryPointCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationTourEntryPointCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14469R.layout.include_education_tour_entry_point_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationTourEntryPointCardBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationTourEntryPointCardBinding((EducationTourEntryPointCard) view);
    }
}
