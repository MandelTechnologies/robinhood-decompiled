package com.google.android.material.internal;

import android.os.Build;
import com.adjust.sdk.Constants;
import java.util.Locale;

/* loaded from: classes27.dex */
public class ManufacturerUtils {
    public static boolean isMeizuDevice() {
        return getManufacturer().equals("meizu");
    }

    public static boolean isLGEDevice() {
        return getManufacturer().equals("lge");
    }

    public static boolean isSamsungDevice() {
        return getManufacturer().equals(Constants.REFERRER_API_SAMSUNG);
    }

    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
        return isLGEDevice() || isSamsungDevice();
    }

    private static String getManufacturer() {
        String str = Build.MANUFACTURER;
        if (str != null) {
            return str.toLowerCase(Locale.ENGLISH);
        }
        return "";
    }
}
