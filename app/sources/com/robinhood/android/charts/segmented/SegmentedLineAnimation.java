package com.robinhood.android.charts.segmented;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.utils.p409ui.animation.Animators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SegmentedLineAnimation.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\b\u001a$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0001\u001a*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u001a \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0001\u001a%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00162\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\u0017\u001a%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\u001b\u001a1\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u008a\u0084\u0002"}, m3636d2 = {"animatePointListAsState", "Landroidx/compose/runtime/State;", "", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "targetSegment", "Lkotlinx/collections/immutable/ImmutableList;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "preProcessDensity", "list", "xDiff", "", "normalizeLists", "originalList", "newList", "deriveIndex", "", "indexA", "sizeA", "sizeB", "animateSduiSegment", "Lcom/robinhood/models/serverdriven/experimental/api/Segment;", "(Lcom/robinhood/models/serverdriven/experimental/api/Segment;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/models/serverdriven/experimental/api/Segment;", "animateSduiLine", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "targetLine", "(Lcom/robinhood/models/serverdriven/experimental/api/Line;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/models/serverdriven/experimental/api/Line;", "animateSduiLineList", "targetLines", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Lkotlinx/collections/immutable/ImmutableList;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.segmented.SegmentedLineAnimationKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SegmentedLineAnimation {
    public static final SnapshotState4<List<Point>> animatePointListAsState(ImmutableList<Point> targetSegment, AnimationSpec<Point> animationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(targetSegment, "targetSegment");
        composer.startReplaceGroup(164740945);
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(164740945, i, -1, "com.robinhood.android.charts.segmented.animatePointListAsState (SegmentedLineAnimation.kt:35)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(targetSegment, 10));
            Iterator<Point> it = targetSegment.iterator();
            while (it.hasNext()) {
                arrayList.add(PointAnimatable.animatable(it.next()));
            }
            Animatable[] animatableArr = (Animatable[]) arrayList.toArray(new Animatable[0]);
            objRememberedValue = SnapshotStateKt.mutableStateListOf(Arrays.copyOf(animatableArr, animatableArr.length));
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.charts.segmented.SegmentedLineAnimationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SegmentedLineAnimation.animatePointListAsState$lambda$4$lambda$3(snapshotStateList);
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        SnapshotState4<List<Point>> snapshotState4 = (SnapshotState4) objRememberedValue2;
        composer.endReplaceGroup();
        if (!Animators.INSTANCE.animationsEnabled((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))) {
            animationSpec = AnimationSpecKt.snap$default(0, 1, null);
        }
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(targetSegment) | composer.changedInstance(animationSpec);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new SegmentedLineAnimation2(targetSegment, snapshotStateList, animationSpec, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(targetSegment, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List animatePointListAsState$lambda$4$lambda$3(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((Point) ((Animatable) it.next()).getValue());
        }
        return arrayList;
    }

    private static final List<Point> animateSduiSegment$lambda$10(SnapshotState4<? extends List<Point>> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final List<Point> preProcessDensity(List<Point> list, float f) {
        Intrinsics.checkNotNullParameter(list, "list");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Point point = (Point) obj;
            if (!Intrinsics.areEqual(point, (Point) CollectionsKt.getOrNull(list, i - 1))) {
                Point point2 = (Point) CollectionsKt.getOrNull(list, i2);
                if (point2 != null && point2.getX() - point.getX() >= f) {
                    int x = (int) ((point2.getX() - point.getX()) / f);
                    float f2 = x;
                    float x2 = (point2.getX() - point.getX()) / f2;
                    float y = (point2.getY() - point.getY()) / f2;
                    listCreateListBuilder.add(point);
                    for (int i3 = 1; i3 < x; i3++) {
                        float f3 = i3;
                        listCreateListBuilder.add(new Point(point.getX() + (x2 * f3), (f3 * y) + point.getY(), null, 4, null));
                    }
                } else {
                    listCreateListBuilder.add(point);
                }
            }
            i = i2;
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public static final List<Point> normalizeLists(List<Point> originalList, List<Point> newList) {
        Intrinsics.checkNotNullParameter(originalList, "originalList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        if (originalList.isEmpty()) {
            return newList;
        }
        if (newList.isEmpty()) {
            return originalList;
        }
        List<Point> listDistinct = CollectionsKt.distinct(originalList);
        if (newList.size() <= listDistinct.size()) {
            return listDistinct;
        }
        int size = newList.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(listDistinct.get(deriveIndex(i, newList.size(), listDistinct.size())));
        }
        return arrayList;
    }

    public static final int deriveIndex(int i, int i2, int i3) {
        if (i2 <= 1) {
            return 0;
        }
        return MathKt.roundToInt((i3 - 1) * (i / (i2 - 1)));
    }

    public static final Segment animateSduiSegment(Segment targetSegment, AnimationSpec<Point> animationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(targetSegment, "targetSegment");
        composer.startReplaceGroup(691808797);
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(691808797, i, -1, "com.robinhood.android.charts.segmented.animateSduiSegment (SegmentedLineAnimation.kt:202)");
        }
        Segment segmentCopy$default = Segment.copy$default(targetSegment, animateSduiSegment$lambda$10(animatePointListAsState(extensions2.toImmutableList(targetSegment.getPoints()), animationSpec, composer, i & 112, 0)), null, 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return segmentCopy$default;
    }

    public static final Line animateSduiLine(Line targetLine, AnimationSpec<Point> animationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(targetLine, "targetLine");
        composer.startReplaceGroup(651906964);
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(651906964, i, -1, "com.robinhood.android.charts.segmented.animateSduiLine (SegmentedLineAnimation.kt:221)");
        }
        if (targetLine.getSegments().isEmpty()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return targetLine;
        }
        Segment segment = (Segment) CollectionsKt.first((List) targetLine.getSegments());
        List<Segment> segments = targetLine.getSegments();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = segments.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((Segment) it.next()).getPoints());
        }
        Segment segmentCopy$default = Segment.copy$default(segment, arrayList, null, 2, null);
        Segment segmentAnimateSduiSegment = animateSduiSegment(segmentCopy$default, animationSpec, composer, i & 112, 0);
        if (Intrinsics.areEqual(segmentCopy$default, segmentAnimateSduiSegment)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return targetLine;
        }
        Line lineCopy$default = Line.copy$default(targetLine, null, CollectionsKt.listOf(segmentAnimateSduiSegment), null, false, 13, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return lineCopy$default;
    }

    public static final ImmutableList<Line> animateSduiLineList(ImmutableList<Line> targetLines, AnimationSpec<Point> animationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(targetLines, "targetLines");
        composer.startReplaceGroup(1321444070);
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1321444070, i, -1, "com.robinhood.android.charts.segmented.animateSduiLineList (SegmentedLineAnimation.kt:249)");
        }
        if (targetLines.isEmpty() || targetLines.size() > 1) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return targetLines;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(targetLines, 10));
        Iterator<Line> it = targetLines.iterator();
        while (it.hasNext()) {
            arrayList.add(animateSduiLine(it.next(), animationSpec, composer, i & 112, 0));
        }
        ImmutableList<Line> immutableList = extensions2.toImmutableList(arrayList);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return immutableList;
    }
}
