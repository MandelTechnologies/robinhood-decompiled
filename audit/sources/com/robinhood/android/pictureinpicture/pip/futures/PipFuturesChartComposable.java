package com.robinhood.android.pictureinpicture.pip.futures;

import android.annotation.SuppressLint;
import android.os.Parcelable;
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
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.scarlet.ScarletManager;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: PipFuturesChartComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"PipFuturesChartComposable", "", "contractId", "Ljava/util/UUID;", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/pictureinpicture/pip/futures/PipFuturesDuxo;", "(Ljava/util/UUID;Lcom/robinhood/scarlet/ScarletManager;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/pictureinpicture/pip/futures/PipFuturesDuxo;Landroidx/compose/runtime/Composer;II)V", "FuturesChart", "viewState", "Lcom/robinhood/android/pictureinpicture/pip/futures/PipFuturesViewState;", "(Lcom/robinhood/android/pictureinpicture/pip/futures/PipFuturesViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-pip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PipFuturesChartComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesChart$lambda$2(PipFuturesViewState pipFuturesViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesChart(pipFuturesViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PipFuturesChartComposable$lambda$1(UUID uuid, ScarletManager scarletManager, Modifier modifier, PipFuturesDuxo pipFuturesDuxo, int i, int i2, Composer composer, int i3) {
        PipFuturesChartComposable(uuid, scarletManager, modifier, pipFuturesDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PipFuturesChartComposable(final UUID contractId, final ScarletManager scarletManager, Modifier modifier, PipFuturesDuxo pipFuturesDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PipFuturesDuxo pipFuturesDuxo2;
        final Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        int i4;
        PipFuturesDuxo pipFuturesDuxo3;
        final PipFuturesDuxo pipFuturesDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-94851730);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(contractId) ? 4 : 2) | i;
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
                    pipFuturesDuxo2 = pipFuturesDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(pipFuturesDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    pipFuturesDuxo2 = pipFuturesDuxo;
                }
                i3 |= i6;
            } else {
                pipFuturesDuxo2 = pipFuturesDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        String str = "pip_futures_" + contractId;
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PipFuturesDuxo.class), current, str, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt$PipFuturesChartComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt$PipFuturesChartComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        PipFuturesDuxo pipFuturesDuxo5 = (PipFuturesDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                        pipFuturesDuxo3 = pipFuturesDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-94851730, i4, -1, "com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable (PipFuturesChartComposable.kt:38)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(pipFuturesDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Composer composer2 = composerStartRestartGroup;
                    BentoTheme2.BentoTheme(Boolean.valueOf(DayNightChanges.isDay(scarletManager)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1819101402, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.PipFuturesChartComposable.1
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
                                ComposerKt.traceEventStart(-1819101402, i7, -1, "com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable.<anonymous> (PipFuturesChartComposable.kt:41)");
                            }
                            final SnapshotState4<PipFuturesViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            final Modifier modifier5 = modifier3;
                            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1453466428, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.PipFuturesChartComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1453466428, i8, -1, "com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable.<anonymous>.<anonymous> (PipFuturesChartComposable.kt:42)");
                                    }
                                    boolean loading = PipFuturesChartComposable.PipFuturesChartComposable$lambda$0(snapshotState4).getLoading();
                                    final Modifier modifier6 = modifier5;
                                    final SnapshotState4<PipFuturesViewState> snapshotState42 = snapshotState4;
                                    LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(-85796268, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.PipFuturesChartComposable.1.1.1
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
                                                ComposerKt.traceEventStart(-85796268, i9, -1, "com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable.<anonymous>.<anonymous>.<anonymous> (PipFuturesChartComposable.kt:43)");
                                            }
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i10 = BentoTheme.$stable;
                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer5, i10).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer5, i10).m21590getDefaultD9Ej5fM(), 1, null);
                                            SnapshotState4<PipFuturesViewState> snapshotState43 = snapshotState42;
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM5144paddingVpY3zN4$default);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            PipFuturesChartComposable.FuturesChart(PipFuturesChartComposable.PipFuturesChartComposable$lambda$0(snapshotState43), null, composer5, 0, 2);
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
                    }, composerStartRestartGroup, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup = composer2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    pipFuturesDuxo4 = pipFuturesDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                pipFuturesDuxo3 = pipFuturesDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<PipFuturesViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(pipFuturesDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Composer composer22 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.valueOf(DayNightChanges.isDay(scarletManager)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1819101402, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.PipFuturesChartComposable.1
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
                            ComposerKt.traceEventStart(-1819101402, i7, -1, "com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable.<anonymous> (PipFuturesChartComposable.kt:41)");
                        }
                        final SnapshotState4<PipFuturesViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        final Modifier modifier52 = modifier3;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1453466428, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.PipFuturesChartComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1453466428, i8, -1, "com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable.<anonymous>.<anonymous> (PipFuturesChartComposable.kt:42)");
                                }
                                boolean loading = PipFuturesChartComposable.PipFuturesChartComposable$lambda$0(snapshotState4).getLoading();
                                final Modifier modifier6 = modifier52;
                                final SnapshotState4<PipFuturesViewState> snapshotState42 = snapshotState4;
                                LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(-85796268, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.PipFuturesChartComposable.1.1.1
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
                                            ComposerKt.traceEventStart(-85796268, i9, -1, "com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable.<anonymous>.<anonymous>.<anonymous> (PipFuturesChartComposable.kt:43)");
                                        }
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer5, i10).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer5, i10).m21590getDefaultD9Ej5fM(), 1, null);
                                        SnapshotState4<PipFuturesViewState> snapshotState43 = snapshotState42;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM5144paddingVpY3zN4$default);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        PipFuturesChartComposable.FuturesChart(PipFuturesChartComposable.PipFuturesChartComposable$lambda$0(snapshotState43), null, composer5, 0, 2);
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
                }, composerStartRestartGroup, 54), composer22, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                composerStartRestartGroup = composer22;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                pipFuturesDuxo4 = pipFuturesDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                pipFuturesDuxo4 = pipFuturesDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PipFuturesChartComposable.PipFuturesChartComposable$lambda$1(contractId, scarletManager, modifier4, pipFuturesDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    i4 = i3;
                    pipFuturesDuxo3 = pipFuturesDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<PipFuturesViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(pipFuturesDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Composer composer222 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(Boolean.valueOf(DayNightChanges.isDay(scarletManager)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1819101402, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.PipFuturesChartComposable.1
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
                            ComposerKt.traceEventStart(-1819101402, i7, -1, "com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable.<anonymous> (PipFuturesChartComposable.kt:41)");
                        }
                        final SnapshotState4<PipFuturesViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle22;
                        final Modifier modifier522 = modifier3;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1453466428, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.PipFuturesChartComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1453466428, i8, -1, "com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable.<anonymous>.<anonymous> (PipFuturesChartComposable.kt:42)");
                                }
                                boolean loading = PipFuturesChartComposable.PipFuturesChartComposable$lambda$0(snapshotState4).getLoading();
                                final Modifier modifier6 = modifier522;
                                final SnapshotState4<PipFuturesViewState> snapshotState42 = snapshotState4;
                                LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(-85796268, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.PipFuturesChartComposable.1.1.1
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
                                            ComposerKt.traceEventStart(-85796268, i9, -1, "com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable.<anonymous>.<anonymous>.<anonymous> (PipFuturesChartComposable.kt:43)");
                                        }
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer5, i10).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer5, i10).m21590getDefaultD9Ej5fM(), 1, null);
                                        SnapshotState4<PipFuturesViewState> snapshotState43 = snapshotState42;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM5144paddingVpY3zN4$default);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        PipFuturesChartComposable.FuturesChart(PipFuturesChartComposable.PipFuturesChartComposable$lambda$0(snapshotState43), null, composer5, 0, 2);
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
                }, composerStartRestartGroup, 54), composer222, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                composerStartRestartGroup = composer222;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                pipFuturesDuxo4 = pipFuturesDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void FuturesChart(final PipFuturesViewState pipFuturesViewState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-726357248);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pipFuturesViewState) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-726357248, i3, -1, "com.robinhood.android.pictureinpicture.pip.futures.FuturesChart (PipFuturesChartComposable.kt:61)");
            }
            BoxWithConstraints.BoxWithConstraints(modifier2, null, false, ComposableLambda3.rememberComposableLambda(377043158, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.FuturesChart.1
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
                        ComposerKt.traceEventStart(377043158, i5, -1, "com.robinhood.android.pictureinpicture.pip.futures.FuturesChart.<anonymous> (PipFuturesChartComposable.kt:63)");
                    }
                    BentoTheme4 direction = pipFuturesViewState.getDirection();
                    final PipFuturesViewState pipFuturesViewState2 = pipFuturesViewState;
                    BentoThemeOverlays.DirectionThemeOverlay(direction, ComposableLambda3.rememberComposableLambda(775927664, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt.FuturesChart.1.1
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
                                ComposerKt.traceEventStart(775927664, i6, -1, "com.robinhood.android.pictureinpicture.pip.futures.FuturesChart.<anonymous>.<anonymous> (PipFuturesChartComposable.kt:64)");
                            }
                            PipFuturesViewState pipFuturesViewState3 = pipFuturesViewState2;
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
                            Modifier modifierWithBentoPillPlaceholder$default = LocalShowPlaceholder.withBentoPillPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21595getXsmallD9Ej5fM(), 6, null), false, 1, null);
                            String contractSymbol = pipFuturesViewState3.getContractSymbol();
                            if (contractSymbol == null) {
                                contractSymbol = "";
                            }
                            TextStyle textS = bentoTheme.getTypography(composer3, i7).getTextS();
                            String str = contractSymbol;
                            BentoText2.m20747BentoText38GnDrw(str, modifierWithBentoPillPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, iM7959getEllipsisgIe3tQ8, false, 0, 0, null, 0, textS, composer3, 12607488, 0, 8040);
                            ChartDataPerformanceComposable.ChartDataPerformanceComposable(pipFuturesViewState3.getDisplayData(), null, composer3, 0, 2);
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Clip.clipToBounds(companion), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            List<ChartFill> fills = pipFuturesViewState3.getFills();
                            List<Line> lines = pipFuturesViewState3.getLines();
                            List<UIComponent<Parcelable>> overlays = pipFuturesViewState3.getOverlays();
                            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer3, 0);
                            boolean loading = pipFuturesViewState3.getLoading();
                            composer3.startReplaceGroup(977840936);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer3.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue == companion3.getEmpty()) {
                                objRememberedValue = new Function1<Point, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt$FuturesChart$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$1
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
                                objRememberedValue2 = new Function1<List<? extends com.robinhood.models.serverdriven.experimental.api.Point>, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt$FuturesChart$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$2
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
                                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt$FuturesChart$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$3
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
                            SduiChartMappersKt.SduiSegmentedLineChart(modifierM5146paddingqDBjuR0$default, fills, lines, overlays, sduiActionHandlerCurrentActionHandler, function1, function12, (Function0) objRememberedValue3, loading, false, null, 0.0f, Parcelable.class, composer3, 805306368, 0, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PipFuturesChartComposable.FuturesChart$lambda$2(pipFuturesViewState, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PipFuturesViewState PipFuturesChartComposable$lambda$0(SnapshotState4<PipFuturesViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
