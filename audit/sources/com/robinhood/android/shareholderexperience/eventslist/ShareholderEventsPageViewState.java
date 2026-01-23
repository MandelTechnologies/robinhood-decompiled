package com.robinhood.android.shareholderexperience.eventslist;

import com.robinhood.shareholderx.models.p401db.ShareholderEventsPage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareholderEventsPageViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageViewState;", "", "eventsPage", "Lcom/robinhood/shareholderx/models/db/ShareholderEventsPage;", "isNewRequestCalled", "", "<init>", "(Lcom/robinhood/shareholderx/models/db/ShareholderEventsPage;Z)V", "getEventsPage", "()Lcom/robinhood/shareholderx/models/db/ShareholderEventsPage;", "()Z", "isLoading", "eventsSection", "Lcom/robinhood/shareholderx/models/db/ShareholderEventsPage$EventSection;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShareholderEventsPageViewState {
    public static final int $stable = 8;
    private final ShareholderEventsPage eventsPage;
    private final boolean isNewRequestCalled;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareholderEventsPageViewState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShareholderEventsPageViewState copy$default(ShareholderEventsPageViewState shareholderEventsPageViewState, ShareholderEventsPage shareholderEventsPage, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            shareholderEventsPage = shareholderEventsPageViewState.eventsPage;
        }
        if ((i & 2) != 0) {
            z = shareholderEventsPageViewState.isNewRequestCalled;
        }
        return shareholderEventsPageViewState.copy(shareholderEventsPage, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ShareholderEventsPage getEventsPage() {
        return this.eventsPage;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsNewRequestCalled() {
        return this.isNewRequestCalled;
    }

    public final ShareholderEventsPageViewState copy(ShareholderEventsPage eventsPage, boolean isNewRequestCalled) {
        return new ShareholderEventsPageViewState(eventsPage, isNewRequestCalled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareholderEventsPageViewState)) {
            return false;
        }
        ShareholderEventsPageViewState shareholderEventsPageViewState = (ShareholderEventsPageViewState) other;
        return Intrinsics.areEqual(this.eventsPage, shareholderEventsPageViewState.eventsPage) && this.isNewRequestCalled == shareholderEventsPageViewState.isNewRequestCalled;
    }

    public int hashCode() {
        ShareholderEventsPage shareholderEventsPage = this.eventsPage;
        return ((shareholderEventsPage == null ? 0 : shareholderEventsPage.hashCode()) * 31) + Boolean.hashCode(this.isNewRequestCalled);
    }

    public String toString() {
        return "ShareholderEventsPageViewState(eventsPage=" + this.eventsPage + ", isNewRequestCalled=" + this.isNewRequestCalled + ")";
    }

    public ShareholderEventsPageViewState(ShareholderEventsPage shareholderEventsPage, boolean z) {
        this.eventsPage = shareholderEventsPage;
        this.isNewRequestCalled = z;
    }

    public /* synthetic */ ShareholderEventsPageViewState(ShareholderEventsPage shareholderEventsPage, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : shareholderEventsPage, (i & 2) != 0 ? true : z);
    }

    public final ShareholderEventsPage getEventsPage() {
        return this.eventsPage;
    }

    public final boolean isNewRequestCalled() {
        return this.isNewRequestCalled;
    }

    public final boolean isLoading(ShareholderEventsPage.EventSection eventsSection) {
        Intrinsics.checkNotNullParameter(eventsSection, "eventsSection");
        return eventsSection.getFilters() != null && this.isNewRequestCalled;
    }
}
