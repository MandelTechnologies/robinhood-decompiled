package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.FrequencySelectionRowView;

/* loaded from: classes9.dex */
public final class IncludeFrequencySelectionRowViewBinding implements ViewBinding {
    private final FrequencySelectionRowView rootView;

    private IncludeFrequencySelectionRowViewBinding(FrequencySelectionRowView frequencySelectionRowView) {
        this.rootView = frequencySelectionRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrequencySelectionRowView getRoot() {
        return this.rootView;
    }

    public static IncludeFrequencySelectionRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeFrequencySelectionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.include_frequency_selection_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeFrequencySelectionRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeFrequencySelectionRowViewBinding((FrequencySelectionRowView) view);
    }
}
