package io.bitdrift.capture.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Runtime.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\n\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature;", "", "featureName", "", "defaultValue", "", "(Ljava/lang/String;Z)V", "getDefaultValue", "()Z", "getFeatureName", "()Ljava/lang/String;", "APP_EXIT_EVENTS", "APP_LIFECYCLE_EVENTS", "APP_MEMORY_PRESSURE", "APP_UPDATE_EVENTS", "DEVICE_STATE_EVENTS", "DISK_USAGE_FIELDS", "DROPPED_EVENTS_MONITORING", "INTERNAL_LOGS", "LOGGER_FLUSHING_ON_CRASH", "SESSION_REPLAY_COMPOSE", "Lio/bitdrift/capture/common/RuntimeFeature$APP_EXIT_EVENTS;", "Lio/bitdrift/capture/common/RuntimeFeature$APP_LIFECYCLE_EVENTS;", "Lio/bitdrift/capture/common/RuntimeFeature$APP_MEMORY_PRESSURE;", "Lio/bitdrift/capture/common/RuntimeFeature$APP_UPDATE_EVENTS;", "Lio/bitdrift/capture/common/RuntimeFeature$DEVICE_STATE_EVENTS;", "Lio/bitdrift/capture/common/RuntimeFeature$DISK_USAGE_FIELDS;", "Lio/bitdrift/capture/common/RuntimeFeature$DROPPED_EVENTS_MONITORING;", "Lio/bitdrift/capture/common/RuntimeFeature$INTERNAL_LOGS;", "Lio/bitdrift/capture/common/RuntimeFeature$LOGGER_FLUSHING_ON_CRASH;", "Lio/bitdrift/capture/common/RuntimeFeature$SESSION_REPLAY_COMPOSE;", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.common.RuntimeFeature, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class Runtime3 {
    private final boolean defaultValue;
    private final String featureName;

    public /* synthetic */ Runtime3(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    private Runtime3(String str, boolean z) {
        this.featureName = str;
        this.defaultValue = z;
    }

    public final String getFeatureName() {
        return this.featureName;
    }

    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature$SESSION_REPLAY_COMPOSE;", "Lio/bitdrift/capture/common/RuntimeFeature;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeFeature$SESSION_REPLAY_COMPOSE */
    public static final /* data */ class SESSION_REPLAY_COMPOSE extends Runtime3 {
        public static final SESSION_REPLAY_COMPOSE INSTANCE = new SESSION_REPLAY_COMPOSE();

        public boolean equals(Object other) {
            return this == other || (other instanceof SESSION_REPLAY_COMPOSE);
        }

        public int hashCode() {
            return 1317559010;
        }

        public String toString() {
            return "SESSION_REPLAY_COMPOSE";
        }

        private SESSION_REPLAY_COMPOSE() {
            super("client_feature.android.session_replay_compose", true, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature$APP_UPDATE_EVENTS;", "Lio/bitdrift/capture/common/RuntimeFeature;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeFeature$APP_UPDATE_EVENTS */
    public static final /* data */ class APP_UPDATE_EVENTS extends Runtime3 {
        public static final APP_UPDATE_EVENTS INSTANCE = new APP_UPDATE_EVENTS();

        public boolean equals(Object other) {
            return this == other || (other instanceof APP_UPDATE_EVENTS);
        }

        public int hashCode() {
            return -1037639854;
        }

        public String toString() {
            return "APP_UPDATE_EVENTS";
        }

        private APP_UPDATE_EVENTS() {
            super("client_feature.android.application_update_reporting", true, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature$APP_MEMORY_PRESSURE;", "Lio/bitdrift/capture/common/RuntimeFeature;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeFeature$APP_MEMORY_PRESSURE */
    public static final /* data */ class APP_MEMORY_PRESSURE extends Runtime3 {
        public static final APP_MEMORY_PRESSURE INSTANCE = new APP_MEMORY_PRESSURE();

        public boolean equals(Object other) {
            return this == other || (other instanceof APP_MEMORY_PRESSURE);
        }

        public int hashCode() {
            return -1373036282;
        }

        public String toString() {
            return "APP_MEMORY_PRESSURE";
        }

        private APP_MEMORY_PRESSURE() {
            super("client_feature.android.memory_pressure_reporting", true, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature$DEVICE_STATE_EVENTS;", "Lio/bitdrift/capture/common/RuntimeFeature;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeFeature$DEVICE_STATE_EVENTS */
    public static final /* data */ class DEVICE_STATE_EVENTS extends Runtime3 {
        public static final DEVICE_STATE_EVENTS INSTANCE = new DEVICE_STATE_EVENTS();

        public boolean equals(Object other) {
            return this == other || (other instanceof DEVICE_STATE_EVENTS);
        }

        public int hashCode() {
            return -1528922255;
        }

        public String toString() {
            return "DEVICE_STATE_EVENTS";
        }

        private DEVICE_STATE_EVENTS() {
            super("client_features.android.device_lifecycle_reporting", true, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature$APP_LIFECYCLE_EVENTS;", "Lio/bitdrift/capture/common/RuntimeFeature;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeFeature$APP_LIFECYCLE_EVENTS */
    public static final /* data */ class APP_LIFECYCLE_EVENTS extends Runtime3 {
        public static final APP_LIFECYCLE_EVENTS INSTANCE = new APP_LIFECYCLE_EVENTS();

        public boolean equals(Object other) {
            return this == other || (other instanceof APP_LIFECYCLE_EVENTS);
        }

        public int hashCode() {
            return -1554574645;
        }

        public String toString() {
            return "APP_LIFECYCLE_EVENTS";
        }

        private APP_LIFECYCLE_EVENTS() {
            super("client_feature.android.application_lifecycle_reporting", true, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature$APP_EXIT_EVENTS;", "Lio/bitdrift/capture/common/RuntimeFeature;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeFeature$APP_EXIT_EVENTS */
    public static final /* data */ class APP_EXIT_EVENTS extends Runtime3 {
        public static final APP_EXIT_EVENTS INSTANCE = new APP_EXIT_EVENTS();

        public boolean equals(Object other) {
            return this == other || (other instanceof APP_EXIT_EVENTS);
        }

        public int hashCode() {
            return -1579260387;
        }

        public String toString() {
            return "APP_EXIT_EVENTS";
        }

        private APP_EXIT_EVENTS() {
            super("client_feature.android.application_exit_reporting", true, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature$DISK_USAGE_FIELDS;", "Lio/bitdrift/capture/common/RuntimeFeature;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeFeature$DISK_USAGE_FIELDS */
    public static final /* data */ class DISK_USAGE_FIELDS extends Runtime3 {
        public static final DISK_USAGE_FIELDS INSTANCE = new DISK_USAGE_FIELDS();

        public boolean equals(Object other) {
            return this == other || (other instanceof DISK_USAGE_FIELDS);
        }

        public int hashCode() {
            return -1679370662;
        }

        public String toString() {
            return "DISK_USAGE_FIELDS";
        }

        private DISK_USAGE_FIELDS() {
            super("client_feature.android.disk_usage_reporting", true, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature$INTERNAL_LOGS;", "Lio/bitdrift/capture/common/RuntimeFeature;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeFeature$INTERNAL_LOGS */
    public static final /* data */ class INTERNAL_LOGS extends Runtime3 {
        public static final INTERNAL_LOGS INSTANCE = new INTERNAL_LOGS();

        public boolean equals(Object other) {
            return this == other || (other instanceof INTERNAL_LOGS);
        }

        public int hashCode() {
            return 1929853490;
        }

        public String toString() {
            return "INTERNAL_LOGS";
        }

        private INTERNAL_LOGS() {
            super("client_feature.android.internal_logs", false, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature$LOGGER_FLUSHING_ON_CRASH;", "Lio/bitdrift/capture/common/RuntimeFeature;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeFeature$LOGGER_FLUSHING_ON_CRASH */
    public static final /* data */ class LOGGER_FLUSHING_ON_CRASH extends Runtime3 {
        public static final LOGGER_FLUSHING_ON_CRASH INSTANCE = new LOGGER_FLUSHING_ON_CRASH();

        public boolean equals(Object other) {
            return this == other || (other instanceof LOGGER_FLUSHING_ON_CRASH);
        }

        public int hashCode() {
            return -1746652648;
        }

        public String toString() {
            return "LOGGER_FLUSHING_ON_CRASH";
        }

        private LOGGER_FLUSHING_ON_CRASH() {
            super("client_feature.android.logger_flushing_on_force_quit", true, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeFeature$DROPPED_EVENTS_MONITORING;", "Lio/bitdrift/capture/common/RuntimeFeature;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeFeature$DROPPED_EVENTS_MONITORING */
    public static final /* data */ class DROPPED_EVENTS_MONITORING extends Runtime3 {
        public static final DROPPED_EVENTS_MONITORING INSTANCE = new DROPPED_EVENTS_MONITORING();

        public boolean equals(Object other) {
            return this == other || (other instanceof DROPPED_EVENTS_MONITORING);
        }

        public int hashCode() {
            return 1503444752;
        }

        public String toString() {
            return "DROPPED_EVENTS_MONITORING";
        }

        private DROPPED_EVENTS_MONITORING() {
            super("client_feature.android.dropped_frames_reporting", true, null);
        }
    }
}
