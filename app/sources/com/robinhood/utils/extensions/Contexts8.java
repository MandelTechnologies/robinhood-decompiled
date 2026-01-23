package com.robinhood.utils.extensions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Contexts.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u000b\u001a\u00020\f*\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0003¨\u0006\u000e"}, m3636d2 = {"isWifiConnected", "", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "getPackageInfo", "Landroid/content/pm/PackageInfo;", "flags", "", "tryStartActivity", "intent", "Landroid/content/Intent;", "getApplicationInfoCompat", "Landroid/content/pm/ApplicationInfo;", "isRhcApp", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ContextsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Contexts8 {
    @JvmOverloads
    public static final ApplicationInfo getApplicationInfoCompat(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return getApplicationInfoCompat$default(context, 0, 1, null);
    }

    @JvmOverloads
    public static final PackageInfo getPackageInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return getPackageInfo$default(context, 0, 1, null);
    }

    public static final boolean isWifiConnected(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasTransport(1);
    }

    public static /* synthetic */ PackageInfo getPackageInfo$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return getPackageInfo(context, i);
    }

    @JvmOverloads
    public static final PackageInfo getPackageInfo(Context context, int i) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
        return packageInfo;
    }

    public static final boolean tryStartActivity(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public static /* synthetic */ ApplicationInfo getApplicationInfoCompat$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return getApplicationInfoCompat(context, i);
    }

    @JvmOverloads
    public static final ApplicationInfo getApplicationInfoCompat(Context context, int i) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(i));
            Intrinsics.checkNotNull(applicationInfo);
            return applicationInfo;
        }
        ApplicationInfo applicationInfo2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), i);
        Intrinsics.checkNotNull(applicationInfo2);
        return applicationInfo2;
    }

    public static final boolean isRhcApp(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Bundle bundle = getApplicationInfoCompat(context, 128).metaData;
        if (bundle != null) {
            return bundle.getBoolean("rhc", false);
        }
        return false;
    }
}
