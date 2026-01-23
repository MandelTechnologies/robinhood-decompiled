package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.common.portfolio.position.SwipeAnimationPreview;
import com.robinhood.android.common.portfolio.unified.DisplayType;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow;
import com.robinhood.utils.compose.reorderable.ReorderableListState;
import com.robinhood.utils.resource.StringResource;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CuratedListState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "", "Loading", "Loaded", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loaded;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loading;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CuratedListState {

    /* compiled from: CuratedListState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loading;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements CuratedListState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1121182518;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: CuratedListState.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B©\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\n\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u0011\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u0006\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0017\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\u0004\b#\u0010$J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u001b\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003J\u001d\u0010B\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003J\u001b\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\nHÆ\u0003J\u0015\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u0011HÆ\u0003J\u001b\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u0006HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015HÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0\u0017HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010I\u001a\u00020\u000bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\f0\u0017HÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\f0\u0017HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010 HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\f0\u0017HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\f0\u0017HÆ\u0003JÅ\u0002\u0010P\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\n2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u00112\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u0017HÆ\u0001J\u0013\u0010Q\u001a\u00020\u000b2\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020UHÖ\u0001J\t\u0010V\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R%\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R#\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R#\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u001a\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u00106R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\b\n\u0000\u001a\u0004\b>\u00103¨\u0006W"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loaded;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "reorderableListState", "Lcom/robinhood/utils/compose/reorderable/ReorderableListState;", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;", "curatedListViewModes", "", "Ljava/util/UUID;", "Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "watchlistExpandToggle", "Lkotlin/Function2;", "", "", "updateWatchlistViewMode", "onWatchListItemRemoved", "Lcom/robinhood/models/db/CuratedListItem;", "onWatchListItemBuy", "Lkotlin/Function1;", "watchListItemsMap", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;", "curatedList", "Lkotlinx/collections/immutable/ImmutableList;", "showReorderCuratedListBottomSheet", "Lkotlin/Function0;", "accountNumber", "", "isSwipeToBuyEnabled", "swipeAnimationPreview", "Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "setupSwipeToTradeNux", "onSwipe", "swipeTooltip", "Lcom/robinhood/utils/resource/StringResource;", "onEquitySwipeTooltipShown", "onEquitySwipeTooltipClick", "<init>", "(Lcom/robinhood/utils/compose/reorderable/ReorderableListState;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getReorderableListState", "()Lcom/robinhood/utils/compose/reorderable/ReorderableListState;", "getCuratedListViewModes", "()Ljava/util/Map;", "getWatchlistExpandToggle", "()Lkotlin/jvm/functions/Function2;", "getUpdateWatchlistViewMode", "getOnWatchListItemRemoved", "getOnWatchListItemBuy", "()Lkotlin/jvm/functions/Function1;", "getWatchListItemsMap", "getCuratedList", "()Lkotlinx/collections/immutable/ImmutableList;", "getShowReorderCuratedListBottomSheet", "()Lkotlin/jvm/functions/Function0;", "getAccountNumber", "()Ljava/lang/String;", "()Z", "getSwipeAnimationPreview", "()Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "getSetupSwipeToTradeNux", "getOnSwipe", "getSwipeTooltip", "()Lcom/robinhood/utils/resource/StringResource;", "getOnEquitySwipeTooltipShown", "getOnEquitySwipeTooltipClick", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements CuratedListState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final ImmutableList<CuratedListDuxo7> curatedList;
        private final Map<UUID, DisplayType> curatedListViewModes;
        private final boolean isSwipeToBuyEnabled;
        private final Function0<Unit> onEquitySwipeTooltipClick;
        private final Function0<Unit> onEquitySwipeTooltipShown;
        private final Function0<Unit> onSwipe;
        private final Function1<CuratedListItem, Unit> onWatchListItemBuy;
        private final Function2<UUID, CuratedListItem, Unit> onWatchListItemRemoved;
        private final ReorderableListState<CuratedListDuxo7> reorderableListState;
        private final Function0<Unit> setupSwipeToTradeNux;
        private final Function0<Unit> showReorderCuratedListBottomSheet;
        private final SwipeAnimationPreview swipeAnimationPreview;
        private final StringResource swipeTooltip;
        private final Function2<UUID, DisplayType, Unit> updateWatchlistViewMode;
        private final Map<UUID, ReorderableListState<WatchlistItemRow>> watchListItemsMap;
        private final Function2<UUID, Boolean, Unit> watchlistExpandToggle;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ReorderableListState reorderableListState, Map map, Function2 function2, Function2 function22, Function2 function23, Function1 function1, Map map2, ImmutableList immutableList, Function0 function0, String str, boolean z, SwipeAnimationPreview swipeAnimationPreview, Function0 function02, Function0 function03, StringResource stringResource, Function0 function04, Function0 function05, int i, Object obj) {
            Function0 function06;
            Function0 function07;
            ReorderableListState reorderableListState2;
            Loaded loaded2;
            StringResource stringResource2;
            Map map3;
            Function2 function24;
            Function2 function25;
            Function2 function26;
            Function1 function12;
            Map map4;
            ImmutableList immutableList2;
            Function0 function08;
            String str2;
            boolean z2;
            SwipeAnimationPreview swipeAnimationPreview2;
            Function0 function09;
            Function0 function010;
            ReorderableListState reorderableListState3 = (i & 1) != 0 ? loaded.reorderableListState : reorderableListState;
            Map map5 = (i & 2) != 0 ? loaded.curatedListViewModes : map;
            Function2 function27 = (i & 4) != 0 ? loaded.watchlistExpandToggle : function2;
            Function2 function28 = (i & 8) != 0 ? loaded.updateWatchlistViewMode : function22;
            Function2 function29 = (i & 16) != 0 ? loaded.onWatchListItemRemoved : function23;
            Function1 function13 = (i & 32) != 0 ? loaded.onWatchListItemBuy : function1;
            Map map6 = (i & 64) != 0 ? loaded.watchListItemsMap : map2;
            ImmutableList immutableList3 = (i & 128) != 0 ? loaded.curatedList : immutableList;
            Function0 function011 = (i & 256) != 0 ? loaded.showReorderCuratedListBottomSheet : function0;
            String str3 = (i & 512) != 0 ? loaded.accountNumber : str;
            boolean z3 = (i & 1024) != 0 ? loaded.isSwipeToBuyEnabled : z;
            SwipeAnimationPreview swipeAnimationPreview3 = (i & 2048) != 0 ? loaded.swipeAnimationPreview : swipeAnimationPreview;
            Function0 function012 = (i & 4096) != 0 ? loaded.setupSwipeToTradeNux : function02;
            Function0 function013 = (i & 8192) != 0 ? loaded.onSwipe : function03;
            ReorderableListState reorderableListState4 = reorderableListState3;
            StringResource stringResource3 = (i & 16384) != 0 ? loaded.swipeTooltip : stringResource;
            Function0 function014 = (i & 32768) != 0 ? loaded.onEquitySwipeTooltipShown : function04;
            if ((i & 65536) != 0) {
                function07 = function014;
                function06 = loaded.onEquitySwipeTooltipClick;
                stringResource2 = stringResource3;
                map3 = map5;
                function24 = function27;
                function25 = function28;
                function26 = function29;
                function12 = function13;
                map4 = map6;
                immutableList2 = immutableList3;
                function08 = function011;
                str2 = str3;
                z2 = z3;
                swipeAnimationPreview2 = swipeAnimationPreview3;
                function09 = function012;
                function010 = function013;
                reorderableListState2 = reorderableListState4;
                loaded2 = loaded;
            } else {
                function06 = function05;
                function07 = function014;
                reorderableListState2 = reorderableListState4;
                loaded2 = loaded;
                stringResource2 = stringResource3;
                map3 = map5;
                function24 = function27;
                function25 = function28;
                function26 = function29;
                function12 = function13;
                map4 = map6;
                immutableList2 = immutableList3;
                function08 = function011;
                str2 = str3;
                z2 = z3;
                swipeAnimationPreview2 = swipeAnimationPreview3;
                function09 = function012;
                function010 = function013;
            }
            return loaded2.copy(reorderableListState2, map3, function24, function25, function26, function12, map4, immutableList2, function08, str2, z2, swipeAnimationPreview2, function09, function010, stringResource2, function07, function06);
        }

        public final ReorderableListState<CuratedListDuxo7> component1() {
            return this.reorderableListState;
        }

        /* renamed from: component10, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsSwipeToBuyEnabled() {
            return this.isSwipeToBuyEnabled;
        }

        /* renamed from: component12, reason: from getter */
        public final SwipeAnimationPreview getSwipeAnimationPreview() {
            return this.swipeAnimationPreview;
        }

        public final Function0<Unit> component13() {
            return this.setupSwipeToTradeNux;
        }

        public final Function0<Unit> component14() {
            return this.onSwipe;
        }

        /* renamed from: component15, reason: from getter */
        public final StringResource getSwipeTooltip() {
            return this.swipeTooltip;
        }

        public final Function0<Unit> component16() {
            return this.onEquitySwipeTooltipShown;
        }

        public final Function0<Unit> component17() {
            return this.onEquitySwipeTooltipClick;
        }

        public final Map<UUID, DisplayType> component2() {
            return this.curatedListViewModes;
        }

        public final Function2<UUID, Boolean, Unit> component3() {
            return this.watchlistExpandToggle;
        }

        public final Function2<UUID, DisplayType, Unit> component4() {
            return this.updateWatchlistViewMode;
        }

        public final Function2<UUID, CuratedListItem, Unit> component5() {
            return this.onWatchListItemRemoved;
        }

        public final Function1<CuratedListItem, Unit> component6() {
            return this.onWatchListItemBuy;
        }

        public final Map<UUID, ReorderableListState<WatchlistItemRow>> component7() {
            return this.watchListItemsMap;
        }

        public final ImmutableList<CuratedListDuxo7> component8() {
            return this.curatedList;
        }

        public final Function0<Unit> component9() {
            return this.showReorderCuratedListBottomSheet;
        }

        public final Loaded copy(ReorderableListState<CuratedListDuxo7> reorderableListState, Map<UUID, ? extends DisplayType> curatedListViewModes, Function2<? super UUID, ? super Boolean, Unit> watchlistExpandToggle, Function2<? super UUID, ? super DisplayType, Unit> updateWatchlistViewMode, Function2<? super UUID, ? super CuratedListItem, Unit> onWatchListItemRemoved, Function1<? super CuratedListItem, Unit> onWatchListItemBuy, Map<UUID, ReorderableListState<WatchlistItemRow>> watchListItemsMap, ImmutableList<? extends CuratedListDuxo7> curatedList, Function0<Unit> showReorderCuratedListBottomSheet, String accountNumber, boolean isSwipeToBuyEnabled, SwipeAnimationPreview swipeAnimationPreview, Function0<Unit> setupSwipeToTradeNux, Function0<Unit> onSwipe, StringResource swipeTooltip, Function0<Unit> onEquitySwipeTooltipShown, Function0<Unit> onEquitySwipeTooltipClick) {
            Intrinsics.checkNotNullParameter(reorderableListState, "reorderableListState");
            Intrinsics.checkNotNullParameter(curatedListViewModes, "curatedListViewModes");
            Intrinsics.checkNotNullParameter(watchlistExpandToggle, "watchlistExpandToggle");
            Intrinsics.checkNotNullParameter(updateWatchlistViewMode, "updateWatchlistViewMode");
            Intrinsics.checkNotNullParameter(onWatchListItemRemoved, "onWatchListItemRemoved");
            Intrinsics.checkNotNullParameter(onWatchListItemBuy, "onWatchListItemBuy");
            Intrinsics.checkNotNullParameter(watchListItemsMap, "watchListItemsMap");
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            Intrinsics.checkNotNullParameter(showReorderCuratedListBottomSheet, "showReorderCuratedListBottomSheet");
            Intrinsics.checkNotNullParameter(setupSwipeToTradeNux, "setupSwipeToTradeNux");
            Intrinsics.checkNotNullParameter(onSwipe, "onSwipe");
            Intrinsics.checkNotNullParameter(onEquitySwipeTooltipShown, "onEquitySwipeTooltipShown");
            Intrinsics.checkNotNullParameter(onEquitySwipeTooltipClick, "onEquitySwipeTooltipClick");
            return new Loaded(reorderableListState, curatedListViewModes, watchlistExpandToggle, updateWatchlistViewMode, onWatchListItemRemoved, onWatchListItemBuy, watchListItemsMap, curatedList, showReorderCuratedListBottomSheet, accountNumber, isSwipeToBuyEnabled, swipeAnimationPreview, setupSwipeToTradeNux, onSwipe, swipeTooltip, onEquitySwipeTooltipShown, onEquitySwipeTooltipClick);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.reorderableListState, loaded.reorderableListState) && Intrinsics.areEqual(this.curatedListViewModes, loaded.curatedListViewModes) && Intrinsics.areEqual(this.watchlistExpandToggle, loaded.watchlistExpandToggle) && Intrinsics.areEqual(this.updateWatchlistViewMode, loaded.updateWatchlistViewMode) && Intrinsics.areEqual(this.onWatchListItemRemoved, loaded.onWatchListItemRemoved) && Intrinsics.areEqual(this.onWatchListItemBuy, loaded.onWatchListItemBuy) && Intrinsics.areEqual(this.watchListItemsMap, loaded.watchListItemsMap) && Intrinsics.areEqual(this.curatedList, loaded.curatedList) && Intrinsics.areEqual(this.showReorderCuratedListBottomSheet, loaded.showReorderCuratedListBottomSheet) && Intrinsics.areEqual(this.accountNumber, loaded.accountNumber) && this.isSwipeToBuyEnabled == loaded.isSwipeToBuyEnabled && Intrinsics.areEqual(this.swipeAnimationPreview, loaded.swipeAnimationPreview) && Intrinsics.areEqual(this.setupSwipeToTradeNux, loaded.setupSwipeToTradeNux) && Intrinsics.areEqual(this.onSwipe, loaded.onSwipe) && Intrinsics.areEqual(this.swipeTooltip, loaded.swipeTooltip) && Intrinsics.areEqual(this.onEquitySwipeTooltipShown, loaded.onEquitySwipeTooltipShown) && Intrinsics.areEqual(this.onEquitySwipeTooltipClick, loaded.onEquitySwipeTooltipClick);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((this.reorderableListState.hashCode() * 31) + this.curatedListViewModes.hashCode()) * 31) + this.watchlistExpandToggle.hashCode()) * 31) + this.updateWatchlistViewMode.hashCode()) * 31) + this.onWatchListItemRemoved.hashCode()) * 31) + this.onWatchListItemBuy.hashCode()) * 31) + this.watchListItemsMap.hashCode()) * 31) + this.curatedList.hashCode()) * 31) + this.showReorderCuratedListBottomSheet.hashCode()) * 31;
            String str = this.accountNumber;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSwipeToBuyEnabled)) * 31;
            SwipeAnimationPreview swipeAnimationPreview = this.swipeAnimationPreview;
            int iHashCode3 = (((((iHashCode2 + (swipeAnimationPreview == null ? 0 : swipeAnimationPreview.hashCode())) * 31) + this.setupSwipeToTradeNux.hashCode()) * 31) + this.onSwipe.hashCode()) * 31;
            StringResource stringResource = this.swipeTooltip;
            return ((((iHashCode3 + (stringResource != null ? stringResource.hashCode() : 0)) * 31) + this.onEquitySwipeTooltipShown.hashCode()) * 31) + this.onEquitySwipeTooltipClick.hashCode();
        }

        public String toString() {
            return "Loaded(reorderableListState=" + this.reorderableListState + ", curatedListViewModes=" + this.curatedListViewModes + ", watchlistExpandToggle=" + this.watchlistExpandToggle + ", updateWatchlistViewMode=" + this.updateWatchlistViewMode + ", onWatchListItemRemoved=" + this.onWatchListItemRemoved + ", onWatchListItemBuy=" + this.onWatchListItemBuy + ", watchListItemsMap=" + this.watchListItemsMap + ", curatedList=" + this.curatedList + ", showReorderCuratedListBottomSheet=" + this.showReorderCuratedListBottomSheet + ", accountNumber=" + this.accountNumber + ", isSwipeToBuyEnabled=" + this.isSwipeToBuyEnabled + ", swipeAnimationPreview=" + this.swipeAnimationPreview + ", setupSwipeToTradeNux=" + this.setupSwipeToTradeNux + ", onSwipe=" + this.onSwipe + ", swipeTooltip=" + this.swipeTooltip + ", onEquitySwipeTooltipShown=" + this.onEquitySwipeTooltipShown + ", onEquitySwipeTooltipClick=" + this.onEquitySwipeTooltipClick + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(ReorderableListState<CuratedListDuxo7> reorderableListState, Map<UUID, ? extends DisplayType> curatedListViewModes, Function2<? super UUID, ? super Boolean, Unit> watchlistExpandToggle, Function2<? super UUID, ? super DisplayType, Unit> updateWatchlistViewMode, Function2<? super UUID, ? super CuratedListItem, Unit> onWatchListItemRemoved, Function1<? super CuratedListItem, Unit> onWatchListItemBuy, Map<UUID, ReorderableListState<WatchlistItemRow>> watchListItemsMap, ImmutableList<? extends CuratedListDuxo7> curatedList, Function0<Unit> showReorderCuratedListBottomSheet, String str, boolean z, SwipeAnimationPreview swipeAnimationPreview, Function0<Unit> setupSwipeToTradeNux, Function0<Unit> onSwipe, StringResource stringResource, Function0<Unit> onEquitySwipeTooltipShown, Function0<Unit> onEquitySwipeTooltipClick) {
            Intrinsics.checkNotNullParameter(reorderableListState, "reorderableListState");
            Intrinsics.checkNotNullParameter(curatedListViewModes, "curatedListViewModes");
            Intrinsics.checkNotNullParameter(watchlistExpandToggle, "watchlistExpandToggle");
            Intrinsics.checkNotNullParameter(updateWatchlistViewMode, "updateWatchlistViewMode");
            Intrinsics.checkNotNullParameter(onWatchListItemRemoved, "onWatchListItemRemoved");
            Intrinsics.checkNotNullParameter(onWatchListItemBuy, "onWatchListItemBuy");
            Intrinsics.checkNotNullParameter(watchListItemsMap, "watchListItemsMap");
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            Intrinsics.checkNotNullParameter(showReorderCuratedListBottomSheet, "showReorderCuratedListBottomSheet");
            Intrinsics.checkNotNullParameter(setupSwipeToTradeNux, "setupSwipeToTradeNux");
            Intrinsics.checkNotNullParameter(onSwipe, "onSwipe");
            Intrinsics.checkNotNullParameter(onEquitySwipeTooltipShown, "onEquitySwipeTooltipShown");
            Intrinsics.checkNotNullParameter(onEquitySwipeTooltipClick, "onEquitySwipeTooltipClick");
            this.reorderableListState = reorderableListState;
            this.curatedListViewModes = curatedListViewModes;
            this.watchlistExpandToggle = watchlistExpandToggle;
            this.updateWatchlistViewMode = updateWatchlistViewMode;
            this.onWatchListItemRemoved = onWatchListItemRemoved;
            this.onWatchListItemBuy = onWatchListItemBuy;
            this.watchListItemsMap = watchListItemsMap;
            this.curatedList = curatedList;
            this.showReorderCuratedListBottomSheet = showReorderCuratedListBottomSheet;
            this.accountNumber = str;
            this.isSwipeToBuyEnabled = z;
            this.swipeAnimationPreview = swipeAnimationPreview;
            this.setupSwipeToTradeNux = setupSwipeToTradeNux;
            this.onSwipe = onSwipe;
            this.swipeTooltip = stringResource;
            this.onEquitySwipeTooltipShown = onEquitySwipeTooltipShown;
            this.onEquitySwipeTooltipClick = onEquitySwipeTooltipClick;
        }

        public /* synthetic */ Loaded(ReorderableListState reorderableListState, Map map, Function2 function2, Function2 function22, Function2 function23, Function1 function1, Map map2, ImmutableList immutableList, Function0 function0, String str, boolean z, SwipeAnimationPreview swipeAnimationPreview, Function0 function02, Function0 function03, StringResource stringResource, Function0 function04, Function0 function05, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(reorderableListState, map, function2, function22, function23, function1, map2, immutableList, function0, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : swipeAnimationPreview, function02, function03, (i & 16384) != 0 ? null : stringResource, function04, function05);
        }

        public final ReorderableListState<CuratedListDuxo7> getReorderableListState() {
            return this.reorderableListState;
        }

        public final Map<UUID, DisplayType> getCuratedListViewModes() {
            return this.curatedListViewModes;
        }

        public final Function2<UUID, Boolean, Unit> getWatchlistExpandToggle() {
            return this.watchlistExpandToggle;
        }

        public final Function2<UUID, DisplayType, Unit> getUpdateWatchlistViewMode() {
            return this.updateWatchlistViewMode;
        }

        public final Function2<UUID, CuratedListItem, Unit> getOnWatchListItemRemoved() {
            return this.onWatchListItemRemoved;
        }

        public final Function1<CuratedListItem, Unit> getOnWatchListItemBuy() {
            return this.onWatchListItemBuy;
        }

        public final Map<UUID, ReorderableListState<WatchlistItemRow>> getWatchListItemsMap() {
            return this.watchListItemsMap;
        }

        public final ImmutableList<CuratedListDuxo7> getCuratedList() {
            return this.curatedList;
        }

        public final Function0<Unit> getShowReorderCuratedListBottomSheet() {
            return this.showReorderCuratedListBottomSheet;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean isSwipeToBuyEnabled() {
            return this.isSwipeToBuyEnabled;
        }

        public final SwipeAnimationPreview getSwipeAnimationPreview() {
            return this.swipeAnimationPreview;
        }

        public final Function0<Unit> getSetupSwipeToTradeNux() {
            return this.setupSwipeToTradeNux;
        }

        public final Function0<Unit> getOnSwipe() {
            return this.onSwipe;
        }

        public final StringResource getSwipeTooltip() {
            return this.swipeTooltip;
        }

        public final Function0<Unit> getOnEquitySwipeTooltipShown() {
            return this.onEquitySwipeTooltipShown;
        }

        public final Function0<Unit> getOnEquitySwipeTooltipClick() {
            return this.onEquitySwipeTooltipClick;
        }
    }
}
