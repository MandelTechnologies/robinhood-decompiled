package com.plaid.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.k6 */
/* loaded from: classes16.dex */
public final class EnumC7127k6 {
    public static final EnumC7127k6 ENQUEUE;
    public static final EnumC7127k6 ENQUEUE_AND_FLUSH;
    public static final EnumC7127k6 NO_ENQUEUE;
    public static final EnumC7127k6 UNKNOWN;

    /* renamed from: b */
    public static final /* synthetic */ EnumC7127k6[] f2905b;

    /* renamed from: c */
    public static final /* synthetic */ EnumEntries f2906c;

    /* renamed from: a */
    public final String f2907a;

    static {
        EnumC7127k6 enumC7127k6 = new EnumC7127k6("ENQUEUE", 0, "QUEUE_BEHAVIOR_ENQUEUE");
        ENQUEUE = enumC7127k6;
        EnumC7127k6 enumC7127k62 = new EnumC7127k6("ENQUEUE_AND_FLUSH", 1, "QUEUE_BEHAVIOR_ENQUEUE_AND_FLUSH");
        ENQUEUE_AND_FLUSH = enumC7127k62;
        EnumC7127k6 enumC7127k63 = new EnumC7127k6("NO_ENQUEUE", 2, "QUEUE_BEHAVIOR_NO_ENQUEUE");
        NO_ENQUEUE = enumC7127k63;
        EnumC7127k6 enumC7127k64 = new EnumC7127k6("UNKNOWN", 3, "QUEUE_BEHAVIOR_UNKNOWN");
        UNKNOWN = enumC7127k64;
        EnumC7127k6[] enumC7127k6Arr = {enumC7127k6, enumC7127k62, enumC7127k63, enumC7127k64};
        f2905b = enumC7127k6Arr;
        f2906c = EnumEntries2.enumEntries(enumC7127k6Arr);
    }

    public EnumC7127k6(String str, int i, String str2) {
        this.f2907a = str2;
    }

    public static EnumEntries<EnumC7127k6> getEntries() {
        return f2906c;
    }

    public static EnumC7127k6 valueOf(String str) {
        return (EnumC7127k6) Enum.valueOf(EnumC7127k6.class, str);
    }

    public static EnumC7127k6[] values() {
        return (EnumC7127k6[]) f2905b.clone();
    }

    public final String getProtoString() {
        return this.f2907a;
    }
}
