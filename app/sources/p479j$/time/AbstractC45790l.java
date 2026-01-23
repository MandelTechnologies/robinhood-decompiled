package p479j$.time;

import p479j$.time.temporal.ChronoField;

/* renamed from: j$.time.l */
/* loaded from: classes29.dex */
public abstract /* synthetic */ class AbstractC45790l {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6901a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f6901a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6901a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
