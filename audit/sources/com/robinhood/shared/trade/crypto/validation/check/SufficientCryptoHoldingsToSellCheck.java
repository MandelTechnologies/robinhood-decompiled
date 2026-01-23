package com.robinhood.shared.trade.crypto.validation.check;

import android.os.Bundle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SufficientCryptoHoldingsToSellCheck.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\u000eB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationCheck;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "isValidatingInTaxLotSelection", "", "<init>", "(Lcom/robinhood/analytics/EventLogger;Z)V", "check", "Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure;", "input", "Failure", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SufficientCryptoHoldingsToSellCheck implements Validator.Check<CryptoOrderContext, CryptoOrderValidator3> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;
    private final boolean isValidatingInTaxLotSelection;

    public SufficientCryptoHoldingsToSellCheck(EventLogger eventLogger, boolean z) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
        this.isValidatingInTaxLotSelection = z;
    }

    public /* synthetic */ SufficientCryptoHoldingsToSellCheck(EventLogger eventLogger, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventLogger, (i & 2) != 0 ? false : z);
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(CryptoOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getRequest().getSide() != OrderSide.SELL) {
            return null;
        }
        UiCryptoHolding holding = input.getRequestContext().getHolding();
        BigDecimal orderQuantity = input.getRequest().getOrderQuantity();
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero(holding != null ? holding.getQuantityAvailable() : null);
        if (orderQuantity.compareTo(bigDecimalOrZero) <= 0) {
            return null;
        }
        Currency assetCurrency = input.getRequestContext().getCurrencyPair().getAssetCurrency();
        Currency quoteCurrency = input.getRequestContext().getCurrencyPair().getQuoteCurrency();
        BigDecimal bigDecimalSafeAdd = BigDecimals7.safeAdd(holding != null ? holding.getQuantityHeldForBuy() : null, holding != null ? holding.getQuantityHeldForSell() : null);
        boolean zIsPositive = BigDecimals7.isPositive(bigDecimalSafeAdd);
        BigDecimal bigDecimalCompat = Money3.getBigDecimalCompat(input.getRequestContext().getQuote().getBidPrice());
        BigDecimal bigDecimalMultiply = bigDecimalOrZero.multiply(bigDecimalCompat);
        BigDecimal bigDecimalMultiply2 = bigDecimalSafeAdd.multiply(bigDecimalCompat);
        RequestInputs requestInputs = input.getRequestContext().getRequestInputs();
        if (requestInputs instanceof RequestInputs.AsAsset) {
            if (zIsPositive && this.isValidatingInTaxLotSelection) {
                return new Failure.TaxLotsWithPendingOrder(assetCurrency, assetCurrency, bigDecimalSafeAdd, bigDecimalOrZero, input.getEventScreen(), input.getLoggingCryptoOrderContext(), this.eventLogger);
            }
            if (zIsPositive) {
                return new Failure.WithPendingOrders(assetCurrency, assetCurrency, bigDecimalSafeAdd, bigDecimalOrZero, input.getEventScreen(), input.getLoggingCryptoOrderContext(), this.eventLogger);
            }
            if (!zIsPositive && this.isValidatingInTaxLotSelection) {
                return new Failure.TaxLots(assetCurrency, assetCurrency, bigDecimalOrZero, input.getEventScreen(), input.getLoggingCryptoOrderContext(), this.eventLogger);
            }
            return new Failure.NoPendingOrders(assetCurrency, assetCurrency, bigDecimalOrZero, input.getEventScreen(), input.getLoggingCryptoOrderContext(), this.eventLogger);
        }
        if (!(requestInputs instanceof RequestInputs.AsQuote)) {
            throw new NoWhenBranchMatchedException();
        }
        if (zIsPositive) {
            Intrinsics.checkNotNull(bigDecimalMultiply);
            Intrinsics.checkNotNull(bigDecimalMultiply2);
            return new Failure.WithPendingOrders(assetCurrency, quoteCurrency, bigDecimalMultiply2, bigDecimalMultiply, input.getEventScreen(), input.getLoggingCryptoOrderContext(), this.eventLogger);
        }
        Intrinsics.checkNotNull(bigDecimalMultiply);
        return new Failure.NoPendingOrders(assetCurrency, quoteCurrency, bigDecimalMultiply, input.getEventScreen(), input.getLoggingCryptoOrderContext(), this.eventLogger);
    }

    /* compiled from: SufficientCryptoHoldingsToSellCheck.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004)*+,B1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0001\u0004-./0¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "asset", "Lcom/robinhood/models/crypto/db/Currency;", "sellableAmount", "Ljava/math/BigDecimal;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;Lcom/robinhood/analytics/EventLogger;)V", "getAsset", "()Lcom/robinhood/models/crypto/db/Currency;", "getSellableAmount", "()Ljava/math/BigDecimal;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingCryptoOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "getTitle", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getPositiveAction", "getNegativeAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "NoPendingOrders", "WithPendingOrders", "TaxLots", "TaxLotsWithPendingOrder", "Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure$NoPendingOrders;", "Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure$TaxLots;", "Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure$TaxLotsWithPendingOrder;", "Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure$WithPendingOrders;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Failure extends CryptoOrderValidator2 {
        public static final int $stable = 8;
        private final Currency asset;
        private final String checkIdentifier;
        private final EventLogger eventLogger;
        private final Screen eventScreen;
        private final com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext;
        private final BigDecimal sellableAmount;

        public /* synthetic */ Failure(Currency currency, BigDecimal bigDecimal, Screen screen, com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext, EventLogger eventLogger, DefaultConstructorMarker defaultConstructorMarker) {
            this(currency, bigDecimal, screen, cryptoOrderContext, eventLogger);
        }

        public Currency getAsset() {
            return this.asset;
        }

        public BigDecimal getSellableAmount() {
            return this.sellableAmount;
        }

        public Screen getEventScreen() {
            return this.eventScreen;
        }

        public com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
            return this.loggingCryptoOrderContext;
        }

        public EventLogger getEventLogger() {
            return this.eventLogger;
        }

        private Failure(Currency currency, BigDecimal bigDecimal, Screen screen, com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext, EventLogger eventLogger) {
            super(eventLogger);
            this.asset = currency;
            this.sellableAmount = bigDecimal;
            this.eventScreen = screen;
            this.loggingCryptoOrderContext = cryptoOrderContext;
            this.eventLogger = eventLogger;
            this.checkIdentifier = "crypto_sufficient_holding_to_sell_check";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public final String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getTitle(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_check_holding_title, getAsset().getCode());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        /* compiled from: SufficientCryptoHoldingsToSellCheck.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure$NoPendingOrders;", "Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure;", "asset", "Lcom/robinhood/models/crypto/db/Currency;", "enterCurrency", "sellableAmount", "Ljava/math/BigDecimal;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;Lcom/robinhood/analytics/EventLogger;)V", "getEnterCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getMessage", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NoPendingOrders extends Failure {
            public static final int $stable = 8;
            private final Currency enterCurrency;

            public final Currency getEnterCurrency() {
                return this.enterCurrency;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoPendingOrders(Currency asset, Currency enterCurrency, BigDecimal sellableAmount, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext, EventLogger eventLogger) {
                super(asset, sellableAmount, eventScreen, loggingCryptoOrderContext, eventLogger, null);
                Intrinsics.checkNotNullParameter(asset, "asset");
                Intrinsics.checkNotNullParameter(enterCurrency, "enterCurrency");
                Intrinsics.checkNotNullParameter(sellableAmount, "sellableAmount");
                Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
                Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.enterCurrency = enterCurrency;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public String getMessage(BaseActivity activity) {
                String string2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (this.enterCurrency.isFiatCurrency()) {
                    string2 = activity.getString(C40095R.string.crypto_order_check_holding_message_quote, CurrencyDefinitions.formatCurrency$default(this.enterCurrency, getSellableAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null), getAsset().getCode());
                } else {
                    string2 = activity.getString(C40095R.string.crypto_order_check_holding_message_asset, CurrencyDefinitions.formatCurrency$default(this.enterCurrency, getSellableAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
                }
                Intrinsics.checkNotNull(string2);
                return string2;
            }
        }

        /* compiled from: SufficientCryptoHoldingsToSellCheck.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure$WithPendingOrders;", "Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure;", "asset", "Lcom/robinhood/models/crypto/db/Currency;", "enterCurrency", "pendingAmount", "Ljava/math/BigDecimal;", "sellableAmount", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;Lcom/robinhood/analytics/EventLogger;)V", "getEnterCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getPendingAmount", "()Ljava/math/BigDecimal;", "getMessage", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class WithPendingOrders extends Failure {
            public static final int $stable = 8;
            private final Currency enterCurrency;
            private final BigDecimal pendingAmount;

            public final Currency getEnterCurrency() {
                return this.enterCurrency;
            }

            public final BigDecimal getPendingAmount() {
                return this.pendingAmount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithPendingOrders(Currency asset, Currency enterCurrency, BigDecimal pendingAmount, BigDecimal sellableAmount, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext, EventLogger eventLogger) {
                super(asset, sellableAmount, eventScreen, loggingCryptoOrderContext, eventLogger, null);
                Intrinsics.checkNotNullParameter(asset, "asset");
                Intrinsics.checkNotNullParameter(enterCurrency, "enterCurrency");
                Intrinsics.checkNotNullParameter(pendingAmount, "pendingAmount");
                Intrinsics.checkNotNullParameter(sellableAmount, "sellableAmount");
                Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
                Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.enterCurrency = enterCurrency;
                this.pendingAmount = pendingAmount;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public String getMessage(BaseActivity activity) {
                String string2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (this.enterCurrency.isFiatCurrency()) {
                    string2 = activity.getString(C40095R.string.crypto_order_check_holding_message_with_pending_quote, CurrencyDefinitions.formatCurrency$default(this.enterCurrency, getSellableAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null), getAsset().getCode(), CurrencyDefinitions.formatCurrency$default(this.enterCurrency, this.pendingAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                } else {
                    string2 = activity.getString(C40095R.string.crypto_order_check_holding_message_with_pending_asset, CurrencyDefinitions.formatCurrency$default(this.enterCurrency, getSellableAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null), getAsset().getCode(), CurrencyDefinitions.formatCurrency$default(this.enterCurrency, this.pendingAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                }
                Intrinsics.checkNotNull(string2);
                return string2;
            }
        }

        /* compiled from: SufficientCryptoHoldingsToSellCheck.kt */
        @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003JE\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00066"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure$TaxLots;", "Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure;", "asset", "Lcom/robinhood/models/crypto/db/Currency;", "enterCurrency", "sellableAmount", "Ljava/math/BigDecimal;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;Lcom/robinhood/analytics/EventLogger;)V", "getAsset", "()Lcom/robinhood/models/crypto/db/Currency;", "getEnterCurrency", "getSellableAmount", "()Ljava/math/BigDecimal;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingCryptoOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "getMessage", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getPositiveAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "getNegativeAction", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLots extends Failure {
            public static final int $stable = 8;
            private final Currency asset;
            private final Currency enterCurrency;
            private final EventLogger eventLogger;
            private final Screen eventScreen;
            private final com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext;
            private final BigDecimal sellableAmount;

            public static /* synthetic */ TaxLots copy$default(TaxLots taxLots, Currency currency, Currency currency2, BigDecimal bigDecimal, Screen screen, com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext, EventLogger eventLogger, int i, Object obj) {
                if ((i & 1) != 0) {
                    currency = taxLots.asset;
                }
                if ((i & 2) != 0) {
                    currency2 = taxLots.enterCurrency;
                }
                if ((i & 4) != 0) {
                    bigDecimal = taxLots.sellableAmount;
                }
                if ((i & 8) != 0) {
                    screen = taxLots.eventScreen;
                }
                if ((i & 16) != 0) {
                    cryptoOrderContext = taxLots.loggingCryptoOrderContext;
                }
                if ((i & 32) != 0) {
                    eventLogger = taxLots.eventLogger;
                }
                com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext2 = cryptoOrderContext;
                EventLogger eventLogger2 = eventLogger;
                return taxLots.copy(currency, currency2, bigDecimal, screen, cryptoOrderContext2, eventLogger2);
            }

            /* renamed from: component1, reason: from getter */
            public final Currency getAsset() {
                return this.asset;
            }

            /* renamed from: component2, reason: from getter */
            public final Currency getEnterCurrency() {
                return this.enterCurrency;
            }

            /* renamed from: component3, reason: from getter */
            public final BigDecimal getSellableAmount() {
                return this.sellableAmount;
            }

            /* renamed from: component4, reason: from getter */
            public final Screen getEventScreen() {
                return this.eventScreen;
            }

            /* renamed from: component5, reason: from getter */
            public final com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
                return this.loggingCryptoOrderContext;
            }

            /* renamed from: component6, reason: from getter */
            public final EventLogger getEventLogger() {
                return this.eventLogger;
            }

            public final TaxLots copy(Currency asset, Currency enterCurrency, BigDecimal sellableAmount, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext, EventLogger eventLogger) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                Intrinsics.checkNotNullParameter(enterCurrency, "enterCurrency");
                Intrinsics.checkNotNullParameter(sellableAmount, "sellableAmount");
                Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
                Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                return new TaxLots(asset, enterCurrency, sellableAmount, eventScreen, loggingCryptoOrderContext, eventLogger);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TaxLots)) {
                    return false;
                }
                TaxLots taxLots = (TaxLots) other;
                return Intrinsics.areEqual(this.asset, taxLots.asset) && Intrinsics.areEqual(this.enterCurrency, taxLots.enterCurrency) && Intrinsics.areEqual(this.sellableAmount, taxLots.sellableAmount) && Intrinsics.areEqual(this.eventScreen, taxLots.eventScreen) && Intrinsics.areEqual(this.loggingCryptoOrderContext, taxLots.loggingCryptoOrderContext) && Intrinsics.areEqual(this.eventLogger, taxLots.eventLogger);
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getNegativeAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return null;
            }

            public int hashCode() {
                return (((((((((this.asset.hashCode() * 31) + this.enterCurrency.hashCode()) * 31) + this.sellableAmount.hashCode()) * 31) + this.eventScreen.hashCode()) * 31) + this.loggingCryptoOrderContext.hashCode()) * 31) + this.eventLogger.hashCode();
            }

            public String toString() {
                return "TaxLots(asset=" + this.asset + ", enterCurrency=" + this.enterCurrency + ", sellableAmount=" + this.sellableAmount + ", eventScreen=" + this.eventScreen + ", loggingCryptoOrderContext=" + this.loggingCryptoOrderContext + ", eventLogger=" + this.eventLogger + ")";
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure
            public Currency getAsset() {
                return this.asset;
            }

            public final Currency getEnterCurrency() {
                return this.enterCurrency;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure
            public BigDecimal getSellableAmount() {
                return this.sellableAmount;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure
            public Screen getEventScreen() {
                return this.eventScreen;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure
            public com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
                return this.loggingCryptoOrderContext;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure
            public EventLogger getEventLogger() {
                return this.eventLogger;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxLots(Currency asset, Currency enterCurrency, BigDecimal sellableAmount, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext, EventLogger eventLogger) {
                super(asset, sellableAmount, eventScreen, loggingCryptoOrderContext, eventLogger, null);
                Intrinsics.checkNotNullParameter(asset, "asset");
                Intrinsics.checkNotNullParameter(enterCurrency, "enterCurrency");
                Intrinsics.checkNotNullParameter(sellableAmount, "sellableAmount");
                Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
                Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.asset = asset;
                this.enterCurrency = enterCurrency;
                this.sellableAmount = sellableAmount;
                this.eventScreen = eventScreen;
                this.loggingCryptoOrderContext = loggingCryptoOrderContext;
                this.eventLogger = eventLogger;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C40095R.string.crypto_order_check_holding_message_asset, CurrencyDefinitions.formatCurrency$default(this.enterCurrency, getSellableAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getPositiveAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C40095R.string.crypto_tax_lot_selection_validation_failure_edit_order_cta);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
            public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                return Validator.Action.Abort.INSTANCE;
            }
        }

        /* compiled from: SufficientCryptoHoldingsToSellCheck.kt */
        @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003JO\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00069"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure$TaxLotsWithPendingOrder;", "Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoHoldingsToSellCheck$Failure;", "asset", "Lcom/robinhood/models/crypto/db/Currency;", "enterCurrency", "pendingAmount", "Ljava/math/BigDecimal;", "sellableAmount", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;Lcom/robinhood/analytics/EventLogger;)V", "getAsset", "()Lcom/robinhood/models/crypto/db/Currency;", "getEnterCurrency", "getPendingAmount", "()Ljava/math/BigDecimal;", "getSellableAmount", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingCryptoOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "getMessage", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getPositiveAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "getNegativeAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLotsWithPendingOrder extends Failure {
            public static final int $stable = 8;
            private final Currency asset;
            private final Currency enterCurrency;
            private final EventLogger eventLogger;
            private final Screen eventScreen;
            private final com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext;
            private final BigDecimal pendingAmount;
            private final BigDecimal sellableAmount;

            public static /* synthetic */ TaxLotsWithPendingOrder copy$default(TaxLotsWithPendingOrder taxLotsWithPendingOrder, Currency currency, Currency currency2, BigDecimal bigDecimal, BigDecimal bigDecimal2, Screen screen, com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext, EventLogger eventLogger, int i, Object obj) {
                if ((i & 1) != 0) {
                    currency = taxLotsWithPendingOrder.asset;
                }
                if ((i & 2) != 0) {
                    currency2 = taxLotsWithPendingOrder.enterCurrency;
                }
                if ((i & 4) != 0) {
                    bigDecimal = taxLotsWithPendingOrder.pendingAmount;
                }
                if ((i & 8) != 0) {
                    bigDecimal2 = taxLotsWithPendingOrder.sellableAmount;
                }
                if ((i & 16) != 0) {
                    screen = taxLotsWithPendingOrder.eventScreen;
                }
                if ((i & 32) != 0) {
                    cryptoOrderContext = taxLotsWithPendingOrder.loggingCryptoOrderContext;
                }
                if ((i & 64) != 0) {
                    eventLogger = taxLotsWithPendingOrder.eventLogger;
                }
                com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext2 = cryptoOrderContext;
                EventLogger eventLogger2 = eventLogger;
                Screen screen2 = screen;
                BigDecimal bigDecimal3 = bigDecimal;
                return taxLotsWithPendingOrder.copy(currency, currency2, bigDecimal3, bigDecimal2, screen2, cryptoOrderContext2, eventLogger2);
            }

            /* renamed from: component1, reason: from getter */
            public final Currency getAsset() {
                return this.asset;
            }

            /* renamed from: component2, reason: from getter */
            public final Currency getEnterCurrency() {
                return this.enterCurrency;
            }

            /* renamed from: component3, reason: from getter */
            public final BigDecimal getPendingAmount() {
                return this.pendingAmount;
            }

            /* renamed from: component4, reason: from getter */
            public final BigDecimal getSellableAmount() {
                return this.sellableAmount;
            }

            /* renamed from: component5, reason: from getter */
            public final Screen getEventScreen() {
                return this.eventScreen;
            }

            /* renamed from: component6, reason: from getter */
            public final com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
                return this.loggingCryptoOrderContext;
            }

            /* renamed from: component7, reason: from getter */
            public final EventLogger getEventLogger() {
                return this.eventLogger;
            }

            public final TaxLotsWithPendingOrder copy(Currency asset, Currency enterCurrency, BigDecimal pendingAmount, BigDecimal sellableAmount, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext, EventLogger eventLogger) {
                Intrinsics.checkNotNullParameter(asset, "asset");
                Intrinsics.checkNotNullParameter(enterCurrency, "enterCurrency");
                Intrinsics.checkNotNullParameter(pendingAmount, "pendingAmount");
                Intrinsics.checkNotNullParameter(sellableAmount, "sellableAmount");
                Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
                Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                return new TaxLotsWithPendingOrder(asset, enterCurrency, pendingAmount, sellableAmount, eventScreen, loggingCryptoOrderContext, eventLogger);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TaxLotsWithPendingOrder)) {
                    return false;
                }
                TaxLotsWithPendingOrder taxLotsWithPendingOrder = (TaxLotsWithPendingOrder) other;
                return Intrinsics.areEqual(this.asset, taxLotsWithPendingOrder.asset) && Intrinsics.areEqual(this.enterCurrency, taxLotsWithPendingOrder.enterCurrency) && Intrinsics.areEqual(this.pendingAmount, taxLotsWithPendingOrder.pendingAmount) && Intrinsics.areEqual(this.sellableAmount, taxLotsWithPendingOrder.sellableAmount) && Intrinsics.areEqual(this.eventScreen, taxLotsWithPendingOrder.eventScreen) && Intrinsics.areEqual(this.loggingCryptoOrderContext, taxLotsWithPendingOrder.loggingCryptoOrderContext) && Intrinsics.areEqual(this.eventLogger, taxLotsWithPendingOrder.eventLogger);
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getNegativeAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return null;
            }

            public int hashCode() {
                return (((((((((((this.asset.hashCode() * 31) + this.enterCurrency.hashCode()) * 31) + this.pendingAmount.hashCode()) * 31) + this.sellableAmount.hashCode()) * 31) + this.eventScreen.hashCode()) * 31) + this.loggingCryptoOrderContext.hashCode()) * 31) + this.eventLogger.hashCode();
            }

            public String toString() {
                return "TaxLotsWithPendingOrder(asset=" + this.asset + ", enterCurrency=" + this.enterCurrency + ", pendingAmount=" + this.pendingAmount + ", sellableAmount=" + this.sellableAmount + ", eventScreen=" + this.eventScreen + ", loggingCryptoOrderContext=" + this.loggingCryptoOrderContext + ", eventLogger=" + this.eventLogger + ")";
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure
            public Currency getAsset() {
                return this.asset;
            }

            public final Currency getEnterCurrency() {
                return this.enterCurrency;
            }

            public final BigDecimal getPendingAmount() {
                return this.pendingAmount;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure
            public BigDecimal getSellableAmount() {
                return this.sellableAmount;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure
            public Screen getEventScreen() {
                return this.eventScreen;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure
            public com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
                return this.loggingCryptoOrderContext;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure
            public EventLogger getEventLogger() {
                return this.eventLogger;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxLotsWithPendingOrder(Currency asset, Currency enterCurrency, BigDecimal pendingAmount, BigDecimal sellableAmount, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext, EventLogger eventLogger) {
                super(asset, sellableAmount, eventScreen, loggingCryptoOrderContext, eventLogger, null);
                Intrinsics.checkNotNullParameter(asset, "asset");
                Intrinsics.checkNotNullParameter(enterCurrency, "enterCurrency");
                Intrinsics.checkNotNullParameter(pendingAmount, "pendingAmount");
                Intrinsics.checkNotNullParameter(sellableAmount, "sellableAmount");
                Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
                Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.asset = asset;
                this.enterCurrency = enterCurrency;
                this.pendingAmount = pendingAmount;
                this.sellableAmount = sellableAmount;
                this.eventScreen = eventScreen;
                this.loggingCryptoOrderContext = loggingCryptoOrderContext;
                this.eventLogger = eventLogger;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C40095R.string.crypto_order_check_holding_message_with_pending_asset, CurrencyDefinitions.formatCurrency$default(this.enterCurrency, getSellableAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null), getAsset().getCode(), CurrencyDefinitions.formatCurrency$default(this.enterCurrency, this.pendingAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getPositiveAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C40095R.string.crypto_tax_lot_selection_validation_failure_edit_order_cta);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.SufficientCryptoHoldingsToSellCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
            public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                return Validator.Action.Abort.INSTANCE;
            }
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getPositiveAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (BigDecimals7.isZero(getSellableAmount())) {
                String string2 = activity.getString(C11048R.string.general_label_dismiss);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            String string3 = activity.getString(C40095R.string.order_sell_all, getAsset().getCode());
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getNegativeAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (BigDecimals7.isZero(getSellableAmount())) {
                return null;
            }
            return activity.getString(C11048R.string.general_label_dismiss);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            if (!BigDecimals7.isZero(getSellableAmount())) {
                EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BUTTON, this.checkIdentifier + "_sell_all", null, 4, null), null, new Context(0, 0, 0, 0 == true ? 1 : 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
                resolver.convertToSellAll();
            }
            return Validator.Action.Abort.INSTANCE;
        }
    }
}
