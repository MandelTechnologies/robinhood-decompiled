package p479j$.time.format;

import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import java.util.Objects;
import p479j$.time.DateTimeException;
import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.format.k */
/* loaded from: classes29.dex */
public final class C45769k implements InterfaceC45763e {

    /* renamed from: d */
    public static final String[] f6843d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e */
    public static final C45769k f6844e = new C45769k("+HH:MM:ss", "Z");

    /* renamed from: f */
    public static final C45769k f6845f = new C45769k("+HH:MM:ss", "0");

    /* renamed from: a */
    public final String f6846a;

    /* renamed from: b */
    public final int f6847b;

    /* renamed from: c */
    public final int f6848c;

    public C45769k(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i = 0;
        while (true) {
            String[] strArr = f6843d;
            if (i < strArr.length) {
                if (strArr[i].equals(str)) {
                    this.f6847b = i;
                    this.f6848c = i % 11;
                    this.f6846a = str2;
                    return;
                }
                i++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        Long lM3590a = c45782x.m3590a(ChronoField.OFFSET_SECONDS);
        boolean z = false;
        if (lM3590a == null) {
            return false;
        }
        int intExact = Math.toIntExact(lM3590a.longValue());
        String str = this.f6846a;
        if (intExact == 0) {
            sb.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb.length();
        sb.append(intExact < 0 ? "-" : "+");
        if (this.f6847b < 11 || iAbs >= 10) {
            m3569a(false, iAbs, sb);
        } else {
            sb.append((char) (iAbs + 48));
        }
        int i = this.f6848c;
        if ((i >= 3 && i <= 8) || ((i >= 9 && iAbs3 > 0) || (i >= 1 && iAbs2 > 0))) {
            m3569a(i > 0 && i % 2 == 0, iAbs2, sb);
            iAbs += iAbs2;
            if (i == 7 || i == 8 || (i >= 5 && iAbs3 > 0)) {
                if (i > 0 && i % 2 == 0) {
                    z = true;
                }
                m3569a(z, iAbs3, sb);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    /* renamed from: a */
    public static void m3569a(boolean z, int i, StringBuilder sb) {
        sb.append(z ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        CharSequence charSequence2;
        int i2;
        int i3;
        int i4;
        int i5;
        int length = charSequence.length();
        int length2 = this.f6846a.length();
        if (length2 == 0) {
            if (i == length) {
                return c45780v.m3588g(ChronoField.OFFSET_SECONDS, 0L, i, i);
            }
            charSequence2 = charSequence;
        } else {
            if (i == length) {
                return ~i;
            }
            charSequence2 = charSequence;
            if (c45780v.m3589h(charSequence2, i, this.f6846a, 0, length2)) {
                return c45780v.m3588g(ChronoField.OFFSET_SECONDS, 0L, i, i + length2);
            }
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            int i6 = cCharAt == '-' ? -1 : 1;
            int i7 = this.f6848c;
            boolean z = i7 > 0 && i7 % 2 == 0;
            int i8 = this.f6847b;
            boolean z2 = i8 < 11;
            int[] iArr = new int[4];
            iArr[0] = i + 1;
            if (!c45780v.f6882c) {
                if (z2) {
                    if (z || (i8 == 0 && length > (i5 = i + 3) && charSequence2.charAt(i5) == ':')) {
                        i8 = 10;
                        z = true;
                    } else {
                        i8 = 9;
                    }
                } else if (z || (i8 == 11 && length > (i4 = i + 3) && (charSequence2.charAt(i + 2) == ':' || charSequence2.charAt(i4) == ':'))) {
                    i8 = 21;
                    z = true;
                } else {
                    i8 = 20;
                }
            }
            switch (i8) {
                case 0:
                case 11:
                    m3571d(charSequence2, z2, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    m3571d(charSequence2, z2, iArr);
                    m3572e(charSequence2, z, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    m3571d(charSequence2, z2, iArr);
                    m3572e(charSequence2, z, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    m3571d(charSequence2, z2, iArr);
                    m3572e(charSequence2, z, true, iArr);
                    m3570b(charSequence2, z, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    m3571d(charSequence2, z2, iArr);
                    m3572e(charSequence2, z, true, iArr);
                    if (!m3570b(charSequence2, z, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    m3571d(charSequence2, z2, iArr);
                    if (m3570b(charSequence2, z, 2, iArr)) {
                        m3570b(charSequence2, z, 3, iArr);
                        break;
                    }
                    break;
                case 12:
                    m3573f(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    m3573f(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    m3573f(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    m3573f(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    m3573f(charSequence2, 1, 6, iArr);
                    break;
            }
            int i9 = iArr[0];
            if (i9 > 0) {
                int i10 = iArr[1];
                if (i10 > 23 || (i2 = iArr[2]) > 59 || (i3 = iArr[3]) > 59) {
                    throw new DateTimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return c45780v.m3588g(ChronoField.OFFSET_SECONDS, ((i2 * 60) + (i10 * 3600) + i3) * i6, i, i9);
            }
        }
        return length2 == 0 ? c45780v.m3588g(ChronoField.OFFSET_SECONDS, 0L, i, i) : ~i;
    }

    /* renamed from: d */
    public static void m3571d(CharSequence charSequence, boolean z, int[] iArr) {
        if (z) {
            if (m3570b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        m3573f(charSequence, 1, 2, iArr);
    }

    /* renamed from: e */
    public static void m3572e(CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
        if (m3570b(charSequence, z, 2, iArr) || !z2) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m3570b(CharSequence charSequence, boolean z, int i, int[] iArr) {
        int i2;
        int i3 = iArr[0];
        if (i3 < 0) {
            return true;
        }
        if (z && i != 1) {
            int i4 = i3 + 1;
            if (i4 <= charSequence.length() && charSequence.charAt(i3) == ':') {
                i3 = i4;
                i2 = i3 + 2;
                if (i2 <= charSequence.length()) {
                }
            }
        } else {
            i2 = i3 + 2;
            if (i2 <= charSequence.length()) {
                int i5 = i3 + 1;
                char cCharAt = charSequence.charAt(i3);
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    int i6 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (i6 >= 0 && i6 <= 59) {
                        iArr[i] = i6;
                        iArr[0] = i2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static void m3573f(CharSequence charSequence, int i, int i2, int[] iArr) {
        int i3;
        char cCharAt;
        int i4 = iArr[0];
        char[] cArr = new char[i2];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && (i3 = i4 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i4)) >= '0' && cCharAt <= '9') {
            cArr[i5] = cCharAt;
            i6++;
            i5++;
            i4 = i3;
        }
        if (i6 < i) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i6) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i4;
    }

    public final String toString() {
        String strReplace = this.f6846a.replace("'", "''");
        return "Offset(" + f6843d[this.f6847b] + ",'" + strReplace + "')";
    }
}
