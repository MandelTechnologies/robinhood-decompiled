package com.robinhood.android.optionschain.sbschain.table;

import kotlin.Metadata;

/* compiled from: OptionSideBySideChainTableViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/ScrollPosition;", "", "firstVerticalVisibleIndex", "", "firstVerticalVisibleOffset", "horizontalScrollValue", "", "<init>", "(IIF)V", "getFirstVerticalVisibleIndex", "()I", "getFirstVerticalVisibleOffset", "getHorizontalScrollValue", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ScrollPosition {
    public static final int $stable = 0;
    private final int firstVerticalVisibleIndex;
    private final int firstVerticalVisibleOffset;
    private final float horizontalScrollValue;

    public static /* synthetic */ ScrollPosition copy$default(ScrollPosition scrollPosition, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = scrollPosition.firstVerticalVisibleIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = scrollPosition.firstVerticalVisibleOffset;
        }
        if ((i3 & 4) != 0) {
            f = scrollPosition.horizontalScrollValue;
        }
        return scrollPosition.copy(i, i2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFirstVerticalVisibleIndex() {
        return this.firstVerticalVisibleIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFirstVerticalVisibleOffset() {
        return this.firstVerticalVisibleOffset;
    }

    /* renamed from: component3, reason: from getter */
    public final float getHorizontalScrollValue() {
        return this.horizontalScrollValue;
    }

    public final ScrollPosition copy(int firstVerticalVisibleIndex, int firstVerticalVisibleOffset, float horizontalScrollValue) {
        return new ScrollPosition(firstVerticalVisibleIndex, firstVerticalVisibleOffset, horizontalScrollValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollPosition)) {
            return false;
        }
        ScrollPosition scrollPosition = (ScrollPosition) other;
        return this.firstVerticalVisibleIndex == scrollPosition.firstVerticalVisibleIndex && this.firstVerticalVisibleOffset == scrollPosition.firstVerticalVisibleOffset && Float.compare(this.horizontalScrollValue, scrollPosition.horizontalScrollValue) == 0;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.firstVerticalVisibleIndex) * 31) + Integer.hashCode(this.firstVerticalVisibleOffset)) * 31) + Float.hashCode(this.horizontalScrollValue);
    }

    public String toString() {
        return "ScrollPosition(firstVerticalVisibleIndex=" + this.firstVerticalVisibleIndex + ", firstVerticalVisibleOffset=" + this.firstVerticalVisibleOffset + ", horizontalScrollValue=" + this.horizontalScrollValue + ")";
    }

    public ScrollPosition(int i, int i2, float f) {
        this.firstVerticalVisibleIndex = i;
        this.firstVerticalVisibleOffset = i2;
        this.horizontalScrollValue = f;
    }

    public final int getFirstVerticalVisibleIndex() {
        return this.firstVerticalVisibleIndex;
    }

    public final int getFirstVerticalVisibleOffset() {
        return this.firstVerticalVisibleOffset;
    }

    public final float getHorizontalScrollValue() {
        return this.horizontalScrollValue;
    }
}
