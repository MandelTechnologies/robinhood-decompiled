package com.robinhood.android.portfolio.pnlhub.p216ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.models.p080db.PerformanceChartSpans;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.charts.span.ChartDisplaySpanExtensions;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailBottomSheetState;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposable2;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.portfolio.pnlhub.PnlHubDataState2;
import com.robinhood.android.portfolio.pnlhub.PnlHubTradeDetailSettings;
import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState;
import com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBar4;
import com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarState;
import com.robinhood.android.portfolio.pnlhub.p216ui.PnlHubComposable5;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;

/* compiled from: PnlHubComposable.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0093\u0003\u0010(\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\n2<\u0010\u001c\u001a8\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\n2<\u0010#\u001a8\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b(\u0010)\u001a\u000f\u0010*\u001a\u00020\bH\u0003¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\u00020\u0012*\u00020,H\u0000¢\u0006\u0004\b-\u0010.\u001a\u001b\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0019*\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b1\u00102\"\u0014\u00103\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00105\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u00104\"\u0014\u00106\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u00104¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState;", "viewState", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "Lkotlinx/coroutines/flow/Flow;", "", "refreshTradeItemsFlow", "Lkotlin/Function0;", "", "onBack", "Lkotlin/Function1;", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "onAssetClassSelected", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubBottomSheetState;", "onBottomSheetStateChange", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubTradeDetailSettings;", "onTradeDetailSettingsSave", "onTradeDetailSettingsBannerDismiss", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onSpanSelected", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "groupId", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "assetClasses", "onGroupToggled", "onShowAllButtonClicked", "onChartVisibilityChanged", "j$/time/Instant", "updateTradeItemsLastRefreshedTimestamp", "onDismissErrorDialog", "updateDebouncedLoadingSpinner", "onScroll", "onCryptoFilterTooltipAppear", "onCryptoFilterTooltipClick", "Landroidx/compose/ui/Modifier;", "modifier", "PnlHubComposable", "(Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState;Landroidx/compose/material3/SheetState;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "Loading", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/charts/models/db/SpanOption;", "toDisplaySpan", "(Lcom/robinhood/android/charts/models/db/SpanOption;)Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "Lcom/robinhood/compose/bento/component/Segment;", "toSegments", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;)Ljava/util/List;", "PNL_HUB_CHART_TEST_TAG", "Ljava/lang/String;", "PNL_HUB_LOADING_TEST_TAG", "PNL_HUB_SYMBOL_IDENTIFIER", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubComposable5 {
    public static final String PNL_HUB_CHART_TEST_TAG = "pnl_hub_chart";
    public static final String PNL_HUB_LOADING_TEST_TAG = "pnl_hub_loading";
    public static final String PNL_HUB_SYMBOL_IDENTIFIER = "symbol";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$4(int i, Composer composer, int i2) {
        Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubComposable$lambda$3(PnlHubViewState pnlHubViewState, SheetState sheetState, Flow flow, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function0 function02, Function1 function14, Function2 function2, Function0 function03, Function1 function15, Function1 function16, Function0 function04, Function1 function17, Function2 function22, Function0 function05, Function0 function06, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        PnlHubComposable(pnlHubViewState, sheetState, flow, function0, function1, function12, function13, function02, function14, function2, function03, function15, function16, function04, function17, function22, function05, function06, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlHubComposable(final PnlHubViewState viewState, final SheetState bottomSheetState, final Flow<Boolean> refreshTradeItemsFlow, final Function0<Unit> onBack, final Function1<? super PnlHubAssetClass, Unit> onAssetClassSelected, Function1<? super PnlHubDataState2, Unit> onBottomSheetStateChange, final Function1<? super PnlHubTradeDetailSettings, Unit> onTradeDetailSettingsSave, final Function0<Unit> onTradeDetailSettingsBannerDismiss, final Function1<? super DisplaySpan, Unit> onSpanSelected, final Function2<? super String, ? super List<? extends AssetClass>, Unit> onGroupToggled, final Function0<Unit> onShowAllButtonClicked, final Function1<? super Boolean, Unit> onChartVisibilityChanged, final Function1<? super Instant, Unit> updateTradeItemsLastRefreshedTimestamp, final Function0<Unit> onDismissErrorDialog, final Function1<? super Boolean, Unit> updateDebouncedLoadingSpinner, final Function2<? super String, ? super List<? extends AssetClass>, Unit> onScroll, final Function0<Unit> onCryptoFilterTooltipAppear, final Function0<Unit> onCryptoFilterTooltipClick, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer composer2;
        final Function1<? super PnlHubDataState2, Unit> function1;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(refreshTradeItemsFlow, "refreshTradeItemsFlow");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onAssetClassSelected, "onAssetClassSelected");
        Intrinsics.checkNotNullParameter(onBottomSheetStateChange, "onBottomSheetStateChange");
        Intrinsics.checkNotNullParameter(onTradeDetailSettingsSave, "onTradeDetailSettingsSave");
        Intrinsics.checkNotNullParameter(onTradeDetailSettingsBannerDismiss, "onTradeDetailSettingsBannerDismiss");
        Intrinsics.checkNotNullParameter(onSpanSelected, "onSpanSelected");
        Intrinsics.checkNotNullParameter(onGroupToggled, "onGroupToggled");
        Intrinsics.checkNotNullParameter(onShowAllButtonClicked, "onShowAllButtonClicked");
        Intrinsics.checkNotNullParameter(onChartVisibilityChanged, "onChartVisibilityChanged");
        Intrinsics.checkNotNullParameter(updateTradeItemsLastRefreshedTimestamp, "updateTradeItemsLastRefreshedTimestamp");
        Intrinsics.checkNotNullParameter(onDismissErrorDialog, "onDismissErrorDialog");
        Intrinsics.checkNotNullParameter(updateDebouncedLoadingSpinner, "updateDebouncedLoadingSpinner");
        Intrinsics.checkNotNullParameter(onScroll, "onScroll");
        Intrinsics.checkNotNullParameter(onCryptoFilterTooltipAppear, "onCryptoFilterTooltipAppear");
        Intrinsics.checkNotNullParameter(onCryptoFilterTooltipClick, "onCryptoFilterTooltipClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1029202956);
        if ((i3 & 1) != 0) {
            i4 = i;
            i5 = i4 | 6;
        } else {
            i4 = i;
            if ((i4 & 6) == 0) {
                i5 = i4 | ((i4 & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2);
            } else {
                i5 = i4;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i4 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(bottomSheetState) ? 32 : 16;
        }
        int i14 = i5;
        if ((i3 & 4) != 0) {
            i6 = i14 | 384;
        } else if ((i4 & 384) == 0) {
            i6 = i14 | (composerStartRestartGroup.changedInstance(refreshTradeItemsFlow) ? 256 : 128);
        } else {
            i6 = i14;
        }
        if ((i3 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onBack) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i6 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onAssetClassSelected) ? 16384 : 8192;
        }
        int i15 = i6;
        if ((i3 & 32) != 0) {
            i7 = i15 | 196608;
        } else if ((i4 & 196608) == 0) {
            i7 = i15 | (composerStartRestartGroup.changedInstance(onBottomSheetStateChange) ? 131072 : 65536);
        } else {
            i7 = i15;
        }
        if ((i3 & 64) != 0) {
            i7 |= 1572864;
        } else if ((i4 & 1572864) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onTradeDetailSettingsSave) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i7 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onTradeDetailSettingsBannerDismiss) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i7 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onSpanSelected) ? 67108864 : 33554432;
        }
        if ((i3 & 512) == 0) {
            i13 = (805306368 & i4) == 0 ? composerStartRestartGroup.changedInstance(onGroupToggled) ? 536870912 : 268435456 : 805306368;
            i8 = i7;
            if ((i3 & 1024) == 0) {
                i9 = i2;
                i10 = i9 | 6;
            } else {
                i9 = i2;
                if ((i9 & 6) == 0) {
                    i10 = i9 | (composerStartRestartGroup.changedInstance(onShowAllButtonClicked) ? 4 : 2);
                } else {
                    i10 = i9;
                }
            }
            if ((i3 & 2048) == 0) {
                i10 |= 48;
            } else if ((i9 & 48) == 0) {
                i10 |= composerStartRestartGroup.changedInstance(onChartVisibilityChanged) ? 32 : 16;
            }
            int i16 = i10;
            if ((i3 & 4096) == 0) {
                i16 |= 384;
            } else if ((i9 & 384) == 0) {
                i16 |= composerStartRestartGroup.changedInstance(updateTradeItemsLastRefreshedTimestamp) ? 256 : 128;
            }
            if ((i3 & 8192) == 0) {
                i16 |= 3072;
            } else {
                if ((i9 & 3072) == 0) {
                    i16 |= composerStartRestartGroup.changedInstance(onDismissErrorDialog) ? 2048 : 1024;
                }
                if ((i3 & 16384) != 0) {
                    i16 |= 24576;
                } else {
                    if ((i9 & 24576) == 0) {
                        i16 |= composerStartRestartGroup.changedInstance(updateDebouncedLoadingSpinner) ? 16384 : 8192;
                    }
                    if ((i3 & 32768) != 0) {
                        if ((i9 & 196608) == 0) {
                            i11 = i16 | (composerStartRestartGroup.changedInstance(onScroll) ? 131072 : 65536);
                        }
                        if ((i3 & 65536) != 0) {
                            i11 |= 1572864;
                        } else if ((i9 & 1572864) == 0) {
                            i11 |= composerStartRestartGroup.changedInstance(onCryptoFilterTooltipAppear) ? 1048576 : 524288;
                        }
                        if ((i3 & 131072) != 0) {
                            i11 |= 12582912;
                        } else if ((i9 & 12582912) == 0) {
                            i11 |= composerStartRestartGroup.changedInstance(onCryptoFilterTooltipClick) ? 8388608 : 4194304;
                        }
                        i12 = i3 & 262144;
                        if (i12 != 0) {
                            i11 |= 100663296;
                        } else if ((i9 & 100663296) == 0) {
                            i11 |= composerStartRestartGroup.changed(modifier) ? 67108864 : 33554432;
                        }
                        int i17 = i11;
                        if ((i8 & 306783379) != 306783378 || (38347923 & i17) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i12 == 0 ? Modifier.INSTANCE : modifier;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1029202956, i8, i17, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposable (PnlHubComposable.kt:87)");
                            }
                            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            if (!(viewState instanceof PnlHubViewState.Ready)) {
                                composerStartRestartGroup.startReplaceGroup(-784548189);
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, userInteractionEventDescriptor, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                modifier2 = modifier4;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i18 = BentoTheme.$stable;
                                composer2 = composerStartRestartGroup;
                                function1 = onBottomSheetStateChange;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierAutoLogEvents$default, ComposableLambda3.rememberComposableLambda(-1482574997, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt.PnlHubComposable.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i19) {
                                        if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1482574997, i19, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposable.<anonymous> (PnlHubComposable.kt:102)");
                                        }
                                        PnlHubTopAppBar4.PnlHubTopAppBar(new PnlHubTopAppBarState(extensions2.toPersistentList(((PnlHubViewState.Ready) viewState).getAvailableAssetClasses()), ((PnlHubViewState.Ready) viewState).getSelectedAssetClass(), ((PnlHubViewState.Ready) viewState).getOptionsSupported(), ((PnlHubViewState.Ready) viewState).getPnlUpdatesEnabled(), ((PnlHubViewState.Ready) viewState).getLocality(), ((PnlHubViewState.Ready) viewState).getShowCryptoFilterTooltip(), ((PnlHubViewState.Ready) viewState).isCryptoPnlHubEnabled()), onBack, onAssetClassSelected, onCryptoFilterTooltipAppear, onCryptoFilterTooltipClick, null, null, composer3, 0, 96);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i18).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i18).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1267664074, true, new C257992(viewState, refreshTradeItemsFlow, updateTradeItemsLastRefreshedTimestamp, current, userInteractionEventDescriptor, onSpanSelected, onBottomSheetStateChange, lazyListStateRememberLazyListState, onChartVisibilityChanged, onShowAllButtonClicked, updateDebouncedLoadingSpinner, onGroupToggled, onDismissErrorDialog), composer2, 54), composer2, 805306416, 316);
                                composer2.startReplaceGroup(1221895830);
                                PnlHubViewState.Ready ready = (PnlHubViewState.Ready) viewState;
                                if (!Intrinsics.areEqual(ready.getBottomSheetState(), PnlHubDataState2.Hidden.INSTANCE)) {
                                    composer2.startReplaceGroup(5004770);
                                    boolean z = (i8 & 458752) == 131072;
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (z || objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return PnlHubComposable5.PnlHubComposable$lambda$1$lambda$0(function1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceGroup();
                                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, bottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(986068443, true, new C258004(viewState, onTradeDetailSettingsSave, onTradeDetailSettingsBannerDismiss), composer2, 54), composer2, ((i8 << 6) & 7168) | 1572864, 54);
                                }
                                composer2.endReplaceGroup();
                                ProfitAndLossTradeListState tradeListState = ready.getTradeListState();
                                composer2.startReplaceGroup(-1224400529);
                                boolean zChangedInstance = composer2.changedInstance(coroutineScope) | ((i8 & 14) == 4 || ((i8 & 8) != 0 && composer2.changedInstance(viewState))) | composer2.changed(lazyListStateRememberLazyListState) | ((i17 & 458752) == 131072);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                    PnlHubComposable8 pnlHubComposable8 = new PnlHubComposable8(viewState, coroutineScope, lazyListStateRememberLazyListState, onScroll, null);
                                    composer2.updateRememberedValue(pnlHubComposable8);
                                    objRememberedValue3 = pnlHubComposable8;
                                }
                                composer2.endReplaceGroup();
                                EffectsKt.LaunchedEffect(tradeListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2 = composerStartRestartGroup;
                                function1 = onBottomSheetStateChange;
                                modifier2 = modifier4;
                                composer2.startReplaceGroup(-771053827);
                                Loading(composer2, 0);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            composer2 = composerStartRestartGroup;
                            function1 = onBottomSheetStateChange;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Function1<? super PnlHubDataState2, Unit> function12 = function1;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PnlHubComposable5.PnlHubComposable$lambda$3(viewState, bottomSheetState, refreshTradeItemsFlow, onBack, onAssetClassSelected, function12, onTradeDetailSettingsSave, onTradeDetailSettingsBannerDismiss, onSpanSelected, onGroupToggled, onShowAllButtonClicked, onChartVisibilityChanged, updateTradeItemsLastRefreshedTimestamp, onDismissErrorDialog, updateDebouncedLoadingSpinner, onScroll, onCryptoFilterTooltipAppear, onCryptoFilterTooltipClick, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i16 |= 196608;
                    i11 = i16;
                    if ((i3 & 65536) != 0) {
                    }
                    if ((i3 & 131072) != 0) {
                    }
                    i12 = i3 & 262144;
                    if (i12 != 0) {
                    }
                    int i172 = i11;
                    if ((i8 & 306783379) != 306783378) {
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        if (!(viewState instanceof PnlHubViewState.Ready)) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 32768) != 0) {
                }
                i11 = i16;
                if ((i3 & 65536) != 0) {
                }
                if ((i3 & 131072) != 0) {
                }
                i12 = i3 & 262144;
                if (i12 != 0) {
                }
                int i1722 = i11;
                if ((i8 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 16384) != 0) {
            }
            if ((i3 & 32768) != 0) {
            }
            i11 = i16;
            if ((i3 & 65536) != 0) {
            }
            if ((i3 & 131072) != 0) {
            }
            i12 = i3 & 262144;
            if (i12 != 0) {
            }
            int i17222 = i11;
            if ((i8 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 |= i13;
        i8 = i7;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i162 = i10;
        if ((i3 & 4096) == 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((i3 & 32768) != 0) {
        }
        i11 = i162;
        if ((i3 & 65536) != 0) {
        }
        if ((i3 & 131072) != 0) {
        }
        i12 = i3 & 262144;
        if (i12 != 0) {
        }
        int i172222 = i11;
        if ((i8 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: PnlHubComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$2 */
    static final class C257992 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ Function1<PnlHubDataState2, Unit> $onBottomSheetStateChange;
        final /* synthetic */ Function1<Boolean, Unit> $onChartVisibilityChanged;
        final /* synthetic */ Function0<Unit> $onDismissErrorDialog;
        final /* synthetic */ Function2<String, List<? extends AssetClass>, Unit> $onGroupToggled;
        final /* synthetic */ Function0<Unit> $onShowAllButtonClicked;
        final /* synthetic */ Function1<DisplaySpan, Unit> $onSpanSelected;
        final /* synthetic */ Flow<Boolean> $refreshTradeItemsFlow;
        final /* synthetic */ Function1<Boolean, Unit> $updateDebouncedLoadingSpinner;
        final /* synthetic */ Function1<Instant, Unit> $updateTradeItemsLastRefreshedTimestamp;
        final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventDescriptor;
        final /* synthetic */ PnlHubViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C257992(PnlHubViewState pnlHubViewState, Flow<Boolean> flow, Function1<? super Instant, Unit> function1, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1<? super DisplaySpan, Unit> function12, Function1<? super PnlHubDataState2, Unit> function13, LazyListState lazyListState, Function1<? super Boolean, Unit> function14, Function0<Unit> function0, Function1<? super Boolean, Unit> function15, Function2<? super String, ? super List<? extends AssetClass>, Unit> function2, Function0<Unit> function02) {
            this.$viewState = pnlHubViewState;
            this.$refreshTradeItemsFlow = flow;
            this.$updateTradeItemsLastRefreshedTimestamp = function1;
            this.$eventLogger = eventLogger;
            this.$userInteractionEventDescriptor = userInteractionEventDescriptor;
            this.$onSpanSelected = function12;
            this.$onBottomSheetStateChange = function13;
            this.$listState = lazyListState;
            this.$onChartVisibilityChanged = function14;
            this.$onShowAllButtonClicked = function0;
            this.$updateDebouncedLoadingSpinner = function15;
            this.$onGroupToggled = function2;
            this.$onDismissErrorDialog = function02;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$3$lambda$2(PnlHubViewState pnlHubViewState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1 function1, int i) {
            PerformanceChartSpans spans;
            List<SpanOption> availableSpans;
            SpanOption spanOption;
            ProfitAndLossChart chartData = ((PnlHubViewState.Ready) pnlHubViewState).getChartData();
            if (chartData != null && (spans = chartData.getSpans()) != null && (availableSpans = spans.getAvailableSpans()) != null && (spanOption = (SpanOption) CollectionsKt.getOrNull(availableSpans, i)) != null) {
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.SPAN_SELECTOR, spanOption.getDisplayValue(), null, 4, null), null, null, false, 57, null);
                function1.invoke(PnlHubComposable5.toDisplaySpan(spanOption));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$5$lambda$4(Function1 function1) {
            function1.invoke(PnlHubDataState2.TradeDetailSettings.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$7$lambda$6(PnlHubViewState pnlHubViewState, LazyPagingItems lazyPagingItems, boolean z, boolean z2, Function1 function1, Function0 function0, Function1 function12, Function2 function2, Function1 function13, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1140846832, true, new PnlHubComposable6(pnlHubViewState, function13, function1)), 3, null);
            PnlHubViewState.Ready ready = (PnlHubViewState.Ready) pnlHubViewState;
            ProfitAndLossTradeListState tradeListState = ready.getTradeListState();
            if (tradeListState instanceof ProfitAndLossTradeListState.Flattened) {
                PnlHubListComposable.profitAndLossTradeFlattenedList(LazyColumn, lazyPagingItems, z, !z2, ready.getTradeListDisclosureState(), ((ProfitAndLossTradeListState.Flattened) ready.getTradeListState()).getShowDebouncedLoadingSpinner(), function1, function0, function12);
            } else if (tradeListState instanceof ProfitAndLossTradeListState.Grouped) {
                PnlHubListComposable.profitAndLossTradeGroupedList(LazyColumn, ((ProfitAndLossTradeListState.Grouped) ready.getTradeListState()).getTradeGroups(), lazyPagingItems, ((ProfitAndLossTradeListState.Grouped) ready.getTradeListState()).getExpandedGroupId(), z, !z2, ready.getTradeListDisclosureState(), ((ProfitAndLossTradeListState.Grouped) ready.getTradeListState()).getShowDebouncedLoadingSpinner(), function2, function1, function0, function12);
            } else if (tradeListState != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$8(Function0 function0, LazyPagingItems lazyPagingItems) {
            function0.invoke();
            lazyPagingItems.retry();
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Modifier modifier;
            int i3;
            final boolean z;
            final LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItems;
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
                ComposerKt.traceEventStart(-1267664074, i2, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposable.<anonymous> (PnlHubComposable.kt:119)");
            }
            if (((PnlHubViewState.Ready) this.$viewState).getSelectedAssetHasData()) {
                composer.startReplaceGroup(667304284);
                ProfitAndLossTradeListState tradeListState = ((PnlHubViewState.Ready) this.$viewState).getTradeListState();
                composer.startReplaceGroup(1545544368);
                LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItemsM2377xf8a654dc = tradeListState == null ? null : tradeListState.m2377xf8a654dc(composer, 0);
                composer.endReplaceGroup();
                PnlHubViewState.Ready ready = (PnlHubViewState.Ready) this.$viewState;
                int i4 = LazyPagingItems.$stable;
                final boolean zIsShowAllButtonVisible = PnlHubListComposable.isShowAllButtonVisible(ready, lazyPagingItemsM2377xf8a654dc, composer, i4 << 3);
                boolean zShouldShowEmptyState = PnlHubListComposable.shouldShowEmptyState(((PnlHubViewState.Ready) this.$viewState).getTradeListState(), lazyPagingItemsM2377xf8a654dc, composer, i4 << 3);
                PnlHubListComposable.RefreshTradeItemsEffect(lazyPagingItemsM2377xf8a654dc, this.$refreshTradeItemsFlow, this.$updateTradeItemsLastRefreshedTimestamp, composer, i4);
                List<Segment> segments = PnlHubComposable5.toSegments(((PnlHubViewState.Ready) this.$viewState).getChartData());
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                final PnlHubViewState pnlHubViewState = this.$viewState;
                final EventLogger eventLogger = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$userInteractionEventDescriptor;
                final Function1<DisplaySpan, Unit> function1 = this.$onSpanSelected;
                final Function1<PnlHubDataState2, Unit> function12 = this.$onBottomSheetStateChange;
                LazyListState lazyListState = this.$listState;
                final Function1<Boolean, Unit> function13 = this.$onChartVisibilityChanged;
                final Function0<Unit> function0 = this.$onShowAllButtonClicked;
                final Function1<Boolean, Unit> function14 = this.$updateDebouncedLoadingSpinner;
                final Function2<String, List<? extends AssetClass>, Unit> function2 = this.$onGroupToggled;
                final Function0<Unit> function02 = this.$onDismissErrorDialog;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                BentoBaseRowLayout8 bentoBaseRowLayout8 = BentoBaseRowLayout8.INSTANCE;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoBaseRowLayout8.m21050getPaddingHorizontalD9Ej5fM(), bentoBaseRowLayout8.m21051getPaddingVerticalD9Ej5fM());
                ImmutableList3 persistentList = extensions2.toPersistentList(segments);
                composer.startReplaceGroup(-1996396510);
                Iterator<Segment> it = segments.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        modifier = modifierM5143paddingVpY3zN4;
                        i3 = -1;
                        break;
                    }
                    modifier = modifierM5143paddingVpY3zN4;
                    if (Intrinsics.areEqual(it.next().getText(), StringResources_androidKt.stringResource(ChartDisplaySpanExtensions.getStringRes(((PnlHubViewState.Ready) pnlHubViewState).getChartSpan()), composer, 0))) {
                        i3 = i5;
                        break;
                    } else {
                        i5++;
                        modifierM5143paddingVpY3zN4 = modifier;
                    }
                }
                composer.endReplaceGroup();
                BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CONTROLS_16);
                PnlHubViewState.Ready ready2 = (PnlHubViewState.Ready) pnlHubViewState;
                boolean z2 = ready2.getChartData() == null;
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(pnlHubViewState) | composer.changedInstance(eventLogger) | composer.changedInstance(userInteractionEventDescriptor) | composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PnlHubComposable5.C257992.invoke$lambda$10$lambda$3$lambda$2(pnlHubViewState, eventLogger, userInteractionEventDescriptor, function1, ((Integer) obj).intValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function15 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(function12);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlHubComposable5.C257992.invoke$lambda$10$lambda$5$lambda$4(function12);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                PnlSegmentedControl.PnlSegmentedControlWithTrailingIcon(persistentList, i3, function15, size16, (Function0) objRememberedValue2, modifier, z2, composer, Segment.$stable | (BentoIcon4.Size16.$stable << 9), 0);
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composer.changedInstance(pnlHubViewState) | composer.changed(function13) | composer.changed(function12) | composer.changedInstance(lazyPagingItemsM2377xf8a654dc) | composer.changed(zIsShowAllButtonVisible) | composer.changed(zShouldShowEmptyState) | composer.changed(function0) | composer.changed(function14) | composer.changed(function2);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    z = zShouldShowEmptyState;
                    final LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItems2 = lazyPagingItemsM2377xf8a654dc;
                    Object obj = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PnlHubComposable5.C257992.invoke$lambda$10$lambda$7$lambda$6(pnlHubViewState, lazyPagingItems2, zIsShowAllButtonVisible, z, function12, function0, function14, function2, function13, (LazyListScope) obj2);
                        }
                    };
                    lazyPagingItems = lazyPagingItems2;
                    composer.updateRememberedValue(obj);
                    objRememberedValue3 = obj;
                } else {
                    z = zShouldShowEmptyState;
                    lazyPagingItems = lazyPagingItemsM2377xf8a654dc;
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(null, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue3, composer, 0, 509);
                Composer composer2 = composer;
                composer2.startReplaceGroup(-1996253524);
                if (ready2.getShowErrorDialog() && lazyPagingItems != null && ((lazyPagingItems.getLoadState().getRefresh() instanceof LoadState.Error) || (lazyPagingItems.getLoadState().getAppend() instanceof LoadState.Error))) {
                    String strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_list_error_dialog_title, composer2, 0);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C25819R.string.pnl_hub_list_error_dialog_body, composer2, 0));
                    String strStringResource2 = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_list_error_dialog_primary_button, composer2, 0);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer2.changed(function02) | composer2.changedInstance(lazyPagingItems);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$2$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PnlHubComposable5.C257992.invoke$lambda$10$lambda$9$lambda$8(function02, lazyPagingItems);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, new BentoAlertButton(strStringResource2, (Function0) objRememberedValue4), null, null, null, false, null, function02, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1996217791);
                if (z) {
                    PnlHubTradeItemEmptyState.PnlHubTradeItemEmptyState(ready2.getChartSpan(), composer2, 0);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer.startReplaceGroup(674525982);
                PnlHubAssetClassNoData.PnlHubAssetClassNoData(((PnlHubViewState.Ready) this.$viewState).getPnlUpdatesEnabled(), composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubComposable$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(PnlHubDataState2.Hidden.INSTANCE);
        return Unit.INSTANCE;
    }

    /* compiled from: PnlHubComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$4 */
    static final class C258004 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onTradeDetailSettingsBannerDismiss;
        final /* synthetic */ Function1<PnlHubTradeDetailSettings, Unit> $onTradeDetailSettingsSave;
        final /* synthetic */ PnlHubViewState $viewState;

        /* compiled from: PnlHubComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$4$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProfitAndLossOrderDetails.Instrument.Type.values().length];
                try {
                    iArr[ProfitAndLossOrderDetails.Instrument.Type.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProfitAndLossOrderDetails.Instrument.Type.INDEX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProfitAndLossOrderDetails.Instrument.Type.CRYPTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C258004(PnlHubViewState pnlHubViewState, Function1<? super PnlHubTradeDetailSettings, Unit> function1, Function0<Unit> function0) {
            this.$viewState = pnlHubViewState;
            this.$onTradeDetailSettingsSave = function1;
            this.$onTradeDetailSettingsBannerDismiss = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
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
                ComposerKt.traceEventStart(986068443, i2, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposable.<anonymous> (PnlHubComposable.kt:257)");
            }
            final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            PnlHubDataState2 bottomSheetState = ((PnlHubViewState.Ready) this.$viewState).getBottomSheetState();
            boolean z = true;
            if (bottomSheetState instanceof PnlHubDataState2.Hidden) {
                composer.startReplaceGroup(-1611100024);
                composer.endReplaceGroup();
                RhModalBottomSheet5.hideBottomSheet$default(RhModalBottomSheet, null, 1, null);
            } else if (bottomSheetState instanceof PnlHubDataState2.TradeDetailSettings) {
                composer.startReplaceGroup(-1610895517);
                RhModalBottomSheet5.showBottomSheet$default(RhModalBottomSheet, null, 1, null);
                PnlHubTradeDetailSettingsBottomSheet.PnlHubTradeDetailSettingsBottomSheet((PnlHubViewState.Ready) this.$viewState, this.$onTradeDetailSettingsSave, this.$onTradeDetailSettingsBannerDismiss, composer, 0);
                composer.endReplaceGroup();
            } else if (bottomSheetState instanceof PnlHubDataState2.TradeDetail) {
                composer.startReplaceGroup(-1610381785);
                RhModalBottomSheet5.showBottomSheet$default(RhModalBottomSheet, null, 1, null);
                PnlTradeDetailBottomSheetState pnlTradeDetailBottomSheetState = new PnlTradeDetailBottomSheetState(((PnlHubDataState2.TradeDetail) ((PnlHubViewState.Ready) this.$viewState).getBottomSheetState()).getItem(), ((PnlHubViewState.Ready) this.$viewState).getCryptoCostBasisEnabled(), ((PnlHubViewState.Ready) this.$viewState).getPnlUpdatesEnabled());
                composer.startReplaceGroup(5004770);
                if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(RhModalBottomSheet))) {
                    z = false;
                }
                Object objRememberedValue = composer.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlHubComposable5.C258004.invoke$lambda$1$lambda$0(RhModalBottomSheet);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(navigator) | composer.changedInstance(context);
                final PnlHubViewState pnlHubViewState = this.$viewState;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$4$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlHubComposable5.C258004.invoke$lambda$3$lambda$2(pnlHubViewState, navigator, context);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                PnlTradeDetailComposable2.PnlTradeDetailBottomSheet(pnlTradeDetailBottomSheetState, function0, null, (Function0) objRememberedValue2, null, composer, PnlTradeDetailBottomSheetState.$stable, 20);
                composer.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(bottomSheetState, PnlHubDataState2.DataAvailability.INSTANCE)) {
                    composer.startReplaceGroup(-1575990971);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1607876427);
                RhModalBottomSheet5.showBottomSheet$default(RhModalBottomSheet, null, 1, null);
                Boolean bool = Boolean.TRUE;
                final PnlHubViewState pnlHubViewState2 = this.$viewState;
                BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(1353257970, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt.PnlHubComposable.4.3
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
                            ComposerKt.traceEventStart(1353257970, i3, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposable.<anonymous>.<anonymous> (PnlHubComposable.kt:323)");
                        }
                        boolean optionsSupported = ((PnlHubViewState.Ready) pnlHubViewState2).getOptionsSupported();
                        RhModalBottomSheet5 rhModalBottomSheet5 = RhModalBottomSheet;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(rhModalBottomSheet5);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new PnlHubComposable7(rhModalBottomSheet5);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        PnlHubChartDataAvailabilityBottomSheet.PnlHubChartDataAvailabilityBottomSheet(optionsSupported, (Function0) objRememberedValue3, null, composer2, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(PnlHubViewState pnlHubViewState, Navigator navigator, Context context) {
            PnlHubViewState.Ready ready = (PnlHubViewState.Ready) pnlHubViewState;
            ProfitAndLossOrderDetails orderDetails = ((PnlHubDataState2.TradeDetail) ready.getBottomSheetState()).getItem().getOrderDetails();
            ProfitAndLossOrderDetails.Instrument instrumentToView = orderDetails != null ? orderDetails.getInstrumentToView() : null;
            ProfitAndLossOrderDetails.Instrument.Type type2 = instrumentToView != null ? instrumentToView.getType() : null;
            int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(instrumentToView.getId(), null, ready.getAccountNumber(), InstrumentDetailSource.ASSET_HOME, false, 18, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                } else if (i == 2) {
                    Navigator.DefaultImpls.showFragment$default(navigator, context, new IndexDetailPageFragmentKey(instrumentToView.getId(), ready.getAccountNumber(), IndexDetailPageFragmentKey2.ProfitLossHub.INSTANCE), false, false, false, null, false, null, false, false, null, null, 4092, null);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoDetailFragmentKey(instrumentToView.getId(), null, false, null, null, null, 62, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final void Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1575964797);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1575964797, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.Loading (PnlHubComposable.kt:357)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(Modifier.INSTANCE, PNL_HUB_LOADING_TEST_TAG), null, PnlHubComposable.INSTANCE.m17697getLambda$1754267411$feature_profit_and_loss_hub_externalDebug(), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlHubComposable5.Loading$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final DisplaySpan toDisplaySpan(SpanOption spanOption) {
        Intrinsics.checkNotNullParameter(spanOption, "<this>");
        String queryValue = spanOption.getQueryValue();
        switch (queryValue.hashCode()) {
            case 107876:
                if (queryValue.equals(AnalyticsStrings.MAX_WELCOME_TAG)) {
                    return DisplaySpan.ALL;
                }
                break;
            case 119977:
                if (queryValue.equals("ytd")) {
                    return DisplaySpan.YTD;
                }
                break;
            case 3645428:
                if (queryValue.equals("week")) {
                    return DisplaySpan.WEEK;
                }
                break;
            case 104080000:
                if (queryValue.equals(ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS)) {
                    return DisplaySpan.MONTH;
                }
                break;
            case 1564166701:
                if (queryValue.equals("3month")) {
                    return DisplaySpan.f93673MONTH;
                }
                break;
        }
        return DisplaySpan.UNKNOWN;
    }

    public static final List<Segment> toSegments(ProfitAndLossChart profitAndLossChart) {
        PerformanceChartSpans spans;
        List<SpanOption> availableSpans;
        if (profitAndLossChart == null || (spans = profitAndLossChart.getSpans()) == null || (availableSpans = spans.getAvailableSpans()) == null) {
            return CollectionsKt.emptyList();
        }
        List<SpanOption> list = availableSpans;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Segment(null, ((SpanOption) it.next()).getDisplayValue(), null, 5, null));
        }
        return arrayList;
    }
}
