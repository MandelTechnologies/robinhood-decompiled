package io.bitdrift.capture.network.okhttp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OkHttpApiClient.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\n¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/network/okhttp/HttpApiEndpoint;", "", "", "path", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "ReportSdkError", "Lio/bitdrift/capture/network/okhttp/HttpApiEndpoint$ReportSdkError;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.network.okhttp.HttpApiEndpoint, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class OkHttpApiClient4 {
    private final String path;

    public /* synthetic */ OkHttpApiClient4(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private OkHttpApiClient4(String str) {
        this.path = str;
    }

    public final String getPath() {
        return this.path;
    }

    /* compiled from: OkHttpApiClient.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/network/okhttp/HttpApiEndpoint$ReportSdkError;", "Lio/bitdrift/capture/network/okhttp/HttpApiEndpoint;", "()V", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.network.okhttp.HttpApiEndpoint$ReportSdkError */
    public static final class ReportSdkError extends OkHttpApiClient4 {
        public static final ReportSdkError INSTANCE = new ReportSdkError();

        private ReportSdkError() {
            super("v1/sdk-errors", null);
        }
    }
}
