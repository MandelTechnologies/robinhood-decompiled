package com.robinhood.android.camera;

import android.content.Context;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.Compat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraPermission.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0006H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\t"}, m3636d2 = {"requestCameraPermissionIfNecessary", "", "Lcom/robinhood/android/common/ui/BaseActivity;", "requestCode", "", "checkCameraPermission", "Landroid/content/Context;", "requestCameraPermission", "", "lib-camera_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.camera.CameraPermissionKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CameraPermission2 {
    public static final boolean requestCameraPermissionIfNecessary(BaseActivity baseActivity, int i) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        if (checkCameraPermission(baseActivity)) {
            return true;
        }
        requestCameraPermission(baseActivity, i);
        return false;
    }

    public static final boolean checkCameraPermission(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return Compat.INSTANCE.checkSelfPermission(context, "android.permission.CAMERA");
    }

    private static final void requestCameraPermission(BaseActivity baseActivity, int i) {
        baseActivity.requestPermissionsCompat(i, "android.permission.CAMERA");
    }
}
