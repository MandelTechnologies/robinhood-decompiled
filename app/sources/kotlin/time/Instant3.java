package kotlin.time;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.investFlow.InvestFlowConstants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* compiled from: Instant.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lkotlin/time/Instant;", GoldFeature.INSTANT, "", "formatIso", "(Lkotlin/time/Instant;)Ljava/lang/String;", "", "POWERS_OF_TEN", "[I", "asciiDigitPositionsInIsoStringAfterYear", "colonsInIsoOffsetString", "asciiDigitsInIsoOffsetString", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlin.time.InstantKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Instant3 {
    private static final int[] POWERS_OF_TEN = {1, 10, 100, 1000, 10000, 100000, InvestFlowConstants.MAX_ONE_TIME_AMOUNT, 10000000, 100000000, 1000000000};
    private static final int[] asciiDigitPositionsInIsoStringAfterYear = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    private static final int[] colonsInIsoOffsetString = {3, 6};
    private static final int[] asciiDigitsInIsoOffsetString = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalTime
    public static final String formatIso(Instant instant) throws IOException {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        Instant4 instant4FromInstant = Instant4.INSTANCE.fromInstant(instant);
        int year = instant4FromInstant.getYear();
        int i = 0;
        if (Math.abs(year) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (year >= 0) {
                sb2.append(year + 10000);
                Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb2.append(year - 10000);
                Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (year >= 10000) {
                sb.append('+');
            }
            sb.append(year);
        }
        sb.append('-');
        formatIso$lambda$8$appendTwoDigits(sb, sb, instant4FromInstant.getMonth());
        sb.append('-');
        formatIso$lambda$8$appendTwoDigits(sb, sb, instant4FromInstant.getDay());
        sb.append('T');
        formatIso$lambda$8$appendTwoDigits(sb, sb, instant4FromInstant.getHour());
        sb.append(':');
        formatIso$lambda$8$appendTwoDigits(sb, sb, instant4FromInstant.getMinute());
        sb.append(':');
        formatIso$lambda$8$appendTwoDigits(sb, sb, instant4FromInstant.getSecond());
        if (instant4FromInstant.getNanosecond() != 0) {
            sb.append('.');
            while (true) {
                int nanosecond = instant4FromInstant.getNanosecond();
                iArr = POWERS_OF_TEN;
                int i2 = i + 1;
                if (nanosecond % iArr[i2] != 0) {
                    break;
                }
                i = i2;
            }
            int i3 = i - (i % 3);
            String strValueOf = String.valueOf((instant4FromInstant.getNanosecond() / iArr[i3]) + iArr[9 - i3]);
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb.append(strSubstring);
        }
        sb.append(Matrix.MATRIX_TYPE_ZERO);
        return sb.toString();
    }

    private static final void formatIso$lambda$8$appendTwoDigits(Appendable appendable, StringBuilder sb, int i) throws IOException {
        if (i < 10) {
            appendable.append('0');
        }
        sb.append(i);
    }
}
