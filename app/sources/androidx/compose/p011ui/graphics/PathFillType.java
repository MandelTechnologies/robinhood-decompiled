package androidx.compose.p011ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PathFillType.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\t"}, m3636d2 = {"Landroidx/compose/ui/graphics/PathFillType;", "", "", "value", "constructor-impl", "(I)I", "hashCode-impl", "hashCode", "Companion", "ui-graphics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class PathFillType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int NonZero = m6806constructorimpl(0);
    private static final int EvenOdd = m6806constructorimpl(1);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6806constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6807equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6808hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* compiled from: PathFillType.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m3636d2 = {"Landroidx/compose/ui/graphics/PathFillType$Companion;", "", "()V", "EvenOdd", "Landroidx/compose/ui/graphics/PathFillType;", "getEvenOdd-Rg-k1Os", "()I", "I", "NonZero", "getNonZero-Rg-k1Os", "ui-graphics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNonZero-Rg-k1Os, reason: not valid java name */
        public final int m6810getNonZeroRgk1Os() {
            return PathFillType.NonZero;
        }

        /* renamed from: getEvenOdd-Rg-k1Os, reason: not valid java name */
        public final int m6809getEvenOddRgk1Os() {
            return PathFillType.EvenOdd;
        }
    }
}
