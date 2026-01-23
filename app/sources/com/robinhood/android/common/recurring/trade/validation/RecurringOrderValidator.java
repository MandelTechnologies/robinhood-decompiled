package com.robinhood.android.common.recurring.trade.validation;

import com.robinhood.android.common.recurring.trade.validation.crypto.CryptoMin2kOrderCheck;
import com.robinhood.android.common.recurring.trade.validation.crypto.CryptoSignupOrderCheck;
import com.robinhood.android.common.recurring.trade.validation.equity.FractionallyUntradableCheck;
import com.robinhood.android.common.recurring.trade.validation.equity.RecurringRhsConversionOrderCheck;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.librobinhood.data.prefs.HasConvertedToRhsPref;
import com.robinhood.prefs.BooleanPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderValidator.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidator;", "Lcom/robinhood/android/lib/trade/validation/Validator;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "isConvertedPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;)V", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringOrderValidator extends Validator<RecurringOrderContext, RecurringOrderValidationFailureResolver> {
    public static final String CHECK_ID_RECURRING_FRACTIONALLY_UNTRADABLE = "recurring_fractionally_untradable";
    public static final String CHECK_ID_RECURRING_MAXIMUM_AMOUNT_EXCEEDED = "recurring_maximum_amount_exceeded";
    public static final String CHECK_ID_RECURRING_MINIMUM_AMOUNT_NOT_MET = "recurring_minimum_amount_not_met";
    public static final String CHECK_ID_RECURRING_NOT_ENOUGH_BUYING_POWER = "recurring_not_enough_buying_power";
    public static final String CHECK_ID_RECURRING_RHS_CONVERSION = "recurring_rhs_conversion";
    public static final int $stable = Validator.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringOrderValidator(@HasConvertedToRhsPref BooleanPreference isConvertedPref) {
        super(new CryptoSignupOrderCheck(), new FractionallyUntradableCheck(), new MaximumRecurringAmountCheck(), new MinimumRecurringAmountCheck(), new SufficientBuyingPowerCheck(), new RecurringRhsConversionOrderCheck(isConvertedPref), new CryptoMin2kOrderCheck());
        Intrinsics.checkNotNullParameter(isConvertedPref, "isConvertedPref");
    }
}
