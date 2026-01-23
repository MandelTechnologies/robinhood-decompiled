package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergePercentageInputViewBinding implements ViewBinding {
    public final RhEditText percentageInputViewEditText;
    public final RhTextView percentageInputViewPercentSymbol;
    private final View rootView;

    private MergePercentageInputViewBinding(View view, RhEditText rhEditText, RhTextView rhTextView) {
        this.rootView = view;
        this.percentageInputViewEditText = rhEditText;
        this.percentageInputViewPercentSymbol = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergePercentageInputViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11595R.layout.merge_percentage_input_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergePercentageInputViewBinding bind(View view) {
        int i = C11595R.id.percentage_input_view_edit_text;
        RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
        if (rhEditText != null) {
            i = C11595R.id.percentage_input_view_percent_symbol;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergePercentageInputViewBinding(view, rhEditText, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
