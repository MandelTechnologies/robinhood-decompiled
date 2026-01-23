package com.robinhood.android.verification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.verification.C31368R;

/* loaded from: classes9.dex */
public final class FragmentEmailConfirmationBinding implements ViewBinding {
    public final RdsButton emailConfirmationChangeEmailBtn;
    public final RhTextView emailConfirmationDisclosure;
    public final RhTextView emailConfirmationEmailText;
    public final RdsButton emailConfirmationPrimaryCta;
    public final RhTextView emailConfirmationSubtitleText;
    public final RhTextView emailConfirmationTitleText;
    private final ConstraintLayout rootView;

    private FragmentEmailConfirmationBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.emailConfirmationChangeEmailBtn = rdsButton;
        this.emailConfirmationDisclosure = rhTextView;
        this.emailConfirmationEmailText = rhTextView2;
        this.emailConfirmationPrimaryCta = rdsButton2;
        this.emailConfirmationSubtitleText = rhTextView3;
        this.emailConfirmationTitleText = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEmailConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEmailConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31368R.layout.fragment_email_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEmailConfirmationBinding bind(View view) {
        int i = C31368R.id.email_confirmation_change_email_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C31368R.id.email_confirmation_disclosure;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C31368R.id.email_confirmation_email_text;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C31368R.id.email_confirmation_primary_cta;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C31368R.id.email_confirmation_subtitle_text;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C31368R.id.email_confirmation_title_text;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                return new FragmentEmailConfirmationBinding((ConstraintLayout) view, rdsButton, rhTextView, rhTextView2, rdsButton2, rhTextView3, rhTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
