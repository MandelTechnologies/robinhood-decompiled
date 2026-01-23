package p479j$.time.chrono;

import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.g */
/* loaded from: classes29.dex */
public abstract /* synthetic */ class AbstractC45733g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6730a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f6730a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6730a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
