package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.mcduckling.p084ui.ObscuredTextView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class FragmentRoutingAccountActionsBinding implements ViewBinding {
    public final ConstraintLayout container;
    private final ConstraintLayout rootView;
    public final RhTextView routingAccountActionsCardAccountNumberLabelTxt;
    public final RdsToggleView routingAccountActionsCardAccountNumberSwitch;
    public final ObscuredTextView routingAccountActionsCardAccountNumberValueTxt;
    public final Guideline routingAccountActionsCardGuideline;
    public final RdsToggleView routingAccountActionsCardLockWithdrawalsSwitch;
    public final RhTextView routingAccountActionsCardRoutingNumberLabelTxt;
    public final RhTextView routingAccountActionsCardRoutingNumberValueTxt;
    public final ImageView routingAccountActionsInfoIcon;
    public final RhTextView routingAccountActionsTitle;

    private FragmentRoutingAccountActionsBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RhTextView rhTextView, RdsToggleView rdsToggleView, ObscuredTextView obscuredTextView, Guideline guideline, RdsToggleView rdsToggleView2, RhTextView rhTextView2, RhTextView rhTextView3, ImageView imageView, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.container = constraintLayout2;
        this.routingAccountActionsCardAccountNumberLabelTxt = rhTextView;
        this.routingAccountActionsCardAccountNumberSwitch = rdsToggleView;
        this.routingAccountActionsCardAccountNumberValueTxt = obscuredTextView;
        this.routingAccountActionsCardGuideline = guideline;
        this.routingAccountActionsCardLockWithdrawalsSwitch = rdsToggleView2;
        this.routingAccountActionsCardRoutingNumberLabelTxt = rhTextView2;
        this.routingAccountActionsCardRoutingNumberValueTxt = rhTextView3;
        this.routingAccountActionsInfoIcon = imageView;
        this.routingAccountActionsTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRoutingAccountActionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRoutingAccountActionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_routing_account_actions, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRoutingAccountActionsBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C14044R.id.routing_account_actions_card_account_number_label_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14044R.id.routing_account_actions_card_account_number_switch;
            RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
            if (rdsToggleView != null) {
                i = C14044R.id.routing_account_actions_card_account_number_value_txt;
                ObscuredTextView obscuredTextView = (ObscuredTextView) ViewBindings.findChildViewById(view, i);
                if (obscuredTextView != null) {
                    i = C14044R.id.routing_account_actions_card_guideline;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = C14044R.id.routing_account_actions_card_lock_withdrawals_switch;
                        RdsToggleView rdsToggleView2 = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                        if (rdsToggleView2 != null) {
                            i = C14044R.id.routing_account_actions_card_routing_number_label_txt;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C14044R.id.routing_account_actions_card_routing_number_value_txt;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    i = C14044R.id.routing_account_actions_info_icon;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = C14044R.id.routing_account_actions_title;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            return new FragmentRoutingAccountActionsBinding(constraintLayout, constraintLayout, rhTextView, rdsToggleView, obscuredTextView, guideline, rdsToggleView2, rhTextView2, rhTextView3, imageView, rhTextView4);
                                        }
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
