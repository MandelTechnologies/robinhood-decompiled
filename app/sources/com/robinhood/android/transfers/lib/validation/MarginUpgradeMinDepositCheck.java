package com.robinhood.android.transfers.lib.validation;

import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeMinDepositCheck.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/MarginUpgradeMinDepositCheck;", "Lcom/robinhood/android/transfers/lib/validation/TransferCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "input", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "Failure", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MarginUpgradeMinDepositCheck implements TransferCheck {
    public static final MarginUpgradeMinDepositCheck INSTANCE = new MarginUpgradeMinDepositCheck();

    private MarginUpgradeMinDepositCheck() {
    }

    @Override // com.robinhood.android.transfers.lib.validation.TransferCheck
    public ValidationFailure check(TransferValidationInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        TransferConfiguration configuration = input.getConfiguration();
        TransferAccount sinkAccount = input.getSinkAccount();
        if (sinkAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (sinkAccount.getType() != ApiTransferAccount.TransferAccountType.RHS || !(configuration instanceof TransferConfiguration.MarginDeposit)) {
            return null;
        }
        TransferConfiguration.MarginDeposit marginDeposit = (TransferConfiguration.MarginDeposit) configuration;
        if (input.getAmount().compareTo(marginDeposit.getMinAmount()) < 0) {
            return new Failure(marginDeposit.getMinAmount());
        }
        return null;
    }

    /* compiled from: MarginUpgradeMinDepositCheck.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/MarginUpgradeMinDepositCheck$Failure;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "minAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getMinAmount$lib_transfers_externalDebug", "()Ljava/math/BigDecimal;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure implements ValidationFailure {
        private final BigDecimal minAmount;

        public Failure(BigDecimal minAmount) {
            Intrinsics.checkNotNullParameter(minAmount, "minAmount");
            this.minAmount = minAmount;
        }

        /* renamed from: getMinAmount$lib_transfers_externalDebug, reason: from getter */
        public final BigDecimal getMinAmount() {
            return this.minAmount;
        }

        @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
        public void showAlert(BaseActivity activity, EventLogger eventLogger) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            String string2 = activity.getResources().getString(C30383R.string.margin_upgrade_min_amount_dialog_msg, Formats.getCurrencyFormat().format(this.minAmount));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(activity).setId(C30383R.id.dialog_id_ach_transfer_margin_upgrade_min_amount).setTitle(C30383R.string.margin_upgrade_min_amount_dialog_title, new Object[0]).setMessage(string2).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "MarginUpgradeDeposit", false, 4, null);
        }
    }
}
