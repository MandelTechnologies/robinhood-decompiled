package com.robinhood.utils.p409ui.edge2edge;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InsetSides.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0005J\u0010\u0010\u001e\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006#"}, m3636d2 = {"Lcom/robinhood/utils/ui/edge2edge/InsetSides;", "", "value", "", "constructor-impl", "(I)I", "start", "", "getStart-impl", "(I)Z", "top", "getTop-impl", "end", "getEnd-impl", "bottom", "getBottom-impl", "plus", "augend", "plus-qWd6VVo", "(II)I", "bitAt", "bitIndex", "bitAt-impl", "(II)Z", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class InsetSides {
    private static final int All;
    private static final int BIT_BOTTOM = 3;
    private static final int BIT_END = 2;
    private static final int BIT_START = 0;
    private static final int BIT_TOP = 1;
    private static final int Bottom;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;
    private final int value;

    /* renamed from: bitAt-impl, reason: not valid java name */
    private static final boolean m26665bitAtimpl(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InsetSides m26666boximpl(int i) {
        return new InsetSides(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26667constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26668equalsimpl(int i, Object obj) {
        return (obj instanceof InsetSides) && i == ((InsetSides) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26669equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final boolean m26670getBottomimpl(int i) {
        return (i & 8) != 0;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final boolean m26671getEndimpl(int i) {
        return (i & 4) != 0;
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final boolean m26672getStartimpl(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final boolean m26673getTopimpl(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26674hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26676toStringimpl(int i) {
        return "InsetSides(value=" + i + ")";
    }

    public boolean equals(Object obj) {
        return m26668equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26674hashCodeimpl(this.value);
    }

    public String toString() {
        return m26676toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    private /* synthetic */ InsetSides(int i) {
        this.value = i;
    }

    /* renamed from: plus-qWd6VVo, reason: not valid java name */
    public static final int m26675plusqWd6VVo(int i, int i2) {
        return m26667constructorimpl(i | i2);
    }

    /* compiled from: InsetSides.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0082\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0010\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0012\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0014\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0016\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\u000eR\u0013\u0010\u0018\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0019\u0010\u000eR\u0013\u0010\u001a\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/utils/ui/edge2edge/InsetSides$Companion;", "", "<init>", "()V", "BIT_START", "", "BIT_TOP", "BIT_END", "BIT_BOTTOM", "mask", "bitIndex", "Start", "Lcom/robinhood/utils/ui/edge2edge/InsetSides;", "getStart-XedK2Rk", "()I", "I", "Top", "getTop-XedK2Rk", "End", "getEnd-XedK2Rk", "Bottom", "getBottom-XedK2Rk", "Horizontal", "getHorizontal-XedK2Rk", "Vertical", "getVertical-XedK2Rk", "All", "getAll-XedK2Rk", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int mask(int bitIndex) {
            return 1 << bitIndex;
        }

        private Companion() {
        }

        /* renamed from: getStart-XedK2Rk, reason: not valid java name */
        public final int m26682getStartXedK2Rk() {
            return InsetSides.Start;
        }

        /* renamed from: getTop-XedK2Rk, reason: not valid java name */
        public final int m26683getTopXedK2Rk() {
            return InsetSides.Top;
        }

        /* renamed from: getEnd-XedK2Rk, reason: not valid java name */
        public final int m26680getEndXedK2Rk() {
            return InsetSides.End;
        }

        /* renamed from: getBottom-XedK2Rk, reason: not valid java name */
        public final int m26679getBottomXedK2Rk() {
            return InsetSides.Bottom;
        }

        /* renamed from: getHorizontal-XedK2Rk, reason: not valid java name */
        public final int m26681getHorizontalXedK2Rk() {
            return InsetSides.Horizontal;
        }

        /* renamed from: getVertical-XedK2Rk, reason: not valid java name */
        public final int m26684getVerticalXedK2Rk() {
            return InsetSides.Vertical;
        }

        /* renamed from: getAll-XedK2Rk, reason: not valid java name */
        public final int m26678getAllXedK2Rk() {
            return InsetSides.All;
        }
    }

    static {
        int iM26667constructorimpl = m26667constructorimpl(1);
        Start = iM26667constructorimpl;
        int iM26667constructorimpl2 = m26667constructorimpl(2);
        Top = iM26667constructorimpl2;
        int iM26667constructorimpl3 = m26667constructorimpl(4);
        End = iM26667constructorimpl3;
        int iM26667constructorimpl4 = m26667constructorimpl(8);
        Bottom = iM26667constructorimpl4;
        int iM26675plusqWd6VVo = m26675plusqWd6VVo(iM26667constructorimpl, iM26667constructorimpl3);
        Horizontal = iM26675plusqWd6VVo;
        int iM26675plusqWd6VVo2 = m26675plusqWd6VVo(iM26667constructorimpl2, iM26667constructorimpl4);
        Vertical = iM26675plusqWd6VVo2;
        All = m26675plusqWd6VVo(iM26675plusqWd6VVo, iM26675plusqWd6VVo2);
    }
}
