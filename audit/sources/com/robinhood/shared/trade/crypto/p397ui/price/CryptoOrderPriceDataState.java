package com.robinhood.shared.trade.crypto.p397ui.price;

import com.robinhood.android.common.C11048R;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.Quote;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.crypto.utils.OrderSides3;
import com.robinhood.shared.crypto.utils.UiCurrencyPairs2;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceGroup;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import rosetta.nummus.order.SideDto;
import rosetta.nummus.order.TypeDto;

/* compiled from: CryptoOrderPriceDataState.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001tBc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010^\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b_J\u000e\u0010`\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\baJ\u0010\u0010b\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\bcJ\u0010\u0010d\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\beJ\u0010\u0010f\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\bgJ\u0010\u0010h\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0002\biJ\t\u0010j\u001a\u00020\u000fHÂ\u0003J\t\u0010k\u001a\u00020\u0011HÂ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0013HÀ\u0003¢\u0006\u0002\bmJm\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010o\u001a\u0002052\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020rHÖ\u0001J\t\u0010s\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010%X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u0004\u0018\u00010%X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0016\u0010*\u001a\u0004\u0018\u00010+X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010.\u001a\u0004\u0018\u00010+X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010+X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0013\u00102\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0014\u00104\u001a\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\bA\u0010?R\u0013\u0010B\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\bC\u0010?R\u0013\u0010D\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\bE\u0010?R\u0013\u0010F\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bG\u0010!R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0013\u0010M\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u001fR\u0013\u0010R\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\bS\u0010?R\u0013\u0010T\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010X\u001a\u0002058F¢\u0006\u0006\u001a\u0004\bY\u00107R\u0011\u0010Z\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006u"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDataState;", "", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "priceGroup", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/Quote;", "amount", "Ljava/math/BigDecimal;", "formattedAmount", "", "decimalSeparator", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoOrderMonetizationModel", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "<init>", "(Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/Quote;Ljava/math/BigDecimal;Ljava/lang/String;CLcom/robinhood/shared/app/type/AppType;Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;)V", "getOrderSide$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/db/OrderSide;", "getPriceGroup$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;", "getCurrencyPair$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoQuote$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/db/Quote;", "getAmount$feature_trade_crypto_externalDebug", "()Ljava/math/BigDecimal;", "getFormattedAmount$feature_trade_crypto_externalDebug", "()Ljava/lang/String;", "getCryptoOrderMonetizationModel$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "askPrice", "Lcom/robinhood/models/util/Money;", "getAskPrice$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/util/Money;", "bidPrice", "getBidPrice$feature_trade_crypto_externalDebug", "quoteCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "getQuoteCurrency$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/db/Currency;", "quoteCurrencyForPrice", "getQuoteCurrencyForPrice$feature_trade_crypto_externalDebug", "assetCurrency", "getAssetCurrency$feature_trade_crypto_externalDebug", "priceForOrder", "getPriceForOrder", "shouldShowMenu", "", "getShouldShowMenu$feature_trade_crypto_externalDebug", "()Z", "priceType", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDataState$OrderPriceType;", "getPriceType$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDataState$OrderPriceType;", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "cryptoAmountLabel", "getCryptoAmountLabel", "descriptionText", "getDescriptionText", "currentPriceText", "getCurrentPriceText", "currentPriceValueString", "getCurrentPriceValueString", "bottomSheetTypeDtos", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "getBottomSheetTypeDtos", "()Lkotlinx/collections/immutable/ImmutableList;", "spreadBottomSheetTypeDto", "getSpreadBottomSheetTypeDto", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "hintPrice", "getHintPrice", "formattedHintPrice", "getFormattedHintPrice", "currencySymbolPosition", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "getCurrencySymbolPosition", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "ctaEnabled", "getCtaEnabled", "numpadState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "getNumpadState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "component1", "component1$feature_trade_crypto_externalDebug", "component2", "component2$feature_trade_crypto_externalDebug", "component3", "component3$feature_trade_crypto_externalDebug", "component4", "component4$feature_trade_crypto_externalDebug", "component5", "component5$feature_trade_crypto_externalDebug", "component6", "component6$feature_trade_crypto_externalDebug", "component7", "component8", "component9", "component9$feature_trade_crypto_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "OrderPriceType", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderPriceDataState {
    public static final int $stable = 8;
    private final BigDecimal amount;
    private final AppType appType;
    private final Money askPrice;
    private final Currency assetCurrency;
    private final Money bidPrice;
    private final StringResource cryptoAmountLabel;
    private final CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
    private final Quote cryptoQuote;
    private final UiCurrencyPair currencyPair;
    private final char decimalSeparator;
    private final String formattedAmount;
    private final OrderSide orderSide;
    private final BigDecimal priceForOrder;
    private final CryptoOrderPriceGroup priceGroup;
    private final Currency quoteCurrency;
    private final Currency quoteCurrencyForPrice;
    private final StringResource titleText;

    /* compiled from: CryptoOrderPriceDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[OrderPriceType.values().length];
            try {
                iArr2[OrderPriceType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderPriceType.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component7, reason: from getter */
    private final char getDecimalSeparator() {
        return this.decimalSeparator;
    }

    /* renamed from: component8, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ CryptoOrderPriceDataState copy$default(CryptoOrderPriceDataState cryptoOrderPriceDataState, OrderSide orderSide, CryptoOrderPriceGroup cryptoOrderPriceGroup, UiCurrencyPair uiCurrencyPair, Quote quote, BigDecimal bigDecimal, String str, char c, AppType appType, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, int i, Object obj) {
        if ((i & 1) != 0) {
            orderSide = cryptoOrderPriceDataState.orderSide;
        }
        if ((i & 2) != 0) {
            cryptoOrderPriceGroup = cryptoOrderPriceDataState.priceGroup;
        }
        if ((i & 4) != 0) {
            uiCurrencyPair = cryptoOrderPriceDataState.currencyPair;
        }
        if ((i & 8) != 0) {
            quote = cryptoOrderPriceDataState.cryptoQuote;
        }
        if ((i & 16) != 0) {
            bigDecimal = cryptoOrderPriceDataState.amount;
        }
        if ((i & 32) != 0) {
            str = cryptoOrderPriceDataState.formattedAmount;
        }
        if ((i & 64) != 0) {
            c = cryptoOrderPriceDataState.decimalSeparator;
        }
        if ((i & 128) != 0) {
            appType = cryptoOrderPriceDataState.appType;
        }
        if ((i & 256) != 0) {
            cryptoOrderMonetizationModel = cryptoOrderPriceDataState.cryptoOrderMonetizationModel;
        }
        AppType appType2 = appType;
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel2 = cryptoOrderMonetizationModel;
        String str2 = str;
        char c2 = c;
        BigDecimal bigDecimal2 = bigDecimal;
        UiCurrencyPair uiCurrencyPair2 = uiCurrencyPair;
        return cryptoOrderPriceDataState.copy(orderSide, cryptoOrderPriceGroup, uiCurrencyPair2, quote, bigDecimal2, str2, c2, appType2, cryptoOrderMonetizationModel2);
    }

    /* renamed from: component1$feature_trade_crypto_externalDebug, reason: from getter */
    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    /* renamed from: component2$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoOrderPriceGroup getPriceGroup() {
        return this.priceGroup;
    }

    /* renamed from: component3$feature_trade_crypto_externalDebug, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component4$feature_trade_crypto_externalDebug, reason: from getter */
    public final Quote getCryptoQuote() {
        return this.cryptoQuote;
    }

    /* renamed from: component5$feature_trade_crypto_externalDebug, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component6$feature_trade_crypto_externalDebug, reason: from getter */
    public final String getFormattedAmount() {
        return this.formattedAmount;
    }

    /* renamed from: component9$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
        return this.cryptoOrderMonetizationModel;
    }

    public final CryptoOrderPriceDataState copy(OrderSide orderSide, CryptoOrderPriceGroup priceGroup, UiCurrencyPair currencyPair, Quote cryptoQuote, BigDecimal amount, String formattedAmount, char decimalSeparator, AppType appType, CryptoOrderMonetizationModel cryptoOrderMonetizationModel) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(priceGroup, "priceGroup");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new CryptoOrderPriceDataState(orderSide, priceGroup, currencyPair, cryptoQuote, amount, formattedAmount, decimalSeparator, appType, cryptoOrderMonetizationModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderPriceDataState)) {
            return false;
        }
        CryptoOrderPriceDataState cryptoOrderPriceDataState = (CryptoOrderPriceDataState) other;
        return this.orderSide == cryptoOrderPriceDataState.orderSide && Intrinsics.areEqual(this.priceGroup, cryptoOrderPriceDataState.priceGroup) && Intrinsics.areEqual(this.currencyPair, cryptoOrderPriceDataState.currencyPair) && Intrinsics.areEqual(this.cryptoQuote, cryptoOrderPriceDataState.cryptoQuote) && Intrinsics.areEqual(this.amount, cryptoOrderPriceDataState.amount) && Intrinsics.areEqual(this.formattedAmount, cryptoOrderPriceDataState.formattedAmount) && this.decimalSeparator == cryptoOrderPriceDataState.decimalSeparator && this.appType == cryptoOrderPriceDataState.appType && Intrinsics.areEqual(this.cryptoOrderMonetizationModel, cryptoOrderPriceDataState.cryptoOrderMonetizationModel);
    }

    public int hashCode() {
        int iHashCode = ((this.orderSide.hashCode() * 31) + this.priceGroup.hashCode()) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode2 = (iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        Quote quote = this.cryptoQuote;
        int iHashCode3 = (iHashCode2 + (quote == null ? 0 : quote.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.formattedAmount;
        int iHashCode5 = (((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Character.hashCode(this.decimalSeparator)) * 31) + this.appType.hashCode()) * 31;
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
        return iHashCode5 + (cryptoOrderMonetizationModel != null ? cryptoOrderMonetizationModel.hashCode() : 0);
    }

    public String toString() {
        return "CryptoOrderPriceDataState(orderSide=" + this.orderSide + ", priceGroup=" + this.priceGroup + ", currencyPair=" + this.currencyPair + ", cryptoQuote=" + this.cryptoQuote + ", amount=" + this.amount + ", formattedAmount=" + this.formattedAmount + ", decimalSeparator=" + this.decimalSeparator + ", appType=" + this.appType + ", cryptoOrderMonetizationModel=" + this.cryptoOrderMonetizationModel + ")";
    }

    public CryptoOrderPriceDataState(OrderSide orderSide, CryptoOrderPriceGroup priceGroup, UiCurrencyPair uiCurrencyPair, Quote quote, BigDecimal bigDecimal, String str, char c, AppType appType, CryptoOrderMonetizationModel cryptoOrderMonetizationModel) {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        BigDecimal bigDecimalCompat;
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(priceGroup, "priceGroup");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.orderSide = orderSide;
        this.priceGroup = priceGroup;
        this.currencyPair = uiCurrencyPair;
        this.cryptoQuote = quote;
        this.amount = bigDecimal;
        this.formattedAmount = str;
        this.decimalSeparator = c;
        this.appType = appType;
        this.cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
        BigDecimal bigDecimal2 = null;
        this.askPrice = quote != null ? quote.getAskPrice() : null;
        this.bidPrice = quote != null ? quote.getBidPrice() : null;
        this.quoteCurrency = uiCurrencyPair != null ? uiCurrencyPair.getQuoteCurrency() : null;
        this.quoteCurrencyForPrice = uiCurrencyPair != null ? uiCurrencyPair.getQuoteCurrencyForPriceInput() : null;
        this.assetCurrency = uiCurrencyPair != null ? uiCurrencyPair.getAssetCurrency() : null;
        if (quote != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
            if (i == 1) {
                bigDecimalCompat = Money3.getBigDecimalCompat(quote.getAskPrice());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimalCompat = Money3.getBigDecimalCompat(quote.getBidPrice());
            }
            bigDecimal2 = bigDecimalCompat;
        }
        this.priceForOrder = bigDecimal2;
        OrderPriceType priceType$feature_trade_crypto_externalDebug = getPriceType$feature_trade_crypto_externalDebug();
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i2 = iArr[priceType$feature_trade_crypto_externalDebug.ordinal()];
        if (i2 == 1) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.general_label_limit_price_set, new Object[0]);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_label_stop_price_set, new Object[0]);
        }
        this.titleText = stringResourceInvoke;
        int i3 = iArr[getPriceType$feature_trade_crypto_externalDebug().ordinal()];
        if (i3 == 1) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_limit_price_label, new Object[0]);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_stop_price_label, new Object[0]);
        }
        this.cryptoAmountLabel = stringResourceInvoke2;
    }

    public /* synthetic */ CryptoOrderPriceDataState(OrderSide orderSide, CryptoOrderPriceGroup cryptoOrderPriceGroup, UiCurrencyPair uiCurrencyPair, Quote quote, BigDecimal bigDecimal, String str, char c, AppType appType, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderSide, cryptoOrderPriceGroup, (i & 4) != 0 ? null : uiCurrencyPair, (i & 8) != 0 ? null : quote, (i & 16) != 0 ? null : bigDecimal, (i & 32) != 0 ? null : str, c, appType, (i & 256) != 0 ? null : cryptoOrderMonetizationModel);
    }

    public final OrderSide getOrderSide$feature_trade_crypto_externalDebug() {
        return this.orderSide;
    }

    public final CryptoOrderPriceGroup getPriceGroup$feature_trade_crypto_externalDebug() {
        return this.priceGroup;
    }

    public final UiCurrencyPair getCurrencyPair$feature_trade_crypto_externalDebug() {
        return this.currencyPair;
    }

    public final Quote getCryptoQuote$feature_trade_crypto_externalDebug() {
        return this.cryptoQuote;
    }

    public final BigDecimal getAmount$feature_trade_crypto_externalDebug() {
        return this.amount;
    }

    public final String getFormattedAmount$feature_trade_crypto_externalDebug() {
        return this.formattedAmount;
    }

    /* renamed from: getCryptoOrderMonetizationModel$feature_trade_crypto_externalDebug */
    public final CryptoOrderMonetizationModel m2875x5cfb4369() {
        return this.cryptoOrderMonetizationModel;
    }

    /* renamed from: getAskPrice$feature_trade_crypto_externalDebug, reason: from getter */
    public final Money getAskPrice() {
        return this.askPrice;
    }

    /* renamed from: getBidPrice$feature_trade_crypto_externalDebug, reason: from getter */
    public final Money getBidPrice() {
        return this.bidPrice;
    }

    /* renamed from: getQuoteCurrency$feature_trade_crypto_externalDebug, reason: from getter */
    public final Currency getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* renamed from: getQuoteCurrencyForPrice$feature_trade_crypto_externalDebug, reason: from getter */
    public final Currency getQuoteCurrencyForPrice() {
        return this.quoteCurrencyForPrice;
    }

    /* renamed from: getAssetCurrency$feature_trade_crypto_externalDebug, reason: from getter */
    public final Currency getAssetCurrency() {
        return this.assetCurrency;
    }

    public final BigDecimal getPriceForOrder() {
        return this.priceForOrder;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderPriceDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDataState$OrderPriceType;", "", "<init>", "(Ljava/lang/String;I)V", "LIMIT", "STOP", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderPriceType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderPriceType[] $VALUES;
        public static final OrderPriceType LIMIT = new OrderPriceType("LIMIT", 0);
        public static final OrderPriceType STOP = new OrderPriceType("STOP", 1);

        private static final /* synthetic */ OrderPriceType[] $values() {
            return new OrderPriceType[]{LIMIT, STOP};
        }

        public static EnumEntries<OrderPriceType> getEntries() {
            return $ENTRIES;
        }

        private OrderPriceType(String str, int i) {
        }

        static {
            OrderPriceType[] orderPriceTypeArr$values = $values();
            $VALUES = orderPriceTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderPriceTypeArr$values);
        }

        public static OrderPriceType valueOf(String str) {
            return (OrderPriceType) Enum.valueOf(OrderPriceType.class, str);
        }

        public static OrderPriceType[] values() {
            return (OrderPriceType[]) $VALUES.clone();
        }
    }

    public final boolean getShouldShowMenu$feature_trade_crypto_externalDebug() {
        CryptoOrderPriceGroup cryptoOrderPriceGroup = this.priceGroup;
        return (cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.StopLoss) || (cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.StopLimit);
    }

    public final OrderPriceType getPriceType$feature_trade_crypto_externalDebug() {
        CryptoOrderPriceGroup cryptoOrderPriceGroup = this.priceGroup;
        if (cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.Limit) {
            return OrderPriceType.LIMIT;
        }
        if (cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.StopLoss) {
            return OrderPriceType.STOP;
        }
        if (!(cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.StopLimit)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((CryptoOrderPriceGroup.StopLimit) cryptoOrderPriceGroup).getStopPrice() == null) {
            return OrderPriceType.STOP;
        }
        return OrderPriceType.LIMIT;
    }

    public final StringResource getTitleText() {
        return this.titleText;
    }

    public final StringResource getCryptoAmountLabel() {
        return this.cryptoAmountLabel;
    }

    public final StringResource getDescriptionText() {
        Currency currency = this.assetCurrency;
        if (currency == null) {
            return null;
        }
        CryptoOrderPriceGroup cryptoOrderPriceGroup = this.priceGroup;
        if (cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.Limit) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_advanced_limit_price_buy_prompt_limit_order, currency.getCode());
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_advanced_limit_price_sell_prompt_limit_order, currency.getCode());
        }
        if (cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.StopLoss) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
            if (i2 == 1) {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_advanced_stop_price_buy_prompt_stop_order, currency.getCode());
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_advanced_stop_price_sell_prompt_stop_order, currency.getCode());
        }
        if (!(cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.StopLimit)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[getPriceType$feature_trade_crypto_externalDebug().ordinal()];
        if (i3 == 1) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
            if (i4 == 1) {
                return StringResource.INSTANCE.invoke(C40095R.string.f6287x3ec51f2c, currency.getCode());
            }
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C40095R.string.f6288x566878de, currency.getCode());
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
        if (i5 == 1) {
            return StringResource.INSTANCE.invoke(C40095R.string.f6289xa1c94925, currency.getCode());
        }
        if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C40095R.string.f6290x53e98e05, currency.getCode());
    }

    public final StringResource getCurrentPriceText() {
        String currentPriceValueString = getCurrentPriceValueString();
        if (currentPriceValueString == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[getPriceType$feature_trade_crypto_externalDebug().ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
            if (i2 == 1) {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_advanced_limit_price_buy, currentPriceValueString);
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_advanced_limit_price_sell, currentPriceValueString);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
        if (i3 == 1) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_advanced_stop_price_buy, currentPriceValueString);
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_advanced_stop_price_sell, currentPriceValueString);
    }

    public final String getCurrentPriceValueString() {
        UiCurrencyPair uiCurrencyPair;
        Currency quoteCurrencyForPriceInput;
        BigDecimal bigDecimal = this.priceForOrder;
        if (bigDecimal == null || (uiCurrencyPair = this.currencyPair) == null || (quoteCurrencyForPriceInput = uiCurrencyPair.getQuoteCurrencyForPriceInput()) == null) {
            return null;
        }
        return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, bigDecimal, false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public final ImmutableList<BottomSheetTypeDto> getBottomSheetTypeDtos() {
        return extensions2.toPersistentList(CollectionsKt.listOfNotNull(getSpreadBottomSheetTypeDto()));
    }

    public final BottomSheetTypeDto getSpreadBottomSheetTypeDto() {
        TypeDto typeDto;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair == null || this.cryptoQuote == null) {
            return null;
        }
        Currency quoteCurrencyForPriceInput = uiCurrencyPair.getQuoteCurrencyForPriceInput();
        String code = this.currencyPair.getAssetCurrency().getCode();
        SideDto sideDto = OrderSides3.getSideDto(this.orderSide);
        CryptoOrderPriceGroup cryptoOrderPriceGroup = this.priceGroup;
        if (cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.Limit) {
            typeDto = TypeDto.TYPE_LIMIT;
        } else if (cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.StopLimit) {
            typeDto = TypeDto.TYPE_STOP_LIMIT;
        } else {
            if (!(cryptoOrderPriceGroup instanceof CryptoOrderPriceGroup.StopLoss)) {
                throw new NoWhenBranchMatchedException();
            }
            typeDto = TypeDto.TYPE_STOP_LOSS;
        }
        return new BottomSheetTypeDto(new BottomSheetTypeDto.TypeDto.Spread(new BottomSheetTypeDto.SpreadDto(code, sideDto, typeDto, IdlDecimal2.toIdlDecimal(BigDecimals7.orZero(this.currencyPair.getRebate())), IdlDecimal2.toIdlDecimal(this.cryptoQuote.getBuySpreadFraction()), IdlDecimal2.toIdlDecimal(this.cryptoQuote.getSellSpreadFraction()), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, this.cryptoQuote.getBidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, this.cryptoQuote.getMidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, this.cryptoQuote.getAskPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null))));
    }

    private final BigDecimal getHintPrice() {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    public final StringResource getFormattedHintPrice() {
        Currency quoteCurrencyForPriceInput;
        String currency$default;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair == null || (quoteCurrencyForPriceInput = uiCurrencyPair.getQuoteCurrencyForPriceInput()) == null || (currency$default = CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, getHintPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null)) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(currency$default);
    }

    public final CurrencyFormatModel.CurrencySymbolPosition getCurrencySymbolPosition() {
        Currency quoteCurrency;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair == null || (quoteCurrency = uiCurrencyPair.getQuoteCurrency()) == null) {
            return null;
        }
        return CurrencyDefinitions.getCurrencySymbolPosition(quoteCurrency);
    }

    public final boolean getCtaEnabled() {
        return BigDecimals7.m2978gt(this.amount, BigDecimal.ZERO);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        boolean z;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair == null) {
            z = true;
        } else {
            z = false;
            if (UiCurrencyPairs2.allowDecimalInput(uiCurrencyPair, CryptoInputMode.QUOTE_CURRENCY)) {
                String str = this.formattedAmount;
                if (str == null) {
                    str = "";
                }
                if (!StringsKt.contains$default((CharSequence) str, this.decimalSeparator, false, 2, (Object) null)) {
                }
            }
        }
        return new CryptoOrderAnimatedBentoNumpadState(true, false, z, null, 10, null);
    }
}
