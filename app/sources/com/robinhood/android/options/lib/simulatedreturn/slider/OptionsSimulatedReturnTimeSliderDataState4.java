package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: OptionsSimulatedReturnTimeSliderDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"FIVE_MIN_IN_SEC", "", "ONE_HOUR_IN_SEC", "THREE_HOUR_IN_SEC", "ONE_DAY_IN_SEC", "SEVEN_DAY_IN_SEC", "ONE_TO_ELEVEN_DAYS", "Lkotlin/ranges/IntRange;", "getONE_TO_ELEVEN_DAYS", "()Lkotlin/ranges/IntRange;", "TWELVE_TO_THIRTY_FIVE_DAYS", "getTWELVE_TO_THIRTY_FIVE_DAYS", "THIRTY_SIX_TO_TWO_HUNDRED_AND_SEVENTY_NINE_DAYS", "getTHIRTY_SIX_TO_TWO_HUNDRED_AND_SEVENTY_NINE_DAYS", "EMPTY_SLIDER_DAY_SPAN", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnTimeSliderDataState4 {
    public static final int EMPTY_SLIDER_DAY_SPAN = 30;
    public static final int FIVE_MIN_IN_SEC = 300;
    public static final int ONE_DAY_IN_SEC = 86400;
    public static final int ONE_HOUR_IN_SEC = 3600;
    public static final int SEVEN_DAY_IN_SEC = 604800;
    public static final int THREE_HOUR_IN_SEC = 10800;
    private static final PrimitiveRanges2 ONE_TO_ELEVEN_DAYS = new PrimitiveRanges2(1, 11);
    private static final PrimitiveRanges2 TWELVE_TO_THIRTY_FIVE_DAYS = new PrimitiveRanges2(12, 35);
    private static final PrimitiveRanges2 THIRTY_SIX_TO_TWO_HUNDRED_AND_SEVENTY_NINE_DAYS = new PrimitiveRanges2(36, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);

    public static final PrimitiveRanges2 getONE_TO_ELEVEN_DAYS() {
        return ONE_TO_ELEVEN_DAYS;
    }

    public static final PrimitiveRanges2 getTWELVE_TO_THIRTY_FIVE_DAYS() {
        return TWELVE_TO_THIRTY_FIVE_DAYS;
    }

    public static final PrimitiveRanges2 getTHIRTY_SIX_TO_TWO_HUNDRED_AND_SEVENTY_NINE_DAYS() {
        return THIRTY_SIX_TO_TWO_HUNDRED_AND_SEVENTY_NINE_DAYS;
    }
}
