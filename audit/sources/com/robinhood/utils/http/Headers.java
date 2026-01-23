package com.robinhood.utils.http;

import kotlin.Metadata;

/* compiled from: Headers.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/utils/http/Headers;", "", "<init>", "()V", "AUTHORIZATION", "", "LOCATION", "LANGUAGE", "USER_AGENT", "RETRY_AFTER", "FULL_EXTENDED_HOURS_REQUEST", "HYPER_EXTENDED_REQUEST", "OPTION_LATE_CLOSE_REQUEST", "JAEGER_DEBUG_ID", "POLL_INTERVAL", "CONFLICTING_RESOURCE", "TIME_ZONE_ID", "CHALLENGE_RESPONSE_ID", "DEVICE_ID", "DONT_INTERCEPT_FOR_OAUTH_HEADER", "OMIT_AUTH_HEADER", "LOG_FULL_REQUEST", "READ_TIMEOUT_SECONDS_OVERRIDE", "WRITE_TIMEOUT_SECONDS_OVERRIDE", "GZIP_REQUEST_BODY", "RH_CONTRACT_PROTECTED", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Headers {
    public static final String AUTHORIZATION = "Authorization";
    public static final String CHALLENGE_RESPONSE_ID = "X-Robinhood-Challenge-Response-ID";
    public static final String CONFLICTING_RESOURCE = "X-Conflicting-Resource";
    public static final String DEVICE_ID = "X-Robinhood-Device-ID";
    public static final String DONT_INTERCEPT_FOR_OAUTH_HEADER = "X-Dont-Intercept-For-OAuth";
    public static final String FULL_EXTENDED_HOURS_REQUEST = "X-Full-Ex";
    public static final String GZIP_REQUEST_BODY = "X-Gzip-Request-Body";
    public static final String HYPER_EXTENDED_REQUEST = "X-Hyper-Ex";
    public static final Headers INSTANCE = new Headers();
    public static final String JAEGER_DEBUG_ID = "jaeger-debug-id";
    public static final String LANGUAGE = "Accept-Language";
    public static final String LOCATION = "Location";
    public static final String LOG_FULL_REQUEST = "X-Log-Full-Request";
    public static final String OMIT_AUTH_HEADER = "X-Omit-Auth-Header";
    public static final String OPTION_LATE_CLOSE_REQUEST = "X-Options-Late-Close";
    public static final String POLL_INTERVAL = "X-Poll-Interval";
    public static final String READ_TIMEOUT_SECONDS_OVERRIDE = "X-Read-Timeout-Seconds-Override";
    public static final String RETRY_AFTER = "Retry-After";
    public static final String RH_CONTRACT_PROTECTED = "Rh-Contract-Protected";
    public static final String TIME_ZONE_ID = "X-TimeZone-Id";
    public static final String USER_AGENT = "User-Agent";
    public static final String WRITE_TIMEOUT_SECONDS_OVERRIDE = "X-Write-Timeout-Seconds-Override";

    private Headers() {
    }
}
