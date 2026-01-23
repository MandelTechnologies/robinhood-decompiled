package com.robinhood.android.educationtour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.educationtour.C14469R;

/* loaded from: classes7.dex */
public final class IncludeEducationTourToolbarTxtBinding implements ViewBinding {
    public final RhTextView educationTourToolbarTxt;
    private final RhTextView rootView;

    private IncludeEducationTourToolbarTxtBinding(RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = rhTextView;
        this.educationTourToolbarTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeEducationTourToolbarTxtBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationTourToolbarTxtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14469R.layout.include_education_tour_toolbar_txt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationTourToolbarTxtBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RhTextView rhTextView = (RhTextView) view;
        return new IncludeEducationTourToolbarTxtBinding(rhTextView, rhTextView);
    }
}
