package io.bitdrift.capture;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Capture.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/LoggerState;", "", "()V", "NotStarted", "StartFailure", "Started", "Starting", "Lio/bitdrift/capture/LoggerState$NotStarted;", "Lio/bitdrift/capture/LoggerState$StartFailure;", "Lio/bitdrift/capture/LoggerState$Started;", "Lio/bitdrift/capture/LoggerState$Starting;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.LoggerState, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class Capture3 {
    public /* synthetic */ Capture3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Capture3() {
    }

    /* compiled from: Capture.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/LoggerState$NotStarted;", "Lio/bitdrift/capture/LoggerState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.LoggerState$NotStarted */
    public static final /* data */ class NotStarted extends Capture3 {
        public static final NotStarted INSTANCE = new NotStarted();

        public boolean equals(Object other) {
            return this == other || (other instanceof NotStarted);
        }

        public int hashCode() {
            return -527882771;
        }

        public String toString() {
            return "NotStarted";
        }

        private NotStarted() {
            super(null);
        }
    }

    /* compiled from: Capture.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/LoggerState$Starting;", "Lio/bitdrift/capture/LoggerState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.LoggerState$Starting */
    public static final /* data */ class Starting extends Capture3 {
        public static final Starting INSTANCE = new Starting();

        public boolean equals(Object other) {
            return this == other || (other instanceof Starting);
        }

        public int hashCode() {
            return -1540816961;
        }

        public String toString() {
            return "Starting";
        }

        private Starting() {
            super(null);
        }
    }

    /* compiled from: Capture.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lio/bitdrift/capture/LoggerState$Started;", "Lio/bitdrift/capture/LoggerState;", "logger", "Lio/bitdrift/capture/LoggerImpl;", "(Lio/bitdrift/capture/LoggerImpl;)V", "getLogger", "()Lio/bitdrift/capture/LoggerImpl;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.LoggerState$Started */
    public static final class Started extends Capture3 {
        private final LoggerImpl logger;

        public final LoggerImpl getLogger() {
            return this.logger;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Started(LoggerImpl logger) {
            super(null);
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.logger = logger;
        }
    }

    /* compiled from: Capture.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/LoggerState$StartFailure;", "Lio/bitdrift/capture/LoggerState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.LoggerState$StartFailure */
    public static final /* data */ class StartFailure extends Capture3 {
        public static final StartFailure INSTANCE = new StartFailure();

        public boolean equals(Object other) {
            return this == other || (other instanceof StartFailure);
        }

        public int hashCode() {
            return 314243783;
        }

        public String toString() {
            return "StartFailure";
        }

        private StartFailure() {
            super(null);
        }
    }
}
