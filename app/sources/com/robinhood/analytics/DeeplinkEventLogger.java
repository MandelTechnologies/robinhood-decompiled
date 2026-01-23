package com.robinhood.analytics;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: DeeplinkEventLogger.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/analytics/DeeplinkEventLogger;", "", "logDeeplinkResolutionMetric", "", "deeplinkUri", "Landroid/net/Uri;", "resolutionTimeInMillis", "", "logDeeplinkBlocked", "url", "Lokhttp3/HttpUrl;", "logDeeplinkMatchSuccess", "uri", "logDeeplinkMatchFailure", "Noop", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface DeeplinkEventLogger {
    void logDeeplinkBlocked(HttpUrl url);

    void logDeeplinkMatchFailure(Uri uri);

    void logDeeplinkMatchSuccess(Uri uri);

    void logDeeplinkResolutionMetric(Uri deeplinkUri, long resolutionTimeInMillis);

    /* compiled from: DeeplinkEventLogger.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/analytics/DeeplinkEventLogger$Noop;", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "<init>", "()V", "logDeeplinkResolutionMetric", "", "deeplinkUri", "Landroid/net/Uri;", "resolutionTimeInMillis", "", "logDeeplinkBlocked", "url", "Lokhttp3/HttpUrl;", "logDeeplinkMatchSuccess", "uri", "logDeeplinkMatchFailure", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Noop implements DeeplinkEventLogger {
        public static final Noop INSTANCE = new Noop();

        public boolean equals(Object other) {
            return this == other || (other instanceof Noop);
        }

        public int hashCode() {
            return 1011386153;
        }

        @Override // com.robinhood.analytics.DeeplinkEventLogger
        public void logDeeplinkBlocked(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }

        @Override // com.robinhood.analytics.DeeplinkEventLogger
        public void logDeeplinkMatchFailure(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
        }

        @Override // com.robinhood.analytics.DeeplinkEventLogger
        public void logDeeplinkMatchSuccess(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
        }

        @Override // com.robinhood.analytics.DeeplinkEventLogger
        public void logDeeplinkResolutionMetric(Uri deeplinkUri, long resolutionTimeInMillis) {
            Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        }

        public String toString() {
            return "Noop";
        }

        private Noop() {
        }
    }
}
