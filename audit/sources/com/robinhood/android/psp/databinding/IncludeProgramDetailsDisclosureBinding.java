package com.robinhood.android.psp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.psp.C25966R;
import com.robinhood.android.psp.ProgramDetailDisclosureView;

/* loaded from: classes11.dex */
public final class IncludeProgramDetailsDisclosureBinding implements ViewBinding {
    private final ProgramDetailDisclosureView rootView;

    private IncludeProgramDetailsDisclosureBinding(ProgramDetailDisclosureView programDetailDisclosureView) {
        this.rootView = programDetailDisclosureView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProgramDetailDisclosureView getRoot() {
        return this.rootView;
    }

    public static IncludeProgramDetailsDisclosureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeProgramDetailsDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25966R.layout.include_program_details_disclosure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeProgramDetailsDisclosureBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeProgramDetailsDisclosureBinding((ProgramDetailDisclosureView) view);
    }
}
