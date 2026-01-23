package com.robinhood.android.retirement.lib;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UninvestedSection.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/lib/UninvestedDisplayStyle;", "", "<init>", "(Ljava/lang/String;I)V", "BottomSheet", "Fullscreen", "lib-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.lib.UninvestedDisplayStyle, reason: use source file name */
/* loaded from: classes5.dex */
public final class UninvestedSection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UninvestedSection[] $VALUES;
    public static final UninvestedSection BottomSheet = new UninvestedSection("BottomSheet", 0);
    public static final UninvestedSection Fullscreen = new UninvestedSection("Fullscreen", 1);

    private static final /* synthetic */ UninvestedSection[] $values() {
        return new UninvestedSection[]{BottomSheet, Fullscreen};
    }

    public static EnumEntries<UninvestedSection> getEntries() {
        return $ENTRIES;
    }

    private UninvestedSection(String str, int i) {
    }

    static {
        UninvestedSection[] uninvestedSectionArr$values = $values();
        $VALUES = uninvestedSectionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(uninvestedSectionArr$values);
    }

    public static UninvestedSection valueOf(String str) {
        return (UninvestedSection) Enum.valueOf(UninvestedSection.class, str);
    }

    public static UninvestedSection[] values() {
        return (UninvestedSection[]) $VALUES.clone();
    }
}
