package com.robinhood.android.futures.charts.sparkline;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.store.futures.ChartType;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: FuturesSparkline.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\bX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"FuturesSparkline", "", "contractId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "chartType", "Lcom/robinhood/store/futures/ChartType;", "sparklineDuxo", "Lcom/robinhood/android/futures/charts/sparkline/FuturesSparklineDuxo;", "(Ljava/util/UUID;Lcom/robinhood/store/futures/ChartType;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/futures/charts/sparkline/FuturesSparklineDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-futures-charts_externalDebug", "boundContractId", "boundChartType", "viewState", "Lcom/robinhood/android/futures/charts/sparkline/FuturesSparklineViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesSparkline {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesSparkline$lambda$0(UUID uuid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesSparkline(uuid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesSparkline$lambda$11(UUID uuid, ChartType chartType, Modifier modifier, FuturesSparklineDuxo futuresSparklineDuxo, int i, int i2, Composer composer, int i3) {
        FuturesSparkline(uuid, chartType, modifier, futuresSparklineDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void FuturesSparkline(UUID contractId, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final UUID uuid;
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Composer composerStartRestartGroup = composer.startRestartGroup(62377816);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(contractId) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(62377816, i3, -1, "com.robinhood.android.futures.charts.sparkline.FuturesSparkline (FuturesSparkline.kt:23)");
            }
            uuid = contractId;
            FuturesSparkline(uuid, ChartType.LINE, modifier2, null, composerStartRestartGroup, (i3 & 14) | 48 | ((i3 << 3) & 896), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            uuid = contractId;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesSparkline.FuturesSparkline$lambda$0(uuid, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesSparkline(final UUID contractId, final ChartType chartType, Modifier modifier, FuturesSparklineDuxo futuresSparklineDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        final FuturesSparklineDuxo futuresSparklineDuxo2;
        int i4;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        FuturesSparklineDuxo futuresSparklineDuxo3;
        Chart<Parcelable> chart;
        Modifier modifier4;
        final Modifier modifier5;
        final FuturesSparklineDuxo futuresSparklineDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i5;
        ChartType chartType2 = chartType;
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(chartType2, "chartType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-67625227);
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
            i3 |= composerStartRestartGroup.changed(chartType2.ordinal()) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) != 0) {
                    i5 = 1024;
                    i3 |= i5;
                } else {
                    if ((i & 4096) == 0 ? composerStartRestartGroup.changed(futuresSparklineDuxo) : composerStartRestartGroup.changedInstance(futuresSparklineDuxo)) {
                        i5 = 2048;
                    }
                    i3 |= i5;
                }
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier6 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(FuturesSparklineDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt$FuturesSparkline$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt$FuturesSparkline$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        z = false;
                        modifier3 = modifier6;
                        futuresSparklineDuxo2 = (FuturesSparklineDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                    } else {
                        z = false;
                        futuresSparklineDuxo2 = futuresSparklineDuxo;
                        i4 = i3;
                        modifier3 = modifier6;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    futuresSparklineDuxo2 = futuresSparklineDuxo;
                    i4 = i3;
                    modifier3 = modifier2;
                    z = false;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-67625227, i4, -1, "com.robinhood.android.futures.charts.sparkline.FuturesSparkline (FuturesSparkline.kt:37)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = (((((i4 & 7168) ^ 3072) > 2048 || !composerStartRestartGroup.changedInstance(futuresSparklineDuxo2)) && (i4 & 3072) != 2048) ? z : true) | composerStartRestartGroup.changedInstance(contractId) | ((i4 & 112) != 32 ? z : true);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FuturesSparkline.FuturesSparkline$lambda$9$lambda$8(futuresSparklineDuxo2, contractId, chartType, snapshotState, snapshotState2, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    futuresSparklineDuxo3 = futuresSparklineDuxo2;
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue3 = function1;
                } else {
                    futuresSparklineDuxo3 = futuresSparklineDuxo2;
                }
                composerStartRestartGroup.endReplaceGroup();
                chartType2 = chartType;
                LifecycleEffectKt.LifecycleResumeEffect(contractId, chartType2, null, (Function1) objRememberedValue3, composerStartRestartGroup, i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                int i7 = i4;
                chart = FuturesSparkline$lambda$10(FlowExtKt.collectAsStateWithLifecycle(futuresSparklineDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).getChartData().get(Tuples4.m3642to(contractId, chartType));
                if (chart == null) {
                    composerStartRestartGroup.startReplaceGroup(-282567834);
                    if (chartType2 == ChartType.CANDLESTICK) {
                        composerStartRestartGroup.startReplaceGroup(-282530665);
                        Composer composer2 = composerStartRestartGroup;
                        modifier4 = modifier3;
                        SduiChartMappersKt.SduiCandlestickChart(modifier4, chart.getFills(), chart.getLines(), SetsKt.emptySet(), SduiActionHandler.NotImplemented.INSTANCE, false, null, null, false, composer2, ((i7 >> 6) & 14) | 199680 | (SduiActionHandler.NotImplemented.$stable << 12), 448);
                        composerStartRestartGroup = composer2;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        modifier4 = modifier3;
                        composerStartRestartGroup.startReplaceGroup(-282216294);
                        List<Line> lines = chart.getLines();
                        List<ChartFill> fills = chart.getFills();
                        List overlays = chart.getOverlays();
                        if (overlays == null) {
                            overlays = CollectionsKt.emptyList();
                        }
                        List list = overlays;
                        SduiActionHandler.NotImplemented notImplemented = SduiActionHandler.NotImplemented.INSTANCE;
                        int i8 = ((i7 >> 6) & 14) | 1572864 | (SduiActionHandler.NotImplemented.$stable << 12);
                        composerStartRestartGroup.startReplaceGroup(977840936);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1<Point, Unit>() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt$FuturesSparkline$$inlined$SduiSegmentedLineChart$1
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
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        Function1 function12 = (Function1) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function1<List<? extends com.robinhood.models.serverdriven.experimental.api.Point>, Unit>() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt$FuturesSparkline$$inlined$SduiSegmentedLineChart$2
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(List<com.robinhood.models.serverdriven.experimental.api.Point> it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends com.robinhood.models.serverdriven.experimental.api.Point> list2) {
                                    invoke2((List<com.robinhood.models.serverdriven.experimental.api.Point>) list2);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        Function1 function13 = (Function1) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt$FuturesSparkline$$inlined$SduiSegmentedLineChart$3
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i9 = i8 >> 6;
                        Composer composer3 = composerStartRestartGroup;
                        SduiChartMappersKt.SduiSegmentedLineChart(modifier4, fills, lines, list, notImplemented, function12, function13, (Function0) objRememberedValue7, false, false, null, 0.0f, Parcelable.class, composer3, (65534 & i8) | (458752 & i9) | (3670016 & i9) | (i9 & 29360128) | ((i8 << 9) & 1879048192), (i8 >> 15) & 14, 0);
                        composerStartRestartGroup = composer3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    modifier4 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(-281876968);
                    Placeholders2.ChartPlaceholder(modifier4, z, composerStartRestartGroup, (i7 >> 6) & 14, 2);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                futuresSparklineDuxo4 = futuresSparklineDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                futuresSparklineDuxo4 = futuresSparklineDuxo;
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final ChartType chartType3 = chartType2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesSparkline.FuturesSparkline$lambda$11(contractId, chartType3, modifier5, futuresSparklineDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                if (((i4 & 7168) ^ 3072) > 2048) {
                    zChangedInstance = (((((i4 & 7168) ^ 3072) > 2048 || !composerStartRestartGroup.changedInstance(futuresSparklineDuxo2)) && (i4 & 3072) != 2048) ? z : true) | composerStartRestartGroup.changedInstance(contractId) | ((i4 & 112) != 32 ? z : true);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        Function1 function14 = new Function1() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FuturesSparkline.FuturesSparkline$lambda$9$lambda$8(futuresSparklineDuxo2, contractId, chartType, snapshotState, snapshotState2, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        futuresSparklineDuxo3 = futuresSparklineDuxo2;
                        composerStartRestartGroup.updateRememberedValue(function14);
                        objRememberedValue3 = function14;
                        composerStartRestartGroup.endReplaceGroup();
                        chartType2 = chartType;
                        LifecycleEffectKt.LifecycleResumeEffect(contractId, chartType2, null, (Function1) objRememberedValue3, composerStartRestartGroup, i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                        int i72 = i4;
                        chart = FuturesSparkline$lambda$10(FlowExtKt.collectAsStateWithLifecycle(futuresSparklineDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).getChartData().get(Tuples4.m3642to(contractId, chartType));
                        if (chart == null) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                        futuresSparklineDuxo4 = futuresSparklineDuxo3;
                    }
                } else {
                    zChangedInstance = (((((i4 & 7168) ^ 3072) > 2048 || !composerStartRestartGroup.changedInstance(futuresSparklineDuxo2)) && (i4 & 3072) != 2048) ? z : true) | composerStartRestartGroup.changedInstance(contractId) | ((i4 & 112) != 32 ? z : true);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult FuturesSparkline$lambda$9$lambda$8(final FuturesSparklineDuxo futuresSparklineDuxo, final UUID uuid, final ChartType chartType, SnapshotState snapshotState, SnapshotState snapshotState2, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        futuresSparklineDuxo.bind(uuid, FuturesSparkline$lambda$2(snapshotState), chartType, FuturesSparkline$lambda$5(snapshotState2));
        snapshotState.setValue(uuid);
        snapshotState2.setValue(chartType);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.futures.charts.sparkline.FuturesSparklineKt$FuturesSparkline$lambda$9$lambda$8$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                futuresSparklineDuxo.unbind(uuid, chartType);
            }
        };
    }

    private static final FuturesSparklineViewState FuturesSparkline$lambda$10(SnapshotState4<FuturesSparklineViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final UUID FuturesSparkline$lambda$2(SnapshotState<UUID> snapshotState) {
        return snapshotState.getValue();
    }

    private static final ChartType FuturesSparkline$lambda$5(SnapshotState<ChartType> snapshotState) {
        return snapshotState.getValue();
    }
}
