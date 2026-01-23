package com.robinhood.android.options.portfolioriskanalyzer;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.result.ObserveResult;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.calculation.greeks.OptionsGreeks;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDataState4;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartEvent;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo;
import com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt;
import com.robinhood.android.options.portfolioriskanalyzer.components.chartfooter.OptionsPortfolioRiskAnalyzerChartFooter;
import com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeader;
import com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeaderDuxo;
import com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeaderViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartStickyHeader;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRow;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionHeader;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowDuxo;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001aq\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010$X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002²\u0006\u0012\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002"}, m3636d2 = {"OptionsPortfolioRiskAnalyzerComposable", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "onBackPressed", "Lkotlin/Function0;", "onOpenStockDetailPage", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "onOpenAggregateOptionsDetailPage", "duxo", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDuxo;", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadedContent", "viewState", "Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerViewState;", "onUnderlyingIdUpdated", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerViewState;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/SavedStateHandle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingContent", "isLoading", "", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TEST_TAG_TOP_BAR", "", "TEST_TAG_CHART_HEADER", "TEST_TAG_LAZY_COLUMN", "KEY_CHART_HEADER", "KEY_CHART", "KEY_CHART_FOOTER", "KEY_SLIDER", "KEY_POSITIONS_SECTION_HEADER", "feature-options-portfolio-risk-analyzer_externalDebug", "sliderPosition", "", "positionViewState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionViewState;", "chartHeaderViewState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/chartheader/OptionsPortfolioRiskAnalyzerChartHeaderViewState;", "chartViewState", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartViewState;", "chartEventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartEvent;", "isScrolledPassedChart", "animatedAlpha", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerComposableKt {
    public static final String KEY_CHART = "chart key";
    public static final String KEY_CHART_FOOTER = "chart footer key";
    public static final String KEY_CHART_HEADER = "chart header key";
    public static final String KEY_POSITIONS_SECTION_HEADER = "positions section header key";
    public static final String KEY_SLIDER = "slider key";
    public static final String TEST_TAG_CHART_HEADER = "chart header";
    public static final String TEST_TAG_LAZY_COLUMN = "pra lazy column";
    public static final String TEST_TAG_TOP_BAR = "pra top bar";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$5(OptionsPortfolioRiskAnalyzerViewState optionsPortfolioRiskAnalyzerViewState, Function1 function1, SavedStateHandle savedStateHandle, Function0 function0, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedContent(optionsPortfolioRiskAnalyzerViewState, function1, savedStateHandle, function0, function12, function13, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$7(boolean z, Function0 function0, int i, Composer composer, int i2) {
        LoadingContent(z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerComposable$lambda$2(SavedStateHandle savedStateHandle, Function0 function0, Function1 function1, Function1 function12, OptionsPortfolioRiskAnalyzerDuxo optionsPortfolioRiskAnalyzerDuxo, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerComposable(savedStateHandle, function0, function1, function12, optionsPortfolioRiskAnalyzerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsPortfolioRiskAnalyzerComposable(final SavedStateHandle savedStateHandle, final Function0<Unit> onBackPressed, final Function1<? super FragmentKey, Unit> onOpenStockDetailPage, final Function1<? super FragmentKey, Unit> onOpenAggregateOptionsDetailPage, OptionsPortfolioRiskAnalyzerDuxo optionsPortfolioRiskAnalyzerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        OptionsPortfolioRiskAnalyzerDuxo optionsPortfolioRiskAnalyzerDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        OptionsPortfolioRiskAnalyzerDuxo optionsPortfolioRiskAnalyzerDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final OptionsPortfolioRiskAnalyzerDuxo optionsPortfolioRiskAnalyzerDuxo4;
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onOpenStockDetailPage, "onOpenStockDetailPage");
        Intrinsics.checkNotNullParameter(onOpenAggregateOptionsDetailPage, "onOpenAggregateOptionsDetailPage");
        Composer composerStartRestartGroup = composer.startRestartGroup(82521056);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(savedStateHandle) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenStockDetailPage) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenAggregateOptionsDetailPage) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                optionsPortfolioRiskAnalyzerDuxo2 = optionsPortfolioRiskAnalyzerDuxo;
                int i4 = composerStartRestartGroup.changedInstance(optionsPortfolioRiskAnalyzerDuxo2) ? 16384 : 8192;
                i3 |= i4;
            } else {
                optionsPortfolioRiskAnalyzerDuxo2 = optionsPortfolioRiskAnalyzerDuxo;
            }
            i3 |= i4;
        } else {
            optionsPortfolioRiskAnalyzerDuxo2 = optionsPortfolioRiskAnalyzerDuxo;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsPortfolioRiskAnalyzerDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$OptionsPortfolioRiskAnalyzerComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$OptionsPortfolioRiskAnalyzerComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    optionsPortfolioRiskAnalyzerDuxo2 = (OptionsPortfolioRiskAnalyzerDuxo) baseDuxo;
                    i3 &= -57345;
                }
                optionsPortfolioRiskAnalyzerDuxo3 = optionsPortfolioRiskAnalyzerDuxo2;
                int i5 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(82521056, i5, -1, "com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposable (OptionsPortfolioRiskAnalyzerComposable.kt:76)");
                }
                OptionsPortfolioRiskAnalyzerViewState optionsPortfolioRiskAnalyzerViewStateOptionsPortfolioRiskAnalyzerComposable$lambda$0 = OptionsPortfolioRiskAnalyzerComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(optionsPortfolioRiskAnalyzerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(optionsPortfolioRiskAnalyzerDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C23453xd96db555(optionsPortfolioRiskAnalyzerDuxo3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LoadedContent(optionsPortfolioRiskAnalyzerViewStateOptionsPortfolioRiskAnalyzerComposable$lambda$0, (Function1) ((KFunction) objRememberedValue), savedStateHandle, onBackPressed, onOpenStockDetailPage, onOpenAggregateOptionsDetailPage, null, composerStartRestartGroup, (i5 << 6) & 524160, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                optionsPortfolioRiskAnalyzerDuxo4 = optionsPortfolioRiskAnalyzerDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                optionsPortfolioRiskAnalyzerDuxo3 = optionsPortfolioRiskAnalyzerDuxo2;
                int i52 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                OptionsPortfolioRiskAnalyzerViewState optionsPortfolioRiskAnalyzerViewStateOptionsPortfolioRiskAnalyzerComposable$lambda$02 = OptionsPortfolioRiskAnalyzerComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(optionsPortfolioRiskAnalyzerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(optionsPortfolioRiskAnalyzerDuxo3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new C23453xd96db555(optionsPortfolioRiskAnalyzerDuxo3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LoadedContent(optionsPortfolioRiskAnalyzerViewStateOptionsPortfolioRiskAnalyzerComposable$lambda$02, (Function1) ((KFunction) objRememberedValue), savedStateHandle, onBackPressed, onOpenStockDetailPage, onOpenAggregateOptionsDetailPage, null, composerStartRestartGroup, (i52 << 6) & 524160, 64);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    optionsPortfolioRiskAnalyzerDuxo4 = optionsPortfolioRiskAnalyzerDuxo3;
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            optionsPortfolioRiskAnalyzerDuxo4 = optionsPortfolioRiskAnalyzerDuxo2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsPortfolioRiskAnalyzerComposableKt.OptionsPortfolioRiskAnalyzerComposable$lambda$2(savedStateHandle, onBackPressed, onOpenStockDetailPage, onOpenAggregateOptionsDetailPage, optionsPortfolioRiskAnalyzerDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3 */
    static final class C234363 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ LazyListState $lazyListState;
        final /* synthetic */ LifecycleAwareNavigator $navigator;
        final /* synthetic */ Function1<FragmentKey, Unit> $onOpenAggregateOptionsDetailPage;
        final /* synthetic */ Function1<FragmentKey, Unit> $onOpenStockDetailPage;
        final /* synthetic */ Function1<UUID, Unit> $onUnderlyingIdUpdated;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ OptionsPortfolioRiskAnalyzerViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C234363(OptionsPortfolioRiskAnalyzerViewState optionsPortfolioRiskAnalyzerViewState, Function1<? super UUID, Unit> function1, LifecycleAwareNavigator lifecycleAwareNavigator, LazyListState lazyListState, Function1<? super FragmentKey, Unit> function12, Resources resources, Function1<? super FragmentKey, Unit> function13) {
            this.$viewState = optionsPortfolioRiskAnalyzerViewState;
            this.$onUnderlyingIdUpdated = function1;
            this.$navigator = lifecycleAwareNavigator;
            this.$lazyListState = lazyListState;
            this.$onOpenStockDetailPage = function12;
            this.$resources = resources;
            this.$onOpenAggregateOptionsDetailPage = function13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionsProfitAndLossChartViewState invoke$lambda$40$lambda$11(SnapshotState4<OptionsProfitAndLossChartViewState> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Event<OptionsSimulatedReturnChartEvent> invoke$lambda$40$lambda$12(SnapshotState4<Event<OptionsSimulatedReturnChartEvent>> snapshotState4) {
            return snapshotState4.getValue();
        }

        private static final boolean invoke$lambda$40$lambda$39$lambda$37(SnapshotState4<Boolean> snapshotState4) {
            return snapshotState4.getValue().booleanValue();
        }

        private static final float invoke$lambda$40$lambda$39$lambda$38(SnapshotState4<Float> snapshotState4) {
            return snapshotState4.getValue().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Double invoke$lambda$40$lambda$5(SnapshotState<Double> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionsPortfolioRiskAnalyzerPositionViewState invoke$lambda$40$lambda$7(SnapshotState4<OptionsPortfolioRiskAnalyzerPositionViewState> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionsPortfolioRiskAnalyzerChartHeaderViewState invoke$lambda$40$lambda$9(SnapshotState4<OptionsPortfolioRiskAnalyzerChartHeaderViewState> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX WARN: Type inference failed for: r7v31 */
        /* JADX WARN: Type inference failed for: r7v32, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v44 */
        public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
            int i2;
            OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss;
            Composer composer2;
            Object optionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$8$1$1;
            String str;
            SnapshotState snapshotState;
            OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss2;
            OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo;
            Object[] objArr;
            OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo;
            OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader;
            ?? r7;
            final SnapshotState4 snapshotState4;
            OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader2;
            SnapshotState4 snapshotState42;
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(contentPadding) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1194182087, i2, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadedContent.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:148)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, contentPadding), 0.0f, 1, null);
            OptionsPortfolioRiskAnalyzerViewState optionsPortfolioRiskAnalyzerViewState = this.$viewState;
            final Function1<UUID, Unit> function1 = this.$onUnderlyingIdUpdated;
            final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
            final LazyListState lazyListState = this.$lazyListState;
            final Function1<FragmentKey, Unit> function12 = this.$onOpenStockDetailPage;
            final Resources resources = this.$resources;
            final Function1<FragmentKey, Unit> function13 = this.$onOpenAggregateOptionsDetailPage;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            OptionsPortfolioRiskAnalyzerTopNavRowDuxo.NavRowDuxoInitArgs navRowDuxoInitArgs = new OptionsPortfolioRiskAnalyzerTopNavRowDuxo.NavRowDuxoInitArgs(optionsPortfolioRiskAnalyzerViewState.getAccountNumber());
            composer.startReplaceGroup(2050738472);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            int i3 = LocalViewModelStoreOwner.$stable;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer, i3);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, navRowDuxoInitArgs)));
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsPortfolioRiskAnalyzerTopNavRowDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            composer.endReplaceGroup();
            OptionsPortfolioRiskAnalyzerTopNavRowDuxo optionsPortfolioRiskAnalyzerTopNavRowDuxo = (OptionsPortfolioRiskAnalyzerTopNavRowDuxo) baseDuxo;
            UUID currentUnderlyingId = optionsPortfolioRiskAnalyzerViewState.getCurrentUnderlyingId();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$1$lambda$0(function1, (UUID) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function14 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(lifecycleAwareNavigator);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$3$lambda$2(lifecycleAwareNavigator);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            OptionsPortfolioRiskAnalyzerTopNavRowComposable.OptionsPortfolioRiskAnalyzerTopNavRowComposable(optionsPortfolioRiskAnalyzerTopNavRowDuxo, modifierFillMaxWidth$default, currentUnderlyingId, function14, (Function0) objRememberedValue3, composer, 48, 0);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue4;
            composer.endReplaceGroup();
            String accountNumber = optionsPortfolioRiskAnalyzerViewState.getAccountNumber();
            final UUID currentUnderlyingId2 = optionsPortfolioRiskAnalyzerViewState.getCurrentUnderlyingId();
            OptionsPortfolioRiskAnalyzerPositionDuxo.Args args = new OptionsPortfolioRiskAnalyzerPositionDuxo.Args(accountNumber);
            composer.startReplaceGroup(2050738472);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composer, i3);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            CreationExtras2 creationExtras22 = new CreationExtras2(current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
            creationExtras22.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
            ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current2, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsPortfolioRiskAnalyzerPositionDuxo.class), current2, (String) null, factoryCreateViewModelFactory2, creationExtras22, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
            final Lifecycle lifecycle2 = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(baseDuxo2) | composer.changedInstance(lifecycle2);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion4.getEmpty()) {
                objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$duxo$2
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                        lifecycle2.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle3 = lifecycle2;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$duxo$2.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle3.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer, 0);
            composer.endReplaceGroup();
            final OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo2 = (OptionsPortfolioRiskAnalyzerPositionDuxo) baseDuxo2;
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionsPortfolioRiskAnalyzerPositionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current3 = localViewModelStoreOwner.getCurrent(composer, i3);
            if (current3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory3 = DuxosKt.createViewModelFactory(current3, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel3 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsSimulatedReturnTimeSliderDuxo.class), current3, (String) null, factoryCreateViewModelFactory3, current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo3 = (BaseDuxo) viewModel3;
            final Lifecycle lifecycle3 = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(baseDuxo3) | composer.changedInstance(lifecycle3);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue6 == companion4.getEmpty()) {
                objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$duxo$3
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo3);
                        lifecycle3.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle4 = lifecycle3;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$duxo$3.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle4.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer, 0);
            composer.endReplaceGroup();
            final OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo = (OptionsSimulatedReturnTimeSliderDuxo) baseDuxo3;
            OptionsSimulatedReturnSliderLaunchMode.Time sliderLaunchMode = invoke$lambda$40$lambda$7(snapshotState4CollectAsStateWithLifecycle).getSliderLaunchMode();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance4 = composer.changedInstance(optionsSimulatedReturnTimeSliderDuxo) | composer.changed(snapshotState4CollectAsStateWithLifecycle);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue7 == companion4.getEmpty()) {
                objRememberedValue7 = new OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$3$1(optionsSimulatedReturnTimeSliderDuxo, snapshotState4CollectAsStateWithLifecycle, null);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(sliderLaunchMode, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer, OptionsSimulatedReturnSliderLaunchMode.Time.$stable);
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current4 = localViewModelStoreOwner.getCurrent(composer, i3);
            if (current4 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory4 = DuxosKt.createViewModelFactory(current4, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel4 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsPortfolioRiskAnalyzerChartHeaderDuxo.class), current4, (String) null, factoryCreateViewModelFactory4, current4 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current4).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo4 = (BaseDuxo) viewModel4;
            final Lifecycle lifecycle4 = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance5 = composer.changedInstance(baseDuxo4) | composer.changedInstance(lifecycle4);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue8 == companion4.getEmpty()) {
                objRememberedValue8 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$duxo$4
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo4);
                        lifecycle4.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle5 = lifecycle4;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$duxo$4.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle5.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue8, composer, 0);
            composer.endReplaceGroup();
            OptionsPortfolioRiskAnalyzerChartHeaderDuxo optionsPortfolioRiskAnalyzerChartHeaderDuxo = (OptionsPortfolioRiskAnalyzerChartHeaderDuxo) baseDuxo4;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(optionsPortfolioRiskAnalyzerChartHeaderDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
            OptionSimulatedChartBundle5 underlying = invoke$lambda$40$lambda$7(snapshotState4CollectAsStateWithLifecycle).getChartBundle().getUnderlying();
            composer.startReplaceGroup(-1746271574);
            boolean zChanged3 = composer.changed(snapshotState4CollectAsStateWithLifecycle) | composer.changedInstance(optionsPortfolioRiskAnalyzerChartHeaderDuxo) | composer.changed(accountNumber);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue9 == companion4.getEmpty()) {
                objRememberedValue9 = new OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$4$1(optionsPortfolioRiskAnalyzerChartHeaderDuxo, accountNumber, snapshotState4CollectAsStateWithLifecycle, null);
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(underlying, accountNumber, (Function2) objRememberedValue9, composer, 0);
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current5 = localViewModelStoreOwner.getCurrent(composer, i3);
            if (current5 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory5 = DuxosKt.createViewModelFactory(current5, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel5 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsProfitAndLossChartDuxo.class), current5, (String) null, factoryCreateViewModelFactory5, current5 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current5).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo5 = (BaseDuxo) viewModel5;
            final Lifecycle lifecycle5 = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance6 = composer.changedInstance(baseDuxo5) | composer.changedInstance(lifecycle5);
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue10 == companion4.getEmpty()) {
                objRememberedValue10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$duxo$5
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo5);
                        lifecycle5.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle6 = lifecycle5;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$duxo$5.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle6.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue10);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composer, 0);
            composer.endReplaceGroup();
            OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo2 = (OptionsProfitAndLossChartDuxo) baseDuxo5;
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(optionsProfitAndLossChartDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
            final StateFlow<Event<OptionsSimulatedReturnChartEvent>> eventFlow = optionsProfitAndLossChartDuxo2.getEventFlow();
            composer.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$collectEventAsStateWithLifecycle$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OptionsPortfolioRiskAnalyzerComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof OptionsSimulatedReturnChartEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            Event<OptionsSimulatedReturnChartEvent> value = eventFlow.getValue();
            Event<OptionsSimulatedReturnChartEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof OptionsSimulatedReturnChartEvent)) {
                value = null;
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer, 0, 0);
            composer.endReplaceGroup();
            OptionsSimulatedChartHeaderState headerState = invoke$lambda$40$lambda$11(snapshotState4CollectAsStateWithLifecycle3).getHeaderState();
            OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader3 = headerState instanceof OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader ? (OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader) headerState : null;
            OptionsProfitAndLossChartDataState4 profitLossLaunchMode = invoke$lambda$40$lambda$7(snapshotState4CollectAsStateWithLifecycle).getProfitLossLaunchMode();
            composer.startReplaceGroup(-256652142);
            if (profitLossLaunchMode == null) {
                profitAndLoss = null;
            } else {
                String accountNumber2 = optionsPortfolioRiskAnalyzerViewState.getAccountNumber();
                Double dInvoke$lambda$40$lambda$5 = invoke$lambda$40$lambda$5(snapshotState2);
                OptionSimulatedChartBundle chartBundle = invoke$lambda$40$lambda$7(snapshotState4CollectAsStateWithLifecycle).getChartBundle();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue11 = composer.rememberedValue();
                if (objRememberedValue11 == companion4.getEmpty()) {
                    objRememberedValue11 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$17$lambda$14$lambda$13((Double) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue11);
                }
                Function1 function15 = (Function1) objRememberedValue11;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue12 = composer.rememberedValue();
                if (objRememberedValue12 == companion4.getEmpty()) {
                    objRememberedValue12 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$17$lambda$16$lambda$15((OptionsSimulatedReturnErrorState) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue12);
                }
                composer.endReplaceGroup();
                profitAndLoss = new OptionsSimulatedChartLaunchMode.ProfitAndLoss(accountNumber2, null, dInvoke$lambda$40$lambda$5, true, false, true, profitLossLaunchMode, chartBundle, function15, (Function1) objRememberedValue12, ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.INSTANCE.m2245x23faccde(), null, 16, null);
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance7 = composer.changedInstance(currentUnderlyingId2) | composer.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo2);
            Object objRememberedValue13 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue13 == companion4.getEmpty()) {
                objRememberedValue13 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$21$lambda$20(currentUnderlyingId2, optionsPortfolioRiskAnalyzerPositionDuxo2, (LifecycleResumePauseEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue13);
            }
            composer.endReplaceGroup();
            OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss3 = profitAndLoss;
            OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader4 = portfolioRiskAnalyzerHeader3;
            LifecycleEffectKt.LifecycleResumeEffect(currentUnderlyingId2, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue13, composer, 0, 2);
            BigDecimal scrubbedUnderlyingPrice = invoke$lambda$40$lambda$11(snapshotState4CollectAsStateWithLifecycle3).getScrubbedUnderlyingPrice();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance8 = composer.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo2) | composer.changedInstance(scrubbedUnderlyingPrice);
            Object objRememberedValue14 = composer.rememberedValue();
            if (zChangedInstance8 || objRememberedValue14 == companion4.getEmpty()) {
                objRememberedValue14 = new OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$6$1(optionsPortfolioRiskAnalyzerPositionDuxo2, scrubbedUnderlyingPrice, null);
                composer.updateRememberedValue(objRememberedValue14);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(scrubbedUnderlyingPrice, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composer, 0);
            Double dInvoke$lambda$40$lambda$52 = invoke$lambda$40$lambda$5(snapshotState2);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance9 = composer.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo2);
            Object objRememberedValue15 = composer.rememberedValue();
            if (zChangedInstance9 || objRememberedValue15 == companion4.getEmpty()) {
                objRememberedValue15 = new OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$7$1(optionsPortfolioRiskAnalyzerPositionDuxo2, snapshotState2, null);
                composer.updateRememberedValue(objRememberedValue15);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(dInvoke$lambda$40$lambda$52, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composer, 0);
            composer.startReplaceGroup(-256609184);
            if (profitAndLoss3 == null) {
                optionsProfitAndLossChartDuxo = optionsProfitAndLossChartDuxo2;
                str = accountNumber;
                snapshotState = snapshotState2;
                portfolioRiskAnalyzerHeader = portfolioRiskAnalyzerHeader4;
                profitAndLoss2 = profitAndLoss3;
                composer2 = composer;
                optionsPortfolioRiskAnalyzerPositionDuxo = optionsPortfolioRiskAnalyzerPositionDuxo2;
                r7 = 0;
            } else {
                composer2 = composer;
                Object[] objArr2 = {accountNumber, profitAndLoss3.getLoggingState(), invoke$lambda$40$lambda$5(snapshotState2), profitAndLoss3.getProfitLossLaunchMode(), profitAndLoss3.getChartBundle(), Boolean.valueOf(profitAndLoss3.isFullyExpanded())};
                composer2.startReplaceGroup(-1224400529);
                boolean zChangedInstance10 = composer2.changedInstance(optionsProfitAndLossChartDuxo2) | composer2.changed(accountNumber) | composer2.changedInstance(profitAndLoss3);
                Object objRememberedValue16 = composer2.rememberedValue();
                if (zChangedInstance10 || objRememberedValue16 == companion4.getEmpty()) {
                    str = accountNumber;
                    snapshotState = snapshotState2;
                    profitAndLoss2 = profitAndLoss3;
                    optionsPortfolioRiskAnalyzerPositionDuxo = optionsPortfolioRiskAnalyzerPositionDuxo2;
                    objArr = objArr2;
                    optionsProfitAndLossChartDuxo = optionsProfitAndLossChartDuxo2;
                    portfolioRiskAnalyzerHeader = portfolioRiskAnalyzerHeader4;
                    optionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$8$1$1 = new OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$8$1$1(optionsProfitAndLossChartDuxo, str, profitAndLoss2, snapshotState, null);
                    composer2.updateRememberedValue(optionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$8$1$1);
                } else {
                    profitAndLoss2 = profitAndLoss3;
                    optionsProfitAndLossChartDuxo = optionsProfitAndLossChartDuxo2;
                    snapshotState = snapshotState2;
                    portfolioRiskAnalyzerHeader = portfolioRiskAnalyzerHeader4;
                    objArr = objArr2;
                    optionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$8$1$1 = objRememberedValue16;
                    str = accountNumber;
                    optionsPortfolioRiskAnalyzerPositionDuxo = optionsPortfolioRiskAnalyzerPositionDuxo2;
                }
                composer2.endReplaceGroup();
                r7 = 0;
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) optionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$8$1$1, composer2, 0);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r7);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, r7);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
            final SnapshotState snapshotState3 = snapshotState;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), OptionsPortfolioRiskAnalyzerComposableKt.TEST_TAG_LAZY_COLUMN);
            composer2.startReplaceGroup(-1224400529);
            boolean zChanged4 = composer2.changed(snapshotState4CollectAsStateWithLifecycle) | composer2.changed(snapshotState4CollectAsStateWithLifecycle2) | composer2.changedInstance(portfolioRiskAnalyzerHeader) | composer2.changed(function12) | composer2.changedInstance(optionsProfitAndLossChartDuxo) | composer2.changed(snapshotState4CollectAsStateWithLifecycle3) | composer2.changed(snapshotState4CollectAsStateWithLifecycle4) | composer2.changedInstance(profitAndLoss2) | composer2.changedInstance(resources) | composer2.changedInstance(optionsSimulatedReturnTimeSliderDuxo) | composer2.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo) | composer2.changed(function13) | composer2.changed(str);
            Object objRememberedValue17 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue17 == companion4.getEmpty()) {
                final OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo3 = optionsPortfolioRiskAnalyzerPositionDuxo;
                final OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo3 = optionsProfitAndLossChartDuxo;
                final String str2 = str;
                final OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss4 = profitAndLoss2;
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                final OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader5 = portfolioRiskAnalyzerHeader;
                objRememberedValue17 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$39$lambda$34$lambda$33(portfolioRiskAnalyzerHeader5, function12, snapshotState4CollectAsStateWithLifecycle, snapshotState4, optionsProfitAndLossChartDuxo3, profitAndLoss4, snapshotState4CollectAsStateWithLifecycle3, snapshotState4CollectAsStateWithLifecycle4, resources, optionsSimulatedReturnTimeSliderDuxo, snapshotState3, optionsPortfolioRiskAnalyzerPositionDuxo3, function13, str2, (LazyListScope) obj);
                    }
                };
                portfolioRiskAnalyzerHeader2 = portfolioRiskAnalyzerHeader5;
                snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                composer2.updateRememberedValue(objRememberedValue17);
            } else {
                snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                portfolioRiskAnalyzerHeader2 = portfolioRiskAnalyzerHeader;
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierTestTag, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue17, composer, 6, 508);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue18 = composer.rememberedValue();
            if (objRememberedValue18 == companion4.getEmpty()) {
                objRememberedValue18 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$39$lambda$36$lambda$35(lazyListState));
                    }
                });
                composer.updateRememberedValue(objRememberedValue18);
            }
            composer.endReplaceGroup();
            OptionsPortfolioRiskAnalyzerChartStickyHeader.OptionsPortfolioRiskAnalyzerChartStickyHeader(invoke$lambda$40$lambda$7(snapshotState42).getAggregatedGreeks(), invoke$lambda$40$lambda$9(snapshotState4), portfolioRiskAnalyzerHeader2, Alpha.alpha(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), invoke$lambda$40$lambda$39$lambda$38(AnimateAsState.animateFloatAsState(invoke$lambda$40$lambda$39$lambda$37((SnapshotState4) objRememberedValue18) ? 1.0f : 0.0f, null, 0.0f, null, null, composer, 0, 30))), composer, OptionsGreeks.$stable | (OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader.$stable << 6), 0);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$40$lambda$3$lambda$2(LifecycleAwareNavigator lifecycleAwareNavigator) throws Resources.NotFoundException {
            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, OptionsPortfolioRiskAnalyzerNavDestinations2.INSTANCE, null, null, false, null, 30, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$40$lambda$1$lambda$0(Function1 function1, UUID itemId) {
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            function1.invoke(itemId);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$40$lambda$17$lambda$14$lambda$13(Double d) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$40$lambda$17$lambda$16$lambda$15(OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$40$lambda$39$lambda$34$lambda$33(final OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader, final Function1 function1, final SnapshotState4 snapshotState4, final SnapshotState4 snapshotState42, OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss, SnapshotState4 snapshotState43, SnapshotState4 snapshotState44, final Resources resources, OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo, SnapshotState snapshotState, final OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, final Function1 function12, final String str, LazyListScope LazyColumn) {
            LazyListScope lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, OptionsPortfolioRiskAnalyzerComposableKt.KEY_CHART_HEADER, null, ComposableLambda3.composableLambdaInstance(1349368584, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$1
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
                        ComposerKt.traceEventStart(1349368584, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:267)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, OptionsPortfolioRiskAnalyzerComposableKt.TEST_TAG_CHART_HEADER);
                    OptionsPortfolioRiskAnalyzerChartHeader.OptionsPortfolioRiskAnalyzerChartHeader(OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$7(snapshotState4).getAggregatedGreeks(), portfolioRiskAnalyzerHeader, OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$9(snapshotState42), modifierTestTag, function1, composer, OptionsGreeks.$stable | 3072 | (OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader.$stable << 3), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
            LazyListScope.item$default(LazyColumn, OptionsPortfolioRiskAnalyzerComposableKt.KEY_CHART, null, ComposableLambda3.composableLambdaInstance(446875569, true, new C23438xa20abbde(optionsProfitAndLossChartDuxo, profitAndLoss, snapshotState43, snapshotState44)), 2, null);
            LazyListScope.item$default(LazyColumn, OptionsPortfolioRiskAnalyzerComposableKt.KEY_CHART_FOOTER, null, ComposableLambda3.composableLambdaInstance(1738346192, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    String str2;
                    String str3;
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1738346192, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:300)");
                    }
                    OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader2 = portfolioRiskAnalyzerHeader;
                    if (portfolioRiskAnalyzerHeader2 != null) {
                        Function1<Resources, String> maxProfit = portfolioRiskAnalyzerHeader2.getMaxProfit();
                        Resources resources2 = resources;
                        Intrinsics.checkNotNull(resources2);
                        String strInvoke = maxProfit.invoke(resources2);
                        str2 = strInvoke == null ? "-" : strInvoke;
                    }
                    OptionsSimulatedChartHeaderState.PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader3 = portfolioRiskAnalyzerHeader;
                    if (portfolioRiskAnalyzerHeader3 != null) {
                        Function1<Resources, String> maxLoss = portfolioRiskAnalyzerHeader3.getMaxLoss();
                        Resources resources3 = resources;
                        Intrinsics.checkNotNull(resources3);
                        String strInvoke2 = maxLoss.invoke(resources3);
                        str3 = strInvoke2 == null ? "-" : strInvoke2;
                    }
                    OptionsPortfolioRiskAnalyzerChartFooter.OptionsPortfolioRiskAnalyzerChartFooter(str2, str3, null, composer, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
            LazyListScope.item$default(LazyColumn, OptionsPortfolioRiskAnalyzerComposableKt.KEY_SLIDER, null, ComposableLambda3.composableLambdaInstance(-1265150481, true, new C23443xa20abbe0(optionsSimulatedReturnTimeSliderDuxo, snapshotState)), 2, null);
            LazyListScope.item$default(LazyColumn, OptionsPortfolioRiskAnalyzerComposableKt.KEY_POSITIONS_SECTION_HEADER, null, ComposableLambda3.composableLambdaInstance(26320142, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$5
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
                        ComposerKt.traceEventStart(26320142, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:319)");
                    }
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer, 6, 0);
                    String headerCtaString = OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$7(snapshotState4).getHeaderCtaString();
                    OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo2 = optionsPortfolioRiskAnalyzerPositionDuxo;
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo2);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new C23445xe4a8fd3b(optionsPortfolioRiskAnalyzerPositionDuxo2);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    OptionsPortfolioRiskAnalyzerPositionHeader.OptionsPortfolioRiskAnalyzerPositionHeader(headerCtaString, modifierM21623defaultHorizontalPaddingrAjV9yQ, (Function0) ((KFunction) objRememberedValue), composer, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
            OptionsPortfolioRiskAnalyzerEquityPositionRowViewState equityPositionRow = invoke$lambda$40$lambda$7(snapshotState4).getEquityPositionRow();
            if (equityPositionRow != null) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-731455987, true, new C23446xa20abbe2(optionsPortfolioRiskAnalyzerPositionDuxo, equityPositionRow, snapshotState42, function1)), 3, null);
                lazyListScope = LazyColumn;
            } else {
                lazyListScope = LazyColumn;
            }
            final ImmutableList<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate> optionPositionRows = invoke$lambda$40$lambda$7(snapshotState4).getOptionPositionRows();
            final Function1 function13 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$39$lambda$34$lambda$33$lambda$26((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) obj);
                }
            };
            final C23430x6c277e82 c23430x6c277e82 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$lambda$39$lambda$34$lambda$33$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate aggregate) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) obj);
                }
            };
            lazyListScope.items(optionPositionRows.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$lambda$39$lambda$34$lambda$33$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function13.invoke(optionPositionRows.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$lambda$39$lambda$34$lambda$33$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c23430x6c277e82.invoke(optionPositionRows.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$lambda$39$lambda$34$lambda$33$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate aggregate = (OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate) optionPositionRows.get(i);
                    composer.startReplaceGroup(1574058003);
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new C23448xe4d343be(optionsPortfolioRiskAnalyzerPositionDuxo);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    KFunction kFunction = (KFunction) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new C23449xe4d3477f(optionsPortfolioRiskAnalyzerPositionDuxo);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    KFunction kFunction2 = (KFunction) objRememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new C23450xe4d34b40(optionsPortfolioRiskAnalyzerPositionDuxo);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    KFunction kFunction3 = (KFunction) objRememberedValue3;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composer.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new C23451xe4d34f01(optionsPortfolioRiskAnalyzerPositionDuxo);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceGroup();
                    Function2 function2 = (Function2) kFunction;
                    Function2 function22 = (Function2) kFunction2;
                    Function3 function3 = (Function3) kFunction3;
                    Function4 function4 = (Function4) ((KFunction) objRememberedValue4);
                    OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo2 = optionsPortfolioRiskAnalyzerPositionDuxo;
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function12) | composer.changed(str);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function14 = function12;
                        final String str2 = str;
                        objRememberedValue5 = new Function1<UUID, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$8$5$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(UUID uuid) {
                                invoke2(uuid);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(UUID aggregatePositionId) {
                                Intrinsics.checkNotNullParameter(aggregatePositionId, "aggregatePositionId");
                                function14.invoke(new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.AggregatePositionId(aggregatePositionId, CollectionsKt.listOf(aggregatePositionId), str2, null, 8, null)));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    composer.endReplaceGroup();
                    OptionsPortfolioRiskAnalyzerOptionPositionRow.OptionsPortfolioRiskAnalyzerOptionPositionRow(aggregate, function2, function22, function3, function4, null, optionsPortfolioRiskAnalyzerPositionDuxo2, (Function1) objRememberedValue5, composer, 0, 32);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.INSTANCE.m2248xdf0a4e11(), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$40$lambda$39$lambda$34$lambda$33$lambda$26(OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getRowId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$40$lambda$39$lambda$36$lambda$35(LazyListState lazyListState) {
            return lazyListState.getFirstVisibleItemIndex() > 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LifecyclePauseOrDisposeEffectResult invoke$lambda$40$lambda$21$lambda$20(UUID uuid, OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
            Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
            if (uuid != null) {
                final Job jobBind = optionsPortfolioRiskAnalyzerPositionDuxo.bind(uuid);
                return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$lambda$21$lambda$20$$inlined$onPauseOrDispose$2
                    @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
                    public void runPauseOrOnDisposeEffect() {
                        Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
                    }
                };
            }
            return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$invoke$lambda$40$lambda$21$lambda$20$$inlined$onPauseOrDispose$1
                @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
                public void runPauseOrOnDisposeEffect() {
                }
            };
        }
    }

    private static final OptionsPortfolioRiskAnalyzerViewState OptionsPortfolioRiskAnalyzerComposable$lambda$0(SnapshotState4<OptionsPortfolioRiskAnalyzerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void LoadedContent(final OptionsPortfolioRiskAnalyzerViewState optionsPortfolioRiskAnalyzerViewState, final Function1<? super UUID, Unit> function1, final SavedStateHandle savedStateHandle, final Function0<Unit> function0, final Function1<? super FragmentKey, Unit> function12, final Function1<? super FragmentKey, Unit> function13, Modifier modifier, Composer composer, final int i, final int i2) {
        OptionsPortfolioRiskAnalyzerViewState optionsPortfolioRiskAnalyzerViewState2;
        int i3;
        Function1<? super FragmentKey, Unit> function14;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-700229078);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            optionsPortfolioRiskAnalyzerViewState2 = optionsPortfolioRiskAnalyzerViewState;
        } else if ((i & 6) == 0) {
            optionsPortfolioRiskAnalyzerViewState2 = optionsPortfolioRiskAnalyzerViewState;
            i3 = (composerStartRestartGroup.changedInstance(optionsPortfolioRiskAnalyzerViewState2) ? 4 : 2) | i;
        } else {
            optionsPortfolioRiskAnalyzerViewState2 = optionsPortfolioRiskAnalyzerViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(savedStateHandle) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else {
                if ((i & 196608) == 0) {
                    function14 = function13;
                    i3 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                }
                i4 = i2 & 64;
                if (i4 == 0) {
                    if ((1572864 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-700229078, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadedContent (OptionsPortfolioRiskAnalyzerComposable.kt:98)");
                        }
                        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                        LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                        Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z = (i3 & 112) != 32;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OptionsPortfolioRiskAnalyzerComposableKt.LoadedContent$lambda$4$lambda$3(function1, (UUID) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ObserveResult.ObserveResult(savedStateHandle, OptionsPortfolioRiskAnalyzerNavDestinations2.KEY_POSITION_ROW_SELECTION, (Function1) objRememberedValue2, composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1713799954, true, new C234352(coroutineScope, lazyListStateRememberLazyListState, function0), composerStartRestartGroup, 54);
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1194182087, true, new C234363(optionsPortfolioRiskAnalyzerViewState2, function1, lifecycleAwareNavigator, lazyListStateRememberLazyListState, function12, resources, function14), composerStartRestartGroup, 54);
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, composableLambdaRememberComposableLambda2, composer2, 805306416, 316);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return OptionsPortfolioRiskAnalyzerComposableKt.LoadedContent$lambda$5(optionsPortfolioRiskAnalyzerViewState, function1, savedStateHandle, function0, function12, function13, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                modifier2 = modifier;
                if ((599187 & i3) == 599186) {
                    if (i4 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                    LifecycleAwareNavigator lifecycleAwareNavigator2 = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                    Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 112) != 32) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionsPortfolioRiskAnalyzerComposableKt.LoadedContent$lambda$4$lambda$3(function1, (UUID) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        ObserveResult.ObserveResult(savedStateHandle, OptionsPortfolioRiskAnalyzerNavDestinations2.KEY_POSITION_ROW_SELECTION, (Function1) objRememberedValue2, composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                        ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-1713799954, true, new C234352(coroutineScope2, lazyListStateRememberLazyListState2, function0), composerStartRestartGroup, 54);
                        ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-1194182087, true, new C234363(optionsPortfolioRiskAnalyzerViewState2, function1, lifecycleAwareNavigator2, lazyListStateRememberLazyListState2, function12, resources2, function14), composerStartRestartGroup, 54);
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default2, composableLambdaRememberComposableLambda3, null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, composableLambdaRememberComposableLambda22, composer2, 805306416, 316);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function14 = function13;
            i4 = i2 & 64;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 32) == 0) {
        }
        function14 = function13;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$4$lambda$3(Function1 function1, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        function1.invoke(id);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$2 */
    static final class C234352 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ LazyListState $lazyListState;
        final /* synthetic */ Function0<Unit> $onBackPressed;

        C234352(CoroutineScope coroutineScope, LazyListState lazyListState, Function0<Unit> function0) {
            this.$coroutineScope = coroutineScope;
            this.$lazyListState = lazyListState;
            this.$onBackPressed = function0;
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
                ComposerKt.traceEventStart(-1713799954, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadedContent.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:119)");
            }
            AppBarType appBarType = AppBarType.CENTER_ALIGNED;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSource2.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$coroutineScope) | composer.changed(this.$lazyListState);
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final LazyListState lazyListState = this.$lazyListState;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsPortfolioRiskAnalyzerComposableKt.C234352.invoke$lambda$2$lambda$1(coroutineScope, lazyListState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(ClickableKt.m4891clickableO2vRcR0$default(companion, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), OptionsPortfolioRiskAnalyzerComposableKt.TEST_TAG_TOP_BAR);
            Function2<Composer, Integer, Unit> function2M2240xb7a6989 = ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.INSTANCE.m2240xb7a6989();
            final Function0<Unit> function0 = this.$onBackPressed;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2240xb7a6989, modifierTestTag, ComposableLambda3.rememberComposableLambda(-287004881, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt.LoadedContent.2.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                    invoke(bentoAppBarScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i2 & 6) == 0) {
                        i2 |= (i2 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i2 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-287004881, i2, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadedContent.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:127)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer2, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), null, null, false, false, appBarType, null, 0L, null, composer, 12583302, 0, 1912);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(CoroutineScope coroutineScope, LazyListState lazyListState) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$2$2$1$1(lazyListState, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final void LoadingContent(final boolean z, final Function0<Unit> onBackPressed, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1290381770);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1290381770, i2, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadingContent (OptionsPortfolioRiskAnalyzerComposable.kt:389)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt = ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.m2249x3ae9b627(), null, ComposableLambda3.rememberComposableLambda(1530617843, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadingContent$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                    invoke(bentoAppBarScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1530617843, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadingContent.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:402)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBackPressed, composer2, (BentoAppBarScope.$stable << 12) | ((i3 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composerStartRestartGroup, 12583302, 0, 1914);
            LocalShowPlaceholder.Loadable(z, null, null, composableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.m2251x586b0442(), composerStartRestartGroup, (i2 & 14) | 3072, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsPortfolioRiskAnalyzerComposableKt.LoadingContent$lambda$7(z, onBackPressed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
