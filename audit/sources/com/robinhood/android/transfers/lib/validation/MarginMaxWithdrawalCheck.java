package com.robinhood.android.transfers.lib.validation;

import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.GoldWithdrawableCashBreakdown;
import com.robinhood.android.common.gold.GoldWithdrawableCashBreakdown2;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginMaxWithdrawalCheck.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/MarginMaxWithdrawalCheck;", "Lcom/robinhood/android/transfers/lib/validation/TransferCheck;", "<init>", "()V", "hasShownWarning", "", "check", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "input", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "getRecommendedWithdrawalLimitForMargin", "Ljava/math/BigDecimal;", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "areMarketsOpenExtended", "Failure", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MarginMaxWithdrawalCheck implements TransferCheck {
    private boolean hasShownWarning;

    @Override // com.robinhood.android.transfers.lib.validation.TransferCheck
    public ValidationFailure check(TransferValidationInput input) {
        UnifiedBalances unifiedBalances;
        BigDecimal recommendedWithdrawalLimitForMargin;
        Intrinsics.checkNotNullParameter(input, "input");
        TransferAccount sourceAccount = input.getSourceAccount();
        if (sourceAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean z = sourceAccount.getType() == ApiTransferAccount.TransferAccountType.RHS;
        if (this.hasShownWarning || !z || (unifiedBalances = input.getUnifiedBalances()) == null || (recommendedWithdrawalLimitForMargin = getRecommendedWithdrawalLimitForMargin(unifiedBalances, input.getAreMarketsOpenExtended())) == null || input.getAmount().compareTo(recommendedWithdrawalLimitForMargin) <= 0) {
            return null;
        }
        return new Failure(this, input.getAmount(), recommendedWithdrawalLimitForMargin);
    }

    private final BigDecimal getRecommendedWithdrawalLimitForMargin(UnifiedBalances unifiedBalances, boolean areMarketsOpenExtended) {
        if (!unifiedBalances.getBrokerageBalances().isGold() || !areMarketsOpenExtended) {
            return null;
        }
        GoldWithdrawableCashBreakdown goldWithdrawableCashBreakdownCreateGoldWithdrawableCashBreakdown = GoldWithdrawableCashBreakdown2.createGoldWithdrawableCashBreakdown(unifiedBalances);
        if (goldWithdrawableCashBreakdownCreateGoldWithdrawableCashBreakdown.useExcess() || goldWithdrawableCashBreakdownCreateGoldWithdrawableCashBreakdown.useDistanceFromMin()) {
            return BigDecimals7.safeMultiply(new BigDecimal("0.95"), unifiedBalances.getBrokerageBalances().getWithdrawableAmount());
        }
        return null;
    }

    /* compiled from: MarginMaxWithdrawalCheck.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/MarginMaxWithdrawalCheck$Failure;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "amount", "Ljava/math/BigDecimal;", "recommendedAmount", "<init>", "(Lcom/robinhood/android/transfers/lib/validation/MarginMaxWithdrawalCheck;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public final class Failure implements ValidationFailure {
        private final BigDecimal amount;
        private final BigDecimal recommendedAmount;
        final /* synthetic */ MarginMaxWithdrawalCheck this$0;

        public Failure(MarginMaxWithdrawalCheck marginMaxWithdrawalCheck, BigDecimal amount, BigDecimal recommendedAmount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            this.this$0 = marginMaxWithdrawalCheck;
            this.amount = amount;
            this.recommendedAmount = recommendedAmount;
        }

        @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
        public void showAlert(BaseActivity activity, EventLogger eventLogger) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Resources resources = activity.getResources();
            String string2 = resources.getString(C30383R.string.ach_transfer_error_market_volatility_summary, Formats.getCurrencyFormat().format(this.recommendedAmount));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = resources.getString(C30383R.string.ach_transfer_error_market_volatility_positive_action, Formats.getCurrencyFormat().format(this.amount));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setId(C30383R.id.dialog_id_ach_transfer_market_volatility).setTitle(C30383R.string.ach_transfer_error_market_volatility_title, new Object[0]).setMessage(string2).setPositiveButton(string3).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "WithdrawalExceedsGoldRecommended", false, 4, null);
            this.this$0.hasShownWarning = true;
        }
    }
}
