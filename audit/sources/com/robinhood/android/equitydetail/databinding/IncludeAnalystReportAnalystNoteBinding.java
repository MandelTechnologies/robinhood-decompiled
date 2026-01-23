package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.RhCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class IncludeAnalystReportAnalystNoteBinding implements ViewBinding {
    public final RhTextView analystReportsNoteBodyTxt;
    public final RhTextView analystReportsNoteDateTxt;
    public final RhTextView analystReportsNoteTitleTxt;
    private final RhCardView rootView;

    private IncludeAnalystReportAnalystNoteBinding(RhCardView rhCardView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = rhCardView;
        this.analystReportsNoteBodyTxt = rhTextView;
        this.analystReportsNoteDateTxt = rhTextView2;
        this.analystReportsNoteTitleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhCardView getRoot() {
        return this.rootView;
    }

    public static IncludeAnalystReportAnalystNoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAnalystReportAnalystNoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_analyst_report_analyst_note, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAnalystReportAnalystNoteBinding bind(View view) {
        int i = C15314R.id.analyst_reports_note_body_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C15314R.id.analyst_reports_note_date_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C15314R.id.analyst_reports_note_title_txt;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    return new IncludeAnalystReportAnalystNoteBinding((RhCardView) view, rhTextView, rhTextView2, rhTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
