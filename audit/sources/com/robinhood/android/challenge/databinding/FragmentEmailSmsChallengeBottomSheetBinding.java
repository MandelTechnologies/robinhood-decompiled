package com.robinhood.android.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.challenge.C10497R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentEmailSmsChallengeBottomSheetBinding implements ViewBinding {
    public final ScrollView emailSmsChallengeBottomSheetContainer;
    public final RhTextView emailSmsChallengeBottomSheetSubtitle;
    public final RhTextView emailSmsChallengeBottomSheetTitle;
    public final RdsRowView emailSmsChallengeCancel;
    public final RdsRowView emailSmsChallengeOpenPathfinder;
    public final RdsRowView emailSmsChallengeRequestAlternate;
    public final RdsRowView emailSmsChallengeResendCode;
    private final ScrollView rootView;

    private FragmentEmailSmsChallengeBottomSheetBinding(ScrollView scrollView, ScrollView scrollView2, RhTextView rhTextView, RhTextView rhTextView2, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsRowView rdsRowView3, RdsRowView rdsRowView4) {
        this.rootView = scrollView;
        this.emailSmsChallengeBottomSheetContainer = scrollView2;
        this.emailSmsChallengeBottomSheetSubtitle = rhTextView;
        this.emailSmsChallengeBottomSheetTitle = rhTextView2;
        this.emailSmsChallengeCancel = rdsRowView;
        this.emailSmsChallengeOpenPathfinder = rdsRowView2;
        this.emailSmsChallengeRequestAlternate = rdsRowView3;
        this.emailSmsChallengeResendCode = rdsRowView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentEmailSmsChallengeBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEmailSmsChallengeBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10497R.layout.fragment_email_sms_challenge_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEmailSmsChallengeBottomSheetBinding bind(View view) {
        ScrollView scrollView = (ScrollView) view;
        int i = C10497R.id.email_sms_challenge_bottom_sheet_subtitle;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C10497R.id.email_sms_challenge_bottom_sheet_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C10497R.id.email_sms_challenge_cancel;
                RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView != null) {
                    i = C10497R.id.email_sms_challenge_open_pathfinder;
                    RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView2 != null) {
                        i = C10497R.id.email_sms_challenge_request_alternate;
                        RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsRowView3 != null) {
                            i = C10497R.id.email_sms_challenge_resend_code;
                            RdsRowView rdsRowView4 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsRowView4 != null) {
                                return new FragmentEmailSmsChallengeBottomSheetBinding(scrollView, scrollView, rhTextView, rhTextView2, rdsRowView, rdsRowView2, rdsRowView3, rdsRowView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
