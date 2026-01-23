package com.withpersona.sdk2.inquiry.permissions;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PermissionsState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, m3636d2 = {"toPermissionString", "", "Lcom/withpersona/sdk2/inquiry/permissions/Permission;", "toFeature", "Lcom/withpersona/sdk2/inquiry/permissions/Feature;", "permissions_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class PermissionsState4 {

    /* compiled from: PermissionsState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionsState.values().length];
            try {
                iArr[PermissionsState.Camera.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionsState.RecordAudio.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionsState.RoughLocation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PermissionsState.PreciseLocation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toPermissionString(PermissionsState permissionsState) {
        Intrinsics.checkNotNullParameter(permissionsState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[permissionsState.ordinal()];
        if (i == 1) {
            return "android.permission.CAMERA";
        }
        if (i == 2) {
            return "android.permission.RECORD_AUDIO";
        }
        if (i == 3) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    public static final DeviceFeatureState2 toFeature(PermissionsState permissionsState) {
        Intrinsics.checkNotNullParameter(permissionsState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[permissionsState.ordinal()];
        if (i == 1) {
            return DeviceFeatureState2.Camera;
        }
        if (i == 2) {
            return DeviceFeatureState2.RecordAudio;
        }
        if (i == 3) {
            return DeviceFeatureState2.RoughLocation;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return DeviceFeatureState2.PreciseLocation;
    }
}
