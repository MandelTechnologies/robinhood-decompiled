package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.routing;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RoutingFailureType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/RoutingFailureType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "None", "Unknown", "SubmissionError", "RoutingError", "Cancelled", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RoutingFailureType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RoutingFailureType[] $VALUES;
    private final String value;
    public static final RoutingFailureType None = new RoutingFailureType("None", 0, "None");
    public static final RoutingFailureType Unknown = new RoutingFailureType("Unknown", 1, "Unknown");
    public static final RoutingFailureType SubmissionError = new RoutingFailureType("SubmissionError", 2, "SubmissionError");
    public static final RoutingFailureType RoutingError = new RoutingFailureType("RoutingError", 3, "RoutingError");
    public static final RoutingFailureType Cancelled = new RoutingFailureType("Cancelled", 4, "Cancelled");

    private static final /* synthetic */ RoutingFailureType[] $values() {
        return new RoutingFailureType[]{None, Unknown, SubmissionError, RoutingError, Cancelled};
    }

    public static EnumEntries<RoutingFailureType> getEntries() {
        return $ENTRIES;
    }

    private RoutingFailureType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        RoutingFailureType[] routingFailureTypeArr$values = $values();
        $VALUES = routingFailureTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(routingFailureTypeArr$values);
    }

    public static RoutingFailureType valueOf(String str) {
        return (RoutingFailureType) Enum.valueOf(RoutingFailureType.class, str);
    }

    public static RoutingFailureType[] values() {
        return (RoutingFailureType[]) $VALUES.clone();
    }
}
