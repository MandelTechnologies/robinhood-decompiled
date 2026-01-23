package com.ionspin.kotlin.bignum.integer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlatformWorkarounds.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/Platform;", "", "(Ljava/lang/String;I)V", "JVM", "NATIVE", "JS", "WASMJS", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.ionspin.kotlin.bignum.integer.Platform, reason: use source file name */
/* loaded from: classes27.dex */
public final class PlatformWorkarounds {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PlatformWorkarounds[] $VALUES;
    public static final PlatformWorkarounds JVM = new PlatformWorkarounds("JVM", 0);
    public static final PlatformWorkarounds NATIVE = new PlatformWorkarounds("NATIVE", 1);

    /* renamed from: JS */
    public static final PlatformWorkarounds f964JS = new PlatformWorkarounds("JS", 2);
    public static final PlatformWorkarounds WASMJS = new PlatformWorkarounds("WASMJS", 3);

    private static final /* synthetic */ PlatformWorkarounds[] $values() {
        return new PlatformWorkarounds[]{JVM, NATIVE, f964JS, WASMJS};
    }

    public static EnumEntries<PlatformWorkarounds> getEntries() {
        return $ENTRIES;
    }

    public static PlatformWorkarounds valueOf(String str) {
        return (PlatformWorkarounds) Enum.valueOf(PlatformWorkarounds.class, str);
    }

    public static PlatformWorkarounds[] values() {
        return (PlatformWorkarounds[]) $VALUES.clone();
    }

    private PlatformWorkarounds(String str, int i) {
    }

    static {
        PlatformWorkarounds[] platformWorkaroundsArr$values = $values();
        $VALUES = platformWorkaroundsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(platformWorkaroundsArr$values);
    }
}
