package com.robinhood.android.options.statistics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.options.statistics.C23799R;

/* loaded from: classes11.dex */
public final class MergeOptionStatViewBinding implements ViewBinding {
    private final View rootView;
    public final RhTextView statLabelTxt;
    public final RhTextView statValueTxt;

    private MergeOptionStatViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.statLabelTxt = rhTextView;
        this.statValueTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionStatViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C23799R.layout.merge_option_stat_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionStatViewBinding bind(View view) {
        int i = C23799R.id.stat_label_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C23799R.id.stat_value_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new MergeOptionStatViewBinding(view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
