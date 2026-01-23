package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.common.portfolio.position.SwipeAnimationPreview;
import com.robinhood.android.common.portfolio.unified.DisplayType;
import com.robinhood.utils.resource.StringResource;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CuratedListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState;", "", "Loading", "Loaded", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState$Loaded;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState$Loading;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CuratedListViewState {

    /* compiled from: CuratedListViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState$Loading;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements CuratedListViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 763296017;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: CuratedListViewState.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jo\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015¨\u0006/"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState$Loaded;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState;", "implicitlyOrderedItemsInList", "", "curatedList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;", "curatedListViewModes", "", "Ljava/util/UUID;", "Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "isSwipeToBuyEnabled", "swipeAnimationPreview", "Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "swipeTooltip", "Lcom/robinhood/utils/resource/StringResource;", "isInEtfSupportedRegion", "subzeroEnabled", "<init>", "(ZLkotlinx/collections/immutable/ImmutableList;Ljava/util/Map;ZLcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;Lcom/robinhood/utils/resource/StringResource;ZZ)V", "getImplicitlyOrderedItemsInList", "()Z", "getCuratedList", "()Lkotlinx/collections/immutable/ImmutableList;", "getCuratedListViewModes", "()Ljava/util/Map;", "getSwipeAnimationPreview", "()Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "getSwipeTooltip", "()Lcom/robinhood/utils/resource/StringResource;", "getSubzeroEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements CuratedListViewState {
        public static final int $stable = 8;
        private final ImmutableList<CuratedListDuxo7> curatedList;
        private final Map<UUID, DisplayType> curatedListViewModes;
        private final boolean implicitlyOrderedItemsInList;
        private final boolean isInEtfSupportedRegion;
        private final boolean isSwipeToBuyEnabled;
        private final boolean subzeroEnabled;
        private final SwipeAnimationPreview swipeAnimationPreview;
        private final StringResource swipeTooltip;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, ImmutableList immutableList, Map map, boolean z2, SwipeAnimationPreview swipeAnimationPreview, StringResource stringResource, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loaded.implicitlyOrderedItemsInList;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.curatedList;
            }
            if ((i & 4) != 0) {
                map = loaded.curatedListViewModes;
            }
            if ((i & 8) != 0) {
                z2 = loaded.isSwipeToBuyEnabled;
            }
            if ((i & 16) != 0) {
                swipeAnimationPreview = loaded.swipeAnimationPreview;
            }
            if ((i & 32) != 0) {
                stringResource = loaded.swipeTooltip;
            }
            if ((i & 64) != 0) {
                z3 = loaded.isInEtfSupportedRegion;
            }
            if ((i & 128) != 0) {
                z4 = loaded.subzeroEnabled;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            SwipeAnimationPreview swipeAnimationPreview2 = swipeAnimationPreview;
            StringResource stringResource2 = stringResource;
            return loaded.copy(z, immutableList, map, z2, swipeAnimationPreview2, stringResource2, z5, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getImplicitlyOrderedItemsInList() {
            return this.implicitlyOrderedItemsInList;
        }

        public final ImmutableList<CuratedListDuxo7> component2() {
            return this.curatedList;
        }

        public final Map<UUID, DisplayType> component3() {
            return this.curatedListViewModes;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSwipeToBuyEnabled() {
            return this.isSwipeToBuyEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final SwipeAnimationPreview getSwipeAnimationPreview() {
            return this.swipeAnimationPreview;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getSwipeTooltip() {
            return this.swipeTooltip;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsInEtfSupportedRegion() {
            return this.isInEtfSupportedRegion;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getSubzeroEnabled() {
            return this.subzeroEnabled;
        }

        public final Loaded copy(boolean implicitlyOrderedItemsInList, ImmutableList<? extends CuratedListDuxo7> curatedList, Map<UUID, ? extends DisplayType> curatedListViewModes, boolean isSwipeToBuyEnabled, SwipeAnimationPreview swipeAnimationPreview, StringResource swipeTooltip, boolean isInEtfSupportedRegion, boolean subzeroEnabled) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            Intrinsics.checkNotNullParameter(curatedListViewModes, "curatedListViewModes");
            return new Loaded(implicitlyOrderedItemsInList, curatedList, curatedListViewModes, isSwipeToBuyEnabled, swipeAnimationPreview, swipeTooltip, isInEtfSupportedRegion, subzeroEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.implicitlyOrderedItemsInList == loaded.implicitlyOrderedItemsInList && Intrinsics.areEqual(this.curatedList, loaded.curatedList) && Intrinsics.areEqual(this.curatedListViewModes, loaded.curatedListViewModes) && this.isSwipeToBuyEnabled == loaded.isSwipeToBuyEnabled && Intrinsics.areEqual(this.swipeAnimationPreview, loaded.swipeAnimationPreview) && Intrinsics.areEqual(this.swipeTooltip, loaded.swipeTooltip) && this.isInEtfSupportedRegion == loaded.isInEtfSupportedRegion && this.subzeroEnabled == loaded.subzeroEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((((Boolean.hashCode(this.implicitlyOrderedItemsInList) * 31) + this.curatedList.hashCode()) * 31) + this.curatedListViewModes.hashCode()) * 31) + Boolean.hashCode(this.isSwipeToBuyEnabled)) * 31;
            SwipeAnimationPreview swipeAnimationPreview = this.swipeAnimationPreview;
            int iHashCode2 = (iHashCode + (swipeAnimationPreview == null ? 0 : swipeAnimationPreview.hashCode())) * 31;
            StringResource stringResource = this.swipeTooltip;
            return ((((iHashCode2 + (stringResource != null ? stringResource.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInEtfSupportedRegion)) * 31) + Boolean.hashCode(this.subzeroEnabled);
        }

        public String toString() {
            return "Loaded(implicitlyOrderedItemsInList=" + this.implicitlyOrderedItemsInList + ", curatedList=" + this.curatedList + ", curatedListViewModes=" + this.curatedListViewModes + ", isSwipeToBuyEnabled=" + this.isSwipeToBuyEnabled + ", swipeAnimationPreview=" + this.swipeAnimationPreview + ", swipeTooltip=" + this.swipeTooltip + ", isInEtfSupportedRegion=" + this.isInEtfSupportedRegion + ", subzeroEnabled=" + this.subzeroEnabled + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(boolean z, ImmutableList<? extends CuratedListDuxo7> curatedList, Map<UUID, ? extends DisplayType> curatedListViewModes, boolean z2, SwipeAnimationPreview swipeAnimationPreview, StringResource stringResource, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            Intrinsics.checkNotNullParameter(curatedListViewModes, "curatedListViewModes");
            this.implicitlyOrderedItemsInList = z;
            this.curatedList = curatedList;
            this.curatedListViewModes = curatedListViewModes;
            this.isSwipeToBuyEnabled = z2;
            this.swipeAnimationPreview = swipeAnimationPreview;
            this.swipeTooltip = stringResource;
            this.isInEtfSupportedRegion = z3;
            this.subzeroEnabled = z4;
        }

        public /* synthetic */ Loaded(boolean z, ImmutableList immutableList, Map map, boolean z2, SwipeAnimationPreview swipeAnimationPreview, StringResource stringResource, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, immutableList, map, z2, (i & 16) != 0 ? null : swipeAnimationPreview, (i & 32) != 0 ? null : stringResource, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4);
        }

        public final boolean getImplicitlyOrderedItemsInList() {
            return this.implicitlyOrderedItemsInList;
        }

        public final ImmutableList<CuratedListDuxo7> getCuratedList() {
            return this.curatedList;
        }

        public final Map<UUID, DisplayType> getCuratedListViewModes() {
            return this.curatedListViewModes;
        }

        public final boolean isSwipeToBuyEnabled() {
            return this.isSwipeToBuyEnabled;
        }

        public final SwipeAnimationPreview getSwipeAnimationPreview() {
            return this.swipeAnimationPreview;
        }

        public final StringResource getSwipeTooltip() {
            return this.swipeTooltip;
        }

        public final boolean isInEtfSupportedRegion() {
            return this.isInEtfSupportedRegion;
        }

        public final boolean getSubzeroEnabled() {
            return this.subzeroEnabled;
        }
    }
}
