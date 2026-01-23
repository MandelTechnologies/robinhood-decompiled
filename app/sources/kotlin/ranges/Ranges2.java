package kotlin.ranges;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: Ranges.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0011\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lkotlin/ranges/ClosedFloatRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "<init>", "(FF)V", "_start", "_endInclusive", "getStart", "()Ljava/lang/Float;", "getEndInclusive", "lessThanOrEquals", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "contains", "value", "isEmpty", "equals", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.ranges.ClosedFloatRange, reason: use source file name */
/* loaded from: classes14.dex */
final class Ranges2 implements Ranges3<Float> {
    private final float _endInclusive;
    private final float _start;

    public boolean lessThanOrEquals(float a, float b) {
        return a <= b;
    }

    public Ranges2(float f, float f2) {
        this._start = f;
        this._endInclusive = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.Ranges3, kotlin.ranges.Range2
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.Ranges3
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    @Override // kotlin.ranges.Range2
    public Float getStart() {
        return Float.valueOf(this._start);
    }

    @Override // kotlin.ranges.Range2
    public Float getEndInclusive() {
        return Float.valueOf(this._endInclusive);
    }

    public boolean contains(float value) {
        return value >= this._start && value <= this._endInclusive;
    }

    @Override // kotlin.ranges.Ranges3, kotlin.ranges.Range2
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Ranges2)) {
            return false;
        }
        if (isEmpty() && ((Ranges2) other).isEmpty()) {
            return true;
        }
        Ranges2 ranges2 = (Ranges2) other;
        return this._start == ranges2._start && this._endInclusive == ranges2._endInclusive;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this._start) * 31) + Float.hashCode(this._endInclusive);
    }

    public String toString() {
        return this._start + ".." + this._endInclusive;
    }
}
