package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.routing;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RoutingWorkType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/RoutingWorkType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Assigned", "Accepted", "Closed", "Declined", "Cancelled", "TransferError", "Transferred", "Unknown", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RoutingWorkType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RoutingWorkType[] $VALUES;
    private final String value;
    public static final RoutingWorkType Assigned = new RoutingWorkType("Assigned", 0, "Assigned");
    public static final RoutingWorkType Accepted = new RoutingWorkType("Accepted", 1, "Accepted");
    public static final RoutingWorkType Closed = new RoutingWorkType("Closed", 2, "Closed");
    public static final RoutingWorkType Declined = new RoutingWorkType("Declined", 3, "Declined");
    public static final RoutingWorkType Cancelled = new RoutingWorkType("Cancelled", 4, "Cancelled");
    public static final RoutingWorkType TransferError = new RoutingWorkType("TransferError", 5, "TransferError");
    public static final RoutingWorkType Transferred = new RoutingWorkType("Transferred", 6, "Transferred");
    public static final RoutingWorkType Unknown = new RoutingWorkType("Unknown", 7, "Unknown");

    private static final /* synthetic */ RoutingWorkType[] $values() {
        return new RoutingWorkType[]{Assigned, Accepted, Closed, Declined, Cancelled, TransferError, Transferred, Unknown};
    }

    public static EnumEntries<RoutingWorkType> getEntries() {
        return $ENTRIES;
    }

    private RoutingWorkType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        RoutingWorkType[] routingWorkTypeArr$values = $values();
        $VALUES = routingWorkTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(routingWorkTypeArr$values);
    }

    public static RoutingWorkType valueOf(String str) {
        return (RoutingWorkType) Enum.valueOf(RoutingWorkType.class, str);
    }

    public static RoutingWorkType[] values() {
        return (RoutingWorkType[]) $VALUES.clone();
    }
}
