package com.robinhood.android.rhy.waitlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhy.waitlist.C27560R;

/* loaded from: classes5.dex */
public final class FragmentRhyWaitlistErrorBinding implements ViewBinding {
    public final RdsButton rhyWaitlistErrorButton;
    public final RhTextView rhyWaitlistErrorHeader;
    public final ImageView rhyWaitlistErrorImage;
    public final RhTextView rhyWaitlistErrorText;
    public final RhTextView rhyWaitlistErrorTitle;
    private final ConstraintLayout rootView;

    private FragmentRhyWaitlistErrorBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.rhyWaitlistErrorButton = rdsButton;
        this.rhyWaitlistErrorHeader = rhTextView;
        this.rhyWaitlistErrorImage = imageView;
        this.rhyWaitlistErrorText = rhTextView2;
        this.rhyWaitlistErrorTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyWaitlistErrorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyWaitlistErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27560R.layout.fragment_rhy_waitlist_error, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyWaitlistErrorBinding bind(View view) {
        int i = C27560R.id.rhy_waitlist_error_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C27560R.id.rhy_waitlist_error_header;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C27560R.id.rhy_waitlist_error_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C27560R.id.rhy_waitlist_error_text;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C27560R.id.rhy_waitlist_error_title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new FragmentRhyWaitlistErrorBinding((ConstraintLayout) view, rdsButton, rhTextView, imageView, rhTextView2, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
