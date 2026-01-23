package com.robinhood.android.crypto.gifting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;

/* loaded from: classes2.dex */
public final class FragmentCryptoGiftDetailsBinding implements ViewBinding {
    public final RdsButton dismissCta;
    public final RhTextView footer;
    public final ClientComponentButtonView primaryCta;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final CoordinatorLayout snackbarContainer;

    private FragmentCryptoGiftDetailsBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, ClientComponentButtonView clientComponentButtonView, RecyclerView recyclerView, CoordinatorLayout coordinatorLayout) {
        this.rootView = constraintLayout;
        this.dismissCta = rdsButton;
        this.footer = rhTextView;
        this.primaryCta = clientComponentButtonView;
        this.recyclerView = recyclerView;
        this.snackbarContainer = coordinatorLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoGiftDetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoGiftDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12906R.layout.fragment_crypto_gift_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoGiftDetailsBinding bind(View view) {
        int i = C12906R.id.dismiss_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C12906R.id.footer;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C12906R.id.primary_cta;
                ClientComponentButtonView clientComponentButtonView = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
                if (clientComponentButtonView != null) {
                    i = C12906R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C12906R.id.snackbar_container;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                        if (coordinatorLayout != null) {
                            return new FragmentCryptoGiftDetailsBinding((ConstraintLayout) view, rdsButton, rhTextView, clientComponentButtonView, recyclerView, coordinatorLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
