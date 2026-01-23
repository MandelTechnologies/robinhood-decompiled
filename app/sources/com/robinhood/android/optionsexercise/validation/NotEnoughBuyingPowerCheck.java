package com.robinhood.android.optionsexercise.validation;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.OptionExerciseContext;
import com.robinhood.android.optionsexercise.validation.OptionExerciseErrorDialogFragment;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotEnoughBuyingPowerCheck.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/NotEnoughBuyingPowerCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "input", "PositiveBuyingPowerFailure", "NegativeBuyingPowerFailure", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class NotEnoughBuyingPowerCheck implements Validator.Check<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> check(OptionExerciseContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (!input.getIsBuy()) {
            return null;
        }
        Position equityPosition = input.getExerciseRequestContext().getEquityPosition();
        if (BigDecimals7.isNegative(equityPosition != null ? equityPosition.getQuantity() : null) || BigDecimals7.gte(input.getBuyingPower().getDecimalValue(), input.getTotalCostFromStrikePrice())) {
            return null;
        }
        if (input.getBuyingPower().isNegative()) {
            return new NegativeBuyingPowerFailure();
        }
        return new PositiveBuyingPowerFailure(input.getExerciseRequestContext().getAccount(), input.getExerciseRequestContext().getHasMultipleAccounts(), input.getBuyingPower().getDecimalValue(), input.getTotalCostFromStrikePrice());
    }

    /* compiled from: NotEnoughBuyingPowerCheck.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/NotEnoughBuyingPowerCheck$PositiveBuyingPowerFailure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "account", "Lcom/robinhood/models/db/Account;", "hasMultipleAccounts", "", "buyingPower", "Ljava/math/BigDecimal;", "costToExercise", "<init>", "(Lcom/robinhood/models/db/Account;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getHasMultipleAccounts", "()Z", "getBuyingPower", "()Ljava/math/BigDecimal;", "getCostToExercise", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PositiveBuyingPowerFailure implements Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
        public static final int $stable = 8;
        private final Account account;
        private final BigDecimal buyingPower;
        private final String checkIdentifier;
        private final BigDecimal costToExercise;
        private final boolean hasMultipleAccounts;

        public PositiveBuyingPowerFailure(Account account, boolean z, BigDecimal buyingPower, BigDecimal costToExercise) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
            Intrinsics.checkNotNullParameter(costToExercise, "costToExercise");
            this.account = account;
            this.hasMultipleAccounts = z;
            this.buyingPower = buyingPower;
            this.costToExercise = costToExercise;
            this.checkIdentifier = OptionExerciseValidator.CHECK_ID_OPTION_EXERCISE_NOT_ENOUGH_BUYING_POWER;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onNegativeResponse(OptionExerciseValidationFailureResolver optionExerciseValidationFailureResolver, Bundle bundle) {
            return Validator.Failure.DefaultImpls.onNegativeResponse(this, optionExerciseValidationFailureResolver, bundle);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onPositiveResponse(OptionExerciseValidationFailureResolver optionExerciseValidationFailureResolver, Bundle bundle) {
            return Validator.Failure.DefaultImpls.onPositiveResponse(this, optionExerciseValidationFailureResolver, bundle);
        }

        public final Account getAccount() {
            return this.account;
        }

        public final boolean getHasMultipleAccounts() {
            return this.hasMultipleAccounts;
        }

        public final BigDecimal getBuyingPower() {
            return this.buyingPower;
        }

        public final BigDecimal getCostToExercise() {
            return this.costToExercise;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, OptionExerciseContext input) {
            String string2;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            if (this.hasMultipleAccounts) {
                int i = C24704R.string.f4811x3d779b8f;
                StringResource inSentence = AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence();
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                string2 = activity.getString(i, inSentence.getText(resources));
            } else {
                string2 = activity.getString(C24704R.string.option_exercise_error_not_enough_buying_power_message);
            }
            Intrinsics.checkNotNull(string2);
            OptionExerciseErrorDialogFragment.Builder builderCreate = OptionExerciseErrorDialogFragment.INSTANCE.create(activity);
            String string3 = activity.getString(C24704R.string.option_exercise_error_buying_power_row_label);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            BigDecimal bigDecimal = this.buyingPower;
            Currency currency = Currencies.USD;
            OptionExerciseErrorDialogFragment.Builder firstRow = builderCreate.setFirstRow(string3, Money.format$default(Money3.toMoney(bigDecimal, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            String string4 = activity.getString(C24704R.string.option_exercise_error_cost_to_exercise_row_label);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            OptionExerciseErrorDialogFragment.Builder secondRow = firstRow.setSecondRow(string4, Money.format$default(Money3.toMoney(this.costToExercise, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            String string5 = activity.getString(C24704R.string.option_exercise_error_difference_row_label);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            NumberFormatter amountFormat = Formats.getAmountFormat();
            BigDecimal bigDecimalSubtract = this.buyingPower.subtract(this.costToExercise);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            RhDialogFragment.Builder negativeButton = secondRow.setThirdRow(string5, amountFormat.format(bigDecimalSubtract)).setTitle(C24704R.string.option_exercise_error_not_enough_buying_power_title, new Object[0]).setMessage(string2).setId(C24704R.id.dialog_id_exercise_validation_error).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "notEnoughBuyingPower", false, 4, null);
        }
    }

    /* compiled from: NotEnoughBuyingPowerCheck.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/NotEnoughBuyingPowerCheck$NegativeBuyingPowerFailure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "<init>", "()V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NegativeBuyingPowerFailure implements Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
        public static final int $stable = 0;
        private final String checkIdentifier = OptionExerciseValidator.CHECK_ID_OPTION_EXERCISE_NOT_ENOUGH_BUYING_POWER;

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onNegativeResponse(OptionExerciseValidationFailureResolver optionExerciseValidationFailureResolver, Bundle bundle) {
            return Validator.Failure.DefaultImpls.onNegativeResponse(this, optionExerciseValidationFailureResolver, bundle);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onPositiveResponse(OptionExerciseValidationFailureResolver optionExerciseValidationFailureResolver, Bundle bundle) {
            return Validator.Failure.DefaultImpls.onPositiveResponse(this, optionExerciseValidationFailureResolver, bundle);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, OptionExerciseContext input) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(activity).setTitle(C24704R.string.option_exercise_error_negative_buying_power_title, new Object[0]).setMessage(C24704R.string.option_exercise_error_negative_buying_power_message, new Object[0]).setUseDesignSystemOverlay(true).setId(C24704R.id.dialog_id_exercise_validation_error);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(id, supportFragmentManager, "notEnoughContracts", false, 4, null);
        }
    }
}
