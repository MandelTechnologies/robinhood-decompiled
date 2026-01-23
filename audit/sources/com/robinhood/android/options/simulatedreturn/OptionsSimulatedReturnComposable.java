package com.robinhood.android.options.simulatedreturn;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnUtils;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState3;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedReturnEstimatedPriceHeader;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggings;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSlider;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnComposable;
import com.robinhood.android.options.simulatedreturn.toolbar.OptionsSimulatedReturnTopAppBar;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.OptionTooltipDisplayBehavior;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle3;
import com.robinhood.tooltips.TooltipData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsSimulatedReturnComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a¯\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\u0014\u001a3\u0010\u0015\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002"}, m3636d2 = {"OptionsSimulatedReturn", "", "viewState", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnViewState;", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "onBack", "Lkotlin/Function0;", "onInfoIconClicked", "onInfoIconTooltipClicked", "onChartTypeIconClicked", "onSliderTooltipClicked", "onEstimatedContractPriceUpdated", "Lkotlin/Function1;", "", "onToolbarMenuItemTapped", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "onNavigateBack", "navigateToHome", "(Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnViewState;Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OptionsSimulatedReturnTitle", "nuxInfoTooltip", "Lcom/robinhood/models/db/OptionTooltip;", "(Lcom/robinhood/models/db/OptionTooltip;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-options-simulated-return_externalDebug", "errorState", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "sliderPosition"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturn$lambda$0(OptionsSimulatedReturnViewState optionsSimulatedReturnViewState, ActivityErrorHandler activityErrorHandler, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function1 function12, Function0 function06, Function0 function07, int i, int i2, Composer composer, int i3) {
        OptionsSimulatedReturn(optionsSimulatedReturnViewState, activityErrorHandler, function0, function02, function03, function04, function05, function1, function12, function06, function07, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnTitle$lambda$4(OptionTooltip optionTooltip, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        OptionsSimulatedReturnTitle(optionTooltip, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionsSimulatedReturn(final OptionsSimulatedReturnViewState viewState, final ActivityErrorHandler activityErrorHandler, final Function0<Unit> onBack, final Function0<Unit> onInfoIconClicked, final Function0<Unit> onInfoIconTooltipClicked, final Function0<Unit> onChartTypeIconClicked, final Function0<Unit> onSliderTooltipClicked, final Function1<? super Double, Unit> onEstimatedContractPriceUpdated, final Function1<? super FragmentKey, Unit> onToolbarMenuItemTapped, final Function0<Unit> onNavigateBack, final Function0<Unit> navigateToHome, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(activityErrorHandler, "activityErrorHandler");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onInfoIconClicked, "onInfoIconClicked");
        Intrinsics.checkNotNullParameter(onInfoIconTooltipClicked, "onInfoIconTooltipClicked");
        Intrinsics.checkNotNullParameter(onChartTypeIconClicked, "onChartTypeIconClicked");
        Intrinsics.checkNotNullParameter(onSliderTooltipClicked, "onSliderTooltipClicked");
        Intrinsics.checkNotNullParameter(onEstimatedContractPriceUpdated, "onEstimatedContractPriceUpdated");
        Intrinsics.checkNotNullParameter(onToolbarMenuItemTapped, "onToolbarMenuItemTapped");
        Intrinsics.checkNotNullParameter(onNavigateBack, "onNavigateBack");
        Intrinsics.checkNotNullParameter(navigateToHome, "navigateToHome");
        Composer composerStartRestartGroup = composer.startRestartGroup(-765932826);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInfoIconClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInfoIconTooltipClicked) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onChartTypeIconClicked) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSliderTooltipClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEstimatedContractPriceUpdated) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onToolbarMenuItemTapped) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNavigateBack) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(navigateToHome) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) != 306783378 || (i4 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-765932826, i3, i4, "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturn (OptionsSimulatedReturnComposable.kt:63)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5625Scaffold27mzLpw(companion, null, ComposableLambda3.rememberComposableLambda(-1567487829, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnComposableKt.OptionsSimulatedReturn.1
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
                        ComposerKt.traceEventStart(-1567487829, i6, -1, "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturn.<anonymous> (OptionsSimulatedReturnComposable.kt:72)");
                    }
                    OptionsSimulatedReturnTopAppBar.OptionsSimulatedReturnTopAppBar(viewState.getToolbarState(), topBarScrollStateRememberTopBarScrollState, onBack, null, onToolbarMenuItemTapped, composer3, TopBarScrollState.$stable << 3, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), ComposableLambda3.rememberComposableLambda(-1443569244, true, new C237042(scrollStateRememberScrollState, topBarScrollStateRememberTopBarScrollState, viewState, onInfoIconClicked, onInfoIconTooltipClicked, onSliderTooltipClicked, activityErrorHandler, onEstimatedContractPriceUpdated, onChartTypeIconClicked, onNavigateBack, navigateToHome), composerStartRestartGroup, 54), composer2, 390, 12582912, 32762);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsSimulatedReturnComposable.OptionsSimulatedReturn$lambda$0(viewState, activityErrorHandler, onBack, onInfoIconClicked, onInfoIconTooltipClicked, onChartTypeIconClicked, onSliderTooltipClicked, onEstimatedContractPriceUpdated, onToolbarMenuItemTapped, onNavigateBack, navigateToHome, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OptionsSimulatedReturnComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnComposableKt$OptionsSimulatedReturn$2 */
    static final class C237042 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ ActivityErrorHandler $activityErrorHandler;
        final /* synthetic */ Function0<Unit> $navigateToHome;
        final /* synthetic */ Function0<Unit> $onChartTypeIconClicked;
        final /* synthetic */ Function1<Double, Unit> $onEstimatedContractPriceUpdated;
        final /* synthetic */ Function0<Unit> $onInfoIconClicked;
        final /* synthetic */ Function0<Unit> $onInfoIconTooltipClicked;
        final /* synthetic */ Function0<Unit> $onNavigateBack;
        final /* synthetic */ Function0<Unit> $onSliderTooltipClicked;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ TopBarScrollState $topBarScrollState;
        final /* synthetic */ OptionsSimulatedReturnViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C237042(ScrollState scrollState, TopBarScrollState topBarScrollState, OptionsSimulatedReturnViewState optionsSimulatedReturnViewState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, ActivityErrorHandler activityErrorHandler, Function1<? super Double, Unit> function1, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06) {
            this.$scrollState = scrollState;
            this.$topBarScrollState = topBarScrollState;
            this.$viewState = optionsSimulatedReturnViewState;
            this.$onInfoIconClicked = function0;
            this.$onInfoIconTooltipClicked = function02;
            this.$onSliderTooltipClicked = function03;
            this.$activityErrorHandler = activityErrorHandler;
            this.$onEstimatedContractPriceUpdated = function1;
            this.$onChartTypeIconClicked = function04;
            this.$onNavigateBack = function05;
            this.$navigateToHome = function06;
        }

        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r15v4 */
        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Modifier.Companion companion;
            int i3;
            Modifier.Companion companion2;
            SnapshotState snapshotState;
            ?? r15;
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
                ComposerKt.traceEventStart(-1443569244, i2, -1, "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturn.<anonymous> (OptionsSimulatedReturnComposable.kt:81)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(companion4, bentoTheme.getColors(composer, i4).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), paddingValues), 0.0f, 0.0f, 0.0f, ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(this.$viewState.getTradebarHeight()), 7, null), this.$scrollState, this.$topBarScrollState);
            OptionsSimulatedReturnViewState optionsSimulatedReturnViewState = this.$viewState;
            Function0<Unit> function0 = this.$onInfoIconClicked;
            Function0<Unit> function02 = this.$onInfoIconTooltipClicked;
            Function0<Unit> function03 = this.$onSliderTooltipClicked;
            ActivityErrorHandler activityErrorHandler = this.$activityErrorHandler;
            Function1<Double, Unit> function1 = this.$onEstimatedContractPriceUpdated;
            final Function0<Unit> function04 = this.$onChartTypeIconClicked;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion5.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierScrollableTopBarState);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            OptionsSimulatedReturnComposable.OptionsSimulatedReturnTitle(optionsSimulatedReturnViewState.getNuxInfoTooltip(), function0, function02, composer, 0);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            OptionOrderBundle optionOrderBundleForChart = optionsSimulatedReturnViewState.getOptionOrderBundleForChart();
            composer.startReplaceGroup(-631340584);
            if (optionOrderBundleForChart == null) {
                companion = companion4;
                i3 = 0;
            } else {
                String accountNumber = optionsSimulatedReturnViewState.getAccountNumber();
                OptionsSimulatedReturnChartViewState3 chartType = optionsSimulatedReturnViewState.getChartType();
                OptionsSimulatedReturnLoggingState loggingState = optionsSimulatedReturnViewState.getLoggingState();
                OptionSimulatedChartBundle optionSimulatedChartBundle = OptionSimulatedChartBundle3.toOptionSimulatedChartBundle(optionOrderBundleForChart);
                OptionsSimulatedReturnChartDataState2 launchMode = optionsSimulatedReturnViewState.getLaunchMode();
                Double dInvoke$lambda$13$lambda$5 = invoke$lambda$13$lambda$5(snapshotState3);
                composer.startReplaceGroup(5004770);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion3.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnComposableKt$OptionsSimulatedReturn$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsSimulatedReturnComposable.C237042.invoke$lambda$13$lambda$9$lambda$8$lambda$7(snapshotState2, (OptionsSimulatedReturnErrorState) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                companion = companion4;
                i3 = 0;
                OptionsSimulatedReturnChartKt.OptionsSimulatedReturnChart(new OptionsSimulatedChartLaunchMode.SimulatedReturn(accountNumber, activityErrorHandler, chartType, loggingState, optionSimulatedChartBundle, launchMode, dInvoke$lambda$13$lambda$5, false, false, true, function1, (Function1) objRememberedValue3, ComposableLambda3.rememberComposableLambda(1213739478, true, new Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnComposableKt$OptionsSimulatedReturn$2$2$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedChartHeaderState optionsSimulatedChartHeaderState, Composer composer2, Integer num) {
                        invoke(optionsSimulatedChartHeaderState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(OptionsSimulatedChartHeaderState headerState, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(headerState, "headerState");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1213739478, i5, -1, "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturn.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsSimulatedReturnComposable.kt:115)");
                        }
                        OptionsSimulatedReturnEstimatedPriceHeader.OptionsSimulatedReturnEstimatedPriceHeader(headerState, null, function04, composer2, i5 & 14, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), null, 256, null), Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer, OptionsSimulatedChartLaunchMode.SimulatedReturn.$stable, 0);
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i4).m21595getXsmallD9Ej5fM()), composer, i3);
            composer.startReplaceGroup(-631293169);
            if (optionsSimulatedReturnViewState.getUnderlyingId() == null || optionsSimulatedReturnViewState.getUnderlyingType() == null) {
                companion2 = companion;
                snapshotState = snapshotState2;
                r15 = i3;
            } else {
                composer.startReplaceGroup(-631290517);
                float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
                composer.endReplaceGroup();
                companion2 = companion;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl((float) (fMo5013toDpu2uoSUM * 0.0148d)), 7, null);
                OptionsSimulatedReturnSliderLaunchMode.Price price = new OptionsSimulatedReturnSliderLaunchMode.Price(optionsSimulatedReturnViewState.getUnderlyingType(), optionsSimulatedReturnViewState.getUnderlyingId());
                OptionTooltip nuxSliderTooltip = optionsSimulatedReturnViewState.getNuxSliderTooltip();
                OptionsSimulatedReturnLoggingState loggingState2 = optionsSimulatedReturnViewState.getLoggingState();
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i4).m21371getBg0d7_KjU();
                composer.startReplaceGroup(5004770);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == companion3.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnComposableKt$OptionsSimulatedReturn$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsSimulatedReturnComposable.C237042.invoke$lambda$13$lambda$12$lambda$11(snapshotState3, ((Double) obj).doubleValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                snapshotState = snapshotState2;
                r15 = 0;
                OptionsSimulatedReturnSlider.m16968OptionsSimulatedReturnSliderHzv_svQ(price, nuxSliderTooltip, loggingState2, false, jM21371getBg0d7_KjU, (Function1) objRememberedValue4, modifierM5146paddingqDBjuR0$default, false, false, function03, composer, 199680 | OptionsSimulatedReturnSliderLaunchMode.Price.$stable | (OptionsSimulatedReturnLoggingState.$stable << 6), 384);
            }
            composer.endReplaceGroup();
            composer.endNode();
            OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorStateInvoke$lambda$1 = invoke$lambda$1(snapshotState);
            if (optionsSimulatedReturnErrorStateInvoke$lambda$1 != null) {
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion2, OptionsSimulatedReturnLoggings.getEventDescriptor(optionsSimulatedReturnErrorStateInvoke$lambda$1, this.$viewState.getLoggingState()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                OptionsSimulatedReturnViewState optionsSimulatedReturnViewState2 = this.$viewState;
                Function0<Unit> function05 = this.$onNavigateBack;
                Function0<Unit> function06 = this.$navigateToHome;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), r15);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, r15);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                OptionsSimulatedReturnErrorDialog.OptionsSimulatedReturnErrorDialog(optionsSimulatedReturnErrorStateInvoke$lambda$1, optionsSimulatedReturnViewState2.isSingleLeg(), function05, function06, composer, 0);
                composer.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final OptionsSimulatedReturnErrorState invoke$lambda$1(SnapshotState<OptionsSimulatedReturnErrorState> snapshotState) {
            return snapshotState.getValue();
        }

        private static final Double invoke$lambda$13$lambda$5(SnapshotState<Double> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$9$lambda$8$lambda$7(SnapshotState snapshotState, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState) {
            snapshotState.setValue(optionsSimulatedReturnErrorState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12$lambda$11(SnapshotState snapshotState, double d) {
            snapshotState.setValue(Double.valueOf(d));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void OptionsSimulatedReturnTitle(final OptionTooltip optionTooltip, final Function0<Unit> onInfoIconClicked, final Function0<Unit> onInfoIconTooltipClicked, Composer composer, final int i) {
        int i2;
        TextStyle displayCapsuleLarge;
        Modifier modifier;
        ?? r5;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onInfoIconClicked, "onInfoIconClicked");
        Intrinsics.checkNotNullParameter(onInfoIconTooltipClicked, "onInfoIconTooltipClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1062456739);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionTooltip) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onInfoIconClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onInfoIconTooltipClicked) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1062456739, i2, -1, "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnTitle (OptionsSimulatedReturnComposable.kt:170)");
            }
            composerStartRestartGroup.startReplaceGroup(-1181283852);
            float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl((float) (fMo5013toDpu2uoSUM * 0.0197d));
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), fM7995constructorimpl, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C23755R.string.options_simulated_return_title, composerStartRestartGroup, 0);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            if (OptionsSimulatedReturnUtils.isDeviceSmallForOptionsSimulatedReturn(composerStartRestartGroup, 0)) {
                composerStartRestartGroup.startReplaceGroup(405345074);
                displayCapsuleLarge = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(405423442);
                displayCapsuleLarge = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleLarge();
                composerStartRestartGroup.endReplaceGroup();
            }
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, displayCapsuleLarge, composerStartRestartGroup, 805306368, 0, 7674);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(6)), composerStartRestartGroup, 6);
            if (optionTooltip != null) {
                String content = optionTooltip.getContent();
                TooltipData.Layout layout = new TooltipData.Layout(RdsTooltipView.NibDirection.f4107UP, 0.0f, null, null, 14, null);
                OptionTooltipDisplayBehavior displayBehavior = optionTooltip.getDisplayBehavior();
                r5 = 0;
                modifier = com.robinhood.tooltips.ModifiersKt.tooltip$default(companion, content, layout, new TooltipData.Behavior(null, displayBehavior != null ? displayBehavior.getDisplayMilliseconds() : null, null, onInfoIconTooltipClicked, 5, null), null, false, 24, null);
            } else {
                modifier = companion;
                r5 = 0;
            }
            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(modifier, C2002Dp.m7995constructorimpl(24));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), r5);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r5);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_24), StringResources_androidKt.stringResource(C23755R.string.options_simulated_return_faq_title, composerStartRestartGroup, r5), bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), null, onInfoIconClicked, true, composer2, 196608 | BentoIcon4.Size16.$stable | ((i2 << 9) & 57344), 8);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsSimulatedReturnComposable.OptionsSimulatedReturnTitle$lambda$4(optionTooltip, onInfoIconClicked, onInfoIconTooltipClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
