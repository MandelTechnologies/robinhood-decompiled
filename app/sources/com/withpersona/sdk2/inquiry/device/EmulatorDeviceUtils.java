package com.withpersona.sdk2.inquiry.device;

import android.os.Build;
import com.singular.sdk.internal.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: EmulatorDeviceUtils.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"isDeviceEmulator", "", "device_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.device.EmulatorDeviceUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class EmulatorDeviceUtils {
    public static final boolean isDeviceEmulator() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = Build.BRAND;
        if (str7 == null || (str = Build.DEVICE) == null || (str2 = Build.FINGERPRINT) == null || (str3 = Build.HARDWARE) == null || (str4 = Build.MODEL) == null || (str5 = Build.MANUFACTURER) == null || (str6 = Build.PRODUCT) == null) {
            return true;
        }
        return (StringsKt.startsWith$default(str7, "generic", false, 2, (Object) null) && StringsKt.startsWith$default(str, "generic", false, 2, (Object) null)) || StringsKt.startsWith$default(str2, "generic", false, 2, (Object) null) || StringsKt.startsWith$default(str2, "unknown", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str3, (CharSequence) "goldfish", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str3, (CharSequence) "ranchu", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) "google_sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) "Emulator", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) "Android SDK built for x86", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "Genymotion", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str6, (CharSequence) "sdk_google", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str6, (CharSequence) "google_sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str6, (CharSequence) Constants.RequestParamsKeys.SDK_VERSION_KEY, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str6, (CharSequence) "sdk_x86", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str6, (CharSequence) "sdk_gphone64_arm64", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str6, (CharSequence) "vbox86p", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str6, (CharSequence) "emulator", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str6, (CharSequence) "simulator", false, 2, (Object) null) || (new File("/storage/emulated/0/Android/data/com.android.ld.appstore/files").exists() || new File("/storage/emulated/0/Android/data/com.android.ld.appstore/cache").exists());
    }
}
