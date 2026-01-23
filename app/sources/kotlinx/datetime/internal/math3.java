package kotlinx.datetime.internal;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: math.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"", "", "clampToInt", "(J)I", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "safeMultiplyOrZero", "(JJ)J", "c", "Lkotlinx/datetime/internal/DivRemResult;", "multiplyAndDivide", "(JJJ)Lkotlinx/datetime/internal/DivRemResult;", "d", Constants.RequestParamsKeys.APP_NAME_KEY, Constants.REVENUE_AMOUNT_KEY, "m", "multiplyAddAndDivide", "(JJJJ)J", "", "POWERS_OF_TEN", "[I", "getPOWERS_OF_TEN", "()[I", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.internal.MathKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class math3 {
    private static final int[] POWERS_OF_TEN = {1, 10, 100, 1000, 10000, 100000, InvestFlowConstants.MAX_ONE_TIME_AMOUNT, 10000000, 100000000, 1000000000};

    public static final int clampToInt(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final long safeMultiplyOrZero(long j, long j2) {
        if (j2 == -1) {
            if (j == Long.MIN_VALUE) {
                return 0L;
            }
            return -j;
        }
        if (j2 == 1) {
            return j;
        }
        long j3 = j * j2;
        if (j3 / j2 != j) {
            return 0L;
        }
        return j3;
    }

    public static final math2 multiplyAndDivide(long j, long j2, long j3) {
        if (j == 0 || j2 == 0) {
            return new math2(0L, 0L);
        }
        long jSafeMultiplyOrZero = safeMultiplyOrZero(j, j2);
        if (jSafeMultiplyOrZero != 0) {
            return new math2(jSafeMultiplyOrZero / j3, jSafeMultiplyOrZero % j3);
        }
        if (j2 == j3) {
            return new math2(j, 0L);
        }
        if (j == j3) {
            return new math2(j2, 0L);
        }
        long j4 = j >= 0 ? 0L : -1L;
        long j5 = j2 >= 0 ? 0L : -1L;
        long j6 = j & 4294967295L;
        long j7 = (j >> 32) & 4294967295L;
        long j8 = j2 & 4294967295L;
        long j9 = (j2 >> 32) & 4294967295L;
        long j10 = (j4 * j9) + (j7 * j5);
        long j11 = (j4 * j8) + (j7 * j9) + (j5 * j6);
        long j12 = j7 * j8;
        long j13 = j9 * j6;
        long j14 = j6 * j8;
        long j15 = j14 & 4294967295L;
        long j16 = (j12 & 4294967295L) + (j13 & 4294967295L) + ((j14 >> 32) & 4294967295L);
        long j17 = j16 & 4294967295L;
        long j18 = ((j16 >> 32) & 4294967295L) + (j11 & 4294967295L) + ((j12 >> 32) & 4294967295L) + ((j13 >> 32) & 4294967295L);
        long j19 = (j17 << 32) | j15;
        long j20 = (j18 & 4294967295L) | (((((j18 >> 32) & 4294967295L) + ((j11 >> 32) & 4294967295L)) + (j10 & 4294967295L)) << 32);
        int i = ((j20 >> 63) & 1) == 1 ? -1 : 1;
        if (i == -1) {
            j19 = (~j19) + 1;
            j20 = ~j20;
            if (j19 == 0) {
                j20++;
            }
        }
        int i2 = EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE;
        long j21 = 0;
        long j22 = 0;
        while (-1 < i2) {
            j22 = (j22 << 1) | ((i2 < 64 ? j19 >> i2 : j20 >> (i2 - 64)) & 1);
            if (j22 >= j3 || j22 < 0) {
                j22 -= j3;
                if (i2 >= 63) {
                    throw new ArithmeticException("The result of a multiplication followed by division overflows a long");
                }
                j21 |= 1 << i2;
            }
            i2--;
        }
        long j23 = i;
        return new math2(j21 * j23, j23 * j22);
    }

    public static final long multiplyAddAndDivide(long j, long j2, long j3, long j4) {
        if (j > 0 && j3 < 0) {
            j--;
            j3 += j2;
        } else if (j < 0 && j3 > 0) {
            j++;
            j3 -= j2;
        }
        long j5 = j;
        if (j5 == 0) {
            return j3 / j4;
        }
        math2 math2VarMultiplyAndDivide = multiplyAndDivide(j5, j2, j4);
        return mathJvm.safeAdd(math2VarMultiplyAndDivide.getQ(), mathJvm.safeAdd(j3 / j4, mathJvm.safeAdd(j3 % j4, math2VarMultiplyAndDivide.getR()) / j4));
    }

    public static final int[] getPOWERS_OF_TEN() {
        return POWERS_OF_TEN;
    }
}
