package io.bitdrift.capture.replay;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionReplayConfiguration.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R+\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lio/bitdrift/capture/replay/SessionReplayConfiguration;", "", "", "Lio/bitdrift/capture/replay/ReplayType;", "", "", "categorizers", "<init>", "(Ljava/util/Map;)V", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getCategorizers", "()Ljava/util/Map;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SessionReplayConfiguration {
    private final Map<ReplayType, List<String>> categorizers;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SessionReplayConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionReplayConfiguration) && Intrinsics.areEqual(this.categorizers, ((SessionReplayConfiguration) other).categorizers);
    }

    public int hashCode() {
        Map<ReplayType, List<String>> map = this.categorizers;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "SessionReplayConfiguration(categorizers=" + this.categorizers + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SessionReplayConfiguration(Map<ReplayType, ? extends List<String>> map) {
        this.categorizers = map;
    }

    public /* synthetic */ SessionReplayConfiguration(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }

    public final Map<ReplayType, List<String>> getCategorizers() {
        return this.categorizers;
    }
}
