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
public final class FragmentEmailLinkSentBinding implements ViewBinding {
    public final RhTextView emailLinkSentEmailText;
    public final RdsButton emailLinkSentPrimaryCta;
    public final RhTextView emailLinkSentResendLinkText;
    public final RhTextView emailLinkSentSubtitleText;
    public final RhTextView emailLinkSentTitleText;
    private final ConstraintLayout rootView;

    private FragmentEmailLinkSentBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.emailLinkSentEmailText = rhTextView;
        this.emailLinkSentPrimaryCta = rdsButton;
        this.emailLinkSentResendLinkText = rhTextView2;
        this.emailLinkSentSubtitleText = rhTextView3;
        this.emailLinkSentTitleText = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEmailLinkSentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEmailLinkSentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31368R.layout.fragment_email_link_sent, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEmailLinkSentBinding bind(View view) {
        int i = C31368R.id.email_link_sent_email_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C31368R.id.email_link_sent_primary_cta;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C31368R.id.email_link_sent_resend_link_text;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C31368R.id.email_link_sent_subtitle_text;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C31368R.id.email_link_sent_title_text;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            return new FragmentEmailLinkSentBinding((ConstraintLayout) view, rhTextView, rdsButton, rhTextView2, rhTextView3, rhTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
