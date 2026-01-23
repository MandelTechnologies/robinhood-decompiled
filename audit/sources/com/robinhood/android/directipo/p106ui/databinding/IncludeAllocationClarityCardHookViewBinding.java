package com.robinhood.android.directipo.p106ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.p106ui.C14228R;
import com.robinhood.android.directipo.p106ui.allocation.DirectIpoAllocationClarityCardHookView;

/* loaded from: classes27.dex */
public final class IncludeAllocationClarityCardHookViewBinding implements ViewBinding {
    private final DirectIpoAllocationClarityCardHookView rootView;

    private IncludeAllocationClarityCardHookViewBinding(DirectIpoAllocationClarityCardHookView directIpoAllocationClarityCardHookView) {
        this.rootView = directIpoAllocationClarityCardHookView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DirectIpoAllocationClarityCardHookView getRoot() {
        return this.rootView;
    }

    public static IncludeAllocationClarityCardHookViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAllocationClarityCardHookViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14228R.layout.include_allocation_clarity_card_hook_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAllocationClarityCardHookViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAllocationClarityCardHookViewBinding((DirectIpoAllocationClarityCardHookView) view);
    }
}
