package com.robinhood.android.futures.assethome.sections;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesAssetHomeLoadedChart.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"FuturesAssetHomeLoadedChart", "", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "onScrub", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "onScrubStopped", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-asset-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeLoadedChartKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAssetHomeLoadedChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeLoadedChart$lambda$2(Chart chart, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesAssetHomeLoadedChart(chart, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesAssetHomeLoadedChart(final Chart<? extends Parcelable> chart, final Function1<? super Point, Unit> onScrub, final Function0<Unit> onScrubStopped, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        List overlays;
        boolean z;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(onScrub, "onScrub");
        Intrinsics.checkNotNullParameter(onScrubStopped, "onScrubStopped");
        Composer composerStartRestartGroup = composer.startRestartGroup(1279567593);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chart) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrub) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrubStopped) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1279567593, i3, -1, "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeLoadedChart (FuturesAssetHomeLoadedChart.kt:21)");
                }
                List<ChartFill> fills = chart.getFills();
                int i5 = i3;
                List<Line> lines = chart.getLines();
                overlays = chart.getOverlays();
                if (overlays == null) {
                    overlays = CollectionsKt.emptyList();
                }
                SduiActionHandler.NotImplemented notImplemented = SduiActionHandler.NotImplemented.INSTANCE;
                Modifier modifierFullWidthChartSize = ModifiersKt.fullWidthChartSize(modifier4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i5 & 112) != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeLoadedChartKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FuturesAssetHomeLoadedChart.FuturesAssetHomeLoadedChart$lambda$1$lambda$0(onScrub, (List) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i6 = ((i5 << 21) & 1879048192) | (SduiActionHandler.NotImplemented.$stable << 12);
                composerStartRestartGroup.startReplaceGroup(977840936);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<com.robinhood.android.charts.model.Point, Unit>() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeLoadedChartKt$FuturesAssetHomeLoadedChart$$inlined$SduiSegmentedLineChart$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(com.robinhood.android.charts.model.Point it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(com.robinhood.android.charts.model.Point point) {
                            invoke2(point);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i7 = i6 >> 6;
                composer2 = composerStartRestartGroup;
                SduiChartMappersKt.SduiSegmentedLineChart(modifierFullWidthChartSize, fills, lines, overlays, notImplemented, (Function1) objRememberedValue2, function1, onScrubStopped, false, true, null, 0.0f, Parcelable.class, composer2, (65534 & i6) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (1879048192 & (i6 << 9)), (i6 >> 15) & 14, 0);
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeLoadedChartKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesAssetHomeLoadedChart.FuturesAssetHomeLoadedChart$lambda$2(chart, onScrub, onScrubStopped, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            List<ChartFill> fills2 = chart.getFills();
            int i52 = i3;
            List<Line> lines2 = chart.getLines();
            overlays = chart.getOverlays();
            if (overlays == null) {
            }
            SduiActionHandler.NotImplemented notImplemented2 = SduiActionHandler.NotImplemented.INSTANCE;
            Modifier modifierFullWidthChartSize2 = ModifiersKt.fullWidthChartSize(modifier4);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i52 & 112) != 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeLoadedChartKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FuturesAssetHomeLoadedChart.FuturesAssetHomeLoadedChart$lambda$1$lambda$0(onScrub, (List) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function1 function12 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int i62 = ((i52 << 21) & 1879048192) | (SduiActionHandler.NotImplemented.$stable << 12);
                composerStartRestartGroup.startReplaceGroup(977840936);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i72 = i62 >> 6;
                composer2 = composerStartRestartGroup;
                SduiChartMappersKt.SduiSegmentedLineChart(modifierFullWidthChartSize2, fills2, lines2, overlays, notImplemented2, (Function1) objRememberedValue2, function12, onScrubStopped, false, true, null, 0.0f, Parcelable.class, composer2, (65534 & i62) | (i72 & 458752) | (i72 & 3670016) | (i72 & 29360128) | (1879048192 & (i62 << 9)), (i62 >> 15) & 14, 0);
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesAssetHomeLoadedChart$lambda$1$lambda$0(Function1 function1, List points) {
        Intrinsics.checkNotNullParameter(points, "points");
        function1.invoke(CollectionsKt.lastOrNull(points));
        return Unit.INSTANCE;
    }
}
