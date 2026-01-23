package com.robinhood.android.snacks.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.snacks.C28692R;

/* loaded from: classes5.dex */
public final class FragmentSnacksSubscribeBinding implements ViewBinding {
    public final LinearLayout content;
    public final ShimmerLoadingView loadingView;
    private final ConstraintLayout rootView;
    public final RhTextView snacksDisclosuresLinkTxt;
    public final RdsButton snacksSubscribeDoneBtn;
    public final RhTextView snacksSubscribeSummary;
    public final RhTextView snacksSubscribeUpdateEmail;

    private FragmentSnacksSubscribeBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.content = linearLayout;
        this.loadingView = shimmerLoadingView;
        this.snacksDisclosuresLinkTxt = rhTextView;
        this.snacksSubscribeDoneBtn = rdsButton;
        this.snacksSubscribeSummary = rhTextView2;
        this.snacksSubscribeUpdateEmail = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSnacksSubscribeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSnacksSubscribeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28692R.layout.fragment_snacks_subscribe, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSnacksSubscribeBinding bind(View view) {
        int i = C28692R.id.content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C28692R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C28692R.id.snacks_disclosures_link_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C28692R.id.snacks_subscribe_done_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C28692R.id.snacks_subscribe_summary;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C28692R.id.snacks_subscribe_update_email;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new FragmentSnacksSubscribeBinding((ConstraintLayout) view, linearLayout, shimmerLoadingView, rhTextView, rdsButton, rhTextView2, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
