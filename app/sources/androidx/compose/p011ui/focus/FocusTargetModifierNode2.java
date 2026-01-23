package androidx.compose.p011ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FocusTargetModifierNode.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aX\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002:\b\u0002\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/ui/focus/Focusability;", "focusability", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusState;", "Lkotlin/ParameterName;", "name", "previous", "current", "", "onFocusChange", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "FocusTargetModifierNode-PYyLHbc", "(ILkotlin/jvm/functions/Function2;)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "FocusTargetModifierNode", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.focus.FocusTargetModifierNodeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class FocusTargetModifierNode2 {
    /* renamed from: FocusTargetModifierNode-PYyLHbc$default, reason: not valid java name */
    public static /* synthetic */ FocusTargetModifierNode m6502FocusTargetModifierNodePYyLHbc$default(int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Focusability.INSTANCE.m6513getAlwaysLCbbffg();
        }
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        return m6501FocusTargetModifierNodePYyLHbc(i, function2);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc, reason: not valid java name */
    public static final FocusTargetModifierNode m6501FocusTargetModifierNodePYyLHbc(int i, Function2<? super FocusState, ? super FocusState, Unit> function2) {
        return new FocusTargetNode(i, function2, null, 4, null);
    }
}
