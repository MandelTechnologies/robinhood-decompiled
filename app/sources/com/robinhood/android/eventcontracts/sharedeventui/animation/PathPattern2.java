package com.robinhood.android.eventcontracts.sharedeventui.animation;

import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathPattern.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"buildPaths", "", "Landroidx/compose/ui/graphics/Path;", "widthPx", "", "heightPx", "density", "Landroidx/compose/ui/unit/Density;", "side", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Side;", "pattern1", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/PathPattern;", "pattern2", "pattern3", "pattern4", "patterns", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.PathPatternKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PathPattern2 {
    private static final PathPattern pattern1;
    private static final PathPattern pattern2;
    private static final PathPattern pattern3;
    private static final PathPattern pattern4;
    private static final List<PathPattern> patterns;

    public static final List<Path> buildPaths(int i, int i2, Density density, MovingDeltasAnimation8 side) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(side, "side");
        List<PathPattern> list = patterns;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PathPattern) it.next()).drawPatternPath(i, i2, density, side));
        }
        return arrayList;
    }

    static {
        float f = 0;
        float f2 = 32;
        PathPattern pathPattern = new PathPattern(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(20), null);
        pattern1 = pathPattern;
        float f3 = 12;
        PathPattern pathPattern2 = new PathPattern(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f3), null);
        pattern2 = pathPattern2;
        float f4 = 44;
        PathPattern pathPattern3 = new PathPattern(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f4), null);
        pattern3 = pathPattern3;
        PathPattern pathPattern4 = new PathPattern(C2002Dp.m7995constructorimpl(f4), C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f), null);
        pattern4 = pathPattern4;
        patterns = CollectionsKt.listOf((Object[]) new PathPattern[]{pathPattern, pathPattern2, pathPattern3, pathPattern4});
    }
}
