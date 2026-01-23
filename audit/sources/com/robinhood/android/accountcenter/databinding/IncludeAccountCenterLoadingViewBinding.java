package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.AccountCenterLoadingView;

/* loaded from: classes24.dex */
public final class IncludeAccountCenterLoadingViewBinding implements ViewBinding {
    public final View accountCenterLoadingAccountTotalLabel;
    public final View accountCenterLoadingAccountTotalValue;
    public final View accountCenterLoadingDisclosure;
    public final View accountCenterLoadingInvestingItem1;
    public final View accountCenterLoadingInvestingItem2;
    public final View accountCenterLoadingInvestingItem3;
    public final View accountCenterLoadingInvestingItem4;
    public final View accountCenterLoadingInvestingTitle;
    public final View accountCenterLoadingInvestingValue1;
    public final View accountCenterLoadingInvestingValue2;
    public final View accountCenterLoadingInvestingValue3;
    public final View accountCenterLoadingInvestingValue4;
    public final View accountCenterLoadingMoneyItem1;
    public final View accountCenterLoadingMoneyTitle;
    public final View accountCenterLoadingMoneyValue1;
    public final View accountCenterLoadingProfileImg;
    public final View accountCenterLoadingProfileUsername;
    public final View accountCenterLoadingSeparator2;
    private final AccountCenterLoadingView rootView;

    private IncludeAccountCenterLoadingViewBinding(AccountCenterLoadingView accountCenterLoadingView, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10, View view11, View view12, View view13, View view14, View view15, View view16, View view17, View view18) {
        this.rootView = accountCenterLoadingView;
        this.accountCenterLoadingAccountTotalLabel = view;
        this.accountCenterLoadingAccountTotalValue = view2;
        this.accountCenterLoadingDisclosure = view3;
        this.accountCenterLoadingInvestingItem1 = view4;
        this.accountCenterLoadingInvestingItem2 = view5;
        this.accountCenterLoadingInvestingItem3 = view6;
        this.accountCenterLoadingInvestingItem4 = view7;
        this.accountCenterLoadingInvestingTitle = view8;
        this.accountCenterLoadingInvestingValue1 = view9;
        this.accountCenterLoadingInvestingValue2 = view10;
        this.accountCenterLoadingInvestingValue3 = view11;
        this.accountCenterLoadingInvestingValue4 = view12;
        this.accountCenterLoadingMoneyItem1 = view13;
        this.accountCenterLoadingMoneyTitle = view14;
        this.accountCenterLoadingMoneyValue1 = view15;
        this.accountCenterLoadingProfileImg = view16;
        this.accountCenterLoadingProfileUsername = view17;
        this.accountCenterLoadingSeparator2 = view18;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AccountCenterLoadingView getRoot() {
        return this.rootView;
    }

    public static IncludeAccountCenterLoadingViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAccountCenterLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_account_center_loading_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAccountCenterLoadingViewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewFindChildViewById6;
        View viewFindChildViewById7;
        View viewFindChildViewById8;
        View viewFindChildViewById9;
        View viewFindChildViewById10;
        View viewFindChildViewById11;
        View viewFindChildViewById12;
        View viewFindChildViewById13;
        View viewFindChildViewById14;
        View viewFindChildViewById15;
        View viewFindChildViewById16;
        View viewFindChildViewById17;
        int i = C8293R.id.account_center_loading_account_total_label;
        View viewFindChildViewById18 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById18 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_account_total_value))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_disclosure))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_investing_item1))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_investing_item2))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_investing_item3))) != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_investing_item4))) != null && (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_investing_title))) != null && (viewFindChildViewById8 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_investing_value1))) != null && (viewFindChildViewById9 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_investing_value2))) != null && (viewFindChildViewById10 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_investing_value3))) != null && (viewFindChildViewById11 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_investing_value4))) != null && (viewFindChildViewById12 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_money_item1))) != null && (viewFindChildViewById13 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_money_title))) != null && (viewFindChildViewById14 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_money_value1))) != null && (viewFindChildViewById15 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_profile_img))) != null && (viewFindChildViewById16 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_profile_username))) != null && (viewFindChildViewById17 = ViewBindings.findChildViewById(view, (i = C8293R.id.account_center_loading_separator2))) != null) {
            return new IncludeAccountCenterLoadingViewBinding((AccountCenterLoadingView) view, viewFindChildViewById18, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9, viewFindChildViewById10, viewFindChildViewById11, viewFindChildViewById12, viewFindChildViewById13, viewFindChildViewById14, viewFindChildViewById15, viewFindChildViewById16, viewFindChildViewById17);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
