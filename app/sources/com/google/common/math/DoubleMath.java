package com.google.common.math;

import java.math.RoundingMode;

/* loaded from: classes27.dex */
public final class DoubleMath {
    private static final double LN_2 = Math.log(2.0d);
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    static double roundIntermediate(double x, RoundingMode mode) {
        if (!DoubleUtils.isFinite(x)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C52501.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(x));
                return x;
            case 2:
                return (x >= 0.0d || isMathematicalInteger(x)) ? x : ((long) x) - 1;
            case 3:
                return (x <= 0.0d || isMathematicalInteger(x)) ? x : ((long) x) + 1;
            case 4:
                return x;
            case 5:
                if (isMathematicalInteger(x)) {
                    return x;
                }
                return ((long) x) + (x > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(x);
            case 7:
                double dRint = Math.rint(x);
                return Math.abs(x - dRint) == 0.5d ? x + Math.copySign(0.5d, x) : dRint;
            case 8:
                double dRint2 = Math.rint(x);
                return Math.abs(x - dRint2) == 0.5d ? x : dRint2;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: com.google.common.math.DoubleMath$1 */
    static /* synthetic */ class C52501 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static long roundToLong(double x, RoundingMode mode) {
        double dRoundIntermediate = roundIntermediate(x, mode);
        MathPreconditions.checkInRangeForRoundingInputs(((-9.223372036854776E18d) - dRoundIntermediate < 1.0d) & (dRoundIntermediate < 9.223372036854776E18d), x, mode);
        return (long) dRoundIntermediate;
    }

    public static boolean isMathematicalInteger(double x) {
        if (DoubleUtils.isFinite(x)) {
            return x == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(x)) <= Math.getExponent(x);
        }
        return false;
    }
}
