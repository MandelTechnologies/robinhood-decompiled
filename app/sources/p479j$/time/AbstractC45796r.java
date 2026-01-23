package p479j$.time;

import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.r */
/* loaded from: classes29.dex */
public abstract /* synthetic */ class AbstractC45796r {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6912a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f6912a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6912a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
