package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsCheckBox;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdCheckboxRow;

/* loaded from: classes8.dex */
public final class RowSdCheckboxBinding implements ViewBinding {
    private final SdCheckboxRow rootView;
    public final RhTextView sdCheckboxLabel;
    public final SdCheckboxRow sdCheckboxSubComponentView;
    public final NewRdsCheckBox sdCheckboxWidget;

    private RowSdCheckboxBinding(SdCheckboxRow sdCheckboxRow, RhTextView rhTextView, SdCheckboxRow sdCheckboxRow2, NewRdsCheckBox newRdsCheckBox) {
        this.rootView = sdCheckboxRow;
        this.sdCheckboxLabel = rhTextView;
        this.sdCheckboxSubComponentView = sdCheckboxRow2;
        this.sdCheckboxWidget = newRdsCheckBox;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdCheckboxRow getRoot() {
        return this.rootView;
    }

    public static RowSdCheckboxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdCheckboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_checkbox, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdCheckboxBinding bind(View view) {
        int i = C20335R.id.sd_checkbox_label;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            SdCheckboxRow sdCheckboxRow = (SdCheckboxRow) view;
            int i2 = C20335R.id.sd_checkbox_widget;
            NewRdsCheckBox newRdsCheckBox = (NewRdsCheckBox) ViewBindings.findChildViewById(view, i2);
            if (newRdsCheckBox != null) {
                return new RowSdCheckboxBinding(sdCheckboxRow, rhTextView, sdCheckboxRow, newRdsCheckBox);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
