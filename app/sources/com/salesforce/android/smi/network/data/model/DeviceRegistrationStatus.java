package com.salesforce.android.smi.network.data.model;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceRegistrationStatus.kt */
@JsonClass(generateAdapter = false)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/model/DeviceRegistrationStatus;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Unregistered", "Registered", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DeviceRegistrationStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceRegistrationStatus[] $VALUES;
    private static final EnumEntries<DeviceRegistrationStatus> values;
    private final int value;
    public static final DeviceRegistrationStatus Unregistered = new DeviceRegistrationStatus("Unregistered", 0, 0);
    public static final DeviceRegistrationStatus Registered = new DeviceRegistrationStatus("Registered", 1, 1);

    private static final /* synthetic */ DeviceRegistrationStatus[] $values() {
        return new DeviceRegistrationStatus[]{Unregistered, Registered};
    }

    public static EnumEntries<DeviceRegistrationStatus> getEntries() {
        return $ENTRIES;
    }

    private DeviceRegistrationStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        DeviceRegistrationStatus[] deviceRegistrationStatusArr$values = $values();
        $VALUES = deviceRegistrationStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(deviceRegistrationStatusArr$values);
        INSTANCE = new Companion(null);
        values = getEntries();
    }

    public static DeviceRegistrationStatus valueOf(String str) {
        return (DeviceRegistrationStatus) Enum.valueOf(DeviceRegistrationStatus.class, str);
    }

    public static DeviceRegistrationStatus[] values() {
        return (DeviceRegistrationStatus[]) $VALUES.clone();
    }
}
