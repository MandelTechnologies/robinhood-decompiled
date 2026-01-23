package com.robinhood.android.common.recurring.trade.validation.equity;

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
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.prefs.BooleanPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringRhsConversionOrderCheck.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/equity/RecurringRhsConversionOrderCheck;", "Lcom/robinhood/android/common/recurring/trade/validation/equity/EquityRecurringOrderCheck;", "isConvertedPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;)V", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "input", "equityData", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$Equity;", "Failure", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringRhsConversionOrderCheck extends EquityRecurringOrderCheck {
    public static final int $stable = 8;
    private final BooleanPreference isConvertedPref;

    public RecurringRhsConversionOrderCheck(BooleanPreference isConvertedPref) {
        Intrinsics.checkNotNullParameter(isConvertedPref, "isConvertedPref");
        this.isConvertedPref = isConvertedPref;
    }

    @Override // com.robinhood.android.common.recurring.trade.validation.equity.EquityRecurringOrderCheck
    public Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> check(RecurringOrderContext input, RecurringOrderViewState.InvestmentTargetData.Equity equityData) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(equityData, "equityData");
        if (this.isConvertedPref.get()) {
            return null;
        }
        return new Failure();
    }

    /* compiled from: RecurringRhsConversionOrderCheck.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/equity/RecurringRhsConversionOrderCheck$Failure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "<init>", "()V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "passthroughArgs", "Landroid/os/Bundle;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure implements Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> {
        public static final int $stable = 0;
        private final String checkIdentifier = RecurringOrderValidator.CHECK_ID_RECURRING_RHS_CONVERSION;

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<RecurringOrderContext> onNegativeResponse(RecurringOrderValidationFailureResolver recurringOrderValidationFailureResolver, Bundle bundle) {
            return Validator.Failure.DefaultImpls.onNegativeResponse(this, recurringOrderValidationFailureResolver, bundle);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, RecurringOrderContext input) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(activity).setUseDesignSystemOverlay(true).setId(C11595R.id.dialog_id_equity_recurring_order_validation_failure).setTitle(null).setMessage(activity.getResources().getString(C20649R.string.order_create_error_rhs_conversion)).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "rhsConversion", false, 4, null);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<RecurringOrderContext> onPositiveResponse(RecurringOrderValidationFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            resolver.launchRhsConversion();
            return Validator.Action.Abort.INSTANCE;
        }
    }
}
