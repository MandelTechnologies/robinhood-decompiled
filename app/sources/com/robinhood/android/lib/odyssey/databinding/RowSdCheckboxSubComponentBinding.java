package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsCheckBox;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdCheckboxView;

/* loaded from: classes8.dex */
public final class RowSdCheckboxSubComponentBinding implements ViewBinding {
    private final SdCheckboxView rootView;
    public final RhTextView sdCheckboxLabel;
    public final SdCheckboxView sdCheckboxSubComponentView;
    public final LegacyRdsCheckBox sdCheckboxWidget;

    private RowSdCheckboxSubComponentBinding(SdCheckboxView sdCheckboxView, RhTextView rhTextView, SdCheckboxView sdCheckboxView2, LegacyRdsCheckBox legacyRdsCheckBox) {
        this.rootView = sdCheckboxView;
        this.sdCheckboxLabel = rhTextView;
        this.sdCheckboxSubComponentView = sdCheckboxView2;
        this.sdCheckboxWidget = legacyRdsCheckBox;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdCheckboxView getRoot() {
        return this.rootView;
    }

    public static RowSdCheckboxSubComponentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdCheckboxSubComponentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_checkbox_sub_component, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdCheckboxSubComponentBinding bind(View view) {
        int i = C20335R.id.sd_checkbox_label;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            SdCheckboxView sdCheckboxView = (SdCheckboxView) view;
            int i2 = C20335R.id.sd_checkbox_widget;
            LegacyRdsCheckBox legacyRdsCheckBox = (LegacyRdsCheckBox) ViewBindings.findChildViewById(view, i2);
            if (legacyRdsCheckBox != null) {
                return new RowSdCheckboxSubComponentBinding(sdCheckboxView, rhTextView, sdCheckboxView, legacyRdsCheckBox);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
