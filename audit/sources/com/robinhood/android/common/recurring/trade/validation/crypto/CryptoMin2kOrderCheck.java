package com.robinhood.android.common.recurring.trade.validation.crypto;

import android.os.Bundle;
import android.text.Spannable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.trade.RecurringOrderViewState;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderContext;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoMin2kOrderCheck.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoMin2kOrderCheck;", "Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoRecurringOrderCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "input", "cryptoData", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$Crypto;", "Failure", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoMin2kOrderCheck extends CryptoRecurringOrderCheck {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // com.robinhood.android.common.recurring.trade.validation.crypto.CryptoRecurringOrderCheck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> check(RecurringOrderContext input, RecurringOrderViewState.InvestmentTargetData.Crypto cryptoData) {
        UnifiedBalances unifiedBalances;
        boolean z;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(cryptoData, "cryptoData");
        UiCurrencyPair currencyPair = cryptoData.getCurrencyPair();
        if (currencyPair == null || (unifiedBalances = cryptoData.getUnifiedBalances()) == null) {
            return null;
        }
        Currency quoteCurrency = currencyPair.getQuoteCurrency();
        MarginSettings marginSettings = cryptoData.getMarginSettings();
        BigDecimal equity = unifiedBalances.getBrokerageBalances().getPortfolio().getEquity();
        if (marginSettings != null) {
            z = marginSettings.isMarginInvestingEnabled() && equity.compareTo(Portfolio.MINIMUM_EQUITY_FOR_GOLD_ELIGIBILITY) >= 0;
        }
        if (!quoteCurrency.isUsd() || !z) {
            return null;
        }
        BigDecimal decimalValue = input.getApiRequest().getAmount().getDecimalValue();
        BigDecimal bigDecimalMultiply = Portfolio.MINIMUM_EQUITY_FOR_GOLD_ELIGIBILITY.multiply(Portfolio.INSTANCE.getCOLLAR_TO_PREVENT_REACHING_MINIMUM_BALANCE());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        if (BigDecimals7.gte(equity.subtract(decimalValue), bigDecimalMultiply)) {
            return null;
        }
        boolean zIsLevered = unifiedBalances.isLevered();
        BigDecimal bigDecimalSubtract = equity.subtract(bigDecimalMultiply);
        if (zIsLevered) {
            Intrinsics.checkNotNull(bigDecimalSubtract);
            return new Failure.Levered(decimalValue, bigDecimalSubtract);
        }
        Intrinsics.checkNotNull(bigDecimalSubtract);
        return new Failure.Unlevered(bigDecimalSubtract);
    }

    /* compiled from: CryptoMin2kOrderCheck.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0002\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoMin2kOrderCheck$Failure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "<init>", "()V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "Unlevered", "Levered", "Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoMin2kOrderCheck$Failure$Levered;", "Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoMin2kOrderCheck$Failure$Unlevered;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Failure implements Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> {
        public static final int $stable = 0;

        public /* synthetic */ Failure(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Failure() {
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
        public final String getCheckIdentifier() {
            return "crypto_recurring_min_2k";
        }

        /* compiled from: CryptoMin2kOrderCheck.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoMin2kOrderCheck$Failure$Unlevered;", "Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoMin2kOrderCheck$Failure;", "allowedAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getAllowedAmount", "()Ljava/math/BigDecimal;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "onNegativeResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Unlevered extends Failure {
            public static final int $stable = 8;
            private final BigDecimal allowedAmount;

            public final BigDecimal getAllowedAmount() {
                return this.allowedAmount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unlevered(BigDecimal allowedAmount) {
                super(null);
                Intrinsics.checkNotNullParameter(allowedAmount, "allowedAmount");
                this.allowedAmount = allowedAmount;
            }

            @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
            public void showAlert(BaseActivity activity, RecurringOrderContext input) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(input, "input");
                String string2 = activity.getString(C11595R.string.crypto_recurring_order_check_margin_buying_power, Formats.getCurrencyFormat().format(this.allowedAmount));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                RhDialogFragment.Builder theme = RhDialogFragment.INSTANCE.create(activity).setId(C11595R.id.dialog_id_equity_recurring_order_validation_failure).setTitle(C11595R.string.crypto_recurring_order_check_margin_minimum_title, new Object[0]).setMessage(HtmlCompat.fromHtml$default(string2, 0, 2, null)).setPositiveButton(C11048R.string.general_label_cancel, new Object[0]).setNegativeButton(C11048R.string.general_label_continue, new Object[0]).setTheme(C11048R.style.ThemeOverlay_Robinhood_Dialog_Negative);
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(theme, supportFragmentManager, "min2kUnlevered", false, 4, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.robinhood.android.common.recurring.trade.validation.crypto.CryptoMin2kOrderCheck.Failure, com.robinhood.android.lib.trade.validation.Validator.Failure
            public Validator.Action<RecurringOrderContext> onNegativeResponse(RecurringOrderValidationFailureResolver resolver, Bundle passthroughArgs) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                return Validator.Action.Skip.INSTANCE;
            }
        }

        /* compiled from: CryptoMin2kOrderCheck.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoMin2kOrderCheck$Failure$Levered;", "Lcom/robinhood/android/common/recurring/trade/validation/crypto/CryptoMin2kOrderCheck$Failure;", "enteredAmount", "Ljava/math/BigDecimal;", "allowedAmount", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getEnteredAmount", "()Ljava/math/BigDecimal;", "getAllowedAmount", "recommendedDepositAmount", "getRecommendedDepositAmount", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Levered extends Failure {
            public static final int $stable = 8;
            private final BigDecimal allowedAmount;
            private final BigDecimal enteredAmount;
            private final BigDecimal recommendedDepositAmount;

            public final BigDecimal getEnteredAmount() {
                return this.enteredAmount;
            }

            public final BigDecimal getAllowedAmount() {
                return this.allowedAmount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Levered(BigDecimal enteredAmount, BigDecimal allowedAmount) {
                super(null);
                Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
                Intrinsics.checkNotNullParameter(allowedAmount, "allowedAmount");
                this.enteredAmount = enteredAmount;
                this.allowedAmount = allowedAmount;
                BigDecimal bigDecimalSubtract = enteredAmount.subtract(allowedAmount);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                this.recommendedDepositAmount = bigDecimalSubtract;
            }

            public final BigDecimal getRecommendedDepositAmount() {
                return this.recommendedDepositAmount;
            }

            @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
            public void showAlert(BaseActivity activity, RecurringOrderContext input) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(input, "input");
                String string2 = activity.getString(C11595R.string.crypto_recurring_order_check_margin_buying_power, Formats.getCurrencyFormat().format(this.allowedAmount));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Spannable spannableFromHtml$default = HtmlCompat.fromHtml$default(string2, 0, 2, null);
                String string3 = activity.getString(C11595R.string.crypto_recurring_order_check_deposit_action, Formats.getCurrencyFormat().format(this.recommendedDepositAmount));
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                RhDialogFragment.Builder theme = RhDialogFragment.INSTANCE.create(activity).setId(C11595R.id.dialog_id_equity_recurring_order_validation_failure).setTitle(C11595R.string.crypto_recurring_order_check_margin_minimum_title, new Object[0]).setMessage(spannableFromHtml$default).setPositiveButton(string3).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]).setTheme(C11048R.style.ThemeOverlay_Robinhood_Dialog_Negative);
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(theme, supportFragmentManager, "min2kLevered", false, 4, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.robinhood.android.common.recurring.trade.validation.crypto.CryptoMin2kOrderCheck.Failure, com.robinhood.android.lib.trade.validation.Validator.Failure
            public Validator.Action<RecurringOrderContext> onPositiveResponse(RecurringOrderValidationFailureResolver resolver, Bundle passthroughArgs) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                resolver.launchDepositFlow();
                return Validator.Action.Abort.INSTANCE;
            }
        }
    }
}
