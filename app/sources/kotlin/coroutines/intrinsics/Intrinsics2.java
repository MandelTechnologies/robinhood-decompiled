package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intrinsics.kt */
@SinceKotlin
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "<init>", "(Ljava/lang/String;I)V", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@PublishedApi
/* renamed from: kotlin.coroutines.intrinsics.CoroutineSingletons, reason: use source file name */
/* loaded from: classes21.dex */
public final class Intrinsics2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Intrinsics2[] $VALUES;
    public static final Intrinsics2 COROUTINE_SUSPENDED = new Intrinsics2("COROUTINE_SUSPENDED", 0);
    public static final Intrinsics2 UNDECIDED = new Intrinsics2("UNDECIDED", 1);
    public static final Intrinsics2 RESUMED = new Intrinsics2("RESUMED", 2);

    private static final /* synthetic */ Intrinsics2[] $values() {
        return new Intrinsics2[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    public static EnumEntries<Intrinsics2> getEntries() {
        return $ENTRIES;
    }

    private Intrinsics2(String str, int i) {
    }

    static {
        Intrinsics2[] intrinsics2Arr$values = $values();
        $VALUES = intrinsics2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(intrinsics2Arr$values);
    }

    public static Intrinsics2 valueOf(String str) {
        return (Intrinsics2) Enum.valueOf(Intrinsics2.class, str);
    }

    public static Intrinsics2[] values() {
        return (Intrinsics2[]) $VALUES.clone();
    }
}
