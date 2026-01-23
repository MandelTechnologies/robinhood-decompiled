package com.robinhood.shared.trade.crypto.validation.check;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLimitPriceOrderCheck.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0002\f\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitPriceOrderCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationCheck;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "check", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitPriceOrderCheck$Failure;", "input", "Failure", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoLimitPriceOrderCheck implements Validator.Check<CryptoOrderContext, CryptoOrderValidator3> {
    private final EventLogger eventLogger;
    public static final int $stable = 8;
    private static final BigDecimal FRACTION_LOWER_BOUND = new BigDecimal("0.10");

    public CryptoLimitPriceOrderCheck(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(CryptoOrderContext input) {
        BigDecimal limitPrice;
        Intrinsics.checkNotNullParameter(input, "input");
        RequestInputs requestInputs = input.getRequestContext().getRequestInputs();
        if (requestInputs.getSide() != OrderSide.BUY || requestInputs.getOrderPrices().getOrderType() != CryptoOrderType.LIMIT) {
            return null;
        }
        CryptoOrderPrices orderPrices = requestInputs.getOrderPrices();
        CryptoOrderPrices.Limit limit = orderPrices instanceof CryptoOrderPrices.Limit ? (CryptoOrderPrices.Limit) orderPrices : null;
        if (limit != null && (limitPrice = limit.getLimitPrice()) != null) {
            Money markPrice = input.getRequestContext().getQuote().getMarkPrice();
            String name = input.getRequestContext().getCurrencyPair().getAssetCurrency().getName();
            BigDecimal bigDecimalMultiply = FRACTION_LOWER_BOUND.multiply(Money3.getBigDecimalCompat(markPrice));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            if (limitPrice.compareTo(bigDecimalMultiply) < 0) {
                return new Failure(name, this.eventLogger);
            }
        }
        return null;
    }

    /* compiled from: CryptoLimitPriceOrderCheck.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitPriceOrderCheck$Failure;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "currencyName", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljava/lang/String;Lcom/robinhood/analytics/EventLogger;)V", "getCurrencyName", "()Ljava/lang/String;", "checkIdentifier", "getCheckIdentifier", "getTitle", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getMessage", "getPositiveAction", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure extends CryptoOrderValidator2 {
        public static final int $stable = 8;
        private final String checkIdentifier;
        private final String currencyName;

        public final String getCurrencyName() {
            return this.currencyName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String currencyName, EventLogger eventLogger) {
            super(eventLogger);
            Intrinsics.checkNotNullParameter(currencyName, "currencyName");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            this.currencyName = currencyName;
            this.checkIdentifier = "crypto_limit_price_order_check";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getTitle(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_check_limit_price_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getMessage(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_check_limit_price_message, this.currencyName);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getPositiveAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C11048R.string.general_label_dismiss);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
    }
}
