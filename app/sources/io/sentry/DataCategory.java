package io.sentry;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;

/* loaded from: classes21.dex */
public enum DataCategory {
    All("__all__"),
    Default(AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT),
    Error("error"),
    Session("session"),
    Attachment("attachment"),
    Monitor("monitor"),
    Profile("profile"),
    MetricBucket("metric_bucket"),
    Transaction("transaction"),
    Replay(AnalyticsStrings.BUTTON_EARNINGS_REPLAY),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    DataCategory(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
