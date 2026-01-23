package com.robinhood.compose.bento.component.text;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTickerText.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/text/TickerPadding;", "", "start", "Landroidx/compose/ui/unit/Dp;", "end", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "horizontal", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getStart-D9Ej5fM", "()F", "F", "getEnd-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/robinhood/compose/bento/component/text/TickerPadding;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class TickerPadding {
    public static final int $stable = 0;
    private final float end;
    private final float start;

    public /* synthetic */ TickerPadding(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public /* synthetic */ TickerPadding(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ TickerPadding m21125copyYgX7TsA$default(TickerPadding tickerPadding, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = tickerPadding.start;
        }
        if ((i & 2) != 0) {
            f2 = tickerPadding.end;
        }
        return tickerPadding.m21128copyYgX7TsA(f, f2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEnd() {
        return this.end;
    }

    /* renamed from: copy-YgX7TsA, reason: not valid java name */
    public final TickerPadding m21128copyYgX7TsA(float start, float end) {
        return new TickerPadding(start, end, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TickerPadding)) {
            return false;
        }
        TickerPadding tickerPadding = (TickerPadding) other;
        return C2002Dp.m7997equalsimpl0(this.start, tickerPadding.start) && C2002Dp.m7997equalsimpl0(this.end, tickerPadding.end);
    }

    public int hashCode() {
        return (C2002Dp.m7998hashCodeimpl(this.start) * 31) + C2002Dp.m7998hashCodeimpl(this.end);
    }

    public String toString() {
        return "TickerPadding(start=" + C2002Dp.m7999toStringimpl(this.start) + ", end=" + C2002Dp.m7999toStringimpl(this.end) + ")";
    }

    private TickerPadding(float f, float f2) {
        this.start = f;
        this.end = f2;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m21130getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m21129getEndD9Ej5fM() {
        return this.end;
    }

    private TickerPadding(float f) {
        this(f, f, null);
    }

    public /* synthetic */ TickerPadding(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2002Dp.m7995constructorimpl(0) : f, (i & 2) != 0 ? C2002Dp.m7995constructorimpl(0) : f2, null);
    }
}
