package androidx.compose.p011ui.platform;

import android.view.View;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier8;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: NestedScrollInteropConnection.android.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0002\u001a\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0016\u0010\u0014\u001a\u00020\u0004*\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001c\u001a\u00020\u0004*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m3636d2 = {"", "ceilAwayFromZero", "(F)F", "offset", "", "composeToViewOffset", "(F)I", "reverseAxis", "(I)F", "toViewVelocity", "", "consumed", "Landroidx/compose/ui/geometry/Offset;", "available", "toOffset-Uv8p0NA", "([IJ)J", "toOffset", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "toViewType-GyEprt8", "(I)I", "toViewType", "Landroid/view/View;", "hostView", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberNestedScrollInteropConnection", "(Landroid/view/View;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getScrollAxes-k-4lQ0M", "(J)I", "scrollAxes", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float reverseAxis(int i) {
        return i * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f) {
        return f * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m7454getScrollAxesk4lQ0M(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    public static final long m7455toOffsetUv8p0NA(int[] iArr, long j) {
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) >= 0.0f ? RangesKt.coerceAtMost(reverseAxis(iArr[0]), Float.intBitsToFloat(r1)) : RangesKt.coerceAtLeast(reverseAxis(iArr[0]), Float.intBitsToFloat(r1))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) >= 0.0f ? RangesKt.coerceAtMost(reverseAxis(iArr[1]), Float.intBitsToFloat(r7)) : RangesKt.coerceAtLeast(reverseAxis(iArr[1]), Float.intBitsToFloat(r7))) & 4294967295L));
    }

    private static final float ceilAwayFromZero(float f) {
        return (float) (f >= 0.0f ? Math.ceil(f) : Math.floor(f));
    }

    public static final int composeToViewOffset(float f) {
        return ((int) ceilAwayFromZero(f)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m7456toViewTypeGyEprt8(int i) {
        return !NestedScrollModifier8.m7133equalsimpl0(i, NestedScrollModifier8.INSTANCE.m7136getUserInputWNlRxjI()) ? 1 : 0;
    }

    public static final NestedScrollModifier rememberNestedScrollInteropConnection(View view, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1075877987, i, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:231)");
        }
        boolean zChanged = composer.changed(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new NestedScrollInteropConnection(view);
            composer.updateRememberedValue(objRememberedValue);
        }
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return nestedScrollInteropConnection;
    }
}
