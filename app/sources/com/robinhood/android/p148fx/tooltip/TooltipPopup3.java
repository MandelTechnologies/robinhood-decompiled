package com.robinhood.android.p148fx.tooltip;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntRect;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.window.Popup3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TooltipPopup.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/fx/tooltip/TooltipAlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "centerPositionX", "", "horizontalPaddingInPx", "onArrowPositionX", "Lkotlin/Function1;", "", "<init>", "(Landroidx/compose/ui/Alignment;JFFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getOffset-nOcc-ac", "()J", "J", "getCenterPositionX", "()F", "getHorizontalPaddingInPx", "calculatePosition", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "lib-fx-tooltip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.fx.tooltip.TooltipAlignmentOffsetPositionProvider, reason: use source file name */
/* loaded from: classes10.dex */
final class TooltipPopup3 implements Popup3 {
    private final Alignment alignment;
    private final float centerPositionX;
    private final float horizontalPaddingInPx;
    private final long offset;
    private final Function1<Float, Unit> onArrowPositionX;

    public /* synthetic */ TooltipPopup3(Alignment alignment, long j, float f, float f2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j, f, f2, function1);
    }

    @Override // androidx.compose.p011ui.window.Popup3
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo4929calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long j = 0;
        long j2 = j << 32;
        long jM8033constructorimpl = IntOffset.m8033constructorimpl((j & 4294967295L) | j2);
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.INSTANCE;
        long jMo6433alignKFBX0sM = alignment.mo6433alignKFBX0sM(companion.m8064getZeroYbymL2g(), IntSize.m8056constructorimpl((anchorBounds.getHeight() & 4294967295L) | (anchorBounds.getWidth() << 32)), layoutDirection);
        int i = (int) (popupContentSize >> 32);
        long jMo6433alignKFBX0sM2 = this.alignment.mo6433alignKFBX0sM(companion.m8064getZeroYbymL2g(), IntSize.m8056constructorimpl((i << 32) | (((int) (popupContentSize & 4294967295L)) & 4294967295L)), layoutDirection);
        long jM8042plusqkQi6aY = IntOffset.m8042plusqkQi6aY(IntOffset.m8041minusqkQi6aY(IntOffset.m8042plusqkQi6aY(IntOffset.m8042plusqkQi6aY(jM8033constructorimpl, IntOffset.m8033constructorimpl((anchorBounds.getTop() & 4294967295L) | (anchorBounds.getLeft() << 32))), jMo6433alignKFBX0sM), IntOffset.m8033constructorimpl((IntOffset.m8039getYimpl(jMo6433alignKFBX0sM2) & 4294967295L) | (IntOffset.m8038getXimpl(jMo6433alignKFBX0sM2) << 32))), IntOffset.m8033constructorimpl((IntOffset.m8039getYimpl(this.offset) & 4294967295L) | ((IntOffset.m8038getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1)) << 32)));
        float f = this.centerPositionX;
        float f2 = this.horizontalPaddingInPx;
        float f3 = f - f2;
        float f4 = (int) (windowSize >> 32);
        float f5 = (f4 - f) - f2;
        int iM8038getXimpl = IntOffset.m8038getXimpl(IntSize2.m8065getCenterozmzZPI(popupContentSize));
        float f6 = this.horizontalPaddingInPx * 2;
        float f7 = f4 - f6;
        float f8 = iM8038getXimpl;
        if (f8 <= f3 && f8 <= f5) {
            long jM8033constructorimpl2 = IntOffset.m8033constructorimpl(((((int) this.centerPositionX) - iM8038getXimpl) << 32) | (IntOffset.m8039getYimpl(jM8042plusqkQi6aY) & 4294967295L));
            this.onArrowPositionX.invoke(Float.valueOf(f8 - this.horizontalPaddingInPx));
            return jM8033constructorimpl2;
        }
        if (i >= f7) {
            long jM8033constructorimpl3 = IntOffset.m8033constructorimpl(((IntOffset.m8038getXimpl(IntSize2.m8065getCenterozmzZPI(windowSize)) - iM8038getXimpl) << 32) | (IntOffset.m8039getYimpl(jM8042plusqkQi6aY) & 4294967295L));
            this.onArrowPositionX.invoke(Float.valueOf((this.centerPositionX - IntOffset.m8038getXimpl(jM8033constructorimpl3)) - this.horizontalPaddingInPx));
            return jM8033constructorimpl3;
        }
        if (f8 > f5) {
            long jM8033constructorimpl4 = IntOffset.m8033constructorimpl((IntOffset.m8039getYimpl(jM8042plusqkQi6aY) & 4294967295L) | (((int) this.centerPositionX) << 32));
            this.onArrowPositionX.invoke(Float.valueOf((f8 + (f8 - f5)) - f6));
            return jM8033constructorimpl4;
        }
        if (f8 <= f3) {
            this.onArrowPositionX.invoke(Float.valueOf(this.centerPositionX));
            return jM8042plusqkQi6aY;
        }
        long jM8033constructorimpl5 = IntOffset.m8033constructorimpl(j2 | (IntOffset.m8039getYimpl(jM8042plusqkQi6aY) & 4294967295L));
        this.onArrowPositionX.invoke(Float.valueOf(this.centerPositionX - this.horizontalPaddingInPx));
        return jM8033constructorimpl5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TooltipPopup3(Alignment alignment, long j, float f, float f2, Function1<? super Float, Unit> onArrowPositionX) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(onArrowPositionX, "onArrowPositionX");
        this.alignment = alignment;
        this.offset = j;
        this.centerPositionX = f;
        this.horizontalPaddingInPx = f2;
        this.onArrowPositionX = onArrowPositionX;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    public final float getCenterPositionX() {
        return this.centerPositionX;
    }

    public final float getHorizontalPaddingInPx() {
        return this.horizontalPaddingInPx;
    }
}
