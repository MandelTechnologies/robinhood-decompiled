package androidx.compose.foundation.interaction;

import kotlin.Metadata;

/* compiled from: FocusInteraction.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"androidx/compose/foundation/interaction/FocusInteraction$Unfocus", "", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "focus", "<init>", "(Landroidx/compose/foundation/interaction/FocusInteraction$Focus;)V", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "getFocus", "()Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.interaction.FocusInteraction$Unfocus, reason: use source file name */
/* loaded from: classes4.dex */
public final class FocusInteraction2 implements Interaction {
    private final FocusInteraction focus;

    public FocusInteraction2(FocusInteraction focusInteraction) {
        this.focus = focusInteraction;
    }

    public final FocusInteraction getFocus() {
        return this.focus;
    }
}
