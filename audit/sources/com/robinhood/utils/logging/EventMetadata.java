package com.robinhood.utils.logging;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventMetadata.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003JA\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/utils/logging/EventMetadata;", "", "team", "Lcom/robinhood/utils/logging/SentryTeam;", "tags", "", "", "extras", "<init>", "(Lcom/robinhood/utils/logging/SentryTeam;Ljava/util/Map;Ljava/util/Map;)V", "getTeam", "()Lcom/robinhood/utils/logging/SentryTeam;", "getTags", "()Ljava/util/Map;", "getExtras", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EventMetadata {
    private final Map<String, Object> extras;
    private final Map<String, String> tags;
    private final SentryTeam team;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, SentryTeam sentryTeam, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            sentryTeam = eventMetadata.team;
        }
        if ((i & 2) != 0) {
            map = eventMetadata.tags;
        }
        if ((i & 4) != 0) {
            map2 = eventMetadata.extras;
        }
        return eventMetadata.copy(sentryTeam, map, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final SentryTeam getTeam() {
        return this.team;
    }

    public final Map<String, String> component2() {
        return this.tags;
    }

    public final Map<String, Object> component3() {
        return this.extras;
    }

    public final EventMetadata copy(SentryTeam team, Map<String, String> tags, Map<String, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new EventMetadata(team, tags, extras);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) other;
        return this.team == eventMetadata.team && Intrinsics.areEqual(this.tags, eventMetadata.tags) && Intrinsics.areEqual(this.extras, eventMetadata.extras);
    }

    public int hashCode() {
        return (((this.team.hashCode() * 31) + this.tags.hashCode()) * 31) + this.extras.hashCode();
    }

    public String toString() {
        return "EventMetadata(team=" + this.team + ", tags=" + this.tags + ", extras=" + this.extras + ")";
    }

    public EventMetadata(SentryTeam team, Map<String, String> tags, Map<String, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.team = team;
        this.tags = tags;
        this.extras = extras;
    }

    public final SentryTeam getTeam() {
        return this.team;
    }

    public /* synthetic */ EventMetadata(SentryTeam sentryTeam, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryTeam, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? MapsKt.emptyMap() : map2);
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final Map<String, Object> getExtras() {
        return this.extras;
    }
}
