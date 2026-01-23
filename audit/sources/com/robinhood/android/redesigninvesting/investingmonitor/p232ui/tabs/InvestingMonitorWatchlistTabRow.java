package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.tabs;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabPosition;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.TabRowKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.create.InvestingMonitorNewTabComposable3;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.tabs.InvestingMonitorWatchlistTabRow;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.p320db.CuratedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InvestingMonitorWatchlistTabRow.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0094\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"SelectableTabRow", "", "selectedTab", "", "tabTitles", "Lkotlinx/collections/immutable/ImmutableList;", "", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "onListCreated", "Lkotlin/Function1;", "Lcom/robinhood/models/db/CuratedList;", "Lkotlin/ParameterName;", "name", "curatedList", "onScreenerCreated", "Lcom/robinhood/equityscreener/models/db/Screener;", "screener", "onAssetPageActionsRequested", "pageIndex", "(ILkotlinx/collections/immutable/ImmutableList;Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-investing-monitor_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.tabs.InvestingMonitorWatchlistTabRowKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorWatchlistTabRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectableTabRow$lambda$0(int i, ImmutableList immutableList, PagerState pagerState, Function1 function1, Function1 function12, Function1 function13, int i2, Composer composer, int i3) {
        SelectableTabRow(i, immutableList, pagerState, function1, function12, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void SelectableTabRow(final int i, final ImmutableList<String> tabTitles, final PagerState pagerState, final Function1<? super CuratedList, Unit> onListCreated, final Function1<? super Screener, Unit> onScreenerCreated, final Function1<? super Integer, Unit> onAssetPageActionsRequested, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(tabTitles, "tabTitles");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(onListCreated, "onListCreated");
        Intrinsics.checkNotNullParameter(onScreenerCreated, "onScreenerCreated");
        Intrinsics.checkNotNullParameter(onAssetPageActionsRequested, "onAssetPageActionsRequested");
        Composer composerStartRestartGroup = composer.startRestartGroup(939871793);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(tabTitles) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(pagerState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onListCreated) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScreenerCreated) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAssetPageActionsRequested) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(939871793, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.tabs.SelectableTabRow (InvestingMonitorWatchlistTabRow.kt:37)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            TabRowKt.m5991ScrollableTabRowsKfQg0A(i, null, bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), ComposableLambda3.rememberComposableLambda(1796879121, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.tabs.InvestingMonitorWatchlistTabRowKt.SelectableTabRow.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                    invoke((List<TabPosition>) list, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(List<TabPosition> tabPositions, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1796879121, i5, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.tabs.SelectableTabRow.<anonymous> (InvestingMonitorWatchlistTabRow.kt:44)");
                    }
                    if (!tabPositions.isEmpty() && i < tabPositions.size()) {
                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                        tabRowDefaults.m5988SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), composer2, TabRowDefaults.$stable << 9, 2);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(397665553, true, new C266202(tabTitles, onListCreated, onScreenerCreated, pagerState, i, onAssetPageActionsRequested), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 12779520, 66);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.tabs.InvestingMonitorWatchlistTabRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorWatchlistTabRow.SelectableTabRow$lambda$0(i, tabTitles, pagerState, onListCreated, onScreenerCreated, onAssetPageActionsRequested, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InvestingMonitorWatchlistTabRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.tabs.InvestingMonitorWatchlistTabRowKt$SelectableTabRow$2 */
    static final class C266202 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<Integer, Unit> $onAssetPageActionsRequested;
        final /* synthetic */ Function1<CuratedList, Unit> $onListCreated;
        final /* synthetic */ Function1<Screener, Unit> $onScreenerCreated;
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ int $selectedTab;
        final /* synthetic */ ImmutableList<String> $tabTitles;

        /* JADX WARN: Multi-variable type inference failed */
        C266202(ImmutableList<String> immutableList, Function1<? super CuratedList, Unit> function1, Function1<? super Screener, Unit> function12, PagerState pagerState, int i, Function1<? super Integer, Unit> function13) {
            this.$tabTitles = immutableList;
            this.$onListCreated = function1;
            this.$onScreenerCreated = function12;
            this.$pagerState = pagerState;
            this.$selectedTab = i;
            this.$onAssetPageActionsRequested = function13;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(int i, int i2, CoroutineScope coroutineScope, PagerState pagerState) {
            if (i != i2) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new InvestingMonitorWatchlistTabRow3(pagerState, i, null), 3, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(397665553, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.tabs.SelectableTabRow.<anonymous> (InvestingMonitorWatchlistTabRow.kt:53)");
            }
            composer.startReplaceGroup(-95489565);
            ImmutableList<String> immutableList = this.$tabTitles;
            final PagerState pagerState = this.$pagerState;
            final int i2 = this.$selectedTab;
            Function1<Integer, Unit> function1 = this.$onAssetPageActionsRequested;
            int i3 = 0;
            final int i4 = 0;
            for (String str : immutableList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str2 = str;
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(pagerState) | composer.changed(i4) | composer.changed(i2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.tabs.InvestingMonitorWatchlistTabRowKt$SelectableTabRow$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorWatchlistTabRow.C266202.invoke$lambda$2$lambda$1$lambda$0(i4, i2, coroutineScope, pagerState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                boolean z = i2 == i4 ? 1 : i3;
                TabKt.m5981TabbogVsAg(z, function0, null, true, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1170121322, true, new InvestingMonitorWatchlistTabRow2(function1, i4, function0, str2, z), composer, 54), composer, 12585984, 116);
                i3 = i3;
                i4 = i5;
                function1 = function1;
                pagerState = pagerState;
            }
            int i6 = i3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(this.$onListCreated);
            final Function1<CuratedList, Unit> function12 = this.$onListCreated;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.tabs.InvestingMonitorWatchlistTabRowKt$SelectableTabRow$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestingMonitorWatchlistTabRow.C266202.invoke$lambda$4$lambda$3(function12, (CuratedList) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function13 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged3 = composer.changed(this.$onScreenerCreated);
            final Function1<Screener, Unit> function14 = this.$onScreenerCreated;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.tabs.InvestingMonitorWatchlistTabRowKt$SelectableTabRow$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestingMonitorWatchlistTabRow.C266202.invoke$lambda$6$lambda$5(function14, (Screener) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            InvestingMonitorNewTabComposable3.InvestingMonitorNewTabComposable(function13, (Function1) objRememberedValue4, composer, i6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(Function1 function1, CuratedList curatedList) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            function1.invoke(curatedList);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(Function1 function1, Screener screener) {
            Intrinsics.checkNotNullParameter(screener, "screener");
            function1.invoke(screener);
            return Unit.INSTANCE;
        }
    }
}
