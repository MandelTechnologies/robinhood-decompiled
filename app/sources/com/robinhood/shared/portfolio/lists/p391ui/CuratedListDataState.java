package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.common.portfolio.position.SwipeAnimationPreview;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p320db.bonfire.ListRecord;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: CuratedListDataState.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\n\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u001d\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\nHÆ\u0003J\u001d\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\nHÆ\u0003J\u0015\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\nHÆ\u0003J\u0017\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nHÆ\u0003J\u0017\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\nHÆ\u0003J\t\u0010?\u001a\u00020\u000fHÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010D\u001a\u00020\u001dHÆ\u0003J\t\u0010E\u001a\u00020\u000fHÆ\u0003J\t\u0010F\u001a\u00020\u000fHÆ\u0003J\u0097\u0002\u0010G\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\n2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u000fHÆ\u0001J\u0013\u0010H\u001a\u00020\u000f2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R%\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R%\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0015\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u001e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010-R\u0011\u0010\u001f\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-¨\u0006M"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;", "", "screeners", "", "Lcom/robinhood/equityscreener/models/db/Screener;", "followedCuratedLists", "Lcom/robinhood/models/db/CuratedList;", "listOrder", "Lcom/robinhood/models/db/bonfire/ListRecord;", "curatedListItems", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/CuratedListItem;", "activeOptionWatchlistItems", "expandedCuratedListIds", "", "curatedListViewModes", "Lcom/robinhood/models/db/CuratedListViewMode;", "positions", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "shouldShowListRows", "isSwipeToBuyEnabled", "accountNumber", "", "swipeAnimationPreview", "Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "swipeTooltip", "Lcom/robinhood/utils/resource/StringResource;", "source", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListSource;", "isInEtfSupportedRegion", "subzeroEnabled", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZZLjava/lang/String;Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/portfolio/lists/ui/CuratedListSource;ZZ)V", "getScreeners", "()Ljava/util/List;", "getFollowedCuratedLists", "getListOrder", "getCuratedListItems", "()Ljava/util/Map;", "getActiveOptionWatchlistItems", "getExpandedCuratedListIds", "getCuratedListViewModes", "getPositions", "getShouldShowListRows", "()Z", "getAccountNumber", "()Ljava/lang/String;", "getSwipeAnimationPreview", "()Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "getSwipeTooltip", "()Lcom/robinhood/utils/resource/StringResource;", "getSource", "()Lcom/robinhood/shared/portfolio/lists/ui/CuratedListSource;", "getSubzeroEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "", "toString", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CuratedListDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final Map<UUID, List<CuratedListItem>> activeOptionWatchlistItems;
    private final Map<UUID, List<CuratedListItem>> curatedListItems;
    private final Map<UUID, CuratedListViewMode> curatedListViewModes;
    private final Map<UUID, Boolean> expandedCuratedListIds;
    private final List<CuratedList> followedCuratedLists;
    private final boolean isInEtfSupportedRegion;
    private final boolean isSwipeToBuyEnabled;
    private final List<ListRecord> listOrder;
    private final Map<UUID, PositionsV2.PositionListItemV2> positions;
    private final List<Screener> screeners;
    private final boolean shouldShowListRows;
    private final CuratedListSource source;
    private final boolean subzeroEnabled;
    private final SwipeAnimationPreview swipeAnimationPreview;
    private final StringResource swipeTooltip;

    public CuratedListDataState() {
        this(null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    public final List<Screener> component1() {
        return this.screeners;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSwipeToBuyEnabled() {
        return this.isSwipeToBuyEnabled;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component12, reason: from getter */
    public final SwipeAnimationPreview getSwipeAnimationPreview() {
        return this.swipeAnimationPreview;
    }

    /* renamed from: component13, reason: from getter */
    public final StringResource getSwipeTooltip() {
        return this.swipeTooltip;
    }

    /* renamed from: component14, reason: from getter */
    public final CuratedListSource getSource() {
        return this.source;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsInEtfSupportedRegion() {
        return this.isInEtfSupportedRegion;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }

    public final List<CuratedList> component2() {
        return this.followedCuratedLists;
    }

    public final List<ListRecord> component3() {
        return this.listOrder;
    }

    public final Map<UUID, List<CuratedListItem>> component4() {
        return this.curatedListItems;
    }

    public final Map<UUID, List<CuratedListItem>> component5() {
        return this.activeOptionWatchlistItems;
    }

    public final Map<UUID, Boolean> component6() {
        return this.expandedCuratedListIds;
    }

    public final Map<UUID, CuratedListViewMode> component7() {
        return this.curatedListViewModes;
    }

    public final Map<UUID, PositionsV2.PositionListItemV2> component8() {
        return this.positions;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShouldShowListRows() {
        return this.shouldShowListRows;
    }

    public final CuratedListDataState copy(List<Screener> screeners, List<CuratedList> followedCuratedLists, List<ListRecord> listOrder, Map<UUID, ? extends List<CuratedListItem>> curatedListItems, Map<UUID, ? extends List<CuratedListItem>> activeOptionWatchlistItems, Map<UUID, Boolean> expandedCuratedListIds, Map<UUID, ? extends CuratedListViewMode> curatedListViewModes, Map<UUID, PositionsV2.PositionListItemV2> positions, boolean shouldShowListRows, boolean isSwipeToBuyEnabled, String accountNumber, SwipeAnimationPreview swipeAnimationPreview, StringResource swipeTooltip, CuratedListSource source, boolean isInEtfSupportedRegion, boolean subzeroEnabled) {
        Intrinsics.checkNotNullParameter(expandedCuratedListIds, "expandedCuratedListIds");
        Intrinsics.checkNotNullParameter(source, "source");
        return new CuratedListDataState(screeners, followedCuratedLists, listOrder, curatedListItems, activeOptionWatchlistItems, expandedCuratedListIds, curatedListViewModes, positions, shouldShowListRows, isSwipeToBuyEnabled, accountNumber, swipeAnimationPreview, swipeTooltip, source, isInEtfSupportedRegion, subzeroEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CuratedListDataState)) {
            return false;
        }
        CuratedListDataState curatedListDataState = (CuratedListDataState) other;
        return Intrinsics.areEqual(this.screeners, curatedListDataState.screeners) && Intrinsics.areEqual(this.followedCuratedLists, curatedListDataState.followedCuratedLists) && Intrinsics.areEqual(this.listOrder, curatedListDataState.listOrder) && Intrinsics.areEqual(this.curatedListItems, curatedListDataState.curatedListItems) && Intrinsics.areEqual(this.activeOptionWatchlistItems, curatedListDataState.activeOptionWatchlistItems) && Intrinsics.areEqual(this.expandedCuratedListIds, curatedListDataState.expandedCuratedListIds) && Intrinsics.areEqual(this.curatedListViewModes, curatedListDataState.curatedListViewModes) && Intrinsics.areEqual(this.positions, curatedListDataState.positions) && this.shouldShowListRows == curatedListDataState.shouldShowListRows && this.isSwipeToBuyEnabled == curatedListDataState.isSwipeToBuyEnabled && Intrinsics.areEqual(this.accountNumber, curatedListDataState.accountNumber) && Intrinsics.areEqual(this.swipeAnimationPreview, curatedListDataState.swipeAnimationPreview) && Intrinsics.areEqual(this.swipeTooltip, curatedListDataState.swipeTooltip) && this.source == curatedListDataState.source && this.isInEtfSupportedRegion == curatedListDataState.isInEtfSupportedRegion && this.subzeroEnabled == curatedListDataState.subzeroEnabled;
    }

    public int hashCode() {
        List<Screener> list = this.screeners;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CuratedList> list2 = this.followedCuratedLists;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ListRecord> list3 = this.listOrder;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<UUID, List<CuratedListItem>> map = this.curatedListItems;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<UUID, List<CuratedListItem>> map2 = this.activeOptionWatchlistItems;
        int iHashCode5 = (((iHashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31) + this.expandedCuratedListIds.hashCode()) * 31;
        Map<UUID, CuratedListViewMode> map3 = this.curatedListViewModes;
        int iHashCode6 = (iHashCode5 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<UUID, PositionsV2.PositionListItemV2> map4 = this.positions;
        int iHashCode7 = (((((iHashCode6 + (map4 == null ? 0 : map4.hashCode())) * 31) + Boolean.hashCode(this.shouldShowListRows)) * 31) + Boolean.hashCode(this.isSwipeToBuyEnabled)) * 31;
        String str = this.accountNumber;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        SwipeAnimationPreview swipeAnimationPreview = this.swipeAnimationPreview;
        int iHashCode9 = (iHashCode8 + (swipeAnimationPreview == null ? 0 : swipeAnimationPreview.hashCode())) * 31;
        StringResource stringResource = this.swipeTooltip;
        return ((((((iHashCode9 + (stringResource != null ? stringResource.hashCode() : 0)) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.isInEtfSupportedRegion)) * 31) + Boolean.hashCode(this.subzeroEnabled);
    }

    public String toString() {
        return "CuratedListDataState(screeners=" + this.screeners + ", followedCuratedLists=" + this.followedCuratedLists + ", listOrder=" + this.listOrder + ", curatedListItems=" + this.curatedListItems + ", activeOptionWatchlistItems=" + this.activeOptionWatchlistItems + ", expandedCuratedListIds=" + this.expandedCuratedListIds + ", curatedListViewModes=" + this.curatedListViewModes + ", positions=" + this.positions + ", shouldShowListRows=" + this.shouldShowListRows + ", isSwipeToBuyEnabled=" + this.isSwipeToBuyEnabled + ", accountNumber=" + this.accountNumber + ", swipeAnimationPreview=" + this.swipeAnimationPreview + ", swipeTooltip=" + this.swipeTooltip + ", source=" + this.source + ", isInEtfSupportedRegion=" + this.isInEtfSupportedRegion + ", subzeroEnabled=" + this.subzeroEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CuratedListDataState(List<Screener> list, List<CuratedList> list2, List<ListRecord> list3, Map<UUID, ? extends List<CuratedListItem>> map, Map<UUID, ? extends List<CuratedListItem>> map2, Map<UUID, Boolean> expandedCuratedListIds, Map<UUID, ? extends CuratedListViewMode> map3, Map<UUID, PositionsV2.PositionListItemV2> map4, boolean z, boolean z2, String str, SwipeAnimationPreview swipeAnimationPreview, StringResource stringResource, CuratedListSource source, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(expandedCuratedListIds, "expandedCuratedListIds");
        Intrinsics.checkNotNullParameter(source, "source");
        this.screeners = list;
        this.followedCuratedLists = list2;
        this.listOrder = list3;
        this.curatedListItems = map;
        this.activeOptionWatchlistItems = map2;
        this.expandedCuratedListIds = expandedCuratedListIds;
        this.curatedListViewModes = map3;
        this.positions = map4;
        this.shouldShowListRows = z;
        this.isSwipeToBuyEnabled = z2;
        this.accountNumber = str;
        this.swipeAnimationPreview = swipeAnimationPreview;
        this.swipeTooltip = stringResource;
        this.source = source;
        this.isInEtfSupportedRegion = z3;
        this.subzeroEnabled = z4;
    }

    public final List<Screener> getScreeners() {
        return this.screeners;
    }

    public final List<CuratedList> getFollowedCuratedLists() {
        return this.followedCuratedLists;
    }

    public final List<ListRecord> getListOrder() {
        return this.listOrder;
    }

    public final Map<UUID, List<CuratedListItem>> getCuratedListItems() {
        return this.curatedListItems;
    }

    public final Map<UUID, List<CuratedListItem>> getActiveOptionWatchlistItems() {
        return this.activeOptionWatchlistItems;
    }

    public /* synthetic */ CuratedListDataState(List list, List list2, List list3, Map map, Map map2, Map map3, Map map4, Map map5, boolean z, boolean z2, String str, SwipeAnimationPreview swipeAnimationPreview, StringResource stringResource, CuratedListSource curatedListSource, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : map2, (i & 32) != 0 ? MapsKt.emptyMap() : map3, (i & 64) != 0 ? null : map4, (i & 128) != 0 ? null : map5, (i & 256) != 0 ? true : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? null : swipeAnimationPreview, (i & 4096) == 0 ? stringResource : null, (i & 8192) != 0 ? CuratedListSource.UNSPECIFIED : curatedListSource, (i & 16384) != 0 ? false : z3, (i & 32768) != 0 ? false : z4);
    }

    public final Map<UUID, Boolean> getExpandedCuratedListIds() {
        return this.expandedCuratedListIds;
    }

    public final Map<UUID, CuratedListViewMode> getCuratedListViewModes() {
        return this.curatedListViewModes;
    }

    public final Map<UUID, PositionsV2.PositionListItemV2> getPositions() {
        return this.positions;
    }

    public final boolean getShouldShowListRows() {
        return this.shouldShowListRows;
    }

    public final boolean isSwipeToBuyEnabled() {
        return this.isSwipeToBuyEnabled;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final SwipeAnimationPreview getSwipeAnimationPreview() {
        return this.swipeAnimationPreview;
    }

    public final StringResource getSwipeTooltip() {
        return this.swipeTooltip;
    }

    public final CuratedListSource getSource() {
        return this.source;
    }

    public final boolean isInEtfSupportedRegion() {
        return this.isInEtfSupportedRegion;
    }

    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }
}
