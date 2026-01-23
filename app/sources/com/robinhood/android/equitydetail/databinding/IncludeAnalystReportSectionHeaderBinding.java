package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class IncludeAnalystReportSectionHeaderBinding implements ViewBinding {
    private final RhTextView rootView;
    public final RhTextView sectionHeaderTxt;

    private IncludeAnalystReportSectionHeaderBinding(RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = rhTextView;
        this.sectionHeaderTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeAnalystReportSectionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAnalystReportSectionHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_analyst_report_section_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAnalystReportSectionHeaderBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RhTextView rhTextView = (RhTextView) view;
        return new IncludeAnalystReportSectionHeaderBinding(rhTextView, rhTextView);
    }
}
