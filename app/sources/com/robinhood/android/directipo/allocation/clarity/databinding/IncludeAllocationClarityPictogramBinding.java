package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class IncludeAllocationClarityPictogramBinding implements ViewBinding {
    public final RdsPogView allocationClarityPictogramPog;
    private final FrameLayout rootView;

    private IncludeAllocationClarityPictogramBinding(FrameLayout frameLayout, RdsPogView rdsPogView) {
        this.rootView = frameLayout;
        this.allocationClarityPictogramPog = rdsPogView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeAllocationClarityPictogramBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAllocationClarityPictogramBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14172R.layout.include_allocation_clarity_pictogram, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAllocationClarityPictogramBinding bind(View view) {
        int i = C14172R.id.allocation_clarity_pictogram_pog;
        RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
        if (rdsPogView != null) {
            return new IncludeAllocationClarityPictogramBinding((FrameLayout) view, rdsPogView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
