package com.robinhood.android.transfers.lib.validation;

import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.lib.C30383R;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldApyMinDepositCheck.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/GoldApyMinDepositCheck;", "Lcom/robinhood/android/transfers/lib/validation/TransferCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "input", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "MinDepositAmount", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class GoldApyMinDepositCheck implements TransferCheck {
    public static final GoldApyMinDepositCheck INSTANCE = new GoldApyMinDepositCheck();

    private GoldApyMinDepositCheck() {
    }

    @Override // com.robinhood.android.transfers.lib.validation.TransferCheck
    public ValidationFailure check(TransferValidationInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getOverrideGoldApyBoostMinDepositCheck() || !(input.getConfiguration() instanceof TransferConfiguration.GoldApyBoostMinDeposit)) {
            return null;
        }
        double dDoubleValue = input.getAmount().doubleValue();
        Double minDepositAmount = ((TransferConfiguration.GoldApyBoostMinDeposit) input.getConfiguration()).getMinDepositAmount();
        if (Double.compare(dDoubleValue, minDepositAmount != null ? minDepositAmount.doubleValue() : 0.0d) < 0) {
            return new MinDepositAmount(((TransferConfiguration.GoldApyBoostMinDeposit) input.getConfiguration()).getMinDepositRate(), ((TransferConfiguration.GoldApyBoostMinDeposit) input.getConfiguration()).getMinDepositAmount());
        }
        return null;
    }

    /* compiled from: GoldApyMinDepositCheck.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/GoldApyMinDepositCheck$MinDepositAmount;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "minDepositRate", "", "minDepositAmount", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getMinDepositRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinDepositAmount", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MinDepositAmount implements ValidationFailure {
        private final Double minDepositAmount;
        private final Double minDepositRate;

        public MinDepositAmount(Double d, Double d2) {
            this.minDepositRate = d;
            this.minDepositAmount = d2;
        }

        public final Double getMinDepositRate() {
            return this.minDepositRate;
        }

        public final Double getMinDepositAmount() {
            return this.minDepositAmount;
        }

        @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
        public void showAlert(BaseActivity activity, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Double d = this.minDepositRate;
            Double d2 = this.minDepositAmount;
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setId(C30383R.id.dialog_id_gold_apy_min_deposit_min_amount).setTitle(activity.getString(C30383R.string.apy_boost_min_deposit_min_amount_title, Formats.getWholeNumberCurrencyFormat().format(new BigDecimal(d2 != null ? d2.toString() : null)))).setMessage(activity.getString(C30383R.string.apy_boost_min_deposit_min_amount_message, Formats.getWholeNumberCurrencyFormat().format(new BigDecimal(d2 != null ? d2.toString() : null)), String.valueOf(d))).setPositiveButton(C30383R.string.apy_boost_min_deposit_min_amount_primary_button, new Object[0]).setNegativeButton(C30383R.string.apy_boost_min_deposit_min_amount_secondary_button, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "gold_apy_boost_min_amount", false, 4, null);
        }
    }
}
