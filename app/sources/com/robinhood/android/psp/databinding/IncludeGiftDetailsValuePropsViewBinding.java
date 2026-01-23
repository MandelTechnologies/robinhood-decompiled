package com.robinhood.android.psp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.psp.C25966R;
import com.robinhood.android.psp.ProgramDetailValuePropsView;

/* loaded from: classes11.dex */
public final class IncludeGiftDetailsValuePropsViewBinding implements ViewBinding {
    public final ProgramDetailValuePropsView giftDetailsValuePropsView;
    private final ProgramDetailValuePropsView rootView;

    private IncludeGiftDetailsValuePropsViewBinding(ProgramDetailValuePropsView programDetailValuePropsView, ProgramDetailValuePropsView programDetailValuePropsView2) {
        this.rootView = programDetailValuePropsView;
        this.giftDetailsValuePropsView = programDetailValuePropsView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProgramDetailValuePropsView getRoot() {
        return this.rootView;
    }

    public static IncludeGiftDetailsValuePropsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeGiftDetailsValuePropsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25966R.layout.include_gift_details_value_props_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeGiftDetailsValuePropsViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProgramDetailValuePropsView programDetailValuePropsView = (ProgramDetailValuePropsView) view;
        return new IncludeGiftDetailsValuePropsViewBinding(programDetailValuePropsView, programDetailValuePropsView);
    }
}
