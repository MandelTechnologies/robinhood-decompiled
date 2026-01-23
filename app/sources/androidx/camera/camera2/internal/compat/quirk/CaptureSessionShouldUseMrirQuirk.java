package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import com.adjust.sdk.Constants;

/* loaded from: classes4.dex */
public class CaptureSessionShouldUseMrirQuirk implements Quirk {
    static boolean load() {
        return Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT >= 35;
    }
}
