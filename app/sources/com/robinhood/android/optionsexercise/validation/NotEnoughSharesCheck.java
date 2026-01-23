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
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotEnoughSharesCheck.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/NotEnoughSharesCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/optionsexercise/validation/NotEnoughSharesCheck$Failure;", "input", "Failure", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class NotEnoughSharesCheck implements Validator.Check<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(OptionExerciseContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getIsBuy() || input.getExerciseRequestContext().getEquityPosition() == null) {
            return null;
        }
        if (input.getExerciseRequestContext().isShortSellingExerciseEnabled() && input.getExerciseRequestContext().getEquityPosition().getQuantity().signum() <= 0) {
            return null;
        }
        BigDecimal underlyingShareQuantity = input.getUnderlyingShareQuantity();
        BigDecimal sharesAvailableForExercise = input.getExerciseRequestContext().getEquityPosition().getSharesAvailableForExercise();
        if (BigDecimals7.lte(underlyingShareQuantity, sharesAvailableForExercise)) {
            return null;
        }
        return new Failure(input.getExerciseRequestContext().getAccount(), input.getExerciseRequestContext().getHasMultipleAccounts(), underlyingShareQuantity, sharesAvailableForExercise, input.getExerciseRequestContext().getEquityInstrument().getDisplaySymbol());
    }

    /* compiled from: NotEnoughSharesCheck.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B/\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/NotEnoughSharesCheck$Failure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "account", "Lcom/robinhood/models/db/Account;", "hasMultipleAccounts", "", "requiredShareQuantity", "Ljava/math/BigDecimal;", "sellableQuantity", "symbol", "", "<init>", "(Lcom/robinhood/models/db/Account;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getHasMultipleAccounts", "()Z", "getRequiredShareQuantity", "()Ljava/math/BigDecimal;", "getSellableQuantity", "getSymbol", "()Ljava/lang/String;", "checkIdentifier", "getCheckIdentifier", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure implements Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
        public static final int $stable = 8;
        private final Account account;
        private final String checkIdentifier;
        private final boolean hasMultipleAccounts;
        private final BigDecimal requiredShareQuantity;
        private final BigDecimal sellableQuantity;
        private final String symbol;

        public Failure(Account account, boolean z, BigDecimal requiredShareQuantity, BigDecimal sellableQuantity, String symbol) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(requiredShareQuantity, "requiredShareQuantity");
            Intrinsics.checkNotNullParameter(sellableQuantity, "sellableQuantity");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.account = account;
            this.hasMultipleAccounts = z;
            this.requiredShareQuantity = requiredShareQuantity;
            this.sellableQuantity = sellableQuantity;
            this.symbol = symbol;
            this.checkIdentifier = OptionExerciseValidator.CHECK_ID_OPTION_EXERCISE_NOT_ENOUGH_SHARES;
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

        public final BigDecimal getRequiredShareQuantity() {
            return this.requiredShareQuantity;
        }

        public final BigDecimal getSellableQuantity() {
            return this.sellableQuantity;
        }

        public final String getSymbol() {
            return this.symbol;
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
                int i = C24704R.string.f4812xa92a1a21;
                String str = this.symbol;
                StringResource inSentence = AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence();
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                string2 = activity.getString(i, str, inSentence.getText(resources));
            } else {
                string2 = activity.getString(C24704R.string.option_exercise_error_not_enough_shares_message, this.symbol);
            }
            Intrinsics.checkNotNull(string2);
            OptionExerciseErrorDialogFragment.Builder builderCreate = OptionExerciseErrorDialogFragment.INSTANCE.create(activity);
            String string3 = activity.getString(C24704R.string.option_exercise_error_sellable_shares_row_label);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            OptionExerciseErrorDialogFragment.Builder firstRow = builderCreate.setFirstRow(string3, Formats.getShareQuantityFormat().format(this.sellableQuantity));
            String string4 = activity.getString(C24704R.string.option_exercise_error_quantity_to_exercise_row_label);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            OptionExerciseErrorDialogFragment.Builder secondRow = firstRow.setSecondRow(string4, Formats.getShareQuantityFormat().format(this.requiredShareQuantity));
            String string5 = activity.getString(C24704R.string.option_exercise_error_difference_row_label);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            NumberFormatter shareQuantityFormat = Formats.getShareQuantityFormat();
            BigDecimal bigDecimalSubtract = this.sellableQuantity.subtract(this.requiredShareQuantity);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            RhDialogFragment.Builder negativeButton = secondRow.setThirdRow(string5, shareQuantityFormat.format(bigDecimalSubtract)).setTitle(C24704R.string.option_exercise_error_not_enough_shares_title, new Object[0]).setMessage(string2).setId(C24704R.id.dialog_id_exercise_validation_error).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "notEnoughShares", false, 4, null);
        }
    }
}
