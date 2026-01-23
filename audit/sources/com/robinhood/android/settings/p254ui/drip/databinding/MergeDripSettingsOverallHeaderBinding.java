package com.robinhood.android.settings.p254ui.drip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.p254ui.drip.C28363R;

/* loaded from: classes5.dex */
public final class MergeDripSettingsOverallHeaderBinding implements ViewBinding {
    public final RhTextView headerDescription;
    public final RdsToggleView headerToggle;
    private final View rootView;

    private MergeDripSettingsOverallHeaderBinding(View view, RhTextView rhTextView, RdsToggleView rdsToggleView) {
        this.rootView = view;
        this.headerDescription = rhTextView;
        this.headerToggle = rdsToggleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeDripSettingsOverallHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28363R.layout.merge_drip_settings_overall_header, viewGroup);
        return bind(viewGroup);
    }

    public static MergeDripSettingsOverallHeaderBinding bind(View view) {
        int i = C28363R.id.header_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28363R.id.header_toggle;
            RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
            if (rdsToggleView != null) {
                return new MergeDripSettingsOverallHeaderBinding(view, rhTextView, rdsToggleView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
