package com.robinhood.android.debitcard.linking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentDebitCardLinkingLoadingBinding implements ViewBinding {
    public final RdsProgressBar loadingView;
    public final RhTextView message;
    public final RhTextView processing;
    private final ConstraintLayout rootView;

    private FragmentDebitCardLinkingLoadingBinding(ConstraintLayout constraintLayout, RdsProgressBar rdsProgressBar, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.loadingView = rdsProgressBar;
        this.message = rhTextView;
        this.processing = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDebitCardLinkingLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDebitCardLinkingLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C13894R.layout.fragment_debit_card_linking_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDebitCardLinkingLoadingBinding bind(View view) {
        int i = C13894R.id.loading_view;
        RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
        if (rdsProgressBar != null) {
            i = C13894R.id.message;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C13894R.id.processing;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new FragmentDebitCardLinkingLoadingBinding((ConstraintLayout) view, rdsProgressBar, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
