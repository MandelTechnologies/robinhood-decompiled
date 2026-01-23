package com.robinhood.shared.trade.crypto.validation.check;

import android.os.Bundle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.OrderPriceValidation;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLimitOrderAggressivePriceCheck.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderAggressivePriceCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationCheck;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "check", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderAggressivePriceCheck$Failure;", "input", "Failure", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoLimitOrderAggressivePriceCheck implements Validator.Check<CryptoOrderContext, CryptoOrderValidator3> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;

    /* compiled from: CryptoLimitOrderAggressivePriceCheck.kt */
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

    public CryptoLimitOrderAggressivePriceCheck(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(CryptoOrderContext input) {
        BigDecimal bigDecimalCompat;
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getRequestContext().getRequestInputs().getOrderPrices().getOrderType() != CryptoOrderType.LIMIT) {
            return null;
        }
        OrderSide side = input.getRequestContext().getRequestInputs().getSide();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[side.ordinal()];
        if (i == 1) {
            bigDecimalCompat = Money3.getBigDecimalCompat(input.getRequestContext().getQuote().getAskPrice());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimalCompat = Money3.getBigDecimalCompat(input.getRequestContext().getQuote().getBidPrice());
        }
        CryptoOrderPrices orderPrices = input.getRequestContext().getRequestInputs().getOrderPrices();
        CryptoOrderPrices.Limit limit = orderPrices instanceof CryptoOrderPrices.Limit ? (CryptoOrderPrices.Limit) orderPrices : null;
        BigDecimal aggressiveLimitPricePercent = OrderPriceValidation.INSTANCE.getAggressiveLimitPricePercent(bigDecimalCompat, side == OrderSide.BUY, BigDecimals7.orZero(limit != null ? limit.getLimitPrice() : null));
        if (aggressiveLimitPricePercent == null) {
            return null;
        }
        int i2 = iArr[side.ordinal()];
        if (i2 == 1) {
            return new Failure.HighLimitPrice(aggressiveLimitPricePercent, this.eventLogger);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new Failure.LowLimitPrice(aggressiveLimitPricePercent, this.eventLogger);
    }

    /* compiled from: CryptoLimitOrderAggressivePriceCheck.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderAggressivePriceCheck$Failure;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "getPositiveAction", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "getNegativeAction", "onNegativeResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$Skip;", "LowLimitPrice", "HighLimitPrice", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderAggressivePriceCheck$Failure$HighLimitPrice;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderAggressivePriceCheck$Failure$LowLimitPrice;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Failure extends CryptoOrderValidator2 {
        public static final int $stable = 8;
        private final String checkIdentifier;

        public /* synthetic */ Failure(EventLogger eventLogger, DefaultConstructorMarker defaultConstructorMarker) {
            this(eventLogger);
        }

        private Failure(EventLogger eventLogger) {
            super(eventLogger);
            this.checkIdentifier = "crypto_limit_order_aggressive_price_check";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getPositiveAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C20649R.string.order_create_aggressive_limit_edit_action);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            resolver.requestFocusOnLimitPriceInput();
            return Validator.Action.Abort.INSTANCE;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getNegativeAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C11048R.string.general_label_continue);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action.Skip onNegativeResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Action.Skip.INSTANCE;
        }

        /* compiled from: CryptoLimitOrderAggressivePriceCheck.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderAggressivePriceCheck$Failure$LowLimitPrice;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderAggressivePriceCheck$Failure;", "aggressivePercent", "Ljava/math/BigDecimal;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;)V", "getTitle", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LowLimitPrice extends Failure {
            public static final int $stable = 8;
            private final BigDecimal aggressivePercent;
            private final EventLogger eventLogger;

            /* renamed from: component1, reason: from getter */
            private final BigDecimal getAggressivePercent() {
                return this.aggressivePercent;
            }

            /* renamed from: component2, reason: from getter */
            private final EventLogger getEventLogger() {
                return this.eventLogger;
            }

            public static /* synthetic */ LowLimitPrice copy$default(LowLimitPrice lowLimitPrice, BigDecimal bigDecimal, EventLogger eventLogger, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = lowLimitPrice.aggressivePercent;
                }
                if ((i & 2) != 0) {
                    eventLogger = lowLimitPrice.eventLogger;
                }
                return lowLimitPrice.copy(bigDecimal, eventLogger);
            }

            public final LowLimitPrice copy(BigDecimal aggressivePercent, EventLogger eventLogger) {
                Intrinsics.checkNotNullParameter(aggressivePercent, "aggressivePercent");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                return new LowLimitPrice(aggressivePercent, eventLogger);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LowLimitPrice)) {
                    return false;
                }
                LowLimitPrice lowLimitPrice = (LowLimitPrice) other;
                return Intrinsics.areEqual(this.aggressivePercent, lowLimitPrice.aggressivePercent) && Intrinsics.areEqual(this.eventLogger, lowLimitPrice.eventLogger);
            }

            public int hashCode() {
                return (this.aggressivePercent.hashCode() * 31) + this.eventLogger.hashCode();
            }

            public String toString() {
                return "LowLimitPrice(aggressivePercent=" + this.aggressivePercent + ", eventLogger=" + this.eventLogger + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LowLimitPrice(BigDecimal aggressivePercent, EventLogger eventLogger) {
                super(eventLogger, null);
                Intrinsics.checkNotNullParameter(aggressivePercent, "aggressivePercent");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.aggressivePercent = aggressivePercent;
                this.eventLogger = eventLogger;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getTitle(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C20649R.string.order_create_aggressive_limit_sell_dialog_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C40095R.string.crypto_order_check_aggressive_low_limit_price_message, FormatsLocalized.getPercentFormat().format(this.aggressivePercent));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }

        /* compiled from: CryptoLimitOrderAggressivePriceCheck.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderAggressivePriceCheck$Failure$HighLimitPrice;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoLimitOrderAggressivePriceCheck$Failure;", "aggressivePercent", "Ljava/math/BigDecimal;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;)V", "getTitle", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class HighLimitPrice extends Failure {
            public static final int $stable = 8;
            private final BigDecimal aggressivePercent;
            private final EventLogger eventLogger;

            /* renamed from: component1, reason: from getter */
            private final BigDecimal getAggressivePercent() {
                return this.aggressivePercent;
            }

            /* renamed from: component2, reason: from getter */
            private final EventLogger getEventLogger() {
                return this.eventLogger;
            }

            public static /* synthetic */ HighLimitPrice copy$default(HighLimitPrice highLimitPrice, BigDecimal bigDecimal, EventLogger eventLogger, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = highLimitPrice.aggressivePercent;
                }
                if ((i & 2) != 0) {
                    eventLogger = highLimitPrice.eventLogger;
                }
                return highLimitPrice.copy(bigDecimal, eventLogger);
            }

            public final HighLimitPrice copy(BigDecimal aggressivePercent, EventLogger eventLogger) {
                Intrinsics.checkNotNullParameter(aggressivePercent, "aggressivePercent");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                return new HighLimitPrice(aggressivePercent, eventLogger);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HighLimitPrice)) {
                    return false;
                }
                HighLimitPrice highLimitPrice = (HighLimitPrice) other;
                return Intrinsics.areEqual(this.aggressivePercent, highLimitPrice.aggressivePercent) && Intrinsics.areEqual(this.eventLogger, highLimitPrice.eventLogger);
            }

            public int hashCode() {
                return (this.aggressivePercent.hashCode() * 31) + this.eventLogger.hashCode();
            }

            public String toString() {
                return "HighLimitPrice(aggressivePercent=" + this.aggressivePercent + ", eventLogger=" + this.eventLogger + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HighLimitPrice(BigDecimal aggressivePercent, EventLogger eventLogger) {
                super(eventLogger, null);
                Intrinsics.checkNotNullParameter(aggressivePercent, "aggressivePercent");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.aggressivePercent = aggressivePercent;
                this.eventLogger = eventLogger;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getTitle(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C20649R.string.order_create_aggressive_limit_buy_dialog_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C20649R.string.order_create_aggressive_limit_buy_dialog_body, FormatsLocalized.getPercentFormat().format(this.aggressivePercent));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }
    }
}
