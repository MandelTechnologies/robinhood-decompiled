package com.withpersona.sdk2.inquiry.steps.p423ui.styling;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StackStyling.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/StackState;", "", "<init>", "(Ljava/lang/String;I)V", "BASE", "ACTIVE", "DISABLED", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.StackState, reason: use source file name */
/* loaded from: classes18.dex */
final class StackStyling {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StackStyling[] $VALUES;
    public static final StackStyling BASE = new StackStyling("BASE", 0);
    public static final StackStyling ACTIVE = new StackStyling("ACTIVE", 1);
    public static final StackStyling DISABLED = new StackStyling("DISABLED", 2);

    private static final /* synthetic */ StackStyling[] $values() {
        return new StackStyling[]{BASE, ACTIVE, DISABLED};
    }

    public static EnumEntries<StackStyling> getEntries() {
        return $ENTRIES;
    }

    private StackStyling(String str, int i) {
    }

    static {
        StackStyling[] stackStylingArr$values = $values();
        $VALUES = stackStylingArr$values;
        $ENTRIES = EnumEntries2.enumEntries(stackStylingArr$values);
    }

    public static StackStyling valueOf(String str) {
        return (StackStyling) Enum.valueOf(StackStyling.class, str);
    }

    public static StackStyling[] values() {
        return (StackStyling[]) $VALUES.clone();
    }
}
