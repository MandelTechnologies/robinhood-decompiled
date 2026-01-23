package com.robinhood.shared.crypto.staking.staking.review;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoStakingReviewViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u0015\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fHÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J§\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0010HÆ\u0001J\u0013\u0010<\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010%R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u0016\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%¨\u0006A"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewViewState;", "", "amountSubtitleText", "Lcom/robinhood/utils/resource/StringResource;", "amountText", "cryptoStakingContext", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "currencyName", "", "currencySymbol", "disclaimer", "infoRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isLoading", "", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "orderTypeButtonTitle", "orderTypeTitle", "showCurrencySymbolForTickerInput", "submitButtonEnabled", "submitButtonLoading", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZZZ)V", "getAmountSubtitleText", "()Lcom/robinhood/utils/resource/StringResource;", "getAmountText", "getCryptoStakingContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "getCurrencyName", "()Ljava/lang/String;", "getCurrencySymbol", "getDisclaimer", "getInfoRows", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getOrder", "()Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "getOrderTypeButtonTitle", "getOrderTypeTitle", "getShowCurrencySymbolForTickerInput", "getSubmitButtonEnabled", "getSubmitButtonLoading", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoStakingReviewViewState {
    public static final int $stable = 8;
    private final StringResource amountSubtitleText;
    private final StringResource amountText;
    private final CryptoStakingContext cryptoStakingContext;
    private final String currencyName;
    private final String currencySymbol;
    private final String disclaimer;
    private final ImmutableList<UIComponent<GenericAction>> infoRows;
    private final boolean isLoading;
    private final UiCryptoStakingOrderModel order;
    private final StringResource orderTypeButtonTitle;
    private final StringResource orderTypeTitle;
    private final boolean showCurrencySymbolForTickerInput;
    private final boolean submitButtonEnabled;
    private final boolean submitButtonLoading;

    /* renamed from: component1, reason: from getter */
    public final StringResource getAmountSubtitleText() {
        return this.amountSubtitleText;
    }

    /* renamed from: component10, reason: from getter */
    public final StringResource getOrderTypeButtonTitle() {
        return this.orderTypeButtonTitle;
    }

    /* renamed from: component11, reason: from getter */
    public final StringResource getOrderTypeTitle() {
        return this.orderTypeTitle;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowCurrencySymbolForTickerInput() {
        return this.showCurrencySymbolForTickerInput;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getSubmitButtonEnabled() {
        return this.submitButtonEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getSubmitButtonLoading() {
        return this.submitButtonLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getAmountText() {
        return this.amountText;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoStakingContext getCryptoStakingContext() {
        return this.cryptoStakingContext;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final ImmutableList<UIComponent<GenericAction>> component7() {
        return this.infoRows;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component9, reason: from getter */
    public final UiCryptoStakingOrderModel getOrder() {
        return this.order;
    }

    public final CryptoStakingReviewViewState copy(StringResource amountSubtitleText, StringResource amountText, CryptoStakingContext cryptoStakingContext, String currencyName, String currencySymbol, String disclaimer, ImmutableList<? extends UIComponent<? extends GenericAction>> infoRows, boolean isLoading, UiCryptoStakingOrderModel order, StringResource orderTypeButtonTitle, StringResource orderTypeTitle, boolean showCurrencySymbolForTickerInput, boolean submitButtonEnabled, boolean submitButtonLoading) {
        Intrinsics.checkNotNullParameter(amountSubtitleText, "amountSubtitleText");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(infoRows, "infoRows");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(orderTypeButtonTitle, "orderTypeButtonTitle");
        Intrinsics.checkNotNullParameter(orderTypeTitle, "orderTypeTitle");
        return new CryptoStakingReviewViewState(amountSubtitleText, amountText, cryptoStakingContext, currencyName, currencySymbol, disclaimer, infoRows, isLoading, order, orderTypeButtonTitle, orderTypeTitle, showCurrencySymbolForTickerInput, submitButtonEnabled, submitButtonLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoStakingReviewViewState)) {
            return false;
        }
        CryptoStakingReviewViewState cryptoStakingReviewViewState = (CryptoStakingReviewViewState) other;
        return Intrinsics.areEqual(this.amountSubtitleText, cryptoStakingReviewViewState.amountSubtitleText) && Intrinsics.areEqual(this.amountText, cryptoStakingReviewViewState.amountText) && Intrinsics.areEqual(this.cryptoStakingContext, cryptoStakingReviewViewState.cryptoStakingContext) && Intrinsics.areEqual(this.currencyName, cryptoStakingReviewViewState.currencyName) && Intrinsics.areEqual(this.currencySymbol, cryptoStakingReviewViewState.currencySymbol) && Intrinsics.areEqual(this.disclaimer, cryptoStakingReviewViewState.disclaimer) && Intrinsics.areEqual(this.infoRows, cryptoStakingReviewViewState.infoRows) && this.isLoading == cryptoStakingReviewViewState.isLoading && Intrinsics.areEqual(this.order, cryptoStakingReviewViewState.order) && Intrinsics.areEqual(this.orderTypeButtonTitle, cryptoStakingReviewViewState.orderTypeButtonTitle) && Intrinsics.areEqual(this.orderTypeTitle, cryptoStakingReviewViewState.orderTypeTitle) && this.showCurrencySymbolForTickerInput == cryptoStakingReviewViewState.showCurrencySymbolForTickerInput && this.submitButtonEnabled == cryptoStakingReviewViewState.submitButtonEnabled && this.submitButtonLoading == cryptoStakingReviewViewState.submitButtonLoading;
    }

    public int hashCode() {
        int iHashCode = ((this.amountSubtitleText.hashCode() * 31) + this.amountText.hashCode()) * 31;
        CryptoStakingContext cryptoStakingContext = this.cryptoStakingContext;
        int iHashCode2 = (iHashCode + (cryptoStakingContext == null ? 0 : cryptoStakingContext.hashCode())) * 31;
        String str = this.currencyName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencySymbol;
        return ((((((((((((((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.disclaimer.hashCode()) * 31) + this.infoRows.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.order.hashCode()) * 31) + this.orderTypeButtonTitle.hashCode()) * 31) + this.orderTypeTitle.hashCode()) * 31) + Boolean.hashCode(this.showCurrencySymbolForTickerInput)) * 31) + Boolean.hashCode(this.submitButtonEnabled)) * 31) + Boolean.hashCode(this.submitButtonLoading);
    }

    public String toString() {
        return "CryptoStakingReviewViewState(amountSubtitleText=" + this.amountSubtitleText + ", amountText=" + this.amountText + ", cryptoStakingContext=" + this.cryptoStakingContext + ", currencyName=" + this.currencyName + ", currencySymbol=" + this.currencySymbol + ", disclaimer=" + this.disclaimer + ", infoRows=" + this.infoRows + ", isLoading=" + this.isLoading + ", order=" + this.order + ", orderTypeButtonTitle=" + this.orderTypeButtonTitle + ", orderTypeTitle=" + this.orderTypeTitle + ", showCurrencySymbolForTickerInput=" + this.showCurrencySymbolForTickerInput + ", submitButtonEnabled=" + this.submitButtonEnabled + ", submitButtonLoading=" + this.submitButtonLoading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoStakingReviewViewState(StringResource amountSubtitleText, StringResource amountText, CryptoStakingContext cryptoStakingContext, String str, String str2, String disclaimer, ImmutableList<? extends UIComponent<? extends GenericAction>> infoRows, boolean z, UiCryptoStakingOrderModel order, StringResource orderTypeButtonTitle, StringResource orderTypeTitle, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(amountSubtitleText, "amountSubtitleText");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(infoRows, "infoRows");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(orderTypeButtonTitle, "orderTypeButtonTitle");
        Intrinsics.checkNotNullParameter(orderTypeTitle, "orderTypeTitle");
        this.amountSubtitleText = amountSubtitleText;
        this.amountText = amountText;
        this.cryptoStakingContext = cryptoStakingContext;
        this.currencyName = str;
        this.currencySymbol = str2;
        this.disclaimer = disclaimer;
        this.infoRows = infoRows;
        this.isLoading = z;
        this.order = order;
        this.orderTypeButtonTitle = orderTypeButtonTitle;
        this.orderTypeTitle = orderTypeTitle;
        this.showCurrencySymbolForTickerInput = z2;
        this.submitButtonEnabled = z3;
        this.submitButtonLoading = z4;
    }

    public /* synthetic */ CryptoStakingReviewViewState(StringResource stringResource, StringResource stringResource2, CryptoStakingContext cryptoStakingContext, String str, String str2, String str3, ImmutableList immutableList, boolean z, UiCryptoStakingOrderModel uiCryptoStakingOrderModel, StringResource stringResource3, StringResource stringResource4, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2, cryptoStakingContext, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, str3, immutableList, (i & 128) != 0 ? true : z, uiCryptoStakingOrderModel, stringResource3, stringResource4, z2, z3, (i & 8192) != 0 ? false : z4);
    }

    public final StringResource getAmountSubtitleText() {
        return this.amountSubtitleText;
    }

    public final StringResource getAmountText() {
        return this.amountText;
    }

    public final CryptoStakingContext getCryptoStakingContext() {
        return this.cryptoStakingContext;
    }

    public final String getCurrencyName() {
        return this.currencyName;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final ImmutableList<UIComponent<GenericAction>> getInfoRows() {
        return this.infoRows;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiCryptoStakingOrderModel getOrder() {
        return this.order;
    }

    public final StringResource getOrderTypeButtonTitle() {
        return this.orderTypeButtonTitle;
    }

    public final StringResource getOrderTypeTitle() {
        return this.orderTypeTitle;
    }

    public final boolean getShowCurrencySymbolForTickerInput() {
        return this.showCurrencySymbolForTickerInput;
    }

    public final boolean getSubmitButtonEnabled() {
        return this.submitButtonEnabled;
    }

    public final boolean getSubmitButtonLoading() {
        return this.submitButtonLoading;
    }
}
