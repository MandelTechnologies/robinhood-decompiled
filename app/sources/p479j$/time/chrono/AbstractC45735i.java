package p479j$.time.chrono;

import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.i */
/* loaded from: classes29.dex */
public abstract /* synthetic */ class AbstractC45735i {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6734a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f6734a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6734a[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6734a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6734a[ChronoField.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6734a[ChronoField.YEAR_OF_ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6734a[ChronoField.ERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
