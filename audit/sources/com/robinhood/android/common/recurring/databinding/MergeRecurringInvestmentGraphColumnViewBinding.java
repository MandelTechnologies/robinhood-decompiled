package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeRecurringInvestmentGraphColumnViewBinding implements ViewBinding {
    public final ImageView columnBar;
    public final RhTextView columnLabel;
    public final AnimatedRhTextView investedText;
    private final View rootView;

    private MergeRecurringInvestmentGraphColumnViewBinding(View view, ImageView imageView, RhTextView rhTextView, AnimatedRhTextView animatedRhTextView) {
        this.rootView = view;
        this.columnBar = imageView;
        this.columnLabel = rhTextView;
        this.investedText = animatedRhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRecurringInvestmentGraphColumnViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11595R.layout.merge_recurring_investment_graph_column_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRecurringInvestmentGraphColumnViewBinding bind(View view) {
        int i = C11595R.id.column_bar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C11595R.id.column_label;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11595R.id.invested_text;
                AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
                if (animatedRhTextView != null) {
                    return new MergeRecurringInvestmentGraphColumnViewBinding(view, imageView, rhTextView, animatedRhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
