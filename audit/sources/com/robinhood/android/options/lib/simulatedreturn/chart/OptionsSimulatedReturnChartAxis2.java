package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.overlay.OverlayPosition;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.overlay.Overlays2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OptionsSimulatedReturnChartAxis.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aF\u0010\u000b\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0002\u001aV\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0002\u001aJ\u0010\u001a\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0002\u001a \u0010\u001c\u001a\u00020\u0005*\u00020\u00112\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rH\u0002\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"OptionsSimulatedReturnChartAxis", "", "axis", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisModel;", "usePreTradeStyle", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisModel;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Y_AXIS_LABEL_INTERSECTION_THRESHOLD", "", "computeAlphaForOverlaps", "alphas", "", "", "labels", "", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisLabel;", "axisType", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisAxisType;", "bounds", "", "Landroidx/compose/ui/geometry/Rect;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", AnnotatedPrivateKey.LABEL, "computeAlphaForOverlap", "otherLabel", "isOpaque", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartAxisKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnChartAxis2 {
    private static final float Y_AXIS_LABEL_INTERSECTION_THRESHOLD = 0.05f;

    /* compiled from: OptionsSimulatedReturnChartAxis.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartAxisKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsSimulatedReturnChartAxis.values().length];
            try {
                iArr[OptionsSimulatedReturnChartAxis.f4730X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsSimulatedReturnChartAxis.f4731Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnChartAxis$lambda$7(OptionsSimulatedReturnChartAxisModel optionsSimulatedReturnChartAxisModel, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsSimulatedReturnChartAxis(optionsSimulatedReturnChartAxisModel, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165 A[LOOP:2: B:65:0x015f->B:67:0x0165, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsSimulatedReturnChartAxis(final OptionsSimulatedReturnChartAxisModel axis, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Object objRememberedValue2;
        Iterator<T> it;
        final Modifier modifier3;
        Float f;
        OverlayPosition overlayPosition;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Float fValueOf = Float.valueOf(1.0f);
        Intrinsics.checkNotNullParameter(axis, "axis");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1696572198);
        int i4 = 2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(axis) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1696572198, i3, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartAxis (OptionsSimulatedReturnChartAxis.kt:27)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    List<OptionsSimulatedReturnChartAxisLabel> labels = axis.getLabels();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels, 10));
                    Iterator<T> it2 = labels.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Tuples4.m3642to(((OptionsSimulatedReturnChartAxisLabel) it2.next()).getText(), fValueOf));
                    }
                    Tuples2[] tuples2Arr = (Tuples2[]) arrayList.toArray(new Tuples2[0]);
                    objRememberedValue = SnapshotStateKt.mutableStateMapOf((Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    List<OptionsSimulatedReturnChartAxisLabel> labels2 = axis.getLabels();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels2, 10));
                    Iterator<T> it3 = labels2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Tuples4.m3642to(((OptionsSimulatedReturnChartAxisLabel) it3.next()).getText(), Rect.INSTANCE.getZero()));
                    }
                    Tuples2[] tuples2Arr2 = (Tuples2[]) arrayList2.toArray(new Tuples2[0]);
                    objRememberedValue2 = SnapshotStateKt.mutableStateMapOf((Tuples2[]) Arrays.copyOf(tuples2Arr2, tuples2Arr2.length));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                List<OptionsSimulatedReturnChartAxisLabel> labels3 = axis.getLabels();
                LinkedHashSet linkedHashSet = !(labels3 instanceof Collection) ? new LinkedHashSet(labels3.size()) : new LinkedHashSet();
                it = labels3.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((OptionsSimulatedReturnChartAxisLabel) it.next()).getText());
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
                for (String str : snapshotStateMap2.keySet()) {
                    if (!setUnmodifiableSet.contains(str)) {
                        snapshotStateMap2.remove(str);
                        snapshotStateMap.remove(str);
                    }
                }
                computeAlphaForOverlaps(snapshotStateMap, axis.getLabels(), axis.getAxisType(), snapshotStateMap2);
                composerStartRestartGroup.startReplaceGroup(1681717775);
                List<OptionsSimulatedReturnChartAxisLabel> labels4 = axis.getLabels();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels4, 10));
                for (OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel : labels4) {
                    Object obj = snapshotStateMap.get(optionsSimulatedReturnChartAxisLabel.getText());
                    if (obj == null) {
                        obj = fValueOf;
                    }
                    float fFloatValue = ((Number) obj).floatValue();
                    int i6 = WhenMappings.$EnumSwitchMapping$0[axis.getAxisType().ordinal()];
                    if (i6 == 1) {
                        f = fValueOf;
                        overlayPosition = new OverlayPosition(new Point(optionsSimulatedReturnChartAxisLabel.getPosition(), 0.0f), OverlayPosition.HorizontalAlignment.CENTER, OverlayPosition.VerticalAlignment.BOTTOM);
                    } else {
                        if (i6 != i4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = fValueOf;
                        overlayPosition = new OverlayPosition(new Point(0.0f, optionsSimulatedReturnChartAxisLabel.getPosition()), OverlayPosition.HorizontalAlignment.LEFT, OverlayPosition.VerticalAlignment.CENTER);
                    }
                    arrayList3.add(new Overlays(overlayPosition, false, false, ComposableLambda3.rememberComposableLambda(1364990884, true, new OptionsSimulatedReturnChartAxis3(optionsSimulatedReturnChartAxisLabel, fFloatValue, z, snapshotStateMap2), composerStartRestartGroup, 54), 6, null));
                    fValueOf = f;
                    i4 = 2;
                }
                composerStartRestartGroup.endReplaceGroup();
                Overlays2.Overlays(modifier4, arrayList3, composerStartRestartGroup, (i3 >> 6) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartAxisKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return OptionsSimulatedReturnChartAxis2.OptionsSimulatedReturnChartAxis$lambda$7(axis, z, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            SnapshotStateMap snapshotStateMap3 = (SnapshotStateMap) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            SnapshotStateMap snapshotStateMap22 = (SnapshotStateMap) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            List<OptionsSimulatedReturnChartAxisLabel> labels32 = axis.getLabels();
            if (!(labels32 instanceof Collection)) {
            }
            it = labels32.iterator();
            while (it.hasNext()) {
            }
            Set setUnmodifiableSet2 = Collections.unmodifiableSet(linkedHashSet);
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(...)");
            while (r13.hasNext()) {
            }
            computeAlphaForOverlaps(snapshotStateMap3, axis.getLabels(), axis.getAxisType(), snapshotStateMap22);
            composerStartRestartGroup.startReplaceGroup(1681717775);
            List<OptionsSimulatedReturnChartAxisLabel> labels42 = axis.getLabels();
            ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(labels42, 10));
            while (r10.hasNext()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Overlays2.Overlays(modifier4, arrayList32, composerStartRestartGroup, (i3 >> 6) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void computeAlphaForOverlaps(Map<String, Float> map, List<OptionsSimulatedReturnChartAxisLabel> list, OptionsSimulatedReturnChartAxis optionsSimulatedReturnChartAxis, Map<String, Rect> map2) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel = (OptionsSimulatedReturnChartAxisLabel) obj;
            Map<String, Float> map3 = map;
            map3.put(optionsSimulatedReturnChartAxisLabel.getText(), Float.valueOf(computeAlphaForOverlaps(map3, i, optionsSimulatedReturnChartAxisLabel, list, optionsSimulatedReturnChartAxis, map2)));
            map = map3;
            i = i2;
        }
    }

    private static final float computeAlphaForOverlaps(Map<String, Float> map, int i, OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel, List<OptionsSimulatedReturnChartAxisLabel> list, OptionsSimulatedReturnChartAxis optionsSimulatedReturnChartAxis, Map<String, Rect> map2) {
        int i2 = i - 1;
        OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel2 = (OptionsSimulatedReturnChartAxisLabel) CollectionsKt.getOrNull(list, i2);
        return Math.min((optionsSimulatedReturnChartAxisLabel2 == null || !optionsSimulatedReturnChartAxisLabel2.isPriority()) ? 1.0f : computeAlphaForOverlap(map, optionsSimulatedReturnChartAxisLabel, (OptionsSimulatedReturnChartAxisLabel) CollectionsKt.getOrNull(list, i2), optionsSimulatedReturnChartAxis, map2), computeAlphaForOverlap(map, optionsSimulatedReturnChartAxisLabel, (OptionsSimulatedReturnChartAxisLabel) CollectionsKt.getOrNull(list, i + 1), optionsSimulatedReturnChartAxis, map2));
    }

    private static final float computeAlphaForOverlap(Map<String, Float> map, OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel, OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel2, OptionsSimulatedReturnChartAxis optionsSimulatedReturnChartAxis, Map<String, Rect> map2) {
        Rect rect;
        Rect rect2;
        if (optionsSimulatedReturnChartAxisLabel2 == null || (rect = map2.get(optionsSimulatedReturnChartAxisLabel.getText())) == null || optionsSimulatedReturnChartAxisLabel.isPriority() || !isOpaque(optionsSimulatedReturnChartAxisLabel2, map) || (rect2 = map2.get(optionsSimulatedReturnChartAxisLabel2.getText())) == null || rect2.isEmpty()) {
            return 1.0f;
        }
        Rect rectIntersect = rect2.intersect(rect);
        int i = WhenMappings.$EnumSwitchMapping$0[optionsSimulatedReturnChartAxis.ordinal()];
        if (i == 1) {
            return rectIntersect.isEmpty() ? 1.0f : 0.0f;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Float fValueOf = Float.valueOf((rectIntersect.getBottom() - rectIntersect.getTop()) / (rect.getBottom() - rect.getTop()));
        if (Math.abs(fValueOf.floatValue()) > Float.MAX_VALUE) {
            fValueOf = null;
        }
        return 1.0f - RangesKt.coerceIn((fValueOf != null ? fValueOf.floatValue() : 0.0f) / 0.05f, 0.0f, 1.0f);
    }

    private static final boolean isOpaque(OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel, Map<String, Float> map) {
        Float fValueOf = map.get(optionsSimulatedReturnChartAxisLabel.getText());
        if (fValueOf == null) {
            fValueOf = Float.valueOf(1.0f);
        }
        return ((double) Math.abs(fValueOf.floatValue() - 1.0f)) < 1.0E-10d;
    }
}
