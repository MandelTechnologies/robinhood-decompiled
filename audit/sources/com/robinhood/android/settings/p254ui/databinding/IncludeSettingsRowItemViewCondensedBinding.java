package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.SettingsRowItemView;

/* loaded from: classes5.dex */
public final class IncludeSettingsRowItemViewCondensedBinding implements ViewBinding {
    private final SettingsRowItemView rootView;

    private IncludeSettingsRowItemViewCondensedBinding(SettingsRowItemView settingsRowItemView) {
        this.rootView = settingsRowItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SettingsRowItemView getRoot() {
        return this.rootView;
    }

    public static IncludeSettingsRowItemViewCondensedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSettingsRowItemViewCondensedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_settings_row_item_view_condensed, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSettingsRowItemViewCondensedBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSettingsRowItemViewCondensedBinding((SettingsRowItemView) view);
    }
}
