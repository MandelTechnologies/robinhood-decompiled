package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.SettingsPlaceholderView;

/* loaded from: classes5.dex */
public final class IncludeSettingsPlaceholderItemBinding implements ViewBinding {
    private final SettingsPlaceholderView rootView;
    public final View settingsRowLoadingPrimary;
    public final View settingsRowLoadingSecondary;

    private IncludeSettingsPlaceholderItemBinding(SettingsPlaceholderView settingsPlaceholderView, View view, View view2) {
        this.rootView = settingsPlaceholderView;
        this.settingsRowLoadingPrimary = view;
        this.settingsRowLoadingSecondary = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SettingsPlaceholderView getRoot() {
        return this.rootView;
    }

    public static IncludeSettingsPlaceholderItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSettingsPlaceholderItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_settings_placeholder_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSettingsPlaceholderItemBinding bind(View view) {
        View viewFindChildViewById;
        int i = C28356R.id.settings_row_loading_primary;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C28356R.id.settings_row_loading_secondary))) != null) {
            return new IncludeSettingsPlaceholderItemBinding((SettingsPlaceholderView) view, viewFindChildViewById2, viewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
