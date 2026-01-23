package com.robinhood.android.transfers.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.recurring.C30439R;

/* loaded from: classes9.dex */
public final class MergeRowRecurringInvestmentHookBinding implements ViewBinding {
    public final RdsButton recurringInvestmentsHookCta;
    public final ImageView recurringInvestmentsHookImage;
    public final RhTextView recurringInvestmentsHookSubtitle;
    public final RhTextView recurringInvestmentsHookTitle;
    private final View rootView;

    private MergeRowRecurringInvestmentHookBinding(View view, RdsButton rdsButton, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.recurringInvestmentsHookCta = rdsButton;
        this.recurringInvestmentsHookImage = imageView;
        this.recurringInvestmentsHookSubtitle = rhTextView;
        this.recurringInvestmentsHookTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRowRecurringInvestmentHookBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C30439R.layout.merge_row_recurring_investment_hook, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRowRecurringInvestmentHookBinding bind(View view) {
        int i = C30439R.id.recurring_investments_hook_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C30439R.id.recurring_investments_hook_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C30439R.id.recurring_investments_hook_subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C30439R.id.recurring_investments_hook_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeRowRecurringInvestmentHookBinding(view, rdsButton, imageView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
