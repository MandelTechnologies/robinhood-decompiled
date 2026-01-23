package com.robinhood.android.search.highlights.p249ui.common;

import androidx.compose.p011ui.Alignment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProbabilityBarLegendRow.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/common/ItemPlacement;", "", "xPosition", "", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "<init>", "(ILandroidx/compose/ui/Alignment$Horizontal;)V", "getXPosition", "()I", "getAlignment", "()Landroidx/compose/ui/Alignment$Horizontal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
final /* data */ class ItemPlacement {
    private final Alignment.Horizontal alignment;
    private final int xPosition;

    public static /* synthetic */ ItemPlacement copy$default(ItemPlacement itemPlacement, int i, Alignment.Horizontal horizontal, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = itemPlacement.xPosition;
        }
        if ((i2 & 2) != 0) {
            horizontal = itemPlacement.alignment;
        }
        return itemPlacement.copy(i, horizontal);
    }

    /* renamed from: component1, reason: from getter */
    public final int getXPosition() {
        return this.xPosition;
    }

    /* renamed from: component2, reason: from getter */
    public final Alignment.Horizontal getAlignment() {
        return this.alignment;
    }

    public final ItemPlacement copy(int xPosition, Alignment.Horizontal alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new ItemPlacement(xPosition, alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemPlacement)) {
            return false;
        }
        ItemPlacement itemPlacement = (ItemPlacement) other;
        return this.xPosition == itemPlacement.xPosition && Intrinsics.areEqual(this.alignment, itemPlacement.alignment);
    }

    public int hashCode() {
        return (Integer.hashCode(this.xPosition) * 31) + this.alignment.hashCode();
    }

    public String toString() {
        return "ItemPlacement(xPosition=" + this.xPosition + ", alignment=" + this.alignment + ")";
    }

    public ItemPlacement(int i, Alignment.Horizontal alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.xPosition = i;
        this.alignment = alignment;
    }

    public final int getXPosition() {
        return this.xPosition;
    }

    public final Alignment.Horizontal getAlignment() {
        return this.alignment;
    }
}
