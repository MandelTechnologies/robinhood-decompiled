package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.adjust.sdk.Constants;
import java.util.Locale;

/* loaded from: classes4.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    static boolean load() {
        return isSamsungM55();
    }

    public static boolean isSamsungM55() {
        return Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND) && Build.MODEL.toLowerCase(Locale.US).startsWith("sm-m556");
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public boolean workaroundByCaptureIntentPreview() {
        return isSamsungM55();
    }
}
