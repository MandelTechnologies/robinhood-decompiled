package com.robinhood.android.optionsexercise.validation;

import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.optionsexercise.OptionExerciseContext;
import kotlin.Metadata;

/* compiled from: OptionExerciseValidator.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidator;", "Lcom/robinhood/android/lib/trade/validation/Validator;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "<init>", "()V", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionExerciseValidator extends Validator<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
    public static final String CHECK_ID_OPTION_EXERCISE_ACCOUNT_DEACTIVATED = "option_exercise_account_deactivated";
    public static final String CHECK_ID_OPTION_EXERCISE_ACCOUNT_POSITION_CLOSING_ONLY = "option_exercise_account_position_closing_only";
    public static final String CHECK_ID_OPTION_EXERCISE_DAY_TRADE_BLOCK_DUE_TO_PDT = "option_exercise_day_trade_block_due_to_pdt";
    public static final String CHECK_ID_OPTION_EXERCISE_DAY_TRADE_BLOCK_ERROR = "option_exercise_day_trade_block_error";
    public static final String CHECK_ID_OPTION_EXERCISE_DAY_TRADE_BLOCK_WITH_CANCELABLE_ORDER = "option_exercise_day_trade_block_with_cancelable_order";
    public static final String CHECK_ID_OPTION_EXERCISE_NOT_ENOUGH_BUYING_POWER = "option_exercise_not_enough_buying_power";
    public static final String CHECK_ID_OPTION_EXERCISE_NOT_ENOUGH_CONTRACTS = "option_exercise_not_enough_contracts";
    public static final String CHECK_ID_OPTION_EXERCISE_NOT_ENOUGH_SHARES = "option_exercise_not_enough_shares";
    public static final String CHECK_ID_OPTION_EXERCISE_PDT_BLOCK_EXEMPT_ERROR = "option_exercise_pdt_block_exempt_error";
    public static final String CHECK_ID_OPTION_EXERCISE_PDT_BLOCK_NOT_EXEMPT = "option_exercise_pdt_block_not_exempt";
    public static final int $stable = Validator.$stable;

    public OptionExerciseValidator() {
        super(new AccountRestrictionCheck(), new OptionExerciseDayTradeCheck(), new NotEnoughBuyingPowerCheck(), new NotEnoughSharesCheck(), new NotEnoughContractsCheck());
    }
}
