package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.advanced.alert.view.AdvancedAlertSettingItemRowView;

/* loaded from: classes24.dex */
public final class IncludeAdvancedAlertItemRowViewBinding implements ViewBinding {
    private final AdvancedAlertSettingItemRowView rootView;

    private IncludeAdvancedAlertItemRowViewBinding(AdvancedAlertSettingItemRowView advancedAlertSettingItemRowView) {
        this.rootView = advancedAlertSettingItemRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AdvancedAlertSettingItemRowView getRoot() {
        return this.rootView;
    }

    public static IncludeAdvancedAlertItemRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAdvancedAlertItemRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8387R.layout.include_advanced_alert_item_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAdvancedAlertItemRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAdvancedAlertItemRowViewBinding((AdvancedAlertSettingItemRowView) view);
    }
}
