package com.withpersona.sdk2.inquiry.shared.p422ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenWithTransition.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenTransition;", "", "<init>", "(Ljava/lang/String;I)V", "SLIDE_IN", "SLIDE_OUT", "NONE", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.ui.ScreenTransition, reason: use source file name */
/* loaded from: classes18.dex */
public final class ScreenWithTransition2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenWithTransition2[] $VALUES;
    public static final ScreenWithTransition2 SLIDE_IN = new ScreenWithTransition2("SLIDE_IN", 0);
    public static final ScreenWithTransition2 SLIDE_OUT = new ScreenWithTransition2("SLIDE_OUT", 1);
    public static final ScreenWithTransition2 NONE = new ScreenWithTransition2("NONE", 2);

    private static final /* synthetic */ ScreenWithTransition2[] $values() {
        return new ScreenWithTransition2[]{SLIDE_IN, SLIDE_OUT, NONE};
    }

    public static EnumEntries<ScreenWithTransition2> getEntries() {
        return $ENTRIES;
    }

    private ScreenWithTransition2(String str, int i) {
    }

    static {
        ScreenWithTransition2[] screenWithTransition2Arr$values = $values();
        $VALUES = screenWithTransition2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(screenWithTransition2Arr$values);
    }

    public static ScreenWithTransition2 valueOf(String str) {
        return (ScreenWithTransition2) Enum.valueOf(ScreenWithTransition2.class, str);
    }

    public static ScreenWithTransition2[] values() {
        return (ScreenWithTransition2[]) $VALUES.clone();
    }
}
