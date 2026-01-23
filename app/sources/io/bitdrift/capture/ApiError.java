package io.bitdrift.capture;

import com.robinhood.android.car.result.CarResultComposable2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lio/bitdrift/capture/ApiError;", "Lio/bitdrift/capture/Error;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "NetworkError", "SerializationError", "ServerError", "Lio/bitdrift/capture/ApiError$NetworkError;", "Lio/bitdrift/capture/ApiError$SerializationError;", "Lio/bitdrift/capture/ApiError$ServerError;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public abstract class ApiError extends Error {
    private final String message;

    public /* synthetic */ ApiError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // io.bitdrift.capture.Error
    public String getMessage() {
        return this.message;
    }

    private ApiError(String str) {
        super(str, null);
        this.message = str;
    }

    /* compiled from: Models.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lio/bitdrift/capture/ApiError$NetworkError;", "Lio/bitdrift/capture/ApiError;", "", "message", "<init>", "(Ljava/lang/String;)V", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class NetworkError extends ApiError {
        private final String message;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkError) && Intrinsics.areEqual(this.message, ((NetworkError) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "NetworkError(message=" + this.message + ')';
        }

        @Override // io.bitdrift.capture.ApiError, io.bitdrift.capture.Error
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }
    }

    /* compiled from: Models.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lio/bitdrift/capture/ApiError$ServerError;", "Lio/bitdrift/capture/ApiError;", "", "statusCode", "", CarResultComposable2.BODY, "<init>", "(ILjava/lang/String;)V", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStatusCode", "Ljava/lang/String;", "getBody", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ServerError extends ApiError {
        private final String body;
        private final int statusCode;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerError)) {
                return false;
            }
            ServerError serverError = (ServerError) other;
            return this.statusCode == serverError.statusCode && Intrinsics.areEqual(this.body, serverError.body);
        }

        public int hashCode() {
            int i = this.statusCode * 31;
            String str = this.body;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ServerError(statusCode=" + this.statusCode + ", body=" + this.body + ')';
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public ServerError(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str == null ? "Server Error" : str);
            sb.append(". statusCode=");
            sb.append(i);
            super(sb.toString(), null);
            this.statusCode = i;
            this.body = str;
        }
    }

    /* compiled from: Models.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lio/bitdrift/capture/ApiError$SerializationError;", "Lio/bitdrift/capture/ApiError;", "", "message", "<init>", "(Ljava/lang/String;)V", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SerializationError extends ApiError {
        private final String message;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SerializationError) && Intrinsics.areEqual(this.message, ((SerializationError) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "SerializationError(message=" + this.message + ')';
        }

        @Override // io.bitdrift.capture.ApiError, io.bitdrift.capture.Error
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializationError(String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }
    }
}
