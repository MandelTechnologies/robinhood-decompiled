package io.bitdrift.capture.reports;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FatalIssueMechanism.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lio/bitdrift/capture/reports/FatalIssueMechanism;", "", "", "displayName", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "BuiltIn", "None", "Lio/bitdrift/capture/reports/FatalIssueMechanism$BuiltIn;", "Lio/bitdrift/capture/reports/FatalIssueMechanism$None;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public abstract class FatalIssueMechanism {
    private final String displayName;

    public /* synthetic */ FatalIssueMechanism(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private FatalIssueMechanism(String str) {
        this.displayName = str;
    }

    /* compiled from: FatalIssueMechanism.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/reports/FatalIssueMechanism$BuiltIn;", "Lio/bitdrift/capture/reports/FatalIssueMechanism;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class BuiltIn extends FatalIssueMechanism {
        public static final BuiltIn INSTANCE = new BuiltIn();

        public boolean equals(Object other) {
            return this == other || (other instanceof BuiltIn);
        }

        public int hashCode() {
            return 311959032;
        }

        public String toString() {
            return "BuiltIn";
        }

        private BuiltIn() {
            super("BUILT_IN", null);
        }
    }

    /* compiled from: FatalIssueMechanism.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/reports/FatalIssueMechanism$None;", "Lio/bitdrift/capture/reports/FatalIssueMechanism;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class None extends FatalIssueMechanism {
        public static final None INSTANCE = new None();

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return 1956748707;
        }

        public String toString() {
            return "None";
        }

        private None() {
            super("NONE", null);
        }
    }
}
