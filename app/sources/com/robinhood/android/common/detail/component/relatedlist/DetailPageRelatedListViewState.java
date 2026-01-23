package com.robinhood.android.common.detail.component.relatedlist;

import com.robinhood.android.common.p088ui.CuratedListChipItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DetailPageRelatedListViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/relatedlist/DetailPageRelatedListViewState;", "", "showThisSection", "", "relatedIndustryLists", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "<init>", "(ZLkotlinx/collections/immutable/ImmutableList;)V", "getShowThisSection", "()Z", "getRelatedIndustryLists", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DetailPageRelatedListViewState {
    public static final int $stable = 8;
    private final ImmutableList<CuratedListChipItem> relatedIndustryLists;
    private final boolean showThisSection;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailPageRelatedListViewState copy$default(DetailPageRelatedListViewState detailPageRelatedListViewState, boolean z, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = detailPageRelatedListViewState.showThisSection;
        }
        if ((i & 2) != 0) {
            immutableList = detailPageRelatedListViewState.relatedIndustryLists;
        }
        return detailPageRelatedListViewState.copy(z, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowThisSection() {
        return this.showThisSection;
    }

    public final ImmutableList<CuratedListChipItem> component2() {
        return this.relatedIndustryLists;
    }

    public final DetailPageRelatedListViewState copy(boolean showThisSection, ImmutableList<CuratedListChipItem> relatedIndustryLists) {
        return new DetailPageRelatedListViewState(showThisSection, relatedIndustryLists);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailPageRelatedListViewState)) {
            return false;
        }
        DetailPageRelatedListViewState detailPageRelatedListViewState = (DetailPageRelatedListViewState) other;
        return this.showThisSection == detailPageRelatedListViewState.showThisSection && Intrinsics.areEqual(this.relatedIndustryLists, detailPageRelatedListViewState.relatedIndustryLists);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showThisSection) * 31;
        ImmutableList<CuratedListChipItem> immutableList = this.relatedIndustryLists;
        return iHashCode + (immutableList == null ? 0 : immutableList.hashCode());
    }

    public String toString() {
        return "DetailPageRelatedListViewState(showThisSection=" + this.showThisSection + ", relatedIndustryLists=" + this.relatedIndustryLists + ")";
    }

    public DetailPageRelatedListViewState(boolean z, ImmutableList<CuratedListChipItem> immutableList) {
        this.showThisSection = z;
        this.relatedIndustryLists = immutableList;
    }

    public final boolean getShowThisSection() {
        return this.showThisSection;
    }

    public final ImmutableList<CuratedListChipItem> getRelatedIndustryLists() {
        return this.relatedIndustryLists;
    }
}
