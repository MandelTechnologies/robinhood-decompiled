package dev.chrisbanes.snapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnapperFlingBehavior.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR)\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, m3636d2 = {"Ldev/chrisbanes/snapper/SnapOffsets;", "", "<init>", "()V", "Lkotlin/Function2;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "", "Start", "Lkotlin/jvm/functions/Function2;", "getStart", "()Lkotlin/jvm/functions/Function2;", "Center", "getCenter", "End", "getEnd", "lib_release"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SnapOffsets {
    public static final SnapOffsets INSTANCE = new SnapOffsets();
    private static final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> Start = new Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer>() { // from class: dev.chrisbanes.snapper.SnapOffsets$Start$1
        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(SnapperLayoutInfo layout, SnapperLayoutItemInfo noName_1) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            return Integer.valueOf(layout.getStartScrollOffset());
        }
    };
    private static final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> Center = new Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer>() { // from class: dev.chrisbanes.snapper.SnapOffsets$Center$1
        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(SnapperLayoutInfo layout, SnapperLayoutItemInfo item) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(item, "item");
            return Integer.valueOf(layout.getStartScrollOffset() + (((layout.getEndScrollOffset() - layout.getStartScrollOffset()) - item.getSize()) / 2));
        }
    };
    private static final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> End = new Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer>() { // from class: dev.chrisbanes.snapper.SnapOffsets$End$1
        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(SnapperLayoutInfo layout, SnapperLayoutItemInfo item) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(item, "item");
            return Integer.valueOf(layout.getEndScrollOffset() - item.getSize());
        }
    };

    private SnapOffsets() {
    }

    public final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> getStart() {
        return Start;
    }

    public final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> getCenter() {
        return Center;
    }
}
