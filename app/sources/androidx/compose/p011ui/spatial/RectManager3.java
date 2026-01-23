package androidx.compose.p011ui.spatial;

import androidx.compose.p011ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RectManager.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, m3636d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "analyzeComponents-58bKbWc", "([F)I", "analyzeComponents", "Landroidx/compose/ui/unit/IntOffset;", "", "isSet--gyyYBs", "(J)Z", "isSet", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.spatial.RectManagerKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class RectManager3 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isSet--gyyYBs, reason: not valid java name */
    public static final boolean m7506isSetgyyYBs(long j) {
        return !IntOffset.m8037equalsimpl0(j, IntOffset.INSTANCE.m8046getMaxnOccac());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: analyzeComponents-58bKbWc, reason: not valid java name */
    public static final int m7505analyzeComponents58bKbWc(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }
}
