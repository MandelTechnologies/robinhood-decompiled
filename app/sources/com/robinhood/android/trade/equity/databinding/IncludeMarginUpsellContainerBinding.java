package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.equity.C29365R;

/* loaded from: classes9.dex */
public final class IncludeMarginUpsellContainerBinding implements ViewBinding {
    public final LinearLayout marginUpsellContainer;
    public final RhTextView marginUpsellDescriptionTxt;
    public final RdsButton marginUpsellGetStartedBtn;
    public final RdsButton marginUpsellNotNowBtn;
    public final RdsPogView marginUpsellPog;
    public final RhTextView marginUpsellTitleTxt;
    private final LinearLayout rootView;

    private IncludeMarginUpsellContainerBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RhTextView rhTextView, RdsButton rdsButton, RdsButton rdsButton2, RdsPogView rdsPogView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.marginUpsellContainer = linearLayout2;
        this.marginUpsellDescriptionTxt = rhTextView;
        this.marginUpsellGetStartedBtn = rdsButton;
        this.marginUpsellNotNowBtn = rdsButton2;
        this.marginUpsellPog = rdsPogView;
        this.marginUpsellTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeMarginUpsellContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMarginUpsellContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.include_margin_upsell_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMarginUpsellContainerBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C29365R.id.margin_upsell_description_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C29365R.id.margin_upsell_get_started_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C29365R.id.margin_upsell_not_now_btn;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C29365R.id.margin_upsell_pog;
                    RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                    if (rdsPogView != null) {
                        i = C29365R.id.margin_upsell_title_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new IncludeMarginUpsellContainerBinding(linearLayout, linearLayout, rhTextView, rdsButton, rdsButton2, rdsPogView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
