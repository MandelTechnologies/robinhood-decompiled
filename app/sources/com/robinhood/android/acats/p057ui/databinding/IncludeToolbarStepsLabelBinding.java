package com.robinhood.android.acats.p057ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class IncludeToolbarStepsLabelBinding implements ViewBinding {
    private final RhTextView rootView;
    public final RhTextView stepsLabelTxt;

    private IncludeToolbarStepsLabelBinding(RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = rhTextView;
        this.stepsLabelTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeToolbarStepsLabelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeToolbarStepsLabelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7686R.layout.include_toolbar_steps_label, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeToolbarStepsLabelBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RhTextView rhTextView = (RhTextView) view;
        return new IncludeToolbarStepsLabelBinding(rhTextView, rhTextView);
    }
}
