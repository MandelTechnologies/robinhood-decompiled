package androidx.constraintlayout.compose;

import androidx.compose.p011ui.layout.LayoutId2;
import androidx.compose.p011ui.layout.Measurable;
import kotlin.Metadata;

/* compiled from: Measurer.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Landroidx/compose/ui/layout/Measurable;", "", "getAnyOrNullId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/String;", "anyOrNullId", "constraintlayout-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.constraintlayout.compose.MeasurerKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class Measurer3 {
    public static final String getAnyOrNullId(Measurable measurable) {
        String string2;
        Object layoutId = LayoutId2.getLayoutId(measurable);
        if (layoutId == null) {
            layoutId = ConstraintLayoutTag2.getConstraintLayoutId(measurable);
        }
        return (layoutId == null || (string2 = layoutId.toString()) == null) ? "null" : string2;
    }
}
