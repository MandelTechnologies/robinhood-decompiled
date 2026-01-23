package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.card.RhyCardSettingsLayout;
import com.robinhood.android.cash.rhy.tab.p077v2.card.RhyDebitCardView;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentRhyCardSettingsBinding implements ViewBinding {
    public final RhyDebitCardView rhyCardSettingsDebitCardView;
    public final RhyCardSettingsLayout rhyCardSettingsLayout;
    public final RdsInfoBannerView rhyCardSettingsVirtualCardBanner;
    public final RhTextView rhyCardSettingsVirtualCardTitle;
    public final Guideline rhyOverviewCardBottomGuideline;
    private final ScrollView rootView;

    private FragmentRhyCardSettingsBinding(ScrollView scrollView, RhyDebitCardView rhyDebitCardView, RhyCardSettingsLayout rhyCardSettingsLayout, RdsInfoBannerView rdsInfoBannerView, RhTextView rhTextView, Guideline guideline) {
        this.rootView = scrollView;
        this.rhyCardSettingsDebitCardView = rhyDebitCardView;
        this.rhyCardSettingsLayout = rhyCardSettingsLayout;
        this.rhyCardSettingsVirtualCardBanner = rdsInfoBannerView;
        this.rhyCardSettingsVirtualCardTitle = rhTextView;
        this.rhyOverviewCardBottomGuideline = guideline;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentRhyCardSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyCardSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.fragment_rhy_card_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyCardSettingsBinding bind(View view) {
        int i = C10285R.id.rhy_card_settings_debit_card_view;
        RhyDebitCardView rhyDebitCardView = (RhyDebitCardView) ViewBindings.findChildViewById(view, i);
        if (rhyDebitCardView != null) {
            i = C10285R.id.rhy_card_settings_layout;
            RhyCardSettingsLayout rhyCardSettingsLayout = (RhyCardSettingsLayout) ViewBindings.findChildViewById(view, i);
            if (rhyCardSettingsLayout != null) {
                i = C10285R.id.rhy_card_settings_virtual_card_banner;
                RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                if (rdsInfoBannerView != null) {
                    i = C10285R.id.rhy_card_settings_virtual_card_title;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C10285R.id.rhy_overview_card_bottom_guideline;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            return new FragmentRhyCardSettingsBinding((ScrollView) view, rhyDebitCardView, rhyCardSettingsLayout, rdsInfoBannerView, rhTextView, guideline);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
