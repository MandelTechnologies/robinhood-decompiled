package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdInputRow;

/* loaded from: classes8.dex */
public final class RowSdInputBinding implements ViewBinding {
    private final SdInputRow rootView;
    public final SdInputRow sdInputRow;
    public final RdsFormattedEditText sdInputRowEditText;

    private RowSdInputBinding(SdInputRow sdInputRow, SdInputRow sdInputRow2, RdsFormattedEditText rdsFormattedEditText) {
        this.rootView = sdInputRow;
        this.sdInputRow = sdInputRow2;
        this.sdInputRowEditText = rdsFormattedEditText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdInputRow getRoot() {
        return this.rootView;
    }

    public static RowSdInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdInputBinding bind(View view) {
        SdInputRow sdInputRow = (SdInputRow) view;
        int i = C20335R.id.sd_input_row_edit_text;
        RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
        if (rdsFormattedEditText != null) {
            return new RowSdInputBinding(sdInputRow, sdInputRow, rdsFormattedEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
