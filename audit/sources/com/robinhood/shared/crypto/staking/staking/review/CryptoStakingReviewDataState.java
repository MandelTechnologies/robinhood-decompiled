package com.robinhood.shared.crypto.staking.staking.review;

import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.CurrencyDefinition;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.shared.crypto.staking.staking.C37760R;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoStakingReviewDataState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000e\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u000207J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b?JW\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\u001d\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0011\u0010'\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u000fR\u0014\u00101\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006F"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDataState;", "", "cryptoAmountString", "", "fiatAmountString", "isLoading", "", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "submitButtonLoading", "currencySymbol", "currencyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;ZLjava/lang/String;Ljava/lang/String;)V", "getCryptoAmountString", "()Ljava/lang/String;", "getFiatAmountString", "()Z", "getOrder", "()Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "getSubmitButtonLoading", "getCurrencySymbol", "getCurrencyName$feature_crypto_staking_externalDebug", "cryptoStakingContext", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "getCryptoStakingContext$feature_crypto_staking_externalDebug", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "showCurrencySymbolForTickerInput", "getShowCurrencySymbolForTickerInput", "submitButtonEnabled", "getSubmitButtonEnabled", "orderTypeTitle", "Lcom/robinhood/utils/resource/StringResource;", "getOrderTypeTitle", "()Lcom/robinhood/utils/resource/StringResource;", "orderTypeButtonTitle", "getOrderTypeButtonTitle", "amountText", "getAmountText", "amountSubtitleText", "getAmountSubtitleText", "infoRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getInfoRows", "()Lkotlinx/collections/immutable/ImmutableList;", "disclaimer", "getDisclaimer", "orderType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "getOrderType", "()Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "mutateWith", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7$feature_crypto_staking_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoStakingReviewDataState {
    public static final int $stable = 8;
    private final String cryptoAmountString;
    private final String currencyName;
    private final String currencySymbol;
    private final String fiatAmountString;
    private final boolean isLoading;
    private final UiCryptoStakingOrderModel order;
    private final boolean submitButtonLoading;

    /* compiled from: CryptoStakingReviewDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiCryptoStakingOrder.OrderType.values().length];
            try {
                iArr[ApiCryptoStakingOrder.OrderType.WITHDRAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoStakingOrder.OrderType.DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCryptoStakingOrder.OrderType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiCryptoStakingOrder.AmountType.values().length];
            try {
                iArr2[ApiCryptoStakingOrder.AmountType.CRYPTOCURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiCryptoStakingOrder.AmountType.FIAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiCryptoStakingOrder.AmountType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ CryptoStakingReviewDataState copy$default(CryptoStakingReviewDataState cryptoStakingReviewDataState, String str, String str2, boolean z, UiCryptoStakingOrderModel uiCryptoStakingOrderModel, boolean z2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoStakingReviewDataState.cryptoAmountString;
        }
        if ((i & 2) != 0) {
            str2 = cryptoStakingReviewDataState.fiatAmountString;
        }
        if ((i & 4) != 0) {
            z = cryptoStakingReviewDataState.isLoading;
        }
        if ((i & 8) != 0) {
            uiCryptoStakingOrderModel = cryptoStakingReviewDataState.order;
        }
        if ((i & 16) != 0) {
            z2 = cryptoStakingReviewDataState.submitButtonLoading;
        }
        if ((i & 32) != 0) {
            str3 = cryptoStakingReviewDataState.currencySymbol;
        }
        if ((i & 64) != 0) {
            str4 = cryptoStakingReviewDataState.currencyName;
        }
        String str5 = str3;
        String str6 = str4;
        boolean z3 = z2;
        boolean z4 = z;
        return cryptoStakingReviewDataState.copy(str, str2, z4, uiCryptoStakingOrderModel, z3, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCryptoAmountString() {
        return this.cryptoAmountString;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFiatAmountString() {
        return this.fiatAmountString;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final UiCryptoStakingOrderModel getOrder() {
        return this.order;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSubmitButtonLoading() {
        return this.submitButtonLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: component7$feature_crypto_staking_externalDebug, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    public final CryptoStakingReviewDataState copy(String cryptoAmountString, String fiatAmountString, boolean isLoading, UiCryptoStakingOrderModel order, boolean submitButtonLoading, String currencySymbol, String currencyName) {
        Intrinsics.checkNotNullParameter(order, "order");
        return new CryptoStakingReviewDataState(cryptoAmountString, fiatAmountString, isLoading, order, submitButtonLoading, currencySymbol, currencyName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoStakingReviewDataState)) {
            return false;
        }
        CryptoStakingReviewDataState cryptoStakingReviewDataState = (CryptoStakingReviewDataState) other;
        return Intrinsics.areEqual(this.cryptoAmountString, cryptoStakingReviewDataState.cryptoAmountString) && Intrinsics.areEqual(this.fiatAmountString, cryptoStakingReviewDataState.fiatAmountString) && this.isLoading == cryptoStakingReviewDataState.isLoading && Intrinsics.areEqual(this.order, cryptoStakingReviewDataState.order) && this.submitButtonLoading == cryptoStakingReviewDataState.submitButtonLoading && Intrinsics.areEqual(this.currencySymbol, cryptoStakingReviewDataState.currencySymbol) && Intrinsics.areEqual(this.currencyName, cryptoStakingReviewDataState.currencyName);
    }

    public int hashCode() {
        String str = this.cryptoAmountString;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fiatAmountString;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.order.hashCode()) * 31) + Boolean.hashCode(this.submitButtonLoading)) * 31;
        String str3 = this.currencySymbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyName;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "CryptoStakingReviewDataState(cryptoAmountString=" + this.cryptoAmountString + ", fiatAmountString=" + this.fiatAmountString + ", isLoading=" + this.isLoading + ", order=" + this.order + ", submitButtonLoading=" + this.submitButtonLoading + ", currencySymbol=" + this.currencySymbol + ", currencyName=" + this.currencyName + ")";
    }

    public CryptoStakingReviewDataState(String str, String str2, boolean z, UiCryptoStakingOrderModel order, boolean z2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.cryptoAmountString = str;
        this.fiatAmountString = str2;
        this.isLoading = z;
        this.order = order;
        this.submitButtonLoading = z2;
        this.currencySymbol = str3;
        this.currencyName = str4;
    }

    public /* synthetic */ CryptoStakingReviewDataState(String str, String str2, boolean z, UiCryptoStakingOrderModel uiCryptoStakingOrderModel, boolean z2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z, uiCryptoStakingOrderModel, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    public final String getCryptoAmountString() {
        return this.cryptoAmountString;
    }

    public final String getFiatAmountString() {
        return this.fiatAmountString;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiCryptoStakingOrderModel getOrder() {
        return this.order;
    }

    public final boolean getSubmitButtonLoading() {
        return this.submitButtonLoading;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getCurrencyName$feature_crypto_staking_externalDebug() {
        return this.currencyName;
    }

    public final CryptoStakingContext getCryptoStakingContext$feature_crypto_staking_externalDebug() {
        String str = this.currencySymbol;
        if (str == null) {
            return null;
        }
        return new CryptoStakingContext(str, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 510, null);
    }

    public final boolean getShowCurrencySymbolForTickerInput() {
        return this.order.getAmountType() == ApiCryptoStakingOrder.AmountType.CRYPTOCURRENCY;
    }

    public final boolean getSubmitButtonEnabled() {
        return !this.isLoading;
    }

    public final StringResource getOrderTypeTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[getOrderType().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C37760R.string.staking_review_title_unstake, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C37760R.string.staking_review_title_stake, new Object[0]);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final StringResource getOrderTypeButtonTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[getOrderType().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C37760R.string.staking_review_order_type_withdrawal, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C37760R.string.staking_review_order_type_deposit, new Object[0]);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final StringResource getAmountText() {
        if (this.cryptoAmountString != null && this.fiatAmountString != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[this.order.getAmountType().ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(this.cryptoAmountString);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C37760R.string.staking_stake_amount_fiat, this.fiatAmountString);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke("");
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final StringResource getAmountSubtitleText() {
        if (this.fiatAmountString != null && this.cryptoAmountString != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[this.order.getAmountType().ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(this.fiatAmountString);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(this.cryptoAmountString);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke("");
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final ImmutableList<UIComponent<GenericAction>> getInfoRows() {
        return extensions2.toImmutableList(this.order.getInfoRows());
    }

    public final String getDisclaimer() {
        return this.order.getDisclaimer();
    }

    private final ApiCryptoStakingOrder.OrderType getOrderType() {
        return this.order.getOrderType();
    }

    public final CryptoStakingReviewDataState mutateWith(UiCurrencyPair uiCurrencyPair) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Currency assetCurrency = uiCurrencyPair.getAssetCurrency();
        BigDecimal amount = this.order.getAmount();
        boolean z = !getShowCurrencySymbolForTickerInput();
        RoundingMode roundingMode = RoundingMode.DOWN;
        return copy$default(this, CurrencyDefinitions.formatCurrency$default(assetCurrency, amount, z, false, roundingMode, 0, null, null, false, false, false, false, 2016, null), CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getQuoteCurrency(), this.order.getFiatAmount(), false, false, roundingMode, 0, null, null, false, false, false, false, 2018, null), false, null, false, CurrencyDefinition.getCurrencySymbol$default(uiCurrencyPair.getAssetCurrency(), null, 1, null), uiCurrencyPair.getAssetCurrency().getName(), 24, null);
    }
}
