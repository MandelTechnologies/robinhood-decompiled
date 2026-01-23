package com.robinhood.android.optionsexercise.validation;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.OptionExerciseContext;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotEnoughContractsCheck.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/NotEnoughContractsCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/optionsexercise/validation/NotEnoughContractsCheck$Failure;", "input", "Failure", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class NotEnoughContractsCheck implements Validator.Check<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(OptionExerciseContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getExerciseRequestContext().getExerciseChecks() == null) {
            return null;
        }
        if (BigDecimals7.lte(input.getExerciseRequest().getQuantity(), input.getExerciseRequestContext().getExerciseChecks().getExercisable_quantity())) {
            return null;
        }
        return new Failure(input.getExerciseRequestContext().getAccount(), input.getExerciseRequestContext().getHasMultipleAccounts(), input.getOptionInstrument());
    }

    /* compiled from: NotEnoughContractsCheck.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/NotEnoughContractsCheck$Failure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "account", "Lcom/robinhood/models/db/Account;", "hasMultipleAccounts", "", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "<init>", "(Lcom/robinhood/models/db/Account;ZLcom/robinhood/models/db/OptionInstrument;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getHasMultipleAccounts", "()Z", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure implements Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
        public static final int $stable = 8;
        private final Account account;
        private final String checkIdentifier;
        private final boolean hasMultipleAccounts;
        private final OptionInstrument optionInstrument;

        public Failure(Account account, boolean z, OptionInstrument optionInstrument) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
            this.account = account;
            this.hasMultipleAccounts = z;
            this.optionInstrument = optionInstrument;
            this.checkIdentifier = OptionExerciseValidator.CHECK_ID_OPTION_EXERCISE_NOT_ENOUGH_CONTRACTS;
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

        public final OptionInstrument getOptionInstrument() {
            return this.optionInstrument;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, OptionExerciseContext input) throws Resources.NotFoundException {
            String string2;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            if (this.hasMultipleAccounts) {
                int i = C24704R.string.f4809x97b258a2;
                StringResource inSentence = AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence();
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                CharSequence text = inSentence.getText(resources);
                OptionInstrument optionInstrument = this.optionInstrument;
                Resources resources2 = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                string2 = activity.getString(i, text, OptionExtensions.getTitleString(optionInstrument, resources2));
            } else {
                int i2 = C24704R.string.option_exercise_error_account_not_enough_contracts_message;
                OptionInstrument optionInstrument2 = this.optionInstrument;
                Resources resources3 = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                string2 = activity.getString(i2, OptionExtensions.getTitleString(optionInstrument2, resources3));
            }
            Intrinsics.checkNotNull(string2);
            RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(activity).setTitle(C24704R.string.option_exercise_error_account_not_enough_contracts_title, new Object[0]).setMessage(string2).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setUseDesignSystemOverlay(true).setId(C24704R.id.dialog_id_exercise_validation_error);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(id, supportFragmentManager, "notEnoughContracts", false, 4, null);
        }
    }
}
