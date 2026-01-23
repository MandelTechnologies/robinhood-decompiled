package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.librobinhood.data.store.CryptoUsQuickTradeExperiment;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.utils.UiCurrencyPairs2;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeRow;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeSheetViewState;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoInputRowCurrencyToggle4;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeAmountInputRowState;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeDropdownState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoQuickTradeSheetDataState.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0001¢\u0006\u0002\b<J\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010:\u001a\u00020;J\u0010\u0010_\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b`J\u0010\u0010a\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\bbJ\u0010\u0010c\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\bdJ\u0010\u0010e\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\bfJ\u000e\u0010g\u001a\u00020\u000bHÀ\u0003¢\u0006\u0002\bhJ\u000e\u0010i\u001a\u00020\rHÀ\u0003¢\u0006\u0002\bjJ\u000e\u0010k\u001a\u00020\u000fHÀ\u0003¢\u0006\u0002\blJ\u000e\u0010m\u001a\u00020\u0011HÀ\u0003¢\u0006\u0002\bnJ\t\u0010o\u001a\u00020\u0013HÆ\u0003Jk\u0010p\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010q\u001a\u00020Y2\b\u0010r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010s\u001a\u00020>HÖ\u0001J\t\u0010t\u001a\u00020\tHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u00020\u000b8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\r8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u00020\u000f8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0010\u001a\u00020\u00118AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001dR\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00102\u001a\u0004\u0018\u0001038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00106\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00101R\u0014\u0010=\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u00101R\u0016\u0010C\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u001dR\u001a\u0010E\u001a\u00020F8@X\u0081\u0004¢\u0006\f\u0012\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0011\u0010K\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020F8@X\u0081\u0004¢\u0006\f\u0012\u0004\bP\u0010H\u001a\u0004\bQ\u0010JR\u0016\u0010R\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u001dR\u0011\u0010T\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010X\u001a\u00020Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006u"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDataState;", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "amount", "Ljava/math/BigDecimal;", "formattedAmount", "", "decimalSeparator", "", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "cryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "quickTradeExperimentVariant", "Lcom/robinhood/librobinhood/data/store/CryptoUsQuickTradeExperiment$Variant;", "tradeStage", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState$TradeStage;", "<init>", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/math/BigDecimal;Ljava/lang/String;CLcom/robinhood/models/db/OrderSide;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Lcom/robinhood/librobinhood/data/store/CryptoUsQuickTradeExperiment$Variant;Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState$TradeStage;)V", "getCryptoOrderContext$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getCurrencyPair$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getAmount$feature_trade_crypto_externalDebug", "()Ljava/math/BigDecimal;", "getFormattedAmount$feature_trade_crypto_externalDebug", "()Ljava/lang/String;", "getDecimalSeparator$feature_trade_crypto_externalDebug", "()C", "getOrderSide$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/db/OrderSide;", "getCryptoInputMode$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getQuickTradeExperimentVariant$feature_trade_crypto_externalDebug", "()Lcom/robinhood/librobinhood/data/store/CryptoUsQuickTradeExperiment$Variant;", "getTradeStage", "()Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState$TradeStage;", "assetSymbol", "getAssetSymbol", "numpadState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "getNumpadState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "inputStageHeader", "Lcom/robinhood/utils/resource/StringResource;", "getInputStageHeader", "()Lcom/robinhood/utils/resource/StringResource;", "currencySwitcherState", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState;", "getCurrencySwitcherState", "()Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState;", "inputRowSecondaryText", "getInputRowSecondaryText", "inputRowState", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow$Input;", "resources", "Landroid/content/res/Resources;", "inputRowState$feature_trade_crypto_externalDebug", "eduRowLabelId", "", "getEduRowLabelId", "()I", "eduRowSpreadPercent", "getEduRowSpreadPercent", "eduRowValue", "getEduRowValue", "eduContentState", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow$OrderReviewRow;", "getEduContentState$feature_trade_crypto_externalDebug$annotations", "()V", "getEduContentState$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow$OrderReviewRow;", "orderTypeDropdownSelectorState", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeDropdownState;", "getOrderTypeDropdownSelectorState", "()Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeDropdownState;", "reviewContentState", "getReviewContentState$feature_trade_crypto_externalDebug$annotations", "getReviewContentState$feature_trade_crypto_externalDebug", "reviewRowTotalCostText", "getReviewRowTotalCostText", "actionBarState", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "getActionBarState", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "disclosureVisible", "", "getDisclosureVisible", "()Z", "inputStageRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow;", "component1", "component1$feature_trade_crypto_externalDebug", "component2", "component2$feature_trade_crypto_externalDebug", "component3", "component3$feature_trade_crypto_externalDebug", "component4", "component4$feature_trade_crypto_externalDebug", "component5", "component5$feature_trade_crypto_externalDebug", "component6", "component6$feature_trade_crypto_externalDebug", "component7", "component7$feature_trade_crypto_externalDebug", "component8", "component8$feature_trade_crypto_externalDebug", "component9", "copy", "equals", "other", "hashCode", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoQuickTradeSheetDataState {
    public static final int $stable = 8;
    private final BigDecimal amount;
    private final CryptoInputMode cryptoInputMode;
    private final CryptoOrderContext cryptoOrderContext;
    private final UiCurrencyPair currencyPair;
    private final char decimalSeparator;
    private final String formattedAmount;
    private final OrderSide orderSide;
    private final CryptoUsQuickTradeExperiment.Variant quickTradeExperimentVariant;
    private final CryptoQuickTradeSheetViewState.TradeStage tradeStage;

    /* compiled from: CryptoQuickTradeSheetDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[CryptoInputMode.values().length];
            try {
                iArr2[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CryptoUsQuickTradeExperiment.Variant.values().length];
            try {
                iArr3[CryptoUsQuickTradeExperiment.Variant.TAP_TO_SUBMIT_CONTROL_EDU.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CryptoUsQuickTradeExperiment.Variant.SWIPE_TO_SUBMIT_CONTROL_EDU.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CryptoUsQuickTradeExperiment.Variant.TAP_TO_SUBMIT_UPDATED_EDU.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CryptoUsQuickTradeExperiment.Variant.SWIPE_TO_SUBMIT_UPDATED_EDU.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static /* synthetic */ CryptoQuickTradeSheetDataState copy$default(CryptoQuickTradeSheetDataState cryptoQuickTradeSheetDataState, CryptoOrderContext cryptoOrderContext, UiCurrencyPair uiCurrencyPair, BigDecimal bigDecimal, String str, char c, OrderSide orderSide, CryptoInputMode cryptoInputMode, CryptoUsQuickTradeExperiment.Variant variant, CryptoQuickTradeSheetViewState.TradeStage tradeStage, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoOrderContext = cryptoQuickTradeSheetDataState.cryptoOrderContext;
        }
        if ((i & 2) != 0) {
            uiCurrencyPair = cryptoQuickTradeSheetDataState.currencyPair;
        }
        if ((i & 4) != 0) {
            bigDecimal = cryptoQuickTradeSheetDataState.amount;
        }
        if ((i & 8) != 0) {
            str = cryptoQuickTradeSheetDataState.formattedAmount;
        }
        if ((i & 16) != 0) {
            c = cryptoQuickTradeSheetDataState.decimalSeparator;
        }
        if ((i & 32) != 0) {
            orderSide = cryptoQuickTradeSheetDataState.orderSide;
        }
        if ((i & 64) != 0) {
            cryptoInputMode = cryptoQuickTradeSheetDataState.cryptoInputMode;
        }
        if ((i & 128) != 0) {
            variant = cryptoQuickTradeSheetDataState.quickTradeExperimentVariant;
        }
        if ((i & 256) != 0) {
            tradeStage = cryptoQuickTradeSheetDataState.tradeStage;
        }
        CryptoUsQuickTradeExperiment.Variant variant2 = variant;
        CryptoQuickTradeSheetViewState.TradeStage tradeStage2 = tradeStage;
        OrderSide orderSide2 = orderSide;
        CryptoInputMode cryptoInputMode2 = cryptoInputMode;
        char c2 = c;
        BigDecimal bigDecimal2 = bigDecimal;
        return cryptoQuickTradeSheetDataState.copy(cryptoOrderContext, uiCurrencyPair, bigDecimal2, str, c2, orderSide2, cryptoInputMode2, variant2, tradeStage2);
    }

    /* renamed from: getEduContentState$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2877x3f28ea9a() {
    }

    /* renamed from: getReviewContentState$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2878x25f8100c() {
    }

    /* renamed from: component1$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    /* renamed from: component2$feature_trade_crypto_externalDebug, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component3$feature_trade_crypto_externalDebug, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component4$feature_trade_crypto_externalDebug, reason: from getter */
    public final String getFormattedAmount() {
        return this.formattedAmount;
    }

    /* renamed from: component5$feature_trade_crypto_externalDebug, reason: from getter */
    public final char getDecimalSeparator() {
        return this.decimalSeparator;
    }

    /* renamed from: component6$feature_trade_crypto_externalDebug, reason: from getter */
    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    /* renamed from: component7$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoInputMode getCryptoInputMode() {
        return this.cryptoInputMode;
    }

    /* renamed from: component8$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoUsQuickTradeExperiment.Variant getQuickTradeExperimentVariant() {
        return this.quickTradeExperimentVariant;
    }

    /* renamed from: component9, reason: from getter */
    public final CryptoQuickTradeSheetViewState.TradeStage getTradeStage() {
        return this.tradeStage;
    }

    public final CryptoQuickTradeSheetDataState copy(CryptoOrderContext cryptoOrderContext, UiCurrencyPair currencyPair, BigDecimal amount, String formattedAmount, char decimalSeparator, OrderSide orderSide, CryptoInputMode cryptoInputMode, CryptoUsQuickTradeExperiment.Variant quickTradeExperimentVariant, CryptoQuickTradeSheetViewState.TradeStage tradeStage) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        Intrinsics.checkNotNullParameter(quickTradeExperimentVariant, "quickTradeExperimentVariant");
        Intrinsics.checkNotNullParameter(tradeStage, "tradeStage");
        return new CryptoQuickTradeSheetDataState(cryptoOrderContext, currencyPair, amount, formattedAmount, decimalSeparator, orderSide, cryptoInputMode, quickTradeExperimentVariant, tradeStage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoQuickTradeSheetDataState)) {
            return false;
        }
        CryptoQuickTradeSheetDataState cryptoQuickTradeSheetDataState = (CryptoQuickTradeSheetDataState) other;
        return Intrinsics.areEqual(this.cryptoOrderContext, cryptoQuickTradeSheetDataState.cryptoOrderContext) && Intrinsics.areEqual(this.currencyPair, cryptoQuickTradeSheetDataState.currencyPair) && Intrinsics.areEqual(this.amount, cryptoQuickTradeSheetDataState.amount) && Intrinsics.areEqual(this.formattedAmount, cryptoQuickTradeSheetDataState.formattedAmount) && this.decimalSeparator == cryptoQuickTradeSheetDataState.decimalSeparator && this.orderSide == cryptoQuickTradeSheetDataState.orderSide && this.cryptoInputMode == cryptoQuickTradeSheetDataState.cryptoInputMode && this.quickTradeExperimentVariant == cryptoQuickTradeSheetDataState.quickTradeExperimentVariant && this.tradeStage == cryptoQuickTradeSheetDataState.tradeStage;
    }

    public int hashCode() {
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        int iHashCode = (cryptoOrderContext == null ? 0 : cryptoOrderContext.hashCode()) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode2 = (iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.formattedAmount;
        return ((((((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Character.hashCode(this.decimalSeparator)) * 31) + this.orderSide.hashCode()) * 31) + this.cryptoInputMode.hashCode()) * 31) + this.quickTradeExperimentVariant.hashCode()) * 31) + this.tradeStage.hashCode();
    }

    public String toString() {
        return "CryptoQuickTradeSheetDataState(cryptoOrderContext=" + this.cryptoOrderContext + ", currencyPair=" + this.currencyPair + ", amount=" + this.amount + ", formattedAmount=" + this.formattedAmount + ", decimalSeparator=" + this.decimalSeparator + ", orderSide=" + this.orderSide + ", cryptoInputMode=" + this.cryptoInputMode + ", quickTradeExperimentVariant=" + this.quickTradeExperimentVariant + ", tradeStage=" + this.tradeStage + ")";
    }

    public CryptoQuickTradeSheetDataState(CryptoOrderContext cryptoOrderContext, UiCurrencyPair uiCurrencyPair, BigDecimal bigDecimal, String str, char c, OrderSide orderSide, CryptoInputMode cryptoInputMode, CryptoUsQuickTradeExperiment.Variant quickTradeExperimentVariant, CryptoQuickTradeSheetViewState.TradeStage tradeStage) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        Intrinsics.checkNotNullParameter(quickTradeExperimentVariant, "quickTradeExperimentVariant");
        Intrinsics.checkNotNullParameter(tradeStage, "tradeStage");
        this.cryptoOrderContext = cryptoOrderContext;
        this.currencyPair = uiCurrencyPair;
        this.amount = bigDecimal;
        this.formattedAmount = str;
        this.decimalSeparator = c;
        this.orderSide = orderSide;
        this.cryptoInputMode = cryptoInputMode;
        this.quickTradeExperimentVariant = quickTradeExperimentVariant;
        this.tradeStage = tradeStage;
    }

    public final CryptoOrderContext getCryptoOrderContext$feature_trade_crypto_externalDebug() {
        return this.cryptoOrderContext;
    }

    public final UiCurrencyPair getCurrencyPair$feature_trade_crypto_externalDebug() {
        return this.currencyPair;
    }

    public final BigDecimal getAmount$feature_trade_crypto_externalDebug() {
        return this.amount;
    }

    public final String getFormattedAmount$feature_trade_crypto_externalDebug() {
        return this.formattedAmount;
    }

    public final char getDecimalSeparator$feature_trade_crypto_externalDebug() {
        return this.decimalSeparator;
    }

    public final OrderSide getOrderSide$feature_trade_crypto_externalDebug() {
        return this.orderSide;
    }

    public final CryptoInputMode getCryptoInputMode$feature_trade_crypto_externalDebug() {
        return this.cryptoInputMode;
    }

    public /* synthetic */ CryptoQuickTradeSheetDataState(CryptoOrderContext cryptoOrderContext, UiCurrencyPair uiCurrencyPair, BigDecimal bigDecimal, String str, char c, OrderSide orderSide, CryptoInputMode cryptoInputMode, CryptoUsQuickTradeExperiment.Variant variant, CryptoQuickTradeSheetViewState.TradeStage tradeStage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoOrderContext, (i & 2) != 0 ? null : uiCurrencyPair, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? null : str, c, orderSide, cryptoInputMode, (i & 128) != 0 ? CryptoUsQuickTradeExperiment.Variant.CONTROL : variant, tradeStage);
    }

    /* renamed from: getQuickTradeExperimentVariant$feature_trade_crypto_externalDebug */
    public final CryptoUsQuickTradeExperiment.Variant m2879xcbf52c97() {
        return this.quickTradeExperimentVariant;
    }

    public final CryptoQuickTradeSheetViewState.TradeStage getTradeStage() {
        return this.tradeStage;
    }

    private final String getAssetSymbol() {
        Currency assetCurrency;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair == null || (assetCurrency = uiCurrencyPair.getAssetCurrency()) == null) {
            return null;
        }
        return assetCurrency.getSymbol();
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
            if (UiCurrencyPairs2.allowDecimalInput(uiCurrencyPair, this.cryptoInputMode)) {
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

    public final StringResource getInputStageHeader() {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
        if (i2 == 1) {
            i = C38572R.string.order_create_buy_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C38572R.string.order_create_sell_title;
        }
        if (getAssetSymbol() != null) {
            return StringResource.INSTANCE.invoke(i, getAssetSymbol());
        }
        return null;
    }

    private final CryptoInputRowCurrencyToggle4 getCurrencySwitcherState() {
        if (this.currencyPair == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            return new CryptoInputRowCurrencyToggle4.Asset(this.currencyPair.getAssetCurrency().getCurrencyCode());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new CryptoInputRowCurrencyToggle4.Quote(this.currencyPair.getQuoteCurrency().getCurrencyCode());
    }

    private final StringResource getInputRowSecondaryText() {
        CryptoOrderContext cryptoOrderContext;
        Money buyingPower;
        BigDecimal decimalValue;
        if (this.currencyPair == null || (cryptoOrderContext = this.cryptoOrderContext) == null) {
            return null;
        }
        if (this.cryptoInputMode == CryptoInputMode.ASSET_CURRENCY && this.orderSide == OrderSide.BUY) {
            CryptoBuyingPower cryptoBuyingPower = cryptoOrderContext.getAccountContext().getCryptoBuyingPower();
            if (cryptoBuyingPower == null || (buyingPower = cryptoBuyingPower.getBuyingPower()) == null || (decimalValue = buyingPower.getDecimalValue()) == null) {
                return null;
            }
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_quick_trade_max_amount_asset, CurrencyDefinitions.formatCurrency$default(this.currencyPair.getAssetCurrencyForCost(), BigDecimals7.safeDivide(decimalValue, this.cryptoOrderContext.getAskPrice().getDecimalValue()), false, false, null, 0, null, null, false, false, false, false, 2044, null));
        }
        return CryptoOrderContexts.getCryptoPowerText(cryptoOrderContext);
    }

    public final CryptoQuickTradeRow.Input inputRowState$feature_trade_crypto_externalDebug(Resources resources) {
        CharSequence text;
        Intrinsics.checkNotNullParameter(resources, "resources");
        StringResource inputRowSecondaryText = getInputRowSecondaryText();
        String string2 = (inputRowSecondaryText == null || (text = inputRowSecondaryText.getText(resources)) == null) ? null : text.toString();
        CryptoInputRowCurrencyToggle4 currencySwitcherState = getCurrencySwitcherState();
        if (string2 == null) {
            return new CryptoQuickTradeRow.Input(null);
        }
        if (currencySwitcherState == null) {
            return new CryptoQuickTradeRow.Input(null);
        }
        String str = this.formattedAmount;
        if (str == null) {
            str = "";
        }
        return new CryptoQuickTradeRow.Input(new CryptoQuickTradeAmountInputRowState(str, string2, currencySwitcherState));
    }

    private final int getEduRowLabelId() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$2[this.quickTradeExperimentVariant.ordinal()];
            if (i2 == 1 || i2 == 2) {
                return C40095R.string.crypto_order_row_ask_price;
            }
            if (i2 == 3 || i2 == 4) {
                return C40095R.string.crypto_order_row_ask_price_updated;
            }
            return C40095R.string.crypto_order_row_ask_price;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$2[this.quickTradeExperimentVariant.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return C40095R.string.crypto_order_row_bid_price;
        }
        if (i3 == 3 || i3 == 4) {
            return C40095R.string.crypto_order_row_bid_price_updated;
        }
        return C40095R.string.crypto_order_row_bid_price;
    }

    private final StringResource getEduRowSpreadPercent() {
        if (this.cryptoOrderContext == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_row_includes_spread, Formats.getHundredthPercentFormat().format(Float.valueOf(this.cryptoOrderContext.getBuySpreadFraction().floatValue())));
    }

    private final String getEduRowValue() {
        Money askPrice;
        Currency quoteCurrency;
        if (this.cryptoOrderContext == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
        if (i == 1) {
            askPrice = this.cryptoOrderContext.getAskPrice();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            askPrice = this.cryptoOrderContext.getBidPrice();
        }
        BigDecimal decimalValue = askPrice.getDecimalValue();
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair == null || (quoteCurrency = uiCurrencyPair.getQuoteCurrency()) == null) {
            return null;
        }
        return CurrencyDefinitions.formatCurrency$default(quoteCurrency, decimalValue, false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CryptoQuickTradeRow.OrderReviewRow getEduContentState$feature_trade_crypto_externalDebug() {
        StringResource.Companion companion = StringResource.INSTANCE;
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(companion.invoke(getEduRowLabelId(), new Object[0]), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderReviewRowState.ColorOverride.FG_2), null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        StringResource eduRowSpreadPercent = getEduRowSpreadPercent();
        if (eduRowSpreadPercent == null) {
            eduRowSpreadPercent = companion.invoke("-------------------");
        }
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(eduRowSpreadPercent, null, null, null, null, null, getEduRowSpreadPercent() == null, 62, null), null, 2, 0 == true ? 1 : 0));
        String eduRowValue = getEduRowValue();
        if (eduRowValue == null) {
            eduRowValue = "----------";
        }
        return new CryptoQuickTradeRow.OrderReviewRow(new CryptoOrderReviewRowState(textContent, new CryptoOrderReviewRowState.TextContent(companion.invoke(eduRowValue), null, null, null, CryptoOrderReviewRowState.TextStyleOverride.TEXT_M_BOLD, null, getEduRowValue() == null, 46, null), null, immutableList3PersistentListOf, null, false, CryptoOrderReviewRowState.VerticalPadding.DEFAULT, false, CryptoOrderReviewRowState.TapAction.QuickTrade.ShowEduPriceBottomSheet.INSTANCE, null, 660, null), true);
    }

    public final CryptoQuickTradeDropdownState getOrderTypeDropdownSelectorState() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        CryptoOrderIntentKey.OrderType orderType = CryptoOrderIntentKey.OrderType.MARKET;
        listCreateListBuilder.addAll(CollectionsKt.listOf((Object[]) new CryptoOrderIntentKey.OrderType[]{orderType, CryptoOrderIntentKey.OrderType.LIMIT, CryptoOrderIntentKey.OrderType.STOP_LIMIT, CryptoOrderIntentKey.OrderType.STOP_LOSS}));
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
        if (i == 1) {
            listCreateListBuilder.add(CryptoOrderIntentKey.OrderType.RECURRING);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listCreateListBuilder.add(CryptoOrderIntentKey.OrderType.TAX_LOTS);
        }
        return new CryptoQuickTradeDropdownState(extensions2.toImmutableList(CollectionsKt.build(listCreateListBuilder)), orderType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CryptoQuickTradeRow.OrderReviewRow getReviewContentState$feature_trade_crypto_externalDebug() {
        StringResource stringResourceInvoke;
        int i = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_order_result_label_total_cost, new Object[0]);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String assetSymbol = getAssetSymbol();
            stringResourceInvoke = assetSymbol != null ? StringResource.INSTANCE.invoke(C40095R.string.crypto_order_total_amount_label, assetSymbol) : null;
        }
        String reviewRowTotalCostText = getReviewRowTotalCostText();
        StringResource stringResourceInvoke2 = reviewRowTotalCostText != null ? StringResource.INSTANCE.invoke(reviewRowTotalCostText) : null;
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke == null ? StringResource.INSTANCE.invoke("----") : stringResourceInvoke, null, null, null, null, null, stringResourceInvoke == null, 62, null);
        StringResource stringResourceInvoke3 = stringResourceInvoke2 == null ? StringResource.INSTANCE.invoke("----") : stringResourceInvoke2;
        boolean z = stringResourceInvoke2 == null;
        return new CryptoQuickTradeRow.OrderReviewRow(new CryptoOrderReviewRowState(textContent, new CryptoOrderReviewRowState.TextContent(stringResourceInvoke3, null, null, null, CryptoOrderReviewRowState.TextStyleOverride.TEXT_M_BOLD, null, z, 46, null), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, null, false, null, null, 988, null), BigDecimals7.orZero(this.amount).compareTo(BigDecimal.ZERO) != 0);
    }

    private final String getReviewRowTotalCostText() {
        Currency quoteCurrencyForCost;
        Currency assetCurrencyForCost;
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        if (cryptoOrderContext == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            UiCurrencyPair uiCurrencyPair = this.currencyPair;
            if (uiCurrencyPair == null || (quoteCurrencyForCost = uiCurrencyPair.getQuoteCurrencyForCost()) == null) {
                return null;
            }
            return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForCost, cryptoOrderContext.getOrderInfo().getUncollaredTotalCost(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        UiCurrencyPair uiCurrencyPair2 = this.currencyPair;
        if (uiCurrencyPair2 == null || (assetCurrencyForCost = uiCurrencyPair2.getAssetCurrencyForCost()) == null) {
            return null;
        }
        return CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public final ActionViewState getActionBarState() {
        BigDecimal bigDecimal = this.amount;
        if (bigDecimal == null || BigDecimals7.isZero(bigDecimal)) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.orderSide.ordinal()];
            if (i == 1) {
                return new ActionViewState.Submit(false);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return ActionViewState.SellAll.INSTANCE;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$2[this.quickTradeExperimentVariant.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return ActionViewState.Empty.INSTANCE;
                    }
                }
            }
            return new ActionViewState.SwipeToSubmit(true);
        }
        return new ActionViewState.Submit(true);
    }

    public final boolean getDisclosureVisible() {
        return getReviewContentState$feature_trade_crypto_externalDebug().getVisible();
    }

    public final ImmutableList<CryptoQuickTradeRow> inputStageRows(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return extensions2.persistentListOf(inputRowState$feature_trade_crypto_externalDebug(resources), getEduContentState$feature_trade_crypto_externalDebug(), getReviewContentState$feature_trade_crypto_externalDebug());
    }
}
