package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intrinsic.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Landroidx/compose/foundation/layout/IntrinsicSize;", "", "(Ljava/lang/String;I)V", "Min", "Max", "foundation-layout_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.layout.IntrinsicSize, reason: use source file name */
/* loaded from: classes4.dex */
public final class Intrinsic4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Intrinsic4[] $VALUES;
    public static final Intrinsic4 Min = new Intrinsic4("Min", 0);
    public static final Intrinsic4 Max = new Intrinsic4("Max", 1);

    private static final /* synthetic */ Intrinsic4[] $values() {
        return new Intrinsic4[]{Min, Max};
    }

    public static EnumEntries<Intrinsic4> getEntries() {
        return $ENTRIES;
    }

    public static Intrinsic4 valueOf(String str) {
        return (Intrinsic4) Enum.valueOf(Intrinsic4.class, str);
    }

    public static Intrinsic4[] values() {
        return (Intrinsic4[]) $VALUES.clone();
    }

    private Intrinsic4(String str, int i) {
    }

    static {
        Intrinsic4[] intrinsic4Arr$values = $values();
        $VALUES = intrinsic4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(intrinsic4Arr$values);
    }
}
