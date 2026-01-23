package com.robinhood.analytics;

import com.robinhood.analytics.AnalyticsLogger;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LogOnceAnalytics.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005Ja\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/analytics/LogOnceAnalytics;", "", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "lock", "sentAppearAnalytics", "", "", "logButtonGroupAppear", "", "groupTitle", "buttonTitle", "id", "buttonDescription", "numShares", "", "entityId", "entityType", "tag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "reset", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class LogOnceAnalytics {
    private final AnalyticsLogger analytics;
    private final Object lock;
    private final Set<String> sentAppearAnalytics;

    public LogOnceAnalytics(AnalyticsLogger analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.analytics = analytics;
        this.lock = new Object();
        this.sentAppearAnalytics = new LinkedHashSet();
    }

    public static /* synthetic */ void logButtonGroupAppear$default(LogOnceAnalytics logOnceAnalytics, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str2;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        if ((i & 128) != 0) {
            str7 = null;
        }
        logOnceAnalytics.logButtonGroupAppear(str, str2, str3, str4, num, str5, str6, str7);
    }

    public final void logButtonGroupAppear(String groupTitle, String buttonTitle, String id, String buttonDescription, Integer numShares, String entityId, String entityType, String tag) {
        boolean zAdd;
        Intrinsics.checkNotNullParameter(groupTitle, "groupTitle");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.lock) {
            zAdd = this.sentAppearAnalytics.add(id);
        }
        if (zAdd) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analytics, groupTitle, buttonTitle, buttonDescription, numShares, entityId, entityType, tag, null, 128, null);
        }
    }

    public final void reset() {
        synchronized (this.lock) {
            this.sentAppearAnalytics.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
