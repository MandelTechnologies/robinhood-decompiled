package com.robinhood.android.optionsexercise;

import android.content.res.Resources;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.OptionEvent;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseConfirmationStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationDataState;", "Lcom/robinhood/android/optionsexercise/OptionExerciseConfirmationViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "getTotalValueRowState", "Lcom/robinhood/android/optionsexercise/TotalValueRowState;", "ds", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionExerciseConfirmationStateProvider implements StateProvider<OptionExerciseConfirmationDataState, OptionExerciseConfirmationViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: OptionExerciseConfirmationStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderDirection.values().length];
            try {
                iArr[OrderDirection.DEBIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderDirection.CREDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionExerciseConfirmationStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionExerciseConfirmationViewState reduce(OptionExerciseConfirmationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new OptionExerciseConfirmationViewState(dataState.getOptionEvent(), dataState.getUiOptionInstrument(), getTotalValueRowState(dataState));
    }

    private final TotalValueRowState getTotalValueRowState(OptionExerciseConfirmationDataState ds) throws Resources.NotFoundException {
        String string2;
        OptionEvent optionEvent = ds.getOptionEvent();
        if (optionEvent == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[optionEvent.getDirection().ordinal()];
        if (i == 1) {
            string2 = this.resources.getString(C20649R.string.order_confirmation_total_cost_label);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = this.resources.getString(C20649R.string.order_confirmation_total_credit_label);
        }
        Intrinsics.checkNotNull(string2);
        return new TotalValueRowState(string2, Money.format$default(Money3.toMoney(optionEvent.getTotalCashAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null), OptionExerciseShortPositionUtils.getShortPositionText(this.resources, ds.isShortSellingExerciseEnabled(), ds.getUiOptionInstrument(), ds.getOptionEvent().getQuantity(), ds.getExerciseChecks(), ds.getEquityPosition()));
    }
}
