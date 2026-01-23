package p479j$.time;

import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.o */
/* loaded from: classes29.dex */
public abstract /* synthetic */ class AbstractC45793o {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6905a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f6906b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f6906b = iArr;
        try {
            iArr[ChronoUnit.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6906b[ChronoUnit.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6906b[ChronoUnit.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6906b[ChronoUnit.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6906b[ChronoUnit.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[ChronoField.values().length];
        f6905a = iArr2;
        try {
            iArr2[ChronoField.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6905a[ChronoField.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f6905a[ChronoField.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
