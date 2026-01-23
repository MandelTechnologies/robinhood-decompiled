package com.robinhood.android.transfers.transferhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.banking.lib.databinding.IncludeDebitCardUserStatusBannerViewBinding;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.transferhub.C30556R;

/* loaded from: classes9.dex */
public final class ActivityLinkingOptionsBinding implements ViewBinding {
    public final RdsRowView bankAccountCta;
    public final LinearLayout content;
    public final RdsRowView debitCardCta;
    public final IncludeDebitCardUserStatusBannerViewBinding includeDebitCardUserStatusBannerView;
    public final RhTextView linkingOptionsDisclosure;
    public final ComposeView linkingOptionsDisclosureComposeView;
    public final ShimmerLoadingView loadingView;
    private final LinearLayout rootView;
    public final RhTextView subtitle;

    private ActivityLinkingOptionsBinding(LinearLayout linearLayout, RdsRowView rdsRowView, LinearLayout linearLayout2, RdsRowView rdsRowView2, IncludeDebitCardUserStatusBannerViewBinding includeDebitCardUserStatusBannerViewBinding, RhTextView rhTextView, ComposeView composeView, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.bankAccountCta = rdsRowView;
        this.content = linearLayout2;
        this.debitCardCta = rdsRowView2;
        this.includeDebitCardUserStatusBannerView = includeDebitCardUserStatusBannerViewBinding;
        this.linkingOptionsDisclosure = rhTextView;
        this.linkingOptionsDisclosureComposeView = composeView;
        this.loadingView = shimmerLoadingView;
        this.subtitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLinkingOptionsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLinkingOptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30556R.layout.activity_linking_options, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityLinkingOptionsBinding bind(View view) {
        View viewFindChildViewById;
        int i = C30556R.id.bank_account_cta;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C30556R.id.content;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C30556R.id.debit_card_cta;
                RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C30556R.id.include_debit_card_user_status_banner_view))) != null) {
                    IncludeDebitCardUserStatusBannerViewBinding includeDebitCardUserStatusBannerViewBindingBind = IncludeDebitCardUserStatusBannerViewBinding.bind(viewFindChildViewById);
                    i = C30556R.id.linking_options_disclosure;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C30556R.id.linking_options_disclosure_compose_view;
                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView != null) {
                            i = C30556R.id.loading_view;
                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                            if (shimmerLoadingView != null) {
                                i = C30556R.id.subtitle;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new ActivityLinkingOptionsBinding((LinearLayout) view, rdsRowView, linearLayout, rdsRowView2, includeDebitCardUserStatusBannerViewBindingBind, rhTextView, composeView, shimmerLoadingView, rhTextView2);
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
