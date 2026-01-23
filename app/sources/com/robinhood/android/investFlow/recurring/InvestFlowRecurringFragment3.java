package com.robinhood.android.investFlow.recurring;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowRecurringBinding;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestFlowRecurringFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"bindCommonViewState", "", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowRecurringBinding;", "state", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestFlowRecurringFragment3 {
    public static /* synthetic */ void bindCommonViewState$default(FragmentInvestFlowRecurringBinding fragmentInvestFlowRecurringBinding, InvestFlowRecurringViewState investFlowRecurringViewState, BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 2) != 0) {
            brokerageAccountType = null;
        }
        bindCommonViewState(fragmentInvestFlowRecurringBinding, investFlowRecurringViewState, brokerageAccountType);
    }

    public static final void bindCommonViewState(FragmentInvestFlowRecurringBinding fragmentInvestFlowRecurringBinding, InvestFlowRecurringViewState state, BrokerageAccountType brokerageAccountType) {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        CharSequence text4;
        CharSequence text5;
        Intrinsics.checkNotNullParameter(fragmentInvestFlowRecurringBinding, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        if (brokerageAccountType == null) {
            brokerageAccountType = state.getBrokerageAccountType();
        }
        boolean zIsRetirement = brokerageAccountType != null ? brokerageAccountType.isRetirement() : false;
        RhTextView rhTextView = fragmentInvestFlowRecurringBinding.investFlowRecurringTitleTxt;
        StringResource recurringTitleText = state.getRecurringTitleText();
        Resources resources = rhTextView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(recurringTitleText.getText(resources));
        RdsRowView rdsRowView = fragmentInvestFlowRecurringBinding.frequencyRow;
        StringResource frequencyMetadataPrimaryText = state.getFrequencyMetadataPrimaryText();
        Resources resources2 = rdsRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rdsRowView.setMetadataPrimaryText(frequencyMetadataPrimaryText.getText(resources2));
        StringResource frequencyMetadataSecondaryText = state.getFrequencyMetadataSecondaryText();
        Resources resources3 = rdsRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rdsRowView.setMetadataSecondaryText(frequencyMetadataSecondaryText.getText(resources3));
        RdsRowView rdsRowView2 = fragmentInvestFlowRecurringBinding.startDateRow;
        Resources resources4 = rdsRowView2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        StringResource stringResourceStartDateMetadataPrimaryText = state.startDateMetadataPrimaryText(resources4);
        Resources resources5 = rdsRowView2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
        rdsRowView2.setMetadataPrimaryText(stringResourceStartDateMetadataPrimaryText.getText(resources5));
        StringResource startDateMetadataSecondaryText = state.getStartDateMetadataSecondaryText();
        Resources resources6 = rdsRowView2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
        rdsRowView2.setMetadataSecondaryText(startDateMetadataSecondaryText.getText(resources6));
        RdsRowView rdsRowView3 = fragmentInvestFlowRecurringBinding.paymentMethodRow;
        StringResource paymentMethodCtaText = state.getPaymentMethodCtaText();
        CharSequence text6 = null;
        if (paymentMethodCtaText != null) {
            Resources resources7 = rdsRowView3.getResources();
            Intrinsics.checkNotNullExpressionValue(resources7, "getResources(...)");
            rdsRowView3.setCtaText(paymentMethodCtaText.getText(resources7));
        } else {
            rdsRowView3.setCtaText(null);
            StringResource paymentMethodMetadataPrimaryText = state.getPaymentMethodMetadataPrimaryText();
            Resources resources8 = rdsRowView3.getResources();
            Intrinsics.checkNotNullExpressionValue(resources8, "getResources(...)");
            rdsRowView3.setMetadataPrimaryText(paymentMethodMetadataPrimaryText.getText(resources8));
            StringResource paymentMethodMetadataSecondaryText = state.getPaymentMethodMetadataSecondaryText();
            if (paymentMethodMetadataSecondaryText != null) {
                Resources resources9 = rdsRowView3.getResources();
                Intrinsics.checkNotNullExpressionValue(resources9, "getResources(...)");
                text = paymentMethodMetadataSecondaryText.getText(resources9);
            } else {
                text = null;
            }
            rdsRowView3.setMetadataSecondaryText(text);
        }
        RdsRowView rdsRowView4 = fragmentInvestFlowRecurringBinding.backupPaymentMethodRow;
        Intrinsics.checkNotNull(rdsRowView4);
        rdsRowView4.setVisibility(state.getBackupPaymentMethodRowVisible() ? 0 : 8);
        StringResource backupPaymentMethodCtaText = state.getBackupPaymentMethodCtaText();
        if (backupPaymentMethodCtaText != null) {
            Resources resources10 = rdsRowView4.getResources();
            Intrinsics.checkNotNullExpressionValue(resources10, "getResources(...)");
            text2 = backupPaymentMethodCtaText.getText(resources10);
        } else {
            text2 = null;
        }
        rdsRowView4.setCtaText(text2);
        StringResource backupPaymentMethodMetadataPrimaryText = state.getBackupPaymentMethodMetadataPrimaryText();
        if (backupPaymentMethodMetadataPrimaryText != null) {
            Resources resources11 = rdsRowView4.getResources();
            Intrinsics.checkNotNullExpressionValue(resources11, "getResources(...)");
            text3 = backupPaymentMethodMetadataPrimaryText.getText(resources11);
        } else {
            text3 = null;
        }
        rdsRowView4.setMetadataPrimaryText(text3);
        StringResource backupPaymentMethodMetadataSecondaryText = state.getBackupPaymentMethodMetadataSecondaryText();
        if (backupPaymentMethodMetadataSecondaryText != null) {
            Resources resources12 = rdsRowView4.getResources();
            Intrinsics.checkNotNullExpressionValue(resources12, "getResources(...)");
            text4 = backupPaymentMethodMetadataSecondaryText.getText(resources12);
        } else {
            text4 = null;
        }
        rdsRowView4.setMetadataSecondaryText(text4);
        RdsRowView rdsRowView5 = fragmentInvestFlowRecurringBinding.accountTypeRow;
        StringResource accountTypeRowText = state.getAccountTypeRowText();
        Resources resources13 = rdsRowView5.getResources();
        Intrinsics.checkNotNullExpressionValue(resources13, "getResources(...)");
        rdsRowView5.setPrimaryText(accountTypeRowText.getText(resources13));
        StringResource accountNameTitle = state.getAccountNameTitle();
        if (accountNameTitle != null) {
            Resources resources14 = rdsRowView5.getResources();
            Intrinsics.checkNotNullExpressionValue(resources14, "getResources(...)");
            text5 = accountNameTitle.getText(resources14);
        } else {
            text5 = null;
        }
        rdsRowView5.setMetadataPrimaryText(text5);
        StringResource accountNameSubtitle = state.getAccountNameSubtitle();
        if (accountNameSubtitle != null) {
            Resources resources15 = rdsRowView5.getResources();
            Intrinsics.checkNotNullExpressionValue(resources15, "getResources(...)");
            text6 = accountNameSubtitle.getText(resources15);
        }
        rdsRowView5.setMetadataSecondaryText(text6);
        if (zIsRetirement) {
            RhTextView rhTextView2 = fragmentInvestFlowRecurringBinding.retirementSubtitle;
            Intrinsics.checkNotNull(rhTextView2);
            rhTextView2.setVisibility(0);
            StringResource retirementSubtitle = state.getRetirementSubtitle();
            Resources resources16 = rhTextView2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources16, "getResources(...)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(retirementSubtitle.getText(resources16));
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, 4, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), 29, 37, 33);
            fragmentInvestFlowRecurringBinding.retirementSubtitle.setText(spannableStringBuilder);
        }
    }
}
