package com.robinhood.compose.common;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwipeToDeleteRow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/common/SwipeToDeleteRowState;", "", "backgroundContentText", "", "backgroundContentTextColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundContentText", "()Ljava/lang/String;", "getBackgroundContentTextColor-0d7_KjU", "()J", "J", "component1", "component2", "component2-0d7_KjU", "copy", "copy-4WTKRHQ", "(Ljava/lang/String;J)Lcom/robinhood/compose/common/SwipeToDeleteRowState;", "equals", "", "other", "hashCode", "", "toString", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SwipeToDeleteRowState {
    public static final int $stable = 0;
    private final String backgroundContentText;
    private final long backgroundContentTextColor;

    public /* synthetic */ SwipeToDeleteRowState(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    /* renamed from: copy-4WTKRHQ$default, reason: not valid java name */
    public static /* synthetic */ SwipeToDeleteRowState m21662copy4WTKRHQ$default(SwipeToDeleteRowState swipeToDeleteRowState, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = swipeToDeleteRowState.backgroundContentText;
        }
        if ((i & 2) != 0) {
            j = swipeToDeleteRowState.backgroundContentTextColor;
        }
        return swipeToDeleteRowState.m21664copy4WTKRHQ(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundContentText() {
        return this.backgroundContentText;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundContentTextColor() {
        return this.backgroundContentTextColor;
    }

    /* renamed from: copy-4WTKRHQ, reason: not valid java name */
    public final SwipeToDeleteRowState m21664copy4WTKRHQ(String backgroundContentText, long backgroundContentTextColor) {
        Intrinsics.checkNotNullParameter(backgroundContentText, "backgroundContentText");
        return new SwipeToDeleteRowState(backgroundContentText, backgroundContentTextColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeToDeleteRowState)) {
            return false;
        }
        SwipeToDeleteRowState swipeToDeleteRowState = (SwipeToDeleteRowState) other;
        return Intrinsics.areEqual(this.backgroundContentText, swipeToDeleteRowState.backgroundContentText) && Color.m6707equalsimpl0(this.backgroundContentTextColor, swipeToDeleteRowState.backgroundContentTextColor);
    }

    public int hashCode() {
        return (this.backgroundContentText.hashCode() * 31) + Color.m6713hashCodeimpl(this.backgroundContentTextColor);
    }

    public String toString() {
        return "SwipeToDeleteRowState(backgroundContentText=" + this.backgroundContentText + ", backgroundContentTextColor=" + Color.m6714toStringimpl(this.backgroundContentTextColor) + ")";
    }

    private SwipeToDeleteRowState(String backgroundContentText, long j) {
        Intrinsics.checkNotNullParameter(backgroundContentText, "backgroundContentText");
        this.backgroundContentText = backgroundContentText;
        this.backgroundContentTextColor = j;
    }

    public final String getBackgroundContentText() {
        return this.backgroundContentText;
    }

    /* renamed from: getBackgroundContentTextColor-0d7_KjU, reason: not valid java name */
    public final long m21665getBackgroundContentTextColor0d7_KjU() {
        return this.backgroundContentTextColor;
    }
}
