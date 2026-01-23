package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InternalMutatorMutex.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Landroidx/compose/animation/core/MutatePriority;", "", "(Ljava/lang/String;I)V", "Default", "UserInput", "PreventUserInput", "animation-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.animation.core.MutatePriority, reason: use source file name */
/* loaded from: classes.dex */
public final class InternalMutatorMutex2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InternalMutatorMutex2[] $VALUES;
    public static final InternalMutatorMutex2 Default = new InternalMutatorMutex2("Default", 0);
    public static final InternalMutatorMutex2 UserInput = new InternalMutatorMutex2("UserInput", 1);
    public static final InternalMutatorMutex2 PreventUserInput = new InternalMutatorMutex2("PreventUserInput", 2);

    private static final /* synthetic */ InternalMutatorMutex2[] $values() {
        return new InternalMutatorMutex2[]{Default, UserInput, PreventUserInput};
    }

    public static EnumEntries<InternalMutatorMutex2> getEntries() {
        return $ENTRIES;
    }

    public static InternalMutatorMutex2 valueOf(String str) {
        return (InternalMutatorMutex2) Enum.valueOf(InternalMutatorMutex2.class, str);
    }

    public static InternalMutatorMutex2[] values() {
        return (InternalMutatorMutex2[]) $VALUES.clone();
    }

    private InternalMutatorMutex2(String str, int i) {
    }

    static {
        InternalMutatorMutex2[] internalMutatorMutex2Arr$values = $values();
        $VALUES = internalMutatorMutex2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(internalMutatorMutex2Arr$values);
    }
}
