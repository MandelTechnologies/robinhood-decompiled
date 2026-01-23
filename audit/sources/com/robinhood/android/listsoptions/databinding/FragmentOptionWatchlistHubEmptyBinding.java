package com.robinhood.android.listsoptions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.listsoptions.C20943R;

/* loaded from: classes8.dex */
public final class FragmentOptionWatchlistHubEmptyBinding implements ViewBinding {
    public final RhTextView emptyBodyText;
    public final ImageView emptyImage;
    public final RdsButton findContractBtn;
    private final ConstraintLayout rootView;

    private FragmentOptionWatchlistHubEmptyBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, ImageView imageView, RdsButton rdsButton) {
        this.rootView = constraintLayout;
        this.emptyBodyText = rhTextView;
        this.emptyImage = imageView;
        this.findContractBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionWatchlistHubEmptyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionWatchlistHubEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20943R.layout.fragment_option_watchlist_hub_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionWatchlistHubEmptyBinding bind(View view) {
        int i = C20943R.id.empty_body_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C20943R.id.empty_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C20943R.id.find_contract_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    return new FragmentOptionWatchlistHubEmptyBinding((ConstraintLayout) view, rhTextView, imageView, rdsButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
