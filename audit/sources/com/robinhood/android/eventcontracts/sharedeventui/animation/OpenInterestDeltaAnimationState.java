package com.robinhood.android.eventcontracts.sharedeventui.animation;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DeltaAnimations.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/animation/OpenInterestDeltaAnimationState;", "", "animatedTextColor", "Landroidx/compose/ui/graphics/Color;", "iconAlpha", "", "<init>", "(JFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimatedTextColor-0d7_KjU", "()J", "J", "getIconAlpha", "()F", "component1", "component1-0d7_KjU", "component2", "copy", "copy-DxMtmZc", "(JF)Lcom/robinhood/android/eventcontracts/sharedeventui/animation/OpenInterestDeltaAnimationState;", "equals", "", "other", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenInterestDeltaAnimationState {
    public static final int $stable = 0;
    private final long animatedTextColor;
    private final float iconAlpha;

    public /* synthetic */ OpenInterestDeltaAnimationState(long j, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f);
    }

    /* renamed from: copy-DxMtmZc$default, reason: not valid java name */
    public static /* synthetic */ OpenInterestDeltaAnimationState m14391copyDxMtmZc$default(OpenInterestDeltaAnimationState openInterestDeltaAnimationState, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = openInterestDeltaAnimationState.animatedTextColor;
        }
        if ((i & 2) != 0) {
            f = openInterestDeltaAnimationState.iconAlpha;
        }
        return openInterestDeltaAnimationState.m14393copyDxMtmZc(j, f);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getAnimatedTextColor() {
        return this.animatedTextColor;
    }

    /* renamed from: component2, reason: from getter */
    public final float getIconAlpha() {
        return this.iconAlpha;
    }

    /* renamed from: copy-DxMtmZc, reason: not valid java name */
    public final OpenInterestDeltaAnimationState m14393copyDxMtmZc(long animatedTextColor, float iconAlpha) {
        return new OpenInterestDeltaAnimationState(animatedTextColor, iconAlpha, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenInterestDeltaAnimationState)) {
            return false;
        }
        OpenInterestDeltaAnimationState openInterestDeltaAnimationState = (OpenInterestDeltaAnimationState) other;
        return Color.m6707equalsimpl0(this.animatedTextColor, openInterestDeltaAnimationState.animatedTextColor) && Float.compare(this.iconAlpha, openInterestDeltaAnimationState.iconAlpha) == 0;
    }

    public int hashCode() {
        return (Color.m6713hashCodeimpl(this.animatedTextColor) * 31) + Float.hashCode(this.iconAlpha);
    }

    public String toString() {
        return "OpenInterestDeltaAnimationState(animatedTextColor=" + Color.m6714toStringimpl(this.animatedTextColor) + ", iconAlpha=" + this.iconAlpha + ")";
    }

    private OpenInterestDeltaAnimationState(long j, float f) {
        this.animatedTextColor = j;
        this.iconAlpha = f;
    }

    /* renamed from: getAnimatedTextColor-0d7_KjU, reason: not valid java name */
    public final long m14394getAnimatedTextColor0d7_KjU() {
        return this.animatedTextColor;
    }

    public final float getIconAlpha() {
        return this.iconAlpha;
    }
}
