package com.robinhood.scarlet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContextThemeWrapperBehavior.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/scarlet/ContextThemeWrapperBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "THROW", "IGNORE", "REPLACE", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ContextThemeWrapperBehavior {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContextThemeWrapperBehavior[] $VALUES;
    public static final ContextThemeWrapperBehavior THROW = new ContextThemeWrapperBehavior("THROW", 0);
    public static final ContextThemeWrapperBehavior IGNORE = new ContextThemeWrapperBehavior("IGNORE", 1);
    public static final ContextThemeWrapperBehavior REPLACE = new ContextThemeWrapperBehavior("REPLACE", 2);

    private static final /* synthetic */ ContextThemeWrapperBehavior[] $values() {
        return new ContextThemeWrapperBehavior[]{THROW, IGNORE, REPLACE};
    }

    public static EnumEntries<ContextThemeWrapperBehavior> getEntries() {
        return $ENTRIES;
    }

    private ContextThemeWrapperBehavior(String str, int i) {
    }

    static {
        ContextThemeWrapperBehavior[] contextThemeWrapperBehaviorArr$values = $values();
        $VALUES = contextThemeWrapperBehaviorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(contextThemeWrapperBehaviorArr$values);
    }

    public static ContextThemeWrapperBehavior valueOf(String str) {
        return (ContextThemeWrapperBehavior) Enum.valueOf(ContextThemeWrapperBehavior.class, str);
    }

    public static ContextThemeWrapperBehavior[] values() {
        return (ContextThemeWrapperBehavior[]) $VALUES.clone();
    }
}
