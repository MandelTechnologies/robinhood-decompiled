package p479j$.time.format;

import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.format.h */
/* loaded from: classes29.dex */
public final class C45766h implements InterfaceC45763e {

    /* renamed from: a */
    public final /* synthetic */ int f6832a;

    /* renamed from: b */
    public final Object f6833b;

    public /* synthetic */ C45766h(Object obj, int i) {
        this.f6832a = i;
        this.f6833b = obj;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        switch (this.f6832a) {
            case 0:
                Long lM3590a = c45782x.m3590a(ChronoField.OFFSET_SECONDS);
                if (lM3590a != null) {
                    sb.append("GMT");
                    int intExact = Math.toIntExact(lM3590a.longValue());
                    if (intExact != 0) {
                        int iAbs = Math.abs((intExact / OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC) % 100);
                        int iAbs2 = Math.abs((intExact / 60) % 60);
                        int iAbs3 = Math.abs(intExact % 60);
                        sb.append(intExact < 0 ? "-" : "+");
                        if (((TextStyle) this.f6833b) == TextStyle.FULL) {
                            m3564a(sb, iAbs);
                            sb.append(':');
                            m3564a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                m3564a(sb, iAbs3);
                                break;
                            }
                        } else {
                            if (iAbs >= 10) {
                                sb.append((char) ((iAbs / 10) + 48));
                            }
                            sb.append((char) ((iAbs % 10) + 48));
                            if (iAbs2 != 0 || iAbs3 != 0) {
                                sb.append(':');
                                m3564a(sb, iAbs2);
                                if (iAbs3 != 0) {
                                    sb.append(':');
                                    m3564a(sb, iAbs3);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                sb.append((String) this.f6833b);
                break;
        }
        return true;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        int i2;
        int iM3565b;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.f6832a) {
            case 0:
                int length = charSequence.length();
                if (c45780v.m3589h(charSequence, i, "GMT", 0, 3)) {
                    int i7 = i + 3;
                    if (i7 == length) {
                        return c45780v.m3588g(ChronoField.OFFSET_SECONDS, 0L, i, i7);
                    }
                    char cCharAt = charSequence.charAt(i7);
                    if (cCharAt == '+') {
                        i2 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return c45780v.m3588g(ChronoField.OFFSET_SECONDS, 0L, i, i7);
                        }
                        i2 = -1;
                    }
                    int i8 = i + 4;
                    int i9 = 0;
                    if (((TextStyle) this.f6833b) == TextStyle.FULL) {
                        int i10 = i + 5;
                        int iM3565b2 = m3565b(charSequence, i8);
                        int i11 = i + 6;
                        int iM3565b3 = m3565b(charSequence, i10);
                        if (iM3565b2 >= 0 && iM3565b3 >= 0) {
                            int i12 = i + 7;
                            if (charSequence.charAt(i11) == ':') {
                                iM3565b = (iM3565b2 * 10) + iM3565b3;
                                int iM3565b4 = m3565b(charSequence, i12);
                                i6 = i + 9;
                                int iM3565b5 = m3565b(charSequence, i + 8);
                                if (iM3565b4 >= 0 && iM3565b5 >= 0) {
                                    i5 = (iM3565b4 * 10) + iM3565b5;
                                    int i13 = i + 11;
                                    if (i13 < length && charSequence.charAt(i6) == ':') {
                                        int iM3565b6 = m3565b(charSequence, i + 10);
                                        int iM3565b7 = m3565b(charSequence, i13);
                                        if (iM3565b6 >= 0 && iM3565b7 >= 0) {
                                            i9 = (iM3565b6 * 10) + iM3565b7;
                                            i6 = i + 12;
                                        }
                                    }
                                    i3 = i9;
                                    i4 = i6;
                                }
                            }
                        }
                    } else {
                        int i14 = i + 5;
                        iM3565b = m3565b(charSequence, i8);
                        if (iM3565b >= 0) {
                            if (i14 < length) {
                                int iM3565b8 = m3565b(charSequence, i14);
                                if (iM3565b8 >= 0) {
                                    iM3565b = (iM3565b * 10) + iM3565b8;
                                    i14 = i + 6;
                                }
                                int i15 = i14 + 2;
                                if (i15 < length && charSequence.charAt(i14) == ':' && i15 < length && charSequence.charAt(i14) == ':') {
                                    int iM3565b9 = m3565b(charSequence, i14 + 1);
                                    int iM3565b10 = m3565b(charSequence, i15);
                                    if (iM3565b9 >= 0 && iM3565b10 >= 0) {
                                        i5 = (iM3565b9 * 10) + iM3565b10;
                                        int i16 = i14 + 3;
                                        int i17 = i14 + 5;
                                        if (i17 < length && charSequence.charAt(i16) == ':') {
                                            int iM3565b11 = m3565b(charSequence, i14 + 4);
                                            int iM3565b12 = m3565b(charSequence, i17);
                                            if (iM3565b11 >= 0 && iM3565b12 >= 0) {
                                                i9 = (iM3565b11 * 10) + iM3565b12;
                                                i6 = i14 + 6;
                                                i3 = i9;
                                                i4 = i6;
                                            }
                                        }
                                        i4 = i16;
                                        i3 = 0;
                                    }
                                }
                            }
                            i3 = 0;
                            i4 = i14;
                            return c45780v.m3588g(ChronoField.OFFSET_SECONDS, ((i9 * 60) + (iM3565b * 3600) + i3) * i2, i, i4);
                        }
                    }
                    i9 = i5;
                    return c45780v.m3588g(ChronoField.OFFSET_SECONDS, ((i9 * 60) + (iM3565b * 3600) + i3) * i2, i, i4);
                }
                return ~i;
            default:
                String str = (String) this.f6833b;
                if (i > charSequence.length() || i < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !c45780v.m3589h(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
        }
    }

    public final String toString() {
        switch (this.f6832a) {
            case 0:
                return "LocalizedOffset(" + ((TextStyle) this.f6833b) + ")";
            default:
                return "'" + ((String) this.f6833b).replace("'", "''") + "'";
        }
    }

    /* renamed from: a */
    public static void m3564a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* renamed from: b */
    public static int m3565b(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
