package com.robinhood.android.moria.network.bouncer;

import com.robinhood.android.moria.network.bouncer.SyncState;
import com.robinhood.android.moria.network.bouncer.internal.MetadataMap;
import com.robinhood.models.card.p311db.Card;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: RealMetadata.kt */
@kotlin.Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR8\u0010!\u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u000e0\u000e \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010(\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/moria/network/bouncer/RealMetadata;", "", "P", "Lcom/robinhood/android/moria/network/bouncer/Metadata;", "params", "Lcom/robinhood/android/moria/network/bouncer/internal/MetadataMap;", "metadataMap", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljava/lang/Object;Lcom/robinhood/android/moria/network/bouncer/internal/MetadataMap;Lj$/time/Clock;)V", "", "bumpInCache", "()V", "Ljava/util/UUID;", "onRequestInitiated", "()Ljava/util/UUID;", "requestUuid", "onRequestSucceeded", "(Ljava/util/UUID;)V", "", "throwable", "onRequestFailed", "(Ljava/util/UUID;Ljava/lang/Throwable;)V", "onRequestDisposed", "Ljava/lang/Object;", "getParams", "()Ljava/lang/Object;", "Lcom/robinhood/android/moria/network/bouncer/internal/MetadataMap;", "Lj$/time/Clock;", "", "kotlin.jvm.PlatformType", "", "requestsInFlight", "Ljava/util/Set;", "Lcom/robinhood/android/moria/network/bouncer/SyncState;", "lastTerminalSyncState", "Lcom/robinhood/android/moria/network/bouncer/SyncState;", "", "value", "lastUpdatedAt", "Ljava/lang/Long;", "getLastUpdatedAt", "()Ljava/lang/Long;", "getState", "()Lcom/robinhood/android/moria/network/bouncer/SyncState;", "state", "", "isInFlight", "()Z", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RealMetadata<P> implements Metadata {
    private final Clock clock;
    private volatile SyncState lastTerminalSyncState;
    private volatile Long lastUpdatedAt;
    private final MetadataMap<P> metadataMap;
    private final P params;
    private final Set<UUID> requestsInFlight;

    public RealMetadata(P params, MetadataMap<P> metadataMap, Clock clock) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(metadataMap, "metadataMap");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.params = params;
        this.metadataMap = metadataMap;
        this.clock = clock;
        this.requestsInFlight = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public final P getParams() {
        return this.params;
    }

    @Override // com.robinhood.android.moria.network.bouncer.Metadata
    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    @Override // com.robinhood.android.moria.network.bouncer.Metadata
    public SyncState getState() {
        if (isInFlight()) {
            return SyncState.Loading.INSTANCE;
        }
        SyncState syncState = this.lastTerminalSyncState;
        return syncState == null ? SyncState.Idle.INSTANCE : syncState;
    }

    @Override // com.robinhood.android.moria.network.bouncer.Metadata
    public boolean isInFlight() {
        Set<UUID> requestsInFlight = this.requestsInFlight;
        Intrinsics.checkNotNullExpressionValue(requestsInFlight, "requestsInFlight");
        return !requestsInFlight.isEmpty();
    }

    @Override // com.robinhood.android.moria.network.bouncer.Metadata
    public UUID onRequestInitiated() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Set<UUID> requestsInFlight = this.requestsInFlight;
        Intrinsics.checkNotNullExpressionValue(requestsInFlight, "requestsInFlight");
        requestsInFlight.add(uuidRandomUUID);
        return uuidRandomUUID;
    }

    @Override // com.robinhood.android.moria.network.bouncer.Metadata
    public void onRequestSucceeded(UUID requestUuid) {
        Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        this.lastUpdatedAt = Long.valueOf(this.clock.millis());
        Set<UUID> requestsInFlight = this.requestsInFlight;
        Intrinsics.checkNotNullExpressionValue(requestsInFlight, "requestsInFlight");
        requestsInFlight.remove(requestUuid);
        this.lastTerminalSyncState = SyncState.Success.INSTANCE;
        bumpInCache();
    }

    @Override // com.robinhood.android.moria.network.bouncer.Metadata
    public void onRequestFailed(UUID requestUuid, Throwable throwable) {
        Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Set<UUID> requestsInFlight = this.requestsInFlight;
        Intrinsics.checkNotNullExpressionValue(requestsInFlight, "requestsInFlight");
        requestsInFlight.remove(requestUuid);
        this.lastTerminalSyncState = new SyncState.Error(throwable);
        bumpInCache();
    }

    @Override // com.robinhood.android.moria.network.bouncer.Metadata
    public void onRequestDisposed(UUID requestUuid) {
        Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        Set<UUID> requestsInFlight = this.requestsInFlight;
        Intrinsics.checkNotNullExpressionValue(requestsInFlight, "requestsInFlight");
        requestsInFlight.remove(requestUuid);
        bumpInCache();
    }

    private final void bumpInCache() {
        this.metadataMap.getMetadata(this.params);
    }
}
