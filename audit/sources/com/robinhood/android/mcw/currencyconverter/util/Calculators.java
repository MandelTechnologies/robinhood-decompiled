package com.robinhood.android.mcw.currencyconverter.util;

import android.view.KeyEvent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.mcw.currencyconverter.models.ConversionField;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: Calculators.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a&\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0018\u0010\t\u001a\u00020\n*\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0000¨\u0006\u000e"}, m3636d2 = {"convertedTo", "Ljava/math/BigDecimal;", "targetField", "Lcom/robinhood/android/mcw/currencyconverter/models/ConversionField;", "bidPrice", "boundedBy", "min", AnalyticsStrings.MAX_WELCOME_TAG, "balance", "mutatedWithKeyEvent", "", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "feature-mcw-currency-converter_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcw.currencyconverter.util.CalculatorsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Calculators {

    /* compiled from: Calculators.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcw.currencyconverter.util.CalculatorsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversionField.values().length];
            try {
                iArr[ConversionField.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConversionField.f4551TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BigDecimal convertedTo(BigDecimal bigDecimal, ConversionField targetField, BigDecimal bidPrice) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(targetField, "targetField");
        Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
        int i = WhenMappings.$EnumSwitchMapping$0[targetField.ordinal()];
        if (i == 1) {
            return BigDecimals7.safeDivide(bigDecimal, bidPrice);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return BigDecimals7.safeMultiply(bigDecimal, bidPrice);
    }

    public static final BigDecimal boundedBy(BigDecimal bigDecimal, BigDecimal min, BigDecimal max, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        if (bigDecimal2 != null) {
            max = max.min(bigDecimal2);
        }
        if (min.compareTo(max) <= 0) {
            return (BigDecimal) RangesKt.coerceIn(bigDecimal, min, max);
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    public static final String mutatedWithKeyEvent(String str, KeyEvent keyEvent) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        if (KeyEvents2.isDotOrPeriod(keyEvent)) {
            if (StringsKt.contains$default((CharSequence) str, '.', false, 2, (Object) null)) {
                return str;
            }
            return str + ".";
        }
        if (KeyEvents2.isDelete(keyEvent)) {
            return str.length() == 1 ? "0" : StringsKt.dropLast(str, 1);
        }
        if (KeyEvents2.isDigit(keyEvent)) {
            if (StringsKt.contains$default((CharSequence) str, '.', false, 2, (Object) null)) {
                str2 = str;
                if (((String) StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null).get(1)).length() == 2) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (Intrinsics.areEqual(str2, "0")) {
                return String.valueOf(keyEvent.getNumber());
            }
            return str2 + keyEvent.getNumber();
        }
        throw new IllegalArgumentException("Invalid key event: " + keyEvent);
    }
}
