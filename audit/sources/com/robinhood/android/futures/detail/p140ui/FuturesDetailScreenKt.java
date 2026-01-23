package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenKt;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartDuxo2;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartDuxo4;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartViewState;
import com.robinhood.android.futures.detail.p140ui.duxo.FtuxProgressState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.detail.p140ui.ftux.FuturesDetailFtuxTopBar4;
import com.robinhood.android.futures.detail.utils.LoggingUtils5;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.futures.ChartType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: FuturesDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0017\u0010\u0011\u001a\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"FuturesDetailScreen", "", "state", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;", "isShowingContinuousChart", "", "themeDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "showLoading", "fdpCallbacks", "Lcom/robinhood/android/futures/detail/ui/FuturesDetailScreenCallbacks;", "chartCallbacks", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartCallbacks;", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;ZLcom/robinhood/compose/bento/theme/Direction;ZLcom/robinhood/android/futures/detail/ui/FuturesDetailScreenCallbacks;Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartCallbacks;Landroidx/compose/runtime/Composer;I)V", "showLoadingForDetailScreen", "chartState", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState;", "PreviewFuturesDetailScreen", "options", "Lcom/robinhood/android/futures/detail/ui/PreviewOptions;", "(Lcom/robinhood/android/futures/detail/ui/PreviewOptions;Landroidx/compose/runtime/Composer;I)V", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesDetailScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesDetailScreen$lambda$0(FuturesDetailViewState futuresDetailViewState, boolean z, BentoTheme4 bentoTheme4, boolean z2, FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, FuturesDetailChartCallbacks futuresDetailChartCallbacks, int i, Composer composer, int i2) {
        FuturesDetailScreen(futuresDetailViewState, z, bentoTheme4, z2, futuresDetailScreenCallbacks, futuresDetailChartCallbacks, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFuturesDetailScreen$lambda$1(PreviewOptions previewOptions, int i, Composer composer, int i2) {
        PreviewFuturesDetailScreen(previewOptions, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FuturesDetailScreen(final FuturesDetailViewState state, final boolean z, final BentoTheme4 themeDirection, final boolean z2, final FuturesDetailScreenCallbacks fdpCallbacks, final FuturesDetailChartCallbacks chartCallbacks, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(themeDirection, "themeDirection");
        Intrinsics.checkNotNullParameter(fdpCallbacks, "fdpCallbacks");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1526122507);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(themeDirection.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(fdpCallbacks) : composerStartRestartGroup.changedInstance(fdpCallbacks) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1526122507, i2, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailScreen (FuturesDetailScreen.kt:75)");
            }
            AutoLoggingCompositionLocals.EventLoggable(LoggingUtils5.futuresDetailBaseEventDescriptor(state.getLoggingData(), composerStartRestartGroup, 0), ComposableLambda3.rememberComposableLambda(667538986, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenKt.FuturesDetailScreen.1
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
                        ComposerKt.traceEventStart(667538986, i3, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailScreen.<anonymous> (FuturesDetailScreen.kt:77)");
                    }
                    BentoTheme4 bentoTheme4 = themeDirection;
                    final FuturesDetailViewState futuresDetailViewState = state;
                    final FuturesDetailScreenCallbacks futuresDetailScreenCallbacks = fdpCallbacks;
                    final boolean z3 = z2;
                    final boolean z4 = z;
                    final FuturesDetailChartCallbacks futuresDetailChartCallbacks = chartCallbacks;
                    BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(-1621716668, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenKt.FuturesDetailScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1621716668, i4, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailScreen.<anonymous>.<anonymous> (FuturesDetailScreen.kt:78)");
                            }
                            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer3, 0, 3);
                            TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composer3, 0, 1);
                            composer3.startReplaceGroup(603415168);
                            if (futuresDetailViewState.getSelectedContractId() != null) {
                                UUID selectedContractId = futuresDetailViewState.getSelectedContractId();
                                FuturesDetailChartDuxo4 chartViewMode = futuresDetailViewState.getChartViewMode();
                                composer3.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer3.changedInstance(futuresDetailScreenCallbacks) | composer3.changedInstance(futuresDetailViewState);
                                FuturesDetailScreenCallbacks futuresDetailScreenCallbacks2 = futuresDetailScreenCallbacks;
                                FuturesDetailViewState futuresDetailViewState2 = futuresDetailViewState;
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new FuturesDetailScreenKt$FuturesDetailScreen$1$1$1$1(futuresDetailScreenCallbacks2, futuresDetailViewState2, null);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                EffectsKt.LaunchedEffect(selectedContractId, chartViewMode, (Function2) objRememberedValue, composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            if (z3) {
                                composer3.startReplaceGroup(1526372623);
                                ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableSingletons$FuturesDetailScreenKt.INSTANCE.getLambda$394258371$feature_futures_detail_externalDebug(), composer3, 805306368, 511);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(1526631163);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i5 = BentoTheme.$stable;
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i5).m21371getBg0d7_KjU();
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i5).m21425getFg0d7_KjU();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1005006907, true, new AnonymousClass2(futuresDetailViewState, lazyListStateRememberLazyListState, topBarScrollStateRememberTopBarScrollState, futuresDetailScreenCallbacks, z4), composer3, 54);
                                final FuturesDetailViewState futuresDetailViewState3 = futuresDetailViewState;
                                final FuturesDetailScreenCallbacks futuresDetailScreenCallbacks3 = futuresDetailScreenCallbacks;
                                final FuturesDetailChartCallbacks futuresDetailChartCallbacks2 = futuresDetailChartCallbacks;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-512301862, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenKt.FuturesDetailScreen.1.1.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                        invoke(paddingValues, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues contentPadding, Composer composer4, int i6) {
                                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                        if ((i6 & 6) == 0) {
                                            i6 |= composer4.changed(contentPadding) ? 4 : 2;
                                        }
                                        if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-512301862, i6, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailScreen.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreen.kt:121)");
                                        }
                                        FuturesDetailScreenContentKt.FuturesDetailScreenContent(futuresDetailViewState3, lazyListStateRememberLazyListState, futuresDetailScreenCallbacks3, futuresDetailChartCallbacks2, PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: FuturesDetailScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.detail.ui.FuturesDetailScreenKt$FuturesDetailScreen$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ FuturesDetailScreenCallbacks $fdpCallbacks;
                            final /* synthetic */ boolean $isShowingContinuousChart;
                            final /* synthetic */ LazyListState $lazyListState;
                            final /* synthetic */ FuturesDetailViewState $state;
                            final /* synthetic */ TopBarScrollState $topBarScrollState;

                            AnonymousClass2(FuturesDetailViewState futuresDetailViewState, LazyListState lazyListState, TopBarScrollState topBarScrollState, FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, boolean z) {
                                this.$state = futuresDetailViewState;
                                this.$lazyListState = lazyListState;
                                this.$topBarScrollState = topBarScrollState;
                                this.$fdpCallbacks = futuresDetailScreenCallbacks;
                                this.$isShowingContinuousChart = z;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1005006907, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailScreen.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreen.kt:101)");
                                }
                                FuturesDetailViewState.TopBarData topBarData = this.$state.getTopBarData();
                                if (topBarData instanceof FuturesDetailViewState.TopBarData.RegularTopBarData) {
                                    composer.startReplaceGroup(556010614);
                                    FuturesDetailViewState.TopBarData.RegularTopBarData regularTopBarData = (FuturesDetailViewState.TopBarData.RegularTopBarData) topBarData;
                                    LazyListState lazyListState = this.$lazyListState;
                                    TopBarScrollState topBarScrollState = this.$topBarScrollState;
                                    FuturesDetailScreenCallbacks futuresDetailScreenCallbacks = this.$fdpCallbacks;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(futuresDetailScreenCallbacks);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new FuturesDetailScreenKt$FuturesDetailScreen$1$1$2$1$1(futuresDetailScreenCallbacks);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                                    FuturesDetailScreenCallbacks futuresDetailScreenCallbacks2 = this.$fdpCallbacks;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(futuresDetailScreenCallbacks2);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new FuturesDetailScreenKt$FuturesDetailScreen$1$1$2$2$1(futuresDetailScreenCallbacks2);
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    Function2 function2 = (Function2) ((KFunction) objRememberedValue2);
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance3 = composer.changedInstance(this.$fdpCallbacks) | composer.changed(this.$isShowingContinuousChart);
                                    final FuturesDetailScreenCallbacks futuresDetailScreenCallbacks3 = this.$fdpCallbacks;
                                    final boolean z = this.$isShowingContinuousChart;
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenKt$FuturesDetailScreen$1$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return FuturesDetailScreenKt.C170701.AnonymousClass1.AnonymousClass2.invoke$lambda$3$lambda$2(futuresDetailScreenCallbacks3, z, (UUID) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer.endReplaceGroup();
                                    FuturesDetailRegularTopBar.FuturesDetailRegularTopBar(regularTopBarData, lazyListState, topBarScrollState, function0, function2, (Function1) objRememberedValue3, null, composer, TopBarScrollState.$stable << 6, 64);
                                    composer.endReplaceGroup();
                                } else {
                                    if (!(topBarData instanceof FuturesDetailViewState.TopBarData.FtuxTopBarData)) {
                                        composer.startReplaceGroup(556005901);
                                        composer.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer.startReplaceGroup(556034860);
                                    FuturesDetailScreenCallbacks futuresDetailScreenCallbacks4 = this.$fdpCallbacks;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance4 = composer.changedInstance(futuresDetailScreenCallbacks4);
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new FuturesDetailScreenKt$FuturesDetailScreen$1$1$2$4$1(futuresDetailScreenCallbacks4);
                                        composer.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer.endReplaceGroup();
                                    FuturesDetailFtuxTopBar4.FuturesDetailFtuxTopBar((Function0) ((KFunction) objRememberedValue4), null, composer, 0, 2);
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, boolean z, UUID contractId) {
                                Intrinsics.checkNotNullParameter(contractId, "contractId");
                                futuresDetailScreenCallbacks.showPictureInPicture(contractId, z);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesDetailScreenKt.FuturesDetailScreen$lambda$0(state, z, themeDirection, z2, fdpCallbacks, chartCallbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final boolean showLoadingForDetailScreen(FuturesDetailViewState state, FuturesDetailChartViewState chartState) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        if (state.getFtuxProgressState() == null) {
            return true;
        }
        if (!(state.getFtuxProgressState() instanceof FtuxProgressState.ChartEducation)) {
            return false;
        }
        FuturesDetailChartViewState.ChartData chartData = chartState.getChartData();
        return (chartData != null ? chartData.getChart() : null) == null;
    }

    private static final void PreviewFuturesDetailScreen(final PreviewOptions previewOptions, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(777348829);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(previewOptions) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(777348829, i2, -1, "com.robinhood.android.futures.detail.ui.PreviewFuturesDetailScreen (FuturesDetailScreen.kt:233)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1756697125, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenKt.PreviewFuturesDetailScreen.1
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
                        ComposerKt.traceEventStart(1756697125, i3, -1, "com.robinhood.android.futures.detail.ui.PreviewFuturesDetailScreen.<anonymous> (FuturesDetailScreen.kt:235)");
                    }
                    FuturesDetailScreenKt.FuturesDetailScreen(previewOptions.getState(), true, previewOptions.getChartState().getThemeDirection(), FuturesDetailScreenKt.showLoadingForDetailScreen(previewOptions.getState(), previewOptions.getChartState()), PreviewCallbacks.INSTANCE, new FuturesDetailChartCallbacks(previewOptions) { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenKt.PreviewFuturesDetailScreen.1.1
                        private final StateFlow<Event<FuturesDetailChartDuxo2>> eventFlow = StateFlow4.MutableStateFlow(null);
                        private final StateFlow<FuturesDetailChartViewState> stateFlow;

                        @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
                        public void onAdvancedChartOpened() {
                        }

                        @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
                        public void onChartSettingsClicked() {
                        }

                        @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
                        public void onChartSettingsDismissed() {
                        }

                        @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
                        public void onChartTypeSelected(ChartType type2) {
                            Intrinsics.checkNotNullParameter(type2, "type");
                        }

                        @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
                        public void onContinuousChartSelected(boolean isContinuousChart) {
                        }

                        @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
                        public void onSpanSelected(DisplaySpan span) {
                            Intrinsics.checkNotNullParameter(span, "span");
                        }

                        {
                            this.stateFlow = StateFlow4.MutableStateFlow(previewOptions.getChartState());
                        }

                        @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
                        public StateFlow<FuturesDetailChartViewState> getStateFlow() {
                            return this.stateFlow;
                        }

                        @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
                        public StateFlow<Event<FuturesDetailChartDuxo2>> getEventFlow() {
                            return this.eventFlow;
                        }
                    }, composer2, 24624);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesDetailScreenKt.PreviewFuturesDetailScreen$lambda$1(previewOptions, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
