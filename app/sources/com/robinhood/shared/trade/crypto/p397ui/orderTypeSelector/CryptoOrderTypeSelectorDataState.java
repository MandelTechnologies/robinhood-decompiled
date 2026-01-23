package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountPreferences;
import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.util.Money;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderTypeSelectorOrderRowState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.fee.CryptoFeeOrderSizeCalculator;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorViewState2;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import nummus.p512v1.TaxlotabilityResponseDto;
import nummus.p512v1.TaxlotabilityStateDto;

/* compiled from: CryptoOrderTypeSelectorDataState.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020,002\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020,002\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J*\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020\u0015H\u0002J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u000eHÀ\u0003¢\u0006\u0002\bFJ\u000e\u0010G\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bHJ\u0010\u0010I\u001a\u0004\u0018\u00010\u0011HÀ\u0003¢\u0006\u0002\bJJ\u0010\u0010K\u001a\u0004\u0018\u00010\u0013HÀ\u0003¢\u0006\u0002\bLJ\u000e\u0010M\u001a\u00020\u0015HÀ\u0003¢\u0006\u0002\bNJ\u0083\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010P\u001a\u00020\u00032\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020\u0015HÖ\u0001J\t\u0010S\u001a\u00020THÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u00020\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0014\u001a\u00020\u00158AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b3\u00104\u001a\u0004\b5\u0010\u0018R\u001a\u00106\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u00104\u001a\u0004\b8\u0010\u0018R\u0014\u00109\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0018¨\u0006U"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDataState;", "", "isRhcApp", "", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "recurringTradability", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "isRecurringInvestmentFeatureEnabled", "accountPreferences", "Lcom/robinhood/models/crypto/db/CryptoAccountPreferences;", "isUsRecurringVTExperimentEnabled", "taxlotability", "Lnummus/v1/TaxlotabilityResponseDto;", "cryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "cryptoUsTaxLotsOrderTypeDisplayCount", "", "<init>", "(ZLcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;ZLcom/robinhood/models/crypto/db/CryptoAccountPreferences;ZLnummus/v1/TaxlotabilityResponseDto;Lcom/robinhood/models/crypto/db/CryptoAccount;I)V", "()Z", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoQuote", "()Lcom/robinhood/models/crypto/db/CryptoQuote;", "getRecurringTradability", "()Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "getAccountPreferences$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/db/CryptoAccountPreferences;", "isUsRecurringVTExperimentEnabled$feature_trade_crypto_externalDebug", "getTaxlotability$feature_trade_crypto_externalDebug", "()Lnummus/v1/TaxlotabilityResponseDto;", "getCryptoAccount$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/db/CryptoAccount;", "getCryptoUsTaxLotsOrderTypeDisplayCount$feature_trade_crypto_externalDebug", "()I", "rowViewStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState;", "getRowViewStates", "()Lkotlinx/collections/immutable/ImmutableList;", "rebateMarketOrderRows", "", "feeMarketOrderRows", "areLimitAndStopOrdersVisible", "getAreLimitAndStopOrdersVisible$feature_trade_crypto_externalDebug$annotations", "()V", "getAreLimitAndStopOrdersVisible$feature_trade_crypto_externalDebug", "isRecurringVisible", "isRecurringVisible$feature_trade_crypto_externalDebug$annotations", "isRecurringVisible$feature_trade_crypto_externalDebug", "isConditionalOrderHeaderVisible", "minBidFiatAmount", "Ljava/math/BigDecimal;", "quote", "minOrderQuoteAmount", "assetScale", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7$feature_trade_crypto_externalDebug", "component8", "component8$feature_trade_crypto_externalDebug", "component9", "component9$feature_trade_crypto_externalDebug", "component10", "component10$feature_trade_crypto_externalDebug", "component11", "component11$feature_trade_crypto_externalDebug", "copy", "equals", "other", "hashCode", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderTypeSelectorDataState {
    public static final int $stable = 8;
    private final CryptoAccountPreferences accountPreferences;
    private final CryptoAccount cryptoAccount;
    private final CryptoQuote cryptoQuote;
    private final int cryptoUsTaxLotsOrderTypeDisplayCount;
    private final UiCurrencyPair currencyPair;
    private final boolean isRecurringInvestmentFeatureEnabled;
    private final boolean isRhcApp;
    private final boolean isUsRecurringVTExperimentEnabled;
    private final OrderSide orderSide;
    private final InstrumentRecurringTradability recurringTradability;
    private final TaxlotabilityResponseDto taxlotability;

    /* compiled from: CryptoOrderTypeSelectorDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ CryptoOrderTypeSelectorDataState copy$default(CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState, boolean z, OrderSide orderSide, UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, InstrumentRecurringTradability instrumentRecurringTradability, boolean z2, CryptoAccountPreferences cryptoAccountPreferences, boolean z3, TaxlotabilityResponseDto taxlotabilityResponseDto, CryptoAccount cryptoAccount, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = cryptoOrderTypeSelectorDataState.isRhcApp;
        }
        if ((i2 & 2) != 0) {
            orderSide = cryptoOrderTypeSelectorDataState.orderSide;
        }
        if ((i2 & 4) != 0) {
            uiCurrencyPair = cryptoOrderTypeSelectorDataState.currencyPair;
        }
        if ((i2 & 8) != 0) {
            cryptoQuote = cryptoOrderTypeSelectorDataState.cryptoQuote;
        }
        if ((i2 & 16) != 0) {
            instrumentRecurringTradability = cryptoOrderTypeSelectorDataState.recurringTradability;
        }
        if ((i2 & 32) != 0) {
            z2 = cryptoOrderTypeSelectorDataState.isRecurringInvestmentFeatureEnabled;
        }
        if ((i2 & 64) != 0) {
            cryptoAccountPreferences = cryptoOrderTypeSelectorDataState.accountPreferences;
        }
        if ((i2 & 128) != 0) {
            z3 = cryptoOrderTypeSelectorDataState.isUsRecurringVTExperimentEnabled;
        }
        if ((i2 & 256) != 0) {
            taxlotabilityResponseDto = cryptoOrderTypeSelectorDataState.taxlotability;
        }
        if ((i2 & 512) != 0) {
            cryptoAccount = cryptoOrderTypeSelectorDataState.cryptoAccount;
        }
        if ((i2 & 1024) != 0) {
            i = cryptoOrderTypeSelectorDataState.cryptoUsTaxLotsOrderTypeDisplayCount;
        }
        CryptoAccount cryptoAccount2 = cryptoAccount;
        int i3 = i;
        boolean z4 = z3;
        TaxlotabilityResponseDto taxlotabilityResponseDto2 = taxlotabilityResponseDto;
        boolean z5 = z2;
        CryptoAccountPreferences cryptoAccountPreferences2 = cryptoAccountPreferences;
        InstrumentRecurringTradability instrumentRecurringTradability2 = instrumentRecurringTradability;
        UiCurrencyPair uiCurrencyPair2 = uiCurrencyPair;
        return cryptoOrderTypeSelectorDataState.copy(z, orderSide, uiCurrencyPair2, cryptoQuote, instrumentRecurringTradability2, z5, cryptoAccountPreferences2, z4, taxlotabilityResponseDto2, cryptoAccount2, i3);
    }

    /* renamed from: getAreLimitAndStopOrdersVisible$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2870xf1074301() {
    }

    /* renamed from: isRecurringVisible$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2871xc54197d3() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRhcApp() {
        return this.isRhcApp;
    }

    /* renamed from: component10$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoAccount getCryptoAccount() {
        return this.cryptoAccount;
    }

    /* renamed from: component11$feature_trade_crypto_externalDebug, reason: from getter */
    public final int getCryptoUsTaxLotsOrderTypeDisplayCount() {
        return this.cryptoUsTaxLotsOrderTypeDisplayCount;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    /* renamed from: component3, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component4, reason: from getter */
    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    /* renamed from: component5, reason: from getter */
    public final InstrumentRecurringTradability getRecurringTradability() {
        return this.recurringTradability;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsRecurringInvestmentFeatureEnabled() {
        return this.isRecurringInvestmentFeatureEnabled;
    }

    /* renamed from: component7$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoAccountPreferences getAccountPreferences() {
        return this.accountPreferences;
    }

    /* renamed from: component8$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getIsUsRecurringVTExperimentEnabled() {
        return this.isUsRecurringVTExperimentEnabled;
    }

    /* renamed from: component9$feature_trade_crypto_externalDebug, reason: from getter */
    public final TaxlotabilityResponseDto getTaxlotability() {
        return this.taxlotability;
    }

    public final CryptoOrderTypeSelectorDataState copy(boolean isRhcApp, OrderSide orderSide, UiCurrencyPair currencyPair, CryptoQuote cryptoQuote, InstrumentRecurringTradability recurringTradability, boolean isRecurringInvestmentFeatureEnabled, CryptoAccountPreferences accountPreferences, boolean isUsRecurringVTExperimentEnabled, TaxlotabilityResponseDto taxlotability, CryptoAccount cryptoAccount, int cryptoUsTaxLotsOrderTypeDisplayCount) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        return new CryptoOrderTypeSelectorDataState(isRhcApp, orderSide, currencyPair, cryptoQuote, recurringTradability, isRecurringInvestmentFeatureEnabled, accountPreferences, isUsRecurringVTExperimentEnabled, taxlotability, cryptoAccount, cryptoUsTaxLotsOrderTypeDisplayCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderTypeSelectorDataState)) {
            return false;
        }
        CryptoOrderTypeSelectorDataState cryptoOrderTypeSelectorDataState = (CryptoOrderTypeSelectorDataState) other;
        return this.isRhcApp == cryptoOrderTypeSelectorDataState.isRhcApp && this.orderSide == cryptoOrderTypeSelectorDataState.orderSide && Intrinsics.areEqual(this.currencyPair, cryptoOrderTypeSelectorDataState.currencyPair) && Intrinsics.areEqual(this.cryptoQuote, cryptoOrderTypeSelectorDataState.cryptoQuote) && Intrinsics.areEqual(this.recurringTradability, cryptoOrderTypeSelectorDataState.recurringTradability) && this.isRecurringInvestmentFeatureEnabled == cryptoOrderTypeSelectorDataState.isRecurringInvestmentFeatureEnabled && Intrinsics.areEqual(this.accountPreferences, cryptoOrderTypeSelectorDataState.accountPreferences) && this.isUsRecurringVTExperimentEnabled == cryptoOrderTypeSelectorDataState.isUsRecurringVTExperimentEnabled && Intrinsics.areEqual(this.taxlotability, cryptoOrderTypeSelectorDataState.taxlotability) && Intrinsics.areEqual(this.cryptoAccount, cryptoOrderTypeSelectorDataState.cryptoAccount) && this.cryptoUsTaxLotsOrderTypeDisplayCount == cryptoOrderTypeSelectorDataState.cryptoUsTaxLotsOrderTypeDisplayCount;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isRhcApp) * 31) + this.orderSide.hashCode()) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode2 = (iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        int iHashCode3 = (iHashCode2 + (cryptoQuote == null ? 0 : cryptoQuote.hashCode())) * 31;
        InstrumentRecurringTradability instrumentRecurringTradability = this.recurringTradability;
        int iHashCode4 = (((iHashCode3 + (instrumentRecurringTradability == null ? 0 : instrumentRecurringTradability.hashCode())) * 31) + Boolean.hashCode(this.isRecurringInvestmentFeatureEnabled)) * 31;
        CryptoAccountPreferences cryptoAccountPreferences = this.accountPreferences;
        int iHashCode5 = (((iHashCode4 + (cryptoAccountPreferences == null ? 0 : cryptoAccountPreferences.hashCode())) * 31) + Boolean.hashCode(this.isUsRecurringVTExperimentEnabled)) * 31;
        TaxlotabilityResponseDto taxlotabilityResponseDto = this.taxlotability;
        int iHashCode6 = (iHashCode5 + (taxlotabilityResponseDto == null ? 0 : taxlotabilityResponseDto.hashCode())) * 31;
        CryptoAccount cryptoAccount = this.cryptoAccount;
        return ((iHashCode6 + (cryptoAccount != null ? cryptoAccount.hashCode() : 0)) * 31) + Integer.hashCode(this.cryptoUsTaxLotsOrderTypeDisplayCount);
    }

    public String toString() {
        return "CryptoOrderTypeSelectorDataState(isRhcApp=" + this.isRhcApp + ", orderSide=" + this.orderSide + ", currencyPair=" + this.currencyPair + ", cryptoQuote=" + this.cryptoQuote + ", recurringTradability=" + this.recurringTradability + ", isRecurringInvestmentFeatureEnabled=" + this.isRecurringInvestmentFeatureEnabled + ", accountPreferences=" + this.accountPreferences + ", isUsRecurringVTExperimentEnabled=" + this.isUsRecurringVTExperimentEnabled + ", taxlotability=" + this.taxlotability + ", cryptoAccount=" + this.cryptoAccount + ", cryptoUsTaxLotsOrderTypeDisplayCount=" + this.cryptoUsTaxLotsOrderTypeDisplayCount + ")";
    }

    public CryptoOrderTypeSelectorDataState(boolean z, OrderSide orderSide, UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, InstrumentRecurringTradability instrumentRecurringTradability, boolean z2, CryptoAccountPreferences cryptoAccountPreferences, boolean z3, TaxlotabilityResponseDto taxlotabilityResponseDto, CryptoAccount cryptoAccount, int i) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        this.isRhcApp = z;
        this.orderSide = orderSide;
        this.currencyPair = uiCurrencyPair;
        this.cryptoQuote = cryptoQuote;
        this.recurringTradability = instrumentRecurringTradability;
        this.isRecurringInvestmentFeatureEnabled = z2;
        this.accountPreferences = cryptoAccountPreferences;
        this.isUsRecurringVTExperimentEnabled = z3;
        this.taxlotability = taxlotabilityResponseDto;
        this.cryptoAccount = cryptoAccount;
        this.cryptoUsTaxLotsOrderTypeDisplayCount = i;
    }

    public /* synthetic */ CryptoOrderTypeSelectorDataState(boolean z, OrderSide orderSide, UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, InstrumentRecurringTradability instrumentRecurringTradability, boolean z2, CryptoAccountPreferences cryptoAccountPreferences, boolean z3, TaxlotabilityResponseDto taxlotabilityResponseDto, CryptoAccount cryptoAccount, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, orderSide, (i2 & 4) != 0 ? null : uiCurrencyPair, (i2 & 8) != 0 ? null : cryptoQuote, (i2 & 16) != 0 ? null : instrumentRecurringTradability, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? null : cryptoAccountPreferences, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? null : taxlotabilityResponseDto, (i2 & 512) != 0 ? null : cryptoAccount, (i2 & 1024) != 0 ? 0 : i);
    }

    public final boolean isRhcApp() {
        return this.isRhcApp;
    }

    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    public final InstrumentRecurringTradability getRecurringTradability() {
        return this.recurringTradability;
    }

    public final boolean isRecurringInvestmentFeatureEnabled() {
        return this.isRecurringInvestmentFeatureEnabled;
    }

    public final CryptoAccountPreferences getAccountPreferences$feature_trade_crypto_externalDebug() {
        return this.accountPreferences;
    }

    /* renamed from: isUsRecurringVTExperimentEnabled$feature_trade_crypto_externalDebug */
    public final boolean m2874x225649c1() {
        return this.isUsRecurringVTExperimentEnabled;
    }

    public final TaxlotabilityResponseDto getTaxlotability$feature_trade_crypto_externalDebug() {
        return this.taxlotability;
    }

    public final CryptoAccount getCryptoAccount$feature_trade_crypto_externalDebug() {
        return this.cryptoAccount;
    }

    /* renamed from: getCryptoUsTaxLotsOrderTypeDisplayCount$feature_trade_crypto_externalDebug */
    public final int m2873x667d3e35() {
        return this.cryptoUsTaxLotsOrderTypeDisplayCount;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ImmutableList<CryptoOrderTypeSelectorViewState2> getRowViewStates() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        CryptoOrderTypeSelectorViewState2.TapAction showTaxLotDisabledAlert;
        CryptoAccountPreferences cryptoAccountPreferences;
        CryptoAccountPreferences cryptoAccountPreferences2;
        if (this.currencyPair == null) {
            return extensions2.persistentListOf();
        }
        if (!this.isRhcApp && this.orderSide == OrderSide.SELL && this.taxlotability == null) {
            return extensions2.persistentListOf();
        }
        ArrayList arrayList = new ArrayList();
        if (!this.isRhcApp && this.cryptoAccount != null && (cryptoAccountPreferences2 = this.accountPreferences) != null && !cryptoAccountPreferences2.isIneligibleForMonetization()) {
            arrayList.add(new CryptoOrderTypeSelectorViewState2.MonetizationModelPreference(this.currencyPair, this.accountPreferences.getMonetizationModel() == MonetizationModel.FEE));
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.isRhcApp) {
            i = C40095R.string.order_type_market_plural;
        } else {
            int i8 = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
            if (i8 == 1) {
                i = C40095R.string.crypto_order_type_buy_orders;
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C40095R.string.crypto_order_type_sell_orders;
            }
        }
        arrayList.add(new CryptoOrderTypeSelectorViewState2.Header(companion.invoke(i, new Object[0])));
        if (this.isRhcApp || (this.cryptoAccount != null && this.currencyPair.isFeeSupported() && (cryptoAccountPreferences = this.accountPreferences) != null && !cryptoAccountPreferences.isIneligibleForMonetization() && this.accountPreferences.getMonetizationModel() == MonetizationModel.FEE)) {
            arrayList.addAll(feeMarketOrderRows(this.currencyPair));
        } else {
            arrayList.addAll(rebateMarketOrderRows(this.currencyPair));
        }
        if (this.orderSide == OrderSide.SELL) {
            TaxlotabilityResponseDto taxlotabilityResponseDto = this.taxlotability;
            TaxlotabilityStateDto state = taxlotabilityResponseDto != null ? taxlotabilityResponseDto.getState() : null;
            TaxlotabilityStateDto taxlotabilityStateDto = TaxlotabilityStateDto.STATE_ENABLED;
            if (state == taxlotabilityStateDto) {
                CryptoOrderTypeSelectorOrderRowState cryptoOrderTypeSelectorRow = new CryptoOrderTypeSelectorOrderRowState(C40095R.drawable.crypto_order_types_tax_lots, companion.invoke(C40095R.string.order_type_sell_tax_lots_title, new Object[0]), companion.invoke(C40095R.string.order_type_sell_tax_lots_subtitle, this.currencyPair.getAssetCurrency().getCode()), this.cryptoUsTaxLotsOrderTypeDisplayCount < 10 && this.taxlotability.getState() == taxlotabilityStateDto, true, this.taxlotability.getState() == taxlotabilityStateDto, null, 64, null);
                if (this.taxlotability.getState() == TaxlotabilityStateDto.STATE_DISABLED) {
                    TaxlotabilityResponseDto.TaxlotabilityAlertDto disabled_alert = this.taxlotability.getDisabled_alert();
                    showTaxLotDisabledAlert = disabled_alert != null ? new CryptoOrderTypeSelectorViewState2.TapAction.ShowTaxLotDisabledAlert(disabled_alert.getTitle(), disabled_alert.getMessage(), disabled_alert.getDismiss_cta_text()) : null;
                } else {
                    showTaxLotDisabledAlert = CryptoOrderTypeSelectorViewState2.TapAction.TaxLotSelected.INSTANCE;
                }
                arrayList.add(new CryptoOrderTypeSelectorViewState2.OrderTypeRow(cryptoOrderTypeSelectorRow, showTaxLotDisabledAlert, null, "tax_lots", 4, null));
            } else {
                TaxlotabilityResponseDto taxlotabilityResponseDto2 = this.taxlotability;
                if ((taxlotabilityResponseDto2 != null ? taxlotabilityResponseDto2.getState() : null) == TaxlotabilityStateDto.STATE_DISABLED) {
                }
            }
        }
        if (isConditionalOrderHeaderVisible()) {
            arrayList.add(new CryptoOrderTypeSelectorViewState2.Header(companion.invoke(C40095R.string.order_type_conditional, new Object[0])));
        }
        if (isRecurringVisible$feature_trade_crypto_externalDebug()) {
            int i9 = C20690R.drawable.pict_clr_rds_order_types_recurring_investment;
            StringResource stringResourceInvoke = companion.invoke(C40095R.string.order_type_recurring, new Object[0]);
            StringResource stringResourceInvoke2 = companion.invoke(C40095R.string.order_type_recurring_description_buy, this.currencyPair.getAssetCurrency().getCode());
            InstrumentRecurringTradability instrumentRecurringTradability = this.recurringTradability;
            CryptoOrderTypeSelectorOrderRowState cryptoOrderTypeSelectorRow2 = new CryptoOrderTypeSelectorOrderRowState(i9, stringResourceInvoke, stringResourceInvoke2, false, false, !((instrumentRecurringTradability == null || instrumentRecurringTradability.isRecurringTradable()) ? false : true), null, 88, null);
            InstrumentRecurringTradability instrumentRecurringTradability2 = this.recurringTradability;
            arrayList.add(new CryptoOrderTypeSelectorViewState2.OrderTypeRow(cryptoOrderTypeSelectorRow2, (instrumentRecurringTradability2 == null || instrumentRecurringTradability2.isRecurringTradable()) ? new CryptoOrderTypeSelectorViewState2.TapAction.RecurringInvestmentSelected(this.recurringTradability) : null, null, "recurring", 4, null));
        }
        if (m2872xf41b8001()) {
            OrderSide orderSide = this.orderSide;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i10 = iArr[orderSide.ordinal()];
            if (i10 == 1) {
                i2 = C20690R.drawable.pict_clr_rds_order_types_buy_limit;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C20690R.drawable.pict_clr_rds_order_types_sell_limit;
            }
            int i11 = i2;
            StringResource stringResourceInvoke3 = companion.invoke(C40095R.string.order_type_limit, new Object[0]);
            int i12 = iArr[this.orderSide.ordinal()];
            if (i12 == 1) {
                i3 = C40095R.string.order_type_limit_description_buy;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = C40095R.string.order_type_limit_description_sell;
            }
            CryptoOrderTypeSelectorViewState2.OrderTypeRow orderTypeRow = new CryptoOrderTypeSelectorViewState2.OrderTypeRow(new CryptoOrderTypeSelectorOrderRowState(i11, stringResourceInvoke3, companion.invoke(i3, this.currencyPair.getAssetCurrency().getCode()), false, false, false, null, 120, null), new CryptoOrderTypeSelectorViewState2.TapAction.SelectOrderType(this.currencyPair, CryptoOrderType.LIMIT, null, 4, null), null, "limit", 4, null);
            int i13 = iArr[this.orderSide.ordinal()];
            if (i13 == 1) {
                i4 = C20690R.drawable.pict_clr_rds_order_types_buy_stop;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = C20690R.drawable.pict_clr_rds_order_types_sell_stop;
            }
            int i14 = i4;
            StringResource stringResourceInvoke4 = companion.invoke(C40095R.string.order_type_stop_title, new Object[0]);
            int i15 = iArr[this.orderSide.ordinal()];
            if (i15 == 1) {
                i5 = C40095R.string.order_type_stop_description_buy;
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = C40095R.string.order_type_stop_description_sell;
            }
            CryptoOrderTypeSelectorViewState2.OrderTypeRow orderTypeRow2 = new CryptoOrderTypeSelectorViewState2.OrderTypeRow(new CryptoOrderTypeSelectorOrderRowState(i14, stringResourceInvoke4, companion.invoke(i5, this.currencyPair.getAssetCurrency().getCode()), false, false, false, null, 120, null), new CryptoOrderTypeSelectorViewState2.TapAction.SelectOrderType(this.currencyPair, CryptoOrderType.STOP_LOSS, null, 4, null), null, "stop_loss", 4, null);
            int i16 = iArr[this.orderSide.ordinal()];
            if (i16 == 1) {
                i6 = C20690R.drawable.pict_clr_rds_order_types_buy_limit_stop;
            } else {
                if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i6 = C20690R.drawable.pict_clr_rds_order_types_sell_limit_stop;
            }
            int i17 = i6;
            StringResource stringResourceInvoke5 = companion.invoke(C40095R.string.order_type_stop_limit_title, new Object[0]);
            int i18 = iArr[this.orderSide.ordinal()];
            if (i18 == 1) {
                i7 = C40095R.string.order_type_stop_limit_description_buy;
            } else {
                if (i18 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i7 = C40095R.string.order_type_stop_limit_description_sell;
            }
            arrayList.addAll(CollectionsKt.listOf((Object[]) new CryptoOrderTypeSelectorViewState2.OrderTypeRow[]{orderTypeRow, orderTypeRow2, new CryptoOrderTypeSelectorViewState2.OrderTypeRow(new CryptoOrderTypeSelectorOrderRowState(i17, stringResourceInvoke5, companion.invoke(i7, this.currencyPair.getAssetCurrency().getCode()), false, false, false, null, 120, null), new CryptoOrderTypeSelectorViewState2.TapAction.SelectOrderType(this.currencyPair, CryptoOrderType.STOP_LIMIT, null, 4, null), null, "stop_limit", 4, null)}));
        }
        return extensions2.toImmutableList(arrayList);
    }

    private final List<CryptoOrderTypeSelectorViewState2> rebateMarketOrderRows(UiCurrencyPair currencyPair) {
        String currency$default;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        String currency$default2 = null;
        if (cryptoQuote != null) {
            Currency quoteCurrencyForCost = currencyPair.getQuoteCurrencyForCost();
            BigDecimal bigDecimalMultiply = cryptoQuote.getAskPrice().getDecimalValue().multiply(currencyPair.getMinOrderSize());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            currency$default = CurrencyDefinitions.formatCurrency$default(quoteCurrencyForCost, bigDecimalMultiply, false, false, RoundingMode.UP, 0, null, null, false, false, false, false, 2038, null);
        } else {
            currency$default = null;
        }
        if (currency$default == null) {
            currency$default = "";
        }
        BigDecimal minOrderQuoteAmount = currencyPair.getMinOrderQuoteAmount();
        int decimalScale = currencyPair.getAssetCurrencyForCost().getDecimalScale();
        CryptoQuote cryptoQuote2 = this.cryptoQuote;
        String currency$default3 = cryptoQuote2 != null ? CurrencyDefinitions.formatCurrency$default(currencyPair.getQuoteCurrencyForCost(), minBidFiatAmount(cryptoQuote2, currencyPair, minOrderQuoteAmount, decimalScale), false, false, RoundingMode.UP, 0, null, null, false, false, false, false, 2038, null) : null;
        if (currency$default3 == null) {
            currency$default3 = "";
        }
        String currency$default4 = CurrencyDefinitions.formatCurrency$default(currencyPair.getAssetCurrencyForCost(), currencyPair.getMinOrderSize(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        CryptoQuote cryptoQuote3 = this.cryptoQuote;
        if (cryptoQuote3 != null) {
            if (this.isRhcApp || minOrderQuoteAmount == null) {
                currency$default2 = currency$default4;
            } else {
                BigDecimal bigDecimalMultiply2 = cryptoQuote3.getBidPrice().getDecimalValue().multiply(CryptoOrder.INSTANCE.getSELL_COLLAR_FACTOR());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                BigDecimal bigDecimalCoerceScaleAtLeast = BigDecimals7.coerceScaleAtLeast(bigDecimalMultiply2, decimalScale);
                Currency assetCurrencyForCost = currencyPair.getAssetCurrencyForCost();
                RoundingMode roundingMode = RoundingMode.UP;
                currency$default2 = CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, BigDecimals7.safeDivide(minOrderQuoteAmount, bigDecimalCoerceScaleAtLeast, roundingMode), false, false, roundingMode, 0, null, null, false, false, false, false, 2038, null);
            }
        }
        String str = currency$default2 == null ? "" : currency$default2;
        CryptoOrderTypeSelectorViewState2.RowViewState.MarketQuote marketQuote = new CryptoOrderTypeSelectorViewState2.RowViewState.MarketQuote(this.orderSide, currencyPair, currency$default, currency$default3, this.isRhcApp);
        CryptoOrderType cryptoOrderType = CryptoOrderType.MARKET;
        return CollectionsKt.listOf((Object[]) new CryptoOrderTypeSelectorViewState2.BaseRowWithViewState[]{new CryptoOrderTypeSelectorViewState2.BaseRowWithViewState(marketQuote, new CryptoOrderTypeSelectorViewState2.TapAction.SelectOrderType(currencyPair, cryptoOrderType, CryptoInputMode.QUOTE_CURRENCY)), new CryptoOrderTypeSelectorViewState2.BaseRowWithViewState(new CryptoOrderTypeSelectorViewState2.RowViewState.MarketAmount(this.orderSide, currencyPair, currency$default4, (String) ComparisonsKt.minOf(str, currency$default4), this.isRhcApp), new CryptoOrderTypeSelectorViewState2.TapAction.SelectOrderType(currencyPair, cryptoOrderType, CryptoInputMode.ASSET_CURRENCY))});
    }

    private final List<CryptoOrderTypeSelectorViewState2> feeMarketOrderRows(UiCurrencyPair currencyPair) {
        Money bidPrice;
        Money askPrice;
        BigDecimal minFeeOrderQuoteAmount = currencyPair.getMinFeeOrderQuoteAmount();
        if (minFeeOrderQuoteAmount == null) {
            throw new IllegalStateException("Missing minFeeOrderQuoteAmount");
        }
        String currency$default = CurrencyDefinitions.formatCurrency$default(currencyPair.getQuoteCurrencyForCost(), minFeeOrderQuoteAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null);
        Currency assetCurrencyForCost = currencyPair.getAssetCurrencyForCost();
        CryptoFeeOrderSizeCalculator cryptoFeeOrderSizeCalculator = CryptoFeeOrderSizeCalculator.INSTANCE;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        BigDecimal decimalValue = null;
        String currency$default2 = CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, cryptoFeeOrderSizeCalculator.getMinAssetOrderSize(currencyPair, BigDecimals7.orZero((cryptoQuote == null || (askPrice = cryptoQuote.getAskPrice()) == null) ? null : askPrice.getDecimalValue())), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        Currency assetCurrencyForCost2 = currencyPair.getAssetCurrencyForCost();
        CryptoQuote cryptoQuote2 = this.cryptoQuote;
        if (cryptoQuote2 != null && (bidPrice = cryptoQuote2.getBidPrice()) != null) {
            decimalValue = bidPrice.getDecimalValue();
        }
        String currency$default3 = CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost2, cryptoFeeOrderSizeCalculator.getMinAssetOrderSize(currencyPair, BigDecimals7.orZero(decimalValue)), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        CryptoOrderTypeSelectorViewState2.RowViewState.MarketQuote marketQuote = new CryptoOrderTypeSelectorViewState2.RowViewState.MarketQuote(this.orderSide, currencyPair, currency$default, currency$default, this.isRhcApp);
        CryptoOrderType cryptoOrderType = CryptoOrderType.MARKET;
        return CollectionsKt.listOf((Object[]) new CryptoOrderTypeSelectorViewState2.BaseRowWithViewState[]{new CryptoOrderTypeSelectorViewState2.BaseRowWithViewState(marketQuote, new CryptoOrderTypeSelectorViewState2.TapAction.SelectOrderType(currencyPair, cryptoOrderType, CryptoInputMode.QUOTE_CURRENCY)), new CryptoOrderTypeSelectorViewState2.BaseRowWithViewState(new CryptoOrderTypeSelectorViewState2.RowViewState.MarketAmount(this.orderSide, currencyPair, currency$default2, currency$default3, this.isRhcApp), new CryptoOrderTypeSelectorViewState2.TapAction.SelectOrderType(currencyPair, cryptoOrderType, CryptoInputMode.ASSET_CURRENCY))});
    }

    /* renamed from: getAreLimitAndStopOrdersVisible$feature_trade_crypto_externalDebug */
    public final boolean m2872xf41b8001() {
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        boolean z = false;
        if (uiCurrencyPair != null && uiCurrencyPair.getMarketOrdersOnly()) {
            z = true;
        }
        return !z;
    }

    public final boolean isRecurringVisible$feature_trade_crypto_externalDebug() {
        return this.isRecurringInvestmentFeatureEnabled && this.orderSide == OrderSide.BUY && !this.isRhcApp;
    }

    private final boolean isConditionalOrderHeaderVisible() {
        return m2872xf41b8001() || isRecurringVisible$feature_trade_crypto_externalDebug();
    }

    private final BigDecimal minBidFiatAmount(CryptoQuote quote, UiCurrencyPair currencyPair, BigDecimal minOrderQuoteAmount, int assetScale) {
        BigDecimal bigDecimalMultiply = quote.getBidPrice().getDecimalValue().multiply(currencyPair.getMinOrderSize());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        if (this.isRhcApp || minOrderQuoteAmount == null) {
            return bigDecimalMultiply;
        }
        BigDecimal bigDecimalCoerceScaleAtLeast = BigDecimals7.coerceScaleAtLeast(quote.getBidPrice().getDecimalValue(), assetScale);
        RoundingMode roundingMode = RoundingMode.UP;
        BigDecimal scale = BigDecimals7.roundToInterval(BigDecimals7.safeDivide(minOrderQuoteAmount, bigDecimalCoerceScaleAtLeast, roundingMode), currencyPair.getMinOrderQuantityIncrement(), roundingMode).setScale(assetScale, roundingMode);
        BigDecimal bigDecimalMultiply2 = quote.getBidPrice().getDecimalValue().multiply(CryptoOrder.INSTANCE.getSELL_COLLAR_FACTOR());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        BigDecimal bigDecimalCoerceScaleAtLeast2 = BigDecimals7.coerceScaleAtLeast(bigDecimalMultiply2, assetScale);
        Intrinsics.checkNotNull(scale);
        BigDecimal bigDecimalMultiply3 = scale.multiply(bigDecimalCoerceScaleAtLeast2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        if (!BigDecimals7.gte(bigDecimalMultiply3, minOrderQuoteAmount)) {
            minOrderQuoteAmount = minOrderQuoteAmount.add(currencyPair.getQuoteCurrency().getIncrement());
            Intrinsics.checkNotNullExpressionValue(minOrderQuoteAmount, "add(...)");
        }
        return (BigDecimal) ComparisonsKt.minOf(bigDecimalMultiply, minOrderQuoteAmount);
    }
}
