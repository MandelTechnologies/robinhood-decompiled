package com.robinhood.android.resumeapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.resumeapplication.C26935R;
import com.robinhood.android.resumeapplication.ResumeApplicationTimelineRowView;

/* loaded from: classes5.dex */
public final class FragmentResurrectionChurnedAndZeroFundedBinding implements ViewBinding {
    public final ImageView resumeApplicationFundCloseButton;
    public final RhTextView resumeApplicationFundDisclaimer;
    public final RdsButton resumeApplicationFundPrimaryCta;
    public final RhTextView resumeApplicationFundSubtitle;
    public final ResumeApplicationTimelineRowView resumeApplicationFundTimelineFirstRow;
    public final ResumeApplicationTimelineRowView resumeApplicationFundTimelineSecondRow;
    public final LinearLayout resumeApplicationFundTimelineWrapper;
    public final RhTextView resumeApplicationFundTitle;
    private final MotionLayout rootView;

    private FragmentResurrectionChurnedAndZeroFundedBinding(MotionLayout motionLayout, ImageView imageView, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2, ResumeApplicationTimelineRowView resumeApplicationTimelineRowView, ResumeApplicationTimelineRowView resumeApplicationTimelineRowView2, LinearLayout linearLayout, RhTextView rhTextView3) {
        this.rootView = motionLayout;
        this.resumeApplicationFundCloseButton = imageView;
        this.resumeApplicationFundDisclaimer = rhTextView;
        this.resumeApplicationFundPrimaryCta = rdsButton;
        this.resumeApplicationFundSubtitle = rhTextView2;
        this.resumeApplicationFundTimelineFirstRow = resumeApplicationTimelineRowView;
        this.resumeApplicationFundTimelineSecondRow = resumeApplicationTimelineRowView2;
        this.resumeApplicationFundTimelineWrapper = linearLayout;
        this.resumeApplicationFundTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MotionLayout getRoot() {
        return this.rootView;
    }

    public static FragmentResurrectionChurnedAndZeroFundedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentResurrectionChurnedAndZeroFundedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26935R.layout.fragment_resurrection_churned_and_zero_funded, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentResurrectionChurnedAndZeroFundedBinding bind(View view) {
        int i = C26935R.id.resume_application_fund_close_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C26935R.id.resume_application_fund_disclaimer;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C26935R.id.resume_application_fund_primary_cta;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C26935R.id.resume_application_fund_subtitle;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C26935R.id.resume_application_fund_timeline_first_row;
                        ResumeApplicationTimelineRowView resumeApplicationTimelineRowView = (ResumeApplicationTimelineRowView) ViewBindings.findChildViewById(view, i);
                        if (resumeApplicationTimelineRowView != null) {
                            i = C26935R.id.resume_application_fund_timeline_second_row;
                            ResumeApplicationTimelineRowView resumeApplicationTimelineRowView2 = (ResumeApplicationTimelineRowView) ViewBindings.findChildViewById(view, i);
                            if (resumeApplicationTimelineRowView2 != null) {
                                i = C26935R.id.resume_application_fund_timeline_wrapper;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = C26935R.id.resume_application_fund_title;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        return new FragmentResurrectionChurnedAndZeroFundedBinding((MotionLayout) view, imageView, rhTextView, rdsButton, rhTextView2, resumeApplicationTimelineRowView, resumeApplicationTimelineRowView2, linearLayout, rhTextView3);
                                    }
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
