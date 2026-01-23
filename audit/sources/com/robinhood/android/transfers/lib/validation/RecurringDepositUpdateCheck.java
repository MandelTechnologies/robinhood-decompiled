package com.robinhood.android.transfers.lib.validation;

import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.lib.C30383R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositUpdateCheck.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/RecurringDepositUpdateCheck;", "Lcom/robinhood/android/transfers/lib/validation/TransferCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "input", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "RecurringDepositUpdate", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositUpdateCheck implements TransferCheck {
    public static final RecurringDepositUpdateCheck INSTANCE = new RecurringDepositUpdateCheck();

    private RecurringDepositUpdateCheck() {
    }

    @Override // com.robinhood.android.transfers.lib.validation.TransferCheck
    public ValidationFailure check(TransferValidationInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        TransferConfiguration configuration = input.getConfiguration();
        if (!(configuration instanceof TransferConfiguration.UpdateRecurringDeposit) || input.getAdjustedFrequency() == null) {
            return null;
        }
        TransferConfiguration.UpdateRecurringDeposit updateRecurringDeposit = (TransferConfiguration.UpdateRecurringDeposit) configuration;
        boolean zAreEqual = Intrinsics.areEqual(input.getAmount(), updateRecurringDeposit.getAmount());
        boolean z = input.getAdjustedFrequency() == updateRecurringDeposit.getOriginalFrequency();
        if (zAreEqual && z) {
            return RecurringDepositUpdate.INSTANCE;
        }
        return null;
    }

    /* compiled from: RecurringDepositUpdateCheck.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/RecurringDepositUpdateCheck$RecurringDepositUpdate;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "<init>", "()V", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecurringDepositUpdate implements ValidationFailure {
        public static final RecurringDepositUpdate INSTANCE = new RecurringDepositUpdate();

        private RecurringDepositUpdate() {
        }

        @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
        public void showAlert(BaseActivity activity, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setId(C30383R.id.dialog_id_update_recurring_deposit_no_change_dialog).setTitle(C30383R.string.update_recurring_deposit_frequency_error_modal_title, new Object[0]).setMessage(C30383R.string.update_recurring_deposit_frequency_error_modal_description, new Object[0]).setPositiveButton(C30383R.string.update_recurring_deposit_frequency_error_modal_positive_btn, new Object[0]).setNegativeButton(C30383R.string.update_recurring_deposit_frequency_error_modal_negative_btn, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "updateRecurringBlocked", false, 4, null);
        }
    }
}
