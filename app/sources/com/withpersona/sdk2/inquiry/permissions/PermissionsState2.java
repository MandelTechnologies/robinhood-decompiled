package com.withpersona.sdk2.inquiry.permissions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PermissionsState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionResult;", "", "<init>", "(Ljava/lang/String;I)V", "PermissionGranted", "PermissionRejected", "SettingsLaunched", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionResult, reason: use source file name */
/* loaded from: classes18.dex */
public final class PermissionsState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PermissionsState2[] $VALUES;
    public static final PermissionsState2 PermissionGranted = new PermissionsState2("PermissionGranted", 0);
    public static final PermissionsState2 PermissionRejected = new PermissionsState2("PermissionRejected", 1);
    public static final PermissionsState2 SettingsLaunched = new PermissionsState2("SettingsLaunched", 2);

    private static final /* synthetic */ PermissionsState2[] $values() {
        return new PermissionsState2[]{PermissionGranted, PermissionRejected, SettingsLaunched};
    }

    public static EnumEntries<PermissionsState2> getEntries() {
        return $ENTRIES;
    }

    private PermissionsState2(String str, int i) {
    }

    static {
        PermissionsState2[] permissionsState2Arr$values = $values();
        $VALUES = permissionsState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(permissionsState2Arr$values);
    }

    public static PermissionsState2 valueOf(String str) {
        return (PermissionsState2) Enum.valueOf(PermissionsState2.class, str);
    }

    public static PermissionsState2[] values() {
        return (PermissionsState2[]) $VALUES.clone();
    }
}
