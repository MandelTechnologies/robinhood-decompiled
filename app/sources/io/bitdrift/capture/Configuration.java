package io.bitdrift.capture;

import io.bitdrift.capture.replay.SessionReplayConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Configuration.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lio/bitdrift/capture/Configuration;", "", "Lio/bitdrift/capture/replay/SessionReplayConfiguration;", "sessionReplayConfiguration", "<init>", "(Lio/bitdrift/capture/replay/SessionReplayConfiguration;)V", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/bitdrift/capture/replay/SessionReplayConfiguration;", "getSessionReplayConfiguration", "()Lio/bitdrift/capture/replay/SessionReplayConfiguration;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Configuration {
    private final SessionReplayConfiguration sessionReplayConfiguration;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Configuration() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Configuration) && Intrinsics.areEqual(this.sessionReplayConfiguration, ((Configuration) other).sessionReplayConfiguration);
    }

    public int hashCode() {
        return this.sessionReplayConfiguration.hashCode();
    }

    public String toString() {
        return "Configuration(sessionReplayConfiguration=" + this.sessionReplayConfiguration + ')';
    }

    @JvmOverloads
    public Configuration(SessionReplayConfiguration sessionReplayConfiguration) {
        Intrinsics.checkNotNullParameter(sessionReplayConfiguration, "sessionReplayConfiguration");
        this.sessionReplayConfiguration = sessionReplayConfiguration;
    }

    public /* synthetic */ Configuration(SessionReplayConfiguration sessionReplayConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SessionReplayConfiguration(null, 1, null) : sessionReplayConfiguration);
    }

    public final SessionReplayConfiguration getSessionReplayConfiguration() {
        return this.sessionReplayConfiguration;
    }
}
