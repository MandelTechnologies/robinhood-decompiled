package com.robinhood.android.common.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GcmManager.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/util/RegisterDevicePromptMode;", "", "<init>", "(Ljava/lang/String;I)V", "NO_PROMPT", "ALLOW_PROMPT", "FORCE_PROMPT", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.RegisterDevicePromptMode, reason: use source file name */
/* loaded from: classes17.dex */
public final class GcmManager2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GcmManager2[] $VALUES;
    public static final GcmManager2 NO_PROMPT = new GcmManager2("NO_PROMPT", 0);
    public static final GcmManager2 ALLOW_PROMPT = new GcmManager2("ALLOW_PROMPT", 1);
    public static final GcmManager2 FORCE_PROMPT = new GcmManager2("FORCE_PROMPT", 2);

    private static final /* synthetic */ GcmManager2[] $values() {
        return new GcmManager2[]{NO_PROMPT, ALLOW_PROMPT, FORCE_PROMPT};
    }

    public static EnumEntries<GcmManager2> getEntries() {
        return $ENTRIES;
    }

    private GcmManager2(String str, int i) {
    }

    static {
        GcmManager2[] gcmManager2Arr$values = $values();
        $VALUES = gcmManager2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(gcmManager2Arr$values);
    }

    public static GcmManager2 valueOf(String str) {
        return (GcmManager2) Enum.valueOf(GcmManager2.class, str);
    }

    public static GcmManager2[] values() {
        return (GcmManager2[]) $VALUES.clone();
    }
}
