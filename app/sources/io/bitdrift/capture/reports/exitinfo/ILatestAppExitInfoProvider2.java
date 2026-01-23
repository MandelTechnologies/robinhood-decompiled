package io.bitdrift.capture.reports.exitinfo;

import android.app.ApplicationExitInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ILatestAppExitInfoProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult;", "", "()V", "Empty", "Error", "ProcessNameNotFound", "Valid", "Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult$Empty;", "Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult$Error;", "Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult$ProcessNameNotFound;", "Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult$Valid;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.reports.exitinfo.LatestAppExitReasonResult, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class ILatestAppExitInfoProvider2 {
    public /* synthetic */ ILatestAppExitInfoProvider2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ILatestAppExitInfoProvider2() {
    }

    /* compiled from: ILatestAppExitInfoProvider.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult$Valid;", "Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult;", "Landroid/app/ApplicationExitInfo;", "applicationExitInfo", "<init>", "(Landroid/app/ApplicationExitInfo;)V", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/app/ApplicationExitInfo;", "getApplicationExitInfo", "()Landroid/app/ApplicationExitInfo;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.reports.exitinfo.LatestAppExitReasonResult$Valid, reason: from toString */
    public static final /* data */ class Valid extends ILatestAppExitInfoProvider2 {
        private final ApplicationExitInfo applicationExitInfo;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Valid) && Intrinsics.areEqual(this.applicationExitInfo, ((Valid) other).applicationExitInfo);
        }

        public int hashCode() {
            return this.applicationExitInfo.hashCode();
        }

        public String toString() {
            return "Valid(applicationExitInfo=" + this.applicationExitInfo + ')';
        }

        public final ApplicationExitInfo getApplicationExitInfo() {
            return this.applicationExitInfo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Valid(ApplicationExitInfo applicationExitInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(applicationExitInfo, "applicationExitInfo");
            this.applicationExitInfo = applicationExitInfo;
        }
    }

    /* compiled from: ILatestAppExitInfoProvider.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult$Empty;", "Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.reports.exitinfo.LatestAppExitReasonResult$Empty */
    public static final /* data */ class Empty extends ILatestAppExitInfoProvider2 {
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return -2135657001;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
            super(null);
        }
    }

    /* compiled from: ILatestAppExitInfoProvider.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult$ProcessNameNotFound;", "Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.reports.exitinfo.LatestAppExitReasonResult$ProcessNameNotFound */
    public static final /* data */ class ProcessNameNotFound extends ILatestAppExitInfoProvider2 {
        public static final ProcessNameNotFound INSTANCE = new ProcessNameNotFound();

        public boolean equals(Object other) {
            return this == other || (other instanceof ProcessNameNotFound);
        }

        public int hashCode() {
            return -1842190541;
        }

        public String toString() {
            return "ProcessNameNotFound";
        }

        private ProcessNameNotFound() {
            super(null);
        }
    }

    /* compiled from: ILatestAppExitInfoProvider.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult$Error;", "Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult;", "", "message", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.reports.exitinfo.LatestAppExitReasonResult$Error, reason: from toString */
    public static final /* data */ class Error extends ILatestAppExitInfoProvider2 {
        private final String message;
        private final Throwable throwable;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.throwable, error.throwable);
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.throwable.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ", throwable=" + this.throwable + ')';
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.message = message;
            this.throwable = throwable;
        }
    }
}
