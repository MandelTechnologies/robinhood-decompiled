package com.robinhood.android.common.recurring.trade.validation.crypto;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.trade.RecurringOrderViewState;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderContext;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver;
import com.robinhood.android.lib.trade.validation.Validator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoSignupOrderCheck.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoSignupOrderCheck;", "Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoRecurringOrderCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "input", "cryptoData", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$Crypto;", "Failure", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoSignupOrderCheck extends CryptoRecurringOrderCheck {
    public static final int $stable = 0;

    @Override // com.robinhood.android.common.recurring.trade.validation.crypto.CryptoRecurringOrderCheck
    public Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> check(RecurringOrderContext input, RecurringOrderViewState.InvestmentTargetData.Crypto cryptoData) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(cryptoData, "cryptoData");
        if (cryptoData.getCryptoAccount() != null) {
            return null;
        }
        return new Failure();
    }

    /* compiled from: CryptoSignupOrderCheck.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoSignupOrderCheck$Failure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "<init>", "()V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "passthroughArgs", "Landroid/os/Bundle;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure implements Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> {
        public static final int $stable = 0;

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<RecurringOrderContext> onNegativeResponse(RecurringOrderValidationFailureResolver recurringOrderValidationFailureResolver, Bundle bundle) {
            return Validator.Failure.DefaultImpls.onNegativeResponse(this, recurringOrderValidationFailureResolver, bundle);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return "crypto_recurring_account_order_check";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<RecurringOrderContext> onPositiveResponse(RecurringOrderValidationFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            resolver.launchCryptoSignupFlow();
            return Validator.Action.Abort.INSTANCE;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, RecurringOrderContext input) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setId(C11595R.id.dialog_id_equity_recurring_order_validation_failure).setTitle(C11595R.string.crypto_recurring_order_check_create_account_title, new Object[0]).setMessage(C11595R.string.crypto_recurring_order_check_create_account_message, new Object[0]).setPositiveButton(C11595R.string.crypto_recurring_order_check_create_account_action, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "hasCryptoAccountCheck", false, 4, null);
        }
    }
}
