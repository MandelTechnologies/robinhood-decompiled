package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.prefilled.PreFilledFormIntroRowView;

/* loaded from: classes27.dex */
public final class IncludePreFilledFormIntroRowBinding implements ViewBinding {
    private final PreFilledFormIntroRowView rootView;

    private IncludePreFilledFormIntroRowBinding(PreFilledFormIntroRowView preFilledFormIntroRowView) {
        this.rootView = preFilledFormIntroRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public PreFilledFormIntroRowView getRoot() {
        return this.rootView;
    }

    public static IncludePreFilledFormIntroRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludePreFilledFormIntroRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.include_pre_filled_form_intro_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludePreFilledFormIntroRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludePreFilledFormIntroRowBinding((PreFilledFormIntroRowView) view);
    }
}
