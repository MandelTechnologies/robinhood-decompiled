package com.robinhood.shared.ticker.internal;

import androidx.compose.animation.core.EasingFunctions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TickerColumnSnapshot.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0002\u0010\u0018J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003JB\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;", "", "previousChar", "", "currentChar", "scrollDirection", "Lcom/robinhood/shared/ticker/internal/ScrollDirection;", "isExiting", "", "isEntering", "<init>", "(Ljava/lang/Character;CLcom/robinhood/shared/ticker/internal/ScrollDirection;ZZ)V", "getPreviousChar", "()Ljava/lang/Character;", "Ljava/lang/Character;", "getCurrentChar", "()C", "getScrollDirection", "()Lcom/robinhood/shared/ticker/internal/ScrollDirection;", "()Z", "currentCharOffset", "", "progress", "previousCharOffset", "(F)Ljava/lang/Float;", "currentCharAlpha", "previousCharAlpha", "shouldRender", "ignorePreviousChar", "getIgnorePreviousChar", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Character;CLcom/robinhood/shared/ticker/internal/ScrollDirection;ZZ)Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;", "equals", "other", "hashCode", "", "toString", "", "lib-ticker-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TickerColumnSnapshot {
    public static final int $stable = 0;
    private final char currentChar;
    private final boolean isEntering;
    private final boolean isExiting;
    private final Character previousChar;
    private final ScrollDirection scrollDirection;

    /* compiled from: TickerColumnSnapshot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrollDirection.values().length];
            try {
                iArr[ScrollDirection.f6278UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollDirection.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ TickerColumnSnapshot copy$default(TickerColumnSnapshot tickerColumnSnapshot, Character ch, char c, ScrollDirection scrollDirection, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            ch = tickerColumnSnapshot.previousChar;
        }
        if ((i & 2) != 0) {
            c = tickerColumnSnapshot.currentChar;
        }
        if ((i & 4) != 0) {
            scrollDirection = tickerColumnSnapshot.scrollDirection;
        }
        if ((i & 8) != 0) {
            z = tickerColumnSnapshot.isExiting;
        }
        if ((i & 16) != 0) {
            z2 = tickerColumnSnapshot.isEntering;
        }
        boolean z3 = z2;
        ScrollDirection scrollDirection2 = scrollDirection;
        return tickerColumnSnapshot.copy(ch, c, scrollDirection2, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final Character getPreviousChar() {
        return this.previousChar;
    }

    /* renamed from: component2, reason: from getter */
    public final char getCurrentChar() {
        return this.currentChar;
    }

    /* renamed from: component3, reason: from getter */
    public final ScrollDirection getScrollDirection() {
        return this.scrollDirection;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsExiting() {
        return this.isExiting;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsEntering() {
        return this.isEntering;
    }

    public final TickerColumnSnapshot copy(Character previousChar, char currentChar, ScrollDirection scrollDirection, boolean isExiting, boolean isEntering) {
        Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
        return new TickerColumnSnapshot(previousChar, currentChar, scrollDirection, isExiting, isEntering);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TickerColumnSnapshot)) {
            return false;
        }
        TickerColumnSnapshot tickerColumnSnapshot = (TickerColumnSnapshot) other;
        return Intrinsics.areEqual(this.previousChar, tickerColumnSnapshot.previousChar) && this.currentChar == tickerColumnSnapshot.currentChar && this.scrollDirection == tickerColumnSnapshot.scrollDirection && this.isExiting == tickerColumnSnapshot.isExiting && this.isEntering == tickerColumnSnapshot.isEntering;
    }

    public int hashCode() {
        Character ch = this.previousChar;
        return ((((((((ch == null ? 0 : ch.hashCode()) * 31) + Character.hashCode(this.currentChar)) * 31) + this.scrollDirection.hashCode()) * 31) + Boolean.hashCode(this.isExiting)) * 31) + Boolean.hashCode(this.isEntering);
    }

    public String toString() {
        return "TickerColumnSnapshot(previousChar=" + this.previousChar + ", currentChar=" + this.currentChar + ", scrollDirection=" + this.scrollDirection + ", isExiting=" + this.isExiting + ", isEntering=" + this.isEntering + ")";
    }

    public TickerColumnSnapshot(Character ch, char c, ScrollDirection scrollDirection, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
        this.previousChar = ch;
        this.currentChar = c;
        this.scrollDirection = scrollDirection;
        this.isExiting = z;
        this.isEntering = z2;
    }

    public final Character getPreviousChar() {
        return this.previousChar;
    }

    public final char getCurrentChar() {
        return this.currentChar;
    }

    public final ScrollDirection getScrollDirection() {
        return this.scrollDirection;
    }

    public final boolean isExiting() {
        return this.isExiting;
    }

    public final boolean isEntering() {
        return this.isEntering;
    }

    public final float currentCharOffset(float progress) {
        if (this.isExiting) {
            return progress;
        }
        if (this.isEntering) {
            return 1.0f - progress;
        }
        if (this.previousChar != null) {
            return (this.scrollDirection == ScrollDirection.f6278UP ? 1.0f : -1.0f) * (1.0f - progress);
        }
        return 0.0f;
    }

    public final Float previousCharOffset(float progress) {
        if (getIgnorePreviousChar()) {
            return null;
        }
        float fCurrentCharOffset = currentCharOffset(progress);
        int i = WhenMappings.$EnumSwitchMapping$0[this.scrollDirection.ordinal()];
        if (i == 1) {
            return Float.valueOf(fCurrentCharOffset - 1.0f);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Float.valueOf(fCurrentCharOffset + 1.0f);
    }

    public final float currentCharAlpha(float progress) {
        float fTransform;
        if (this.isExiting) {
            return ((1.0f - EasingFunctions.getEaseOut().transform(progress)) * 0.92f) + 0.08f;
        }
        if (this.isEntering) {
            fTransform = EasingFunctions.getEaseIn().transform(progress);
        } else {
            if (this.previousChar == null) {
                return 1.0f;
            }
            fTransform = EasingFunctions.getEaseInOut().transform(progress);
        }
        return (fTransform * 0.92f) + 0.08f;
    }

    public final Float previousCharAlpha(float progress) {
        if (getIgnorePreviousChar()) {
            return null;
        }
        return Float.valueOf(((1.0f - EasingFunctions.getEaseOut().transform(progress)) * 0.92f) + 0.08f);
    }

    public final boolean shouldRender(float progress) {
        return !this.isExiting || progress < 1.0f;
    }

    private final boolean getIgnorePreviousChar() {
        return this.previousChar == null || this.isEntering;
    }
}
