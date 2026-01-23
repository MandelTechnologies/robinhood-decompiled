package p479j$.time.chrono;

import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.y */
/* loaded from: classes29.dex */
public abstract /* synthetic */ class AbstractC45751y {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6773a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f6773a = iArr;
        try {
            iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6773a[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6773a[ChronoField.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
