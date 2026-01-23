package com.truelayer.payments.analytics.events;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import com.truelayer.payments.analytics.events.NetworkEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppAnalytics.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, m3636d2 = {"applicationName", "", "context", "Landroid/content/Context;", "applicationVersion", "screenResolution", "Lcom/truelayer/payments/analytics/events/NetworkEvent$ScreenResolution;", "payments-analytics_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.analytics.events.AppAnalyticsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AppAnalytics2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String applicationName(Context context) {
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applicationVersion(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).versionName;
            return str == null ? "unknown" : str;
        }
        String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        return str2 == null ? "unknown" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkEvent.ScreenResolution screenResolution(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new NetworkEvent.ScreenResolution(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
