package com.robinhood.viewmode;

import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.viewmode.ViewModeSelectionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ViewModeSelectionViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionViewState;", "", "selectedSecurityViewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "viewModeSelectionType", "Lcom/robinhood/viewmode/ViewModeSelectionType;", "<init>", "(Lcom/robinhood/android/common/util/SecurityViewMode;Lcom/robinhood/viewmode/ViewModeSelectionType;)V", "getViewModeSelectionType", "()Lcom/robinhood/viewmode/ViewModeSelectionType;", "securityViewModes", "", "Lkotlin/Pair;", "", "getSecurityViewModes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class ViewModeSelectionViewState {
    private final SecurityViewMode selectedSecurityViewMode;
    private final ViewModeSelectionType viewModeSelectionType;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModeSelectionViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final SecurityViewMode getSelectedSecurityViewMode() {
        return this.selectedSecurityViewMode;
    }

    public static /* synthetic */ ViewModeSelectionViewState copy$default(ViewModeSelectionViewState viewModeSelectionViewState, SecurityViewMode securityViewMode, ViewModeSelectionType viewModeSelectionType, int i, Object obj) {
        if ((i & 1) != 0) {
            securityViewMode = viewModeSelectionViewState.selectedSecurityViewMode;
        }
        if ((i & 2) != 0) {
            viewModeSelectionType = viewModeSelectionViewState.viewModeSelectionType;
        }
        return viewModeSelectionViewState.copy(securityViewMode, viewModeSelectionType);
    }

    /* renamed from: component2, reason: from getter */
    public final ViewModeSelectionType getViewModeSelectionType() {
        return this.viewModeSelectionType;
    }

    public final ViewModeSelectionViewState copy(SecurityViewMode selectedSecurityViewMode, ViewModeSelectionType viewModeSelectionType) {
        Intrinsics.checkNotNullParameter(viewModeSelectionType, "viewModeSelectionType");
        return new ViewModeSelectionViewState(selectedSecurityViewMode, viewModeSelectionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewModeSelectionViewState)) {
            return false;
        }
        ViewModeSelectionViewState viewModeSelectionViewState = (ViewModeSelectionViewState) other;
        return this.selectedSecurityViewMode == viewModeSelectionViewState.selectedSecurityViewMode && Intrinsics.areEqual(this.viewModeSelectionType, viewModeSelectionViewState.viewModeSelectionType);
    }

    public int hashCode() {
        SecurityViewMode securityViewMode = this.selectedSecurityViewMode;
        return ((securityViewMode == null ? 0 : securityViewMode.hashCode()) * 31) + this.viewModeSelectionType.hashCode();
    }

    public String toString() {
        return "ViewModeSelectionViewState(selectedSecurityViewMode=" + this.selectedSecurityViewMode + ", viewModeSelectionType=" + this.viewModeSelectionType + ")";
    }

    public ViewModeSelectionViewState(SecurityViewMode securityViewMode, ViewModeSelectionType viewModeSelectionType) {
        Intrinsics.checkNotNullParameter(viewModeSelectionType, "viewModeSelectionType");
        this.selectedSecurityViewMode = securityViewMode;
        this.viewModeSelectionType = viewModeSelectionType;
    }

    public /* synthetic */ ViewModeSelectionViewState(SecurityViewMode securityViewMode, ViewModeSelectionType viewModeSelectionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : securityViewMode, (i & 2) != 0 ? ViewModeSelectionType.HoldingsAndCrypto.INSTANCE : viewModeSelectionType);
    }

    public final ViewModeSelectionType getViewModeSelectionType() {
        return this.viewModeSelectionType;
    }

    public final List<Tuples2<SecurityViewMode, Boolean>> getSecurityViewModes() {
        List<SecurityViewMode> defaultViewModes;
        ViewModeSelectionType viewModeSelectionType = this.viewModeSelectionType;
        if (Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.HoldingsAndCrypto.INSTANCE) || (viewModeSelectionType instanceof ViewModeSelectionType.PositionsV2)) {
            defaultViewModes = SecurityViewMode.INSTANCE.getDefaultViewModes();
        } else if (viewModeSelectionType instanceof ViewModeSelectionType.FuturesCuratedRhList) {
            defaultViewModes = ViewModeSelectionViewState2.toSecurityViewModes(CuratedListViewMode.INSTANCE.getFuturesRhListOnlyViewModes());
        } else if ((viewModeSelectionType instanceof ViewModeSelectionType.CuratedList) || Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.AllCuratedLists.INSTANCE)) {
            defaultViewModes = ViewModeSelectionViewState2.toSecurityViewModes(CuratedListViewMode.INSTANCE.getDefaultViewModes());
        } else {
            if (!Intrinsics.areEqual(viewModeSelectionType, ViewModeSelectionType.OptionsWatchlist.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            defaultViewModes = CollectionsKt.listOf((Object[]) new SecurityViewMode[]{SecurityViewMode.LAST_PRICE, SecurityViewMode.PERCENT_CHANGE, SecurityViewMode.TOTAL_DELTA, SecurityViewMode.TOTAL_PERCENT_CHANGE});
        }
        List<SecurityViewMode> list = defaultViewModes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SecurityViewMode securityViewMode : list) {
            arrayList.add(Tuples4.m3642to(securityViewMode, Boolean.valueOf(securityViewMode == this.selectedSecurityViewMode)));
        }
        return arrayList;
    }
}
