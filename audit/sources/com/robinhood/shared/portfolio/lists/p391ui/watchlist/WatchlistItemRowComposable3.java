package com.robinhood.shared.portfolio.lists.p391ui.watchlist;

import android.content.Context;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.android.shared.portfolio.lists.handler.ListInstrumentClickHandler;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeComposable;
import com.robinhood.android.common.portfolio.position.SwipeAnimationPreview;
import com.robinhood.android.common.portfolio.unified.DisplayType;
import com.robinhood.android.common.portfolio.unified.DisplayType2;
import com.robinhood.android.common.portfolio.unified.UnifiedInstrumentRow;
import com.robinhood.android.common.portfolio.unified.UnifiedInstrumentRow2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals7;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower5;
import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.swipetodismiss.FractionalThreshold;
import com.robinhood.android.swipetodismiss.SwipeToDismiss;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import com.robinhood.android.swipetodismiss.SwipeToDismiss3;
import com.robinhood.android.swipetodismiss.SwipeToDismiss4;
import com.robinhood.android.swipetodismiss.ThresholdConfig;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.models.serverdriven.experimental.api.InstrumentListItem;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.PositionsInstrumentType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListDuxo7;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.shared.portfolio.lists.p391ui.extensions.CuratedListObjectTypes;
import com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow;
import com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRowComposable3;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WatchlistItemRowComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010\"\u001a\u00020\r*\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\"\u0010#\u001a/\u0010$\u001a\u00020\r*\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0011\u0010'\u001a\u00020&*\u00020%¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010+\u001a\u00060\u0015j\u0002`**\u00020)H\u0002¢\u0006\u0004\b+\u0010,\"\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00065²\u0006\f\u00103\u001a\u0002028\nX\u008a\u0084\u0002²\u0006\u000e\u00104\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "sectionItemDragging", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem$WatchlistItem;", PortfolioBuyingPower5.IntentKeyEntryPoint, "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;", "watchlistItem", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loaded;", "curatedListState", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "isFirstEligibleWatchlist", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Lkotlin/ExtensionFunctionType;", "swipeToDeleteBackground", "swipeToBuyBackground", "isSwipeToBuyEnabled", "itemIndex", "WatchListItemComposable", "(ZLcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem$WatchlistItem;Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState$Loaded;IZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZILandroidx/compose/runtime/Composer;I)V", "", "assetUniqueIdentifier", "(Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;)Ljava/lang/String;", "Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentType;", "positionInstrumentType", "(Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;)Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentType;", "accountNumber", "Lcom/robinhood/rosetta/eventlogging/Context;", "defaultWatchlistEventContext", "(Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "logWatchlistSwipeStart", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;Ljava/lang/String;)V", "logWatchlistSwipeCompleted", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "Lcom/robinhood/models/api/CuratedListObjectType;", "toCuratedListObjectType", "(Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;)Lcom/robinhood/models/api/CuratedListObjectType;", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", "toPositionViewMode", "(Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;)Ljava/lang/String;", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/ListInstrumentClickHandlerCompositionLocal;", "LocalListInstrumentClickHandler", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/ListInstrumentClickHandlerCompositionLocal;", "getLocalListInstrumentClickHandler", "()Lcom/robinhood/shared/portfolio/lists/ui/watchlist/ListInstrumentClickHandlerCompositionLocal;", "Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "viewMode", "displayDataBottomSheetExpanded", "lib-lists-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class WatchlistItemRowComposable3 {
    private static final WatchlistItemRowComposable LocalListInstrumentClickHandler = new WatchlistItemRowComposable(null, 1, 0 == true ? 1 : 0);

    /* compiled from: WatchlistItemRowComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SwipeToDismiss3.values().length];
            try {
                iArr[SwipeToDismiss3.DismissedToStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeToDismiss3.DismissedToEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PositionInstrumentType.values().length];
            try {
                iArr2[PositionInstrumentType.EQUITY_LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PositionInstrumentType.EQUITY_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PositionInstrumentType.EQUITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PositionInstrumentType.CRYPTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PositionInstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PositionInstrumentType.CRYPTO_PERPETUALS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PositionInstrumentType.OPTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PositionInstrumentType.OPTIONS_PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PositionInstrumentType.COMBO_ORDERS_PENDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[PositionInstrumentType.FUTURES.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[PositionInstrumentType.FUTURES_PENDING.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[PositionInstrumentType.EVENT_CONTRACT.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[PositionInstrumentType.EVENT_CONTRACT_PENDING.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[PositionInstrumentType.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[PositionInstrumentType.PSP.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[InstrumentDisplayType.values().length];
            try {
                iArr3[InstrumentDisplayType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[InstrumentDisplayType.LAST_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[InstrumentDisplayType.PERCENT_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WatchListItemComposable$lambda$15(boolean z, CuratedListDuxo7.WatchlistItem watchlistItem, WatchlistItemRow watchlistItemRow, CuratedListState.Loaded loaded, int i, boolean z2, Function3 function3, Function3 function32, boolean z3, int i2, int i3, Composer composer, int i4) {
        WatchListItemComposable(z, watchlistItem, watchlistItemRow, loaded, i, z2, function3, function32, z3, i2, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    public static final void WatchListItemComposable(final boolean z, CuratedListDuxo7.WatchlistItem watchlistItem, WatchlistItemRow watchlistItemRow, CuratedListState.Loaded loaded, final int i, final boolean z2, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> swipeToDeleteBackground, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> swipeToBuyBackground, final boolean z3, final int i2, Composer composer, final int i3) {
        int i4;
        Modifier modifierM4872backgroundbw27NRU$default;
        Object watchlistItemRowComposable4;
        SwipeToDismiss2 swipeToDismiss2;
        Composer composer2;
        EventLogger eventLogger;
        WatchlistItemRow watchlistItemRow2;
        int i5;
        Screen screen;
        CuratedListState.Loaded loaded2;
        int i6;
        Composer composer3;
        final SwipeToDismiss2 swipeToDismiss22;
        EventLogger eventLogger2;
        Screen screen2;
        CuratedListState.Loaded loaded3;
        int i7;
        Composer composer4;
        final CuratedListDuxo7.WatchlistItem watchlist = watchlistItem;
        WatchlistItemRow watchlistItem2 = watchlistItemRow;
        final CuratedListState.Loaded curatedListState = loaded;
        Intrinsics.checkNotNullParameter(watchlist, "watchlist");
        Intrinsics.checkNotNullParameter(watchlistItem2, "watchlistItem");
        Intrinsics.checkNotNullParameter(curatedListState, "curatedListState");
        Intrinsics.checkNotNullParameter(swipeToDeleteBackground, "swipeToDeleteBackground");
        Intrinsics.checkNotNullParameter(swipeToBuyBackground, "swipeToBuyBackground");
        Composer composerStartRestartGroup = composer.startRestartGroup(-116824793);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(watchlist) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= (i3 & 512) == 0 ? composerStartRestartGroup.changed(watchlistItem2) : composerStartRestartGroup.changedInstance(watchlistItem2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(curatedListState) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(swipeToDeleteBackground) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(swipeToBuyBackground) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
        }
        if ((i4 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer4 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-116824793, i4, -1, "com.robinhood.shared.portfolio.lists.ui.watchlist.WatchListItemComposable (WatchlistItemRowComposable.kt:80)");
            }
            Map<UUID, DisplayType> curatedListViewModes = curatedListState.getCuratedListViewModes();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(curatedListViewModes);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WatchlistItemRowComposable3.WatchListItemComposable$lambda$1$lambda$0(curatedListState, watchlist);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1402850143);
                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1402786686);
                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifier = modifierM4872backgroundbw27NRU$default;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z4 = (234881024 & i4) == 67108864;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(WatchlistItemRowComposable3.WatchListItemComposable$lambda$7$lambda$6(z3, (SwipeToDismiss3) obj));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            SwipeToDismiss2 swipeToDismiss2RememberDismissState = SwipeToDismiss4.rememberDismissState(null, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 1);
            PerformanceLogger current = AutoLoggingCompositionLocals.getLocalPerformanceLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals7.$stable);
            ListInstrumentClickHandler current2 = LocalListInstrumentClickHandler.getCurrent(composerStartRestartGroup, 6);
            EventLogger current3 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Screen screen3 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
            SwipeToDismiss dismissDirection = swipeToDismiss2RememberDismissState.getDismissDirection();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i8 = i4 & 896;
            boolean zChanged2 = composerStartRestartGroup.changed(swipeToDismiss2RememberDismissState) | composerStartRestartGroup.changedInstance(current3) | composerStartRestartGroup.changedInstance(screen3) | (i8 == 256 || ((i4 & 512) != 0 && composerStartRestartGroup.changedInstance(watchlistItem2))) | composerStartRestartGroup.changedInstance(curatedListState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                swipeToDismiss2 = swipeToDismiss2RememberDismissState;
                composer2 = composerStartRestartGroup;
                eventLogger = current3;
                watchlistItemRow2 = watchlistItem2;
                i5 = i4;
                screen = screen3;
                loaded2 = loaded;
                i6 = 0;
                watchlistItemRowComposable4 = new WatchlistItemRowComposable4(swipeToDismiss2, eventLogger, screen, watchlistItemRow2, loaded2, null);
                composer2.updateRememberedValue(watchlistItemRowComposable4);
            } else {
                watchlistItemRow2 = watchlistItem2;
                i5 = i4;
                screen = screen3;
                loaded2 = curatedListState;
                composer2 = composerStartRestartGroup;
                watchlistItemRowComposable4 = objRememberedValue4;
                eventLogger = current3;
                swipeToDismiss2 = swipeToDismiss2RememberDismissState;
                i6 = 0;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(dismissDirection, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) watchlistItemRowComposable4, composer2, i6);
            SwipeToDismiss3 currentValue = swipeToDismiss2.getCurrentValue();
            Boolean boolValueOf = Boolean.valueOf(swipeToDismiss2.isAnimationRunning());
            composer2.startReplaceGroup(-1224400529);
            boolean zChanged3 = (i8 == 256 || ((i5 & 512) != 0 && composer2.changedInstance(watchlistItemRow2))) | composer2.changed(swipeToDismiss2) | composer2.changedInstance(loaded2) | composer2.changedInstance(watchlist) | composer2.changedInstance(eventLogger) | composer2.changedInstance(screen);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                composer3 = composer2;
                swipeToDismiss22 = swipeToDismiss2;
                eventLogger2 = eventLogger;
                screen2 = screen;
                WatchlistItemRow watchlistItemRow3 = watchlistItemRow2;
                loaded3 = loaded2;
                i7 = 0;
                objRememberedValue5 = new WatchlistItemRowComposable5(swipeToDismiss22, loaded3, watchlist, watchlistItemRow3, eventLogger2, screen2, null);
                composer3.updateRememberedValue(objRememberedValue5);
            } else {
                composer3 = composer2;
                swipeToDismiss22 = swipeToDismiss2;
                eventLogger2 = eventLogger;
                screen2 = screen;
                loaded3 = loaded2;
                i7 = 0;
            }
            composer3.endReplaceGroup();
            EffectsKt.LaunchedEffect(currentValue, boolValueOf, (Function2) objRememberedValue5, composer3, i7);
            composer3.startReplaceGroup(-599375557);
            if (z2 && i2 == 0 && z3) {
                loaded3.getSetupSwipeToTradeNux().invoke();
                SwipeAnimationPreview swipeAnimationPreview = loaded3.getSwipeAnimationPreview();
                composer3.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer3.changedInstance(loaded3) | composer3.changed(swipeToDismiss22);
                Object objRememberedValue6 = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new WatchlistItemRowComposable6(loaded3, swipeToDismiss22, null);
                    composer3.updateRememberedValue(objRememberedValue6);
                }
                composer3.endReplaceGroup();
                EffectsKt.LaunchedEffect(swipeAnimationPreview, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer3, SwipeAnimationPreview.$stable);
            }
            composer3.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, z3 ? "swipe_to_buy_enabled" : "swipe_to_buy_disabled");
            Set of = z3 ? SetsKt.setOf((Object[]) new SwipeToDismiss[]{SwipeToDismiss.EndToStart, SwipeToDismiss.StartToEnd}) : SetsKt.setOf(SwipeToDismiss.EndToStart);
            composer3.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composer3.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WatchlistItemRowComposable3.WatchListItemComposable$lambda$12$lambda$11((SwipeToDismiss) obj);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue7);
            }
            composer3.endReplaceGroup();
            watchlist = watchlistItem;
            curatedListState = loaded3;
            watchlistItem2 = watchlistItemRow;
            composer4 = composer3;
            SwipeToDismiss4.SwipeToDismiss(swipeToDismiss22, modifierTestTag, of, (Function1) objRememberedValue7, ComposableLambda3.rememberComposableLambda(357286101, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt.WatchListItemComposable.5

                /* compiled from: WatchlistItemRowComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$5$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[SwipeToDismiss.values().length];
                        try {
                            iArr[SwipeToDismiss.EndToStart.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[SwipeToDismiss.StartToEnd.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer5, Integer num) {
                    invoke(row5, composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 SwipeToDismiss, Composer composer5, int i9) {
                    Intrinsics.checkNotNullParameter(SwipeToDismiss, "$this$SwipeToDismiss");
                    if ((i9 & 6) == 0) {
                        i9 |= composer5.changed(SwipeToDismiss) ? 4 : 2;
                    }
                    if ((i9 & 19) == 18 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(357286101, i9, -1, "com.robinhood.shared.portfolio.lists.ui.watchlist.WatchListItemComposable.<anonymous> (WatchlistItemRowComposable.kt:168)");
                    }
                    SwipeToDismiss dismissDirection2 = swipeToDismiss22.getDismissDirection();
                    if (dismissDirection2 == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    int i10 = WhenMappings.$EnumSwitchMapping$0[dismissDirection2.ordinal()];
                    if (i10 == 1) {
                        composer5.startReplaceGroup(-245434930);
                        swipeToDeleteBackground.invoke(SwipeToDismiss, composer5, Integer.valueOf(i9 & 14));
                        composer5.endReplaceGroup();
                    } else {
                        if (i10 != 2) {
                            composer5.startReplaceGroup(-245437109);
                            composer5.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer5.startReplaceGroup(-245432597);
                        swipeToBuyBackground.invoke(SwipeToDismiss, composer5, Integer.valueOf(i9 & 14));
                        composer5.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer3, 54), ComposableLambda3.rememberComposableLambda(435407190, true, new C394786(modifier, watchlistItem2, watchlist, curatedListState, i, current2, navigator, context, current, z2, i2, z3, eventLogger2, screen2, snapshotState4, snapshotState), composer3, 54), null, composer4, 224256, 64);
            if (WatchListItemComposable$lambda$4(snapshotState)) {
                composer4.startReplaceGroup(5004770);
                Object objRememberedValue8 = composer4.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WatchlistItemRowComposable3.WatchListItemComposable$lambda$14$lambda$13(snapshotState);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue8);
                }
                composer4.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue8, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1206149934, true, new C394798(watchlistItem2, curatedListState, watchlist, snapshotState4), composer4, 54), composer4, 1572870, 62);
                composer4 = composer4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final WatchlistItemRow watchlistItemRow4 = watchlistItem2;
            final CuratedListDuxo7.WatchlistItem watchlistItem3 = watchlist;
            final CuratedListState.Loaded loaded4 = curatedListState;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WatchlistItemRowComposable3.WatchListItemComposable$lambda$15(z, watchlistItem3, watchlistItemRow4, loaded4, i, z2, swipeToDeleteBackground, swipeToBuyBackground, z3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayType WatchListItemComposable$lambda$1$lambda$0(CuratedListState.Loaded loaded, CuratedListDuxo7.WatchlistItem watchlistItem) {
        return loaded.getCuratedListViewModes().getOrDefault(watchlistItem.getId(), DisplayType.LAST_PRICE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayType WatchListItemComposable$lambda$2(SnapshotState4<? extends DisplayType> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean WatchListItemComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WatchListItemComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WatchListItemComposable$lambda$7$lambda$6(boolean z, SwipeToDismiss3 dismissValue) {
        Intrinsics.checkNotNullParameter(dismissValue, "dismissValue");
        int i = WhenMappings.$EnumSwitchMapping$0[dismissValue.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThresholdConfig WatchListItemComposable$lambda$12$lambda$11(SwipeToDismiss it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new FractionalThreshold(0.4f);
    }

    /* compiled from: WatchlistItemRowComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$6 */
    static final class C394786 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CuratedListState.Loaded $curatedListState;
        final /* synthetic */ SnapshotState<Boolean> $displayDataBottomSheetExpanded$delegate;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ int $index;
        final /* synthetic */ ListInstrumentClickHandler $instrumentClickHandler;
        final /* synthetic */ boolean $isFirstEligibleWatchlist;
        final /* synthetic */ boolean $isSwipeToBuyEnabled;
        final /* synthetic */ int $itemIndex;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ PerformanceLogger $performanceLogger;
        final /* synthetic */ Screen $screen;
        final /* synthetic */ Modifier $sectionItemModifier;
        final /* synthetic */ SnapshotState4<DisplayType> $viewMode$delegate;
        final /* synthetic */ CuratedListDuxo7.WatchlistItem $watchlist;
        final /* synthetic */ WatchlistItemRow $watchlistItem;

        /* compiled from: WatchlistItemRowComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$6$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CuratedListObjectType.values().length];
                try {
                    iArr[CuratedListObjectType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CuratedListObjectType.CURRENCY_PAIR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CuratedListObjectType.FUTURES_CONTRACT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CuratedListObjectType.INSTRUMENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CuratedListObjectType.OPTION_STRATEGY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CuratedListObjectType.INDEX.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CuratedListObjectType.PERPETUALS_CONTRACT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CuratedListObjectType.UNKNOWN.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C394786(Modifier modifier, WatchlistItemRow watchlistItemRow, CuratedListDuxo7.WatchlistItem watchlistItem, CuratedListState.Loaded loaded, int i, ListInstrumentClickHandler listInstrumentClickHandler, Navigator navigator, Context context, PerformanceLogger performanceLogger, boolean z, int i2, boolean z2, EventLogger eventLogger, Screen screen, SnapshotState4<? extends DisplayType> snapshotState4, SnapshotState<Boolean> snapshotState) {
            this.$sectionItemModifier = modifier;
            this.$watchlistItem = watchlistItemRow;
            this.$watchlist = watchlistItem;
            this.$curatedListState = loaded;
            this.$index = i;
            this.$instrumentClickHandler = listInstrumentClickHandler;
            this.$navigator = navigator;
            this.$context = context;
            this.$performanceLogger = performanceLogger;
            this.$isFirstEligibleWatchlist = z;
            this.$itemIndex = i2;
            this.$isSwipeToBuyEnabled = z2;
            this.$eventLogger = eventLogger;
            this.$screen = screen;
            this.$viewMode$delegate = snapshotState4;
            this.$displayDataBottomSheetExpanded$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 SwipeToDismiss, Composer composer, int i) {
            UnifiedInstrumentRow2 positionRow;
            InstrumentType instrumentType;
            Intrinsics.checkNotNullParameter(SwipeToDismiss, "$this$SwipeToDismiss");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(435407190, i, -1, "com.robinhood.shared.portfolio.lists.ui.watchlist.WatchListItemComposable.<anonymous> (WatchlistItemRowComposable.kt:175)");
            }
            composer.startReplaceGroup(1814487085);
            Modifier modifierM26519popupTooltipBgaGok8 = this.$sectionItemModifier;
            boolean z = this.$isFirstEligibleWatchlist;
            int i2 = this.$itemIndex;
            boolean z2 = this.$isSwipeToBuyEnabled;
            final CuratedListState.Loaded loaded = this.$curatedListState;
            final EventLogger eventLogger = this.$eventLogger;
            final Screen screen = this.$screen;
            composer.startReplaceGroup(1814488365);
            if (z && i2 == 0 && z2 && loaded.getSwipeTooltip() != null) {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(loaded) | composer.changedInstance(eventLogger) | composer.changedInstance(screen);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$6$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WatchlistItemRowComposable3.C394786.invoke$lambda$4$lambda$1$lambda$0(loaded, eventLogger, screen);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer.changedInstance(loaded) | composer.changedInstance(eventLogger) | composer.changedInstance(screen);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$6$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WatchlistItemRowComposable3.C394786.invoke$lambda$4$lambda$3$lambda$2(loaded, eventLogger, screen);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(modifierM26519popupTooltipBgaGok8, (16232 & 1) != 0 ? Boolean.TRUE : null, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : function0, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : (Function0) objRememberedValue2, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : null, (16232 & 32) != 0 ? null : Duration.m28726boximpl(duration), (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(-1080853229, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$6$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1080853229, i3, -1, "com.robinhood.shared.portfolio.lists.ui.watchlist.WatchListItemComposable.<anonymous>.<anonymous>.<anonymous> (WatchlistItemRowComposable.kt:204)");
                        }
                        BentoText2.m20747BentoText38GnDrw(StringResources6.getText(loaded.getSwipeTooltip(), composer2, StringResource.$stable).toString(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54));
            }
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_ASSET_DETAIL_PAGE;
            Component component = new Component(Component.ComponentType.LIST_ASSET_ROW, null, null, 6, null);
            Asset.AssetType eventType = CuratedListObjectTypes.getEventType(this.$watchlistItem.getCuratedListItem().getObjectType());
            String string2 = this.$watchlistItem.getCuratedListItem().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            Asset asset = new Asset(string2, eventType, null, null, 12, null);
            String string3 = this.$watchlist.getId().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM26519popupTooltipBgaGok8, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, asset, new List(string3, null, List.OwnerType.USER, null, 10, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -49153, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null), true, false, false, true, false, null, 108, null);
            WatchlistItemRow watchlistItemRow = this.$watchlistItem;
            if (watchlistItemRow instanceof WatchlistItemRow.OptionsInstrument) {
                positionRow = new UnifiedInstrumentRow2.OptionStrategyRow(WatchlistItemRowComposable3.WatchListItemComposable$lambda$2(this.$viewMode$delegate).getValue(), ((WatchlistItemRow.OptionsInstrument) watchlistItemRow).getCuratedListItem(), this.$curatedListState.getAccountNumber());
            } else if (watchlistItemRow instanceof WatchlistItemRow.Instrument) {
                CuratedListItem curatedListItem = ((WatchlistItemRow.Instrument) watchlistItemRow).getCuratedListItem();
                String string4 = curatedListItem.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                switch (WhenMappings.$EnumSwitchMapping$0[curatedListItem.getObjectType().ordinal()]) {
                    case 1:
                        instrumentType = InstrumentType.CRYPTO_TOKENIZED_STOCKS;
                        break;
                    case 2:
                        instrumentType = InstrumentType.CRYPTO;
                        break;
                    case 3:
                        instrumentType = InstrumentType.FUTURE;
                        break;
                    case 4:
                        instrumentType = InstrumentType.EQUITY;
                        break;
                    case 5:
                        instrumentType = InstrumentType.OPTION_STRATEGY;
                        break;
                    case 6:
                        instrumentType = InstrumentType.INDEX;
                        break;
                    case 7:
                        instrumentType = InstrumentType.CRYPTO_PERPETUALS;
                        break;
                    case 8:
                        instrumentType = InstrumentType.UNKNOWN;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                positionRow = new UnifiedInstrumentRow2.InstrumentRow(new InstrumentListItem(string4, instrumentType, 2.0f, DisplayType2.toInstrumentDisplayType(WatchlistItemRowComposable3.WatchListItemComposable$lambda$2(this.$viewMode$delegate)), new GenericAction.Deeplink(new DeeplinkAction("")), null, 32, null), DisplayType2.toInstrumentDisplayType(WatchlistItemRowComposable3.WatchListItemComposable$lambda$2(this.$viewMode$delegate)), this.$curatedListState.getAccountNumber());
            } else {
                if (!(watchlistItemRow instanceof WatchlistItemRow.Position)) {
                    throw new NoWhenBranchMatchedException();
                }
                positionRow = new UnifiedInstrumentRow2.PositionRow(((WatchlistItemRow.Position) watchlistItemRow).getPosition(), WatchlistItemRowComposable3.toPositionViewMode(DisplayType2.toInstrumentDisplayType(WatchlistItemRowComposable3.WatchListItemComposable$lambda$2(this.$viewMode$delegate))), this.$index, null, 8, null);
            }
            String str = "Watchlist_" + this.$watchlist.getWatchlist().getId();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance3 = composer.changedInstance(this.$watchlistItem) | composer.changedInstance(this.$watchlist) | composer.changedInstance(this.$curatedListState) | composer.changedInstance(this.$instrumentClickHandler) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$performanceLogger);
            final WatchlistItemRow watchlistItemRow2 = this.$watchlistItem;
            final CuratedListDuxo7.WatchlistItem watchlistItem = this.$watchlist;
            final CuratedListState.Loaded loaded2 = this.$curatedListState;
            final ListInstrumentClickHandler listInstrumentClickHandler = this.$instrumentClickHandler;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final PerformanceLogger performanceLogger = this.$performanceLogger;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$6$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WatchlistItemRowComposable3.C394786.invoke$lambda$8$lambda$7(watchlistItemRow2, watchlistItem, loaded2, listInstrumentClickHandler, navigator, context, performanceLogger);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            final SnapshotState<Boolean> snapshotState = this.$displayDataBottomSheetExpanded$delegate;
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$6$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WatchlistItemRowComposable3.C394786.invoke$lambda$10$lambda$9(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            UnifiedInstrumentRow.UnifiedInstrumentRow(positionRow, function02, modifierAutoLogEvents$default, str, (Function0) objRememberedValue4, composer, 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(CuratedListState.Loaded loaded, EventLogger eventLogger, Screen screen) {
            loaded.getOnEquitySwipeTooltipShown().invoke();
            EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, "watchlist_swipe_to_trade_tooltip", null, 4, null), null, null, 25, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(CuratedListState.Loaded loaded, EventLogger eventLogger, Screen screen) {
            loaded.getOnEquitySwipeTooltipClick().invoke();
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, "watchlist_swipe_to_trade_tooltip", null, 4, null), null, null, false, 57, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(WatchlistItemRow watchlistItemRow, CuratedListDuxo7.WatchlistItem watchlistItem, CuratedListState.Loaded loaded, ListInstrumentClickHandler listInstrumentClickHandler, Navigator navigator, Context context, PerformanceLogger performanceLogger) {
            Tuples3 tuples3;
            if (watchlistItemRow instanceof WatchlistItemRow.Instrument) {
                CuratedListItem curatedListItem = ((WatchlistItemRow.Instrument) watchlistItemRow).getCuratedListItem();
                tuples3 = new Tuples3(curatedListItem.getId(), curatedListItem.getObjectType(), curatedListItem.getStrategyCode());
            } else if (watchlistItemRow instanceof WatchlistItemRow.OptionsInstrument) {
                CuratedListItem curatedListItem2 = ((WatchlistItemRow.OptionsInstrument) watchlistItemRow).getCuratedListItem();
                tuples3 = new Tuples3(curatedListItem2.getId(), curatedListItem2.getObjectType(), curatedListItem2.getStrategyCode());
            } else {
                if (!(watchlistItemRow instanceof WatchlistItemRow.Position)) {
                    throw new NoWhenBranchMatchedException();
                }
                PositionsV2.PositionListItemV2 position = ((WatchlistItemRow.Position) watchlistItemRow).getPosition();
                tuples3 = new Tuples3(position.getMetadataId(), WatchlistItemRowComposable3.toCuratedListObjectType(position.getInstrumentType()), null);
            }
            UUID uuid = (UUID) tuples3.component1();
            CuratedListObjectType curatedListObjectType = (CuratedListObjectType) tuples3.component2();
            String str = (String) tuples3.component3();
            java.util.List<WatchlistItemRow> watchlistItems = watchlistItem.getWatchlistItems();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (WatchlistItemRow watchlistItemRow2 : watchlistItems) {
                CuratedListObjectType itemType = watchlistItemRow2.getItemType();
                Object arrayList = linkedHashMap.get(itemType);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(itemType, arrayList);
                }
                ((java.util.List) arrayList).add(watchlistItemRow2.getId());
            }
            listInstrumentClickHandler.onClick(uuid, curatedListObjectType, navigator, context, performanceLogger, str, linkedHashMap, loaded.getAccountNumber());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(SnapshotState snapshotState) {
            WatchlistItemRowComposable3.WatchListItemComposable$lambda$5(snapshotState, true);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: WatchlistItemRowComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$8 */
    static final class C394798 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ CuratedListState.Loaded $curatedListState;
        final /* synthetic */ SnapshotState4<DisplayType> $viewMode$delegate;
        final /* synthetic */ CuratedListDuxo7.WatchlistItem $watchlist;
        final /* synthetic */ WatchlistItemRow $watchlistItem;

        /* JADX WARN: Multi-variable type inference failed */
        C394798(WatchlistItemRow watchlistItemRow, CuratedListState.Loaded loaded, CuratedListDuxo7.WatchlistItem watchlistItem, SnapshotState4<? extends DisplayType> snapshotState4) {
            this.$watchlistItem = watchlistItemRow;
            this.$curatedListState = loaded;
            this.$watchlist = watchlistItem;
            this.$viewMode$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5, CuratedListState.Loaded loaded, CuratedListDuxo7.WatchlistItem watchlistItem, DisplayType displayType) {
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            loaded.getUpdateWatchlistViewMode().invoke(watchlistItem.getId(), displayType);
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1206149934, i2, -1, "com.robinhood.shared.portfolio.lists.ui.watchlist.WatchListItemComposable.<anonymous> (WatchlistItemRowComposable.kt:326)");
            }
            boolean z = true;
            if (this.$watchlistItem.getItemType() == CuratedListObjectType.OPTION_STRATEGY) {
                composer.startReplaceGroup(-716190193);
                DisplayType displayTypeWatchListItemComposable$lambda$2 = WatchlistItemRowComposable3.WatchListItemComposable$lambda$2(this.$viewMode$delegate);
                ImmutableList3<DisplayType> optionsTypes = DisplayType.INSTANCE.getOptionsTypes();
                composer.startReplaceGroup(-1746271574);
                if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(RhModalBottomSheet))) {
                    z = false;
                }
                boolean zChangedInstance = composer.changedInstance(this.$curatedListState) | z | composer.changedInstance(this.$watchlist);
                final CuratedListState.Loaded loaded = this.$curatedListState;
                final CuratedListDuxo7.WatchlistItem watchlistItem = this.$watchlist;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$8$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WatchlistItemRowComposable3.C394798.invoke$lambda$1$lambda$0(RhModalBottomSheet, loaded, watchlistItem, (DisplayType) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                InstrumentDisplayTypeComposable.InstrumentDisplayTypeComposable(displayTypeWatchListItemComposable$lambda$2, optionsTypes, null, null, (Function1) objRememberedValue, composer, 0, 12);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-715770577);
                DisplayType displayTypeWatchListItemComposable$lambda$22 = WatchlistItemRowComposable3.WatchListItemComposable$lambda$2(this.$viewMode$delegate);
                ImmutableList3<DisplayType> defaultTypes = DisplayType.INSTANCE.getDefaultTypes();
                composer.startReplaceGroup(-1746271574);
                if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(RhModalBottomSheet))) {
                    z = false;
                }
                boolean zChangedInstance2 = composer.changedInstance(this.$curatedListState) | z | composer.changedInstance(this.$watchlist);
                final CuratedListState.Loaded loaded2 = this.$curatedListState;
                final CuratedListDuxo7.WatchlistItem watchlistItem2 = this.$watchlist;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.watchlist.WatchlistItemRowComposableKt$WatchListItemComposable$8$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WatchlistItemRowComposable3.C394798.invoke$lambda$3$lambda$2(RhModalBottomSheet, loaded2, watchlistItem2, (DisplayType) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                InstrumentDisplayTypeComposable.InstrumentDisplayTypeComposable(displayTypeWatchListItemComposable$lambda$22, defaultTypes, null, null, (Function1) objRememberedValue2, composer, 0, 12);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5, CuratedListState.Loaded loaded, CuratedListDuxo7.WatchlistItem watchlistItem, DisplayType displayType) {
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            loaded.getUpdateWatchlistViewMode().invoke(watchlistItem.getId(), displayType);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WatchListItemComposable$lambda$14$lambda$13(SnapshotState snapshotState) {
        WatchListItemComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final String assetUniqueIdentifier(WatchlistItemRow watchlistItemRow) {
        if (watchlistItemRow instanceof WatchlistItemRow.Instrument) {
            String string2 = ((WatchlistItemRow.Instrument) watchlistItemRow).getCuratedListItem().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
        if (watchlistItemRow instanceof WatchlistItemRow.OptionsInstrument) {
            String string3 = ((WatchlistItemRow.OptionsInstrument) watchlistItemRow).getCuratedListItem().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            return string3;
        }
        if (!(watchlistItemRow instanceof WatchlistItemRow.Position)) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = ((WatchlistItemRow.Position) watchlistItemRow).getPosition().getMetadataId().toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        return string4;
    }

    private static final PositionsInstrumentType positionInstrumentType(WatchlistItemRow watchlistItemRow) {
        if (watchlistItemRow instanceof WatchlistItemRow.Instrument) {
            return PositionsInstrumentType.EQUITY;
        }
        if (watchlistItemRow instanceof WatchlistItemRow.OptionsInstrument) {
            return PositionsInstrumentType.OPTIONS;
        }
        if (watchlistItemRow instanceof WatchlistItemRow.Position) {
            return PositionsInstrumentType.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final com.robinhood.rosetta.eventlogging.Context defaultWatchlistEventContext(WatchlistItemRow watchlistItemRow, String str) {
        BrokerageAccountContext brokerageAccountContext;
        Asset asset = new Asset(assetUniqueIdentifier(watchlistItemRow), null, null, null, 14, null);
        if (str != null) {
            brokerageAccountContext = new BrokerageAccountContext(null, str, null, null, false, false, null, null, null, null, 1021, null);
        } else {
            brokerageAccountContext = null;
        }
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, asset, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, brokerageAccountContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, positionInstrumentType(watchlistItemRow), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -257, -8193, -1, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logWatchlistSwipeStart(EventLogger eventLogger, Screen screen, WatchlistItemRow watchlistItemRow, String str) {
        EventLogger.DefaultImpls.logSwipe$default(eventLogger, UserInteractionEventData.Action.SWIPE_INITIATED, screen, new Component(Component.ComponentType.LIST_ASSET_ROW, null, null, 6, null), null, defaultWatchlistEventContext(watchlistItemRow, str), false, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logWatchlistSwipeCompleted(EventLogger eventLogger, Screen screen, WatchlistItemRow watchlistItemRow, String str) {
        EventLogger.DefaultImpls.logSwipe$default(eventLogger, UserInteractionEventData.Action.SWIPE_COMPLETED, screen, new Component(Component.ComponentType.LIST_ASSET_ROW, null, null, 6, null), null, defaultWatchlistEventContext(watchlistItemRow, str), false, 40, null);
    }

    public static final CuratedListObjectType toCuratedListObjectType(PositionInstrumentType positionInstrumentType) {
        Intrinsics.checkNotNullParameter(positionInstrumentType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[positionInstrumentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return CuratedListObjectType.INSTRUMENT;
            case 4:
            case 5:
                return CuratedListObjectType.CURRENCY_PAIR;
            case 6:
                return CuratedListObjectType.PERPETUALS_CONTRACT;
            case 7:
            case 8:
            case 9:
                return CuratedListObjectType.OPTION_STRATEGY;
            case 10:
            case 11:
                return CuratedListObjectType.FUTURES_CONTRACT;
            case 12:
            case 13:
            case 14:
            case 15:
                return CuratedListObjectType.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toPositionViewMode(InstrumentDisplayType instrumentDisplayType) {
        int i = WhenMappings.$EnumSwitchMapping$2[instrumentDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            return "last-price";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return PositionsDisplayOptions.PERCENT_CHANGE;
    }

    public static final WatchlistItemRowComposable getLocalListInstrumentClickHandler() {
        return LocalListInstrumentClickHandler;
    }
}
