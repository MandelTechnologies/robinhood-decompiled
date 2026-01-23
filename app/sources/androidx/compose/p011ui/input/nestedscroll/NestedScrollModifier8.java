package androidx.compose.p011ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: NestedScrollModifier.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, m3636d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "", "", "value", "constructor-impl", "(I)I", "Companion", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollSource, reason: use source file name */
/* loaded from: classes4.dex */
public final class NestedScrollModifier8 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Drag;
    private static final int Fling;
    private static final int Relocate;
    private static final int SideEffect;
    private static final int UserInput;
    private static final int Wheel;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7132constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7133equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* compiled from: NestedScrollModifier.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR&\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollSource$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "UserInput", "I", "getUserInput-WNlRxjI", "()I", "SideEffect", "getSideEffect-WNlRxjI", "Fling", "getFling-WNlRxjI", "getFling-WNlRxjI$annotations", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollSource$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUserInput-WNlRxjI, reason: not valid java name */
        public final int m7136getUserInputWNlRxjI() {
            return NestedScrollModifier8.UserInput;
        }

        /* renamed from: getSideEffect-WNlRxjI, reason: not valid java name */
        public final int m7135getSideEffectWNlRxjI() {
            return NestedScrollModifier8.SideEffect;
        }

        /* renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m7134getFlingWNlRxjI() {
            return NestedScrollModifier8.Fling;
        }
    }

    static {
        int iM7132constructorimpl = m7132constructorimpl(1);
        UserInput = iM7132constructorimpl;
        int iM7132constructorimpl2 = m7132constructorimpl(2);
        SideEffect = iM7132constructorimpl2;
        Drag = iM7132constructorimpl;
        Fling = iM7132constructorimpl2;
        Relocate = m7132constructorimpl(3);
        Wheel = iM7132constructorimpl;
    }
}
