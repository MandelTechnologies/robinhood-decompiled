package com.robinhood.android.charts.segmented;

import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SegmentedLineTools.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\nJ9\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/charts/segmented/SegmentedLineTools;", "", "<init>", "()V", "baseLine", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "y", "", "maxPoints", "", "(FILandroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/segmented/SegmentedLine;", "sparkLine", "yPoints", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "sparkLine-N8B1yIo", "(Ljava/util/List;JIFLandroidx/compose/runtime/Composer;II)Lcom/robinhood/android/charts/segmented/SegmentedLine;", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SegmentedLineTools {
    public static final int $stable = 0;
    public static final SegmentedLineTools INSTANCE = new SegmentedLineTools();

    private SegmentedLineTools() {
    }

    public final SegmentedLine baseLine(float f, int i, Composer composer, int i2) {
        composer.startReplaceGroup(1946288821);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1946288821, i2, -1, "com.robinhood.android.charts.segmented.SegmentedLineTools.baseLine (SegmentedLineTools.kt:25)");
        }
        float f2 = 1 / (i / 2);
        SegmentedLine.Dotted dotted = new SegmentedLine.Dotted(CollectionsKt.listOf(new SegmentedLine.Segment((List<Point>) CollectionsKt.listOf((Object[]) new Point[]{new Point(0.0f, f), new Point(1.0f, f)}), new SegmentedLine.Style.Dotted(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), f2, null))), f2, null, 4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return dotted;
    }

    /* renamed from: sparkLine-N8B1yIo, reason: not valid java name */
    public final SegmentedLine m12132sparkLineN8B1yIo(List<Float> yPoints, long j, int i, float f, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(yPoints, "yPoints");
        composer.startReplaceGroup(-1385410908);
        int size = (i3 & 4) != 0 ? yPoints.size() : i;
        float fM7995constructorimpl = (i3 & 8) != 0 ? C2002Dp.m7995constructorimpl((float) 1.5d) : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1385410908, i2, -1, "com.robinhood.android.charts.segmented.SegmentedLineTools.sparkLine (SegmentedLineTools.kt:56)");
        }
        float f2 = 1 / size;
        List<Float> list = yPoints;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new Point(i4 * f2, ((Number) obj).floatValue()));
            i4 = i5;
        }
        SegmentedLine.Default r0 = new SegmentedLine.Default(CollectionsKt.listOf(new SegmentedLine.Segment(arrayList, new SegmentedLine.Style.Solid(j, null, fM7995constructorimpl, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 2, null))), null, 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return r0;
    }
}
