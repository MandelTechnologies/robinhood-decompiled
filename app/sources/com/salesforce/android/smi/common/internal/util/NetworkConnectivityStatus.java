package com.salesforce.android.smi.common.internal.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkConnectivityStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/NetworkConnectivityStatus;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "Unknown", "Offline", "Connected", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class NetworkConnectivityStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetworkConnectivityStatus[] $VALUES;
    public static final NetworkConnectivityStatus Unknown = new NetworkConnectivityStatus("Unknown", 0, 0);
    public static final NetworkConnectivityStatus Offline = new NetworkConnectivityStatus("Offline", 1, 1);
    public static final NetworkConnectivityStatus Connected = new NetworkConnectivityStatus("Connected", 2, 2);

    private static final /* synthetic */ NetworkConnectivityStatus[] $values() {
        return new NetworkConnectivityStatus[]{Unknown, Offline, Connected};
    }

    public static EnumEntries<NetworkConnectivityStatus> getEntries() {
        return $ENTRIES;
    }

    private NetworkConnectivityStatus(String str, int i, int i2) {
    }

    static {
        NetworkConnectivityStatus[] networkConnectivityStatusArr$values = $values();
        $VALUES = networkConnectivityStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(networkConnectivityStatusArr$values);
    }

    public static NetworkConnectivityStatus valueOf(String str) {
        return (NetworkConnectivityStatus) Enum.valueOf(NetworkConnectivityStatus.class, str);
    }

    public static NetworkConnectivityStatus[] values() {
        return (NetworkConnectivityStatus[]) $VALUES.clone();
    }
}
