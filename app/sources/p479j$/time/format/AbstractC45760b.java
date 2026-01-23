package p479j$.time.format;

/* renamed from: j$.time.format.b */
/* loaded from: classes29.dex */
public abstract /* synthetic */ class AbstractC45760b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6826a;

    static {
        int[] iArr = new int[SignStyle.values().length];
        f6826a = iArr;
        try {
            iArr[SignStyle.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6826a[SignStyle.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6826a[SignStyle.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6826a[SignStyle.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
