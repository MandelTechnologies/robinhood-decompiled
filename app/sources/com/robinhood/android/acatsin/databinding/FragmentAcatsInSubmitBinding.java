package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAcatsInSubmitBinding implements ViewBinding {
    public final RdsDataRowView accountNameRow;
    public final RdsDataRowView accountNumberRow;
    public final View assetDivider;
    public final RdsDataRowView assetListRow;
    public final FrameLayout assetListRowParent;
    public final RowBrokerageBinding brokerageRow;
    public final ImageView caret;
    public final RhTextView disclaimer;
    public final RdsDataRowView matchRow;
    public final LinearLayout nameOnAccountContainer;
    public final RhTextView nameOnAccountLabel;
    public final RhTextView nameOnAccountValue;
    private final ConstraintLayout rootView;
    public final RdsButton submitButton;
    public final RhTextView title;

    private FragmentAcatsInSubmitBinding(ConstraintLayout constraintLayout, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, View view, RdsDataRowView rdsDataRowView3, FrameLayout frameLayout, RowBrokerageBinding rowBrokerageBinding, ImageView imageView, RhTextView rhTextView, RdsDataRowView rdsDataRowView4, LinearLayout linearLayout, RhTextView rhTextView2, RhTextView rhTextView3, RdsButton rdsButton, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.accountNameRow = rdsDataRowView;
        this.accountNumberRow = rdsDataRowView2;
        this.assetDivider = view;
        this.assetListRow = rdsDataRowView3;
        this.assetListRowParent = frameLayout;
        this.brokerageRow = rowBrokerageBinding;
        this.caret = imageView;
        this.disclaimer = rhTextView;
        this.matchRow = rdsDataRowView4;
        this.nameOnAccountContainer = linearLayout;
        this.nameOnAccountLabel = rhTextView2;
        this.nameOnAccountValue = rhTextView3;
        this.submitButton = rdsButton;
        this.title = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInSubmitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInSubmitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.fragment_acats_in_submit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInSubmitBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C7725R.id.account_name_row;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C7725R.id.account_number_row;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C7725R.id.asset_divider))) != null) {
                i = C7725R.id.asset_list_row;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C7725R.id.asset_list_row_parent;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C7725R.id.brokerage_row))) != null) {
                        RowBrokerageBinding rowBrokerageBindingBind = RowBrokerageBinding.bind(viewFindChildViewById2);
                        i = C7725R.id.caret;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C7725R.id.disclaimer;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                i = C7725R.id.match_row;
                                RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView4 != null) {
                                    i = C7725R.id.name_on_account_container;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = C7725R.id.name_on_account_label;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C7725R.id.name_on_account_value;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                i = C7725R.id.submit_button;
                                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                if (rdsButton != null) {
                                                    i = C7725R.id.title;
                                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView4 != null) {
                                                        return new FragmentAcatsInSubmitBinding((ConstraintLayout) view, rdsDataRowView, rdsDataRowView2, viewFindChildViewById, rdsDataRowView3, frameLayout, rowBrokerageBindingBind, imageView, rhTextView, rdsDataRowView4, linearLayout, rhTextView2, rhTextView3, rdsButton, rhTextView4);
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
