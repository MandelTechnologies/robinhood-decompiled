package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MotionLayout.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000f"}, m3636d2 = {"Landroidx/constraintlayout/compose/DebugFlags;", "", "", "flags", "constructor-impl", "(I)I", "", "getShowBounds-impl", "(I)Z", "showBounds", "getShowPaths-impl", "showPaths", "getShowKeyPositions-impl", "showKeyPositions", "Companion", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@JvmInline
/* loaded from: classes4.dex */
public final class DebugFlags {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int None = m8154constructorimpl(0);
    private static final int All = m8154constructorimpl(-1);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8154constructorimpl(int i) {
        return i;
    }

    /* renamed from: getShowBounds-impl, reason: not valid java name */
    public static final boolean m8155getShowBoundsimpl(int i) {
        return (i & 1) > 0;
    }

    /* renamed from: getShowKeyPositions-impl, reason: not valid java name */
    public static final boolean m8156getShowKeyPositionsimpl(int i) {
        return (i & 4) > 0;
    }

    /* renamed from: getShowPaths-impl, reason: not valid java name */
    public static final boolean m8157getShowPathsimpl(int i) {
        return (i & 2) > 0;
    }

    /* compiled from: MotionLayout.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, m3636d2 = {"Landroidx/constraintlayout/compose/DebugFlags$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/DebugFlags;", "None", "I", "getNone-bfy_xzQ", "()I", "", "BOUNDS_FLAG", "KEY_POSITIONS_FLAG", "PATHS_FLAG", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNone-bfy_xzQ, reason: not valid java name */
        public final int m8158getNonebfy_xzQ() {
            return DebugFlags.None;
        }
    }
}
