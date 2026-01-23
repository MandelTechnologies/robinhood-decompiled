package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.pickers.DatePickerTabLayout;

/* loaded from: classes11.dex */
public final class IncludeDatePickerTabLayoutBinding implements ViewBinding {
    private final DatePickerTabLayout rootView;

    private IncludeDatePickerTabLayoutBinding(DatePickerTabLayout datePickerTabLayout) {
        this.rootView = datePickerTabLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DatePickerTabLayout getRoot() {
        return this.rootView;
    }

    public static IncludeDatePickerTabLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDatePickerTabLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24876R.layout.include_date_picker_tab_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDatePickerTabLayoutBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDatePickerTabLayoutBinding((DatePickerTabLayout) view);
    }
}
