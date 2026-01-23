package com.robinhood.android.instrumentrow;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.instrumentrow.models.BackgroundColor;
import com.robinhood.android.instrumentrow.models.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PspRow.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\t\u0010\u0017\u001a\u00020\bHÆ\u0003J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/instrumentrow/PspRowState;", "", "primaryText", "Lcom/robinhood/android/instrumentrow/models/Text;", "secondaryText", "trailingTextColor", "Landroidx/compose/ui/graphics/Color;", "trailingTextBackgroundColor", "Lcom/robinhood/android/instrumentrow/models/BackgroundColor;", "<init>", "(Lcom/robinhood/android/instrumentrow/models/Text;Lcom/robinhood/android/instrumentrow/models/Text;JLcom/robinhood/android/instrumentrow/models/BackgroundColor;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPrimaryText", "()Lcom/robinhood/android/instrumentrow/models/Text;", "getSecondaryText", "getTrailingTextColor-0d7_KjU", "()J", "J", "getTrailingTextBackgroundColor", "()Lcom/robinhood/android/instrumentrow/models/BackgroundColor;", "component1", "component2", "component3", "component3-0d7_KjU", "component4", "copy", "copy-9LQNqLg", "(Lcom/robinhood/android/instrumentrow/models/Text;Lcom/robinhood/android/instrumentrow/models/Text;JLcom/robinhood/android/instrumentrow/models/BackgroundColor;)Lcom/robinhood/android/instrumentrow/PspRowState;", "equals", "", "other", "hashCode", "", "toString", "", "lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PspRowState {
    public static final int $stable = 0;
    private final Text primaryText;
    private final Text secondaryText;
    private final BackgroundColor trailingTextBackgroundColor;
    private final long trailingTextColor;

    public /* synthetic */ PspRowState(Text text, Text text2, long j, BackgroundColor backgroundColor, DefaultConstructorMarker defaultConstructorMarker) {
        this(text, text2, j, backgroundColor);
    }

    /* renamed from: copy-9LQNqLg$default, reason: not valid java name */
    public static /* synthetic */ PspRowState m15342copy9LQNqLg$default(PspRowState pspRowState, Text text, Text text2, long j, BackgroundColor backgroundColor, int i, Object obj) {
        if ((i & 1) != 0) {
            text = pspRowState.primaryText;
        }
        if ((i & 2) != 0) {
            text2 = pspRowState.secondaryText;
        }
        if ((i & 4) != 0) {
            j = pspRowState.trailingTextColor;
        }
        if ((i & 8) != 0) {
            backgroundColor = pspRowState.trailingTextBackgroundColor;
        }
        BackgroundColor backgroundColor2 = backgroundColor;
        return pspRowState.m15344copy9LQNqLg(text, text2, j, backgroundColor2);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getTrailingTextColor() {
        return this.trailingTextColor;
    }

    /* renamed from: component4, reason: from getter */
    public final BackgroundColor getTrailingTextBackgroundColor() {
        return this.trailingTextBackgroundColor;
    }

    /* renamed from: copy-9LQNqLg, reason: not valid java name */
    public final PspRowState m15344copy9LQNqLg(Text primaryText, Text secondaryText, long trailingTextColor, BackgroundColor trailingTextBackgroundColor) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(trailingTextBackgroundColor, "trailingTextBackgroundColor");
        return new PspRowState(primaryText, secondaryText, trailingTextColor, trailingTextBackgroundColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PspRowState)) {
            return false;
        }
        PspRowState pspRowState = (PspRowState) other;
        return Intrinsics.areEqual(this.primaryText, pspRowState.primaryText) && Intrinsics.areEqual(this.secondaryText, pspRowState.secondaryText) && Color.m6707equalsimpl0(this.trailingTextColor, pspRowState.trailingTextColor) && Intrinsics.areEqual(this.trailingTextBackgroundColor, pspRowState.trailingTextBackgroundColor);
    }

    public int hashCode() {
        return (((((this.primaryText.hashCode() * 31) + this.secondaryText.hashCode()) * 31) + Color.m6713hashCodeimpl(this.trailingTextColor)) * 31) + this.trailingTextBackgroundColor.hashCode();
    }

    public String toString() {
        return "PspRowState(primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", trailingTextColor=" + Color.m6714toStringimpl(this.trailingTextColor) + ", trailingTextBackgroundColor=" + this.trailingTextBackgroundColor + ")";
    }

    private PspRowState(Text primaryText, Text secondaryText, long j, BackgroundColor trailingTextBackgroundColor) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(trailingTextBackgroundColor, "trailingTextBackgroundColor");
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.trailingTextColor = j;
        this.trailingTextBackgroundColor = trailingTextBackgroundColor;
    }

    public final Text getPrimaryText() {
        return this.primaryText;
    }

    public final Text getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: getTrailingTextColor-0d7_KjU, reason: not valid java name */
    public final long m15345getTrailingTextColor0d7_KjU() {
        return this.trailingTextColor;
    }

    public final BackgroundColor getTrailingTextBackgroundColor() {
        return this.trailingTextBackgroundColor;
    }
}
