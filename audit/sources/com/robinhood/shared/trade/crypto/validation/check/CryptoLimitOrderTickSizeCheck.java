package com.robinhood.shared.trade.crypto.validation.check;

import android.os.Bundle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLimitOrderTickSizeCheck.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderTickSizeCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationCheck;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "check", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderTickSizeCheck$Failure;", "input", "Failure", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoLimitOrderTickSizeCheck implements Validator.Check<CryptoOrderContext, CryptoOrderValidator3> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;

    public CryptoLimitOrderTickSizeCheck(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(CryptoOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getRequestContext().getRequestInputs().getOrderPrices().getOrderType() != CryptoOrderType.LIMIT) {
            return null;
        }
        UiCurrencyPair currencyPair = input.getRequestContext().getCurrencyPair();
        CryptoOrderPrices orderPrices = input.getRequestContext().getRequestInputs().getOrderPrices();
        CryptoOrderPrices.Limit limit = orderPrices instanceof CryptoOrderPrices.Limit ? (CryptoOrderPrices.Limit) orderPrices : null;
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero(limit != null ? limit.getLimitPrice() : null);
        if (currencyPair.isRoundedToTickSize(bigDecimalOrZero)) {
            return null;
        }
        return new Failure(currencyPair.roundToTickSize(bigDecimalOrZero, input.getRequestContext().getRequestInputs().getSide()), currencyPair, this.eventLogger);
    }

    /* compiled from: CryptoLimitOrderTickSizeCheck.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÂ\u0003J'\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderTickSizeCheck$Failure;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "roundedPrice", "Ljava/math/BigDecimal;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/analytics/EventLogger;)V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "getTitle", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getMessage", "getPositiveAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure extends CryptoOrderValidator2 {
        public static final int $stable = 8;
        private final String checkIdentifier;
        private final UiCurrencyPair currencyPair;
        private final EventLogger eventLogger;
        private final BigDecimal roundedPrice;

        /* renamed from: component1, reason: from getter */
        private final BigDecimal getRoundedPrice() {
            return this.roundedPrice;
        }

        /* renamed from: component2, reason: from getter */
        private final UiCurrencyPair getCurrencyPair() {
            return this.currencyPair;
        }

        /* renamed from: component3, reason: from getter */
        private final EventLogger getEventLogger() {
            return this.eventLogger;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BigDecimal bigDecimal, UiCurrencyPair uiCurrencyPair, EventLogger eventLogger, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = failure.roundedPrice;
            }
            if ((i & 2) != 0) {
                uiCurrencyPair = failure.currencyPair;
            }
            if ((i & 4) != 0) {
                eventLogger = failure.eventLogger;
            }
            return failure.copy(bigDecimal, uiCurrencyPair, eventLogger);
        }

        public final Failure copy(BigDecimal roundedPrice, UiCurrencyPair currencyPair, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(roundedPrice, "roundedPrice");
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new Failure(roundedPrice, currencyPair, eventLogger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.roundedPrice, failure.roundedPrice) && Intrinsics.areEqual(this.currencyPair, failure.currencyPair) && Intrinsics.areEqual(this.eventLogger, failure.eventLogger);
        }

        public int hashCode() {
            return (((this.roundedPrice.hashCode() * 31) + this.currencyPair.hashCode()) * 31) + this.eventLogger.hashCode();
        }

        public String toString() {
            return "Failure(roundedPrice=" + this.roundedPrice + ", currencyPair=" + this.currencyPair + ", eventLogger=" + this.eventLogger + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(BigDecimal roundedPrice, UiCurrencyPair currencyPair, EventLogger eventLogger) {
            super(eventLogger);
            Intrinsics.checkNotNullParameter(roundedPrice, "roundedPrice");
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            this.roundedPrice = roundedPrice;
            this.currencyPair = currencyPair;
            this.eventLogger = eventLogger;
            this.checkIdentifier = "crypto_limit_order_tick_size_check";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getTitle(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_create_tick_size_dialog_title, this.currencyPair.getAssetCurrency().getCode());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getMessage(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_create_tick_size_dialog_message, this.currencyPair.getAssetCurrency().getCode(), CurrencyDefinitions.formatCurrency$default(this.currencyPair.getQuoteCurrency(), this.currencyPair.getMinOrderPriceIncrement(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getPositiveAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C20649R.string.order_create_tick_size_dialog_round_price, CurrencyDefinitions.formatCurrency$default(this.currencyPair.getQuoteCurrency(), this.roundedPrice, false, false, null, 0, null, null, false, false, false, false, 2046, null));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            resolver.setLimitPrice(this.roundedPrice);
            return Validator.Action.Abort.INSTANCE;
        }
    }
}
