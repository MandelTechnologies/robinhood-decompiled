package com.withpersona.sdk2.inquiry.permissions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceFeatureState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/FeatureRequestResult;", "", "<init>", "(Ljava/lang/String;I)V", "Success", "Failure", "SettingsLaunched", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.permissions.FeatureRequestResult, reason: use source file name */
/* loaded from: classes18.dex */
public final class DeviceFeatureState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceFeatureState3[] $VALUES;
    public static final DeviceFeatureState3 Success = new DeviceFeatureState3("Success", 0);
    public static final DeviceFeatureState3 Failure = new DeviceFeatureState3("Failure", 1);
    public static final DeviceFeatureState3 SettingsLaunched = new DeviceFeatureState3("SettingsLaunched", 2);

    private static final /* synthetic */ DeviceFeatureState3[] $values() {
        return new DeviceFeatureState3[]{Success, Failure, SettingsLaunched};
    }

    public static EnumEntries<DeviceFeatureState3> getEntries() {
        return $ENTRIES;
    }

    private DeviceFeatureState3(String str, int i) {
    }

    static {
        DeviceFeatureState3[] deviceFeatureState3Arr$values = $values();
        $VALUES = deviceFeatureState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(deviceFeatureState3Arr$values);
    }

    public static DeviceFeatureState3 valueOf(String str) {
        return (DeviceFeatureState3) Enum.valueOf(DeviceFeatureState3.class, str);
    }

    public static DeviceFeatureState3[] values() {
        return (DeviceFeatureState3[]) $VALUES.clone();
    }
}
