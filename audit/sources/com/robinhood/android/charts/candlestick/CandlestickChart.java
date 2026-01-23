package com.robinhood.android.charts.candlestick;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.ChartWithOverlays;
import com.robinhood.android.charts.ScrubWindow;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Fill;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.segmented.SegmentedLine;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CandlestickChart.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u0014X\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\nX\u008a\u008e\u0002"}, m3636d2 = {"CandlestickChart", "", "modifier", "Landroidx/compose/ui/Modifier;", "fills", "", "Lcom/robinhood/android/charts/model/Fill;", "lines", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "scrubLine", "", "filteredScrubPoints", "", "", "overlays", "Lcom/robinhood/android/charts/overlay/ChartOverlay;", "scrubWindow", "Lcom/robinhood/android/charts/ScrubWindow;", "onScrub", "Lkotlin/Function1;", "Lcom/robinhood/android/charts/model/Point;", "onScrubStopped", "Lkotlin/Function0;", "showPlaceholder", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;ZLjava/util/Set;Ljava/util/List;Lcom/robinhood/android/charts/ScrubWindow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "lib-charts_externalDebug", "scrubbedPoint", "containedScrubPoint", "mostRecentPoint", "performedHaptic"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.candlestick.CandlestickChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CandlestickChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CandlestickChart$lambda$22(Modifier modifier, List list, List list2, boolean z, Set set, List list3, ScrubWindow scrubWindow, Function1 function1, Function0 function0, boolean z2, int i, int i2, Composer composer, int i3) {
        CandlestickChart(modifier, list, list2, z, set, list3, scrubWindow, function1, function0, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CandlestickChart$lambda$1$lambda$0(Point it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CandlestickChart(final Modifier modifier, final List<? extends Fill> fills, final List<? extends SegmentedLine> lines, boolean z, Set<Float> set, List<Overlays> list, ScrubWindow scrubWindow, Function1<? super Point, Unit> function1, Function0<Unit> function0, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        Set<Float> setEmptySet;
        int i5;
        List<Overlays> listEmptyList;
        final ScrubWindow scrubWindow2;
        int i6;
        Function1<? super Point, Unit> function12;
        int i7;
        int i8;
        int i9;
        ScrubWindow scrubWindow3;
        Function0<Unit> function02;
        Function1<? super Point, Unit> function13;
        boolean z4;
        boolean z5;
        final Function0<Unit> function03;
        List<Overlays> list2;
        final Set<Float> set2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        List<Overlays> list3;
        Function1 function14;
        List<ChartAnnotation> list4;
        Function0 function04;
        List<? extends Fill> list5;
        final List<Overlays> list6;
        final boolean z6;
        final boolean z7;
        final Set<Float> set3;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Composer composerStartRestartGroup = composer.startRestartGroup(1585627535);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(fills) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lines) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    setEmptySet = set;
                    i3 |= composerStartRestartGroup.changedInstance(setEmptySet) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        listEmptyList = list;
                        i3 |= composerStartRestartGroup.changedInstance(listEmptyList) ? 131072 : 65536;
                    }
                    if ((i & 1572864) != 0) {
                        scrubWindow2 = scrubWindow;
                        i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(scrubWindow2)) ? 1048576 : 524288;
                    } else {
                        scrubWindow2 = scrubWindow;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        function12 = function1;
                    } else {
                        function12 = function1;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                        }
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                    }
                    i8 = i2 & 512;
                    if (i8 != 0) {
                        if ((i & 805306368) == 0) {
                            i9 = i8;
                            i3 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function05 = function0;
                            list5 = fills;
                            z7 = z3;
                            set3 = setEmptySet;
                            list6 = listEmptyList;
                            z6 = z2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i10 != 0) {
                                    z3 = true;
                                }
                                if (i4 != 0) {
                                    setEmptySet = SetsKt.emptySet();
                                }
                                if (i5 != 0) {
                                    listEmptyList = CollectionsKt.emptyList();
                                }
                                if ((i2 & 64) == 0) {
                                    scrubWindow3 = new ScrubWindow(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i3 &= -3670017;
                                } else {
                                    scrubWindow3 = scrubWindow2;
                                }
                                if (i6 != 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.charts.candlestick.CandlestickChartKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CandlestickChart.CandlestickChart$lambda$1$lambda$0((Point) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    function12 = (Function1) objRememberedValue5;
                                }
                                if (i7 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.charts.candlestick.CandlestickChartKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    function02 = (Function0) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function02 = function0;
                                }
                                if (i9 == 0) {
                                    function13 = function12;
                                    z4 = z3;
                                    z5 = false;
                                    scrubWindow2 = scrubWindow3;
                                } else {
                                    function13 = function12;
                                    z4 = z3;
                                    scrubWindow2 = scrubWindow3;
                                    z5 = z2;
                                }
                                function03 = function02;
                                list2 = listEmptyList;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                function13 = function12;
                                z4 = z3;
                                list2 = listEmptyList;
                                function03 = function0;
                                z5 = z2;
                            }
                            set2 = setEmptySet;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1585627535, i3, -1, "com.robinhood.android.charts.candlestick.CandlestickChart (CandlestickChart.kt:31)");
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
                            Point pointCandlestickChart$lambda$5 = CandlestickChart$lambda$5(snapshotState);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChanged = ((((i3 & 3670016) ^ 1572864) <= 1048576 && composerStartRestartGroup.changed(scrubWindow2)) || (i3 & 1572864) == 1048576) | composerStartRestartGroup.changed(fills) | composerStartRestartGroup.changed(pointCandlestickChart$lambda$5);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.charts.candlestick.CandlestickChartKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CandlestickChart.CandlestickChart$lambda$9$lambda$8(scrubWindow2, snapshotState, fills, set2);
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 != companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 != companion.getEmpty()) {
                                list3 = list2;
                                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                list3 = list2;
                            }
                            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            List<ChartAnnotation> listMapFillsWithScrubPoint = UtilKt.mapFillsWithScrubPoint(fills, lines, CandlestickChart$lambda$12(snapshotState2), null, composerStartRestartGroup, (i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 8);
                            composerStartRestartGroup.startReplaceGroup(-925292522);
                            if (z4) {
                                function14 = null;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue7 == companion.getEmpty()) {
                                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.charts.candlestick.CandlestickChartKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CandlestickChart.CandlestickChart$lambda$18$lambda$17(snapshotState, (Point) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                }
                                function14 = (Function1) objRememberedValue7;
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-925287236);
                            if (z4) {
                                list4 = listMapFillsWithScrubPoint;
                                function04 = null;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                list4 = listMapFillsWithScrubPoint;
                                boolean z8 = (234881024 & i3) == 67108864;
                                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (z8 || objRememberedValue8 == companion.getEmpty()) {
                                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.charts.candlestick.CandlestickChartKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CandlestickChart.CandlestickChart$lambda$20$lambda$19(function03, snapshotState, snapshotState2, snapshotState3);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function04 = (Function0) objRememberedValue8;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i11 = i3 >> 9;
                            int i12 = (i3 & 14) | (i11 & 896) | (i11 & 3670016);
                            Function0<Unit> function06 = function03;
                            int i13 = i3;
                            list5 = fills;
                            List<Overlays> list7 = list3;
                            ChartWithOverlays.ChartWithOverlays(modifier, list4, list7, 0L, function14, function04, z5, composerStartRestartGroup, i12, 8);
                            if (z4) {
                                function12 = function13;
                            } else {
                                HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                Point pointCandlestickChart$lambda$10 = CandlestickChart$lambda$10(snapshotState4);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4) | composerStartRestartGroup.changedInstance(hapticFeedback) | ((i13 & 29360128) == 8388608);
                                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue9 == companion.getEmpty()) {
                                    Function1<? super Point, Unit> function15 = function13;
                                    objRememberedValue9 = new CandlestickChart2(hapticFeedback, function15, snapshotState4, snapshotState3, snapshotState2, null);
                                    function12 = function15;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                } else {
                                    function12 = function13;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(pointCandlestickChart$lambda$10, list5, (Function2) objRememberedValue9, composerStartRestartGroup, i13 & 112);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            list6 = list7;
                            z6 = z5;
                            z7 = z4;
                            set3 = set2;
                            function05 = function06;
                        }
                        final ScrubWindow scrubWindow4 = scrubWindow2;
                        final Function1<? super Point, Unit> function16 = function12;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final List<? extends Fill> list8 = list5;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.candlestick.CandlestickChartKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CandlestickChart.CandlestickChart$lambda$22(modifier, list8, lines, z7, set3, list6, scrubWindow4, function16, function05, z6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    i9 = i8;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            function03 = function02;
                            list2 = listEmptyList;
                            set2 = setEmptySet;
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
                            Point pointCandlestickChart$lambda$52 = CandlestickChart$lambda$5(snapshotState);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            if (((i3 & 3670016) ^ 1572864) <= 1048576) {
                                zChanged = ((((i3 & 3670016) ^ 1572864) <= 1048576 && composerStartRestartGroup.changed(scrubWindow2)) || (i3 & 1572864) == 1048576) | composerStartRestartGroup.changed(fills) | composerStartRestartGroup.changed(pointCandlestickChart$lambda$52);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.charts.candlestick.CandlestickChartKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CandlestickChart.CandlestickChart$lambda$9$lambda$8(scrubWindow2, snapshotState, fills, set2);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue3 != companion.getEmpty()) {
                                    }
                                    final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue4 != companion.getEmpty()) {
                                    }
                                    final SnapshotState snapshotState32 = (SnapshotState) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                    List<ChartAnnotation> listMapFillsWithScrubPoint2 = UtilKt.mapFillsWithScrubPoint(fills, lines, CandlestickChart$lambda$12(snapshotState22), null, composerStartRestartGroup, (i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 8);
                                    composerStartRestartGroup.startReplaceGroup(-925292522);
                                    if (z4) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-925287236);
                                    if (z4) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i112 = i3 >> 9;
                                    int i122 = (i3 & 14) | (i112 & 896) | (i112 & 3670016);
                                    Function0<Unit> function062 = function03;
                                    int i132 = i3;
                                    list5 = fills;
                                    List<Overlays> list72 = list3;
                                    ChartWithOverlays.ChartWithOverlays(modifier, list4, list72, 0L, function14, function04, z5, composerStartRestartGroup, i122, 8);
                                    if (z4) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    list6 = list72;
                                    z6 = z5;
                                    z7 = z4;
                                    set3 = set2;
                                    function05 = function062;
                                }
                            } else {
                                zChanged = ((((i3 & 3670016) ^ 1572864) <= 1048576 && composerStartRestartGroup.changed(scrubWindow2)) || (i3 & 1572864) == 1048576) | composerStartRestartGroup.changed(fills) | composerStartRestartGroup.changed(pointCandlestickChart$lambda$52);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                }
                            }
                        }
                    }
                    final ScrubWindow scrubWindow42 = scrubWindow2;
                    final Function1 function162 = function12;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                listEmptyList = list;
                if ((i & 1572864) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i2 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                if ((i3 & 306783379) == 306783378) {
                }
                final ScrubWindow scrubWindow422 = scrubWindow2;
                final Function1 function1622 = function12;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            setEmptySet = set;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            listEmptyList = list;
            if ((i & 1572864) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i2 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i3 & 306783379) == 306783378) {
            }
            final ScrubWindow scrubWindow4222 = scrubWindow2;
            final Function1 function16222 = function12;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        setEmptySet = set;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        listEmptyList = list;
        if ((i & 1572864) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i2 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i3 & 306783379) == 306783378) {
        }
        final ScrubWindow scrubWindow42222 = scrubWindow2;
        final Function1 function162222 = function12;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point CandlestickChart$lambda$9$lambda$8(ScrubWindow scrubWindow, SnapshotState snapshotState, List list, Set set) {
        Point pointContainScrubPoint;
        Point pointCandlestickChart$lambda$5 = CandlestickChart$lambda$5(snapshotState);
        if (pointCandlestickChart$lambda$5 == null || (pointContainScrubPoint = scrubWindow.containScrubPoint(pointCandlestickChart$lambda$5)) == null) {
            return null;
        }
        return UtilKt.getHorizontalScrubPoint(list, set, pointContainScrubPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CandlestickChart$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CandlestickChart$lambda$18$lambda$17(SnapshotState snapshotState, Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        snapshotState.setValue(point);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CandlestickChart$lambda$20$lambda$19(Function0 function0, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3) {
        snapshotState.setValue(null);
        snapshotState2.setValue(null);
        CandlestickChart$lambda$16(snapshotState3, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point CandlestickChart$lambda$10(SnapshotState4<Point> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point CandlestickChart$lambda$12(SnapshotState<Point> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CandlestickChart$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final Point CandlestickChart$lambda$5(SnapshotState<Point> snapshotState) {
        return snapshotState.getValue();
    }
}
