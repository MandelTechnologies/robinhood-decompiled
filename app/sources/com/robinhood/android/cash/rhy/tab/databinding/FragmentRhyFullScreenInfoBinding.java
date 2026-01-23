package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyHeroAssetView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentRhyFullScreenInfoBinding implements ViewBinding {
    public final RdsButton rhyFullScreenInfoButton;
    public final RhyHeroAssetView rhyFullScreenInfoHeroAssetView;
    public final RhTextView rhyFullScreenInfoMessage;
    public final FocusSafeNestedScrollView rhyFullScreenInfoScrollView;
    public final RhTextView rhyFullScreenInfoTitle;
    private final FocusSafeNestedScrollView rootView;

    private FragmentRhyFullScreenInfoBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, RdsButton rdsButton, RhyHeroAssetView rhyHeroAssetView, RhTextView rhTextView, FocusSafeNestedScrollView focusSafeNestedScrollView2, RhTextView rhTextView2) {
        this.rootView = focusSafeNestedScrollView;
        this.rhyFullScreenInfoButton = rdsButton;
        this.rhyFullScreenInfoHeroAssetView = rhyHeroAssetView;
        this.rhyFullScreenInfoMessage = rhTextView;
        this.rhyFullScreenInfoScrollView = focusSafeNestedScrollView2;
        this.rhyFullScreenInfoTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentRhyFullScreenInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyFullScreenInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.fragment_rhy_full_screen_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyFullScreenInfoBinding bind(View view) {
        int i = C10285R.id.rhy_full_screen_info_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10285R.id.rhy_full_screen_info_hero_asset_view;
            RhyHeroAssetView rhyHeroAssetView = (RhyHeroAssetView) ViewBindings.findChildViewById(view, i);
            if (rhyHeroAssetView != null) {
                i = C10285R.id.rhy_full_screen_info_message;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) view;
                    i = C10285R.id.rhy_full_screen_info_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentRhyFullScreenInfoBinding(focusSafeNestedScrollView, rdsButton, rhyHeroAssetView, rhTextView, focusSafeNestedScrollView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
