package com.robinhood.android.common.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.sparkle.SparkleButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentMarginUpgradeMarginLimitBinding implements ViewBinding {
    public final SparkleButton confirmBtn;
    public final RhTextView disclosureTxt;
    public final RhTextView marginBuyingPowerTxt;
    public final LinearLayout marginLimitCard;
    public final RdsTextButton removeLimitBtn;
    private final ConstraintLayout rootView;
    public final RdsTextButton setLimitBtn;
    public final RhTextView titleTxt;
    public final RhTextView totalTxt;

    private FragmentMarginUpgradeMarginLimitBinding(ConstraintLayout constraintLayout, SparkleButton sparkleButton, RhTextView rhTextView, RhTextView rhTextView2, LinearLayout linearLayout, RdsTextButton rdsTextButton, RdsTextButton rdsTextButton2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.confirmBtn = sparkleButton;
        this.disclosureTxt = rhTextView;
        this.marginBuyingPowerTxt = rhTextView2;
        this.marginLimitCard = linearLayout;
        this.removeLimitBtn = rdsTextButton;
        this.setLimitBtn = rdsTextButton2;
        this.titleTxt = rhTextView3;
        this.totalTxt = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMarginUpgradeMarginLimitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMarginUpgradeMarginLimitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11223R.layout.fragment_margin_upgrade_margin_limit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMarginUpgradeMarginLimitBinding bind(View view) {
        int i = C11223R.id.confirm_btn;
        SparkleButton sparkleButton = (SparkleButton) ViewBindings.findChildViewById(view, i);
        if (sparkleButton != null) {
            i = C11223R.id.disclosure_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11223R.id.margin_buying_power_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C11223R.id.margin_limit_card;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C11223R.id.remove_limit_btn;
                        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                        if (rdsTextButton != null) {
                            i = C11223R.id.set_limit_btn;
                            RdsTextButton rdsTextButton2 = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                            if (rdsTextButton2 != null) {
                                i = C11223R.id.title_txt;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    i = C11223R.id.total_txt;
                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView4 != null) {
                                        return new FragmentMarginUpgradeMarginLimitBinding((ConstraintLayout) view, sparkleButton, rhTextView, rhTextView2, linearLayout, rdsTextButton, rdsTextButton2, rhTextView3, rhTextView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
