package com.robinhood.android.equityscreener.crud.delete;

import com.robinhood.equityscreener.models.p294db.Screener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteScreenerDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDataState;", "", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "isDeleting", "", "isDeleted", "<init>", "(Lcom/robinhood/equityscreener/models/db/Screener;ZZ)V", "getScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeleteScreenerDataState {
    public static final int $stable = 8;
    private final boolean isDeleted;
    private final boolean isDeleting;
    private final Screener screener;

    public DeleteScreenerDataState() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ DeleteScreenerDataState copy$default(DeleteScreenerDataState deleteScreenerDataState, Screener screener, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            screener = deleteScreenerDataState.screener;
        }
        if ((i & 2) != 0) {
            z = deleteScreenerDataState.isDeleting;
        }
        if ((i & 4) != 0) {
            z2 = deleteScreenerDataState.isDeleted;
        }
        return deleteScreenerDataState.copy(screener, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final Screener getScreener() {
        return this.screener;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDeleting() {
        return this.isDeleting;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    public final DeleteScreenerDataState copy(Screener screener, boolean isDeleting, boolean isDeleted) {
        return new DeleteScreenerDataState(screener, isDeleting, isDeleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteScreenerDataState)) {
            return false;
        }
        DeleteScreenerDataState deleteScreenerDataState = (DeleteScreenerDataState) other;
        return Intrinsics.areEqual(this.screener, deleteScreenerDataState.screener) && this.isDeleting == deleteScreenerDataState.isDeleting && this.isDeleted == deleteScreenerDataState.isDeleted;
    }

    public int hashCode() {
        Screener screener = this.screener;
        return ((((screener == null ? 0 : screener.hashCode()) * 31) + Boolean.hashCode(this.isDeleting)) * 31) + Boolean.hashCode(this.isDeleted);
    }

    public String toString() {
        return "DeleteScreenerDataState(screener=" + this.screener + ", isDeleting=" + this.isDeleting + ", isDeleted=" + this.isDeleted + ")";
    }

    public DeleteScreenerDataState(Screener screener, boolean z, boolean z2) {
        this.screener = screener;
        this.isDeleting = z;
        this.isDeleted = z2;
    }

    public /* synthetic */ DeleteScreenerDataState(Screener screener, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : screener, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public final Screener getScreener() {
        return this.screener;
    }

    public final boolean isDeleting() {
        return this.isDeleting;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }
}
