package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.relatedlists.RelatedListsView;

/* loaded from: classes3.dex */
public final class IncludeRelatedIndustryViewBinding implements ViewBinding {
    private final RelatedListsView rootView;

    private IncludeRelatedIndustryViewBinding(RelatedListsView relatedListsView) {
        this.rootView = relatedListsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelatedListsView getRoot() {
        return this.rootView;
    }

    public static IncludeRelatedIndustryViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRelatedIndustryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_related_industry_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRelatedIndustryViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRelatedIndustryViewBinding((RelatedListsView) view);
    }
}
