package com.robinhood.android.psp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.psp.C25966R;
import com.robinhood.android.psp.ProgramDetailCardView;

/* loaded from: classes11.dex */
public final class IncludeProgramDetailsCardViewBinding implements ViewBinding {
    public final ProgramDetailCardView giftDetailsCardView;
    private final ProgramDetailCardView rootView;

    private IncludeProgramDetailsCardViewBinding(ProgramDetailCardView programDetailCardView, ProgramDetailCardView programDetailCardView2) {
        this.rootView = programDetailCardView;
        this.giftDetailsCardView = programDetailCardView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProgramDetailCardView getRoot() {
        return this.rootView;
    }

    public static IncludeProgramDetailsCardViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeProgramDetailsCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25966R.layout.include_program_details_card_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeProgramDetailsCardViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProgramDetailCardView programDetailCardView = (ProgramDetailCardView) view;
        return new IncludeProgramDetailsCardViewBinding(programDetailCardView, programDetailCardView);
    }
}
