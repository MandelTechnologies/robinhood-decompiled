package com.robinhood.android.common.options.extensions;

import com.robinhood.analytics.AnalyticsLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Analytics.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"EVENT_APPEAR", "", "logScreenAppear", "", "Lcom/robinhood/analytics/AnalyticsLogger;", "screenName", "desc", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.extensions.AnalyticsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Analytics3 {
    public static final String EVENT_APPEAR = "appear";

    public static /* synthetic */ void logScreenAppear$default(AnalyticsLogger analyticsLogger, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        logScreenAppear(analyticsLogger, str, str2);
    }

    public static final void logScreenAppear(AnalyticsLogger analyticsLogger, String screenName, String str) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<this>");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        analyticsLogger.buildScreenTransitionEvent(EVENT_APPEAR, screenName, str).send();
    }
}
