package com.robinhood.shared.tradeladder.extensions;

import android.annotation.SuppressLint;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: Format.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0016\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\f\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, m3636d2 = {"formatWithPriceIncrement", "", "priceIncrements", "Ljava/math/BigDecimal;", "value", "coerceAtLeastForWholePriceIncrements", "", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Ljava/lang/String;", "formatQuantityNumber", "num", "side", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "formatRowQuantity", "postFix", "", "roundingMode", "Ljava/math/RoundingMode;", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.extensions.FormatKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Format3 {

    /* compiled from: Format.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.tradeladder.extensions.FormatKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Side.values().length];
            try {
                iArr[Side.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Side.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ String formatWithPriceIncrement$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return formatWithPriceIncrement(bigDecimal, bigDecimal2, num);
    }

    @SuppressLint({"DefaultLocale"})
    public static final String formatWithPriceIncrement(BigDecimal priceIncrements, BigDecimal value, Integer num) {
        Intrinsics.checkNotNullParameter(priceIncrements, "priceIncrements");
        Intrinsics.checkNotNullParameter(value, "value");
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(value);
        int iScale = priceIncrements.scale();
        if (iScale >= 0 && (num == null || iScale >= num.intValue())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%,." + iScale + "f", Arrays.copyOf(new Object[]{bigDecimalM822m}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (num != null) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%,." + num + "f", Arrays.copyOf(new Object[]{bigDecimalM822m}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str3 = String.format("%,f", Arrays.copyOf(new Object[]{bigDecimalM822m}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    public static final String formatQuantityNumber(BigDecimal num, Side side) {
        RoundingMode roundingMode;
        Intrinsics.checkNotNullParameter(num, "num");
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            roundingMode = RoundingMode.DOWN;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            roundingMode = RoundingMode.UP;
        }
        if (num.abs().compareTo(new BigDecimal("1000")) < 0) {
            String string2 = num.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
        if (num.abs().compareTo(new BigDecimal("1000000")) < 0) {
            BigDecimal bigDecimalDivide = num.divide(new BigDecimal("1000.0"));
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            return formatRowQuantity(bigDecimalDivide, 'K', roundingMode);
        }
        BigDecimal bigDecimalDivide2 = num.divide(new BigDecimal("1000000.0"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
        return formatRowQuantity(bigDecimalDivide2, 'M', roundingMode);
    }

    private static final String formatRowQuantity(BigDecimal bigDecimal, char c, RoundingMode roundingMode) {
        BigDecimal scale;
        String plainString = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) plainString, '.', 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0 && iIndexOf$default < 2) {
            scale = bigDecimal.setScale(2, roundingMode);
        } else if (iIndexOf$default == 2) {
            scale = bigDecimal.setScale(1, roundingMode);
        } else {
            scale = bigDecimal.setScale(0, roundingMode);
        }
        return zzah$$ExternalSyntheticBackportWithForwarding0.m822m(scale).toPlainString() + c;
    }
}
