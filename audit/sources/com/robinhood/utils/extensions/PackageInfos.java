package com.robinhood.utils.extensions;

import android.content.pm.PackageInfo;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PackageInfos.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"versionCodeCompat", "", "Landroid/content/pm/PackageInfo;", "getVersionCodeCompat$annotations", "(Landroid/content/pm/PackageInfo;)V", "getVersionCodeCompat", "(Landroid/content/pm/PackageInfo;)J", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.PackageInfosKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class PackageInfos {
    public static /* synthetic */ void getVersionCodeCompat$annotations(PackageInfo packageInfo) {
    }

    public static final long getVersionCodeCompat(PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "<this>");
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }
}
