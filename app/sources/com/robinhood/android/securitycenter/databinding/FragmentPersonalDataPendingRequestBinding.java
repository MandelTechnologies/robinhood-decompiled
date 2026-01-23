package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentPersonalDataPendingRequestBinding implements ViewBinding {
    public final RdsButton personalDataPendingRequestCta;
    public final RhTextView personalDataPendingRequestSubtitle;
    public final RdsTimelineRowView personalDataPendingRequestTimelineBottom;
    public final RdsTimelineRowView personalDataPendingRequestTimelineMiddle;
    public final RdsTimelineRowView personalDataPendingRequestTimelineTop;
    public final RhTextView personalDataPendingRequestTitle;
    private final ConstraintLayout rootView;

    private FragmentPersonalDataPendingRequestBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RdsTimelineRowView rdsTimelineRowView, RdsTimelineRowView rdsTimelineRowView2, RdsTimelineRowView rdsTimelineRowView3, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.personalDataPendingRequestCta = rdsButton;
        this.personalDataPendingRequestSubtitle = rhTextView;
        this.personalDataPendingRequestTimelineBottom = rdsTimelineRowView;
        this.personalDataPendingRequestTimelineMiddle = rdsTimelineRowView2;
        this.personalDataPendingRequestTimelineTop = rdsTimelineRowView3;
        this.personalDataPendingRequestTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPersonalDataPendingRequestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPersonalDataPendingRequestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_personal_data_pending_request, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPersonalDataPendingRequestBinding bind(View view) {
        int i = C28186R.id.personal_data_pending_request_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C28186R.id.personal_data_pending_request_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C28186R.id.personal_data_pending_request_timeline_bottom;
                RdsTimelineRowView rdsTimelineRowView = (RdsTimelineRowView) ViewBindings.findChildViewById(view, i);
                if (rdsTimelineRowView != null) {
                    i = C28186R.id.personal_data_pending_request_timeline_middle;
                    RdsTimelineRowView rdsTimelineRowView2 = (RdsTimelineRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsTimelineRowView2 != null) {
                        i = C28186R.id.personal_data_pending_request_timeline_top;
                        RdsTimelineRowView rdsTimelineRowView3 = (RdsTimelineRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsTimelineRowView3 != null) {
                            i = C28186R.id.personal_data_pending_request_title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new FragmentPersonalDataPendingRequestBinding((ConstraintLayout) view, rdsButton, rhTextView, rdsTimelineRowView, rdsTimelineRowView2, rdsTimelineRowView3, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
