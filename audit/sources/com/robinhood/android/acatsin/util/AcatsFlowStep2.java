package com.robinhood.android.acatsin.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AcatsFlowStep.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/util/AcatsFlow;", "", "totalSteps", "", "<init>", "(Ljava/lang/String;II)V", "getTotalSteps", "()I", "ACATS_IN_PRIMARY", "ACATS_IN_CO_OWNER_CONFIRM", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.util.AcatsFlow, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsFlowStep2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AcatsFlowStep2[] $VALUES;
    private final int totalSteps;
    public static final AcatsFlowStep2 ACATS_IN_PRIMARY = new AcatsFlowStep2("ACATS_IN_PRIMARY", 0, 8);
    public static final AcatsFlowStep2 ACATS_IN_CO_OWNER_CONFIRM = new AcatsFlowStep2("ACATS_IN_CO_OWNER_CONFIRM", 1, 2);

    private static final /* synthetic */ AcatsFlowStep2[] $values() {
        return new AcatsFlowStep2[]{ACATS_IN_PRIMARY, ACATS_IN_CO_OWNER_CONFIRM};
    }

    public static EnumEntries<AcatsFlowStep2> getEntries() {
        return $ENTRIES;
    }

    private AcatsFlowStep2(String str, int i, int i2) {
        this.totalSteps = i2;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    static {
        AcatsFlowStep2[] acatsFlowStep2Arr$values = $values();
        $VALUES = acatsFlowStep2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(acatsFlowStep2Arr$values);
    }

    public static AcatsFlowStep2 valueOf(String str) {
        return (AcatsFlowStep2) Enum.valueOf(AcatsFlowStep2.class, str);
    }

    public static AcatsFlowStep2[] values() {
        return (AcatsFlowStep2[]) $VALUES.clone();
    }
}
