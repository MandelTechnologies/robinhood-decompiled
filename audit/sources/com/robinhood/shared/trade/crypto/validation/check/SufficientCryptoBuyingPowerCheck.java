package com.robinhood.shared.trade.crypto.validation.check;

import android.os.Bundle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SufficientCryptoBuyingPowerCheck.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoBuyingPowerCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationCheck;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "check", "Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoBuyingPowerCheck$Failure;", "input", "Failure", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SufficientCryptoBuyingPowerCheck implements Validator.Check<CryptoOrderContext, CryptoOrderValidator3> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;

    public SufficientCryptoBuyingPowerCheck(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(CryptoOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getRequest().getSide() == OrderSide.BUY && input.getAccountContext().getCryptoBuyingPower() != null && input.getOrderInfo().getUncollaredTotalCost().setScale(input.getRequestContext().getCurrencyPair().getQuoteCurrency().getDecimalScale(), RoundingMode.UP).compareTo(input.getAccountContext().getCryptoBuyingPower().getBuyingPower().getDecimalValue()) > 0) {
            return new Failure(this.eventLogger, input.getEventScreen(), input.getLoggingCryptoOrderContext());
        }
        return null;
    }

    /* compiled from: SufficientCryptoBuyingPowerCheck.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÂ\u0003J'\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u000bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/SufficientCryptoBuyingPowerCheck$Failure;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;)V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "getTitle", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getMessage", "getPositiveAction", "getNegativeAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure extends CryptoOrderValidator2 {
        public static final int $stable = 8;
        private final String checkIdentifier;
        private final EventLogger eventLogger;
        private final Screen eventScreen;
        private final com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext;

        /* renamed from: component1, reason: from getter */
        private final EventLogger getEventLogger() {
            return this.eventLogger;
        }

        /* renamed from: component2, reason: from getter */
        private final Screen getEventScreen() {
            return this.eventScreen;
        }

        /* renamed from: component3, reason: from getter */
        private final com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
            return this.loggingCryptoOrderContext;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, EventLogger eventLogger, Screen screen, com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                eventLogger = failure.eventLogger;
            }
            if ((i & 2) != 0) {
                screen = failure.eventScreen;
            }
            if ((i & 4) != 0) {
                cryptoOrderContext = failure.loggingCryptoOrderContext;
            }
            return failure.copy(eventLogger, screen, cryptoOrderContext);
        }

        public final Failure copy(EventLogger eventLogger, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
            return new Failure(eventLogger, eventScreen, loggingCryptoOrderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.eventLogger, failure.eventLogger) && Intrinsics.areEqual(this.eventScreen, failure.eventScreen) && Intrinsics.areEqual(this.loggingCryptoOrderContext, failure.loggingCryptoOrderContext);
        }

        public int hashCode() {
            return (((this.eventLogger.hashCode() * 31) + this.eventScreen.hashCode()) * 31) + this.loggingCryptoOrderContext.hashCode();
        }

        public String toString() {
            return "Failure(eventLogger=" + this.eventLogger + ", eventScreen=" + this.eventScreen + ", loggingCryptoOrderContext=" + this.loggingCryptoOrderContext + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(EventLogger eventLogger, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
            super(eventLogger);
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
            this.eventLogger = eventLogger;
            this.eventScreen = eventScreen;
            this.loggingCryptoOrderContext = loggingCryptoOrderContext;
            this.checkIdentifier = "crypto_sufficient_buying_power_check";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getTitle(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_check_buying_power_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public String getMessage(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C20649R.string.order_create_error_buy_description);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public String getPositiveAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C11048R.string.general_action_deposit_funds);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public String getNegativeAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C11048R.string.general_label_dismiss);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, this.eventScreen, new Component(Component.ComponentType.BUTTON, getCheckIdentifier() + "_deposit_funds", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.loggingCryptoOrderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
            resolver.initiateDeposit();
            return Validator.Action.Abort.INSTANCE;
        }
    }
}
