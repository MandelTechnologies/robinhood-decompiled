package com.robinhood.shared.trade.crypto.validation;

import android.os.Bundle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderValidatorManager.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001=B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010.\u001a\u00020/2\u0006\u0010(\u001a\u00020\u00192\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u000203J\u000e\u00104\u001a\u00020/2\u0006\u0010(\u001a\u00020\u0019J\u0010\u00105\u001a\u0002012\b\u00106\u001a\u0004\u0018\u000107J\u0010\u00108\u001a\u0002012\b\u00106\u001a\u0004\u0018\u000107J.\u00109\u001a\u00020/2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00190;2\u0016\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018j\u0002`\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R8\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R,\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010(\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006>"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager;", "", "eventLogger", "Lcom/robinhood/analytics/CryptoEventLogger;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "defaultCryptoOrderValidatorLazy", "Ldagger/Lazy;", "Lcom/robinhood/shared/trade/crypto/validation/DefaultCryptoOrderValidator;", "<init>", "(Lcom/robinhood/analytics/CryptoEventLogger;Lcom/robinhood/analytics/AnalyticsLogger;Ldagger/Lazy;)V", "validationFailureResolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "getValidationFailureResolver", "()Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "setValidationFailureResolver", "(Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;)V", "callback", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager$Callback;", "getCallback", "()Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager$Callback;", "setCallback", "(Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager$Callback;)V", "validationFailureQueue", "Lcom/robinhood/android/lib/trade/validation/Validator$FailureQueue;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderFailureQueue;", "getValidationFailureQueue$feature_trade_crypto_externalDebug$annotations", "()V", "getValidationFailureQueue$feature_trade_crypto_externalDebug", "()Lcom/robinhood/android/lib/trade/validation/Validator$FailureQueue;", "setValidationFailureQueue$feature_trade_crypto_externalDebug", "(Lcom/robinhood/android/lib/trade/validation/Validator$FailureQueue;)V", "retryWhen", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "getRetryWhen$feature_trade_crypto_externalDebug$annotations", "getRetryWhen$feature_trade_crypto_externalDebug", "()Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "setRetryWhen$feature_trade_crypto_externalDebug", "(Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;)V", "orderContext", "getOrderContext$feature_trade_crypto_externalDebug$annotations", "getOrderContext$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "setOrderContext$feature_trade_crypto_externalDebug", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;)V", "validateAndReviewOrder", "", "isNextScreenOrderReview", "", "cryptoOrderValidator", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidator;", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "onPositiveResponse", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeResponse", "handleFailureResolution", "action", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "failureQueue", "Callback", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderValidatorManager {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    public Callback callback;
    private final Lazy<CryptoOrderValidator5> defaultCryptoOrderValidatorLazy;
    private final CryptoEventLogger eventLogger;
    private CryptoOrderContext orderContext;
    private Validator.Action.RetryWhen<? super CryptoOrderContext> retryWhen;
    private Validator.FailureQueue<? super CryptoOrderContext, ? super CryptoOrderValidator3> validationFailureQueue;
    public CryptoOrderValidator3 validationFailureResolver;

    /* compiled from: CryptoOrderValidatorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager$Callback;", "", "onValidationSucceed", "", "orderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "onValidationFailure", "failure", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {
        void onValidationFailure(CryptoOrderValidator2 failure, CryptoOrderContext orderContext);

        void onValidationSucceed(CryptoOrderContext orderContext);
    }

    public static /* synthetic */ void getOrderContext$feature_trade_crypto_externalDebug$annotations() {
    }

    public static /* synthetic */ void getRetryWhen$feature_trade_crypto_externalDebug$annotations() {
    }

    /* renamed from: getValidationFailureQueue$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2936x972c035c() {
    }

    public CryptoOrderValidatorManager(CryptoEventLogger eventLogger, AnalyticsLogger analytics, Lazy<CryptoOrderValidator5> defaultCryptoOrderValidatorLazy) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(defaultCryptoOrderValidatorLazy, "defaultCryptoOrderValidatorLazy");
        this.eventLogger = eventLogger;
        this.analytics = analytics;
        this.defaultCryptoOrderValidatorLazy = defaultCryptoOrderValidatorLazy;
    }

    public final CryptoOrderValidator3 getValidationFailureResolver() {
        CryptoOrderValidator3 cryptoOrderValidator3 = this.validationFailureResolver;
        if (cryptoOrderValidator3 != null) {
            return cryptoOrderValidator3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("validationFailureResolver");
        return null;
    }

    public final void setValidationFailureResolver(CryptoOrderValidator3 cryptoOrderValidator3) {
        Intrinsics.checkNotNullParameter(cryptoOrderValidator3, "<set-?>");
        this.validationFailureResolver = cryptoOrderValidator3;
    }

    public final Callback getCallback() {
        Callback callback = this.callback;
        if (callback != null) {
            return callback;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callback");
        return null;
    }

    public final void setCallback(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "<set-?>");
        this.callback = callback;
    }

    public final Validator.FailureQueue<CryptoOrderContext, CryptoOrderValidator3> getValidationFailureQueue$feature_trade_crypto_externalDebug() {
        return this.validationFailureQueue;
    }

    public final void setValidationFailureQueue$feature_trade_crypto_externalDebug(Validator.FailureQueue<? super CryptoOrderContext, ? super CryptoOrderValidator3> failureQueue) {
        this.validationFailureQueue = failureQueue;
    }

    public final Validator.Action.RetryWhen<CryptoOrderContext> getRetryWhen$feature_trade_crypto_externalDebug() {
        return this.retryWhen;
    }

    public final void setRetryWhen$feature_trade_crypto_externalDebug(Validator.Action.RetryWhen<? super CryptoOrderContext> retryWhen) {
        this.retryWhen = retryWhen;
    }

    /* renamed from: getOrderContext$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoOrderContext getOrderContext() {
        return this.orderContext;
    }

    public final void setOrderContext$feature_trade_crypto_externalDebug(CryptoOrderContext cryptoOrderContext) {
        this.orderContext = cryptoOrderContext;
    }

    public static /* synthetic */ void validateAndReviewOrder$default(CryptoOrderValidatorManager cryptoOrderValidatorManager, CryptoOrderContext cryptoOrderContext, boolean z, CryptoOrderValidator cryptoOrderValidator, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            cryptoOrderValidator = cryptoOrderValidatorManager.defaultCryptoOrderValidatorLazy.get();
        }
        cryptoOrderValidatorManager.validateAndReviewOrder(cryptoOrderContext, z, cryptoOrderValidator);
    }

    public final void validateAndReviewOrder(CryptoOrderContext orderContext, boolean isNextScreenOrderReview, CryptoOrderValidator cryptoOrderValidator) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        Intrinsics.checkNotNullParameter(cryptoOrderValidator, "cryptoOrderValidator");
        this.orderContext = orderContext;
        this.retryWhen = null;
        if (isNextScreenOrderReview) {
            CryptoEventLogger.DefaultImpls.logCryptoOrderEvent$default(this.eventLogger, OrderFormStep.REVIEW, orderContext.getRequest().toApiRequest(), orderContext.getRequestContext().getRequestInputs().getMonetizationModel(), null, 8, null);
        }
        Validator.FailureQueue<? super CryptoOrderContext, ? super CryptoOrderValidator3> failureQueueValidate = this.validationFailureQueue;
        if (failureQueueValidate == null) {
            failureQueueValidate = cryptoOrderValidator.validate(orderContext);
        }
        Validator.Failure<? super CryptoOrderContext, ? super CryptoOrderValidator3> failurePeek = failureQueueValidate.peek();
        if (failurePeek == null) {
            this.validationFailureQueue = null;
            getCallback().onValidationSucceed(orderContext);
        } else if (failurePeek instanceof CryptoOrderValidator2) {
            this.validationFailureQueue = failureQueueValidate;
            CryptoOrderValidator2 cryptoOrderValidator2 = (CryptoOrderValidator2) failurePeek;
            getCallback().onValidationFailure(cryptoOrderValidator2, orderContext);
            this.analytics.logError(AnalyticsStrings.ERROR_ORDER_CHECK, cryptoOrderValidator2.getCheckIdentifier());
        }
    }

    public final void retry(CryptoOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        Validator.Action.RetryWhen<? super CryptoOrderContext> retryWhen = this.retryWhen;
        if (retryWhen == null || !retryWhen.matches(orderContext)) {
            return;
        }
        validateAndReviewOrder$default(this, orderContext, false, null, 6, null);
    }

    public final boolean onPositiveResponse(Bundle passthroughArgs) {
        Validator.FailureQueue<? super CryptoOrderContext, ? super CryptoOrderValidator3> failureQueue = this.validationFailureQueue;
        if (failureQueue == null) {
            return false;
        }
        Validator.Failure<? super CryptoOrderContext, ? super CryptoOrderValidator3> failurePeek = failureQueue.peek();
        Intrinsics.checkNotNull(failurePeek);
        handleFailureResolution(failurePeek.onPositiveResponse(getValidationFailureResolver(), passthroughArgs), failureQueue);
        return true;
    }

    public final boolean onNegativeResponse(Bundle passthroughArgs) {
        Validator.FailureQueue<? super CryptoOrderContext, ? super CryptoOrderValidator3> failureQueue = this.validationFailureQueue;
        if (failureQueue == null) {
            return false;
        }
        Validator.Failure<? super CryptoOrderContext, ? super CryptoOrderValidator3> failurePeek = failureQueue.peek();
        Intrinsics.checkNotNull(failurePeek);
        handleFailureResolution(failurePeek.onNegativeResponse(getValidationFailureResolver(), passthroughArgs), failureQueue);
        return true;
    }

    private final void handleFailureResolution(Validator.Action<? super CryptoOrderContext> action, Validator.FailureQueue<? super CryptoOrderContext, ? super CryptoOrderValidator3> failureQueue) {
        if (action instanceof Validator.Action.Abort) {
            this.validationFailureQueue = null;
            return;
        }
        if (action instanceof Validator.Action.Skip) {
            failureQueue.poll();
            CryptoOrderContext cryptoOrderContext = this.orderContext;
            Intrinsics.checkNotNull(cryptoOrderContext);
            validateAndReviewOrder$default(this, cryptoOrderContext, false, null, 6, null);
            return;
        }
        if (!(action instanceof Validator.Action.RetryWhen)) {
            throw new NoWhenBranchMatchedException();
        }
        this.validationFailureQueue = null;
        this.retryWhen = (Validator.Action.RetryWhen) action;
    }
}
