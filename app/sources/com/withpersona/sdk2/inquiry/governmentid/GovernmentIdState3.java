package com.withpersona.sdk2.inquiry.governmentid;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GovernmentIdState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/AutoClassificationErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "IdTypeRejected", "UnableToClassify", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.AutoClassificationErrorType, reason: use source file name */
/* loaded from: classes18.dex */
public final class GovernmentIdState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GovernmentIdState3[] $VALUES;
    public static final GovernmentIdState3 IdTypeRejected = new GovernmentIdState3("IdTypeRejected", 0);
    public static final GovernmentIdState3 UnableToClassify = new GovernmentIdState3("UnableToClassify", 1);

    private static final /* synthetic */ GovernmentIdState3[] $values() {
        return new GovernmentIdState3[]{IdTypeRejected, UnableToClassify};
    }

    public static EnumEntries<GovernmentIdState3> getEntries() {
        return $ENTRIES;
    }

    private GovernmentIdState3(String str, int i) {
    }

    static {
        GovernmentIdState3[] governmentIdState3Arr$values = $values();
        $VALUES = governmentIdState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(governmentIdState3Arr$values);
    }

    public static GovernmentIdState3 valueOf(String str) {
        return (GovernmentIdState3) Enum.valueOf(GovernmentIdState3.class, str);
    }

    public static GovernmentIdState3[] values() {
        return (GovernmentIdState3[]) $VALUES.clone();
    }
}
