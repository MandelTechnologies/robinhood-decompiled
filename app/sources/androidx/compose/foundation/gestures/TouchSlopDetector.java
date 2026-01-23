package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DragGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000f\u001a\u00020\b*\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\b*\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m3636d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/geometry/Offset;", "initialPositionChange", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "touchSlop", "calculatePostSlopOffset-tuRUvjQ", "(F)J", "calculatePostSlopOffset", "mainAxis-k-4lQ0M", "(J)F", "mainAxis", "crossAxis-k-4lQ0M", "crossAxis", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "dragEvent", "addPointerInputChange-dBAh8RU", "(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J", "addPointerInputChange", "", "reset", "()V", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "totalPositionChange", "J", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TouchSlopDetector {
    private final Orientation orientation;
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, j);
    }

    private TouchSlopDetector(Orientation orientation, long j) {
        this.orientation = orientation;
        this.totalPositionChange = j;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m5050mainAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m5049crossAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j & 4294967295L : j >> 32));
    }

    /* renamed from: addPointerInputChange-dBAh8RU, reason: not valid java name */
    public final long m5048addPointerInputChangedBAh8RU(PointerInputChange dragEvent, float touchSlop) {
        float fAbs;
        long jM6547plusMKHz9U = Offset.m6547plusMKHz9U(this.totalPositionChange, Offset.m6546minusMKHz9U(dragEvent.getPosition(), dragEvent.getPreviousPosition()));
        this.totalPositionChange = jM6547plusMKHz9U;
        if (this.orientation == null) {
            fAbs = Offset.m6541getDistanceimpl(jM6547plusMKHz9U);
        } else {
            fAbs = Math.abs(m5050mainAxisk4lQ0M(jM6547plusMKHz9U));
        }
        if (fAbs >= touchSlop) {
            return m5047calculatePostSlopOffsettuRUvjQ(touchSlop);
        }
        return Offset.INSTANCE.m6552getUnspecifiedF1C5BW0();
    }

    public final void reset() {
        this.totalPositionChange = Offset.INSTANCE.m6553getZeroF1C5BW0();
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m5047calculatePostSlopOffsettuRUvjQ(float touchSlop) {
        if (this.orientation == null) {
            long j = this.totalPositionChange;
            return Offset.m6546minusMKHz9U(this.totalPositionChange, Offset.m6548timestuRUvjQ(Offset.m6538divtuRUvjQ(j, Offset.m6541getDistanceimpl(j)), touchSlop));
        }
        float fM5050mainAxisk4lQ0M = m5050mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m5050mainAxisk4lQ0M(this.totalPositionChange)) * touchSlop);
        float fM5049crossAxisk4lQ0M = m5049crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m6535constructorimpl((Float.floatToRawIntBits(fM5050mainAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM5049crossAxisk4lQ0M) & 4294967295L));
        }
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(fM5049crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM5050mainAxisk4lQ0M) & 4294967295L));
    }
}
