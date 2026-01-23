package com.robinhood.compose.bento.component.rows;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoBaseRow.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/RowColorState;", "", "rowPalette", "Lcom/robinhood/compose/bento/component/rows/BentoRowColors;", "enabled", "", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoRowColors;Z)V", "getRowPalette", "()Lcom/robinhood/compose/bento/component/rows/BentoRowColors;", "getEnabled", "()Z", "fg", "Landroidx/compose/ui/graphics/Color;", "getFg-0d7_KjU", "()J", "fgSecondary", "getFgSecondary-0d7_KjU", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
final /* data */ class RowColorState {
    private final boolean enabled;
    private final BentoRowColors rowPalette;

    public static /* synthetic */ RowColorState copy$default(RowColorState rowColorState, BentoRowColors bentoRowColors, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bentoRowColors = rowColorState.rowPalette;
        }
        if ((i & 2) != 0) {
            z = rowColorState.enabled;
        }
        return rowColorState.copy(bentoRowColors, z);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoRowColors getRowPalette() {
        return this.rowPalette;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final RowColorState copy(BentoRowColors rowPalette, boolean enabled) {
        Intrinsics.checkNotNullParameter(rowPalette, "rowPalette");
        return new RowColorState(rowPalette, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColorState)) {
            return false;
        }
        RowColorState rowColorState = (RowColorState) other;
        return Intrinsics.areEqual(this.rowPalette, rowColorState.rowPalette) && this.enabled == rowColorState.enabled;
    }

    public int hashCode() {
        return (this.rowPalette.hashCode() * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "RowColorState(rowPalette=" + this.rowPalette + ", enabled=" + this.enabled + ")";
    }

    public RowColorState(BentoRowColors rowPalette, boolean z) {
        Intrinsics.checkNotNullParameter(rowPalette, "rowPalette");
        this.rowPalette = rowPalette;
        this.enabled = z;
    }

    public final BentoRowColors getRowPalette() {
        return this.rowPalette;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: getFg-0d7_KjU, reason: not valid java name */
    public final long m21048getFg0d7_KjU() {
        return this.enabled ? this.rowPalette.getFgColor() : this.rowPalette.getFgColorDisabled();
    }

    /* renamed from: getFgSecondary-0d7_KjU, reason: not valid java name */
    public final long m21049getFgSecondary0d7_KjU() {
        return this.enabled ? this.rowPalette.getFgColorSecondary() : this.rowPalette.getFgColorDisabled();
    }
}
