package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidScrollable.android.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m3636d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "event", "Landroidx/compose/ui/unit/IntSize;", "bounds", "Landroidx/compose/ui/geometry/Offset;", "calculateMouseWheelScroll-8xgXZGE", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", "calculateMouseWheelScroll", "Landroid/view/ViewConfiguration;", "getViewConfiguration", "()Landroid/view/ViewConfiguration;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class AndroidConfig implements ScrollConfig {
    private final ViewConfiguration viewConfiguration;

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo4959calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j) {
        float fMo5016toPx0680j_4;
        float fMo5016toPx0680j_42;
        int i = Build.VERSION.SDK_INT;
        if (i > 26) {
            fMo5016toPx0680j_4 = ViewConfigurationApi26Impl.INSTANCE.getVerticalScrollFactor(this.viewConfiguration);
        } else {
            fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(64));
        }
        float f = -fMo5016toPx0680j_4;
        if (i > 26) {
            fMo5016toPx0680j_42 = ViewConfigurationApi26Impl.INSTANCE.getHorizontalScrollFactor(this.viewConfiguration);
        } else {
            fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(64));
        }
        float f2 = -fMo5016toPx0680j_42;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset offsetM6534boximpl = Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0());
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            offsetM6534boximpl = Offset.m6534boximpl(Offset.m6547plusMKHz9U(offsetM6534boximpl.getPackedValue(), changes.get(i2).getScrollDelta()));
        }
        long packedValue = offsetM6534boximpl.getPackedValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (packedValue >> 32)) * f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (packedValue & 4294967295L)) * f;
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }
}
