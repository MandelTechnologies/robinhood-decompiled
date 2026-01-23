package p479j$.time.chrono;

import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.ValueRange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.m */
/* loaded from: classes29.dex */
public final class EnumC45739m implements Era {

    /* renamed from: AH */
    public static final EnumC45739m f6752AH;

    /* renamed from: a */
    public static final /* synthetic */ EnumC45739m[] f6753a;

    @Override // p479j$.time.chrono.Era
    public final int getValue() {
        return 1;
    }

    public static EnumC45739m valueOf(String str) {
        return (EnumC45739m) Enum.valueOf(EnumC45739m.class, str);
    }

    public static EnumC45739m[] values() {
        return (EnumC45739m[]) f6753a.clone();
    }

    static {
        EnumC45739m enumC45739m = new EnumC45739m("AH", 0);
        f6752AH = enumC45739m;
        f6753a = new EnumC45739m[]{enumC45739m};
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return ValueRange.m3598of(1L, 1L);
        }
        return super.range(temporalField);
    }
}
