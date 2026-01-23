package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentCheckPaymentDetailBinding implements ViewBinding {
    public final RdsDataRowView checkPaymentDetailAmount;
    public final RdsButton checkPaymentDetailCancel;
    public final FrameLayout checkPaymentDetailCancelContainer;
    public final RdsDataRowView checkPaymentDetailEstimatedDates;
    public final RdsDataRowView checkPaymentDetailMailingAddress;
    public final RdsDataRowView checkPaymentDetailMemo;
    public final RdsDataRowView checkPaymentDetailRecipient;
    public final RdsDataRowView checkPaymentDetailStatus;
    public final RdsDataRowView checkPaymentDetailSubmitted;
    private final ConstraintLayout rootView;
    public final NestedScrollView scrollView;

    private FragmentCheckPaymentDetailBinding(ConstraintLayout constraintLayout, RdsDataRowView rdsDataRowView, RdsButton rdsButton, FrameLayout frameLayout, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, RdsDataRowView rdsDataRowView6, RdsDataRowView rdsDataRowView7, NestedScrollView nestedScrollView) {
        this.rootView = constraintLayout;
        this.checkPaymentDetailAmount = rdsDataRowView;
        this.checkPaymentDetailCancel = rdsButton;
        this.checkPaymentDetailCancelContainer = frameLayout;
        this.checkPaymentDetailEstimatedDates = rdsDataRowView2;
        this.checkPaymentDetailMailingAddress = rdsDataRowView3;
        this.checkPaymentDetailMemo = rdsDataRowView4;
        this.checkPaymentDetailRecipient = rdsDataRowView5;
        this.checkPaymentDetailStatus = rdsDataRowView6;
        this.checkPaymentDetailSubmitted = rdsDataRowView7;
        this.scrollView = nestedScrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCheckPaymentDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCheckPaymentDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_check_payment_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCheckPaymentDetailBinding bind(View view) {
        int i = C18359R.id.check_payment_detail_amount;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C18359R.id.check_payment_detail_cancel;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C18359R.id.check_payment_detail_cancel_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C18359R.id.check_payment_detail_estimated_dates;
                    RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView2 != null) {
                        i = C18359R.id.check_payment_detail_mailing_address;
                        RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView3 != null) {
                            i = C18359R.id.check_payment_detail_memo;
                            RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView4 != null) {
                                i = C18359R.id.check_payment_detail_recipient;
                                RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView5 != null) {
                                    i = C18359R.id.check_payment_detail_status;
                                    RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView6 != null) {
                                        i = C18359R.id.check_payment_detail_submitted;
                                        RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsDataRowView7 != null) {
                                            i = C18359R.id.scrollView;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView != null) {
                                                return new FragmentCheckPaymentDetailBinding((ConstraintLayout) view, rdsDataRowView, rdsButton, frameLayout, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5, rdsDataRowView6, rdsDataRowView7, nestedScrollView);
                                            }
                                        }
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
