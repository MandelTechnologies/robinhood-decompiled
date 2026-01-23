package com.robinhood.android.lib.webview;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebError.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0001\n\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "", "statusCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "HttpError", "Timeout", "MissingAuthToken", "AuthTokenRefreshedTooOften", "LoadingAnimationError", "TooManyConnectivityRequests", "InitialConfigException", "GenericAuthTokenException", "InquiryCreationException", "AndroidWebError", "Lcom/robinhood/android/lib/webview/WebError$AndroidWebError;", "Lcom/robinhood/android/lib/webview/WebError$AuthTokenRefreshedTooOften;", "Lcom/robinhood/android/lib/webview/WebError$GenericAuthTokenException;", "Lcom/robinhood/android/lib/webview/WebError$HttpError;", "Lcom/robinhood/android/lib/webview/WebError$InitialConfigException;", "Lcom/robinhood/android/lib/webview/WebError$InquiryCreationException;", "Lcom/robinhood/android/lib/webview/WebError$LoadingAnimationError;", "Lcom/robinhood/android/lib/webview/WebError$MissingAuthToken;", "Lcom/robinhood/android/lib/webview/WebError$Timeout;", "Lcom/robinhood/android/lib/webview/WebError$TooManyConnectivityRequests;", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class WebError extends Exception {
    private final Integer statusCode;

    public /* synthetic */ WebError(String str, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num);
    }

    private WebError(String str, Integer num) {
        super(str);
        this.statusCode = num;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* compiled from: WebError.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError$HttpError;", "Lcom/robinhood/android/lib/webview/WebError;", "reason", "", "httpStatus", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class HttpError extends WebError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HttpError(String reason, Integer num) {
            super(reason, num, null);
            Intrinsics.checkNotNullParameter(reason, "reason");
        }
    }

    /* compiled from: WebError.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError$Timeout;", "Lcom/robinhood/android/lib/webview/WebError;", "<init>", "()V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Timeout extends WebError {
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
            super("Loading timeout", 0, null);
        }
    }

    /* compiled from: WebError.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError$MissingAuthToken;", "Lcom/robinhood/android/lib/webview/WebError;", "<init>", "()V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MissingAuthToken extends WebError {
        public static final MissingAuthToken INSTANCE = new MissingAuthToken();

        private MissingAuthToken() {
            super("No token to refresh", 1, null);
        }
    }

    /* compiled from: WebError.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError$AuthTokenRefreshedTooOften;", "Lcom/robinhood/android/lib/webview/WebError;", "<init>", "()V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AuthTokenRefreshedTooOften extends WebError {
        public static final AuthTokenRefreshedTooOften INSTANCE = new AuthTokenRefreshedTooOften();

        private AuthTokenRefreshedTooOften() {
            super("Token refreshed too recently", 2, null);
        }
    }

    /* compiled from: WebError.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError$LoadingAnimationError;", "Lcom/robinhood/android/lib/webview/WebError;", "<init>", "()V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoadingAnimationError extends WebError {
        public static final LoadingAnimationError INSTANCE = new LoadingAnimationError();

        private LoadingAnimationError() {
            super("Lottie failure", 3, null);
        }
    }

    /* compiled from: WebError.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError$TooManyConnectivityRequests;", "Lcom/robinhood/android/lib/webview/WebError;", "<init>", "()V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TooManyConnectivityRequests extends WebError {
        public static final TooManyConnectivityRequests INSTANCE = new TooManyConnectivityRequests();

        private TooManyConnectivityRequests() {
            super("Too many connectivity requests", 7, null);
        }
    }

    /* compiled from: WebError.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError$InitialConfigException;", "Lcom/robinhood/android/lib/webview/WebError;", "reason", "", "<init>", "(Ljava/lang/String;)V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InitialConfigException extends WebError {
        public InitialConfigException(String str) {
            super(str == null ? "Initial config exception" : str, 4, null);
        }
    }

    /* compiled from: WebError.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError$GenericAuthTokenException;", "Lcom/robinhood/android/lib/webview/WebError;", "reason", "", "<init>", "(Ljava/lang/String;)V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GenericAuthTokenException extends WebError {
        public GenericAuthTokenException(String str) {
            super(str == null ? "Auth token exception" : str, 4, null);
        }
    }

    /* compiled from: WebError.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError$InquiryCreationException;", "Lcom/robinhood/android/lib/webview/WebError;", "reason", "", "<init>", "(Ljava/lang/String;)V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InquiryCreationException extends WebError {
        /* JADX WARN: Multi-variable type inference failed */
        public InquiryCreationException() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ InquiryCreationException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public InquiryCreationException(String str) {
            super(str == null ? "Error creating inquiry" : str, 6, null);
        }
    }

    /* compiled from: WebError.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebError$AndroidWebError;", "Lcom/robinhood/android/lib/webview/WebError;", "reason", "", "statusCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AndroidWebError extends WebError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidWebError(String reason, Integer num) {
            super(reason, Integer.valueOf((num != null ? num.intValue() : 0) + 1000), null);
            Intrinsics.checkNotNullParameter(reason, "reason");
        }
    }
}
