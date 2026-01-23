package com.robinhood.android.recurring.hub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recurring.hub.C26221R;

/* loaded from: classes11.dex */
public final class IncludeHistoryListDisclaimerRowBinding implements ViewBinding {
    private final RhTextView rootView;

    private IncludeHistoryListDisclaimerRowBinding(RhTextView rhTextView) {
        this.rootView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeHistoryListDisclaimerRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeHistoryListDisclaimerRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26221R.layout.include_history_list_disclaimer_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeHistoryListDisclaimerRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeHistoryListDisclaimerRowBinding((RhTextView) view);
    }
}
