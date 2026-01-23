package com.robinhood.shared.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.login.C39089R;

/* loaded from: classes6.dex */
public final class FragmentLoginMfaV2BottomSheetBinding implements ViewBinding {
    public final LinearLayout challengeVerificationHelpBottomSheetContainer;
    public final RhTextView challengeVerificationHelpBottomSheetSubtitle;
    public final RhTextView challengeVerificationHelpBottomSheetTitle;
    public final RdsButton challengeVerificationHelpDismiss;
    public final RdsRowView challengeVerificationHelpResendCode;
    public final RdsRowView challengeVerificationHelpSelfServiceRecovery;
    public final RdsRowView challengeVerificationHelpUseBackupCode;
    private final LinearLayout rootView;

    private FragmentLoginMfaV2BottomSheetBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsRowView rdsRowView3) {
        this.rootView = linearLayout;
        this.challengeVerificationHelpBottomSheetContainer = linearLayout2;
        this.challengeVerificationHelpBottomSheetSubtitle = rhTextView;
        this.challengeVerificationHelpBottomSheetTitle = rhTextView2;
        this.challengeVerificationHelpDismiss = rdsButton;
        this.challengeVerificationHelpResendCode = rdsRowView;
        this.challengeVerificationHelpSelfServiceRecovery = rdsRowView2;
        this.challengeVerificationHelpUseBackupCode = rdsRowView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLoginMfaV2BottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLoginMfaV2BottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39089R.layout.fragment_login_mfa_v2_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentLoginMfaV2BottomSheetBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C39089R.id.challenge_verification_help_bottom_sheet_subtitle;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C39089R.id.challenge_verification_help_bottom_sheet_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C39089R.id.challenge_verification_help_dismiss;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C39089R.id.challenge_verification_help_resend_code;
                    RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView != null) {
                        i = C39089R.id.challenge_verification_help_self_service_recovery;
                        RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsRowView2 != null) {
                            i = C39089R.id.challenge_verification_help_use_backup_code;
                            RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsRowView3 != null) {
                                return new FragmentLoginMfaV2BottomSheetBinding(linearLayout, linearLayout, rhTextView, rhTextView2, rdsButton, rdsRowView, rdsRowView2, rdsRowView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
