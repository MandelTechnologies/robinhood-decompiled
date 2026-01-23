package com.robinhood.android.eventcontracts.hub.p134v2.home;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: HubDefaultCategoryContentViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentViewState;", "", "layoutComponents", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubLayoutComponent;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getLayoutComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HubDefaultCategoryContentViewState {
    public static final int $stable = 0;
    private final ImmutableList<HubDefaultCategoryContentViewState3> layoutComponents;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HubDefaultCategoryContentViewState copy$default(HubDefaultCategoryContentViewState hubDefaultCategoryContentViewState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = hubDefaultCategoryContentViewState.layoutComponents;
        }
        return hubDefaultCategoryContentViewState.copy(immutableList);
    }

    public final ImmutableList<HubDefaultCategoryContentViewState3> component1() {
        return this.layoutComponents;
    }

    public final HubDefaultCategoryContentViewState copy(ImmutableList<? extends HubDefaultCategoryContentViewState3> layoutComponents) {
        return new HubDefaultCategoryContentViewState(layoutComponents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HubDefaultCategoryContentViewState) && Intrinsics.areEqual(this.layoutComponents, ((HubDefaultCategoryContentViewState) other).layoutComponents);
    }

    public int hashCode() {
        ImmutableList<HubDefaultCategoryContentViewState3> immutableList = this.layoutComponents;
        if (immutableList == null) {
            return 0;
        }
        return immutableList.hashCode();
    }

    public String toString() {
        return "HubDefaultCategoryContentViewState(layoutComponents=" + this.layoutComponents + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HubDefaultCategoryContentViewState(ImmutableList<? extends HubDefaultCategoryContentViewState3> immutableList) {
        this.layoutComponents = immutableList;
    }

    public final ImmutableList<HubDefaultCategoryContentViewState3> getLayoutComponents() {
        return this.layoutComponents;
    }
}
