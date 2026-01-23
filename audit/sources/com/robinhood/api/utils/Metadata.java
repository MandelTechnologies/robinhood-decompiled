package com.robinhood.api.utils;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: Metadata.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/api/utils/Metadata;", "", "j$/time/Instant", "lastUpdatedAt", "", "isInFlight", "Lcom/robinhood/api/utils/SyncState;", "syncState", "<init>", "(Lj$/time/Instant;ZLcom/robinhood/api/utils/SyncState;)V", "Lj$/time/Instant;", "getLastUpdatedAt", "()Lj$/time/Instant;", "setLastUpdatedAt", "(Lj$/time/Instant;)V", "Z", "()Z", "setInFlight", "(Z)V", "Lcom/robinhood/api/utils/SyncState;", "getSyncState", "()Lcom/robinhood/api/utils/SyncState;", "setSyncState", "(Lcom/robinhood/api/utils/SyncState;)V", "", "lastSeenException", "Ljava/lang/Throwable;", "getLastSeenException", "()Ljava/lang/Throwable;", "setLastSeenException", "(Ljava/lang/Throwable;)V", "getShouldShowProgressIndicator", "shouldShowProgressIndicator", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class Metadata {
    private boolean isInFlight;
    private Throwable lastSeenException;
    private Instant lastUpdatedAt;
    private SyncState syncState;

    /* compiled from: Metadata.kt */
    @kotlin.Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SyncState.values().length];
            try {
                iArr[SyncState.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SyncState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SyncState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Metadata() {
        this(null, false, null, 7, null);
    }

    public Metadata(Instant instant, boolean z, SyncState syncState) {
        Intrinsics.checkNotNullParameter(syncState, "syncState");
        this.lastUpdatedAt = instant;
        this.isInFlight = z;
        this.syncState = syncState;
    }

    public final Instant getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public final void setLastUpdatedAt(Instant instant) {
        this.lastUpdatedAt = instant;
    }

    /* renamed from: isInFlight, reason: from getter */
    public final boolean getIsInFlight() {
        return this.isInFlight;
    }

    public final void setInFlight(boolean z) {
        this.isInFlight = z;
    }

    public /* synthetic */ Metadata(Instant instant, boolean z, SyncState syncState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? false : z, (i & 4) != 0 ? SyncState.SUCCESS : syncState);
    }

    public final SyncState getSyncState() {
        return this.syncState;
    }

    public final void setSyncState(SyncState syncState) {
        Intrinsics.checkNotNullParameter(syncState, "<set-?>");
        this.syncState = syncState;
    }

    public final Throwable getLastSeenException() {
        return this.lastSeenException;
    }

    public final void setLastSeenException(Throwable th) {
        this.lastSeenException = th;
    }

    public final boolean getShouldShowProgressIndicator() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.syncState.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
