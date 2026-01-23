package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoBaseRowLayout.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/Placement;", "", "placeable", "Landroidx/compose/ui/layout/Placeable;", "x", "", "y", "<init>", "(Landroidx/compose/ui/layout/Placeable;II)V", "getPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "getX", "()I", "getY", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
final /* data */ class Placement {
    private final Placeable placeable;
    private final int x;
    private final int y;

    public static /* synthetic */ Placement copy$default(Placement placement, Placeable placeable, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            placeable = placement.placeable;
        }
        if ((i3 & 2) != 0) {
            i = placement.x;
        }
        if ((i3 & 4) != 0) {
            i2 = placement.y;
        }
        return placement.copy(placeable, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final Placeable getPlaceable() {
        return this.placeable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* renamed from: component3, reason: from getter */
    public final int getY() {
        return this.y;
    }

    public final Placement copy(Placeable placeable, int x, int y) {
        Intrinsics.checkNotNullParameter(placeable, "placeable");
        return new Placement(placeable, x, y);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) other;
        return Intrinsics.areEqual(this.placeable, placement.placeable) && this.x == placement.x && this.y == placement.y;
    }

    public int hashCode() {
        return (((this.placeable.hashCode() * 31) + Integer.hashCode(this.x)) * 31) + Integer.hashCode(this.y);
    }

    public String toString() {
        return "Placement(placeable=" + this.placeable + ", x=" + this.x + ", y=" + this.y + ")";
    }

    public Placement(Placeable placeable, int i, int i2) {
        Intrinsics.checkNotNullParameter(placeable, "placeable");
        this.placeable = placeable;
        this.x = i;
        this.y = i2;
    }

    public final Placeable getPlaceable() {
        return this.placeable;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }
}
