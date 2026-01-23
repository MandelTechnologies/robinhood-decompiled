package kotlinx.coroutines.rx2;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RxAwait.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lkotlinx/coroutines/rx2/Mode;", "", Constants.RequestParamsKeys.SESSION_ID_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getS", "()Ljava/lang/String;", "FIRST", "FIRST_OR_DEFAULT", "LAST", "SINGLE", "toString", "kotlinx-coroutines-rx2"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.rx2.Mode, reason: use source file name */
/* loaded from: classes14.dex */
final class RxAwait2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RxAwait2[] $VALUES;
    public static final RxAwait2 FIRST = new RxAwait2("FIRST", 0, "awaitFirst");
    public static final RxAwait2 FIRST_OR_DEFAULT = new RxAwait2("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
    public static final RxAwait2 LAST = new RxAwait2("LAST", 2, "awaitLast");
    public static final RxAwait2 SINGLE = new RxAwait2("SINGLE", 3, "awaitSingle");
    private final String s;

    private static final /* synthetic */ RxAwait2[] $values() {
        return new RxAwait2[]{FIRST, FIRST_OR_DEFAULT, LAST, SINGLE};
    }

    public static EnumEntries<RxAwait2> getEntries() {
        return $ENTRIES;
    }

    private RxAwait2(String str, int i, String str2) {
        this.s = str2;
    }

    public final String getS() {
        return this.s;
    }

    static {
        RxAwait2[] rxAwait2Arr$values = $values();
        $VALUES = rxAwait2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(rxAwait2Arr$values);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.s;
    }

    public static RxAwait2 valueOf(String str) {
        return (RxAwait2) Enum.valueOf(RxAwait2.class, str);
    }

    public static RxAwait2[] values() {
        return (RxAwait2[]) $VALUES.clone();
    }
}
