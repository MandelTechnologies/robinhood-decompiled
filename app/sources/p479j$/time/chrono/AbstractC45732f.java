package p479j$.time.chrono;

import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.f */
/* loaded from: classes29.dex */
public abstract /* synthetic */ class AbstractC45732f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6729a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f6729a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6729a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
