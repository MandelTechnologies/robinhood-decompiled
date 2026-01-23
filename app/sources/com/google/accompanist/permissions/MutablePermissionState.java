package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.view.result.ActivityResultLauncher;
import com.google.accompanist.permissions.PermissionsUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MutablePermissionState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcom/google/accompanist/permissions/MutablePermissionState;", "Lcom/google/accompanist/permissions/PermissionState;", "", "permission", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "activity", "<init>", "(Ljava/lang/String;Landroid/content/Context;Landroid/app/Activity;)V", "Lcom/google/accompanist/permissions/PermissionStatus;", "getPermissionStatus", "()Lcom/google/accompanist/permissions/PermissionStatus;", "", "launchPermissionRequest", "()V", "refreshPermissionStatus$permissions_release", "refreshPermissionStatus", "Ljava/lang/String;", "getPermission", "()Ljava/lang/String;", "Landroid/content/Context;", "Landroid/app/Activity;", "<set-?>", "status$delegate", "Landroidx/compose/runtime/MutableState;", "getStatus", "setStatus", "(Lcom/google/accompanist/permissions/PermissionStatus;)V", "status", "Landroidx/activity/result/ActivityResultLauncher;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher$permissions_release", "()Landroidx/activity/result/ActivityResultLauncher;", "setLauncher$permissions_release", "(Landroidx/activity/result/ActivityResultLauncher;)V", "permissions_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class MutablePermissionState implements PermissionState {
    private final Activity activity;
    private final Context context;
    private ActivityResultLauncher<String> launcher;
    private final String permission;

    /* renamed from: status$delegate, reason: from kotlin metadata */
    private final SnapshotState status;

    public MutablePermissionState(String permission, Context context, Activity activity) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.permission = permission;
        this.context = context;
        this.activity = activity;
        this.status = SnapshotState3.mutableStateOf$default(getPermissionStatus(), null, 2, null);
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public String getPermission() {
        return this.permission;
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public PermissionsUtil getStatus() {
        return (PermissionsUtil) this.status.getValue();
    }

    public void setStatus(PermissionsUtil permissionsUtil) {
        Intrinsics.checkNotNullParameter(permissionsUtil, "<set-?>");
        this.status.setValue(permissionsUtil);
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public void launchPermissionRequest() {
        Unit unit;
        ActivityResultLauncher<String> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(getPermission());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    public final void setLauncher$permissions_release(ActivityResultLauncher<String> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void refreshPermissionStatus$permissions_release() {
        setStatus(getPermissionStatus());
    }

    private final PermissionsUtil getPermissionStatus() {
        if (PermissionsUtil2.checkPermission(this.context, getPermission())) {
            return PermissionsUtil.Granted.INSTANCE;
        }
        return new PermissionsUtil.Denied(PermissionsUtil2.shouldShowRationale(this.activity, getPermission()));
    }
}
