package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.optionsstrategybuilder.C24876R;

/* loaded from: classes11.dex */
public final class MergeDatePickerBinding implements ViewBinding {
    public final View headerDivider;
    private final View rootView;

    private MergeDatePickerBinding(View view, View view2) {
        this.rootView = view;
        this.headerDivider = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeDatePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24876R.layout.merge_date_picker, viewGroup);
        return bind(viewGroup);
    }

    public static MergeDatePickerBinding bind(View view) {
        int i = C24876R.id.header_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            return new MergeDatePickerBinding(view, viewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
