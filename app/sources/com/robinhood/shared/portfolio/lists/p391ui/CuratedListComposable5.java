package com.robinhood.shared.portfolio.lists.p391ui;

import android.content.Context;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.contracts.EquityScreenerTableFragmentKey;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.equityscreener.models.ScreenerLoggingKeys;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo7;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7;
import com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow;
import com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRowComposable3;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.utils.compose.reorderable.ReorderableListState;
import com.robinhood.utils.compose.reorderable.ReorderableListStateKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListComposable.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a}\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0019\b\u0002\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\f2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\f¢\u0006\u0004\b\u000f\u0010\u0010\u001ao\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\f2\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aq\u0010 \u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0001¢\u0006\u0004\b \u0010!\u001a1\u0010)\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\"2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*¨\u0006+"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "curatedListState", "Lkotlin/Function1;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loaded;", "", "titleContent", "Lkotlin/Function0;", "contentBeforeLists", "", "enableSwipeToBuy", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "swipeToDeleteBackground", "swipeToBuyBackground", "curatedList", "(Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;", "curatedItem", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "isFirstEligibleWatchlist", "reorderableWatchListItems", "(Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loaded;Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;IZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "sectionExpanded", "Landroidx/compose/ui/Modifier;", "modifier", "allowOnClick", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "overrideEndAsset", "setExpanded", "onLongPress", "CuratedListItem", "(Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loaded;ZLandroidx/compose/ui/Modifier;ZLcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/db/CuratedList;", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Landroid/content/Context;", "context", "", "accountNumber", "curatedItemOnClick", "(Lcom/robinhood/models/db/CuratedList;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Ljava/lang/String;)V", "lib-lists-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CuratedListComposable5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListItem$lambda$15(CuratedListDuxo7 curatedListDuxo7, CuratedListState.Loaded loaded, boolean z, Modifier modifier, boolean z2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        CuratedListItem(curatedListDuxo7, loaded, z, modifier, z2, serverToBentoAssetMapper2, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListItem$lambda$8(CuratedListDuxo7 curatedListDuxo7, CuratedListState.Loaded loaded, boolean z, Modifier modifier, boolean z2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        CuratedListItem(curatedListDuxo7, loaded, z, modifier, z2, serverToBentoAssetMapper2, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void curatedList$default(ReorderableLazyListScope reorderableLazyListScope, CuratedListState curatedListState, Function3 function3, Function2 function2, boolean z, Function3 function32, Function3 function33, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            function32 = CuratedListComposable.INSTANCE.getLambda$906795823$lib_lists_ui_externalDebug();
        }
        Function3 function34 = function32;
        if ((i & 32) != 0) {
            function33 = CuratedListComposable.INSTANCE.m25591getLambda$802745420$lib_lists_ui_externalDebug();
        }
        curatedList(reorderableLazyListScope, curatedListState, function3, function2, z2, function34, function33);
    }

    public static final void curatedList(ReorderableLazyListScope reorderableLazyListScope, final CuratedListState curatedListState, final Function3<? super CuratedListState.Loaded, ? super Composer, ? super Integer, Unit> titleContent, final Function2<? super Composer, ? super Integer, Unit> contentBeforeLists, boolean z, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32) {
        CuratedListState.Loaded loaded;
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(titleContent, "titleContent");
        Intrinsics.checkNotNullParameter(contentBeforeLists, "contentBeforeLists");
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> swipeToDeleteBackground = function3;
        Intrinsics.checkNotNullParameter(swipeToDeleteBackground, "swipeToDeleteBackground");
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> swipeToBuyBackground = function32;
        Intrinsics.checkNotNullParameter(swipeToBuyBackground, "swipeToBuyBackground");
        if (curatedListState == null) {
            return;
        }
        if (Intrinsics.areEqual(curatedListState, CuratedListState.Loading.INSTANCE)) {
            LazyListScope.item$default(reorderableLazyListScope, null, null, CuratedListComposable.INSTANCE.m25590getLambda$1590673984$lib_lists_ui_externalDebug(), 3, null);
            return;
        }
        if (!(curatedListState instanceof CuratedListState.Loaded)) {
            throw new NoWhenBranchMatchedException();
        }
        LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(336541559, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt.curatedList.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(336541559, i, -1, "com.robinhood.shared.portfolio.lists.ui.curatedList.<anonymous> (CuratedListComposable.kt:108)");
                }
                titleContent.invoke(curatedListState, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-83973280, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt.curatedList.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-83973280, i, -1, "com.robinhood.shared.portfolio.lists.ui.curatedList.<anonymous> (CuratedListComposable.kt:112)");
                }
                contentBeforeLists.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        CuratedListState.Loaded loaded2 = (CuratedListState.Loaded) curatedListState;
        Iterator<CuratedListDuxo7> it = loaded2.getCuratedList().iterator();
        int i = 0;
        loop0: while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            CuratedListDuxo7 next = it.next();
            CuratedListDuxo7.WatchlistItem watchlistItem = next instanceof CuratedListDuxo7.WatchlistItem ? (CuratedListDuxo7.WatchlistItem) next : null;
            if (watchlistItem != null && watchlistItem.getExpanded()) {
                List<WatchlistItemRow> watchlistItems = watchlistItem.getWatchlistItems();
                if (!(watchlistItems instanceof Collection) || !watchlistItems.isEmpty()) {
                    Iterator<T> it2 = watchlistItems.iterator();
                    while (it2.hasNext()) {
                        if (((WatchlistItemRow) it2.next()).getCuratedListItem().getObjectType() == CuratedListObjectType.INSTRUMENT) {
                            break loop0;
                        }
                    }
                }
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        for (CuratedListDuxo7 curatedListDuxo7 : loaded2.getCuratedList()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CuratedListDuxo7 curatedListDuxo72 = curatedListDuxo7;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = curatedListDuxo72 instanceof CuratedListDuxo7.WatchlistItem ? ((CuratedListDuxo7.WatchlistItem) curatedListDuxo72).getExpanded() : false;
            LazyListScope.item$default(reorderableLazyListScope, "CuratedList: " + curatedListDuxo72.getId(), null, ComposableLambda3.composableLambdaInstance(1091798081, true, new CuratedListComposable6(curatedListDuxo72, curatedListState, booleanRef)), 2, null);
            if (booleanRef.element) {
                loaded = loaded2;
                reorderableWatchListItems(reorderableLazyListScope, loaded, curatedListDuxo72, i3, i3 == i2, swipeToDeleteBackground, swipeToBuyBackground, z);
            } else {
                loaded = loaded2;
            }
            swipeToDeleteBackground = function3;
            swipeToBuyBackground = function32;
            loaded2 = loaded;
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reorderableWatchListItems(ReorderableLazyListScope reorderableLazyListScope, final CuratedListState.Loaded loaded, final CuratedListDuxo7 curatedListDuxo7, final int i, final boolean z, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32, final boolean z2) {
        ReorderableListState<WatchlistItemRow> reorderableListState = loaded.getWatchListItemsMap().get(curatedListDuxo7.getId());
        if (reorderableListState != null) {
            ReorderableListStateKt.reorderableItems$default(reorderableLazyListScope, reorderableListState, "WatchlistItems", new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CuratedListComposable5.reorderableWatchListItems$lambda$5$lambda$4(curatedListDuxo7, ((Integer) obj).intValue(), (WatchlistItemRow) obj2);
                }
            }, null, false, false, ComposableLambda3.composableLambdaInstance(-317420257, true, new Function6<LazyItemScope, WatchlistItemRow, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$reorderableWatchListItems$1$2
                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, WatchlistItemRow watchlistItemRow, Integer num, Boolean bool, Composer composer, Integer num2) {
                    invoke(lazyItemScope, watchlistItemRow, num.intValue(), bool.booleanValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope reorderableItems, WatchlistItemRow watchlistItem, int i2, boolean z3, Composer composer, int i3) {
                    int i4;
                    boolean z4;
                    Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
                    Intrinsics.checkNotNullParameter(watchlistItem, "watchlistItem");
                    if ((i3 & 48) == 0) {
                        i4 = ((i3 & 64) == 0 ? composer.changed(watchlistItem) : composer.changedInstance(watchlistItem) ? 32 : 16) | i3;
                    } else {
                        i4 = i3;
                    }
                    if ((i3 & 384) == 0) {
                        i4 |= composer.changed(i2) ? 256 : 128;
                    }
                    if ((i3 & 3072) == 0) {
                        z4 = z3;
                        i4 |= composer.changed(z4) ? 2048 : 1024;
                    } else {
                        z4 = z3;
                    }
                    if ((i4 & 9361) == 9360 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-317420257, i4, -1, "com.robinhood.shared.portfolio.lists.ui.reorderableWatchListItems.<anonymous>.<anonymous> (CuratedListComposable.kt:183)");
                    }
                    final boolean z5 = z2 && (watchlistItem.getCuratedListItem().getObjectType() == CuratedListObjectType.INSTRUMENT);
                    CuratedListDuxo7 curatedListDuxo72 = curatedListDuxo7;
                    Intrinsics.checkNotNull(curatedListDuxo72, "null cannot be cast to non-null type com.robinhood.shared.portfolio.lists.ui.UiCuratedListItem.WatchlistItem");
                    CuratedListDuxo7.WatchlistItem watchlistItem2 = (CuratedListDuxo7.WatchlistItem) curatedListDuxo72;
                    int i5 = i4;
                    CuratedListState.Loaded loaded2 = loaded;
                    int i6 = i;
                    boolean z6 = z;
                    Function3<Row5, Composer, Integer, Unit> function33 = function3;
                    final Function3<Row5, Composer, Integer, Unit> function34 = function32;
                    WatchlistItemRowComposable3.WatchListItemComposable(z4, watchlistItem2, watchlistItem, loaded2, i6, z6, function33, ComposableLambda3.rememberComposableLambda(870697682, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$reorderableWatchListItems$1$2.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                            invoke(row5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 WatchListItemComposable, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(WatchListItemComposable, "$this$WatchListItemComposable");
                            if ((i7 & 6) == 0) {
                                i7 |= composer2.changed(WatchListItemComposable) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(870697682, i7, -1, "com.robinhood.shared.portfolio.lists.ui.reorderableWatchListItems.<anonymous>.<anonymous>.<anonymous> (CuratedListComposable.kt:196)");
                            }
                            if (z5) {
                                function34.invoke(WatchListItemComposable, composer2, Integer.valueOf(i7 & 14));
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), z5, i2, composer, ((i5 << 21) & 1879048192) | ((i5 >> 9) & 14) | 12582912 | ((i5 << 3) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 24, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reorderableWatchListItems$lambda$5$lambda$4(CuratedListDuxo7 curatedListDuxo7, int i, WatchlistItemRow watchlistItem) {
        Intrinsics.checkNotNullParameter(watchlistItem, "watchlistItem");
        return curatedListDuxo7.getId() + watchlistItem.getCuratedListItem().getObjectType() + PlaceholderUtils.XXShortPlaceholderText + watchlistItem.getCuratedListItem().getDisplayName() + PlaceholderUtils.XXShortPlaceholderText + watchlistItem.getId();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9 A[PHI: r15
      0x00a9: PHI (r15v17 int) = (r15v0 int), (r15v5 int), (r15v6 int) binds: [B:60:0x00a7, B:70:0x00bf, B:69:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CuratedListItem(final CuratedListDuxo7 curatedItem, final CuratedListState.Loaded curatedListState, final boolean z, Modifier modifier, boolean z2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function02;
        final Modifier modifier3;
        final boolean z5;
        final CuratedListDuxo7 curatedListDuxo7;
        final CuratedListState.Loaded loaded;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        Function0<Unit> function03;
        final Function1<? super Boolean, Unit> function12;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper23;
        Composer composer2;
        final Function0<Unit> function04;
        final Function1<? super Boolean, Unit> function13;
        final boolean z6;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(curatedItem, "curatedItem");
        Intrinsics.checkNotNullParameter(curatedListState, "curatedListState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1307718382);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(curatedItem) : composerStartRestartGroup.changedInstance(curatedItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(curatedListState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    int i9 = 196608;
                    if (i6 != 0) {
                        i3 |= i9;
                    } else if ((196608 & i) == 0) {
                        i9 = composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 131072 : 65536;
                        i3 |= i9;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                        }
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            z4 = true;
                        }
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = i6 == 0 ? null : serverToBentoAssetMapper2;
                        Function1<? super Boolean, Unit> function14 = i7 == 0 ? null : function1;
                        Function0<Unit> function05 = i8 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1307718382, i3, -1, "com.robinhood.shared.portfolio.lists.ui.CuratedListItem (CuratedListComposable.kt:216)");
                        }
                        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        if (curatedItem instanceof CuratedListDuxo7.CuratedItem) {
                            modifier3 = modifier5;
                            z5 = z4;
                            if (curatedItem instanceof CuratedListDuxo7.WatchlistItem) {
                                composerStartRestartGroup.startReplaceGroup(-1408716086);
                                CuratedListDuxo7.WatchlistItem watchlistItem = (CuratedListDuxo7.WatchlistItem) curatedItem;
                                if (!watchlistItem.getShouldShowListRows()) {
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                                        final boolean z7 = z3;
                                        final ServerToBentoAssetMapper2 serverToBentoAssetMapper25 = serverToBentoAssetMapper24;
                                        final Function0<Unit> function06 = function05;
                                        final Function1<? super Boolean, Unit> function15 = function14;
                                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return CuratedListComposable5.CuratedListItem$lambda$8(curatedItem, curatedListState, z7, modifier3, z5, serverToBentoAssetMapper25, function15, function06, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                curatedListDuxo7 = curatedItem;
                                loaded = curatedListState;
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper26 = serverToBentoAssetMapper24;
                                function03 = function05;
                                function12 = function14;
                                CuratedList watchlist = watchlistItem.getWatchlist();
                                int itemCount = watchlistItem.getWatchlist().getItemCount();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = ((3670016 & i3) == 1048576) | composerStartRestartGroup.changedInstance(loaded);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return CuratedListComposable5.CuratedListItem$lambda$10$lambda$9(loaded, function12, (UUID) obj, ((Boolean) obj2).booleanValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                UserListRowComposable7.WatchlistRow.Expandable expandable = new UserListRowComposable7.WatchlistRow.Expandable(watchlist, z, (Function2) objRememberedValue, serverToBentoAssetMapper26, itemCount);
                                serverToBentoAssetMapper22 = serverToBentoAssetMapper26;
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                boolean zChangedInstance2 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(curatedListDuxo7))) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(loaded);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CuratedListComposable5.CuratedListItem$lambda$12$lambda$11(curatedListDuxo7, navigator, context, loaded);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                UserListRowComposable5.UserListRowComposable(expandable, (Function0) objRememberedValue2, modifier3, z5, function03, composerStartRestartGroup, ((i3 >> 3) & 8064) | ((i3 >> 9) & 57344), 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                curatedListDuxo7 = curatedItem;
                                loaded = curatedListState;
                                serverToBentoAssetMapper22 = serverToBentoAssetMapper24;
                                function03 = function05;
                                function12 = function14;
                                if (!(curatedListDuxo7 instanceof CuratedListDuxo7.ScreenerItem)) {
                                    composerStartRestartGroup.startReplaceGroup(-1708034963);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(-1407296937);
                                CuratedListDuxo7.ScreenerItem screenerItem = (CuratedListDuxo7.ScreenerItem) curatedListDuxo7;
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier3, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, ScreenerLoggingKeys.SCREENER_PREFIX + screenerItem.getScreener().getId(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                                int i10 = i3;
                                UserListRowComposable7.ScreenerRow screenerRow = new UserListRowComposable7.ScreenerRow(screenerItem.getScreener(), serverToBentoAssetMapper22);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i10 & 14) == 4 || ((i10 & 8) != 0 && composerStartRestartGroup.changedInstance(curatedListDuxo7))) | composerStartRestartGroup.changedInstance(loaded);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CuratedListComposable5.CuratedListItem$lambda$14$lambda$13(navigator, context, curatedListDuxo7, loaded);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                UserListRowComposable5.UserListRowComposable(screenerRow, (Function0) objRememberedValue3, modifierAutoLogEvents$default, z5, function03, composerStartRestartGroup, ((i10 >> 3) & 7168) | ((i10 >> 9) & 57344), 0);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1409500510);
                            UserListRowComposable7.CuratedListRow curatedListRow = new UserListRowComposable7.CuratedListRow(((CuratedListDuxo7.CuratedItem) curatedItem).getCuratedList(), serverToBentoAssetMapper24);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            boolean zChangedInstance4 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(curatedItem))) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(curatedListState);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CuratedListComposable5.CuratedListItem$lambda$7$lambda$6(curatedItem, navigator, context, curatedListState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            boolean z8 = z4;
                            modifier3 = modifier5;
                            UserListRowComposable5.UserListRowComposable(curatedListRow, (Function0) objRememberedValue4, modifier3, z8, function05, composerStartRestartGroup, ((i3 >> 3) & 8064) | ((i3 >> 9) & 57344), 0);
                            z5 = z8;
                            composerStartRestartGroup.endReplaceGroup();
                            curatedListDuxo7 = curatedItem;
                            loaded = curatedListState;
                            serverToBentoAssetMapper22 = serverToBentoAssetMapper24;
                            function03 = function05;
                            function12 = function14;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        serverToBentoAssetMapper23 = serverToBentoAssetMapper22;
                        composer2 = composerStartRestartGroup;
                        function04 = function03;
                        function13 = function12;
                        z6 = z5;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function13 = function1;
                        curatedListDuxo7 = curatedItem;
                        loaded = curatedListState;
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        z6 = z4;
                        function04 = function02;
                        serverToBentoAssetMapper23 = serverToBentoAssetMapper2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final CuratedListDuxo7 curatedListDuxo72 = curatedListDuxo7;
                        final CuratedListState.Loaded loaded2 = loaded;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CuratedListComposable5.CuratedListItem$lambda$15(curatedListDuxo72, loaded2, z, modifier4, z6, serverToBentoAssetMapper23, function13, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z4 = z2;
                i6 = i2 & 32;
                int i92 = 196608;
                if (i6 != 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    if (curatedItem instanceof CuratedListDuxo7.CuratedItem) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    serverToBentoAssetMapper23 = serverToBentoAssetMapper22;
                    composer2 = composerStartRestartGroup;
                    function04 = function03;
                    function13 = function12;
                    z6 = z5;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z4 = z2;
            i6 = i2 & 32;
            int i922 = 196608;
            if (i6 != 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i2 & 32;
        int i9222 = 196608;
        if (i6 != 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListItem$lambda$7$lambda$6(CuratedListDuxo7 curatedListDuxo7, Navigator navigator, Context context, CuratedListState.Loaded loaded) {
        curatedItemOnClick(((CuratedListDuxo7.CuratedItem) curatedListDuxo7).getCuratedList(), navigator, context, loaded.getAccountNumber());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListItem$lambda$10$lambda$9(CuratedListState.Loaded loaded, Function1 function1, UUID id, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        loaded.getWatchlistExpandToggle().invoke(id, Boolean.valueOf(z));
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(!z));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListItem$lambda$12$lambda$11(CuratedListDuxo7 curatedListDuxo7, Navigator navigator, Context context, CuratedListState.Loaded loaded) {
        curatedItemOnClick(((CuratedListDuxo7.WatchlistItem) curatedListDuxo7).getWatchlist(), navigator, context, loaded.getAccountNumber());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListItem$lambda$14$lambda$13(Navigator navigator, Context context, CuratedListDuxo7 curatedListDuxo7, CuratedListState.Loaded loaded) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new EquityScreenerTableFragmentKey(((CuratedListDuxo7.ScreenerItem) curatedListDuxo7).getScreener().getId(), "lists_section_saved_screener", false, loaded.getAccountNumber(), 4, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
        return Unit.INSTANCE;
    }

    private static final void curatedItemOnClick(CuratedList curatedList, Navigator navigator, Context context, String str) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, curatedList.isOptionsWatchlist() ? LegacyFragmentKey.OptionsWatchlistHub.INSTANCE : CuratedListKey.INSTANCE.create(curatedList.getId(), curatedList.getOwnerType(), str), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }
}
