package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.amount.RhPercentageInputView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeRecurringOrderBinding implements ViewBinding {
    public final ImageView amountLabelQuestionMarkImg;
    public final RhTextView orderReviewTxt;
    public final RhTextView orderSummaryHeader;
    public final RhTextView recurringOrderAccountLabel;
    public final RhTextView recurringOrderAccountSubtitleTxt;
    public final RhTextView recurringOrderAccountTxt;
    public final View recurringOrderCreateAccountDivider;
    public final View recurringOrderCreateAmountDivider;
    public final RhMoneyInputView recurringOrderCreateAmountDollarValue;
    public final RhTextView recurringOrderCreateAmountLabelTxt;
    public final RhPercentageInputView recurringOrderCreateAmountPercentageValue;
    public final RhTextView recurringOrderCreateScheduleBackupPaymentTxt;
    public final View recurringOrderCreateScheduleDivider;
    public final RhTextView recurringOrderCreateScheduleEditInvestmentBtn;
    public final RhTextView recurringOrderCreateScheduleFrequencyTxt;
    public final RhTextView recurringOrderCreateScheduleLabelTxt;
    public final RhTextView recurringOrderCreateScheduleSourceOfFundsTxt;
    public final RhTextView recurringOrderCreateScheduleStartDateTxt;
    public final RhTextView recurringOrderCreateTitleTxt;
    private final View rootView;

    private MergeRecurringOrderBinding(View view, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, View view2, View view3, RhMoneyInputView rhMoneyInputView, RhTextView rhTextView6, RhPercentageInputView rhPercentageInputView, RhTextView rhTextView7, View view4, RhTextView rhTextView8, RhTextView rhTextView9, RhTextView rhTextView10, RhTextView rhTextView11, RhTextView rhTextView12, RhTextView rhTextView13) {
        this.rootView = view;
        this.amountLabelQuestionMarkImg = imageView;
        this.orderReviewTxt = rhTextView;
        this.orderSummaryHeader = rhTextView2;
        this.recurringOrderAccountLabel = rhTextView3;
        this.recurringOrderAccountSubtitleTxt = rhTextView4;
        this.recurringOrderAccountTxt = rhTextView5;
        this.recurringOrderCreateAccountDivider = view2;
        this.recurringOrderCreateAmountDivider = view3;
        this.recurringOrderCreateAmountDollarValue = rhMoneyInputView;
        this.recurringOrderCreateAmountLabelTxt = rhTextView6;
        this.recurringOrderCreateAmountPercentageValue = rhPercentageInputView;
        this.recurringOrderCreateScheduleBackupPaymentTxt = rhTextView7;
        this.recurringOrderCreateScheduleDivider = view4;
        this.recurringOrderCreateScheduleEditInvestmentBtn = rhTextView8;
        this.recurringOrderCreateScheduleFrequencyTxt = rhTextView9;
        this.recurringOrderCreateScheduleLabelTxt = rhTextView10;
        this.recurringOrderCreateScheduleSourceOfFundsTxt = rhTextView11;
        this.recurringOrderCreateScheduleStartDateTxt = rhTextView12;
        this.recurringOrderCreateTitleTxt = rhTextView13;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRecurringOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11595R.layout.merge_recurring_order, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRecurringOrderBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = C11595R.id.amount_label_question_mark_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C11595R.id.order_review_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11595R.id.order_summary_header;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C11595R.id.recurring_order_account_label;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C11595R.id.recurring_order_account_subtitle_txt;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            i = C11595R.id.recurring_order_account_txt;
                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11595R.id.recurring_order_create_account_divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C11595R.id.recurring_order_create_amount_divider))) != null) {
                                i = C11595R.id.recurring_order_create_amount_dollar_value;
                                RhMoneyInputView rhMoneyInputView = (RhMoneyInputView) ViewBindings.findChildViewById(view, i);
                                if (rhMoneyInputView != null) {
                                    i = C11595R.id.recurring_order_create_amount_label_txt;
                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView6 != null) {
                                        i = C11595R.id.recurring_order_create_amount_percentage_value;
                                        RhPercentageInputView rhPercentageInputView = (RhPercentageInputView) ViewBindings.findChildViewById(view, i);
                                        if (rhPercentageInputView != null) {
                                            i = C11595R.id.recurring_order_create_schedule_backup_payment_txt;
                                            RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView7 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C11595R.id.recurring_order_create_schedule_divider))) != null) {
                                                i = C11595R.id.recurring_order_create_schedule_edit_investment_btn;
                                                RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView8 != null) {
                                                    i = C11595R.id.recurring_order_create_schedule_frequency_txt;
                                                    RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView9 != null) {
                                                        i = C11595R.id.recurring_order_create_schedule_label_txt;
                                                        RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView10 != null) {
                                                            i = C11595R.id.recurring_order_create_schedule_source_of_funds_txt;
                                                            RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView11 != null) {
                                                                i = C11595R.id.recurring_order_create_schedule_start_date_txt;
                                                                RhTextView rhTextView12 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView12 != null) {
                                                                    i = C11595R.id.recurring_order_create_title_txt;
                                                                    RhTextView rhTextView13 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView13 != null) {
                                                                        return new MergeRecurringOrderBinding(view, imageView, rhTextView, rhTextView2, rhTextView3, rhTextView4, rhTextView5, viewFindChildViewById, viewFindChildViewById2, rhMoneyInputView, rhTextView6, rhPercentageInputView, rhTextView7, viewFindChildViewById3, rhTextView8, rhTextView9, rhTextView10, rhTextView11, rhTextView12, rhTextView13);
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
