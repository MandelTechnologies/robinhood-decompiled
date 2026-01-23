package io.branch.referral;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes21.dex */
public class BranchUtil {
    private static Boolean isManifestTestModeEnabled = null;
    private static boolean isTestModeEnabled_ = false;

    static boolean checkTestMode(Context context) throws PackageManager.NameNotFoundException {
        if (!isTestModeEnabled_ && isManifestTestModeEnabled == null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.containsKey("io.branch.sdk.TestMode")) {
                    isTestModeEnabled_ = applicationInfo.metaData.getBoolean("io.branch.sdk.TestMode", false);
                } else {
                    Resources resources = context.getResources();
                    isTestModeEnabled_ = Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", "string", context.getPackageName())));
                }
            } catch (Exception unused) {
            }
            isManifestTestModeEnabled = Boolean.valueOf(isTestModeEnabled_);
        }
        return isTestModeEnabled_;
    }

    public static String readBranchKey(Context context) throws PackageManager.NameNotFoundException {
        String str = isTestModeEnabled() ? "io.branch.sdk.BranchKey.test" : "io.branch.sdk.BranchKey";
        String string2 = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && (string2 = bundle.getString(str)) == null && isTestModeEnabled()) {
                string2 = applicationInfo.metaData.getString("io.branch.sdk.BranchKey");
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(string2)) {
            return string2;
        }
        try {
            Resources resources = context.getResources();
            return resources.getString(resources.getIdentifier(str, "string", context.getPackageName()));
        } catch (Exception unused2) {
            return string2;
        }
    }

    public static boolean isTestModeEnabled() {
        return isTestModeEnabled_;
    }

    static void setTestMode(boolean z) {
        isTestModeEnabled_ = z;
    }
}
