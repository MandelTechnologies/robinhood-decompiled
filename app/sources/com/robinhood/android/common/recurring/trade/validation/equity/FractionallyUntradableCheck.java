package com.robinhood.android.common.recurring.trade.validation.equity;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.trade.RecurringOrderViewState;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderContext;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidator;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FractionallyUntradableCheck.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/equity/FractionallyUntradableCheck;", "Lcom/robinhood/android/common/recurring/trade/validation/equity/EquityRecurringOrderCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "input", "equityData", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$Equity;", "Failure", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class FractionallyUntradableCheck extends EquityRecurringOrderCheck {
    public static final int $stable = 0;

    @Override // com.robinhood.android.common.recurring.trade.validation.equity.EquityRecurringOrderCheck
    public Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> check(RecurringOrderContext input, RecurringOrderViewState.InvestmentTargetData.Equity equityData) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(equityData, "equityData");
        Instrument instrument = equityData.getInstrument();
        if (instrument == null || instrument.getCanBuyFractional()) {
            return null;
        }
        return new Failure(instrument);
    }

    /* compiled from: FractionallyUntradableCheck.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/equity/FractionallyUntradableCheck$Failure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Lcom/robinhood/models/db/Instrument;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure implements Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> {
        public static final int $stable = 8;
        private final String checkIdentifier;
        private final Instrument instrument;

        public Failure(Instrument instrument) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.instrument = instrument;
            this.checkIdentifier = RecurringOrderValidator.CHECK_ID_RECURRING_FRACTIONALLY_UNTRADABLE;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<RecurringOrderContext> onNegativeResponse(RecurringOrderValidationFailureResolver recurringOrderValidationFailureResolver, Bundle bundle) {
            return Validator.Failure.DefaultImpls.onNegativeResponse(this, recurringOrderValidationFailureResolver, bundle);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<RecurringOrderContext> onPositiveResponse(RecurringOrderValidationFailureResolver recurringOrderValidationFailureResolver, Bundle bundle) {
            return Validator.Failure.DefaultImpls.onPositiveResponse(this, recurringOrderValidationFailureResolver, bundle);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, RecurringOrderContext input) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            Resources resources = activity.getResources();
            String string2 = resources.getString(C11595R.string.f4009x164cb445, this.instrument.getSymbol());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = resources.getString(C11595R.string.f4008x3cc6cab4, this.instrument.getSymbol());
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(activity).setUseDesignSystemOverlay(true).setId(C11595R.id.dialog_id_equity_recurring_order_validation_failure).setTitle(string2).setMessage(string3).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "fractionallyUntradable", false, 4, null);
        }
    }
}
