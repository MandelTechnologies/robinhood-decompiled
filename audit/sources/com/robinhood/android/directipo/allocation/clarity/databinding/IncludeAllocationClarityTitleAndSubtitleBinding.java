package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class IncludeAllocationClarityTitleAndSubtitleBinding implements ViewBinding {
    public final RhTextView allocationClaritySubtitle;
    public final RhTextView allocationClarityTitle;
    private final LinearLayout rootView;

    private IncludeAllocationClarityTitleAndSubtitleBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.allocationClaritySubtitle = rhTextView;
        this.allocationClarityTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeAllocationClarityTitleAndSubtitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAllocationClarityTitleAndSubtitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_allocation_clarity_title_and_subtitle, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAllocationClarityTitleAndSubtitleBinding bind(View view) {
        int i = C14172R.id.allocation_clarity_subtitle;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14172R.id.allocation_clarity_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new IncludeAllocationClarityTitleAndSubtitleBinding((LinearLayout) view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
