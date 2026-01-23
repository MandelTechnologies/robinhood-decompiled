package p479j$.time.format;

import com.robinhood.store.supportchat.ChatImageUtils;
import com.squareup.wire.internal.MathMethods;
import java.math.BigInteger;
import p479j$.time.DateTimeException;
import p479j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.j */
/* loaded from: classes29.dex */
public class C45768j implements InterfaceC45763e {

    /* renamed from: f */
    public static final long[] f6837f = {0, 10, 100, 1000, 10000, 100000, 1000000, ChatImageUtils.IMAGE_FILE_FINAL_SIZE_LIMIT_IN_BYTES, 100000000, MathMethods.NANOS_PER_SECOND, 10000000000L};

    /* renamed from: a */
    public final TemporalField f6838a;

    /* renamed from: b */
    public final int f6839b;

    /* renamed from: c */
    public final int f6840c;

    /* renamed from: d */
    public final SignStyle f6841d;

    /* renamed from: e */
    public final int f6842e;

    /* renamed from: a */
    public long mo3567a(C45782x c45782x, long j) {
        return j;
    }

    public C45768j(TemporalField temporalField, int i, int i2, SignStyle signStyle) {
        this.f6838a = temporalField;
        this.f6839b = i;
        this.f6840c = i2;
        this.f6841d = signStyle;
        this.f6842e = 0;
    }

    public C45768j(TemporalField temporalField, int i, int i2, SignStyle signStyle, int i3) {
        this.f6838a = temporalField;
        this.f6839b = i;
        this.f6840c = i2;
        this.f6841d = signStyle;
        this.f6842e = i3;
    }

    /* renamed from: e */
    public C45768j mo3562e() {
        if (this.f6842e == -1) {
            return this;
        }
        return new C45768j(this.f6838a, this.f6839b, this.f6840c, this.f6841d, -1);
    }

    /* renamed from: f */
    public C45768j mo3563f(int i) {
        return new C45768j(this.f6838a, this.f6839b, this.f6840c, this.f6841d, this.f6842e + i);
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        TemporalField temporalField = this.f6838a;
        Long lM3590a = c45782x.m3590a(temporalField);
        if (lM3590a == null) {
            return false;
        }
        long jMo3567a = mo3567a(c45782x, lM3590a.longValue());
        DecimalStyle decimalStyle = c45782x.f6890b.f6802c;
        String string2 = jMo3567a == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jMo3567a));
        int length = string2.length();
        int i = this.f6840c;
        if (length > i) {
            throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + jMo3567a + " exceeds the maximum print width of " + i);
        }
        String strM3558a = decimalStyle.m3558a(string2);
        int i2 = this.f6839b;
        SignStyle signStyle = this.f6841d;
        if (jMo3567a >= 0) {
            int i3 = AbstractC45760b.f6826a[signStyle.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jMo3567a >= f6837f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC45760b.f6826a[signStyle.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append(decimalStyle.f6818b);
            } else if (i4 == 4) {
                throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + jMo3567a + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - strM3558a.length(); i5++) {
            sb.append(decimalStyle.f6817a);
        }
        sb.append(strM3558a);
        return true;
    }

    /* renamed from: b */
    public boolean mo3561b(C45780v c45780v) {
        int i = this.f6842e;
        if (i != -1) {
            return i > 0 && this.f6839b == this.f6840c && this.f6841d == SignStyle.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x014d, code lost:
    
        if (r2 <= r10) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0172  */
    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        int i2;
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        int i3;
        long j;
        long j2;
        boolean z3;
        int length = charSequence.length();
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        DecimalStyle decimalStyle = c45780v.f6880a.f6802c;
        decimalStyle.getClass();
        int i4 = this.f6840c;
        SignStyle signStyle = this.f6841d;
        int i5 = this.f6839b;
        int i6 = 0;
        boolean z4 = true;
        if (cCharAt == '+') {
            boolean z5 = c45780v.f6882c;
            boolean z6 = i5 == i4;
            int iOrdinal = signStyle.ordinal();
            if (iOrdinal == 0 ? z5 : !(iOrdinal == 1 || iOrdinal == 4 || (!z5 && !z6))) {
                return ~i;
            }
            i2 = i + 1;
            z = false;
            z2 = true;
        } else if (cCharAt == decimalStyle.f6818b) {
            boolean z7 = c45780v.f6882c;
            boolean z8 = i5 == i4;
            int iOrdinal2 = signStyle.ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z7 || z8)) {
                return ~i;
            }
            i2 = i + 1;
            z2 = false;
            z = true;
        } else {
            if (signStyle == SignStyle.ALWAYS && c45780v.f6882c) {
                return ~i;
            }
            i2 = i;
            z = false;
            z2 = false;
        }
        int i7 = (c45780v.f6882c || mo3561b(c45780v)) ? i5 : 1;
        int i8 = i2 + i7;
        if (i8 > length) {
            return ~i2;
        }
        if (!c45780v.f6882c && !mo3561b(c45780v)) {
            i4 = 9;
        }
        int i9 = this.f6842e;
        int iMax = Math.max(i9, 0) + i4;
        while (true) {
            bigIntegerAdd = null;
            if (i6 >= 2) {
                i3 = i2;
                j = 0;
                break;
            }
            int iMin = Math.min(iMax + i2, length);
            i3 = i2;
            j2 = 0;
            while (true) {
                if (i3 >= iMin) {
                    z3 = z4;
                    break;
                }
                int i10 = i3 + 1;
                z3 = z4;
                int iCharAt = charSequence.charAt(i3) - c45780v.f6880a.f6802c.f6817a;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt >= 0) {
                    if (i10 - i2 > 18) {
                        if (bigIntegerAdd == null) {
                            bigIntegerAdd = BigInteger.valueOf(j2);
                        }
                        bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iCharAt));
                    } else {
                        j2 = (j2 * 10) + iCharAt;
                    }
                    i3 = i10;
                    z4 = z3;
                } else if (i3 < i8) {
                    return ~i2;
                }
            }
            if (i9 <= 0 || i6 != 0) {
                break;
            }
            iMax = Math.max(i7, (i3 - i2) - i9);
            i6++;
            z4 = z3;
        }
        j = j2;
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z) {
            if (bigIntegerDivide == null) {
                if (j != 0 || !c45780v.f6882c) {
                    j = -j;
                    long j3 = j;
                    if (bigIntegerDivide == null) {
                    }
                }
                return ~(i2 - 1);
            }
            if (!bigIntegerDivide.equals(BigInteger.ZERO) || !c45780v.f6882c) {
                bigIntegerDivide = bigIntegerDivide.negate();
                long j32 = j;
                if (bigIntegerDivide == null) {
                    return mo3568d(c45780v, j32, i2, i3);
                }
                if (bigIntegerDivide.bitLength() > 63) {
                    bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                    i3--;
                }
                return mo3568d(c45780v, bigIntegerDivide.longValue(), i2, i3);
            }
            return ~(i2 - 1);
        }
        if (signStyle == SignStyle.EXCEEDS_PAD && c45780v.f6882c) {
            int i11 = i3 - i2;
            if (!z2) {
                if (i11 > i5) {
                    return ~i2;
                }
            }
        }
        long j322 = j;
        if (bigIntegerDivide == null) {
        }
    }

    /* renamed from: d */
    public int mo3568d(C45780v c45780v, long j, int i, int i2) {
        return c45780v.m3588g(this.f6838a, j, i, i2);
    }

    public String toString() {
        int i = this.f6840c;
        TemporalField temporalField = this.f6838a;
        SignStyle signStyle = this.f6841d;
        int i2 = this.f6839b;
        if (i2 == 1 && i == 19 && signStyle == SignStyle.NORMAL) {
            return "Value(" + temporalField + ")";
        }
        if (i2 == i && signStyle == SignStyle.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i2 + ")";
        }
        return "Value(" + temporalField + "," + i2 + "," + i + "," + signStyle + ")";
    }
}
