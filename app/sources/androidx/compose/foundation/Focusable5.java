package androidx.compose.foundation;

import androidx.compose.p011ui.focus.FocusState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Focusable.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.FocusableNode$focusTargetNode$1, reason: use source file name */
/* loaded from: classes4.dex */
/* synthetic */ class Focusable5 extends FunctionReferenceImpl implements Function2<FocusState, FocusState, Unit> {
    Focusable5(Object obj) {
        super(2, obj, Focusable3.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState, FocusState focusState2) {
        invoke2(focusState, focusState2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusState focusState, FocusState focusState2) {
        ((Focusable3) this.receiver).onFocusStateChange(focusState, focusState2);
    }
}
