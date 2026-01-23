package com.robinhood.android.directipo.allocation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.C14171R;

/* loaded from: classes27.dex */
public final class MergeDirectIpoSummaryStatItemBinding implements ViewBinding {
    public final ImageView directIpoSummaryStatRowIcon;
    public final Space directIpoSummaryStatRowSpace;
    public final RhTextView directIpoSummaryStatRowTitle;
    public final RhTextView directIpoSummaryStatRowValue;
    private final ConstraintLayout rootView;

    private MergeDirectIpoSummaryStatItemBinding(ConstraintLayout constraintLayout, ImageView imageView, Space space, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.directIpoSummaryStatRowIcon = imageView;
        this.directIpoSummaryStatRowSpace = space;
        this.directIpoSummaryStatRowTitle = rhTextView;
        this.directIpoSummaryStatRowValue = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeDirectIpoSummaryStatItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeDirectIpoSummaryStatItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14171R.layout.merge_direct_ipo_summary_stat_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeDirectIpoSummaryStatItemBinding bind(View view) {
        int i = C14171R.id.direct_ipo_summary_stat_row_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C14171R.id.direct_ipo_summary_stat_row_space;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C14171R.id.direct_ipo_summary_stat_row_title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C14171R.id.direct_ipo_summary_stat_row_value;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeDirectIpoSummaryStatItemBinding((ConstraintLayout) view, imageView, space, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
