package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParticipantChangedOperation.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/ParticipantChangedOperation;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Add", "Remove", "Unknown", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ParticipantChangedOperation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ParticipantChangedOperation[] $VALUES;

    @Json(name = "add")
    public static final ParticipantChangedOperation Add = new ParticipantChangedOperation("Add", 0, "add");

    @Json(name = "remove")
    public static final ParticipantChangedOperation Remove = new ParticipantChangedOperation("Remove", 1, "remove");
    public static final ParticipantChangedOperation Unknown = new ParticipantChangedOperation("Unknown", 2, "unknown");
    private final String value;

    private static final /* synthetic */ ParticipantChangedOperation[] $values() {
        return new ParticipantChangedOperation[]{Add, Remove, Unknown};
    }

    public static EnumEntries<ParticipantChangedOperation> getEntries() {
        return $ENTRIES;
    }

    private ParticipantChangedOperation(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        ParticipantChangedOperation[] participantChangedOperationArr$values = $values();
        $VALUES = participantChangedOperationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(participantChangedOperationArr$values);
    }

    public static ParticipantChangedOperation valueOf(String str) {
        return (ParticipantChangedOperation) Enum.valueOf(ParticipantChangedOperation.class, str);
    }

    public static ParticipantChangedOperation[] values() {
        return (ParticipantChangedOperation[]) $VALUES.clone();
    }
}
