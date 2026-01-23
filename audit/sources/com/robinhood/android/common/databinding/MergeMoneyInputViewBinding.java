package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeMoneyInputViewBinding implements ViewBinding {
    public final RhEditText moneyInputViewEditText;
    public final RhTextView moneyInputViewFrontSymbol;
    public final RhTextView moneyInputViewRearSymbol;
    private final View rootView;

    private MergeMoneyInputViewBinding(View view, RhEditText rhEditText, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.moneyInputViewEditText = rhEditText;
        this.moneyInputViewFrontSymbol = rhTextView;
        this.moneyInputViewRearSymbol = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMoneyInputViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11048R.layout.merge_money_input_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMoneyInputViewBinding bind(View view) {
        int i = C11048R.id.money_input_view_edit_text;
        RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
        if (rhEditText != null) {
            i = C11048R.id.money_input_view_front_symbol;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11048R.id.money_input_view_rear_symbol;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeMoneyInputViewBinding(view, rhEditText, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
