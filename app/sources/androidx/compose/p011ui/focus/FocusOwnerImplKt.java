package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.focus.FocusDirection;
import kotlin.Metadata;

/* compiled from: FocusOwnerImpl.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, m3636d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", "is1dFocusSearch-3ESFkO8", "(I)Z", "is1dFocusSearch", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class FocusOwnerImplKt {
    /* renamed from: is1dFocusSearch-3ESFkO8, reason: not valid java name */
    public static final boolean m6496is1dFocusSearch3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m6474equalsimpl0(i, companion.m6482getNextdhqQ8s())) {
            return true;
        }
        return FocusDirection.m6474equalsimpl0(i, companion.m6483getPreviousdhqQ8s());
    }
}
