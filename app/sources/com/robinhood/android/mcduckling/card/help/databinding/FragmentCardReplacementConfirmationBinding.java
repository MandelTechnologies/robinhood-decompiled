package com.robinhood.android.mcduckling.card.help.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.mcduckling.card.help.C21627R;

/* loaded from: classes8.dex */
public final class FragmentCardReplacementConfirmationBinding implements ViewBinding {
    public final Barrier barrier;
    public final Barrier barrier2;
    public final ImageView cardReplacementConfirmationImage;
    public final RhTextView cardReplacementConfirmationSubtitle;
    public final RhTextView cardReplacementConfirmationTitle;
    public final RdsButton doneButton;
    public final Guideline guideline;
    private final ConstraintLayout rootView;

    private FragmentCardReplacementConfirmationBinding(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, Guideline guideline) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.barrier2 = barrier2;
        this.cardReplacementConfirmationImage = imageView;
        this.cardReplacementConfirmationSubtitle = rhTextView;
        this.cardReplacementConfirmationTitle = rhTextView2;
        this.doneButton = rdsButton;
        this.guideline = guideline;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCardReplacementConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCardReplacementConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21627R.layout.fragment_card_replacement_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCardReplacementConfirmationBinding bind(View view) {
        int i = C21627R.id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C21627R.id.barrier2;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null) {
                i = C21627R.id.card_replacement_confirmation_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C21627R.id.card_replacement_confirmation_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C21627R.id.card_replacement_confirmation_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C21627R.id.done_button;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C21627R.id.guideline;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline != null) {
                                    return new FragmentCardReplacementConfirmationBinding((ConstraintLayout) view, barrier, barrier2, imageView, rhTextView, rhTextView2, rdsButton, guideline);
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
