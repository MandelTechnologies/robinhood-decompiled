package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TransformableState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m3636d2 = {"Landroidx/compose/foundation/gestures/AnimationData;", "", "", "zoom", "Landroidx/compose/ui/geometry/Offset;", "offset", "degrees", "<init>", "(FJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getZoom", "()F", "J", "getOffset-F1C5BW0", "()J", "getDegrees", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
final /* data */ class AnimationData {
    private final float degrees;
    private final long offset;
    private final float zoom;

    public /* synthetic */ AnimationData(float f, long j, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, f2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationData)) {
            return false;
        }
        AnimationData animationData = (AnimationData) other;
        return Float.compare(this.zoom, animationData.zoom) == 0 && Offset.m6540equalsimpl0(this.offset, animationData.offset) && Float.compare(this.degrees, animationData.degrees) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.zoom) * 31) + Offset.m6545hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.degrees);
    }

    public String toString() {
        return "AnimationData(zoom=" + this.zoom + ", offset=" + ((Object) Offset.m6549toStringimpl(this.offset)) + ", degrees=" + this.degrees + ')';
    }

    private AnimationData(float f, long j, float f2) {
        this.zoom = f;
        this.offset = j;
        this.degrees = f2;
    }
}
