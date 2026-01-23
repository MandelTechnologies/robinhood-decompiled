package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.RhCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class IncludeAnalystReportSectionBinding implements ViewBinding {
    public final RhTextView analystReportsSectionBodyTxt;
    public final ImageView analystReportsSectionCaretImg;
    public final ImageView analystReportsSectionIconImg;
    public final RhTextView analystReportsSectionTitleTxt;
    private final RhCardView rootView;

    private IncludeAnalystReportSectionBinding(RhCardView rhCardView, RhTextView rhTextView, ImageView imageView, ImageView imageView2, RhTextView rhTextView2) {
        this.rootView = rhCardView;
        this.analystReportsSectionBodyTxt = rhTextView;
        this.analystReportsSectionCaretImg = imageView;
        this.analystReportsSectionIconImg = imageView2;
        this.analystReportsSectionTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhCardView getRoot() {
        return this.rootView;
    }

    public static IncludeAnalystReportSectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAnalystReportSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_analyst_report_section, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAnalystReportSectionBinding bind(View view) {
        int i = C15314R.id.analyst_reports_section_body_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C15314R.id.analyst_reports_section_caret_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C15314R.id.analyst_reports_section_icon_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C15314R.id.analyst_reports_section_title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new IncludeAnalystReportSectionBinding((RhCardView) view, rhTextView, imageView, imageView2, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
