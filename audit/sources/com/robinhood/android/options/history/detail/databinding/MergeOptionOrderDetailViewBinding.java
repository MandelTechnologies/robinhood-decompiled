package com.robinhood.android.options.history.detail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.options.history.detail.C23086R;

/* loaded from: classes11.dex */
public final class MergeOptionOrderDetailViewBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    public final RdsDataRowView optionOrderDetailAccountUsed;
    public final RdsDataRowView optionOrderDetailBackupWithholding;
    public final RdsButton optionOrderDetailCancelBtn;
    public final RdsDataRowView optionOrderDetailEffect;
    public final RdsDataRowView optionOrderDetailFilled;
    public final RdsDataRowView optionOrderDetailFilledQuantity;
    public final RdsDataRowView optionOrderDetailLimitPrice;
    public final Space optionOrderDetailMultilegSentinel;
    public final RdsDataRowView optionOrderDetailNetCredit;
    public final LinearLayout optionOrderDetailParent;
    public final RdsDataRowView optionOrderDetailQuantity;
    public final RdsButton optionOrderDetailReplaceOrderBtn;
    public final RdsDataRowView optionOrderDetailSide;
    public final RdsDataRowView optionOrderDetailState;
    public final RdsDataRowView optionOrderDetailStopPrice;
    public final RdsDataRowView optionOrderDetailSubmitted;
    public final RdsDataRowView optionOrderDetailTimeInForce;
    public final RdsDataRowView optionOrderDetailTotal;
    public final RdsButton optionOrderDetailTradeConfirmBtn;
    private final View rootView;

    private MergeOptionOrderDetailViewBinding(View view, ShimmerLoadingView shimmerLoadingView, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsButton rdsButton, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, RdsDataRowView rdsDataRowView6, Space space, RdsDataRowView rdsDataRowView7, LinearLayout linearLayout, RdsDataRowView rdsDataRowView8, RdsButton rdsButton2, RdsDataRowView rdsDataRowView9, RdsDataRowView rdsDataRowView10, RdsDataRowView rdsDataRowView11, RdsDataRowView rdsDataRowView12, RdsDataRowView rdsDataRowView13, RdsDataRowView rdsDataRowView14, RdsButton rdsButton3) {
        this.rootView = view;
        this.loadingView = shimmerLoadingView;
        this.optionOrderDetailAccountUsed = rdsDataRowView;
        this.optionOrderDetailBackupWithholding = rdsDataRowView2;
        this.optionOrderDetailCancelBtn = rdsButton;
        this.optionOrderDetailEffect = rdsDataRowView3;
        this.optionOrderDetailFilled = rdsDataRowView4;
        this.optionOrderDetailFilledQuantity = rdsDataRowView5;
        this.optionOrderDetailLimitPrice = rdsDataRowView6;
        this.optionOrderDetailMultilegSentinel = space;
        this.optionOrderDetailNetCredit = rdsDataRowView7;
        this.optionOrderDetailParent = linearLayout;
        this.optionOrderDetailQuantity = rdsDataRowView8;
        this.optionOrderDetailReplaceOrderBtn = rdsButton2;
        this.optionOrderDetailSide = rdsDataRowView9;
        this.optionOrderDetailState = rdsDataRowView10;
        this.optionOrderDetailStopPrice = rdsDataRowView11;
        this.optionOrderDetailSubmitted = rdsDataRowView12;
        this.optionOrderDetailTimeInForce = rdsDataRowView13;
        this.optionOrderDetailTotal = rdsDataRowView14;
        this.optionOrderDetailTradeConfirmBtn = rdsButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionOrderDetailViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C23086R.layout.merge_option_order_detail_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionOrderDetailViewBinding bind(View view) {
        int i = C23086R.id.loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C23086R.id.option_order_detail_account_used;
            RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView != null) {
                i = C23086R.id.option_order_detail_backup_withholding;
                RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView2 != null) {
                    i = C23086R.id.option_order_detail_cancel_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C23086R.id.option_order_detail_effect;
                        RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView3 != null) {
                            i = C23086R.id.option_order_detail_filled;
                            RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView4 != null) {
                                i = C23086R.id.option_order_detail_filled_quantity;
                                RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView5 != null) {
                                    i = C23086R.id.option_order_detail_limit_price;
                                    RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView6 != null) {
                                        i = C23086R.id.option_order_detail_multileg_sentinel;
                                        Space space = (Space) ViewBindings.findChildViewById(view, i);
                                        if (space != null) {
                                            i = C23086R.id.option_order_detail_net_credit;
                                            RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                            if (rdsDataRowView7 != null) {
                                                i = C23086R.id.option_order_detail_parent;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C23086R.id.option_order_detail_quantity;
                                                    RdsDataRowView rdsDataRowView8 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                    if (rdsDataRowView8 != null) {
                                                        i = C23086R.id.option_order_detail_replace_order_btn;
                                                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                        if (rdsButton2 != null) {
                                                            i = C23086R.id.option_order_detail_side;
                                                            RdsDataRowView rdsDataRowView9 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsDataRowView9 != null) {
                                                                i = C23086R.id.option_order_detail_state;
                                                                RdsDataRowView rdsDataRowView10 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                if (rdsDataRowView10 != null) {
                                                                    i = C23086R.id.option_order_detail_stop_price;
                                                                    RdsDataRowView rdsDataRowView11 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                    if (rdsDataRowView11 != null) {
                                                                        i = C23086R.id.option_order_detail_submitted;
                                                                        RdsDataRowView rdsDataRowView12 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                        if (rdsDataRowView12 != null) {
                                                                            i = C23086R.id.option_order_detail_time_in_force;
                                                                            RdsDataRowView rdsDataRowView13 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                            if (rdsDataRowView13 != null) {
                                                                                i = C23086R.id.option_order_detail_total;
                                                                                RdsDataRowView rdsDataRowView14 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                                if (rdsDataRowView14 != null) {
                                                                                    i = C23086R.id.option_order_detail_trade_confirm_btn;
                                                                                    RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                                    if (rdsButton3 != null) {
                                                                                        return new MergeOptionOrderDetailViewBinding(view, shimmerLoadingView, rdsDataRowView, rdsDataRowView2, rdsButton, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5, rdsDataRowView6, space, rdsDataRowView7, linearLayout, rdsDataRowView8, rdsButton2, rdsDataRowView9, rdsDataRowView10, rdsDataRowView11, rdsDataRowView12, rdsDataRowView13, rdsDataRowView14, rdsButton3);
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
