package com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet;

import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetViewState;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: CryptoTradeBonusReviewOrderBottomSheetDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDataState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDataState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDataState$Loading;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoTradeBonusReviewOrderBottomSheetDataState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoTradeBonusReviewOrderBottomSheetDataState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoTradeBonusReviewOrderBottomSheetDataState() {
    }

    /* compiled from: CryptoTradeBonusReviewOrderBottomSheetDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDataState$Loading;", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoTradeBonusReviewOrderBottomSheetDataState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1393822899;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: CryptoTradeBonusReviewOrderBottomSheetDataState.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0013\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001d¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDataState$Loaded;", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetDataState;", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "<init>", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)V", "getCryptoOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "tradeBonus", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility$TradeBonus;", "getTradeBonus", "()Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility$TradeBonus;", "amountWithoutBonus", "Ljava/math/BigDecimal;", "getAmountWithoutBonus", "()Ljava/math/BigDecimal;", "bonusAmount", "getBonusAmount", "bonusCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "getBonusCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "bonusCurrencyCode", "", "getBonusCurrencyCode", "()Ljava/lang/String;", "amountWithoutBonusRow", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetViewState$Loaded$DataRow;", "getAmountWithoutBonusRow", "()Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/reviewOrderBottomSheet/CryptoTradeBonusReviewOrderBottomSheetViewState$Loaded$DataRow;", "bonusRow", "getBonusRow", "amountWithBonusRow", "getAmountWithBonusRow", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends CryptoTradeBonusReviewOrderBottomSheetDataState {
        public static final int $stable = 8;
        private final CryptoOrderContext cryptoOrderContext;

        /* compiled from: CryptoTradeBonusReviewOrderBottomSheetDataState.kt */
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

        public static /* synthetic */ Loaded copy$default(Loaded loaded, CryptoOrderContext cryptoOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderContext = loaded.cryptoOrderContext;
            }
            return loaded.copy(cryptoOrderContext);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        public final Loaded copy(CryptoOrderContext cryptoOrderContext) {
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            return new Loaded(cryptoOrderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.cryptoOrderContext, ((Loaded) other).cryptoOrderContext);
        }

        public int hashCode() {
            return this.cryptoOrderContext.hashCode();
        }

        public String toString() {
            return "Loaded(cryptoOrderContext=" + this.cryptoOrderContext + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(CryptoOrderContext cryptoOrderContext) {
            super(null);
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            this.cryptoOrderContext = cryptoOrderContext;
        }

        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        private final UiCryptoTradeBonusEligibility.TradeBonus getTradeBonus() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.cryptoOrderContext.getRequestContext().getRequestInputs().getSide().ordinal()];
            if (i == 1) {
                UiCryptoTradeBonusEligibility tradeBonusEligibility = this.cryptoOrderContext.getRequest().getTradeBonusEligibility();
                if (tradeBonusEligibility != null) {
                    return tradeBonusEligibility.getAssetBonus();
                }
                return null;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            UiCryptoTradeBonusEligibility tradeBonusEligibility2 = this.cryptoOrderContext.getRequest().getTradeBonusEligibility();
            if (tradeBonusEligibility2 != null) {
                return tradeBonusEligibility2.getQuoteBonus();
            }
            return null;
        }

        private final BigDecimal getAmountWithoutBonus() {
            CryptoOrderContext.RequestContext requestContext = this.cryptoOrderContext.getRequestContext();
            RequestInputs requestInputs = this.cryptoOrderContext.getRequestContext().getRequestInputs();
            int i = WhenMappings.$EnumSwitchMapping$0[requestInputs.getSide().ordinal()];
            if (i == 1) {
                return this.cryptoOrderContext.getOrderInfo().getDisplayQuantity();
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (requestInputs.getOrderPrices().getOrderType() == CryptoOrderType.LIMIT) {
                return this.cryptoOrderContext.getOrderInfo().getUncollaredTotalCost();
            }
            if (requestInputs instanceof RequestInputs.AsQuote) {
                return ((RequestInputs.AsQuote) requestInputs).getPurchaseCost();
            }
            if (!(requestInputs instanceof RequestInputs.AsAsset)) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal scale = this.cryptoOrderContext.getOrderInfo().getUncollaredTotalCost().setScale(requestContext.getCurrencyPair().getQuoteCurrency().getDecimalScale(), RoundingMode.DOWN);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            return scale;
        }

        private final BigDecimal getBonusAmount() {
            BigDecimal amountWithoutBonus = getAmountWithoutBonus();
            UiCryptoTradeBonusEligibility.TradeBonus tradeBonus = getTradeBonus();
            BigDecimal bigDecimalSafeMultiply = BigDecimals7.safeMultiply(amountWithoutBonus, tradeBonus != null ? tradeBonus.getBonusRatio() : null);
            UiCryptoTradeBonusEligibility.TradeBonus tradeBonus2 = getTradeBonus();
            return (BigDecimal) RangesKt.coerceAtLeast(bigDecimalSafeMultiply, BigDecimals7.orZero(tradeBonus2 != null ? tradeBonus2.getMinBonusAmount() : null));
        }

        private final Currency getBonusCurrency() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.cryptoOrderContext.getRequestContext().getRequestInputs().getSide().ordinal()];
            if (i == 1) {
                return this.cryptoOrderContext.getRequestContext().getCurrencyPair().getAssetCurrencyForCost();
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return this.cryptoOrderContext.getRequestContext().getCurrencyPair().getQuoteCurrencyForPriceInput();
        }

        public final String getBonusCurrencyCode() {
            return getBonusCurrency().getCode();
        }

        public final CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded.DataRow getAmountWithoutBonusRow() {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded.DataRow(companion.invoke(C40095R.string.crypto_trade_bonus_bottom_sheet_amount_label, getBonusCurrencyCode()), companion.invoke(CurrencyDefinitions.formatCurrency$default(getBonusCurrency(), getAmountWithoutBonus(), false, false, null, 0, null, null, false, false, false, false, 2046, null)));
        }

        public final CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded.DataRow getBonusRow() {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C40095R.string.crypto_trade_bonus_bottom_sheet_review_order_bonus_percentage;
            NumberFormatter percentFormat = FormatsLocalized.getPercentFormat();
            UiCryptoTradeBonusEligibility.TradeBonus tradeBonus = getTradeBonus();
            return new CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded.DataRow(companion.invoke(i, percentFormat.format(BigDecimals7.orZero(tradeBonus != null ? tradeBonus.getBonusRatio() : null))), companion.invoke(CurrencyDefinitions.formatCurrency$default(getBonusCurrency(), getBonusAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null)));
        }

        public final CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded.DataRow getAmountWithBonusRow() {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded.DataRow(companion.invoke(C40095R.string.crypto_trade_bonus_bottom_sheet_review_order_total, new Object[0]), companion.invoke(CurrencyDefinitions.formatCurrency$default(getBonusCurrency(), BigDecimals7.safeAdd(getAmountWithoutBonus(), getBonusAmount()), false, false, null, 0, null, null, false, false, false, false, 2046, null)));
        }
    }
}
