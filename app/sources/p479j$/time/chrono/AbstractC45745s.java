package p479j$.time.chrono;

import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.s */
/* loaded from: classes29.dex */
public abstract /* synthetic */ class AbstractC45745s {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6766a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f6766a = iArr;
        try {
            iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6766a[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6766a[ChronoField.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
