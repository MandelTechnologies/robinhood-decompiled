package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentPersonalDataRequestBinding implements ViewBinding {
    public final RdsButton personalDataRequestCta;
    public final RecyclerView personalDataRequestDetailsList;
    public final RhTextView personalDataRequestDetailsTitle;
    public final RhTextView personalDataRequestFooter;
    public final RhTextView personalDataRequestSubtitle;
    public final RhTextView personalDataRequestTitle;
    private final ConstraintLayout rootView;

    private FragmentPersonalDataRequestBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.personalDataRequestCta = rdsButton;
        this.personalDataRequestDetailsList = recyclerView;
        this.personalDataRequestDetailsTitle = rhTextView;
        this.personalDataRequestFooter = rhTextView2;
        this.personalDataRequestSubtitle = rhTextView3;
        this.personalDataRequestTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPersonalDataRequestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPersonalDataRequestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_personal_data_request, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPersonalDataRequestBinding bind(View view) {
        int i = C28186R.id.personal_data_request_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C28186R.id.personal_data_request_details_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C28186R.id.personal_data_request_details_title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C28186R.id.personal_data_request_footer;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C28186R.id.personal_data_request_subtitle;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C28186R.id.personal_data_request_title;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                return new FragmentPersonalDataRequestBinding((ConstraintLayout) view, rdsButton, recyclerView, rhTextView, rhTextView2, rhTextView3, rhTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
