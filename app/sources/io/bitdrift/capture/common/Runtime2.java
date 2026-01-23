package io.bitdrift.capture.common;

import com.robinhood.android.optionschain.OptionChainListView9;
import com.robinhood.compose.bento.component.rows.Timeline;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Runtime.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeConfig;", "", "configName", "", "defaultValue", "", "(Ljava/lang/String;I)V", "getConfigName", "()Ljava/lang/String;", "getDefaultValue", "()I", "ANR_FRAME_THRESHOLD_MS", "FROZEN_FRAME_THRESHOLD_MS", "JANK_FRAME_HEURISTICS_MULTIPLIER", "MIN_JANK_FRAME_THRESHOLD_MS", "Lio/bitdrift/capture/common/RuntimeConfig$ANR_FRAME_THRESHOLD_MS;", "Lio/bitdrift/capture/common/RuntimeConfig$FROZEN_FRAME_THRESHOLD_MS;", "Lio/bitdrift/capture/common/RuntimeConfig$JANK_FRAME_HEURISTICS_MULTIPLIER;", "Lio/bitdrift/capture/common/RuntimeConfig$MIN_JANK_FRAME_THRESHOLD_MS;", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.common.RuntimeConfig, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class Runtime2 {
    private final String configName;
    private final int defaultValue;

    public /* synthetic */ Runtime2(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    private Runtime2(String str, int i) {
        this.configName = str;
        this.defaultValue = i;
    }

    public final String getConfigName() {
        return this.configName;
    }

    public final int getDefaultValue() {
        return this.defaultValue;
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeConfig$JANK_FRAME_HEURISTICS_MULTIPLIER;", "Lio/bitdrift/capture/common/RuntimeConfig;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeConfig$JANK_FRAME_HEURISTICS_MULTIPLIER */
    public static final /* data */ class JANK_FRAME_HEURISTICS_MULTIPLIER extends Runtime2 {
        public static final JANK_FRAME_HEURISTICS_MULTIPLIER INSTANCE = new JANK_FRAME_HEURISTICS_MULTIPLIER();

        public boolean equals(Object other) {
            return this == other || (other instanceof JANK_FRAME_HEURISTICS_MULTIPLIER);
        }

        public int hashCode() {
            return -894555841;
        }

        public String toString() {
            return "JANK_FRAME_HEURISTICS_MULTIPLIER";
        }

        private JANK_FRAME_HEURISTICS_MULTIPLIER() {
            super("client_feature.android.jank_frame_heuristics_multiplier", 2, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeConfig$MIN_JANK_FRAME_THRESHOLD_MS;", "Lio/bitdrift/capture/common/RuntimeConfig;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeConfig$MIN_JANK_FRAME_THRESHOLD_MS */
    public static final /* data */ class MIN_JANK_FRAME_THRESHOLD_MS extends Runtime2 {
        public static final MIN_JANK_FRAME_THRESHOLD_MS INSTANCE = new MIN_JANK_FRAME_THRESHOLD_MS();

        public boolean equals(Object other) {
            return this == other || (other instanceof MIN_JANK_FRAME_THRESHOLD_MS);
        }

        public int hashCode() {
            return -1451646875;
        }

        public String toString() {
            return "MIN_JANK_FRAME_THRESHOLD_MS";
        }

        private MIN_JANK_FRAME_THRESHOLD_MS() {
            super("client_feature.android.min_jank_frame.threshold_ms", 16, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeConfig$FROZEN_FRAME_THRESHOLD_MS;", "Lio/bitdrift/capture/common/RuntimeConfig;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeConfig$FROZEN_FRAME_THRESHOLD_MS */
    public static final /* data */ class FROZEN_FRAME_THRESHOLD_MS extends Runtime2 {
        public static final FROZEN_FRAME_THRESHOLD_MS INSTANCE = new FROZEN_FRAME_THRESHOLD_MS();

        public boolean equals(Object other) {
            return this == other || (other instanceof FROZEN_FRAME_THRESHOLD_MS);
        }

        public int hashCode() {
            return -293812922;
        }

        public String toString() {
            return "FROZEN_FRAME_THRESHOLD_MS";
        }

        private FROZEN_FRAME_THRESHOLD_MS() {
            super("client_feature.android.frozen_frame.threshold_ms", Timeline.MIDDLE_META_OFFSET_ANIMATION_DURATION, null);
        }
    }

    /* compiled from: Runtime.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/common/RuntimeConfig$ANR_FRAME_THRESHOLD_MS;", "Lio/bitdrift/capture/common/RuntimeConfig;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.common.RuntimeConfig$ANR_FRAME_THRESHOLD_MS */
    public static final /* data */ class ANR_FRAME_THRESHOLD_MS extends Runtime2 {
        public static final ANR_FRAME_THRESHOLD_MS INSTANCE = new ANR_FRAME_THRESHOLD_MS();

        public boolean equals(Object other) {
            return this == other || (other instanceof ANR_FRAME_THRESHOLD_MS);
        }

        public int hashCode() {
            return 1757405419;
        }

        public String toString() {
            return "ANR_FRAME_THRESHOLD_MS";
        }

        private ANR_FRAME_THRESHOLD_MS() {
            super("client_feature.android.anr_frame.threshold_ms", OptionChainListView9.SELLOUT_SNACKBAR_DISPLAY_DURATION_MS, null);
        }
    }
}
