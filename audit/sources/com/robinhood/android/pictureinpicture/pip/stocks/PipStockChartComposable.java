package com.robinhood.android.pictureinpicture.pip.stocks;

import android.annotation.SuppressLint;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.pictureinpicture.pip.shared.ChartDataPerformanceComposable;
import com.robinhood.android.pictureinpicture.pip.stocks.PipStockViewState;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.scarlet.ScarletManager;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PipStockChartComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"StockChartPipComposable", "", "instrumentId", "Ljava/util/UUID;", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockDuxo;", "(Ljava/util/UUID;Lcom/robinhood/scarlet/ScarletManager;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockDuxo;Landroidx/compose/runtime/Composer;II)V", "StockChart", "viewState", "Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState$StocksViewState;", "(Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState$StocksViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-pip_externalDebug", "Lcom/robinhood/android/pictureinpicture/pip/stocks/PipStockViewState;", "delayedVisibility", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PipStockChartComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StockChart$lambda$6(PipStockViewState.StocksViewState stocksViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StockChart(stocksViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StockChartPipComposable$lambda$5(UUID uuid, ScarletManager scarletManager, Modifier modifier, PipStockDuxo pipStockDuxo, int i, int i2, Composer composer, int i3) {
        StockChartPipComposable(uuid, scarletManager, modifier, pipStockDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StockChartPipComposable(final UUID instrumentId, final ScarletManager scarletManager, Modifier modifier, PipStockDuxo pipStockDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PipStockDuxo pipStockDuxo2;
        int i4;
        PipStockDuxo pipStockDuxo3;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final PipStockDuxo pipStockDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1666987965);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(scarletManager) : composerStartRestartGroup.changedInstance(scarletManager) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    pipStockDuxo2 = pipStockDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(pipStockDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    pipStockDuxo2 = pipStockDuxo;
                }
                i3 |= i6;
            } else {
                pipStockDuxo2 = pipStockDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        String str = "pip_" + instrumentId;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PipStockDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt$StockChartPipComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt$StockChartPipComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        pipStockDuxo3 = (PipStockDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                    } else {
                        i4 = i3;
                        pipStockDuxo3 = pipStockDuxo2;
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    pipStockDuxo3 = pipStockDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1666987965, i4, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChartPipComposable (PipStockChartComposable.kt:48)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(pipStockDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new PipStockChartComposable2(snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                Composer composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.valueOf(DayNightChanges.isDay(scarletManager)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1160822155, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt.StockChartPipComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1160822155, i7, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChartPipComposable.<anonymous> (PipStockChartComposable.kt:60)");
                        }
                        boolean zStockChartPipComposable$lambda$2 = PipStockChartComposable.StockChartPipComposable$lambda$2(snapshotState);
                        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                        ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                        final SnapshotState4<PipStockViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        final Modifier modifier5 = modifier3;
                        AnimatedVisibilityKt.AnimatedVisibility(zStockChartPipComposable$lambda$2, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambda3.rememberComposableLambda(646144435, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt.StockChartPipComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                invoke(animatedVisibilityScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(646144435, i8, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChartPipComposable.<anonymous>.<anonymous> (PipStockChartComposable.kt:65)");
                                }
                                final SnapshotState4<PipStockViewState> snapshotState42 = snapshotState4;
                                final Modifier modifier6 = modifier5;
                                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(1477115605, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt.StockChartPipComposable.2.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i9) {
                                        if ((i9 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1477115605, i9, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChartPipComposable.<anonymous>.<anonymous>.<anonymous> (PipStockChartComposable.kt:66)");
                                        }
                                        boolean loading = PipStockChartComposable.StockChartPipComposable$lambda$0(snapshotState42).getLoading();
                                        final Modifier modifier7 = modifier6;
                                        final SnapshotState4<PipStockViewState> snapshotState43 = snapshotState42;
                                        LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(918190917, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt.StockChartPipComposable.2.1.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer6, int i10) {
                                                if ((i10 & 3) == 2 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(918190917, i10, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChartPipComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PipStockChartComposable.kt:67)");
                                                }
                                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, null);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i11 = BentoTheme.$stable;
                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer6, i11).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer6, i11).m21590getDefaultD9Ej5fM(), 1, null);
                                                SnapshotState4<PipStockViewState> snapshotState44 = snapshotState43;
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierM5144paddingVpY3zN4$default);
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                if (composer6.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                PipStockViewState pipStockViewStateStockChartPipComposable$lambda$0 = PipStockChartComposable.StockChartPipComposable$lambda$0(snapshotState44);
                                                composer6.startReplaceGroup(1392590285);
                                                if (!(pipStockViewStateStockChartPipComposable$lambda$0 instanceof PipStockViewState.StocksViewState)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                PipStockChartComposable.StockChart((PipStockViewState.StocksViewState) pipStockViewStateStockChartPipComposable$lambda$0, null, composer6, 0, 2);
                                                composer6.endReplaceGroup();
                                                composer6.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer5, 54), composer5, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 200064, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                pipStockDuxo4 = pipStockDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                pipStockDuxo4 = pipStockDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PipStockChartComposable.StockChartPipComposable$lambda$5(instrumentId, scarletManager, modifier3, pipStockDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                modifier3 = modifier4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends PipStockViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(pipStockDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                Composer composer22 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.valueOf(DayNightChanges.isDay(scarletManager)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1160822155, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt.StockChartPipComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1160822155, i7, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChartPipComposable.<anonymous> (PipStockChartComposable.kt:60)");
                        }
                        boolean zStockChartPipComposable$lambda$2 = PipStockChartComposable.StockChartPipComposable$lambda$2(snapshotState2);
                        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                        ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                        final SnapshotState4<? extends PipStockViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        final Modifier modifier5 = modifier3;
                        AnimatedVisibilityKt.AnimatedVisibility(zStockChartPipComposable$lambda$2, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambda3.rememberComposableLambda(646144435, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt.StockChartPipComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                invoke(animatedVisibilityScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(646144435, i8, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChartPipComposable.<anonymous>.<anonymous> (PipStockChartComposable.kt:65)");
                                }
                                final SnapshotState4<? extends PipStockViewState> snapshotState42 = snapshotState4;
                                final Modifier modifier6 = modifier5;
                                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(1477115605, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt.StockChartPipComposable.2.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i9) {
                                        if ((i9 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1477115605, i9, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChartPipComposable.<anonymous>.<anonymous>.<anonymous> (PipStockChartComposable.kt:66)");
                                        }
                                        boolean loading = PipStockChartComposable.StockChartPipComposable$lambda$0(snapshotState42).getLoading();
                                        final Modifier modifier7 = modifier6;
                                        final SnapshotState4<? extends PipStockViewState> snapshotState43 = snapshotState42;
                                        LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(918190917, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt.StockChartPipComposable.2.1.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer6, int i10) {
                                                if ((i10 & 3) == 2 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(918190917, i10, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChartPipComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PipStockChartComposable.kt:67)");
                                                }
                                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, null);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i11 = BentoTheme.$stable;
                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer6, i11).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer6, i11).m21590getDefaultD9Ej5fM(), 1, null);
                                                SnapshotState4<PipStockViewState> snapshotState44 = snapshotState43;
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierM5144paddingVpY3zN4$default);
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                if (composer6.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                PipStockViewState pipStockViewStateStockChartPipComposable$lambda$0 = PipStockChartComposable.StockChartPipComposable$lambda$0(snapshotState44);
                                                composer6.startReplaceGroup(1392590285);
                                                if (!(pipStockViewStateStockChartPipComposable$lambda$0 instanceof PipStockViewState.StocksViewState)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                PipStockChartComposable.StockChart((PipStockViewState.StocksViewState) pipStockViewStateStockChartPipComposable$lambda$0, null, composer6, 0, 2);
                                                composer6.endReplaceGroup();
                                                composer6.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer5, 54), composer5, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 200064, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer22, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                composerStartRestartGroup = composer22;
                if (ComposerKt.isTraceInProgress()) {
                }
                pipStockDuxo4 = pipStockDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StockChartPipComposable$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PipStockViewState StockChartPipComposable$lambda$0(SnapshotState4<? extends PipStockViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StockChartPipComposable$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void StockChart(final PipStockViewState.StocksViewState stocksViewState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(27369271);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(stocksViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(27369271, i3, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChart (PipStockChartComposable.kt:90)");
            }
            BoxWithConstraints.BoxWithConstraints(modifier2, null, false, ComposableLambda3.rememberComposableLambda(-1729361759, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt.StockChart.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1729361759, i5, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChart.<anonymous> (PipStockChartComposable.kt:92)");
                    }
                    BentoTheme4 colorDirection = stocksViewState.getColorDirection();
                    final PipStockViewState.StocksViewState stocksViewState2 = stocksViewState;
                    BentoThemeOverlays.DirectionThemeOverlay(colorDirection, ComposableLambda3.rememberComposableLambda(-1143876409, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt.StockChart.1.1
                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1143876409, i6, -1, "com.robinhood.android.pictureinpicture.pip.stocks.StockChart.<anonymous>.<anonymous> (PipStockChartComposable.kt:95)");
                            }
                            PipStockViewState.StocksViewState stocksViewState3 = stocksViewState2;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            Modifier modifierWithBentoPillPlaceholder$default = LocalShowPlaceholder.withBentoPillPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, 1, null);
                            String tickerSymbol = stocksViewState3.getTickerSymbol();
                            if (tickerSymbol == null) {
                                tickerSymbol = "";
                            }
                            TextStyle textS = bentoTheme.getTypography(composer3, i7).getTextS();
                            String str = tickerSymbol;
                            BentoText2.m20747BentoText38GnDrw(str, modifierWithBentoPillPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, iM7959getEllipsisgIe3tQ8, false, 0, 0, null, 0, textS, composer3, 12607488, 0, 8040);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21595getXsmallD9Ej5fM()), composer3, 0);
                            ChartDataPerformanceComposable.ChartDataPerformanceComposable(stocksViewState3.getDisplayData(), null, composer3, 0, 2);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM()), composer3, 0);
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Clip.clipToBounds(companion), 0.0f, 1, null);
                            ImmutableList<ChartFill> fills = stocksViewState3.getFills();
                            ImmutableList<Line> lines = stocksViewState3.getLines();
                            ImmutableList<UIComponent<GenericAction>> overlays = stocksViewState3.getOverlays();
                            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer3, 0);
                            boolean loading = stocksViewState3.getLoading();
                            composer3.startReplaceGroup(977840936);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer3.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue == companion3.getEmpty()) {
                                objRememberedValue = new Function1<Point, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt$StockChart$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Point it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Point point) {
                                        invoke2(point);
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function1 = (Function1) objRememberedValue;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (objRememberedValue2 == companion3.getEmpty()) {
                                objRememberedValue2 = new Function1<List<? extends com.robinhood.models.serverdriven.experimental.api.Point>, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt$StockChart$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$2
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(List<com.robinhood.models.serverdriven.experimental.api.Point> it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends com.robinhood.models.serverdriven.experimental.api.Point> list) {
                                        invoke2((List<com.robinhood.models.serverdriven.experimental.api.Point>) list);
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function12 = (Function1) objRememberedValue2;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (objRememberedValue3 == companion3.getEmpty()) {
                                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt$StockChart$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$3
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceGroup();
                            SduiChartMappersKt.SduiSegmentedLineChart(modifierFillMaxSize$default, fills, lines, overlays, sduiActionHandlerCurrentActionHandler, function1, function12, (Function0) objRememberedValue3, loading, false, null, 0.05f, GenericAction.class, composer3, 805306374, 48, 0);
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PipStockChartComposable.StockChart$lambda$6(stocksViewState, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
