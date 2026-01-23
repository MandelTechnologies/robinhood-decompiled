package com.robinhood.android.trade.options.confirmation;

import com.robinhood.android.margin.contracts.MarginAccountUpsellFragmentKey;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderConfirmationState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u0012HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0018HÆ\u0003J¯\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationViewState;", "", "isReplaceOrderBtnVisible", "", "optionChainId", "Ljava/util/UUID;", "optionsCancelNewContextData", "Lcom/robinhood/android/trade/options/confirmation/OptionsCancelNewContextData;", "orderConfirmationTitle", "", "orderStatePrompt", "fillPriceRowState", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationRowState;", "limitPriceRowState", "stopPriceRowState", "totalCreditOrCostLabelText", "totalCreditOrCostValueText", "feeFooterState", "Lcom/robinhood/android/trade/options/confirmation/FeeFooterState;", "accountNameTitle", "Lcom/robinhood/utils/resource/StringResource;", "accountNameSubtitle", "isEligibleToShowL3EntryPoint", "marginAccountUpsell", "Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "<init>", "(ZLjava/util/UUID;Lcom/robinhood/android/trade/options/confirmation/OptionsCancelNewContextData;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationRowState;Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationRowState;Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationRowState;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/trade/options/confirmation/FeeFooterState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;)V", "()Z", "getOptionChainId", "()Ljava/util/UUID;", "getOptionsCancelNewContextData", "()Lcom/robinhood/android/trade/options/confirmation/OptionsCancelNewContextData;", "getOrderConfirmationTitle", "()Ljava/lang/String;", "getOrderStatePrompt", "getFillPriceRowState", "()Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationRowState;", "getLimitPriceRowState", "getStopPriceRowState", "getTotalCreditOrCostLabelText", "getTotalCreditOrCostValueText", "getFeeFooterState", "()Lcom/robinhood/android/trade/options/confirmation/FeeFooterState;", "getAccountNameTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getAccountNameSubtitle", "getMarginAccountUpsell", "()Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderConfirmationViewState {
    public static final int $stable = 8;
    private final StringResource accountNameSubtitle;
    private final StringResource accountNameTitle;
    private final FeeFooterState feeFooterState;
    private final OptionOrderConfirmationRowState fillPriceRowState;
    private final boolean isEligibleToShowL3EntryPoint;
    private final boolean isReplaceOrderBtnVisible;
    private final OptionOrderConfirmationRowState limitPriceRowState;
    private final MarginAccountUpsellFragmentKey marginAccountUpsell;
    private final UUID optionChainId;
    private final OptionsCancelNewContextData optionsCancelNewContextData;
    private final String orderConfirmationTitle;
    private final String orderStatePrompt;
    private final OptionOrderConfirmationRowState stopPriceRowState;
    private final String totalCreditOrCostLabelText;
    private final String totalCreditOrCostValueText;

    /* renamed from: component1, reason: from getter */
    public final boolean getIsReplaceOrderBtnVisible() {
        return this.isReplaceOrderBtnVisible;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTotalCreditOrCostValueText() {
        return this.totalCreditOrCostValueText;
    }

    /* renamed from: component11, reason: from getter */
    public final FeeFooterState getFeeFooterState() {
        return this.feeFooterState;
    }

    /* renamed from: component12, reason: from getter */
    public final StringResource getAccountNameTitle() {
        return this.accountNameTitle;
    }

    /* renamed from: component13, reason: from getter */
    public final StringResource getAccountNameSubtitle() {
        return this.accountNameSubtitle;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsEligibleToShowL3EntryPoint() {
        return this.isEligibleToShowL3EntryPoint;
    }

    /* renamed from: component15, reason: from getter */
    public final MarginAccountUpsellFragmentKey getMarginAccountUpsell() {
        return this.marginAccountUpsell;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionsCancelNewContextData getOptionsCancelNewContextData() {
        return this.optionsCancelNewContextData;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOrderConfirmationTitle() {
        return this.orderConfirmationTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOrderStatePrompt() {
        return this.orderStatePrompt;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionOrderConfirmationRowState getFillPriceRowState() {
        return this.fillPriceRowState;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionOrderConfirmationRowState getLimitPriceRowState() {
        return this.limitPriceRowState;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionOrderConfirmationRowState getStopPriceRowState() {
        return this.stopPriceRowState;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTotalCreditOrCostLabelText() {
        return this.totalCreditOrCostLabelText;
    }

    public final OptionOrderConfirmationViewState copy(boolean isReplaceOrderBtnVisible, UUID optionChainId, OptionsCancelNewContextData optionsCancelNewContextData, String orderConfirmationTitle, String orderStatePrompt, OptionOrderConfirmationRowState fillPriceRowState, OptionOrderConfirmationRowState limitPriceRowState, OptionOrderConfirmationRowState stopPriceRowState, String totalCreditOrCostLabelText, String totalCreditOrCostValueText, FeeFooterState feeFooterState, StringResource accountNameTitle, StringResource accountNameSubtitle, boolean isEligibleToShowL3EntryPoint, MarginAccountUpsellFragmentKey marginAccountUpsell) {
        Intrinsics.checkNotNullParameter(optionsCancelNewContextData, "optionsCancelNewContextData");
        Intrinsics.checkNotNullParameter(orderConfirmationTitle, "orderConfirmationTitle");
        Intrinsics.checkNotNullParameter(totalCreditOrCostLabelText, "totalCreditOrCostLabelText");
        Intrinsics.checkNotNullParameter(totalCreditOrCostValueText, "totalCreditOrCostValueText");
        Intrinsics.checkNotNullParameter(feeFooterState, "feeFooterState");
        return new OptionOrderConfirmationViewState(isReplaceOrderBtnVisible, optionChainId, optionsCancelNewContextData, orderConfirmationTitle, orderStatePrompt, fillPriceRowState, limitPriceRowState, stopPriceRowState, totalCreditOrCostLabelText, totalCreditOrCostValueText, feeFooterState, accountNameTitle, accountNameSubtitle, isEligibleToShowL3EntryPoint, marginAccountUpsell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderConfirmationViewState)) {
            return false;
        }
        OptionOrderConfirmationViewState optionOrderConfirmationViewState = (OptionOrderConfirmationViewState) other;
        return this.isReplaceOrderBtnVisible == optionOrderConfirmationViewState.isReplaceOrderBtnVisible && Intrinsics.areEqual(this.optionChainId, optionOrderConfirmationViewState.optionChainId) && Intrinsics.areEqual(this.optionsCancelNewContextData, optionOrderConfirmationViewState.optionsCancelNewContextData) && Intrinsics.areEqual(this.orderConfirmationTitle, optionOrderConfirmationViewState.orderConfirmationTitle) && Intrinsics.areEqual(this.orderStatePrompt, optionOrderConfirmationViewState.orderStatePrompt) && Intrinsics.areEqual(this.fillPriceRowState, optionOrderConfirmationViewState.fillPriceRowState) && Intrinsics.areEqual(this.limitPriceRowState, optionOrderConfirmationViewState.limitPriceRowState) && Intrinsics.areEqual(this.stopPriceRowState, optionOrderConfirmationViewState.stopPriceRowState) && Intrinsics.areEqual(this.totalCreditOrCostLabelText, optionOrderConfirmationViewState.totalCreditOrCostLabelText) && Intrinsics.areEqual(this.totalCreditOrCostValueText, optionOrderConfirmationViewState.totalCreditOrCostValueText) && Intrinsics.areEqual(this.feeFooterState, optionOrderConfirmationViewState.feeFooterState) && Intrinsics.areEqual(this.accountNameTitle, optionOrderConfirmationViewState.accountNameTitle) && Intrinsics.areEqual(this.accountNameSubtitle, optionOrderConfirmationViewState.accountNameSubtitle) && this.isEligibleToShowL3EntryPoint == optionOrderConfirmationViewState.isEligibleToShowL3EntryPoint && Intrinsics.areEqual(this.marginAccountUpsell, optionOrderConfirmationViewState.marginAccountUpsell);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isReplaceOrderBtnVisible) * 31;
        UUID uuid = this.optionChainId;
        int iHashCode2 = (((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.optionsCancelNewContextData.hashCode()) * 31) + this.orderConfirmationTitle.hashCode()) * 31;
        String str = this.orderStatePrompt;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        OptionOrderConfirmationRowState optionOrderConfirmationRowState = this.fillPriceRowState;
        int iHashCode4 = (iHashCode3 + (optionOrderConfirmationRowState == null ? 0 : optionOrderConfirmationRowState.hashCode())) * 31;
        OptionOrderConfirmationRowState optionOrderConfirmationRowState2 = this.limitPriceRowState;
        int iHashCode5 = (iHashCode4 + (optionOrderConfirmationRowState2 == null ? 0 : optionOrderConfirmationRowState2.hashCode())) * 31;
        OptionOrderConfirmationRowState optionOrderConfirmationRowState3 = this.stopPriceRowState;
        int iHashCode6 = (((((((iHashCode5 + (optionOrderConfirmationRowState3 == null ? 0 : optionOrderConfirmationRowState3.hashCode())) * 31) + this.totalCreditOrCostLabelText.hashCode()) * 31) + this.totalCreditOrCostValueText.hashCode()) * 31) + this.feeFooterState.hashCode()) * 31;
        StringResource stringResource = this.accountNameTitle;
        int iHashCode7 = (iHashCode6 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.accountNameSubtitle;
        int iHashCode8 = (((iHashCode7 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31) + Boolean.hashCode(this.isEligibleToShowL3EntryPoint)) * 31;
        MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey = this.marginAccountUpsell;
        return iHashCode8 + (marginAccountUpsellFragmentKey != null ? marginAccountUpsellFragmentKey.hashCode() : 0);
    }

    public String toString() {
        return "OptionOrderConfirmationViewState(isReplaceOrderBtnVisible=" + this.isReplaceOrderBtnVisible + ", optionChainId=" + this.optionChainId + ", optionsCancelNewContextData=" + this.optionsCancelNewContextData + ", orderConfirmationTitle=" + this.orderConfirmationTitle + ", orderStatePrompt=" + this.orderStatePrompt + ", fillPriceRowState=" + this.fillPriceRowState + ", limitPriceRowState=" + this.limitPriceRowState + ", stopPriceRowState=" + this.stopPriceRowState + ", totalCreditOrCostLabelText=" + this.totalCreditOrCostLabelText + ", totalCreditOrCostValueText=" + this.totalCreditOrCostValueText + ", feeFooterState=" + this.feeFooterState + ", accountNameTitle=" + this.accountNameTitle + ", accountNameSubtitle=" + this.accountNameSubtitle + ", isEligibleToShowL3EntryPoint=" + this.isEligibleToShowL3EntryPoint + ", marginAccountUpsell=" + this.marginAccountUpsell + ")";
    }

    public OptionOrderConfirmationViewState(boolean z, UUID uuid, OptionsCancelNewContextData optionsCancelNewContextData, String orderConfirmationTitle, String str, OptionOrderConfirmationRowState optionOrderConfirmationRowState, OptionOrderConfirmationRowState optionOrderConfirmationRowState2, OptionOrderConfirmationRowState optionOrderConfirmationRowState3, String totalCreditOrCostLabelText, String totalCreditOrCostValueText, FeeFooterState feeFooterState, StringResource stringResource, StringResource stringResource2, boolean z2, MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey) {
        Intrinsics.checkNotNullParameter(optionsCancelNewContextData, "optionsCancelNewContextData");
        Intrinsics.checkNotNullParameter(orderConfirmationTitle, "orderConfirmationTitle");
        Intrinsics.checkNotNullParameter(totalCreditOrCostLabelText, "totalCreditOrCostLabelText");
        Intrinsics.checkNotNullParameter(totalCreditOrCostValueText, "totalCreditOrCostValueText");
        Intrinsics.checkNotNullParameter(feeFooterState, "feeFooterState");
        this.isReplaceOrderBtnVisible = z;
        this.optionChainId = uuid;
        this.optionsCancelNewContextData = optionsCancelNewContextData;
        this.orderConfirmationTitle = orderConfirmationTitle;
        this.orderStatePrompt = str;
        this.fillPriceRowState = optionOrderConfirmationRowState;
        this.limitPriceRowState = optionOrderConfirmationRowState2;
        this.stopPriceRowState = optionOrderConfirmationRowState3;
        this.totalCreditOrCostLabelText = totalCreditOrCostLabelText;
        this.totalCreditOrCostValueText = totalCreditOrCostValueText;
        this.feeFooterState = feeFooterState;
        this.accountNameTitle = stringResource;
        this.accountNameSubtitle = stringResource2;
        this.isEligibleToShowL3EntryPoint = z2;
        this.marginAccountUpsell = marginAccountUpsellFragmentKey;
    }

    public final boolean isReplaceOrderBtnVisible() {
        return this.isReplaceOrderBtnVisible;
    }

    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    public final OptionsCancelNewContextData getOptionsCancelNewContextData() {
        return this.optionsCancelNewContextData;
    }

    public final String getOrderConfirmationTitle() {
        return this.orderConfirmationTitle;
    }

    public final String getOrderStatePrompt() {
        return this.orderStatePrompt;
    }

    public final OptionOrderConfirmationRowState getFillPriceRowState() {
        return this.fillPriceRowState;
    }

    public final OptionOrderConfirmationRowState getLimitPriceRowState() {
        return this.limitPriceRowState;
    }

    public final OptionOrderConfirmationRowState getStopPriceRowState() {
        return this.stopPriceRowState;
    }

    public final String getTotalCreditOrCostLabelText() {
        return this.totalCreditOrCostLabelText;
    }

    public final String getTotalCreditOrCostValueText() {
        return this.totalCreditOrCostValueText;
    }

    public final FeeFooterState getFeeFooterState() {
        return this.feeFooterState;
    }

    public final StringResource getAccountNameTitle() {
        return this.accountNameTitle;
    }

    public final StringResource getAccountNameSubtitle() {
        return this.accountNameSubtitle;
    }

    public final boolean isEligibleToShowL3EntryPoint() {
        return this.isEligibleToShowL3EntryPoint;
    }

    public final MarginAccountUpsellFragmentKey getMarginAccountUpsell() {
        return this.marginAccountUpsell;
    }
}
