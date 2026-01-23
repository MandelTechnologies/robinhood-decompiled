package com.robinhood.android.mcduckling.card.help.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.mcduckling.card.help.C21627R;

/* loaded from: classes8.dex */
public final class FragmentCardShippingAddressBinding implements ViewBinding {
    public final RhTextView cardShippingAddressTxt;
    public final RdsButton cardShippingChangeAddressBtn;
    public final RdsButton cardShippingContinueBtn;
    public final ComposeView cardShippingLoadingView;
    public final RhTextView cardShippingSubtitleTxt;
    public final RhTextView cardShippingTitleTxt;
    private final ConstraintLayout rootView;

    private FragmentCardShippingAddressBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RdsButton rdsButton, RdsButton rdsButton2, ComposeView composeView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.cardShippingAddressTxt = rhTextView;
        this.cardShippingChangeAddressBtn = rdsButton;
        this.cardShippingContinueBtn = rdsButton2;
        this.cardShippingLoadingView = composeView;
        this.cardShippingSubtitleTxt = rhTextView2;
        this.cardShippingTitleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCardShippingAddressBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCardShippingAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21627R.layout.fragment_card_shipping_address, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCardShippingAddressBinding bind(View view) {
        int i = C21627R.id.card_shipping_address_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C21627R.id.card_shipping_change_address_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C21627R.id.card_shipping_continue_btn;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C21627R.id.card_shipping_loading_view;
                    ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                    if (composeView != null) {
                        i = C21627R.id.card_shipping_subtitle_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C21627R.id.card_shipping_title_txt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new FragmentCardShippingAddressBinding((ConstraintLayout) view, rhTextView, rdsButton, rdsButton2, composeView, rhTextView2, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
