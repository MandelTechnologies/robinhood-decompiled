package com.robinhood.android.optionsexercise.validation;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.OptionExerciseContext;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountRestrictionCheck.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/AccountRestrictionCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "input", "AccountDeactivatedFailure", "AccountPositionClosingOnlyFailure", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class AccountRestrictionCheck implements Validator.Check<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> check(OptionExerciseContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Account account = input.getExerciseRequestContext().getAccount();
        if (account.getDeactivated()) {
            return new AccountDeactivatedFailure();
        }
        if (!account.getOnlyPositionClosingTrades() || input.getIsClosingPosition()) {
            return null;
        }
        return new AccountPositionClosingOnlyFailure(input.getExerciseRequestContext().getAccount(), input.getExerciseRequestContext().getHasMultipleAccounts());
    }

    /* compiled from: AccountRestrictionCheck.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/AccountRestrictionCheck$AccountDeactivatedFailure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "<init>", "()V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountDeactivatedFailure implements Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
        public static final int $stable = 0;
        private final String checkIdentifier = OptionExerciseValidator.CHECK_ID_OPTION_EXERCISE_ACCOUNT_DEACTIVATED;

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
            RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(activity).setTitle(C24704R.string.option_exercise_error_account_deactivated_title, new Object[0]).setMessage(C24704R.string.option_exercise_error_account_deactivated_message, new Object[0]).setUseDesignSystemOverlay(true).setId(C24704R.id.dialog_id_exercise_validation_error);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(id, supportFragmentManager, "accountDeactivated", false, 4, null);
        }
    }

    /* compiled from: AccountRestrictionCheck.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/AccountRestrictionCheck$AccountPositionClosingOnlyFailure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "account", "Lcom/robinhood/models/db/Account;", "hasMultipleAccounts", "", "<init>", "(Lcom/robinhood/models/db/Account;Z)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getHasMultipleAccounts", "()Z", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AccountPositionClosingOnlyFailure implements Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
        public static final int $stable = 8;
        private final Account account;
        private final String checkIdentifier;
        private final boolean hasMultipleAccounts;

        public AccountPositionClosingOnlyFailure(Account account, boolean z) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
            this.hasMultipleAccounts = z;
            this.checkIdentifier = OptionExerciseValidator.CHECK_ID_OPTION_EXERCISE_ACCOUNT_POSITION_CLOSING_ONLY;
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
                int i = C24704R.string.f4810x28cdd464;
                StringResource inSentence = AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence();
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                string2 = activity.getString(i, inSentence.getText(resources));
            } else {
                string2 = activity.getString(C24704R.string.option_exercise_error_account_position_closing_only_message);
            }
            Intrinsics.checkNotNull(string2);
            RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(activity).setTitle(C24704R.string.option_exercise_error_account_position_closing_only_title, new Object[0]).setMessage(string2).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setUseDesignSystemOverlay(true).setId(C24704R.id.dialog_id_exercise_validation_error);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(id, supportFragmentManager, "accountPco", false, 4, null);
        }
    }
}
