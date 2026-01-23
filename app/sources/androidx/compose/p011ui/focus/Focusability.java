package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.input.InputModeManager;
import androidx.compose.p011ui.input.InputModeManager2;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p011ui.node.CompositionLocalConsumerModifierNode2;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Focusability.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\r"}, m3636d2 = {"Landroidx/compose/ui/focus/Focusability;", "", "", "value", "constructor-impl", "(I)I", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "node", "", "canFocus-impl$ui_release", "(ILandroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Z", "canFocus", "Companion", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class Focusability {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Always = m6511constructorimpl(1);
    private static final int SystemDefined = m6511constructorimpl(0);
    private static final int Never = m6511constructorimpl(2);

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6511constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6512equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* compiled from: Focusability.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m3636d2 = {"Landroidx/compose/ui/focus/Focusability$Companion;", "", "()V", "Always", "Landroidx/compose/ui/focus/Focusability;", "getAlways-LCbbffg", "()I", "I", "Never", "getNever-LCbbffg", "SystemDefined", "getSystemDefined-LCbbffg", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m6513getAlwaysLCbbffg() {
            return Focusability.Always;
        }

        /* renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m6515getSystemDefinedLCbbffg() {
            return Focusability.SystemDefined;
        }

        /* renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m6514getNeverLCbbffg() {
            return Focusability.Never;
        }
    }

    /* renamed from: canFocus-impl$ui_release, reason: not valid java name */
    public static final boolean m6510canFocusimpl$ui_release(int i, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (m6512equalsimpl0(i, Always)) {
            return true;
        }
        if (m6512equalsimpl0(i, SystemDefined)) {
            return !InputModeManager2.m7069equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNode2.currentValueOf(compositionLocalConsumerModifierNode, CompositionLocalsKt.getLocalInputModeManager())).mo7075getInputModeaOaMEAU(), InputModeManager2.INSTANCE.m7074getTouchaOaMEAU());
        }
        if (m6512equalsimpl0(i, Never)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }
}
