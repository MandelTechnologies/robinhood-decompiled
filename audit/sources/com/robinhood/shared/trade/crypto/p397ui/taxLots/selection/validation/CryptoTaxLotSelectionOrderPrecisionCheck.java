package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.validation;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotSelectionOrderPrecisionCheck.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/validation/CryptoTaxLotSelectionOrderPrecisionCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationCheck;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "check", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/validation/CryptoTaxLotSelectionOrderPrecisionCheck$Failure;", "input", "Failure", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTaxLotSelectionOrderPrecisionCheck implements Validator.Check<CryptoOrderContext, CryptoOrderValidator3> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;

    public CryptoTaxLotSelectionOrderPrecisionCheck(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(CryptoOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        RequestInputs requestInputs = input.getRequestContext().getRequestInputs();
        Intrinsics.checkNotNull(requestInputs, "null cannot be cast to non-null type com.robinhood.shared.trade.crypto.validation.RequestInputs.AsAsset");
        BigDecimal purchaseSize = ((RequestInputs.AsAsset) requestInputs).getPurchaseSize();
        BigDecimal minOrderQuantityIncrement = input.getRequestContext().getCurrencyPair().getMinOrderQuantityIncrement();
        if (zzah$$ExternalSyntheticBackportWithForwarding0.m822m(purchaseSize).scale() <= zzah$$ExternalSyntheticBackportWithForwarding0.m822m(minOrderQuantityIncrement).scale()) {
            return null;
        }
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(minOrderQuantityIncrement);
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
        return new Failure(bigDecimalM822m, this.eventLogger);
    }

    /* compiled from: CryptoTaxLotSelectionOrderPrecisionCheck.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/validation/CryptoTaxLotSelectionOrderPrecisionCheck$Failure;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "minOrderQuantityIncrement", "Ljava/math/BigDecimal;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;)V", "getMinOrderQuantityIncrement", "()Ljava/math/BigDecimal;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "getTitle", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getMessage", "getPositiveAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "getNegativeAction", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure extends CryptoOrderValidator2 {
        public static final int $stable = 8;
        private final String checkIdentifier;
        private final EventLogger eventLogger;
        private final BigDecimal minOrderQuantityIncrement;

        public static /* synthetic */ Failure copy$default(Failure failure, BigDecimal bigDecimal, EventLogger eventLogger, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = failure.minOrderQuantityIncrement;
            }
            if ((i & 2) != 0) {
                eventLogger = failure.eventLogger;
            }
            return failure.copy(bigDecimal, eventLogger);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getMinOrderQuantityIncrement() {
            return this.minOrderQuantityIncrement;
        }

        /* renamed from: component2, reason: from getter */
        public final EventLogger getEventLogger() {
            return this.eventLogger;
        }

        public final Failure copy(BigDecimal minOrderQuantityIncrement, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(minOrderQuantityIncrement, "minOrderQuantityIncrement");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new Failure(minOrderQuantityIncrement, eventLogger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.minOrderQuantityIncrement, failure.minOrderQuantityIncrement) && Intrinsics.areEqual(this.eventLogger, failure.eventLogger);
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getNegativeAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return null;
        }

        public int hashCode() {
            return (this.minOrderQuantityIncrement.hashCode() * 31) + this.eventLogger.hashCode();
        }

        public String toString() {
            return "Failure(minOrderQuantityIncrement=" + this.minOrderQuantityIncrement + ", eventLogger=" + this.eventLogger + ")";
        }

        public final BigDecimal getMinOrderQuantityIncrement() {
            return this.minOrderQuantityIncrement;
        }

        public final EventLogger getEventLogger() {
            return this.eventLogger;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(BigDecimal minOrderQuantityIncrement, EventLogger eventLogger) {
            super(eventLogger);
            Intrinsics.checkNotNullParameter(minOrderQuantityIncrement, "minOrderQuantityIncrement");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            this.minOrderQuantityIncrement = minOrderQuantityIncrement;
            this.eventLogger = eventLogger;
            this.checkIdentifier = "crypto_order_size_precision_check";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getTitle(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_tax_lot_selection_order_precision_check_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getMessage(BaseActivity activity) throws Resources.NotFoundException {
            BigDecimal bigDecimalSafeAdd;
            Intrinsics.checkNotNullParameter(activity, "activity");
            BigDecimal bigDecimal = this.minOrderQuantityIncrement;
            BigDecimal bigDecimal2 = BigDecimal.ONE;
            BigDecimal bigDecimalSafeAdd2 = BigDecimals7.m2979lt(bigDecimal, bigDecimal2) ? BigDecimals7.safeAdd(bigDecimal2, this.minOrderQuantityIncrement) : bigDecimal2;
            if (BigDecimals7.m2979lt(this.minOrderQuantityIncrement, bigDecimal2)) {
                bigDecimalSafeAdd = BigDecimals7.safeAdd(bigDecimal2, BigDecimals7.safeMultiply(this.minOrderQuantityIncrement, new BigDecimal("0.1")));
            } else {
                bigDecimalSafeAdd = BigDecimals7.safeAdd(bigDecimal2, new BigDecimal("0.1"));
            }
            int iScale = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(this.minOrderQuantityIncrement).scale();
            String quantityString = activity.getResources().getQuantityString(C40095R.plurals.crypto_tax_lot_selection_order_precision_check_message, iScale, Integer.valueOf(iScale), zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalSafeAdd2).toString(), zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalSafeAdd).toString());
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getPositiveAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return activity.getString(C40095R.string.crypto_tax_lot_selection_validation_failure_edit_order_cta);
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Action.Abort.INSTANCE;
        }
    }
}
