package com.robinhood.android.moria.network.bouncer;

import java.util.UUID;

/* compiled from: Metadata.kt */
@kotlin.Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH&J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/moria/network/bouncer/Metadata;", "", "isInFlight", "", "()Z", "lastUpdatedAt", "", "getLastUpdatedAt", "()Ljava/lang/Long;", "state", "Lcom/robinhood/android/moria/network/bouncer/SyncState;", "getState", "()Lcom/robinhood/android/moria/network/bouncer/SyncState;", "onRequestInitiated", "Ljava/util/UUID;", "onRequestSucceeded", "", "requestUuid", "onRequestFailed", "throwable", "", "onRequestDisposed", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface Metadata {
    Long getLastUpdatedAt();

    SyncState getState();

    boolean isInFlight();

    void onRequestDisposed(UUID requestUuid);

    void onRequestFailed(UUID requestUuid, Throwable throwable);

    UUID onRequestInitiated();

    void onRequestSucceeded(UUID requestUuid);
}
