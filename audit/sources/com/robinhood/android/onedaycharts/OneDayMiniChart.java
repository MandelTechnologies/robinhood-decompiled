package com.robinhood.android.onedaycharts;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
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
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.segmented.ScrubLineType;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.charts.segmented.SegmentedLineChart;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.onedaycharts.OneDayMiniChartViewState;
import com.robinhood.android.sdui.chartgroup.SduiChartLayeredStack2;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.librobinhood.data.store.OneDayChartData;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: OneDayMiniChart.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f\"\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, m3636d2 = {"OneDayMiniChart", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;", "modifier", "Landroidx/compose/ui/Modifier;", "identifier", "", "duxo", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo;", "allowScrubbing", "", "(Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo;ZLandroidx/compose/runtime/Composer;II)V", "MiniChartStrokeWidth", "Landroidx/compose/ui/unit/Dp;", "F", "MiniChartTestTag", "MiniChartPlaceholderTestTag", "lib-one-day-charts_externalDebug", "uiState", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onedaycharts.OneDayMiniChartKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OneDayMiniChart {
    private static final String MiniChartPlaceholderTestTag = "OneDayMiniChartPlaceholder";
    private static final float MiniChartStrokeWidth = C2002Dp.m7995constructorimpl(1.5f);
    private static final String MiniChartTestTag = "OneDayMiniChart";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneDayMiniChart$lambda$5(OneDayMiniChartDetails oneDayMiniChartDetails, Modifier modifier, String str, OneDayMiniChartDuxo oneDayMiniChartDuxo, boolean z, int i, int i2, Composer composer, int i3) {
        OneDayMiniChart(oneDayMiniChartDetails, modifier, str, oneDayMiniChartDuxo, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a5  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OneDayMiniChart(final OneDayMiniChartDetails details, Modifier modifier, String str, OneDayMiniChartDuxo oneDayMiniChartDuxo, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        OneDayMiniChartDuxo oneDayMiniChartDuxo2;
        int i5;
        boolean z2;
        Modifier modifier3;
        String str3;
        boolean z3;
        int i6;
        int i7;
        final OneDayMiniChartDuxo oneDayMiniChartDuxo3;
        boolean z4;
        ?? r0;
        boolean zChangedInstance;
        Object objRememberedValue;
        OneDayMiniChartViewState oneDayMiniChartViewStateOneDayMiniChart$lambda$3;
        final boolean z5;
        final Modifier modifier4;
        final OneDayMiniChartDuxo oneDayMiniChartDuxo4;
        final String str4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(details, "details");
        Composer composerStartRestartGroup = composer.startRestartGroup(919060163);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(details) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        oneDayMiniChartDuxo2 = oneDayMiniChartDuxo;
                        int i9 = composerStartRestartGroup.changedInstance(oneDayMiniChartDuxo2) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        oneDayMiniChartDuxo2 = oneDayMiniChartDuxo;
                    }
                    i3 |= i9;
                } else {
                    oneDayMiniChartDuxo2 = oneDayMiniChartDuxo;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            String str5 = "";
                            String str6 = i4 == 0 ? "" : str2;
                            if ((i2 & 8) == 0) {
                                InstrumentType instrumentType = details.getInstrumentType();
                                UUID metadataId = details.getMetadataId();
                                if (!StringsKt.isBlank(str6)) {
                                    str5 = PlaceholderUtils.XXShortPlaceholderText + str6;
                                }
                                String str7 = "OneDayMiniChart: " + instrumentType + PlaceholderUtils.XXShortPlaceholderText + metadataId + str5;
                                composerStartRestartGroup.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                str3 = str6;
                                z3 = false;
                                i6 = -1633490746;
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OneDayMiniChartDuxo.class), current, str7, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.onedaycharts.OneDayMiniChartKt$OneDayMiniChart$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.onedaycharts.OneDayMiniChartKt$OneDayMiniChart$$inlined$duxo$1.1
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
                                i3 &= -7169;
                                oneDayMiniChartDuxo2 = (OneDayMiniChartDuxo) baseDuxo;
                            } else {
                                str3 = str6;
                                z3 = false;
                                i6 = -1633490746;
                            }
                            i7 = i3;
                            oneDayMiniChartDuxo3 = oneDayMiniChartDuxo2;
                            if (i5 == 0) {
                                z4 = z3 ? 1 : 0;
                                r0 = z3;
                            } else {
                                z4 = z;
                                r0 = z3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            i7 = i3;
                            modifier3 = modifier2;
                            str3 = str2;
                            oneDayMiniChartDuxo3 = oneDayMiniChartDuxo2;
                            z4 = z2;
                            r0 = 0;
                            i6 = -1633490746;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(919060163, i7, -1, "com.robinhood.android.onedaycharts.OneDayMiniChart (OneDayMiniChart.kt:33)");
                        }
                        int i10 = i7;
                        UUID metadataId2 = details.getMetadataId();
                        composerStartRestartGroup.startReplaceGroup(i6);
                        zChangedInstance = composerStartRestartGroup.changedInstance(oneDayMiniChartDuxo3) | composerStartRestartGroup.changedInstance(details);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.onedaycharts.OneDayMiniChartKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OneDayMiniChart.OneDayMiniChart$lambda$2$lambda$1(oneDayMiniChartDuxo3, details, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        LifecycleEffectKt.LifecycleResumeEffect(metadataId2, oneDayMiniChartDuxo3, null, (Function1) objRememberedValue, composerStartRestartGroup, (i10 >> 6) & 112, 4);
                        OneDayMiniChartDuxo oneDayMiniChartDuxo5 = oneDayMiniChartDuxo3;
                        oneDayMiniChartViewStateOneDayMiniChart$lambda$3 = OneDayMiniChart$lambda$3(FlowExtKt.collectAsStateWithLifecycle(oneDayMiniChartDuxo5.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                        if (!(oneDayMiniChartViewStateOneDayMiniChart$lambda$3 instanceof OneDayMiniChartViewState.Loaded)) {
                            composerStartRestartGroup.startReplaceGroup(-694256269);
                            OneDayMiniChartViewState.Loaded loaded = (OneDayMiniChartViewState.Loaded) oneDayMiniChartViewStateOneDayMiniChart$lambda$3;
                            OneDayChartData chartData = loaded.getChartData();
                            Modifier modifierTestTag = TestTag3.testTag(modifier3, "OneDayMiniChart");
                            List<ChartLine> chartLines = chartData.getChartLines();
                            float f = MiniChartStrokeWidth;
                            Color colorM6701boximpl = Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU());
                            colorM6701boximpl.getValue();
                            Composer composer2 = composerStartRestartGroup;
                            SegmentedLineChart.SegmentedLineChart(SduiChartMappersKt.m18604mapSdcSegmentedLinesRxXgDco(chartLines, f, loaded.isStale() ? colorM6701boximpl : null, composer2, 48, 0), modifierTestTag, null, null, SduiChartLayeredStack2.toChartOverlays(chartData.getOverlays()), null, null, null, z4 ? ScrubLineType.DEFAULT : ScrubLineType.SCRUBBING_DISABLED, false, null, composer2, SegmentedLine.$stable | (Overlays.$stable << 12), 0, 1772);
                            composerStartRestartGroup = composer2;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (!(oneDayMiniChartViewStateOneDayMiniChart$lambda$3 instanceof OneDayMiniChartViewState.Loading)) {
                                composerStartRestartGroup.startReplaceGroup(-1546418412);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-693513850);
                            Placeholders2.ChartPlaceholder(TestTag3.testTag(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), MiniChartPlaceholderTestTag), r0, composerStartRestartGroup, r0, 2);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        String str8 = str3;
                        z5 = z4;
                        modifier4 = modifier3;
                        oneDayMiniChartDuxo4 = oneDayMiniChartDuxo5;
                        str4 = str8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        str4 = str2;
                        oneDayMiniChartDuxo4 = oneDayMiniChartDuxo2;
                        z5 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onedaycharts.OneDayMiniChartKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return OneDayMiniChart.OneDayMiniChart$lambda$5(details, modifier4, str4, oneDayMiniChartDuxo4, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z2 = z;
                if ((i3 & 9363) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        String str52 = "";
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) == 0) {
                        }
                        i7 = i3;
                        oneDayMiniChartDuxo3 = oneDayMiniChartDuxo2;
                        if (i5 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i7;
                        UUID metadataId22 = details.getMetadataId();
                        composerStartRestartGroup.startReplaceGroup(i6);
                        zChangedInstance = composerStartRestartGroup.changedInstance(oneDayMiniChartDuxo3) | composerStartRestartGroup.changedInstance(details);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.onedaycharts.OneDayMiniChartKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OneDayMiniChart.OneDayMiniChart$lambda$2$lambda$1(oneDayMiniChartDuxo3, details, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            LifecycleEffectKt.LifecycleResumeEffect(metadataId22, oneDayMiniChartDuxo3, null, (Function1) objRememberedValue, composerStartRestartGroup, (i102 >> 6) & 112, 4);
                            OneDayMiniChartDuxo oneDayMiniChartDuxo52 = oneDayMiniChartDuxo3;
                            oneDayMiniChartViewStateOneDayMiniChart$lambda$3 = OneDayMiniChart$lambda$3(FlowExtKt.collectAsStateWithLifecycle(oneDayMiniChartDuxo52.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                            if (!(oneDayMiniChartViewStateOneDayMiniChart$lambda$3 instanceof OneDayMiniChartViewState.Loaded)) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            String str82 = str3;
                            z5 = z4;
                            modifier4 = modifier3;
                            oneDayMiniChartDuxo4 = oneDayMiniChartDuxo52;
                            str4 = str82;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z2 = z;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str2 = str;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult OneDayMiniChart$lambda$2$lambda$1(OneDayMiniChartDuxo oneDayMiniChartDuxo, OneDayMiniChartDetails oneDayMiniChartDetails, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final CompletableJob completableJobBind = oneDayMiniChartDuxo.bind(oneDayMiniChartDetails.getMetadataId(), oneDayMiniChartDetails.getInstrumentType());
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.onedaycharts.OneDayMiniChartKt$OneDayMiniChart$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(completableJobBind, null, 1, null);
            }
        };
    }

    private static final OneDayMiniChartViewState OneDayMiniChart$lambda$3(SnapshotState4<? extends OneDayMiniChartViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
