package com.robinhood.android.common.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.search.C11798R;
import com.robinhood.android.common.search.p087ui.RecurringChipsView;

/* loaded from: classes2.dex */
public final class IncludeRecurringChipsViewBinding implements ViewBinding {
    private final RecurringChipsView rootView;

    private IncludeRecurringChipsViewBinding(RecurringChipsView recurringChipsView) {
        this.rootView = recurringChipsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecurringChipsView getRoot() {
        return this.rootView;
    }

    public static IncludeRecurringChipsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRecurringChipsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11798R.layout.include_recurring_chips_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRecurringChipsViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRecurringChipsViewBinding((RecurringChipsView) view);
    }
}
