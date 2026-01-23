package com.withpersona.sdk2.inquiry.permissions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PermissionsState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/Permission;", "", "<init>", "(Ljava/lang/String;I)V", "Camera", "RecordAudio", "RoughLocation", "PreciseLocation", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.permissions.Permission, reason: use source file name */
/* loaded from: classes18.dex */
public final class PermissionsState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PermissionsState[] $VALUES;
    public static final PermissionsState Camera = new PermissionsState("Camera", 0);
    public static final PermissionsState RecordAudio = new PermissionsState("RecordAudio", 1);
    public static final PermissionsState RoughLocation = new PermissionsState("RoughLocation", 2);
    public static final PermissionsState PreciseLocation = new PermissionsState("PreciseLocation", 3);

    private static final /* synthetic */ PermissionsState[] $values() {
        return new PermissionsState[]{Camera, RecordAudio, RoughLocation, PreciseLocation};
    }

    public static EnumEntries<PermissionsState> getEntries() {
        return $ENTRIES;
    }

    private PermissionsState(String str, int i) {
    }

    static {
        PermissionsState[] permissionsStateArr$values = $values();
        $VALUES = permissionsStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(permissionsStateArr$values);
    }

    public static PermissionsState valueOf(String str) {
        return (PermissionsState) Enum.valueOf(PermissionsState.class, str);
    }

    public static PermissionsState[] values() {
        return (PermissionsState[]) $VALUES.clone();
    }
}
