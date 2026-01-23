package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAcatsLandedBinding implements ViewBinding {
    public final RhTextView acatsInLandedAccountNumberTxt;
    public final RhTextView acatsInLandedAssetCountTxt;
    public final RhTextView acatsInLandedBrokerTxt;
    public final RhTextView acatsInLandedCongratsTxt;
    public final RhTextView acatsInLandedDescriptionTxt;
    public final RdsButton acatsInLandedManageBtn;
    public final RhTextView acatsInLandedTitleTxt;
    public final RdsButton acatsInLandedViewDetailBtn;
    public final View divider;
    private final LinearLayout rootView;

    private FragmentAcatsLandedBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RdsButton rdsButton, RhTextView rhTextView6, RdsButton rdsButton2, View view) {
        this.rootView = linearLayout;
        this.acatsInLandedAccountNumberTxt = rhTextView;
        this.acatsInLandedAssetCountTxt = rhTextView2;
        this.acatsInLandedBrokerTxt = rhTextView3;
        this.acatsInLandedCongratsTxt = rhTextView4;
        this.acatsInLandedDescriptionTxt = rhTextView5;
        this.acatsInLandedManageBtn = rdsButton;
        this.acatsInLandedTitleTxt = rhTextView6;
        this.acatsInLandedViewDetailBtn = rdsButton2;
        this.divider = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsLandedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsLandedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.fragment_acats_landed, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsLandedBinding bind(View view) {
        View viewFindChildViewById;
        int i = C7725R.id.acats_in_landed_account_number_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C7725R.id.acats_in_landed_asset_count_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C7725R.id.acats_in_landed_broker_txt;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C7725R.id.acats_in_landed_congrats_txt;
                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView4 != null) {
                        i = C7725R.id.acats_in_landed_description_txt;
                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView5 != null) {
                            i = C7725R.id.acats_in_landed_manage_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C7725R.id.acats_in_landed_title_txt;
                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView6 != null) {
                                    i = C7725R.id.acats_in_landed_view_detail_btn;
                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C7725R.id.divider))) != null) {
                                        return new FragmentAcatsLandedBinding((LinearLayout) view, rhTextView, rhTextView2, rhTextView3, rhTextView4, rhTextView5, rdsButton, rhTextView6, rdsButton2, viewFindChildViewById);
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
