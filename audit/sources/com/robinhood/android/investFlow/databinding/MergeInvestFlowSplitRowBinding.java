package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;

/* loaded from: classes10.dex */
public final class MergeInvestFlowSplitRowBinding implements ViewBinding {
    public final RhMoneyInputView moneyInput;
    public final RhTextView nameTxt;
    private final ConstraintLayout rootView;
    public final View rowBottomDivider;
    public final RhTextView sortInfoTxt;

    private MergeInvestFlowSplitRowBinding(ConstraintLayout constraintLayout, RhMoneyInputView rhMoneyInputView, RhTextView rhTextView, View view, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.moneyInput = rhMoneyInputView;
        this.nameTxt = rhTextView;
        this.rowBottomDivider = view;
        this.sortInfoTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeInvestFlowSplitRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeInvestFlowSplitRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.merge_invest_flow_split_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeInvestFlowSplitRowBinding bind(View view) {
        View viewFindChildViewById;
        int i = C19349R.id.money_input;
        RhMoneyInputView rhMoneyInputView = (RhMoneyInputView) ViewBindings.findChildViewById(view, i);
        if (rhMoneyInputView != null) {
            i = C19349R.id.name_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C19349R.id.row_bottom_divider))) != null) {
                i = C19349R.id.sort_info_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeInvestFlowSplitRowBinding((ConstraintLayout) view, rhMoneyInputView, rhTextView, viewFindChildViewById, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
