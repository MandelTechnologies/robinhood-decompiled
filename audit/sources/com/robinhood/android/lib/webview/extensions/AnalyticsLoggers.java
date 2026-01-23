package com.robinhood.android.lib.webview.extensions;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsLoggers.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"logNativePathfinderError", "", "Lcom/robinhood/analytics/AnalyticsLogger;", "tag", "", "lib-webview_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.webview.extensions.AnalyticsLoggersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AnalyticsLoggers {
    public static final void logNativePathfinderError(AnalyticsLogger analyticsLogger, String tag) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        analyticsLogger.logError(AnalyticsStrings.NATIVE_PATHFINDER_WEB, tag);
    }
}
