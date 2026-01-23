package com.twilio.twilsock.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.singular.sdk.internal.Constants;
import com.twilio.twilsock.client.ClientMetadata;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: MetadataAndroid.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0006H\u0007\u001a\u001a\u0010\u0014\u001a\u00020\u0015*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006\"\u001b\u0010\u0000\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0002\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\n\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\"\u0018\u0010\f\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m3636d2 = {"isProbablyRunningOnEmulator", "", "()Z", "isProbablyRunningOnEmulator$delegate", "Lkotlin/Lazy;", "deviceManufacturer", "", "Landroid/content/Context;", "getDeviceManufacturer", "(Landroid/content/Context;)Ljava/lang/String;", "deviceName", "getDeviceName", "deviceType", "getDeviceType", "packageInfo", "Landroid/content/pm/PackageInfo;", "getPackageInfo", "(Landroid/content/Context;)Landroid/content/pm/PackageInfo;", "capitalize", Constants.RequestParamsKeys.SESSION_ID_KEY, "toClientMetadata", "Lcom/twilio/twilsock/client/ClientMetadata;", "sdkVersion", "sdkType", "twilsock_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.util.MetadataAndroidKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MetadataAndroid {
    private static final Lazy isProbablyRunningOnEmulator$delegate = LazyKt.lazy(new Function0<Boolean>() { // from class: com.twilio.twilsock.util.MetadataAndroidKt.isProbablyRunningOnEmulator.2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke() {
            boolean z;
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (!StringsKt.startsWith$default(FINGERPRINT, "generic", false, 2, (Object) null)) {
                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                if (!StringsKt.startsWith$default(FINGERPRINT, "unknown", false, 2, (Object) null)) {
                    String MODEL = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    if (!StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null)) {
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        if (!StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Emulator", false, 2, (Object) null)) {
                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                            if (!StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
                                String MANUFACTURER = Build.MANUFACTURER;
                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                if (!StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
                                    String BRAND = Build.BRAND;
                                    Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                    if (StringsKt.startsWith$default(BRAND, "generic", false, 2, (Object) null)) {
                                        String DEVICE = Build.DEVICE;
                                        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                        if (!StringsKt.startsWith$default(DEVICE, "generic", false, 2, (Object) null)) {
                                            z = "google_sdk".equals(Build.PRODUCT);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    });

    @Deprecated
    public static final ClientMetadata toClientMetadata(Context context, String sdkVersion) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return toClientMetadata(context, sdkVersion, "sync");
    }

    public static final ClientMetadata toClientMetadata(Context context, String sdkVersion, String sdkType) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        ClientMetadata clientMetadata = new ClientMetadata((String) null, (String) null, "Android", Build.VERSION.RELEASE, System.getProperty("os.arch"), getDeviceName(context), getDeviceManufacturer(context), getDeviceType(context), context.getPackageName(), getPackageInfo(context).versionName, sdkType, "Android", sdkVersion, 3, (DefaultConstructorMarker) null);
        TwilioLogger.d$default(TwilioLogger3.getLogger(context), "BOARD " + Build.BOARD, (Throwable) null, 2, (Object) null);
        TwilioLogger.d$default(TwilioLogger3.getLogger(context), "BRAND " + Build.BRAND, (Throwable) null, 2, (Object) null);
        TwilioLogger.d$default(TwilioLogger3.getLogger(context), "DEVICE " + Build.DEVICE, (Throwable) null, 2, (Object) null);
        TwilioLogger.d$default(TwilioLogger3.getLogger(context), "DISPLAY " + Build.DISPLAY, (Throwable) null, 2, (Object) null);
        TwilioLogger.d$default(TwilioLogger3.getLogger(context), "FINGERPRINT " + Build.FINGERPRINT, (Throwable) null, 2, (Object) null);
        TwilioLogger.d$default(TwilioLogger3.getLogger(context), "HARDWARE " + Build.HARDWARE, (Throwable) null, 2, (Object) null);
        TwilioLogger.d$default(TwilioLogger3.getLogger(context), "MANUFACTURER " + Build.MANUFACTURER, (Throwable) null, 2, (Object) null);
        TwilioLogger.d$default(TwilioLogger3.getLogger(context), "MODEL " + Build.MODEL, (Throwable) null, 2, (Object) null);
        TwilioLogger.d$default(TwilioLogger3.getLogger(context), "PRODUCT " + Build.PRODUCT, (Throwable) null, 2, (Object) null);
        return clientMetadata;
    }

    private static final PackageInfo getPackageInfo(Context context) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            return packageInfo;
        }
        PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "getPackageInfo(...)");
        return packageInfo2;
    }

    private static final String getDeviceName(Context context) {
        if (isProbablyRunningOnEmulator()) {
            return "emulator";
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str);
        if (StringsKt.startsWith$default(str2, str, false, 2, (Object) null)) {
            return capitalize(str2);
        }
        return capitalize(str) + ' ' + str2;
    }

    private static final String getDeviceManufacturer(Context context) {
        if (isProbablyRunningOnEmulator()) {
            return "emulator";
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return capitalize(MANUFACTURER);
    }

    private static final String getDeviceType(Context context) {
        if (isProbablyRunningOnEmulator()) {
            return "emulator";
        }
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        return DEVICE;
    }

    private static final String capitalize(String str) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            strValueOf = CharsKt.titlecase(cCharAt, ROOT);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    private static final boolean isProbablyRunningOnEmulator() {
        return ((Boolean) isProbablyRunningOnEmulator$delegate.getValue()).booleanValue();
    }
}
