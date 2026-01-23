package androidx.compose.p011ui.node;

import androidx.compose.p011ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TouchBoundsExpansion.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\nR\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, m3636d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "", "packedValue", "constructor-impl", "(J)J", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "computeLeft-impl$ui_release", "(JLandroidx/compose/ui/unit/LayoutDirection;)I", "computeLeft", "computeRight-impl$ui_release", "computeRight", "getStart-impl", "(J)I", "start", "getTop-impl", "top", "getEnd-impl", "end", "getBottom-impl", "bottom", "", "isLayoutDirectionAware-impl", "(J)Z", "isLayoutDirectionAware", "Companion", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
/* loaded from: classes4.dex */
public final class TouchBoundsExpansion {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long None = TouchBoundsExpansion3.TouchBoundsExpansion$default(0, 0, 0, 0, 14, null);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7399constructorimpl(long j) {
        return j;
    }

    /* renamed from: isLayoutDirectionAware-impl, reason: not valid java name */
    public static final boolean m7404isLayoutDirectionAwareimpl(long j) {
        return (j & Long.MIN_VALUE) != 0;
    }

    /* compiled from: TouchBoundsExpansion.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m3636d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion$Companion;", "", "<init>", "()V", "", "packedValue", "", "position", "unpack", "(JI)I", "int", "trimAndShift", "(II)J", "start", "top", "end", "bottom", "", "isLayoutDirectionAware", "pack$ui_release", "(IIIIZ)J", "pack", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "None", "J", "getNone-RZrCHBk", "()J", "IS_LAYOUT_DIRECTION_AWARE", "MASK", "I", "MAX_VALUE", "SHIFT", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long trimAndShift(int i, int position) {
            return (i & 32767) << (position * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int unpack(long packedValue, int position) {
            return ((int) (packedValue >> (position * 15))) & 32767;
        }

        private Companion() {
        }

        /* renamed from: getNone-RZrCHBk, reason: not valid java name */
        public final long m7405getNoneRZrCHBk() {
            return TouchBoundsExpansion.None;
        }

        public final long pack$ui_release(int start, int top, int end, int bottom, boolean isLayoutDirectionAware) {
            return trimAndShift(top, 1) | trimAndShift(start, 0) | trimAndShift(end, 2) | trimAndShift(bottom, 3) | (isLayoutDirectionAware ? Long.MIN_VALUE : 0L);
        }
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m7402getStartimpl(long j) {
        return INSTANCE.unpack(j, 0);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m7403getTopimpl(long j) {
        return INSTANCE.unpack(j, 1);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m7401getEndimpl(long j) {
        return INSTANCE.unpack(j, 2);
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m7400getBottomimpl(long j) {
        return INSTANCE.unpack(j, 3);
    }

    /* renamed from: computeLeft-impl$ui_release, reason: not valid java name */
    public static final int m7397computeLeftimpl$ui_release(long j, LayoutDirection layoutDirection) {
        if (!m7404isLayoutDirectionAwareimpl(j) || layoutDirection == LayoutDirection.Ltr) {
            return m7402getStartimpl(j);
        }
        return m7401getEndimpl(j);
    }

    /* renamed from: computeRight-impl$ui_release, reason: not valid java name */
    public static final int m7398computeRightimpl$ui_release(long j, LayoutDirection layoutDirection) {
        if (!m7404isLayoutDirectionAwareimpl(j) || layoutDirection == LayoutDirection.Ltr) {
            return m7401getEndimpl(j);
        }
        return m7402getStartimpl(j);
    }
}
