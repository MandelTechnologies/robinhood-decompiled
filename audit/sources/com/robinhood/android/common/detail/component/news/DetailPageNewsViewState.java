package com.robinhood.android.common.detail.component.news;

import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: DetailPageNewsViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/news/DetailPageNewsViewState;", "", "shouldShowSection", "", "assetId", "Ljava/util/UUID;", "assetSymbol", "", "newsFeedElements", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "<init>", "(ZLjava/util/UUID;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getShouldShowSection", "()Z", "getAssetId", "()Ljava/util/UUID;", "getAssetSymbol", "()Ljava/lang/String;", "getNewsFeedElements", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DetailPageNewsViewState {
    public static final int $stable = 8;
    private final UUID assetId;
    private final String assetSymbol;
    private final ImmutableList<NewsFeedElement> newsFeedElements;
    private final boolean shouldShowSection;

    public DetailPageNewsViewState() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailPageNewsViewState copy$default(DetailPageNewsViewState detailPageNewsViewState, boolean z, UUID uuid, String str, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = detailPageNewsViewState.shouldShowSection;
        }
        if ((i & 2) != 0) {
            uuid = detailPageNewsViewState.assetId;
        }
        if ((i & 4) != 0) {
            str = detailPageNewsViewState.assetSymbol;
        }
        if ((i & 8) != 0) {
            immutableList = detailPageNewsViewState.newsFeedElements;
        }
        return detailPageNewsViewState.copy(z, uuid, str, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShouldShowSection() {
        return this.shouldShowSection;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getAssetId() {
        return this.assetId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final ImmutableList<NewsFeedElement> component4() {
        return this.newsFeedElements;
    }

    public final DetailPageNewsViewState copy(boolean shouldShowSection, UUID assetId, String assetSymbol, ImmutableList<NewsFeedElement> newsFeedElements) {
        Intrinsics.checkNotNullParameter(newsFeedElements, "newsFeedElements");
        return new DetailPageNewsViewState(shouldShowSection, assetId, assetSymbol, newsFeedElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailPageNewsViewState)) {
            return false;
        }
        DetailPageNewsViewState detailPageNewsViewState = (DetailPageNewsViewState) other;
        return this.shouldShowSection == detailPageNewsViewState.shouldShowSection && Intrinsics.areEqual(this.assetId, detailPageNewsViewState.assetId) && Intrinsics.areEqual(this.assetSymbol, detailPageNewsViewState.assetSymbol) && Intrinsics.areEqual(this.newsFeedElements, detailPageNewsViewState.newsFeedElements);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.shouldShowSection) * 31;
        UUID uuid = this.assetId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.assetSymbol;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.newsFeedElements.hashCode();
    }

    public String toString() {
        return "DetailPageNewsViewState(shouldShowSection=" + this.shouldShowSection + ", assetId=" + this.assetId + ", assetSymbol=" + this.assetSymbol + ", newsFeedElements=" + this.newsFeedElements + ")";
    }

    public DetailPageNewsViewState(boolean z, UUID uuid, String str, ImmutableList<NewsFeedElement> newsFeedElements) {
        Intrinsics.checkNotNullParameter(newsFeedElements, "newsFeedElements");
        this.shouldShowSection = z;
        this.assetId = uuid;
        this.assetSymbol = str;
        this.newsFeedElements = newsFeedElements;
    }

    public final boolean getShouldShowSection() {
        return this.shouldShowSection;
    }

    public final UUID getAssetId() {
        return this.assetId;
    }

    public final String getAssetSymbol() {
        return this.assetSymbol;
    }

    public /* synthetic */ DetailPageNewsViewState(boolean z, UUID uuid, String str, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : str, (i & 8) != 0 ? extensions2.persistentListOf() : immutableList);
    }

    public final ImmutableList<NewsFeedElement> getNewsFeedElements() {
        return this.newsFeedElements;
    }
}
