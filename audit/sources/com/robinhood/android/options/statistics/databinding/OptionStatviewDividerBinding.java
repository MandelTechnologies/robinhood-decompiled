package com.robinhood.android.options.statistics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.options.statistics.C23799R;

/* loaded from: classes11.dex */
public final class OptionStatviewDividerBinding implements ViewBinding {
    private final View rootView;

    private OptionStatviewDividerBinding(View view) {
        this.rootView = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static OptionStatviewDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C23799R.layout.option_statview_divider, viewGroup);
        return bind(viewGroup);
    }

    public static OptionStatviewDividerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new OptionStatviewDividerBinding(view);
    }
}
