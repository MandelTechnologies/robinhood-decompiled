package com.robinhood.android.debitcard.linking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentDebitCardVerificationInfoBinding implements ViewBinding {
    public final ConstraintLayout content;
    public final RhTextView disclosure;
    public final ShimmerLoadingView loadingView;
    public final RdsButton primaryButton;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final RdsButton secondaryButton;
    public final RhTextView title;

    private FragmentDebitCardVerificationInfoBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, RhTextView rhTextView, ShimmerLoadingView shimmerLoadingView, RdsButton rdsButton, RecyclerView recyclerView, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.content = constraintLayout;
        this.disclosure = rhTextView;
        this.loadingView = shimmerLoadingView;
        this.primaryButton = rdsButton;
        this.recyclerView = recyclerView;
        this.secondaryButton = rdsButton2;
        this.title = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDebitCardVerificationInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDebitCardVerificationInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C13894R.layout.fragment_debit_card_verification_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDebitCardVerificationInfoBinding bind(View view) {
        int i = C13894R.id.content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C13894R.id.disclosure;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C13894R.id.loading_view;
                ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                if (shimmerLoadingView != null) {
                    i = C13894R.id.primary_button;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C13894R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C13894R.id.secondary_button;
                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton2 != null) {
                                i = C13894R.id.title;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new FragmentDebitCardVerificationInfoBinding((LinearLayout) view, constraintLayout, rhTextView, shimmerLoadingView, rdsButton, recyclerView, rdsButton2, rhTextView2);
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
