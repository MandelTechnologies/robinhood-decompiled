package com.robinhood.android.psp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.psp.C25966R;

/* loaded from: classes11.dex */
public final class MergeProgramDetailsValuePropsViewBinding implements ViewBinding {
    private final View rootView;

    private MergeProgramDetailsValuePropsViewBinding(View view) {
        this.rootView = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeProgramDetailsValuePropsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C25966R.layout.merge_program_details_value_props_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeProgramDetailsValuePropsViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new MergeProgramDetailsValuePropsViewBinding(view);
    }
}
