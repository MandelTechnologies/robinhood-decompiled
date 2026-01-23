package com.robinhood.android.equities.eventupdates;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.paging.LoadState;
import androidx.paging.PagingData;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt;
import com.robinhood.arsenal.proto.p281v1.idl.EquityEventUpdateDto;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.equities.eventupdates.EquityEventUpdateRow;
import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.TemporalUnit;

/* compiled from: EquityEventUpdatesScreen.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aC\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u0014\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0018¨\u0006\u001d²\u0006\u000e\u0010\u0019\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/robinhood/arsenal/proto/v1/idl/EquityEventUpdateDto;", "pagingData", "Lkotlin/Function0;", "", "onBackClick", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/compose/ui/Modifier;", "modifier", "EquityEventUpdatesScreen", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lj$/time/Clock;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "itemCount", "Lkotlin/Function1;", "getItem", "j$/time/Instant", "recentCutoff", "startIndex", "binarySearchCutoff", "(ILkotlin/jvm/functions/Function1;Lj$/time/Instant;I)I", "Landroidx/paging/compose/LazyPagingItems;", "pagingItems", "(Landroidx/paging/compose/LazyPagingItems;Lj$/time/Instant;I)I", "cutoffIndex", "", "showRecentHeader", "lastCheckedCount", "feature-equity-event-updates_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityEventUpdatesScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityEventUpdatesScreen$lambda$12(Flow flow, Function0 function0, Clock clock, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityEventUpdatesScreen(flow, function0, clock, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityEventUpdatesScreen(final Flow<PagingData<EquityEventUpdateDto>> pagingData, final Function0<Unit> onBackClick, final Clock clock, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems;
        LazyListState lazyListStateRememberLazyListState;
        Object objRememberedValue;
        Composer.Companion companion;
        int i4;
        Instant instant;
        Object objRememberedValue2;
        SnapshotIntState2 snapshotIntState2;
        Object objRememberedValue3;
        SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue4;
        LazyListState lazyListState;
        SnapshotState snapshotState2;
        Object objRememberedValue5;
        SnapshotIntState2 snapshotIntState22;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pagingData, "pagingData");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Composer composerStartRestartGroup = composer.startRestartGroup(369500094);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pagingData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(clock) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(369500094, i3, -1, "com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreen (EquityEventUpdatesScreen.kt:52)");
                }
                lazyPagingItemsCollectAsLazyPagingItems = LazyPagingItems5.collectAsLazyPagingItems(pagingData, null, composerStartRestartGroup, i3 & 14, 1);
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    i4 = -1;
                    objRememberedValue = clock.instant().minus(30L, (TemporalUnit) ChronoUnit.DAYS);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i4 = -1;
                }
                instant = (Instant) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(i4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(lazyPagingItemsCollectAsLazyPagingItems.getItemCount() <= 0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(lazyPagingItemsCollectAsLazyPagingItems) | composerStartRestartGroup.changedInstance(instant) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1(lazyPagingItemsCollectAsLazyPagingItems, instant, lazyListStateRememberLazyListState, snapshotState, null);
                    lazyListState = lazyListStateRememberLazyListState;
                    snapshotState2 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    lazyListState = lazyListStateRememberLazyListState;
                    snapshotState2 = snapshotState;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotIntState22 = (SnapshotIntState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf2 = Boolean.valueOf(EquityEventUpdatesScreen$lambda$5(snapshotState2));
                Integer numValueOf = Integer.valueOf(lazyPagingItemsCollectAsLazyPagingItems.getItemCount());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(lazyPagingItemsCollectAsLazyPagingItems) | composerStartRestartGroup.changedInstance(instant);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                    EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1 equityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1 = new EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1(lazyPagingItemsCollectAsLazyPagingItems, instant, snapshotState2, snapshotIntState2, snapshotIntState22, null);
                    composerStartRestartGroup.updateRememberedValue(equityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1);
                    objRememberedValue6 = equityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, numValueOf, (Function2) objRememberedValue6, composerStartRestartGroup, 0);
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(773270138, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt.EquityEventUpdatesScreen.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(773270138, i6, -1, "com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreen.<anonymous> (EquityEventUpdatesScreen.kt:120)");
                        }
                        Function2<Composer, Integer, Unit> lambda$996735341$feature_equity_event_updates_externalDebug = ComposableSingletons$EquityEventUpdatesScreenKt.INSTANCE.getLambda$996735341$feature_equity_event_updates_externalDebug();
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$996735341$feature_equity_event_updates_externalDebug, null, ComposableLambda3.rememberComposableLambda(1590522265, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt.EquityEventUpdatesScreen.3.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1590522265, i7, -1, "com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreen.<anonymous>.<anonymous> (EquityEventUpdatesScreen.kt:122)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1587577777, true, new C147164(modifier3, lazyListState, lazyPagingItemsCollectAsLazyPagingItems, clock, snapshotState2, snapshotIntState2), composerStartRestartGroup, 54), composer2, 805306416, 509);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$12(pagingData, onBackClick, clock, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            lazyPagingItemsCollectAsLazyPagingItems = LazyPagingItems5.collectAsLazyPagingItems(pagingData, null, composerStartRestartGroup, i3 & 14, 1);
            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue != companion.getEmpty()) {
            }
            instant = (Instant) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf3 = Boolean.valueOf(lazyPagingItemsCollectAsLazyPagingItems.getItemCount() <= 0);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(lazyPagingItemsCollectAsLazyPagingItems) | composerStartRestartGroup.changedInstance(instant) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                objRememberedValue4 = new EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$1$1(lazyPagingItemsCollectAsLazyPagingItems, instant, lazyListStateRememberLazyListState, snapshotState, null);
                lazyListState = lazyListStateRememberLazyListState;
                snapshotState2 = snapshotState;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotIntState22 = (SnapshotIntState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf22 = Boolean.valueOf(EquityEventUpdatesScreen$lambda$5(snapshotState2));
                Integer numValueOf2 = Integer.valueOf(lazyPagingItemsCollectAsLazyPagingItems.getItemCount());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(lazyPagingItemsCollectAsLazyPagingItems) | composerStartRestartGroup.changedInstance(instant);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1 equityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$12 = new EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$1(lazyPagingItemsCollectAsLazyPagingItems, instant, snapshotState2, snapshotIntState2, snapshotIntState22, null);
                    composerStartRestartGroup.updateRememberedValue(equityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$12);
                    objRememberedValue6 = equityEventUpdatesScreenKt$EquityEventUpdatesScreen$2$12;
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf22, numValueOf2, (Function2) objRememberedValue6, composerStartRestartGroup, 0);
                    modifier3 = modifier4;
                    composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(773270138, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt.EquityEventUpdatesScreen.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(773270138, i6, -1, "com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreen.<anonymous> (EquityEventUpdatesScreen.kt:120)");
                            }
                            Function2<Composer, Integer, Unit> lambda$996735341$feature_equity_event_updates_externalDebug = ComposableSingletons$EquityEventUpdatesScreenKt.INSTANCE.getLambda$996735341$feature_equity_event_updates_externalDebug();
                            final Function0<Unit> function0 = onBackClick;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$996735341$feature_equity_event_updates_externalDebug, null, ComposableLambda3.rememberComposableLambda(1590522265, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt.EquityEventUpdatesScreen.3.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 6) == 0) {
                                        i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1590522265, i7, -1, "com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreen.<anonymous>.<anonymous> (EquityEventUpdatesScreen.kt:122)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1587577777, true, new C147164(modifier3, lazyListState, lazyPagingItemsCollectAsLazyPagingItems, clock, snapshotState2, snapshotIntState2), composerStartRestartGroup, 54), composer2, 805306416, 509);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EquityEventUpdatesScreen$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int EquityEventUpdatesScreen$lambda$2(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EquityEventUpdatesScreen$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: EquityEventUpdatesScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$4 */
    static final class C147164 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Clock $clock;
        final /* synthetic */ SnapshotIntState2 $cutoffIndex$delegate;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ LazyPagingItems<EquityEventUpdateDto> $pagingItems;
        final /* synthetic */ SnapshotState<Boolean> $showRecentHeader$delegate;

        C147164(Modifier modifier, LazyListState lazyListState, LazyPagingItems<EquityEventUpdateDto> lazyPagingItems, Clock clock, SnapshotState<Boolean> snapshotState, SnapshotIntState2 snapshotIntState2) {
            this.$modifier = modifier;
            this.$listState = lazyListState;
            this.$pagingItems = lazyPagingItems;
            this.$clock = clock;
            this.$showRecentHeader$delegate = snapshotState;
            this.$cutoffIndex$delegate = snapshotIntState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1587577777, i2, -1, "com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreen.<anonymous> (EquityEventUpdatesScreen.kt:126)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(this.$modifier, paddingValues), 0.0f, 1, null);
            LazyListState lazyListState = this.$listState;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$pagingItems) | composer.changedInstance(this.$clock);
            final LazyPagingItems<EquityEventUpdateDto> lazyPagingItems = this.$pagingItems;
            final SnapshotState<Boolean> snapshotState = this.$showRecentHeader$delegate;
            final SnapshotIntState2 snapshotIntState2 = this.$cutoffIndex$delegate;
            final Clock clock = this.$clock;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityEventUpdatesScreenKt.C147164.invoke$lambda$3$lambda$2(lazyPagingItems, snapshotState, snapshotIntState2, clock, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(final LazyPagingItems lazyPagingItems, SnapshotState snapshotState, final SnapshotIntState2 snapshotIntState2, final Clock clock, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            if ((lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.Loading) && lazyPagingItems.getItemCount() == 0) {
                LazyListScope.items$default(LazyColumn, 3, null, null, ComposableSingletons$EquityEventUpdatesScreenKt.INSTANCE.getLambda$1667838024$feature_equity_event_updates_externalDebug(), 6, null);
                return Unit.INSTANCE;
            }
            if (lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.Error) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1534804022, true, new EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$4$1$1$1(lazyPagingItems)), 3, null);
                return Unit.INSTANCE;
            }
            if (lazyPagingItems.getItemCount() != 0 || (lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.Loading)) {
                if (EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$5(snapshotState)) {
                    LazyListScope.item$default(LazyColumn, "header_recent", null, ComposableSingletons$EquityEventUpdatesScreenKt.INSTANCE.getLambda$469836791$feature_equity_event_updates_externalDebug(), 2, null);
                }
                LazyListScope.items$default(LazyColumn, EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$2(snapshotIntState2) > 0 ? EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$2(snapshotIntState2) : lazyPagingItems.getItemCount(), new Function1() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityEventUpdatesScreenKt.C147164.invoke$lambda$3$lambda$2$lambda$0(lazyPagingItems, ((Integer) obj).intValue());
                    }
                }, null, ComposableLambda3.composableLambdaInstance(2077617389, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$4$1$1$3
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                        Intrinsics.checkNotNullParameter(items, "$this$items");
                        if ((i2 & 48) == 0) {
                            i2 |= composer.changed(i) ? 32 : 16;
                        }
                        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2077617389, i2, -1, "com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EquityEventUpdatesScreen.kt:193)");
                        }
                        EquityEventUpdateDto equityEventUpdateDto = lazyPagingItems.get(i);
                        if (equityEventUpdateDto != null) {
                            ZoneId zone = clock.getZone();
                            Intrinsics.checkNotNullExpressionValue(zone, "getZone(...)");
                            EquityEventUpdateRow.EquityEventUpdateRow(equityEventUpdateDto, zone, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 4, null);
                if (EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$2(snapshotIntState2) > 0) {
                    LazyListScope.item$default(LazyColumn, "header_older", null, ComposableSingletons$EquityEventUpdatesScreenKt.INSTANCE.m13546getLambda$595130440$feature_equity_event_updates_externalDebug(), 2, null);
                }
                if (EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$2(snapshotIntState2) > 0) {
                    LazyListScope.items$default(LazyColumn, lazyPagingItems.getItemCount() - EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$2(snapshotIntState2), new Function1() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$4$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EquityEventUpdatesScreenKt.C147164.invoke$lambda$3$lambda$2$lambda$1(lazyPagingItems, snapshotIntState2, ((Integer) obj).intValue());
                        }
                    }, null, ComposableLambda3.composableLambdaInstance(1764482050, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$4$1$1$5
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                            Intrinsics.checkNotNullParameter(items, "$this$items");
                            if ((i2 & 48) == 0) {
                                i2 |= composer.changed(i) ? 32 : 16;
                            }
                            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1764482050, i2, -1, "com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EquityEventUpdatesScreen.kt:228)");
                            }
                            EquityEventUpdateDto equityEventUpdateDto = lazyPagingItems.get(EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$2(snapshotIntState2) + i);
                            if (equityEventUpdateDto != null) {
                                ZoneId zone = clock.getZone();
                                Intrinsics.checkNotNullExpressionValue(zone, "getZone(...)");
                                EquityEventUpdateRow.EquityEventUpdateRow(equityEventUpdateDto, zone, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 4, null);
                }
                if (lazyPagingItems.getLoadState().getAppend() instanceof LoadState.Loading) {
                    LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$EquityEventUpdatesScreenKt.INSTANCE.getLambda$1569902394$feature_equity_event_updates_externalDebug(), 3, null);
                }
                if (lazyPagingItems.getLoadState().getAppend() instanceof LoadState.Error) {
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(504935163, true, new EquityEventUpdatesScreenKt$EquityEventUpdatesScreen$4$1$1$6(lazyPagingItems)), 3, null);
                }
                return Unit.INSTANCE;
            }
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$EquityEventUpdatesScreenKt.INSTANCE.m13547getLambda$741041825$feature_equity_event_updates_externalDebug(), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$3$lambda$2$lambda$0(LazyPagingItems lazyPagingItems, int i) {
            String id;
            EquityEventUpdateDto equityEventUpdateDto = (EquityEventUpdateDto) lazyPagingItems.peek(i);
            if (equityEventUpdateDto != null && (id = equityEventUpdateDto.getId()) != null) {
                return id;
            }
            return "recent_" + i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$3$lambda$2$lambda$1(LazyPagingItems lazyPagingItems, SnapshotIntState2 snapshotIntState2, int i) {
            String id;
            int iEquityEventUpdatesScreen$lambda$2 = EquityEventUpdatesScreenKt.EquityEventUpdatesScreen$lambda$2(snapshotIntState2) + i;
            EquityEventUpdateDto equityEventUpdateDto = (EquityEventUpdateDto) lazyPagingItems.peek(iEquityEventUpdatesScreen$lambda$2);
            if (equityEventUpdateDto != null && (id = equityEventUpdateDto.getId()) != null) {
                return id;
            }
            return "older_" + iEquityEventUpdatesScreen$lambda$2;
        }
    }

    public static /* synthetic */ int binarySearchCutoff$default(int i, Function1 function1, Instant instant, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return binarySearchCutoff(i, function1, instant, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int binarySearchCutoff(int i, Function1<? super Integer, EquityEventUpdateDto> getItem, Instant recentCutoff, int i2) {
        String created_at;
        Instant instantM28550constructorimpl;
        Intrinsics.checkNotNullParameter(getItem, "getItem");
        Intrinsics.checkNotNullParameter(recentCutoff, "recentCutoff");
        int i3 = i - 1;
        int i4 = -1;
        while (i2 <= i3) {
            int i5 = (i2 + i3) / 2;
            EquityEventUpdateDto equityEventUpdateDtoInvoke = getItem.invoke(Integer.valueOf(i5));
            if (equityEventUpdateDtoInvoke != null && (created_at = equityEventUpdateDtoInvoke.getCreated_at()) != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    instantM28550constructorimpl = Result.m28550constructorimpl(Instant.parse(created_at));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    instantM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                instant = Result.m28555isFailureimpl(instantM28550constructorimpl) ? null : instantM28550constructorimpl;
            }
            if (instant == null) {
                i3 = i5 - 1;
            } else if (instant.isAfter(recentCutoff)) {
                i2 = i5 + 1;
            } else {
                i3 = i5 - 1;
                i4 = i5;
            }
        }
        return i4;
    }

    static /* synthetic */ int binarySearchCutoff$default(LazyPagingItems lazyPagingItems, Instant instant, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return binarySearchCutoff(lazyPagingItems, instant, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int binarySearchCutoff(final LazyPagingItems<EquityEventUpdateDto> lazyPagingItems, Instant instant, int i) {
        return binarySearchCutoff(lazyPagingItems.getItemCount(), new Function1() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityEventUpdatesScreenKt.binarySearchCutoff$lambda$15(lazyPagingItems, ((Integer) obj).intValue());
            }
        }, instant, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityEventUpdateDto binarySearchCutoff$lambda$15(LazyPagingItems lazyPagingItems, int i) {
        return (EquityEventUpdateDto) lazyPagingItems.peek(i);
    }
}
