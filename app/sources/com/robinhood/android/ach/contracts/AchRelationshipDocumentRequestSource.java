package com.robinhood.android.ach.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AchRelationshipDocumentRequestSource.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/ach/contracts/AchRelationshipDocumentRequestSource;", "", "<init>", "(Ljava/lang/String;I)V", "IAV", "MICRODEPOSITS", "MOVE_MONEY", "TRANSFERS", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AchRelationshipDocumentRequestSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AchRelationshipDocumentRequestSource[] $VALUES;
    public static final AchRelationshipDocumentRequestSource IAV = new AchRelationshipDocumentRequestSource("IAV", 0);
    public static final AchRelationshipDocumentRequestSource MICRODEPOSITS = new AchRelationshipDocumentRequestSource("MICRODEPOSITS", 1);
    public static final AchRelationshipDocumentRequestSource MOVE_MONEY = new AchRelationshipDocumentRequestSource("MOVE_MONEY", 2);
    public static final AchRelationshipDocumentRequestSource TRANSFERS = new AchRelationshipDocumentRequestSource("TRANSFERS", 3);

    private static final /* synthetic */ AchRelationshipDocumentRequestSource[] $values() {
        return new AchRelationshipDocumentRequestSource[]{IAV, MICRODEPOSITS, MOVE_MONEY, TRANSFERS};
    }

    public static EnumEntries<AchRelationshipDocumentRequestSource> getEntries() {
        return $ENTRIES;
    }

    private AchRelationshipDocumentRequestSource(String str, int i) {
    }

    static {
        AchRelationshipDocumentRequestSource[] achRelationshipDocumentRequestSourceArr$values = $values();
        $VALUES = achRelationshipDocumentRequestSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(achRelationshipDocumentRequestSourceArr$values);
    }

    public static AchRelationshipDocumentRequestSource valueOf(String str) {
        return (AchRelationshipDocumentRequestSource) Enum.valueOf(AchRelationshipDocumentRequestSource.class, str);
    }

    public static AchRelationshipDocumentRequestSource[] values() {
        return (AchRelationshipDocumentRequestSource[]) $VALUES.clone();
    }
}
