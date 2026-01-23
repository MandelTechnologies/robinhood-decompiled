package com.robinhood.android.pictureinpicture.pip.options;

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
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.pictureinpicture.pip.options.PipOptionsViewState;
import com.robinhood.android.pictureinpicture.pip.shared.ChartDataPerformanceComposable;
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
import java.util.List;
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

/* compiled from: PipOptionsChartComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\n\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"PipOptionsChartComposable", "", "strategyCode", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsDuxo;Landroidx/compose/runtime/Composer;II)V", "OptionsChart", "viewState", "Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState$OptionsViewState;", "(Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState$OptionsViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-pip_externalDebug", "Lcom/robinhood/android/pictureinpicture/pip/options/PipOptionsViewState;", "delayedVisibility", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PipOptionsChartComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsChart$lambda$6(PipOptionsViewState.OptionsViewState optionsViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsChart(optionsViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PipOptionsChartComposable$lambda$5(String str, Modifier modifier, PipOptionsDuxo pipOptionsDuxo, int i, int i2, Composer composer, int i3) {
        PipOptionsChartComposable(str, modifier, pipOptionsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PipOptionsChartComposable(final String strategyCode, Modifier modifier, PipOptionsDuxo pipOptionsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PipOptionsDuxo pipOptionsDuxo2;
        int i4;
        PipOptionsDuxo pipOptionsDuxo3;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final PipOptionsDuxo pipOptionsDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2023548133);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(strategyCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    pipOptionsDuxo2 = pipOptionsDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(pipOptionsDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    pipOptionsDuxo2 = pipOptionsDuxo;
                }
                i3 |= i6;
            } else {
                pipOptionsDuxo2 = pipOptionsDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        String str = "pip_" + strategyCode;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PipOptionsDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt$PipOptionsChartComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt$PipOptionsChartComposable$$inlined$duxo$1.1
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
                        pipOptionsDuxo3 = (PipOptionsDuxo) baseDuxo;
                        i4 = i3 & (-897);
                    } else {
                        i4 = i3;
                        pipOptionsDuxo3 = pipOptionsDuxo2;
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    pipOptionsDuxo3 = pipOptionsDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2023548133, i4, -1, "com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposable (PipOptionsChartComposable.kt:47)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(pipOptionsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
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
                    objRememberedValue2 = new PipOptionsChartComposable2(snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(84125283, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt.PipOptionsChartComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(84125283, i7, -1, "com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposable.<anonymous> (PipOptionsChartComposable.kt:57)");
                        }
                        boolean zPipOptionsChartComposable$lambda$2 = PipOptionsChartComposable.PipOptionsChartComposable$lambda$2(snapshotState);
                        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                        ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                        final SnapshotState4<PipOptionsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        final Modifier modifier5 = modifier3;
                        AnimatedVisibilityKt.AnimatedVisibility(zPipOptionsChartComposable$lambda$2, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambda3.rememberComposableLambda(1905166475, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt.PipOptionsChartComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1905166475, i8, -1, "com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposable.<anonymous>.<anonymous> (PipOptionsChartComposable.kt:62)");
                                }
                                final SnapshotState4<PipOptionsViewState> snapshotState42 = snapshotState4;
                                final Modifier modifier6 = modifier5;
                                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-741136595, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt.PipOptionsChartComposable.2.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i9) {
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-741136595, i9, -1, "com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposable.<anonymous>.<anonymous>.<anonymous> (PipOptionsChartComposable.kt:63)");
                                        }
                                        boolean loading = PipOptionsChartComposable.PipOptionsChartComposable$lambda$0(snapshotState42).getLoading();
                                        final Modifier modifier7 = modifier6;
                                        final SnapshotState4<PipOptionsViewState> snapshotState43 = snapshotState42;
                                        LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(1496627101, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt.PipOptionsChartComposable.2.1.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i10) {
                                                if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1496627101, i10, -1, "com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PipOptionsChartComposable.kt:64)");
                                                }
                                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, null);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i11 = BentoTheme.$stable;
                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer5, i11).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer5, i11).m21590getDefaultD9Ej5fM(), 1, null);
                                                SnapshotState4<PipOptionsViewState> snapshotState44 = snapshotState43;
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM5144paddingVpY3zN4$default);
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                if (composer5.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                PipOptionsViewState pipOptionsViewStatePipOptionsChartComposable$lambda$0 = PipOptionsChartComposable.PipOptionsChartComposable$lambda$0(snapshotState44);
                                                composer5.startReplaceGroup(334206890);
                                                if (!(pipOptionsViewStatePipOptionsChartComposable$lambda$0 instanceof PipOptionsViewState.OptionsViewState)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                PipOptionsChartComposable.OptionsChart((PipOptionsViewState.OptionsViewState) pipOptionsViewStatePipOptionsChartComposable$lambda$0, null, composer5, 0, 2);
                                                composer5.endReplaceGroup();
                                                composer5.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 200064, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                pipOptionsDuxo4 = pipOptionsDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                pipOptionsDuxo4 = pipOptionsDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PipOptionsChartComposable.PipOptionsChartComposable$lambda$5(strategyCode, modifier3, pipOptionsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                modifier3 = modifier4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends PipOptionsViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(pipOptionsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
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
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(84125283, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt.PipOptionsChartComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(84125283, i7, -1, "com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposable.<anonymous> (PipOptionsChartComposable.kt:57)");
                        }
                        boolean zPipOptionsChartComposable$lambda$2 = PipOptionsChartComposable.PipOptionsChartComposable$lambda$2(snapshotState2);
                        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                        ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                        final SnapshotState4<? extends PipOptionsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        final Modifier modifier5 = modifier3;
                        AnimatedVisibilityKt.AnimatedVisibility(zPipOptionsChartComposable$lambda$2, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambda3.rememberComposableLambda(1905166475, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt.PipOptionsChartComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1905166475, i8, -1, "com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposable.<anonymous>.<anonymous> (PipOptionsChartComposable.kt:62)");
                                }
                                final SnapshotState4<? extends PipOptionsViewState> snapshotState42 = snapshotState4;
                                final Modifier modifier6 = modifier5;
                                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-741136595, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt.PipOptionsChartComposable.2.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i9) {
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-741136595, i9, -1, "com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposable.<anonymous>.<anonymous>.<anonymous> (PipOptionsChartComposable.kt:63)");
                                        }
                                        boolean loading = PipOptionsChartComposable.PipOptionsChartComposable$lambda$0(snapshotState42).getLoading();
                                        final Modifier modifier7 = modifier6;
                                        final SnapshotState4<? extends PipOptionsViewState> snapshotState43 = snapshotState42;
                                        LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(1496627101, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt.PipOptionsChartComposable.2.1.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i10) {
                                                if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1496627101, i10, -1, "com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PipOptionsChartComposable.kt:64)");
                                                }
                                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, null);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i11 = BentoTheme.$stable;
                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer5, i11).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer5, i11).m21590getDefaultD9Ej5fM(), 1, null);
                                                SnapshotState4<PipOptionsViewState> snapshotState44 = snapshotState43;
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM5144paddingVpY3zN4$default);
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                if (composer5.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                PipOptionsViewState pipOptionsViewStatePipOptionsChartComposable$lambda$0 = PipOptionsChartComposable.PipOptionsChartComposable$lambda$0(snapshotState44);
                                                composer5.startReplaceGroup(334206890);
                                                if (!(pipOptionsViewStatePipOptionsChartComposable$lambda$0 instanceof PipOptionsViewState.OptionsViewState)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                PipOptionsChartComposable.OptionsChart((PipOptionsViewState.OptionsViewState) pipOptionsViewStatePipOptionsChartComposable$lambda$0, null, composer5, 0, 2);
                                                composer5.endReplaceGroup();
                                                composer5.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 200064, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                pipOptionsDuxo4 = pipOptionsDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PipOptionsChartComposable$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PipOptionsViewState PipOptionsChartComposable$lambda$0(SnapshotState4<? extends PipOptionsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PipOptionsChartComposable$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void OptionsChart(final PipOptionsViewState.OptionsViewState viewState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1863423003);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(1863423003, i3, -1, "com.robinhood.android.pictureinpicture.pip.options.OptionsChart (PipOptionsChartComposable.kt:87)");
            }
            BoxWithConstraints.BoxWithConstraints(modifier2, null, false, ComposableLambda3.rememberComposableLambda(1014875653, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt.OptionsChart.1
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
                        ComposerKt.traceEventStart(1014875653, i5, -1, "com.robinhood.android.pictureinpicture.pip.options.OptionsChart.<anonymous> (PipOptionsChartComposable.kt:89)");
                    }
                    BentoTheme4 colorDirection = viewState.getColorDirection();
                    final PipOptionsViewState.OptionsViewState optionsViewState = viewState;
                    BentoThemeOverlays.DirectionThemeOverlay(colorDirection, ComposableLambda3.rememberComposableLambda(822566315, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt.OptionsChart.1.1
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
                                ComposerKt.traceEventStart(822566315, i6, -1, "com.robinhood.android.pictureinpicture.pip.options.OptionsChart.<anonymous>.<anonymous> (PipOptionsChartComposable.kt:92)");
                            }
                            PipOptionsViewState.OptionsViewState optionsViewState2 = optionsViewState;
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
                            String displayName = optionsViewState2.getDisplayName();
                            if (displayName == null) {
                                displayName = "";
                            }
                            TextStyle textS = bentoTheme.getTypography(composer3, i7).getTextS();
                            String str = displayName;
                            BentoText2.m20747BentoText38GnDrw(str, modifierWithBentoPillPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, iM7959getEllipsisgIe3tQ8, false, 0, 0, null, 0, textS, composer3, 12607488, 0, 8040);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21595getXsmallD9Ej5fM()), composer3, 0);
                            ChartDataPerformanceComposable.ChartDataPerformanceComposable(optionsViewState2.getDisplayData(), null, composer3, 0, 2);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM()), composer3, 0);
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Clip.clipToBounds(companion), 0.0f, 1, null);
                            ImmutableList<ChartFill> fills = optionsViewState2.getFills();
                            ImmutableList<Line> lines = optionsViewState2.getLines();
                            ImmutableList<UIComponent<GenericAction>> overlays = optionsViewState2.getOverlays();
                            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer3, 0);
                            boolean loading = optionsViewState2.getLoading();
                            composer3.startReplaceGroup(977840936);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer3.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue == companion3.getEmpty()) {
                                objRememberedValue = new Function1<Point, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt$OptionsChart$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$1
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
                                objRememberedValue2 = new Function1<List<? extends com.robinhood.models.serverdriven.experimental.api.Point>, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt$OptionsChart$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$2
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
                                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt$OptionsChart$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$3
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PipOptionsChartComposable.OptionsChart$lambda$6(viewState, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
