package com.robinhood.android.charts.segmented;

import androidx.compose.animation.core.AnimationSpec;
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
import com.robinhood.android.charts.ChartWithOverlays;
import com.robinhood.android.charts.ScrubWindow;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.instrumentrow.InstrumentRow5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SegmentedLineChart.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u001a«\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\u0010\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u008a\u008e\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010\u0010X\u008a\u0084\u0002"}, m3636d2 = {InstrumentRow5.SegmentedLineChartTag, "", "lines", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundAnnotations", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "foregroundAnnotations", "overlays", "Lcom/robinhood/android/charts/overlay/ChartOverlay;", "scrubWindow", "Lcom/robinhood/android/charts/ScrubWindow;", "onScrub", "Lkotlin/Function1;", "Lcom/robinhood/android/charts/model/Point;", "onScrubStopped", "Lkotlin/Function0;", "scrubLineType", "Lcom/robinhood/android/charts/segmented/ScrubLineType;", "showPlaceholder", "", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/charts/ScrubWindow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/charts/segmented/ScrubLineType;ZLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;III)V", "lib-charts_externalDebug", "scrubbedPoint", "lastSelectedIndicies", "", "", "containedScrubPoint"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.segmented.SegmentedLineChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SegmentedLineChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedLineChart$lambda$20(ImmutableList immutableList, Modifier modifier, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ScrubWindow scrubWindow, Function1 function1, Function0 function0, ScrubLineType scrubLineType, boolean z, AnimationSpec animationSpec, int i, int i2, int i3, Composer composer, int i4) {
        SegmentedLineChart(immutableList, modifier, immutableList2, immutableList3, immutableList4, scrubWindow, function1, function0, scrubLineType, z, animationSpec, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedLineChart$lambda$1$lambda$0(Point it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedLineChart(final ImmutableList<? extends SegmentedLine> lines, Modifier modifier, ImmutableList<? extends ChartAnnotation> immutableList, ImmutableList<? extends ChartAnnotation> immutableList2, ImmutableList<Overlays> immutableList3, ScrubWindow scrubWindow, Function1<? super Point, Unit> function1, Function0<Unit> function0, ScrubLineType scrubLineType, boolean z, AnimationSpec<Float> animationSpec, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        ImmutableList<Overlays> immutableList4;
        final ScrubWindow scrubWindow2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier modifier3;
        ImmutableList<? extends ChartAnnotation> immutableListPersistentListOf;
        ImmutableList<? extends ChartAnnotation> immutableListPersistentListOf2;
        ImmutableList<Overlays> immutableListPersistentListOf3;
        Function1<? super Point, Unit> function12;
        final Function0<Unit> function02;
        ScrubLineType scrubLineType2;
        boolean z2;
        int i17;
        AnimationSpec<Float> animationSpec2;
        AnimationSpec<Float> animationSpec3;
        Object objRememberedValue;
        Composer.Companion companion;
        int i18;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        int i19;
        final SnapshotState snapshotState2;
        boolean zChanged;
        Object objRememberedValue3;
        AnimationSpec<Float> animationSpec4;
        ScrubLineType scrubLineType3;
        Object objRememberedValue4;
        AnimationSpec<Float> animationSpec5;
        Function1 function13;
        boolean z3;
        Object objRememberedValue5;
        Function0 function03;
        Modifier modifier4;
        final Modifier modifier5;
        Composer composer2;
        final boolean z4;
        final ImmutableList<? extends ChartAnnotation> immutableList5;
        final ImmutableList<? extends ChartAnnotation> immutableList6;
        final ScrubLineType scrubLineType4;
        final AnimationSpec<Float> animationSpec6;
        final Function0<Unit> function04;
        final Function1<? super Point, Unit> function14;
        ImmutableList<? extends SegmentedLine> immutableList7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lines, "lines");
        Composer composerStartRestartGroup = composer.startRestartGroup(232382752);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(lines) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(immutableList2) : composerStartRestartGroup.changedInstance(immutableList2) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    immutableList4 = immutableList3;
                    i4 |= composerStartRestartGroup.changed(immutableList4) ? 16384 : 8192;
                }
                if ((i & 196608) == 0) {
                    scrubWindow2 = scrubWindow;
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(scrubWindow2)) ? 131072 : 65536;
                } else {
                    scrubWindow2 = scrubWindow;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i11 = i10;
                        i4 |= composerStartRestartGroup.changed(scrubLineType == null ? -1 : scrubLineType.ordinal()) ? 67108864 : 33554432;
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                        if ((i & 805306368) == 0) {
                            i13 = i12;
                            i4 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
                        }
                        i14 = i3 & 1024;
                        if (i14 != 0) {
                            i15 = i14;
                            i16 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i15 = i14;
                            i16 = i2 | (composerStartRestartGroup.changedInstance(animationSpec) ? 4 : 2);
                        } else {
                            i15 = i14;
                            i16 = i2;
                        }
                        if ((i4 & 306783379) == 306783378 && (i16 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            immutableList5 = immutableList;
                            function14 = function1;
                            function04 = function0;
                            z4 = z;
                            animationSpec6 = animationSpec;
                            composer2 = composerStartRestartGroup;
                            modifier5 = modifier2;
                            immutableList6 = immutableList2;
                            scrubLineType4 = scrubLineType;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i20 == 0 ? Modifier.INSTANCE : modifier2;
                                immutableListPersistentListOf = i5 == 0 ? extensions2.persistentListOf() : immutableList;
                                immutableListPersistentListOf2 = i6 == 0 ? extensions2.persistentListOf() : immutableList2;
                                immutableListPersistentListOf3 = i7 == 0 ? extensions2.persistentListOf() : immutableList4;
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                    scrubWindow2 = new ScrubWindow(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.charts.segmented.SegmentedLineChartKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return SegmentedLineChart.SegmentedLineChart$lambda$1$lambda$0((Point) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    function12 = (Function1) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function12 = function1;
                                }
                                if (i9 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.charts.segmented.SegmentedLineChartKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                    }
                                    function02 = (Function0) objRememberedValue7;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function02 = function0;
                                }
                                scrubLineType2 = i11 == 0 ? ScrubLineType.DEFAULT : scrubLineType;
                                z2 = i13 == 0 ? false : z;
                                i17 = i4;
                                if (i15 == 0) {
                                    animationSpec2 = null;
                                }
                                composerStartRestartGroup.endDefaults();
                                Modifier modifier6 = modifier3;
                                if (ComposerKt.isTraceInProgress()) {
                                    animationSpec3 = animationSpec2;
                                    ComposerKt.traceEventStart(232382752, i17, i16, "com.robinhood.android.charts.segmented.SegmentedLineChart (SegmentedLineChart.kt:46)");
                                } else {
                                    animationSpec3 = animationSpec2;
                                }
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    i18 = i16;
                                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    i18 = i16;
                                }
                                snapshotState = (SnapshotState) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lines, 10));
                                    for (Iterator<? extends SegmentedLine> it = lines.iterator(); it.hasNext(); it = it) {
                                        it.next();
                                        arrayList.add(-1);
                                    }
                                    i19 = i17;
                                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(arrayList, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    i19 = i17;
                                }
                                snapshotState2 = (SnapshotState) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                Object objSegmentedLineChart$lambda$5 = SegmentedLineChart$lambda$5(snapshotState);
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                int i21 = i19 & 14;
                                ImmutableList<Overlays> immutableList8 = immutableListPersistentListOf3;
                                Function1<? super Point, Unit> function15 = function12;
                                zChanged = composerStartRestartGroup.changed(objSegmentedLineChart$lambda$5) | (i21 == 4) | ((((i19 & 458752) ^ 196608) > 131072 && composerStartRestartGroup.changed(scrubWindow2)) || (i19 & 196608) == 131072);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.charts.segmented.SegmentedLineChartKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return SegmentedLineChart.SegmentedLineChart$lambda$13$lambda$12(scrubWindow2, snapshotState, lines);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                List<ChartAnnotation> listMapSegmentedLinesWithScrubPoint = UtilKt.mapSegmentedLinesWithScrubPoint(lines, SegmentedLineChart$lambda$14(snapshotState4), scrubLineType2, animationSpec3, composerStartRestartGroup, ((i18 << 9) & 7168) | ((i19 >> 18) & 896) | i21, 0);
                                animationSpec4 = animationSpec3;
                                List listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) immutableListPersistentListOf, (Iterable) listMapSegmentedLinesWithScrubPoint), (Iterable) immutableListPersistentListOf2);
                                composerStartRestartGroup.startReplaceGroup(-18424669);
                                scrubLineType3 = ScrubLineType.DEFAULT;
                                if (scrubLineType2 != scrubLineType3 || scrubLineType2 == ScrubLineType.SCRUB_LINE_INVISIBLE) {
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    animationSpec5 = animationSpec4;
                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.charts.segmented.SegmentedLineChartKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return SegmentedLineChart.SegmentedLineChart$lambda$16$lambda$15(snapshotState, (Point) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    function13 = (Function1) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    if (scrubLineType2 != ScrubLineType.SCRUBBING_DISABLED) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    animationSpec5 = animationSpec4;
                                    function13 = null;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-18414411);
                                if (scrubLineType2 != scrubLineType3 || scrubLineType2 == ScrubLineType.SCRUB_LINE_INVISIBLE) {
                                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                                    z3 = (i19 & 29360128) != 8388608;
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (!z3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.charts.segmented.SegmentedLineChartKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return SegmentedLineChart.SegmentedLineChart$lambda$18$lambda$17(function02, snapshotState, snapshotState2);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    function03 = (Function0) objRememberedValue5;
                                } else {
                                    if (scrubLineType2 != ScrubLineType.SCRUBBING_DISABLED) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    function03 = null;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                boolean z5 = z2;
                                ChartWithOverlays.ChartWithOverlays(modifier6, listPlus, immutableList8, 0L, function13, function03, z5, composerStartRestartGroup, ((i19 >> 3) & 14) | ((i19 >> 6) & 896) | ((i19 >> 9) & 3670016), 8);
                                immutableList4 = immutableList8;
                                if (scrubLineType2 == ScrubLineType.SCRUBBING_DISABLED) {
                                    HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                    Point pointSegmentedLineChart$lambda$14 = SegmentedLineChart$lambda$14(snapshotState4);
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    modifier4 = modifier6;
                                    boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4) | ((i19 & 3670016) == 1048576) | (i21 == 4) | composerStartRestartGroup.changedInstance(hapticFeedback);
                                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue8 = new SegmentedLineChart2(function15, lines, hapticFeedback, snapshotState4, snapshotState2, null);
                                        immutableList7 = lines;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                    } else {
                                        immutableList7 = lines;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(pointSegmentedLineChart$lambda$14, immutableList7, (Function2) objRememberedValue8, composerStartRestartGroup, (i19 << 3) & 112);
                                } else {
                                    modifier4 = modifier6;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier5 = modifier4;
                                composer2 = composerStartRestartGroup;
                                z4 = z5;
                                immutableList5 = immutableListPersistentListOf;
                                immutableList6 = immutableListPersistentListOf2;
                                scrubLineType4 = scrubLineType2;
                                animationSpec6 = animationSpec5;
                                function04 = function02;
                                function14 = function15;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                immutableListPersistentListOf = immutableList;
                                function12 = function1;
                                function02 = function0;
                                scrubLineType2 = scrubLineType;
                                i17 = i4;
                                modifier3 = modifier2;
                                immutableListPersistentListOf3 = immutableList4;
                                immutableListPersistentListOf2 = immutableList2;
                                z2 = z;
                            }
                            animationSpec2 = animationSpec;
                            composerStartRestartGroup.endDefaults();
                            Modifier modifier62 = modifier3;
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
                            Object objSegmentedLineChart$lambda$52 = SegmentedLineChart$lambda$5(snapshotState);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            int i212 = i19 & 14;
                            ImmutableList<Overlays> immutableList82 = immutableListPersistentListOf3;
                            Function1<? super Point, Unit> function152 = function12;
                            if (((i19 & 458752) ^ 196608) > 131072) {
                                zChanged = composerStartRestartGroup.changed(objSegmentedLineChart$lambda$52) | (i212 == 4) | ((((i19 & 458752) ^ 196608) > 131072 && composerStartRestartGroup.changed(scrubWindow2)) || (i19 & 196608) == 131072);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.charts.segmented.SegmentedLineChartKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return SegmentedLineChart.SegmentedLineChart$lambda$13$lambda$12(scrubWindow2, snapshotState, lines);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    List<ChartAnnotation> listMapSegmentedLinesWithScrubPoint2 = UtilKt.mapSegmentedLinesWithScrubPoint(lines, SegmentedLineChart$lambda$14(snapshotState42), scrubLineType2, animationSpec3, composerStartRestartGroup, ((i18 << 9) & 7168) | ((i19 >> 18) & 896) | i212, 0);
                                    animationSpec4 = animationSpec3;
                                    List listPlus2 = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) immutableListPersistentListOf, (Iterable) listMapSegmentedLinesWithScrubPoint2), (Iterable) immutableListPersistentListOf2);
                                    composerStartRestartGroup.startReplaceGroup(-18424669);
                                    scrubLineType3 = ScrubLineType.DEFAULT;
                                    if (scrubLineType2 != scrubLineType3) {
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        animationSpec5 = animationSpec4;
                                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        function13 = (Function1) objRememberedValue4;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(-18414411);
                                        if (scrubLineType2 != scrubLineType3) {
                                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                                            if ((i19 & 29360128) != 8388608) {
                                            }
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (!z3) {
                                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.charts.segmented.SegmentedLineChartKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return SegmentedLineChart.SegmentedLineChart$lambda$18$lambda$17(function02, snapshotState, snapshotState2);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                composerStartRestartGroup.endReplaceGroup();
                                                function03 = (Function0) objRememberedValue5;
                                                composerStartRestartGroup.endReplaceGroup();
                                                boolean z52 = z2;
                                                ChartWithOverlays.ChartWithOverlays(modifier62, listPlus2, immutableList82, 0L, function13, function03, z52, composerStartRestartGroup, ((i19 >> 3) & 14) | ((i19 >> 6) & 896) | ((i19 >> 9) & 3670016), 8);
                                                immutableList4 = immutableList82;
                                                if (scrubLineType2 == ScrubLineType.SCRUBBING_DISABLED) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                modifier5 = modifier4;
                                                composer2 = composerStartRestartGroup;
                                                z4 = z52;
                                                immutableList5 = immutableListPersistentListOf;
                                                immutableList6 = immutableListPersistentListOf2;
                                                scrubLineType4 = scrubLineType2;
                                                animationSpec6 = animationSpec5;
                                                function04 = function02;
                                                function14 = function152;
                                            }
                                        }
                                    }
                                }
                            } else {
                                zChanged = composerStartRestartGroup.changed(objSegmentedLineChart$lambda$52) | (i212 == 4) | ((((i19 & 458752) ^ 196608) > 131072 && composerStartRestartGroup.changed(scrubWindow2)) || (i19 & 196608) == 131072);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                }
                            }
                        }
                        final ImmutableList<Overlays> immutableList9 = immutableList4;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.segmented.SegmentedLineChartKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SegmentedLineChart.SegmentedLineChart$lambda$20(lines, modifier5, immutableList5, immutableList6, immutableList9, scrubWindow2, function14, function04, scrubLineType4, z4, animationSpec6, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i13 = i12;
                    i14 = i3 & 1024;
                    if (i14 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i20 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            i17 = i4;
                            if (i15 == 0) {
                                animationSpec2 = animationSpec;
                            }
                            composerStartRestartGroup.endDefaults();
                            Modifier modifier622 = modifier3;
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
                            Object objSegmentedLineChart$lambda$522 = SegmentedLineChart$lambda$5(snapshotState);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            int i2122 = i19 & 14;
                            ImmutableList<Overlays> immutableList822 = immutableListPersistentListOf3;
                            Function1<? super Point, Unit> function1522 = function12;
                            if (((i19 & 458752) ^ 196608) > 131072) {
                            }
                        }
                    }
                    final ImmutableList immutableList92 = immutableList4;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i3 & 1024;
                if (i14 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                final ImmutableList immutableList922 = immutableList4;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            immutableList4 = immutableList3;
            if ((i & 196608) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i3 & 1024;
            if (i14 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            final ImmutableList immutableList9222 = immutableList4;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        immutableList4 = immutableList3;
        if ((i & 196608) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i3 & 1024;
        if (i14 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        final ImmutableList immutableList92222 = immutableList4;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point SegmentedLineChart$lambda$13$lambda$12(ScrubWindow scrubWindow, SnapshotState snapshotState, ImmutableList immutableList) {
        Point pointContainScrubPoint;
        Point pointSegmentedLineChart$lambda$5 = SegmentedLineChart$lambda$5(snapshotState);
        if (pointSegmentedLineChart$lambda$5 == null || (pointContainScrubPoint = scrubWindow.containScrubPoint(pointSegmentedLineChart$lambda$5)) == null) {
            return null;
        }
        return UtilKt.getHorizontalScrubPoint(immutableList, pointContainScrubPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedLineChart$lambda$16$lambda$15(SnapshotState snapshotState, Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        snapshotState.setValue(point);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point SegmentedLineChart$lambda$14(SnapshotState4<Point> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Point SegmentedLineChart$lambda$5(SnapshotState<Point> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> SegmentedLineChart$lambda$9(SnapshotState<List<Integer>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SegmentedLineChart$lambda$18$lambda$17(Function0 function0, SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState.setValue(null);
        snapshotState2.setValue(CollectionsKt.emptyList());
        function0.invoke();
        return Unit.INSTANCE;
    }
}
