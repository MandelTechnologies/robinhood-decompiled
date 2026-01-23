package com.robinhood.android.pictureinpicture.pip.crypto;

import android.annotation.SuppressLint;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
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
import com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoViewState;
import com.robinhood.android.pictureinpicture.pip.shared.ChartDataPerformanceComposable;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PipCryptoChartComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\n\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"CryptoChartPipComposable", "", "currencyPairId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoDuxo;", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoDuxo;Landroidx/compose/runtime/Composer;II)V", "CryptoChart", "viewState", "Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoViewState$CryptoViewState;", "(Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoViewState$CryptoViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-pip_externalDebug", "Lcom/robinhood/android/pictureinpicture/pip/crypto/PipCryptoViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PipCryptoChartComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoChart$lambda$2(PipCryptoViewState.CryptoViewState cryptoViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoChart(cryptoViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoChartPipComposable$lambda$1(UUID uuid, Modifier modifier, PipCryptoDuxo pipCryptoDuxo, int i, int i2, Composer composer, int i3) {
        CryptoChartPipComposable(uuid, modifier, pipCryptoDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoChartPipComposable(final UUID currencyPairId, Modifier modifier, PipCryptoDuxo pipCryptoDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PipCryptoDuxo pipCryptoDuxo2;
        final Modifier modifier3;
        int i4;
        PipCryptoDuxo pipCryptoDuxo3;
        final PipCryptoDuxo pipCryptoDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1829346985);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
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
                    pipCryptoDuxo2 = pipCryptoDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(pipCryptoDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    pipCryptoDuxo2 = pipCryptoDuxo;
                }
                i3 |= i6;
            } else {
                pipCryptoDuxo2 = pipCryptoDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        String str = "pip_" + currencyPairId;
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PipCryptoDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt$CryptoChartPipComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt$CryptoChartPipComposable$$inlined$duxo$1.1
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
                        PipCryptoDuxo pipCryptoDuxo5 = (PipCryptoDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        pipCryptoDuxo3 = pipCryptoDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1829346985, i4, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChartPipComposable (PipCryptoChartComposable.kt:43)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(pipCryptoDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-913112417, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt.CryptoChartPipComposable.1
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
                                ComposerKt.traceEventStart(-913112417, i7, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChartPipComposable.<anonymous> (PipCryptoChartComposable.kt:47)");
                            }
                            final SnapshotState4<PipCryptoViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            final Modifier modifier5 = modifier3;
                            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1970047551, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt.CryptoChartPipComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1970047551, i8, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChartPipComposable.<anonymous>.<anonymous> (PipCryptoChartComposable.kt:48)");
                                    }
                                    boolean loading = PipCryptoChartComposable.CryptoChartPipComposable$lambda$0(snapshotState4).getLoading();
                                    final Modifier modifier6 = modifier5;
                                    final SnapshotState4<PipCryptoViewState> snapshotState42 = snapshotState4;
                                    LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(1717617201, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt.CryptoChartPipComposable.1.1.1
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
                                                ComposerKt.traceEventStart(1717617201, i9, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChartPipComposable.<anonymous>.<anonymous>.<anonymous> (PipCryptoChartComposable.kt:49)");
                                            }
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i10 = BentoTheme.$stable;
                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer4, i10).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer4, i10).m21590getDefaultD9Ej5fM(), 1, null);
                                            SnapshotState4<PipCryptoViewState> snapshotState43 = snapshotState42;
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            PipCryptoViewState pipCryptoViewStateCryptoChartPipComposable$lambda$0 = PipCryptoChartComposable.CryptoChartPipComposable$lambda$0(snapshotState43);
                                            composer4.startReplaceGroup(-2129701077);
                                            if (!(pipCryptoViewStateCryptoChartPipComposable$lambda$0 instanceof PipCryptoViewState.CryptoViewState)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            PipCryptoChartComposable.CryptoChart((PipCryptoViewState.CryptoViewState) pipCryptoViewStateCryptoChartPipComposable$lambda$0, null, composer4, 0, 2);
                                            composer4.endReplaceGroup();
                                            composer4.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    pipCryptoDuxo4 = pipCryptoDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                pipCryptoDuxo3 = pipCryptoDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends PipCryptoViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(pipCryptoDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-913112417, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt.CryptoChartPipComposable.1
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
                            ComposerKt.traceEventStart(-913112417, i7, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChartPipComposable.<anonymous> (PipCryptoChartComposable.kt:47)");
                        }
                        final SnapshotState4<? extends PipCryptoViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        final Modifier modifier52 = modifier3;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1970047551, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt.CryptoChartPipComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1970047551, i8, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChartPipComposable.<anonymous>.<anonymous> (PipCryptoChartComposable.kt:48)");
                                }
                                boolean loading = PipCryptoChartComposable.CryptoChartPipComposable$lambda$0(snapshotState4).getLoading();
                                final Modifier modifier6 = modifier52;
                                final SnapshotState4<? extends PipCryptoViewState> snapshotState42 = snapshotState4;
                                LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(1717617201, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt.CryptoChartPipComposable.1.1.1
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
                                            ComposerKt.traceEventStart(1717617201, i9, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChartPipComposable.<anonymous>.<anonymous>.<anonymous> (PipCryptoChartComposable.kt:49)");
                                        }
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer4, i10).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer4, i10).m21590getDefaultD9Ej5fM(), 1, null);
                                        SnapshotState4<PipCryptoViewState> snapshotState43 = snapshotState42;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        PipCryptoViewState pipCryptoViewStateCryptoChartPipComposable$lambda$0 = PipCryptoChartComposable.CryptoChartPipComposable$lambda$0(snapshotState43);
                                        composer4.startReplaceGroup(-2129701077);
                                        if (!(pipCryptoViewStateCryptoChartPipComposable$lambda$0 instanceof PipCryptoViewState.CryptoViewState)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        PipCryptoChartComposable.CryptoChart((PipCryptoViewState.CryptoViewState) pipCryptoViewStateCryptoChartPipComposable$lambda$0, null, composer4, 0, 2);
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                pipCryptoDuxo4 = pipCryptoDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                pipCryptoDuxo4 = pipCryptoDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PipCryptoChartComposable.CryptoChartPipComposable$lambda$1(currencyPairId, modifier4, pipCryptoDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    i4 = i3;
                    pipCryptoDuxo3 = pipCryptoDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends PipCryptoViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(pipCryptoDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-913112417, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt.CryptoChartPipComposable.1
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
                            ComposerKt.traceEventStart(-913112417, i7, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChartPipComposable.<anonymous> (PipCryptoChartComposable.kt:47)");
                        }
                        final SnapshotState4<? extends PipCryptoViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle22;
                        final Modifier modifier522 = modifier3;
                        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1970047551, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt.CryptoChartPipComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1970047551, i8, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChartPipComposable.<anonymous>.<anonymous> (PipCryptoChartComposable.kt:48)");
                                }
                                boolean loading = PipCryptoChartComposable.CryptoChartPipComposable$lambda$0(snapshotState4).getLoading();
                                final Modifier modifier6 = modifier522;
                                final SnapshotState4<? extends PipCryptoViewState> snapshotState42 = snapshotState4;
                                LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(1717617201, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt.CryptoChartPipComposable.1.1.1
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
                                            ComposerKt.traceEventStart(1717617201, i9, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChartPipComposable.<anonymous>.<anonymous>.<anonymous> (PipCryptoChartComposable.kt:49)");
                                        }
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer4, i10).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer4, i10).m21590getDefaultD9Ej5fM(), 1, null);
                                        SnapshotState4<PipCryptoViewState> snapshotState43 = snapshotState42;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        PipCryptoViewState pipCryptoViewStateCryptoChartPipComposable$lambda$0 = PipCryptoChartComposable.CryptoChartPipComposable$lambda$0(snapshotState43);
                                        composer4.startReplaceGroup(-2129701077);
                                        if (!(pipCryptoViewStateCryptoChartPipComposable$lambda$0 instanceof PipCryptoViewState.CryptoViewState)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        PipCryptoChartComposable.CryptoChart((PipCryptoViewState.CryptoViewState) pipCryptoViewStateCryptoChartPipComposable$lambda$0, null, composer4, 0, 2);
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                pipCryptoDuxo4 = pipCryptoDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void CryptoChart(final PipCryptoViewState.CryptoViewState viewState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-193007713);
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
                ComposerKt.traceEventStart(-193007713, i3, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChart (PipCryptoChartComposable.kt:71)");
            }
            BoxWithConstraints.BoxWithConstraints(modifier2, null, false, ComposableLambda3.rememberComposableLambda(-489380215, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt.CryptoChart.1
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
                        ComposerKt.traceEventStart(-489380215, i5, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChart.<anonymous> (PipCryptoChartComposable.kt:73)");
                    }
                    final PipCryptoViewState.CryptoViewState cryptoViewState = viewState;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    FlowLayoutKt.FlowRow(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i6).m21597getXxsmallD9Ej5fM()), null, 0, 0, ComposableLambda3.rememberComposableLambda(464621902, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt$CryptoChart$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer3, Integer num) {
                            invoke(flowRowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(FlowRowScope FlowRow, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                            if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(464621902, i7, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChart.<anonymous>.<anonymous>.<anonymous> (PipCryptoChartComposable.kt:79)");
                            }
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierWithBentoPillPlaceholder$default = LocalShowPlaceholder.withBentoPillPlaceholder$default(companion3, false, 1, null);
                            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                            int iM7959getEllipsisgIe3tQ8 = companion4.m7959getEllipsisgIe3tQ8();
                            String tickerSymbol = cryptoViewState.getTickerSymbol();
                            if (tickerSymbol == null) {
                                tickerSymbol = "";
                            }
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            TextStyle textS = bentoTheme2.getTypography(composer3, i8).getTextS();
                            FontWeight.Companion companion5 = FontWeight.INSTANCE;
                            String str = tickerSymbol;
                            BentoText2.m20747BentoText38GnDrw(str, modifierWithBentoPillPlaceholder$default, Color.m6701boximpl(bentoTheme2.getColors(composer3, i8).m21425getFg0d7_KjU()), null, companion5.getBold(), null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textS, composer3, 817913856, 0, 7528);
                            int iM7958getClipgIe3tQ8 = companion4.m7958getClipgIe3tQ8();
                            Modifier modifierWithBentoPillPlaceholder$default2 = LocalShowPlaceholder.withBentoPillPlaceholder$default(companion3, false, 1, null);
                            TextStyle textS2 = bentoTheme2.getTypography(composer3, i8).getTextS();
                            BentoText2.m20747BentoText38GnDrw("Robinhood Crypto", modifierWithBentoPillPlaceholder$default2, Color.m6701boximpl(BentoColor.INSTANCE.m21306getNightFg20d7_KjU()), null, companion5.getNormal(), null, null, iM7958getClipgIe3tQ8, false, 1, 0, null, 0, textS2, composer3, 817913862, 0, 7528);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 1572864, 56);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), composer2, 0);
                    ChartDataPerformanceComposable.ChartDataPerformanceComposable(cryptoViewState.getDisplayData(), null, composer2, 0, 2);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), composer2, 0);
                    BentoThemeOverlays.DirectionThemeOverlay(cryptoViewState.getColorDirection(), ComposableLambda3.rememberComposableLambda(-1835969543, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt$CryptoChart$1$1$2
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
                                ComposerKt.traceEventStart(-1835969543, i7, -1, "com.robinhood.android.pictureinpicture.pip.crypto.CryptoChart.<anonymous>.<anonymous>.<anonymous> (PipCryptoChartComposable.kt:113)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Clip.clipToBounds(Modifier.INSTANCE), 0.0f, 1, null);
                            ImmutableList<ChartFill> fills = cryptoViewState.getFills();
                            ImmutableList<Line> lines = cryptoViewState.getLines();
                            ImmutableList<UIComponent<GenericAction>> overlays = cryptoViewState.getOverlays();
                            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer3, 0);
                            boolean loading = cryptoViewState.getLoading();
                            composer3.startReplaceGroup(977840936);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer3.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue == companion3.getEmpty()) {
                                objRememberedValue = new Function1<Point, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt$CryptoChart$1$1$2$invoke$$inlined$SduiSegmentedLineChart$1
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
                                objRememberedValue2 = new Function1<List<? extends com.robinhood.models.serverdriven.experimental.api.Point>, Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt$CryptoChart$1$1$2$invoke$$inlined$SduiSegmentedLineChart$2
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
                                objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt$CryptoChart$1$1$2$invoke$$inlined$SduiSegmentedLineChart$3
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
                            SduiChartMappersKt.SduiSegmentedLineChart(modifierFillMaxSize$default, fills, lines, overlays, sduiActionHandlerCurrentActionHandler, function1, function12, (Function0) objRememberedValue3, loading, false, null, 0.0f, GenericAction.class, composer3, 805306374, 0, 0);
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PipCryptoChartComposable.CryptoChart$lambda$2(viewState, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PipCryptoViewState CryptoChartPipComposable$lambda$0(SnapshotState4<? extends PipCryptoViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
