package io.sentry.metrics;

import com.singular.sdk.internal.Constants;

/* loaded from: classes14.dex */
public enum MetricType {
    Counter("c"),
    Gauge("g"),
    Distribution("d"),
    Set(Constants.RequestParamsKeys.SESSION_ID_KEY);

    final String statsdCode;

    MetricType(String str) {
        this.statsdCode = str;
    }
}
