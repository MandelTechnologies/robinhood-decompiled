package com.robinhood.android.common.detail.component.history;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DetailPageHistoryViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/history/DetailPageHistoryViewState;", "", "title", "", "historyItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/detail/component/history/HistoryItemWithDuxoKeyPrefix;", "showAllFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "showThisSection", "", "showAllButton", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/navigation/keys/FragmentKey;ZZ)V", "getTitle", "()Ljava/lang/String;", "getHistoryItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getShowAllFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getShowThisSection", "()Z", "getShowAllButton", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DetailPageHistoryViewState {
    public static final int $stable = 8;
    private final ImmutableList<HistoryItemWithDuxoKeyPrefix> historyItems;
    private final boolean showAllButton;
    private final FragmentKey showAllFragmentKey;
    private final boolean showThisSection;
    private final String title;

    public static /* synthetic */ DetailPageHistoryViewState copy$default(DetailPageHistoryViewState detailPageHistoryViewState, String str, ImmutableList immutableList, FragmentKey fragmentKey, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailPageHistoryViewState.title;
        }
        if ((i & 2) != 0) {
            immutableList = detailPageHistoryViewState.historyItems;
        }
        if ((i & 4) != 0) {
            fragmentKey = detailPageHistoryViewState.showAllFragmentKey;
        }
        if ((i & 8) != 0) {
            z = detailPageHistoryViewState.showThisSection;
        }
        if ((i & 16) != 0) {
            z2 = detailPageHistoryViewState.showAllButton;
        }
        boolean z3 = z2;
        FragmentKey fragmentKey2 = fragmentKey;
        return detailPageHistoryViewState.copy(str, immutableList, fragmentKey2, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList<HistoryItemWithDuxoKeyPrefix> component2() {
        return this.historyItems;
    }

    /* renamed from: component3, reason: from getter */
    public final FragmentKey getShowAllFragmentKey() {
        return this.showAllFragmentKey;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowThisSection() {
        return this.showThisSection;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowAllButton() {
        return this.showAllButton;
    }

    public final DetailPageHistoryViewState copy(String title, ImmutableList<HistoryItemWithDuxoKeyPrefix> historyItems, FragmentKey showAllFragmentKey, boolean showThisSection, boolean showAllButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        return new DetailPageHistoryViewState(title, historyItems, showAllFragmentKey, showThisSection, showAllButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailPageHistoryViewState)) {
            return false;
        }
        DetailPageHistoryViewState detailPageHistoryViewState = (DetailPageHistoryViewState) other;
        return Intrinsics.areEqual(this.title, detailPageHistoryViewState.title) && Intrinsics.areEqual(this.historyItems, detailPageHistoryViewState.historyItems) && Intrinsics.areEqual(this.showAllFragmentKey, detailPageHistoryViewState.showAllFragmentKey) && this.showThisSection == detailPageHistoryViewState.showThisSection && this.showAllButton == detailPageHistoryViewState.showAllButton;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.historyItems.hashCode()) * 31;
        FragmentKey fragmentKey = this.showAllFragmentKey;
        return ((((iHashCode + (fragmentKey == null ? 0 : fragmentKey.hashCode())) * 31) + Boolean.hashCode(this.showThisSection)) * 31) + Boolean.hashCode(this.showAllButton);
    }

    public String toString() {
        return "DetailPageHistoryViewState(title=" + this.title + ", historyItems=" + this.historyItems + ", showAllFragmentKey=" + this.showAllFragmentKey + ", showThisSection=" + this.showThisSection + ", showAllButton=" + this.showAllButton + ")";
    }

    public DetailPageHistoryViewState(String title, ImmutableList<HistoryItemWithDuxoKeyPrefix> historyItems, FragmentKey fragmentKey, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        this.title = title;
        this.historyItems = historyItems;
        this.showAllFragmentKey = fragmentKey;
        this.showThisSection = z;
        this.showAllButton = z2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList<HistoryItemWithDuxoKeyPrefix> getHistoryItems() {
        return this.historyItems;
    }

    public final FragmentKey getShowAllFragmentKey() {
        return this.showAllFragmentKey;
    }

    public final boolean getShowThisSection() {
        return this.showThisSection;
    }

    public final boolean getShowAllButton() {
        return this.showAllButton;
    }
}
