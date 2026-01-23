package com.robinhood.android.options.p208ui.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OptionsDetailPageDataCell.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/CellState;", "", AnnotatedPrivateKey.LABEL, "", "value", "tooltip", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip;)V", "getLabel", "()Ljava/lang/String;", "getValue", "getTooltip", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CellState {
    public static final int $stable = 0;
    private final String label;
    private final OptionsDetailPageDataCell2 tooltip;
    private final String value;

    public static /* synthetic */ CellState copy$default(CellState cellState, String str, String str2, OptionsDetailPageDataCell2 optionsDetailPageDataCell2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cellState.label;
        }
        if ((i & 2) != 0) {
            str2 = cellState.value;
        }
        if ((i & 4) != 0) {
            optionsDetailPageDataCell2 = cellState.tooltip;
        }
        return cellState.copy(str, str2, optionsDetailPageDataCell2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionsDetailPageDataCell2 getTooltip() {
        return this.tooltip;
    }

    public final CellState copy(String label, String value, OptionsDetailPageDataCell2 tooltip) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        return new CellState(label, value, tooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellState)) {
            return false;
        }
        CellState cellState = (CellState) other;
        return Intrinsics.areEqual(this.label, cellState.label) && Intrinsics.areEqual(this.value, cellState.value) && Intrinsics.areEqual(this.tooltip, cellState.tooltip);
    }

    public int hashCode() {
        int iHashCode = ((this.label.hashCode() * 31) + this.value.hashCode()) * 31;
        OptionsDetailPageDataCell2 optionsDetailPageDataCell2 = this.tooltip;
        return iHashCode + (optionsDetailPageDataCell2 == null ? 0 : optionsDetailPageDataCell2.hashCode());
    }

    public String toString() {
        return "CellState(label=" + this.label + ", value=" + this.value + ", tooltip=" + this.tooltip + ")";
    }

    public CellState(String label, String value, OptionsDetailPageDataCell2 optionsDetailPageDataCell2) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.label = label;
        this.value = value;
        this.tooltip = optionsDetailPageDataCell2;
    }

    public /* synthetic */ CellState(String str, String str2, OptionsDetailPageDataCell2 optionsDetailPageDataCell2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : optionsDetailPageDataCell2);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public final OptionsDetailPageDataCell2 getTooltip() {
        return this.tooltip;
    }
}
