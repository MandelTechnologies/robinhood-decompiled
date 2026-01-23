package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MutatorMutex.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Landroidx/compose/foundation/MutatePriority;", "", "(Ljava/lang/String;I)V", "Default", "UserInput", "PreventUserInput", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.MutatePriority, reason: use source file name */
/* loaded from: classes4.dex */
public final class MutatorMutex2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MutatorMutex2[] $VALUES;
    public static final MutatorMutex2 Default = new MutatorMutex2("Default", 0);
    public static final MutatorMutex2 UserInput = new MutatorMutex2("UserInput", 1);
    public static final MutatorMutex2 PreventUserInput = new MutatorMutex2("PreventUserInput", 2);

    private static final /* synthetic */ MutatorMutex2[] $values() {
        return new MutatorMutex2[]{Default, UserInput, PreventUserInput};
    }

    public static EnumEntries<MutatorMutex2> getEntries() {
        return $ENTRIES;
    }

    public static MutatorMutex2 valueOf(String str) {
        return (MutatorMutex2) Enum.valueOf(MutatorMutex2.class, str);
    }

    public static MutatorMutex2[] values() {
        return (MutatorMutex2[]) $VALUES.clone();
    }

    private MutatorMutex2(String str, int i) {
    }

    static {
        MutatorMutex2[] mutatorMutex2Arr$values = $values();
        $VALUES = mutatorMutex2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(mutatorMutex2Arr$values);
    }
}
