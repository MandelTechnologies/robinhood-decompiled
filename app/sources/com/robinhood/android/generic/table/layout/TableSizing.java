package com.robinhood.android.generic.table.layout;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ*\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/generic/table/layout/TableSizing;", "", "columnWidths", "Lkotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/ui/unit/Dp;", "rowHeight", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColumnWidths", "()Lkotlinx/collections/immutable/ImmutableList;", "getRowHeight-D9Ej5fM", "()F", "F", "valid", "", "getValid", "()Z", "component1", "component2", "component2-D9Ej5fM", "copy", "copy-3ABfNKs", "(Lkotlinx/collections/immutable/ImmutableList;F)Lcom/robinhood/android/generic/table/layout/TableSizing;", "equals", "other", "hashCode", "", "toString", "", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class TableSizing {
    public static final int $stable = 0;
    private final ImmutableList<C2002Dp> columnWidths;
    private final float rowHeight;

    public /* synthetic */ TableSizing(ImmutableList immutableList, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ TableSizing m15002copy3ABfNKs$default(TableSizing tableSizing, ImmutableList immutableList, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = tableSizing.columnWidths;
        }
        if ((i & 2) != 0) {
            f = tableSizing.rowHeight;
        }
        return tableSizing.m15004copy3ABfNKs(immutableList, f);
    }

    public final ImmutableList<C2002Dp> component1() {
        return this.columnWidths;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRowHeight() {
        return this.rowHeight;
    }

    /* renamed from: copy-3ABfNKs, reason: not valid java name */
    public final TableSizing m15004copy3ABfNKs(ImmutableList<C2002Dp> columnWidths, float rowHeight) {
        Intrinsics.checkNotNullParameter(columnWidths, "columnWidths");
        return new TableSizing(columnWidths, rowHeight, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TableSizing)) {
            return false;
        }
        TableSizing tableSizing = (TableSizing) other;
        return Intrinsics.areEqual(this.columnWidths, tableSizing.columnWidths) && C2002Dp.m7997equalsimpl0(this.rowHeight, tableSizing.rowHeight);
    }

    public int hashCode() {
        return (this.columnWidths.hashCode() * 31) + C2002Dp.m7998hashCodeimpl(this.rowHeight);
    }

    public String toString() {
        return "TableSizing(columnWidths=" + this.columnWidths + ", rowHeight=" + C2002Dp.m7999toStringimpl(this.rowHeight) + ")";
    }

    private TableSizing(ImmutableList<C2002Dp> columnWidths, float f) {
        Intrinsics.checkNotNullParameter(columnWidths, "columnWidths");
        this.columnWidths = columnWidths;
        this.rowHeight = f;
    }

    public final ImmutableList<C2002Dp> getColumnWidths() {
        return this.columnWidths;
    }

    /* renamed from: getRowHeight-D9Ej5fM, reason: not valid java name */
    public final float m15005getRowHeightD9Ej5fM() {
        return this.rowHeight;
    }

    public final boolean getValid() {
        return !this.columnWidths.isEmpty() && C2002Dp.m7994compareTo0680j_4(this.rowHeight, C2002Dp.m7995constructorimpl((float) 0)) > 0;
    }
}
