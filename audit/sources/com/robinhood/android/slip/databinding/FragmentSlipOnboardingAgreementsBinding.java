package com.robinhood.android.slip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.slip.C28532R;

/* loaded from: classes5.dex */
public final class FragmentSlipOnboardingAgreementsBinding implements ViewBinding {
    public final ComposeView additionalCheckboxesComposeView;
    public final RecyclerView agreementLinksList;
    public final RhTextView crsLink;
    public final RdsButton cta;
    public final LinearLayout legacyContainer;
    public final RhTextView markdown;
    public final LinearLayout markdownContainer;
    private final LinearLayout rootView;
    public final NestedScrollView scrollView;
    public final RhTextView subtitle;
    public final ComposeView summaryLinksList;
    public final RhTextView summaryLinksTitle;
    public final RhTextView title;

    private FragmentSlipOnboardingAgreementsBinding(LinearLayout linearLayout, ComposeView composeView, RecyclerView recyclerView, RhTextView rhTextView, RdsButton rdsButton, LinearLayout linearLayout2, RhTextView rhTextView2, LinearLayout linearLayout3, NestedScrollView nestedScrollView, RhTextView rhTextView3, ComposeView composeView2, RhTextView rhTextView4, RhTextView rhTextView5) {
        this.rootView = linearLayout;
        this.additionalCheckboxesComposeView = composeView;
        this.agreementLinksList = recyclerView;
        this.crsLink = rhTextView;
        this.cta = rdsButton;
        this.legacyContainer = linearLayout2;
        this.markdown = rhTextView2;
        this.markdownContainer = linearLayout3;
        this.scrollView = nestedScrollView;
        this.subtitle = rhTextView3;
        this.summaryLinksList = composeView2;
        this.summaryLinksTitle = rhTextView4;
        this.title = rhTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSlipOnboardingAgreementsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSlipOnboardingAgreementsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28532R.layout.fragment_slip_onboarding_agreements, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSlipOnboardingAgreementsBinding bind(View view) {
        int i = C28532R.id.additional_checkboxes_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C28532R.id.agreement_links_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C28532R.id.crs_link;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C28532R.id.cta;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C28532R.id.legacy_container;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C28532R.id.markdown;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C28532R.id.markdown_container;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C28532R.id.scroll_view;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (nestedScrollView != null) {
                                        i = C28532R.id.subtitle;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            i = C28532R.id.summary_links_list;
                                            ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                            if (composeView2 != null) {
                                                i = C28532R.id.summary_links_title;
                                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView4 != null) {
                                                    i = C28532R.id.title;
                                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView5 != null) {
                                                        return new FragmentSlipOnboardingAgreementsBinding((LinearLayout) view, composeView, recyclerView, rhTextView, rdsButton, linearLayout, rhTextView2, linearLayout2, nestedScrollView, rhTextView3, composeView2, rhTextView4, rhTextView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
