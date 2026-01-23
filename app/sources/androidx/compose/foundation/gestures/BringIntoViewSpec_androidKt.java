package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.CompositionLocal2;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: BringIntoViewSpec.android.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\"&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\" \u0010\b\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0007\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "LocalBringIntoViewSpec", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalBringIntoViewSpec", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalBringIntoViewSpec$annotations", "()V", "PivotBringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getPivotBringIntoViewSpec", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getPivotBringIntoViewSpec$annotations", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class BringIntoViewSpec_androidKt {
    private static final CompositionLocal6<BringIntoViewSpec> LocalBringIntoViewSpec = CompositionLocal3.compositionLocalWithComputedDefaultOf(new Function1<CompositionLocal2, BringIntoViewSpec>() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1
        @Override // kotlin.jvm.functions.Function1
        public final BringIntoViewSpec invoke(CompositionLocal2 compositionLocal2) {
            if (!((Context) compositionLocal2.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext())).getPackageManager().hasSystemFeature("android.software.leanback")) {
                return BringIntoViewSpec.INSTANCE.getDefaultBringIntoViewSpec$foundation_release();
            }
            return BringIntoViewSpec_androidKt.getPivotBringIntoViewSpec();
        }
    });
    private static final BringIntoViewSpec PivotBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1
        private final float childFraction;
        private final float parentFraction = 0.3f;

        @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
        public float calculateScrollDistance(float offset, float size, float containerSize) {
            float fAbs = Math.abs((size + offset) - offset);
            boolean z = fAbs <= containerSize;
            float f = (this.parentFraction * containerSize) - (this.childFraction * fAbs);
            float f2 = containerSize - f;
            if (z && f2 < fAbs) {
                f = containerSize - fAbs;
            }
            return offset - f;
        }
    };

    public static final CompositionLocal6<BringIntoViewSpec> getLocalBringIntoViewSpec() {
        return LocalBringIntoViewSpec;
    }

    public static final BringIntoViewSpec getPivotBringIntoViewSpec() {
        return PivotBringIntoViewSpec;
    }
}
