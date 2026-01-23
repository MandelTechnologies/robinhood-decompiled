package com.robinhood.android.charts;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Point;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: Chart.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\t\u001a\"\u0010\n\u001a\u00020\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {"Chart", "", "modifier", "Landroidx/compose/ui/Modifier;", "annotations", "", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "scrubListener", "Lcom/robinhood/android/charts/ScrubListener;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lcom/robinhood/android/charts/ScrubListener;Landroidx/compose/runtime/Composer;II)V", "buildPath", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "points", "Lcom/robinhood/android/charts/model/Point;", "close", "", "lib-charts_externalDebug", "canvasRect", "Landroidx/compose/ui/geometry/Rect;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.ChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Chart2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chart$lambda$9(Modifier modifier, List list, Interactions5 interactions5, int i, int i2, Composer composer, int i3) {
        Chart(modifier, list, interactions5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chart(Modifier modifier, final List<? extends ChartAnnotation> annotations, Interactions5 interactions5, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Interactions5 interactions52;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Composer composerStartRestartGroup = composer.startRestartGroup(-667172711);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(annotations) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                interactions52 = interactions5;
                i3 |= composerStartRestartGroup.changed(interactions52) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 != 0) {
                    interactions52 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-667172711, i3, -1, "com.robinhood.android.charts.Chart (Chart.kt:27)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Rect.INSTANCE.getZero(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1202832074);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.charts.ChartKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Chart2.Chart$lambda$4$lambda$3(snapshotState, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifier3, (Function1) objRememberedValue2);
                composerStartRestartGroup.startReplaceGroup(-1202831526);
                if (interactions52 != null) {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i6 = i3 & 896;
                    boolean z = i6 == 256;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.charts.ChartKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Chart2.Chart$lambda$8$lambda$6$lambda$5(interactions52, snapshotState, (Offset) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function1 = (Function1) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z2 = i6 == 256;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Chart3(interactions52);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierOnGloballyPositioned = Interactions2.scrubDetection(modifierOnGloballyPositioned, function1, (Function0) ((KFunction) objRememberedValue4));
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
                Interactions2.ChartViewConfigurationProvider(interactions52 != null ? Long.valueOf(interactions52.getLongPressTimeoutMillis()) : null, ComposableLambda3.rememberComposableLambda(1807207755, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.ChartKt.Chart.1
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
                            ComposerKt.traceEventStart(1807207755, i7, -1, "com.robinhood.android.charts.Chart.<anonymous> (Chart.kt:50)");
                        }
                        Modifier modifier4 = modifierOnGloballyPositioned;
                        List<ChartAnnotation> list = annotations;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier4);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(-1077031513);
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            ((ChartAnnotation) it.next()).BoxScopeContent(boxScopeInstance, composer2, 6);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final Interactions5 interactions53 = interactions52;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.ChartKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Chart2.Chart$lambda$9(modifier4, annotations, interactions53, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        interactions52 = interactions5;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1202832074);
            composerStartRestartGroup.startReplaceGroup(5004770);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            final Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifier3, (Function1) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(-1202831526);
            if (interactions52 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            Interactions2.ChartViewConfigurationProvider(interactions52 != null ? Long.valueOf(interactions52.getLongPressTimeoutMillis()) : null, ComposableLambda3.rememberComposableLambda(1807207755, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.ChartKt.Chart.1
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
                        ComposerKt.traceEventStart(1807207755, i7, -1, "com.robinhood.android.charts.Chart.<anonymous> (Chart.kt:50)");
                    }
                    Modifier modifier42 = modifierOnGloballyPositioned2;
                    List<ChartAnnotation> list = annotations;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier42);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(-1077031513);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((ChartAnnotation) it.next()).BoxScopeContent(boxScopeInstance, composer2, 6);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chart$lambda$4$lambda$3(SnapshotState snapshotState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotState.setValue(SizeKt.m6592toRectuvyYCjk(IntSize2.m8067toSizeozmzZPI(coordinates.mo7241getSizeYbymL2g())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chart$lambda$8$lambda$6$lambda$5(Interactions5 interactions5, SnapshotState snapshotState, Offset offset) {
        interactions5.onScrub(RectExtensions.m11982getNormalizedPointUv8p0NA(Chart$lambda$1(snapshotState), offset.getPackedValue()));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Path buildPath$default(DrawScope drawScope, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return buildPath(drawScope, list, z);
    }

    public static final Path buildPath(DrawScope drawScope, List<Point> points, boolean z) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(points, "points");
        Rect rectM6592toRectuvyYCjk = SizeKt.m6592toRectuvyYCjk(drawScope.mo6963getSizeNHjbRc());
        Path Path = AndroidPath_androidKt.Path();
        Point point = (Point) CollectionsKt.firstOrNull((List) points);
        if (point == null) {
            return Path;
        }
        Path.moveTo(RectExtensions.getHorizontalTranslation(rectM6592toRectuvyYCjk, point.getX()), RectExtensions.getVerticalTranslation(rectM6592toRectuvyYCjk, point.getY()));
        for (Point point2 : CollectionsKt.drop(points, 1)) {
            Path.lineTo(RectExtensions.getHorizontalTranslation(rectM6592toRectuvyYCjk, point2.getX()), RectExtensions.getVerticalTranslation(rectM6592toRectuvyYCjk, point2.getY()));
        }
        if (z) {
            Path.close();
        }
        return Path;
    }

    private static final Rect Chart$lambda$1(SnapshotState<Rect> snapshotState) {
        return snapshotState.getValue();
    }
}
