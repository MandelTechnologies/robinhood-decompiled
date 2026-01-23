package androidx.camera.core.impl.utils;

import androidx.camera.core.Logger;
import com.plaid.internal.EnumC7081g;

/* loaded from: classes4.dex */
public final class CameraOrientationUtil {
    public static int getRelativeImageRotation(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (Logger.isVerboseEnabled("CameraOrientationUtil")) {
            Logger.m45d("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)));
        }
        return i3;
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        }
        if (i == 3) {
            return EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i);
    }
}
