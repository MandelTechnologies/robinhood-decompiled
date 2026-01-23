package com.robinhood.android.options.optionsstring.common;

import com.robinhood.android.common.C11048R;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyTypes.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getName", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/api/OptionStrategyType;", "numLegs", "", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.common.OptionStrategyTypesKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionStrategyTypes {

    /* compiled from: OptionStrategyTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.common.OptionStrategyTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionStrategyType.values().length];
            try {
                iArr[OptionStrategyType.LONG_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionStrategyType.BUY_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionStrategyType.SHORT_CALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionStrategyType.LONG_PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionStrategyType.BUY_PUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionStrategyType.SHORT_PUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionStrategyType.LONG_CALL_SPREAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionStrategyType.SHORT_CALL_SPREAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OptionStrategyType.LONG_PUT_SPREAD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OptionStrategyType.SHORT_PUT_SPREAD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OptionStrategyType.LONG_CALL_CALENDAR_SPREAD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OptionStrategyType.CALL_CALENDAR_SPREAD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OptionStrategyType.SHORT_CALL_CALENDAR_SPREAD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OptionStrategyType.LONG_PUT_CALENDAR_SPREAD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[OptionStrategyType.PUT_CALENDAR_SPREAD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[OptionStrategyType.SHORT_PUT_CALENDAR_SPREAD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[OptionStrategyType.LONG_STRADDLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[OptionStrategyType.STRADDLE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[OptionStrategyType.SHORT_STRADDLE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[OptionStrategyType.LONG_STRANGLE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[OptionStrategyType.STRANGLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[OptionStrategyType.SHORT_STRANGLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[OptionStrategyType.SHORT_IRON_CONDOR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[OptionStrategyType.IRON_CONDOR.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[OptionStrategyType.LONG_IRON_CONDOR.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[OptionStrategyType.SHORT_IRON_BUTTERFLY.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[OptionStrategyType.IRON_BUTTERFLY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[OptionStrategyType.LONG_IRON_BUTTERFLY.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[OptionStrategyType.SHORT_CONDOR_CALL.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[OptionStrategyType.SHORT_CONDOR_PUT.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[OptionStrategyType.LONG_CONDOR_CALL.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[OptionStrategyType.LONG_CONDOR_PUT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[OptionStrategyType.SHORT_BUTTERFLY_CALL.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[OptionStrategyType.SHORT_BUTTERFLY_PUT.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[OptionStrategyType.LONG_BUTTERFLY_CALL.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[OptionStrategyType.LONG_BUTTERFLY_PUT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[OptionStrategyType.BACK_SPREAD_CALL.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[OptionStrategyType.BACK_SPREAD_PUT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[OptionStrategyType.FRONT_SPREAD_CALL.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[OptionStrategyType.FRONT_SPREAD_PUT.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[OptionStrategyType.STRADDLE_OR_STRANGLE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[OptionStrategyType.CALENDAR_SPREAD.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[OptionStrategyType.CUSTOM.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getName(OptionStrategyType optionStrategyType, int i) {
        Intrinsics.checkNotNullParameter(optionStrategyType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[optionStrategyType.ordinal()]) {
            case 1:
            case 2:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_call, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_call, new Object[0]);
            case 4:
            case 5:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_put, new Object[0]);
            case 6:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_put, new Object[0]);
            case 7:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_call_debit_spread, new Object[0]);
            case 8:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_call_credit_spread, new Object[0]);
            case 9:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_put_debit_spread, new Object[0]);
            case 10:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_put_credit_spread, new Object[0]);
            case 11:
            case 12:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_call_calendar_spread, new Object[0]);
            case 13:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_call_calendar_spread, new Object[0]);
            case 14:
            case 15:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_put_calendar_spread, new Object[0]);
            case 16:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_put_calendar_spread, new Object[0]);
            case 17:
            case 18:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_straddle, new Object[0]);
            case 19:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_straddle, new Object[0]);
            case 20:
            case 21:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_strangle, new Object[0]);
            case 22:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_strangle, new Object[0]);
            case 23:
            case 24:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_iron_condor, new Object[0]);
            case 25:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_iron_condor, new Object[0]);
            case 26:
            case 27:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_iron_butterfly, new Object[0]);
            case 28:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_iron_butterfly, new Object[0]);
            case 29:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_call_condor, new Object[0]);
            case 30:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_put_condor, new Object[0]);
            case 31:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_call_condor, new Object[0]);
            case 32:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_put_condor, new Object[0]);
            case 33:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_call_butterfly, new Object[0]);
            case 34:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_short_put_butterfly, new Object[0]);
            case 35:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_call_butterfly, new Object[0]);
            case 36:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_long_put_butterfly, new Object[0]);
            case 37:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_back_spread_call, new Object[0]);
            case 38:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_back_spread_put, new Object[0]);
            case 39:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_front_spread_call, new Object[0]);
            case 40:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_front_spread_put, new Object[0]);
            case 41:
            case 42:
            case 43:
                return StringResource.INSTANCE.invoke(C11048R.string.option_strategy_custom, Integer.valueOf(i));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
