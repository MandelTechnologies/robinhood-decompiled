package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.SectionHeaderView;

/* loaded from: classes5.dex */
public final class IncludeSectionHeaderViewBinding implements ViewBinding {
    private final SectionHeaderView rootView;

    private IncludeSectionHeaderViewBinding(SectionHeaderView sectionHeaderView) {
        this.rootView = sectionHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SectionHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeSectionHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSectionHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_section_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSectionHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSectionHeaderViewBinding((SectionHeaderView) view);
    }
}
