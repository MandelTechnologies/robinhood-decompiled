package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SharingStarted.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "", "<init>", "(Ljava/lang/String;I)V", "START", "STOP", "STOP_AND_RESET_REPLAY_CACHE", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.flow.SharingCommand, reason: use source file name */
/* loaded from: classes23.dex */
public final class SharingStarted2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SharingStarted2[] $VALUES;
    public static final SharingStarted2 START = new SharingStarted2("START", 0);
    public static final SharingStarted2 STOP = new SharingStarted2("STOP", 1);
    public static final SharingStarted2 STOP_AND_RESET_REPLAY_CACHE = new SharingStarted2("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ SharingStarted2[] $values() {
        return new SharingStarted2[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    public static EnumEntries<SharingStarted2> getEntries() {
        return $ENTRIES;
    }

    private SharingStarted2(String str, int i) {
    }

    static {
        SharingStarted2[] sharingStarted2Arr$values = $values();
        $VALUES = sharingStarted2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(sharingStarted2Arr$values);
    }

    public static SharingStarted2 valueOf(String str) {
        return (SharingStarted2) Enum.valueOf(SharingStarted2.class, str);
    }

    public static SharingStarted2[] values() {
        return (SharingStarted2[]) $VALUES.clone();
    }
}
