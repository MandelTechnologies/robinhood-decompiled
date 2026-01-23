package com.robinhood.android.common.portfolio.position;

import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReorderablePositions.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0012\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;", "", "position", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "activeDisplayType", "", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;Ljava/lang/String;I)V", "getPosition", "()Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "getActiveDisplayType", "()Ljava/lang/String;", "getIndex", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DisplayPositionListItem {
    public static final int $stable = 8;
    private final String activeDisplayType;
    private final int index;
    private final PositionsV2.PositionListItemV2 position;

    public static /* synthetic */ DisplayPositionListItem copy$default(DisplayPositionListItem displayPositionListItem, PositionsV2.PositionListItemV2 positionListItemV2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            positionListItemV2 = displayPositionListItem.position;
        }
        if ((i2 & 2) != 0) {
            str = displayPositionListItem.activeDisplayType;
        }
        if ((i2 & 4) != 0) {
            i = displayPositionListItem.index;
        }
        return displayPositionListItem.copy(positionListItemV2, str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final PositionsV2.PositionListItemV2 getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActiveDisplayType() {
        return this.activeDisplayType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final DisplayPositionListItem copy(PositionsV2.PositionListItemV2 position, String activeDisplayType, int index) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(activeDisplayType, "activeDisplayType");
        return new DisplayPositionListItem(position, activeDisplayType, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayPositionListItem)) {
            return false;
        }
        DisplayPositionListItem displayPositionListItem = (DisplayPositionListItem) other;
        return Intrinsics.areEqual(this.position, displayPositionListItem.position) && Intrinsics.areEqual(this.activeDisplayType, displayPositionListItem.activeDisplayType) && this.index == displayPositionListItem.index;
    }

    public int hashCode() {
        return (((this.position.hashCode() * 31) + this.activeDisplayType.hashCode()) * 31) + Integer.hashCode(this.index);
    }

    public String toString() {
        return "DisplayPositionListItem(position=" + this.position + ", activeDisplayType=" + this.activeDisplayType + ", index=" + this.index + ")";
    }

    public DisplayPositionListItem(PositionsV2.PositionListItemV2 position, String activeDisplayType, int i) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(activeDisplayType, "activeDisplayType");
        this.position = position;
        this.activeDisplayType = activeDisplayType;
        this.index = i;
    }

    public final PositionsV2.PositionListItemV2 getPosition() {
        return this.position;
    }

    public final String getActiveDisplayType() {
        return this.activeDisplayType;
    }

    public final int getIndex() {
        return this.index;
    }
}
