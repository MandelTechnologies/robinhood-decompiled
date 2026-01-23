package com.google.accompanist.permissions;

import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.view.result.ActivityResultLauncher;
import com.google.accompanist.permissions.PermissionsUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MutableMultiplePermissionsState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001d\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u001cR0\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\"\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/google/accompanist/permissions/MutableMultiplePermissionsState;", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "", "Lcom/google/accompanist/permissions/MutablePermissionState;", "mutablePermissions", "<init>", "(Ljava/util/List;)V", "", "launchMultiplePermissionRequest", "()V", "", "", "", "permissionsStatus", "updatePermissionsStatus$permissions_release", "(Ljava/util/Map;)V", "updatePermissionsStatus", "Ljava/util/List;", "Lcom/google/accompanist/permissions/PermissionState;", "permissions", "getPermissions", "()Ljava/util/List;", "revokedPermissions$delegate", "Landroidx/compose/runtime/State;", "getRevokedPermissions", "revokedPermissions", "allPermissionsGranted$delegate", "getAllPermissionsGranted", "()Z", "allPermissionsGranted", "shouldShowRationale$delegate", "getShouldShowRationale", "shouldShowRationale", "Landroidx/activity/result/ActivityResultLauncher;", "", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher$permissions_release", "()Landroidx/activity/result/ActivityResultLauncher;", "setLauncher$permissions_release", "(Landroidx/activity/result/ActivityResultLauncher;)V", "permissions_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class MutableMultiplePermissionsState implements MultiplePermissionsState {

    /* renamed from: allPermissionsGranted$delegate, reason: from kotlin metadata */
    private final SnapshotState4 allPermissionsGranted;
    private ActivityResultLauncher<String[]> launcher;
    private final List<MutablePermissionState> mutablePermissions;
    private final List<PermissionState> permissions;

    /* renamed from: revokedPermissions$delegate, reason: from kotlin metadata */
    private final SnapshotState4 revokedPermissions;

    /* renamed from: shouldShowRationale$delegate, reason: from kotlin metadata */
    private final SnapshotState4 shouldShowRationale;

    public MutableMultiplePermissionsState(List<MutablePermissionState> mutablePermissions) {
        Intrinsics.checkNotNullParameter(mutablePermissions, "mutablePermissions");
        this.mutablePermissions = mutablePermissions;
        this.permissions = mutablePermissions;
        this.revokedPermissions = SnapshotStateKt.derivedStateOf(new Function0<List<? extends PermissionState>>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$revokedPermissions$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends PermissionState> invoke() {
                List<PermissionState> permissions = this.this$0.getPermissions();
                ArrayList arrayList = new ArrayList();
                for (Object obj : permissions) {
                    if (!Intrinsics.areEqual(((PermissionState) obj).getStatus(), PermissionsUtil.Granted.INSTANCE)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
        this.allPermissionsGranted = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$allPermissionsGranted$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z;
                List<PermissionState> permissions = this.this$0.getPermissions();
                if ((permissions instanceof Collection) && permissions.isEmpty()) {
                    z = true;
                } else {
                    Iterator<T> it = permissions.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!PermissionsUtil2.isGranted(((PermissionState) it.next()).getStatus())) {
                            if (this.this$0.getRevokedPermissions().isEmpty()) {
                                break;
                            }
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        this.shouldShowRationale = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$shouldShowRationale$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                List<PermissionState> permissions = this.this$0.getPermissions();
                boolean z = false;
                if (!(permissions instanceof Collection) || !permissions.isEmpty()) {
                    Iterator<T> it = permissions.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (PermissionsUtil2.getShouldShowRationale(((PermissionState) it.next()).getStatus())) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public List<PermissionState> getPermissions() {
        return this.permissions;
    }

    public List<PermissionState> getRevokedPermissions() {
        return (List) this.revokedPermissions.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.permissions.MultiplePermissionsState
    public void launchMultiplePermissionRequest() {
        Unit unit;
        ActivityResultLauncher<String[]> activityResultLauncher = this.launcher;
        if (activityResultLauncher != 0) {
            List<PermissionState> permissions = getPermissions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(permissions, 10));
            Iterator<T> it = permissions.iterator();
            while (it.hasNext()) {
                arrayList.add(((PermissionState) it.next()).getPermission());
            }
            activityResultLauncher.launch(arrayList.toArray(new String[0]));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    public final void setLauncher$permissions_release(ActivityResultLauncher<String[]> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void updatePermissionsStatus$permissions_release(Map<String, Boolean> permissionsStatus) {
        Object next;
        Intrinsics.checkNotNullParameter(permissionsStatus, "permissionsStatus");
        for (String str : permissionsStatus.keySet()) {
            Iterator<T> it = this.mutablePermissions.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((MutablePermissionState) next).getPermission(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            MutablePermissionState mutablePermissionState = (MutablePermissionState) next;
            if (mutablePermissionState != null && permissionsStatus.get(str) != null) {
                mutablePermissionState.refreshPermissionStatus$permissions_release();
            }
        }
    }
}
