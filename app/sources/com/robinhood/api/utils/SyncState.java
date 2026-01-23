package com.robinhood.api.utils;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SyncState.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/api/utils/SyncState;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "SUCCESS", "ERROR", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SyncState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SyncState[] $VALUES;
    public static final SyncState PENDING = new SyncState("PENDING", 0);
    public static final SyncState SUCCESS = new SyncState("SUCCESS", 1);
    public static final SyncState ERROR = new SyncState("ERROR", 2);

    private static final /* synthetic */ SyncState[] $values() {
        return new SyncState[]{PENDING, SUCCESS, ERROR};
    }

    public static EnumEntries<SyncState> getEntries() {
        return $ENTRIES;
    }

    private SyncState(String str, int i) {
    }

    static {
        SyncState[] syncStateArr$values = $values();
        $VALUES = syncStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(syncStateArr$values);
    }

    public static SyncState valueOf(String str) {
        return (SyncState) Enum.valueOf(SyncState.class, str);
    }

    public static SyncState[] values() {
        return (SyncState[]) $VALUES.clone();
    }
}
