package com.robinhood.tooltips.popup;

import androidx.compose.p011ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PopupTooltip.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/tooltips/popup/TooltipPopupPosition;", "", "offset", "Landroidx/compose/ui/unit/IntOffset;", "alignment", "Lcom/robinhood/tooltips/popup/TooltipAlignment;", "centerPositionX", "", "<init>", "(JLcom/robinhood/tooltips/popup/TooltipAlignment;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOffset-nOcc-ac", "()J", "J", "getAlignment", "()Lcom/robinhood/tooltips/popup/TooltipAlignment;", "getCenterPositionX", "()F", "component1", "component1-nOcc-ac", "component2", "component3", "copy", "copy-f8xVGno", "(JLcom/robinhood/tooltips/popup/TooltipAlignment;F)Lcom/robinhood/tooltips/popup/TooltipPopupPosition;", "equals", "", "other", "hashCode", "", "toString", "", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class TooltipPopupPosition {
    public static final int $stable = 0;
    private final TooltipAlignment alignment;
    private final float centerPositionX;
    private final long offset;

    public /* synthetic */ TooltipPopupPosition(long j, TooltipAlignment tooltipAlignment, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, tooltipAlignment, f);
    }

    /* renamed from: copy-f8xVGno$default, reason: not valid java name */
    public static /* synthetic */ TooltipPopupPosition m26523copyf8xVGno$default(TooltipPopupPosition tooltipPopupPosition, long j, TooltipAlignment tooltipAlignment, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tooltipPopupPosition.offset;
        }
        if ((i & 2) != 0) {
            tooltipAlignment = tooltipPopupPosition.alignment;
        }
        if ((i & 4) != 0) {
            f = tooltipPopupPosition.centerPositionX;
        }
        return tooltipPopupPosition.m26525copyf8xVGno(j, tooltipAlignment, f);
    }

    /* renamed from: component1-nOcc-ac, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* renamed from: component2, reason: from getter */
    public final TooltipAlignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCenterPositionX() {
        return this.centerPositionX;
    }

    /* renamed from: copy-f8xVGno, reason: not valid java name */
    public final TooltipPopupPosition m26525copyf8xVGno(long offset, TooltipAlignment alignment, float centerPositionX) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new TooltipPopupPosition(offset, alignment, centerPositionX, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipPopupPosition)) {
            return false;
        }
        TooltipPopupPosition tooltipPopupPosition = (TooltipPopupPosition) other;
        return IntOffset.m8037equalsimpl0(this.offset, tooltipPopupPosition.offset) && this.alignment == tooltipPopupPosition.alignment && Float.compare(this.centerPositionX, tooltipPopupPosition.centerPositionX) == 0;
    }

    public int hashCode() {
        return (((IntOffset.m8040hashCodeimpl(this.offset) * 31) + this.alignment.hashCode()) * 31) + Float.hashCode(this.centerPositionX);
    }

    public String toString() {
        return "TooltipPopupPosition(offset=" + IntOffset.m8043toStringimpl(this.offset) + ", alignment=" + this.alignment + ", centerPositionX=" + this.centerPositionX + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TooltipPopupPosition(long j, TooltipAlignment tooltipAlignment, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            long j2 = 0;
            j = IntOffset.m8033constructorimpl((j2 & 4294967295L) | (j2 << 32));
        }
        this(j, (i & 2) != 0 ? TooltipAlignment.TOP : tooltipAlignment, (i & 4) != 0 ? 0.0f : f, null);
    }

    private TooltipPopupPosition(long j, TooltipAlignment alignment, float f) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.offset = j;
        this.alignment = alignment;
        this.centerPositionX = f;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m26526getOffsetnOccac() {
        return this.offset;
    }

    public final TooltipAlignment getAlignment() {
        return this.alignment;
    }

    public final float getCenterPositionX() {
        return this.centerPositionX;
    }
}
